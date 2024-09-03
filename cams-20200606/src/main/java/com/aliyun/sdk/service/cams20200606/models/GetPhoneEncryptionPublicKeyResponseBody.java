// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPhoneEncryptionPublicKeyResponseBody} extends {@link TeaModel}
 *
 * <p>GetPhoneEncryptionPublicKeyResponseBody</p>
 */
public class GetPhoneEncryptionPublicKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetPhoneEncryptionPublicKeyResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPhoneEncryptionPublicKeyResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPhoneEncryptionPublicKeyResponseBody build() {
            return new GetPhoneEncryptionPublicKeyResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EncryptionPublicKey")
        private String encryptionPublicKey;

        @com.aliyun.core.annotation.NameInMap("EncryptionPublicKeyStatus")
        private String encryptionPublicKeyStatus;

        @com.aliyun.core.annotation.NameInMap("PhoneNumber")
        private String phoneNumber;

        private Data(Builder builder) {
            this.encryptionPublicKey = builder.encryptionPublicKey;
            this.encryptionPublicKeyStatus = builder.encryptionPublicKeyStatus;
            this.phoneNumber = builder.phoneNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return encryptionPublicKey
         */
        public String getEncryptionPublicKey() {
            return this.encryptionPublicKey;
        }

        /**
         * @return encryptionPublicKeyStatus
         */
        public String getEncryptionPublicKeyStatus() {
            return this.encryptionPublicKeyStatus;
        }

        /**
         * @return phoneNumber
         */
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public static final class Builder {
            private String encryptionPublicKey; 
            private String encryptionPublicKeyStatus; 
            private String phoneNumber; 

            /**
             * The public key.
             */
            public Builder encryptionPublicKey(String encryptionPublicKey) {
                this.encryptionPublicKey = encryptionPublicKey;
                return this;
            }

            /**
             * The validity state of the public key. Valid values:
             * <p>
             * 
             * *   MISMATCH: The public key is invalid.
             * *   VALID: The public key is valid.
             */
            public Builder encryptionPublicKeyStatus(String encryptionPublicKeyStatus) {
                this.encryptionPublicKeyStatus = encryptionPublicKeyStatus;
                return this;
            }

            /**
             * The phone number.
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
