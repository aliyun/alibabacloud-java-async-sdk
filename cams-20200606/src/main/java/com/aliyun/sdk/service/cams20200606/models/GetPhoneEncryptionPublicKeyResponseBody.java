// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link GetPhoneEncryptionPublicKeyResponseBody} extends {@link TeaModel}
 *
 * <p>GetPhoneEncryptionPublicKeyResponseBody</p>
 */
public class GetPhoneEncryptionPublicKeyResponseBody extends TeaModel {
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

    private GetPhoneEncryptionPublicKeyResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
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

    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetPhoneEncryptionPublicKeyResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

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
         * <p>The error code. For more information, see <a href="https://help.aliyun.com/document_detail/196974.html">Error codes</a>.</p>
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

        public GetPhoneEncryptionPublicKeyResponseBody build() {
            return new GetPhoneEncryptionPublicKeyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPhoneEncryptionPublicKeyResponseBody} extends {@link TeaModel}
     *
     * <p>GetPhoneEncryptionPublicKeyResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.encryptionPublicKey = model.encryptionPublicKey;
                this.encryptionPublicKeyStatus = model.encryptionPublicKeyStatus;
                this.phoneNumber = model.phoneNumber;
            } 

            /**
             * <p>The public key.</p>
             * 
             * <strong>example:</strong>
             * <p>-----BEGIN PUBLIC KEY-----\nMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAt+PMrYw4zUDEk+VeTrp0\n8LZaoVpiVFErX7iuoDjUs4F9vkxMQuIABjcXw\/swzTMEopLORQV28uqN\/2\/x9hjU\****\/Zwa\/Vk5Svp4\niVY4e22FsJCCWUEMvayO8Q+3UGq0eXXQ+8SlUWEMq1VaJ4pwCLsMnmgybA+VmJxi\nkwIDAQAB\n-----END PUBLIC KEY-----&quot;</p>
             */
            public Builder encryptionPublicKey(String encryptionPublicKey) {
                this.encryptionPublicKey = encryptionPublicKey;
                return this;
            }

            /**
             * <p>The validity status of the public key. Valid values:</p>
             * <ul>
             * <li><p>MISMATCH: invalid.</p>
             * </li>
             * <li><p>VALID: valid.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VALID</p>
             */
            public Builder encryptionPublicKeyStatus(String encryptionPublicKeyStatus) {
                this.encryptionPublicKeyStatus = encryptionPublicKeyStatus;
                return this;
            }

            /**
             * <p>The phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>861526377****</p>
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
