package io.swagger.api.impl;

import dev.andrylat.bankingfunctionality.card.PaymentSystem;
import dev.andrylat.bankingfunctionality.card.exceptions.CardValidatorException;
import dev.andrylat.bankingfunctionality.card.validators.CardValidator;
import dev.andrylat.bankingfunctionality.card.validators.CardValidatorImpl;
import io.swagger.api.NotFoundException;
import io.swagger.api.ValidationApiService;
import io.swagger.model.Cardnumber;
import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse400;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-01-25T01:46:26.939Z[GMT]")
public class ValidationApiServiceImpl extends ValidationApiService {
    @Override
    public Response validationPost(Cardnumber body, SecurityContext securityContext) throws NotFoundException, CardValidatorException {
        CardValidator cardValidator = new CardValidatorImpl();
        try {
            cardValidator.validate(body.getCardnumber());

        } catch (CardValidatorException ex) {
            InlineResponse400 response = new InlineResponse400();
            response.validation(false);
            response.setValidationMessage(ex.getErrorList().iterator().next());
            return Response.status(Response.Status.BAD_REQUEST).entity(response).build();
        }
        Integer firstNumber = Integer.parseInt(body.getCardnumber().substring(0, 1));

        InlineResponse200 response = new InlineResponse200();
        response.setValidation(true);
        response.setCardtype(PaymentSystem.getCardCompanyByIdentifier(firstNumber).getPaymentType());
        return Response.ok().entity(response).build();
    }
}
