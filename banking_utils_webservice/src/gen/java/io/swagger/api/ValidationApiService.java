package io.swagger.api;

import dev.andrylat.bankingfunctionality.card.exceptions.CardValidatorException;
import io.swagger.model.Cardnumber;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-01-25T01:46:26.939Z[GMT]")public abstract class ValidationApiService {
    public abstract Response validationPost(Cardnumber body,SecurityContext securityContext) throws NotFoundException, CardValidatorException;
}
