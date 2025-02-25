// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

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
 * {@link CreatePropertyResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePropertyResponseBody</p>
 */
public class CreatePropertyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateResult")
    private CreateResult createResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreatePropertyResponseBody(Builder builder) {
        this.createResult = builder.createResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePropertyResponseBody create() {
        return builder().build();
    }

    /**
     * @return createResult
     */
    public CreateResult getCreateResult() {
        return this.createResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CreateResult createResult; 
        private String requestId; 

        /**
         * <p>The result of creating the property.</p>
         */
        public Builder createResult(CreateResult createResult) {
            this.createResult = createResult;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePropertyResponseBody build() {
            return new CreatePropertyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreatePropertyResponseBody} extends {@link TeaModel}
     *
     * <p>CreatePropertyResponseBody</p>
     */
    public static class FailedPropertyValues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("PropertyId")
        private Long propertyId;

        @com.aliyun.core.annotation.NameInMap("PropertyValue")
        private String propertyValue;

        private FailedPropertyValues(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.propertyId = builder.propertyId;
            this.propertyValue = builder.propertyValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedPropertyValues create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return propertyId
         */
        public Long getPropertyId() {
            return this.propertyId;
        }

        /**
         * @return propertyValue
         */
        public String getPropertyValue() {
            return this.propertyValue;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 
            private Long propertyId; 
            private String propertyValue; 

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>ExistedPropertyValue</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>The property value is used by another property.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The ID of the property value.</p>
             * 
             * <strong>example:</strong>
             * <p>390</p>
             */
            public Builder propertyId(Long propertyId) {
                this.propertyId = propertyId;
                return this;
            }

            /**
             * <p>The value of the property.</p>
             * 
             * <strong>example:</strong>
             * <p>HR</p>
             */
            public Builder propertyValue(String propertyValue) {
                this.propertyValue = propertyValue;
                return this;
            }

            public FailedPropertyValues build() {
                return new FailedPropertyValues(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePropertyResponseBody} extends {@link TeaModel}
     *
     * <p>CreatePropertyResponseBody</p>
     */
    public static class SavePropertyValues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PropertyValue")
        private String propertyValue;

        @com.aliyun.core.annotation.NameInMap("PropertyValueId")
        private Long propertyValueId;

        private SavePropertyValues(Builder builder) {
            this.propertyValue = builder.propertyValue;
            this.propertyValueId = builder.propertyValueId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SavePropertyValues create() {
            return builder().build();
        }

        /**
         * @return propertyValue
         */
        public String getPropertyValue() {
            return this.propertyValue;
        }

        /**
         * @return propertyValueId
         */
        public Long getPropertyValueId() {
            return this.propertyValueId;
        }

        public static final class Builder {
            private String propertyValue; 
            private Long propertyValueId; 

            /**
             * <p>The value of the property.</p>
             * 
             * <strong>example:</strong>
             * <p>HR</p>
             */
            public Builder propertyValue(String propertyValue) {
                this.propertyValue = propertyValue;
                return this;
            }

            /**
             * <p>The ID of the property value.</p>
             * 
             * <strong>example:</strong>
             * <p>978</p>
             */
            public Builder propertyValueId(Long propertyValueId) {
                this.propertyValueId = propertyValueId;
                return this;
            }

            public SavePropertyValues build() {
                return new SavePropertyValues(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePropertyResponseBody} extends {@link TeaModel}
     *
     * <p>CreatePropertyResponseBody</p>
     */
    public static class SavePropertyValueModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailedPropertyValues")
        private java.util.List<FailedPropertyValues> failedPropertyValues;

        @com.aliyun.core.annotation.NameInMap("SavePropertyValues")
        private java.util.List<SavePropertyValues> savePropertyValues;

        private SavePropertyValueModel(Builder builder) {
            this.failedPropertyValues = builder.failedPropertyValues;
            this.savePropertyValues = builder.savePropertyValues;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SavePropertyValueModel create() {
            return builder().build();
        }

        /**
         * @return failedPropertyValues
         */
        public java.util.List<FailedPropertyValues> getFailedPropertyValues() {
            return this.failedPropertyValues;
        }

        /**
         * @return savePropertyValues
         */
        public java.util.List<SavePropertyValues> getSavePropertyValues() {
            return this.savePropertyValues;
        }

        public static final class Builder {
            private java.util.List<FailedPropertyValues> failedPropertyValues; 
            private java.util.List<SavePropertyValues> savePropertyValues; 

            /**
             * <p>The property values that failed to be created.</p>
             */
            public Builder failedPropertyValues(java.util.List<FailedPropertyValues> failedPropertyValues) {
                this.failedPropertyValues = failedPropertyValues;
                return this;
            }

            /**
             * <p>Details of the property values that were created.</p>
             */
            public Builder savePropertyValues(java.util.List<SavePropertyValues> savePropertyValues) {
                this.savePropertyValues = savePropertyValues;
                return this;
            }

            public SavePropertyValueModel build() {
                return new SavePropertyValueModel(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePropertyResponseBody} extends {@link TeaModel}
     *
     * <p>CreatePropertyResponseBody</p>
     */
    public static class CreateResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PropertyId")
        private Long propertyId;

        @com.aliyun.core.annotation.NameInMap("PropertyKey")
        private String propertyKey;

        @com.aliyun.core.annotation.NameInMap("SavePropertyValueModel")
        private SavePropertyValueModel savePropertyValueModel;

        private CreateResult(Builder builder) {
            this.propertyId = builder.propertyId;
            this.propertyKey = builder.propertyKey;
            this.savePropertyValueModel = builder.savePropertyValueModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateResult create() {
            return builder().build();
        }

        /**
         * @return propertyId
         */
        public Long getPropertyId() {
            return this.propertyId;
        }

        /**
         * @return propertyKey
         */
        public String getPropertyKey() {
            return this.propertyKey;
        }

        /**
         * @return savePropertyValueModel
         */
        public SavePropertyValueModel getSavePropertyValueModel() {
            return this.savePropertyValueModel;
        }

        public static final class Builder {
            private Long propertyId; 
            private String propertyKey; 
            private SavePropertyValueModel savePropertyValueModel; 

            /**
             * <p>The ID of the property.</p>
             * 
             * <strong>example:</strong>
             * <p>390</p>
             */
            public Builder propertyId(Long propertyId) {
                this.propertyId = propertyId;
                return this;
            }

            /**
             * <p>The name of the property.</p>
             * 
             * <strong>example:</strong>
             * <p>department</p>
             */
            public Builder propertyKey(String propertyKey) {
                this.propertyKey = propertyKey;
                return this;
            }

            /**
             * <p>The result of creating the property value.</p>
             */
            public Builder savePropertyValueModel(SavePropertyValueModel savePropertyValueModel) {
                this.savePropertyValueModel = savePropertyValueModel;
                return this;
            }

            public CreateResult build() {
                return new CreateResult(this);
            } 

        } 

    }
}
