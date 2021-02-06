package io.swagger.api.impl;

import dev.andrylat.bankingfunctionality.mortgagecalculator.CustomerData;
import dev.andrylat.bankingfunctionality.mortgagecalculator.MortgagePayment;
import dev.andrylat.bankingfunctionality.mortgagecalculator.MortgagePaymentImpl;
import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.InlineResponse2001;
import io.swagger.model.InlineResponse4001;
import io.swagger.model.MortgageCalculator;

import java.math.BigDecimal;
import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import io.swagger.v3.oas.models.security.SecurityScheme;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-01-25T01:46:26.939Z[GMT]")public class MortgagecalculationApiServiceImpl extends MortgagecalculationApiService {
    @Override
    public Response mortgagecalculationPost(MortgageCalculator body, SecurityContext securityContext) throws NotFoundException {

        MortgagePayment mortgagePayment = new MortgagePaymentImpl();
        double paymentPeriodId ;
           System.err.println("Body = " + body);
        try {
            PaymentPeriod payementPeriod = body.getPayementPeriod();

            if (payementPeriod == PaymentPeriod.YEARLY) {
                paymentPeriodId = 1;
            } else if (payementPeriod == PaymentPeriod.MONTHLY) {
                paymentPeriodId = 2;
            } else if (payementPeriod == PaymentPeriod.WEEKLY) {
                paymentPeriodId = 3;
            } else {
                throw new Exception("Your data have an incorrect format");
            }
        }catch (Exception ex){
            System.err.println("ex" + ex);
            InlineResponse4001 response = new InlineResponse4001();
            response.setValidation(false);
            response.setValidationMessage(ex.getMessage());
            return Response.status(Response.Status.BAD_REQUEST).entity(response).build();

        }
        CustomerData customerData = new CustomerData(body.getPrincipalAmount(),
                body.getInterestRate().doubleValue(), body.getTimeInYears(), paymentPeriodId);

        mortgagePayment.setMortgageDetails(customerData);

         mortgagePayment.paymentCalculation();

        InlineResponse2001 response = new InlineResponse2001();
        response.setValidation(true);
        response.setMortgageAmount(BigDecimal.valueOf(mortgagePayment.getPayment()));
        return Response.ok().entity(response).build();
    }
}
