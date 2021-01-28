package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.MortgagecalculationApiService;
import io.swagger.api.factories.MortgagecalculationApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.InlineResponse2001;
import io.swagger.model.InlineResponse4001;
import io.swagger.model.MortgageCalculator;

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


@Path("/mortgagecalculation")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-01-25T01:46:26.939Z[GMT]")public class MortgagecalculationApi  {
   private final MortgagecalculationApiService delegate;

   public MortgagecalculationApi(@Context ServletConfig servletContext) {
      MortgagecalculationApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("MortgagecalculationApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (MortgagecalculationApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = MortgagecalculationApiServiceFactory.getMortgagecalculationApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "", description = "", tags={ "Mortgage Calculator" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = InlineResponse2001.class))),
        
        @ApiResponse(responseCode = "400", description = "invalid data", content = @Content(schema = @Schema(implementation = InlineResponse4001.class))) })
    public Response mortgagecalculationPost(@Parameter(in = ParameterIn.DEFAULT, description = "Obtain info about amount with customer choices" ,required=true) MortgageCalculator body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.mortgagecalculationPost(body,securityContext);
    }
}
