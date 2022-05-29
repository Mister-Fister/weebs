package com.projectos.Anime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AnimeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnimeApplication.class, args);
	}

	/*app.Use(async (ctx, next) =>
	{
		await next();
		if (ctx.Response.StatusCode == 204)
		{
			ctx.Response.ContentLength = 0;
		}
	});*/
}
