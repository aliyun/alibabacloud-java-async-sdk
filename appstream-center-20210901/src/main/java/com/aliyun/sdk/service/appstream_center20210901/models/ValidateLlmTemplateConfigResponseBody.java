// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ValidateLlmTemplateConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ValidateLlmTemplateConfigResponseBody</p>
 */
public class ValidateLlmTemplateConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ValidateLlmTemplateConfigResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateLlmTemplateConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ValidateLlmTemplateConfigResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The validation result of the LLM template configuration, which includes whether the configuration is valid and a list of validation errors.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ValidateLlmTemplateConfigResponseBody build() {
            return new ValidateLlmTemplateConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ValidateLlmTemplateConfigResponseBody} extends {@link TeaModel}
     *
     * <p>ValidateLlmTemplateConfigResponseBody</p>
     */
    public static class ValidationErrors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Field")
        private String field;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        private ValidationErrors(Builder builder) {
            this.code = builder.code;
            this.field = builder.field;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ValidationErrors create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return field
         */
        public String getField() {
            return this.field;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String code; 
            private String field; 
            private String message; 

            private Builder() {
            } 

            private Builder(ValidationErrors model) {
                this.code = model.code;
                this.field = model.field;
                this.message = model.message;
            } 

            /**
             * <p>The error code, such as MISSING_FIELD, UNKNOWN_FIELD, INVALID_TYPE, or INVALID_JSON.</p>
             * 
             * <strong>example:</strong>
             * <p>UNKNOWN_FIELD</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The name of the field where the error occurred, such as id, name, or contextWindow.</p>
             * 
             * <strong>example:</strong>
             * <p>unknownField</p>
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>Unknown field &quot;unknownField&quot; is not recognized by Agent and will be ignored.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public ValidationErrors build() {
                return new ValidationErrors(this);
            } 

        } 

    }
    /**
     * 
     * {@link ValidateLlmTemplateConfigResponseBody} extends {@link TeaModel}
     *
     * <p>ValidateLlmTemplateConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Valid")
        private Boolean valid;

        @com.aliyun.core.annotation.NameInMap("ValidationErrors")
        private java.util.List<ValidationErrors> validationErrors;

        private Data(Builder builder) {
            this.valid = builder.valid;
            this.validationErrors = builder.validationErrors;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return valid
         */
        public Boolean getValid() {
            return this.valid;
        }

        /**
         * @return validationErrors
         */
        public java.util.List<ValidationErrors> getValidationErrors() {
            return this.validationErrors;
        }

        public static final class Builder {
            private Boolean valid; 
            private java.util.List<ValidationErrors> validationErrors; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.valid = model.valid;
                this.validationErrors = model.validationErrors;
            } 

            /**
             * <p>Indicates whether the configuration is valid. The value is true if all validation items pass.</p>
             */
            public Builder valid(Boolean valid) {
                this.valid = valid;
                return this;
            }

            /**
             * <p>The list of validation errors. This list is empty if Valid is true.</p>
             */
            public Builder validationErrors(java.util.List<ValidationErrors> validationErrors) {
                this.validationErrors = validationErrors;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
