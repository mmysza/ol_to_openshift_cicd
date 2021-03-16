package com.as400_sdk.openlegacy;

import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Configuration;
import com.as400_sdk.openlegacy.config.As400SdkConfiguration;

/**
 * no-op marker class for spring boot's auto-configuration
 */
@Configuration
@Import(value = {As400SdkConfiguration.class})
public class As400SdkAutoConfiguration {
}
