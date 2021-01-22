package de.kinderlars.springstarter.infrastructure.dynamo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "amazon")
public class DynamoDbConfigProperties {

  private String amazonDynamoDbEndpoint;
  private String amazonAwsAccessKey;
  private String amazonAwsSecretKey;
  private String amazonAwsNamespace;


}
