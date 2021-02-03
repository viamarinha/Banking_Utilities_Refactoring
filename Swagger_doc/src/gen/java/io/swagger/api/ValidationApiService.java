package io.swagger.api;

import dev.andrylat.bankingfunctionality.card.exceptions.CardValidatorException;
import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Cardnumber;
import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse400;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-01-25T01:46:26.939Z[GMT]")public abstract class ValidationApiService {
    public abstract Response validationPost(Cardnumber body,SecurityContext securityContext) throws NotFoundException, CardValidatorException;
}
