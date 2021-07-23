package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	private static SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	private Comment comment;
	private List<Comment> listComment = new ArrayList<>();

	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public Integer getLikes() {
		return likes;
	}

	public Comment getComment() {
		return comment;
	}

	public void addComment(Comment listComment) {
		this.listComment.add(listComment);
	}

	public void removeComment(Comment listComment) {
		this.listComment.remove(listComment);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append(this.title + "\n");
		sb.append(this.likes + " ");
		sb.append("Likes - ");
		sb.append(SDF.format(moment) + "\n");
		sb.append("Comment: \n");
		for (Comment comment : listComment) {
			sb.append("\n" +comment.getText());
		}
		return sb.toString();
	}

	public void conterLikes() {
		this.likes += 1;
	}
}
