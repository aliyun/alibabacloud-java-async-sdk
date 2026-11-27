// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link GetAklessTmpIdentityForPartnerResponseBody} extends {@link TeaModel}
 *
 * <p>GetAklessTmpIdentityForPartnerResponseBody</p>
 */
public class GetAklessTmpIdentityForPartnerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetAklessTmpIdentityForPartnerResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAklessTmpIdentityForPartnerResponseBody create() {
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
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
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
        private Data data; 
        private String errorCode; 
        private String errorMsg; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetAklessTmpIdentityForPartnerResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMsg = model.errorMsg;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business response data. If the call is successful, this field contains the temporary credentials for the selected zero-trust role.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The business error code. If the call fails, you can identify the cause of the failure by using this code in combination with the Code in the gateway response.</p>
         * 
         * <strong>example:</strong>
         * <p>Param.Validation.Error</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The business error message. If the call fails, you can troubleshoot the issue by using this message in combination with the Message and request ID in the gateway response.</p>
         * 
         * <strong>example:</strong>
         * <p>Parameter %s%s</p>
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>The request ID of the current call. Provide this value for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>01234567-89AB-CDEF-0123-456789ABCDEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the business call is successful. A value of true indicates that you can read Data.Credentials. A value of false indicates that the credential retrieval failed.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAklessTmpIdentityForPartnerResponseBody build() {
            return new GetAklessTmpIdentityForPartnerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAklessTmpIdentityForPartnerResponseBody} extends {@link TeaModel}
     *
     * <p>GetAklessTmpIdentityForPartnerResponseBody</p>
     */
    public static class Credentials extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EncryptedAccessKeyId")
        private String encryptedAccessKeyId;

        @com.aliyun.core.annotation.NameInMap("EncryptedAccessKeySecret")
        private String encryptedAccessKeySecret;

        @com.aliyun.core.annotation.NameInMap("EncryptedSecurityToken")
        private String encryptedSecurityToken;

        private Credentials(Builder builder) {
            this.encryptedAccessKeyId = builder.encryptedAccessKeyId;
            this.encryptedAccessKeySecret = builder.encryptedAccessKeySecret;
            this.encryptedSecurityToken = builder.encryptedSecurityToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Credentials create() {
            return builder().build();
        }

        /**
         * @return encryptedAccessKeyId
         */
        public String getEncryptedAccessKeyId() {
            return this.encryptedAccessKeyId;
        }

        /**
         * @return encryptedAccessKeySecret
         */
        public String getEncryptedAccessKeySecret() {
            return this.encryptedAccessKeySecret;
        }

        /**
         * @return encryptedSecurityToken
         */
        public String getEncryptedSecurityToken() {
            return this.encryptedSecurityToken;
        }

        public static final class Builder {
            private String encryptedAccessKeyId; 
            private String encryptedAccessKeySecret; 
            private String encryptedSecurityToken; 

            private Builder() {
            } 

            private Builder(Credentials model) {
                this.encryptedAccessKeyId = model.encryptedAccessKeyId;
                this.encryptedAccessKeySecret = model.encryptedAccessKeySecret;
                this.encryptedSecurityToken = model.encryptedSecurityToken;
            } 

            /**
             * <p>The ciphertext of the temporary AccessKey ID. Decode the string by using standard Base64, take the first 16 bytes as the initialization vector, and decrypt the remaining bytes by using AES/CBC/PKCS5Padding.</p>
             * 
             * <strong>example:</strong>
             * <p>AQEBAQEBAQEBAQEBAQEBATGaJNzEdbS0zT+Sgseto+jKej8wWgHwzjOczWVj8AGR</p>
             */
            public Builder encryptedAccessKeyId(String encryptedAccessKeyId) {
                this.encryptedAccessKeyId = encryptedAccessKeyId;
                return this;
            }

            /**
             * <p>The ciphertext of the temporary AccessKey secret. Decode the string by using standard Base64, take the first 16 bytes as the initialization vector, and decrypt the remaining bytes by using AES/CBC/PKCS5Padding.</p>
             * 
             * <strong>example:</strong>
             * <p>AgICAgICAgICAgICAgICAs+sp9yHakZDA+poFujaJexJbkzXm6PqZwKvcU02cIpA</p>
             */
            public Builder encryptedAccessKeySecret(String encryptedAccessKeySecret) {
                this.encryptedAccessKeySecret = encryptedAccessKeySecret;
                return this;
            }

            /**
             * <p>The ciphertext of the temporary security token. Decode the string by using standard Base64, take the first 16 bytes as the initialization vector, and decrypt the remaining bytes by using AES/CBC/PKCS5Padding.</p>
             * 
             * <strong>example:</strong>
             * <p>AwMDAwMDAwMDAwMDAwMDAzRAieKgJULKm3/u+5GoCPQvvekE5/6+8sjz+1FNHYzA</p>
             */
            public Builder encryptedSecurityToken(String encryptedSecurityToken) {
                this.encryptedSecurityToken = encryptedSecurityToken;
                return this;
            }

            public Credentials build() {
                return new Credentials(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAklessTmpIdentityForPartnerResponseBody} extends {@link TeaModel}
     *
     * <p>GetAklessTmpIdentityForPartnerResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Credentials")
        private Credentials credentials;

        private Data(Builder builder) {
            this.credentials = builder.credentials;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return credentials
         */
        public Credentials getCredentials() {
            return this.credentials;
        }

        public static final class Builder {
            private Credentials credentials; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.credentials = model.credentials;
            } 

            /**
             * <p>The ciphertext strings of the three temporary credentials returned in the same call. Decrypt them separately and use them as a set.</p>
             */
            public Builder credentials(Credentials credentials) {
                this.credentials = credentials;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
