// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SqlStatementValidationResult} extends {@link TeaModel}
 *
 * <p>SqlStatementValidationResult</p>
 */
public class SqlStatementValidationResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorDetails")
    private ErrorDetails errorDetails;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("validationResult")
    private String validationResult;

    private SqlStatementValidationResult(Builder builder) {
        this.errorDetails = builder.errorDetails;
        this.message = builder.message;
        this.success = builder.success;
        this.validationResult = builder.validationResult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SqlStatementValidationResult create() {
        return builder().build();
    }

    /**
     * @return errorDetails
     */
    public ErrorDetails getErrorDetails() {
        return this.errorDetails;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return validationResult
     */
    public String getValidationResult() {
        return this.validationResult;
    }

    public static final class Builder {
        private ErrorDetails errorDetails; 
        private String message; 
        private Boolean success; 
        private String validationResult; 

        /**
         * errorDetails.
         */
        public Builder errorDetails(ErrorDetails errorDetails) {
            this.errorDetails = errorDetails;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * validationResult.
         */
        public Builder validationResult(String validationResult) {
            this.validationResult = validationResult;
            return this;
        }

        public SqlStatementValidationResult build() {
            return new SqlStatementValidationResult(this);
        } 

    } 

}
