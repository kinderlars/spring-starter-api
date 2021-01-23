package de.kinderlars.springstarter.infrastructure.aws;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "cloud.aws")
public class AwsConfigProperties {

    @Value("${credentials.profile-name}")
    private final String profile;

    @Value("${credentials.region.static}")
    private final String default_region;

    @Value("${credentials.profile-path}")
    private final String credential_file;
    
    public String getProfile() {
        return profile;
    }
    
    public String getDefault_region() {
        return default_region;
    }
    
    public String getCredential_file() {
        return credential_file;
    }
}
