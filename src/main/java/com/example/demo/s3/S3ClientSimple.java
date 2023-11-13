package com.example.demo.s3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

@Configuration
public class S3ClientSimple {

	AmazonS3 amazonS3(
		final String s3AccessKey,
		final String s3SecretKey
	) {
		return AmazonS3ClientBuilder.standard()
			.withCredentials(
				new AWSStaticCredentialsProvider(new BasicAWSCredentials(s3AccessKey, s3SecretKey))
			)
			.withRegion(Regions.AP_NORTHEAST_2)
			.build();
	}

}
