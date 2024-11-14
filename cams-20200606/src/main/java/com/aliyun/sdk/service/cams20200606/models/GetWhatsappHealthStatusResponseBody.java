// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetWhatsappHealthStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetWhatsappHealthStatusResponseBody</p>
 */
public class GetWhatsappHealthStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetWhatsappHealthStatusResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWhatsappHealthStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The details about the access denial.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The response code.</p>
         * <ul>
         * <li>The value OK indicates that the request was successful.</li>
         * <li>For more information about other response codes, see <a href="https://www.alibabacloud.com/help/zh/cams/latest/api-error-codes">Error codes</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DAC72B08-3327-33EF-BEDC-8EC3E83A6575</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetWhatsappHealthStatusResponseBody build() {
            return new GetWhatsappHealthStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetWhatsappHealthStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetWhatsappHealthStatusResponseBody</p>
     */
    public static class Errors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorDescription")
        private String errorDescription;

        @com.aliyun.core.annotation.NameInMap("PossibleSolution")
        private String possibleSolution;

        private Errors(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorDescription = builder.errorDescription;
            this.possibleSolution = builder.possibleSolution;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Errors create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorDescription
         */
        public String getErrorDescription() {
            return this.errorDescription;
        }

        /**
         * @return possibleSolution
         */
        public String getPossibleSolution() {
            return this.possibleSolution;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorDescription; 
            private String possibleSolution; 

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>141006</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The description of the error.</p>
             * 
             * <strong>example:</strong>
             * <p>There is an error with the payment method.</p>
             */
            public Builder errorDescription(String errorDescription) {
                this.errorDescription = errorDescription;
                return this;
            }

            /**
             * <p>The possible solution to the error.</p>
             * 
             * <strong>example:</strong>
             * <p>There was an error with your payment method. Please add a new payment method to the account.</p>
             */
            public Builder possibleSolution(String possibleSolution) {
                this.possibleSolution = possibleSolution;
                return this;
            }

            public Errors build() {
                return new Errors(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWhatsappHealthStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetWhatsappHealthStatusResponseBody</p>
     */
    public static class Entities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BusinessId")
        private String businessId;

        @com.aliyun.core.annotation.NameInMap("CanSendMessage")
        private String canSendMessage;

        @com.aliyun.core.annotation.NameInMap("EntityType")
        private String entityType;

        @com.aliyun.core.annotation.NameInMap("Errors")
        private java.util.List < Errors> errors;

        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("PhoneNumber")
        private String phoneNumber;

        @com.aliyun.core.annotation.NameInMap("TemplateCode")
        private String templateCode;

        @com.aliyun.core.annotation.NameInMap("WabaId")
        private String wabaId;

        private Entities(Builder builder) {
            this.businessId = builder.businessId;
            this.canSendMessage = builder.canSendMessage;
            this.entityType = builder.entityType;
            this.errors = builder.errors;
            this.language = builder.language;
            this.phoneNumber = builder.phoneNumber;
            this.templateCode = builder.templateCode;
            this.wabaId = builder.wabaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Entities create() {
            return builder().build();
        }

        /**
         * @return businessId
         */
        public String getBusinessId() {
            return this.businessId;
        }

        /**
         * @return canSendMessage
         */
        public String getCanSendMessage() {
            return this.canSendMessage;
        }

        /**
         * @return entityType
         */
        public String getEntityType() {
            return this.entityType;
        }

        /**
         * @return errors
         */
        public java.util.List < Errors> getErrors() {
            return this.errors;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return phoneNumber
         */
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        /**
         * @return templateCode
         */
        public String getTemplateCode() {
            return this.templateCode;
        }

        /**
         * @return wabaId
         */
        public String getWabaId() {
            return this.wabaId;
        }

        public static final class Builder {
            private String businessId; 
            private String canSendMessage; 
            private String entityType; 
            private java.util.List < Errors> errors; 
            private String language; 
            private String phoneNumber; 
            private String templateCode; 
            private String wabaId; 

            /**
             * <p>The Business Manager ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3992****</p>
             */
            public Builder businessId(String businessId) {
                this.businessId = businessId;
                return this;
            }

            /**
             * <p>Indicates whether the messages can be sent.</p>
             * 
             * <strong>example:</strong>
             * <p>AVAILABLE</p>
             */
            public Builder canSendMessage(String canSendMessage) {
                this.canSendMessage = canSendMessage;
                return this;
            }

            /**
             * <p>The entity type.</p>
             * 
             * <strong>example:</strong>
             * <p>PHONE_NUMBER</p>
             */
            public Builder entityType(String entityType) {
                this.entityType = entityType;
                return this;
            }

            /**
             * <p>The reasons why the messages failed to be sent.</p>
             */
            public Builder errors(java.util.List < Errors> errors) {
                this.errors = errors;
                return this;
            }

            /**
             * <p>The template language.</p>
             * 
             * <strong>example:</strong>
             * <p>en</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * <p>The phone number to which the messages are sent.</p>
             * 
             * <strong>example:</strong>
             * <p>86138****</p>
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * <p>The template code. This parameter is returned when the NodeType parameter is set to <strong>template</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>939928****</p>
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            /**
             * <p>The WABA ID. You can view the WABA ID in the Chat App Message Service console after you create the WABA.</p>
             * 
             * <strong>example:</strong>
             * <p>39939***</p>
             */
            public Builder wabaId(String wabaId) {
                this.wabaId = wabaId;
                return this;
            }

            public Entities build() {
                return new Entities(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWhatsappHealthStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetWhatsappHealthStatusResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanSendMessage")
        private String canSendMessage;

        @com.aliyun.core.annotation.NameInMap("Entities")
        private java.util.List < Entities> entities;

        private Data(Builder builder) {
            this.canSendMessage = builder.canSendMessage;
            this.entities = builder.entities;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return canSendMessage
         */
        public String getCanSendMessage() {
            return this.canSendMessage;
        }

        /**
         * @return entities
         */
        public java.util.List < Entities> getEntities() {
            return this.entities;
        }

        public static final class Builder {
            private String canSendMessage; 
            private java.util.List < Entities> entities; 

            /**
             * <p>Indicates whether the messages can be sent.</p>
             * 
             * <strong>example:</strong>
             * <p>AVAILABLE</p>
             */
            public Builder canSendMessage(String canSendMessage) {
                this.canSendMessage = canSendMessage;
                return this;
            }

            /**
             * <p>The queried entities.</p>
             */
            public Builder entities(java.util.List < Entities> entities) {
                this.entities = entities;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
