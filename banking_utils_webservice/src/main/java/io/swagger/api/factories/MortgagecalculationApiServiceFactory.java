package io.swagger.api.factories;

import io.swagger.api.MortgagecalculationApiService;
import io.swagger.api.impl.MortgagecalculationApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-01-25T01:46:26.939Z[GMT]")public class MortgagecalculationApiServiceFactory {
    private final static MortgagecalculationApiService service = new MortgagecalculationApiServiceImpl();

    public static MortgagecalculationApiService getMortgagecalculationApi() {
        return service;
    }
}
