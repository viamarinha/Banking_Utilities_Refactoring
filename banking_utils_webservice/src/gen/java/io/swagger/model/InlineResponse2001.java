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

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * InlineResponse2001
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-01-25T01:46:26.939Z[GMT]")public class InlineResponse2001   {
  @JsonProperty("validation")
  private Boolean validation = null;

  @JsonProperty("mortgage amount")
  private BigDecimal mortgageAmount = null;

  public InlineResponse2001 validation(Boolean validation) {
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

  public InlineResponse2001 mortgageAmount(BigDecimal mortgageAmount) {
    this.mortgageAmount = mortgageAmount;
    return this;
  }

  /**
   * Get mortgageAmount
   * @return mortgageAmount
   **/
  @JsonProperty("mortgage amount")
  @Schema(example = "154.55", description = "")
  @Valid
  public BigDecimal getMortgageAmount() {
    return mortgageAmount;
  }

  public void setMortgageAmount(BigDecimal mortgageAmount) {
    this.mortgageAmount = mortgageAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001 inlineResponse2001 = (InlineResponse2001) o;
    return Objects.equals(this.validation, inlineResponse2001.validation) &&
        Objects.equals(this.mortgageAmount, inlineResponse2001.mortgageAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validation, mortgageAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001 {\n");
    
    sb.append("    validation: ").append(toIndentedString(validation)).append("\n");
    sb.append("    mortgageAmount: ").append(toIndentedString(mortgageAmount)).append("\n");
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
