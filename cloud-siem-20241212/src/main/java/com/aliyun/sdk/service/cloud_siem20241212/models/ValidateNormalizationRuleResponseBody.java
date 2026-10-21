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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of validation results.</p>
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

        @com.aliyun.core.annotation.NameInMap("LogFieldName")
        private String logFieldName;

        @com.aliyun.core.annotation.NameInMap("LogFieldValue")
        private String logFieldValue;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldFrom")
        private String normalizationFieldFrom;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldName")
        private String normalizationFieldName;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldRequired")
        private Boolean normalizationFieldRequired;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldReserved")
        private Boolean normalizationFieldReserved;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldType")
        private String normalizationFieldType;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldValidationReason")
        private String normalizationFieldValidationReason;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldValidationStatus")
        private String normalizationFieldValidationStatus;

        @com.aliyun.core.annotation.NameInMap("Result")
        private Integer result;

        private ValidateResult(Builder builder) {
            this.fieldName = builder.fieldName;
            this.fieldValue = builder.fieldValue;
            this.logFieldName = builder.logFieldName;
            this.logFieldValue = builder.logFieldValue;
            this.message = builder.message;
            this.normalizationFieldFrom = builder.normalizationFieldFrom;
            this.normalizationFieldName = builder.normalizationFieldName;
            this.normalizationFieldRequired = builder.normalizationFieldRequired;
            this.normalizationFieldReserved = builder.normalizationFieldReserved;
            this.normalizationFieldType = builder.normalizationFieldType;
            this.normalizationFieldValidationReason = builder.normalizationFieldValidationReason;
            this.normalizationFieldValidationStatus = builder.normalizationFieldValidationStatus;
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
         * @return logFieldName
         */
        public String getLogFieldName() {
            return this.logFieldName;
        }

        /**
         * @return logFieldValue
         */
        public String getLogFieldValue() {
            return this.logFieldValue;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return normalizationFieldFrom
         */
        public String getNormalizationFieldFrom() {
            return this.normalizationFieldFrom;
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
         * @return normalizationFieldReserved
         */
        public Boolean getNormalizationFieldReserved() {
            return this.normalizationFieldReserved;
        }

        /**
         * @return normalizationFieldType
         */
        public String getNormalizationFieldType() {
            return this.normalizationFieldType;
        }

        /**
         * @return normalizationFieldValidationReason
         */
        public String getNormalizationFieldValidationReason() {
            return this.normalizationFieldValidationReason;
        }

        /**
         * @return normalizationFieldValidationStatus
         */
        public String getNormalizationFieldValidationStatus() {
            return this.normalizationFieldValidationStatus;
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
            private String logFieldName; 
            private String logFieldValue; 
            private String message; 
            private String normalizationFieldFrom; 
            private String normalizationFieldName; 
            private Boolean normalizationFieldRequired; 
            private Boolean normalizationFieldReserved; 
            private String normalizationFieldType; 
            private String normalizationFieldValidationReason; 
            private String normalizationFieldValidationStatus; 
            private Integer result; 

            private Builder() {
            } 

            private Builder(ValidateResult model) {
                this.fieldName = model.fieldName;
                this.fieldValue = model.fieldValue;
                this.logFieldName = model.logFieldName;
                this.logFieldValue = model.logFieldValue;
                this.message = model.message;
                this.normalizationFieldFrom = model.normalizationFieldFrom;
                this.normalizationFieldName = model.normalizationFieldName;
                this.normalizationFieldRequired = model.normalizationFieldRequired;
                this.normalizationFieldReserved = model.normalizationFieldReserved;
                this.normalizationFieldType = model.normalizationFieldType;
                this.normalizationFieldValidationReason = model.normalizationFieldValidationReason;
                this.normalizationFieldValidationStatus = model.normalizationFieldValidationStatus;
                this.result = model.result;
            } 

            /**
             * <p>The name of the field.</p>
             * 
             * <strong>example:</strong>
             * <p>host</p>
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * <p>The field information.</p>
             * 
             * <strong>example:</strong>
             * <p>ze</p>
             */
            public Builder fieldValue(String fieldValue) {
                this.fieldValue = fieldValue;
                return this;
            }

            /**
             * <p>The name of the log field.</p>
             * 
             * <strong>example:</strong>
             * <p>aaa</p>
             */
            public Builder logFieldName(String logFieldName) {
                this.logFieldName = logFieldName;
                return this;
            }

            /**
             * <p>The value of the log field.</p>
             * 
             * <strong>example:</strong>
             * <p>bbb</p>
             */
            public Builder logFieldValue(String logFieldValue) {
                this.logFieldValue = logFieldValue;
                return this;
            }

            /**
             * <p>The reason for the validation result. Valid values:</p>
             * <ul>
             * <li>OperationDenied.TheValueIsRequired: A required parameter is empty.</li>
             * <li>OperationDenied.TheValueIsNull: The parameter value is null.</li>
             * <li>OperationDenied.TheEnumValueNotSupport: The field value is not within the valid enum values.</li>
             * <li>OperationDenied.TheValueLessThanMin: The field value is less than the specified minimum value.</li>
             * <li>OperationDenied.TheValueMoreThanMax: The field value is greater than the specified maximum value.</li>
             * <li>OperationDenied.TheValueNotMatchRegularExpression: The field value fails the regular expression match.</li>
             * <li>success: The validation is passed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The source of the normalized field. Valid values:</p>
             * <ul>
             * <li>preset: Built-in.</li>
             * <li>custom: Custom.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>preset</p>
             */
            public Builder normalizationFieldFrom(String normalizationFieldFrom) {
                this.normalizationFieldFrom = normalizationFieldFrom;
                return this;
            }

            /**
             * <p>The name of the normalized field.</p>
             * 
             * <strong>example:</strong>
             * <p>host</p>
             */
            public Builder normalizationFieldName(String normalizationFieldName) {
                this.normalizationFieldName = normalizationFieldName;
                return this;
            }

            /**
             * <p>Specifies whether the normalized field is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder normalizationFieldRequired(Boolean normalizationFieldRequired) {
                this.normalizationFieldRequired = normalizationFieldRequired;
                return this;
            }

            /**
             * <p>Specifies whether the normalized field name is built into the system.</p>
             */
            public Builder normalizationFieldReserved(Boolean normalizationFieldReserved) {
                this.normalizationFieldReserved = normalizationFieldReserved;
                return this;
            }

            /**
             * <p>The type of the normalized field. Valid values: text, long, double, and json.</p>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder normalizationFieldType(String normalizationFieldType) {
                this.normalizationFieldType = normalizationFieldType;
                return this;
            }

            /**
             * <p>The reason why the normalized field fails the validation.</p>
             * 
             * <strong>example:</strong>
             * <p>OperationDenied.TheValueIsRequired</p>
             */
            public Builder normalizationFieldValidationReason(String normalizationFieldValidationReason) {
                this.normalizationFieldValidationReason = normalizationFieldValidationReason;
                return this;
            }

            /**
             * <p>The validation status of the normalized field. Valid values: pass and fail.</p>
             * 
             * <strong>example:</strong>
             * <p>pass</p>
             */
            public Builder normalizationFieldValidationStatus(String normalizationFieldValidationStatus) {
                this.normalizationFieldValidationStatus = normalizationFieldValidationStatus;
                return this;
            }

            /**
             * <p>The validation result. Valid values:</p>
             * <ul>
             * <li>1: The validation is passed.</li>
             * <li>0: A warning is returned.</li>
             * <li>1: The validation fails.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
