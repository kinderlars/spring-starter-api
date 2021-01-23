package de.kinderlars.springstarter.infrastructure.aws;

import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.auth.profile.ProfilesConfigFile;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
public class AwsConfig {
    
    private final AwsConfigProperties awsConfigProperties;  

    public AwsConfig(AwsConfigProperties awsConfigProperties) {
        this.awsConfigProperties = awsConfigProperties;
    }

    public AwsKeys getAwsKeys(AwsConfigProperties awsConfigProperties){
        final String profileName = awsConfigProperties.getProfile();
        ProfileCredentialsProvider profileCredentialsProvider = new ProfileCredentialsProvider(ProfilesConfigFile profilesConfigFile, String profileName);
        AwsKeys awsKey = new AwsKeys(profileCredentialsProvider.getCredentials().getAWSAccessKeyId(),profileCredentialsProvider.getCredentials().getAWSSecretKey());
        return awsKey;
    }
}
