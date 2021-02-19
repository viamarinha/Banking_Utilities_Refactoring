package io.swagger.api.impl;

import dev.andrylat.bankingfunctionality.mortgagecalculator.CustomerData;
import dev.andrylat.bankingfunctionality.mortgagecalculator.MortgagePayment;
import dev.andrylat.bankingfunctionality.mortgagecalculator.MortgagePaymentImpl;
import io.swagger.api.MortgagecalculationApiService;
import io.swagger.api.NotFoundException;
import io.swagger.model.InlineResponse2001;
import io.swagger.model.InlineResponse4001;
import io.swagger.model.MortgageCalculator;
import io.swagger.model.PaymentPeriod;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import java.math.BigDecimal;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-01-25T01:46:26.939Z[GMT]")
public class MortgagecalculationApiServiceImpl extends MortgagecalculationApiService {
    @Override
    public Response mortgagecalculationPost(MortgageCalculator body, SecurityContext securityContext) throws NotFoundException {

        MortgagePayment mortgagePayment = new MortgagePaymentImpl();
        double paymentPeriodId;
        try {
            paymentPeriodId = getPaymentPeriodId(body);
        } catch (Exception ex) {
            InlineResponse4001 response = new InlineResponse4001();
            response.setValidation(false);
            response.setValidationMessage(ex.getMessage());
            return Response.status(Response.Status.BAD_REQUEST).entity(response).build();
        }

        setDataForMortgageCalculation(body, mortgagePayment, paymentPeriodId);

        InlineResponse2001 response = new InlineResponse2001();
        response.setValidation(true);
        response.setMortgageAmount(BigDecimal.valueOf(mortgagePayment.getPayment()));
        return Response.ok().entity(response).build();
    }

    private void setDataForMortgageCalculation(MortgageCalculator body, MortgagePayment mortgagePayment, double paymentPeriodId) {
        CustomerData customerData = getCustomerData(body, paymentPeriodId);

        mortgagePayment.setMortgageDetails(customerData);

        mortgagePayment.paymentCalculation();
    }

    private double getPaymentPeriodId(MortgageCalculator body) throws Exception {
        double paymentPeriodId;
        PaymentPeriod paymentPeriod = body.getPayementPeriod();

        if (paymentPeriod == PaymentPeriod.YEARLY) {
            paymentPeriodId = 1;
        } else if (paymentPeriod == PaymentPeriod.MONTHLY) {
            paymentPeriodId = 2;
        } else if (paymentPeriod == PaymentPeriod.WEEKLY) {
            paymentPeriodId = 3;
        } else {
            throw new Exception("Your data have an incorrect format");
        }
        return paymentPeriodId;
    }

    private CustomerData getCustomerData(MortgageCalculator body, double paymentPeriodId) {
        CustomerData customerData = new CustomerData(body.getPrincipalAmount(),
                body.getInterestRate().doubleValue(), body.getTimeInYears(), paymentPeriodId);
        return customerData;
    }
}
