package io.swagger.api;

import dev.andrylat.bankingfunctionality.card.exceptions.CardValidatorException;
import io.swagger.model.*;
import io.swagger.api.ValidationApiService;
import io.swagger.api.factories.ValidationApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.Cardnumber;
import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse400;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;


@Path("/validation")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-01-25T01:46:26.939Z[GMT]")public class ValidationApi  {
   private final ValidationApiService delegate;

   public ValidationApi(@Context ServletConfig servletContext) {
      ValidationApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ValidationApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ValidationApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = ValidationApiServiceFactory.getValidationApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "", description = "", tags={ "Banking System" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = InlineResponse200.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid card number", content = @Content(schema = @Schema(implementation = InlineResponse400.class))) })
    public Response validationPost(@Parameter(in = ParameterIn.DEFAULT, description = "Obtain information about Valid Credit  and payment system" ,required=true) Cardnumber body

,@Context SecurityContext securityContext)
            throws NotFoundException, CardValidatorException {
        return delegate.validationPost(body,securityContext);
    }
}
