// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ValidateStatementResult} extends {@link TeaModel}
 *
 * <p>ValidateStatementResult</p>
 */
public class ValidateStatementResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorDetails")
    private ValidationErrorDetails errorDetails;

    @com.aliyun.core.annotation.NameInMap("validationResult")
    private String validationResult;

    private ValidateStatementResult(Builder builder) {
        this.errorDetails = builder.errorDetails;
        this.validationResult = builder.validationResult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateStatementResult create() {
        return builder().build();
    }

    /**
     * @return errorDetails
     */
    public ValidationErrorDetails getErrorDetails() {
        return this.errorDetails;
    }

    /**
     * @return validationResult
     */
    public String getValidationResult() {
        return this.validationResult;
    }

    public static final class Builder {
        private ValidationErrorDetails errorDetails; 
        private String validationResult; 

        /**
         * errorDetails.
         */
        public Builder errorDetails(ValidationErrorDetails errorDetails) {
            this.errorDetails = errorDetails;
            return this;
        }

        /**
         * validationResult.
         */
        public Builder validationResult(String validationResult) {
            this.validationResult = validationResult;
            return this;
        }

        public ValidateStatementResult build() {
            return new ValidateStatementResult(this);
        } 

    } 

}
