package de.kinderlars.springstarter.infrastructure.aws;

import org.springframework.stereotype.Component;

@Component
public class AwsKeys {
    
    private String awsAccessKey;
    private String awsSecretAccessKey;

    public AwsKeys(String accessKey, String secretAccessKey){
        this.awsAccessKey = accessKey;
        this.awsSecretAccessKey = secretAccessKey;
    }

    public String getAwsAccessKey() {
        return awsAccessKey;
    }

    public String getAwsSecretAccessKey() {
        return awsSecretAccessKey;
    }
    
}
