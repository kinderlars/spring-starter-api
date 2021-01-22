package de.kinderlars.springstarter.infrastructure.dynamo.config;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DynamoDbConfiguration {

  private final DynamoDbConfigProperties dynamoDbConfigProperties;

  public DynamoDbConfiguration(DynamoDbConfigProperties dynamoDbConfigProperties) {
    this.dynamoDbConfigProperties = dynamoDbConfigProperties;
  }

  public AmazonDynamoDB amazonDynamoDB() {

    AmazonDynamoDB amazonDynamoDB = new AmazonDynamoDBClient() {

    }
  }
}
