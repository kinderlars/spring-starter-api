package de.kinderlars.springstarter.infrastructure.dynamo.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class DynamoDbConfiguration {

  private final DynamoDbConfigProperties dynamoDbConfigProperties;

  public DynamoDbConfiguration(DynamoDbConfigProperties dynamoDbConfigProperties) {
    this.dynamoDbConfigProperties = dynamoDbConfigProperties;
  }

  // public AmazonDynamoDB amazonDynamoDB() {

  //   // AmazonDynamoDB amazonDynamoDB = new AmazonDynamoDBClient() {

  //   // };
  // }
}
