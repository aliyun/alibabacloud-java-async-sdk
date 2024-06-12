// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InvalidPhoneNumberFilterResponseBody} extends {@link TeaModel}
 *
 * <p>InvalidPhoneNumberFilterResponseBody</p>
 */
public class InvalidPhoneNumberFilterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private InvalidPhoneNumberFilterResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvalidPhoneNumberFilterResponseBody create() {
        return builder().build();
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
    public java.util.List < Data> getData() {
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

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 

        /**
         * The response code. Valid values:
         * <p>
         * 
         * *   **OK**: The request is successful.
         * *   **MobileNumberIllegal**: The phone number is invalid.
         * *   **EncyrptTypeIllegal**: The encryption type is invalid.
         * *   **MobileNumberTypeNotMatch**: The phone number does not match the encryption type.
         * *   **CarrierIllegal**: The carrier type is invalid.
         * *   **AuthCodeNotExist**: The authorization code does not exist.
         * *   **PortabilityNumberNotSupported**: Mobile number portability is not supported.
         * *   **Unknown**: An unknown exception occurred.
         * *   **AuthCodeAndApiNotMatch**: A system exception occurred.
         * *   **AuthCodeAndApiNotMatch**: The authorization code does not match the API operation.
         * *   **RequestFrequencyLimit**: Repeated queries for the same phone number at a high frequency within a short period of time are prohibited due to restrictions that are set by carriers. If this error code is returned, please try again later.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Details about the returned entries.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public InvalidPhoneNumberFilterResponseBody build() {
            return new InvalidPhoneNumberFilterResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("EncryptedNumber")
        private String encryptedNumber;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("OriginalNumber")
        private String originalNumber;

        private Data(Builder builder) {
            this.code = builder.code;
            this.encryptedNumber = builder.encryptedNumber;
            this.expireTime = builder.expireTime;
            this.originalNumber = builder.originalNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return encryptedNumber
         */
        public String getEncryptedNumber() {
            return this.encryptedNumber;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return originalNumber
         */
        public String getOriginalNumber() {
            return this.originalNumber;
        }

        public static final class Builder {
            private String code; 
            private String encryptedNumber; 
            private String expireTime; 
            private String originalNumber; 

            /**
             * The returned filter results.
             * <p>
             * 
             * *   **YES**: the valid phone number. The mappings are returned.
             * *   **NO**: the invalid phone number. No mappings are returned.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The encrypted phone number.
             */
            public Builder encryptedNumber(String encryptedNumber) {
                this.encryptedNumber = encryptedNumber;
                return this;
            }

            /**
             * The time when the phone number expires.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * The original phone number.
             */
            public Builder originalNumber(String originalNumber) {
                this.originalNumber = originalNumber;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
