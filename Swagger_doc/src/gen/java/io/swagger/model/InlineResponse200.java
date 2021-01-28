/*
 * Banking Card Verification Api
 * Api for valid banking card verification and payment system definition
 *
 * OpenAPI spec version: 1.00
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * InlineResponse200
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-01-25T01:46:26.939Z[GMT]")public class InlineResponse200   {
  @JsonProperty("validation")
  private Boolean validation = null;

  @JsonProperty("validation-message")
  private String validationMessage = null;

  @JsonProperty("cardtype")
  private String cardtype = null;

  public InlineResponse200 validation(Boolean validation) {
    this.validation = validation;
    return this;
  }

  /**
   * Get validation
   * @return validation
   **/
  @JsonProperty("validation")
  @Schema(example = "true", description = "")
  public Boolean isValidation() {
    return validation;
  }

  public void setValidation(Boolean validation) {
    this.validation = validation;
  }

  public InlineResponse200 validationMessage(String validationMessage) {
    this.validationMessage = validationMessage;
    return this;
  }

  /**
   * Get validationMessage
   * @return validationMessage
   **/
  @JsonProperty("validation-message")
  @Schema(description = "")
  public String getValidationMessage() {
    return validationMessage;
  }

  public void setValidationMessage(String validationMessage) {
    this.validationMessage = validationMessage;
  }

  public InlineResponse200 cardtype(String cardtype) {
    this.cardtype = cardtype;
    return this;
  }

  /**
   * Get cardtype
   * @return cardtype
   **/
  @JsonProperty("cardtype")
  @Schema(example = "American Express", description = "")
  public String getCardtype() {
    return cardtype;
  }

  public void setCardtype(String cardtype) {
    this.cardtype = cardtype;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.validation, inlineResponse200.validation) &&
        Objects.equals(this.validationMessage, inlineResponse200.validationMessage) &&
        Objects.equals(this.cardtype, inlineResponse200.cardtype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validation, validationMessage, cardtype);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    validation: ").append(toIndentedString(validation)).append("\n");
    sb.append("    validationMessage: ").append(toIndentedString(validationMessage)).append("\n");
    sb.append("    cardtype: ").append(toIndentedString(cardtype)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
