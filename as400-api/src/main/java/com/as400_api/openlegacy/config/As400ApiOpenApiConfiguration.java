package com.as400_api.openlegacy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.OAuthFlow;
import io.swagger.v3.oas.models.security.OAuthFlows;
import io.swagger.v3.oas.models.security.Scopes;
import io.swagger.v3.oas.models.security.SecurityScheme;


/**
 * OpenApi configuration
 */
@Configuration
public class As400ApiOpenApiConfiguration {

    /**
     * Configures a specification that will be generated by the SpringDoc.
     * 
     * @return a pre-configured instance of the OpenAPI model.
     */
    @Bean
    public OpenAPI openApiConfiguration() {
        return new OpenAPI()
                .info(new Info()
                        .title("as400-api")
                        .description("as400-api API")
                        .version("0.1"))
                .components(new Components()
                        .addSecuritySchemes("oauth2",
                                new SecurityScheme()
                                .type(SecurityScheme.Type.OAUTH2)
                                .flows(new OAuthFlows()
                                        .clientCredentials(new OAuthFlow()
                                                .tokenUrl("/oauth/token")
                                                .scopes(new Scopes().addString("test", "Test")))))
                        .addSecuritySchemes("oauth2-password", 
                                new SecurityScheme()
                                .type(SecurityScheme.Type.OAUTH2)
                                .flows(new OAuthFlows()
                                        .password(new OAuthFlow()
                                                .tokenUrl("/oauth/token")
                                                .scopes(new Scopes().addString("test", "Test")))))
                        );
    }
}

