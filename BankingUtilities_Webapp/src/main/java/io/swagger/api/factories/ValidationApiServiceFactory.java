package io.swagger.api.factories;

import io.swagger.api.ValidationApiService;
import io.swagger.api.impl.ValidationApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-01-25T01:46:26.939Z[GMT]")public class ValidationApiServiceFactory {
    private final static ValidationApiService service = new ValidationApiServiceImpl();

    public static ValidationApiService getValidationApi() {
        return service;
    }
}
