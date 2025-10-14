// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link ValidateNormalizationRuleResponseBody} extends {@link TeaModel}
 *
 * <p>ValidateNormalizationRuleResponseBody</p>
 */
public class ValidateNormalizationRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ValidateResult")
    private java.util.List<ValidateResult> validateResult;

    private ValidateNormalizationRuleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.validateResult = builder.validateResult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateNormalizationRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return validateResult
     */
    public java.util.List<ValidateResult> getValidateResult() {
        return this.validateResult;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<ValidateResult> validateResult; 

        private Builder() {
        } 

        private Builder(ValidateNormalizationRuleResponseBody model) {
            this.requestId = model.requestId;
            this.validateResult = model.validateResult;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ValidateResult.
         */
        public Builder validateResult(java.util.List<ValidateResult> validateResult) {
            this.validateResult = validateResult;
            return this;
        }

        public ValidateNormalizationRuleResponseBody build() {
            return new ValidateNormalizationRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ValidateNormalizationRuleResponseBody} extends {@link TeaModel}
     *
     * <p>ValidateNormalizationRuleResponseBody</p>
     */
    public static class ValidateResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldName")
        private String fieldName;

        @com.aliyun.core.annotation.NameInMap("FieldValue")
        private String fieldValue;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldName")
        private String normalizationFieldName;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldRequired")
        private Boolean normalizationFieldRequired;

        @com.aliyun.core.annotation.NameInMap("Result")
        private Integer result;

        private ValidateResult(Builder builder) {
            this.fieldName = builder.fieldName;
            this.fieldValue = builder.fieldValue;
            this.message = builder.message;
            this.normalizationFieldName = builder.normalizationFieldName;
            this.normalizationFieldRequired = builder.normalizationFieldRequired;
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ValidateResult create() {
            return builder().build();
        }

        /**
         * @return fieldName
         */
        public String getFieldName() {
            return this.fieldName;
        }

        /**
         * @return fieldValue
         */
        public String getFieldValue() {
            return this.fieldValue;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return normalizationFieldName
         */
        public String getNormalizationFieldName() {
            return this.normalizationFieldName;
        }

        /**
         * @return normalizationFieldRequired
         */
        public Boolean getNormalizationFieldRequired() {
            return this.normalizationFieldRequired;
        }

        /**
         * @return result
         */
        public Integer getResult() {
            return this.result;
        }

        public static final class Builder {
            private String fieldName; 
            private String fieldValue; 
            private String message; 
            private String normalizationFieldName; 
            private Boolean normalizationFieldRequired; 
            private Integer result; 

            private Builder() {
            } 

            private Builder(ValidateResult model) {
                this.fieldName = model.fieldName;
                this.fieldValue = model.fieldValue;
                this.message = model.message;
                this.normalizationFieldName = model.normalizationFieldName;
                this.normalizationFieldRequired = model.normalizationFieldRequired;
                this.result = model.result;
            } 

            /**
             * FieldName.
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * FieldValue.
             */
            public Builder fieldValue(String fieldValue) {
                this.fieldValue = fieldValue;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * NormalizationFieldName.
             */
            public Builder normalizationFieldName(String normalizationFieldName) {
                this.normalizationFieldName = normalizationFieldName;
                return this;
            }

            /**
             * NormalizationFieldRequired.
             */
            public Builder normalizationFieldRequired(Boolean normalizationFieldRequired) {
                this.normalizationFieldRequired = normalizationFieldRequired;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(Integer result) {
                this.result = result;
                return this;
            }

            public ValidateResult build() {
                return new ValidateResult(this);
            } 

        } 

    }
}
