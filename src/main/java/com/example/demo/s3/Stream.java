package com.example.demo.s3;

import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.ObjectMetadata;

import jakarta.servlet.http.HttpServletRequest;

public class Stream {

	public static void main(HttpServletRequest request) {
		final var objectMetadata = new ObjectMetadata();
		objectMetadata.setContentType(request.getContentType());
		objectMetadata.setContentLength(request.getContentLength());

		final S3ClientSimple s3ClientSimple = new S3ClientSimple();
		final AmazonS3 amazonS3 = s3ClientSimple.amazonS3("1", "2");
		amazonS3.putObject(null);

		MultipartFile;
	}
}
