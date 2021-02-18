package io.swagger.api;

import io.swagger.model.MortgageCalculator;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-01-25T01:46:26.939Z[GMT]")public abstract class MortgagecalculationApiService {
    public abstract Response mortgagecalculationPost(MortgageCalculator body,SecurityContext securityContext) throws NotFoundException;
}
