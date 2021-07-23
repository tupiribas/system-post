package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Scanner sc = new Scanner(System.in);

		String data = "23/07/2018 11:04:03";
		String title = "Bahia Brazil";
		String content = "I'm going to visit this wonderful country!";
		int likes = 0;

		Post post = new Post(sdf.parse(data), title, content, likes);
		System.out.println(post);

		while (true) {
			System.out.println("Enter a comment: ");
			String comment = sc.next();

			System.out.println("Liked? [1/0] ?");
			int resp = sc.nextInt();
			if (resp == 1) {
				System.out.println("Você ganhou mais um like!\n");
				System.out.println("Fulano comentou na sua publicação");
				post.conterLikes();
			} else {
				System.out.println("Fulano comentou na sua publicação");
			}
			post.addComment(new Comment(comment));
			System.out.println("\n" + post);
		}

	}

}
