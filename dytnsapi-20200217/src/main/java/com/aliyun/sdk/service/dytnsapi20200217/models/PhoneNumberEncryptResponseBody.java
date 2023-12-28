// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PhoneNumberEncryptResponseBody} extends {@link TeaModel}
 *
 * <p>PhoneNumberEncryptResponseBody</p>
 */
public class PhoneNumberEncryptResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private PhoneNumberEncryptResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PhoneNumberEncryptResponseBody create() {
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
         * The response code.
         * <p>
         * 
         * *   The value OK indicates that the request was successful.
         * *   Other values indicate that the request failed. For more information, see [Error codes](~~109196~~).
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

        public PhoneNumberEncryptResponseBody build() {
            return new PhoneNumberEncryptResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("EncryptedNumber")
        private String encryptedNumber;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("OriginalNumber")
        private String originalNumber;

        private Data(Builder builder) {
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
            private String encryptedNumber; 
            private String expireTime; 
            private String originalNumber; 

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
