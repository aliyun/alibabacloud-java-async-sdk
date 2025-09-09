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
 * {@link GetUserTmpIdentityForPartnerResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserTmpIdentityForPartnerResponseBody</p>
 */
public class GetUserTmpIdentityForPartnerResponseBody extends TeaModel {
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

    private GetUserTmpIdentityForPartnerResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserTmpIdentityForPartnerResponseBody create() {
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

        private Builder(GetUserTmpIdentityForPartnerResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMsg = model.errorMsg;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetUserTmpIdentityForPartnerResponseBody build() {
            return new GetUserTmpIdentityForPartnerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUserTmpIdentityForPartnerResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserTmpIdentityForPartnerResponseBody</p>
     */
    public static class Credentials extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EncryptedAccessKeyId")
        private String encryptedAccessKeyId;

        @com.aliyun.core.annotation.NameInMap("EncryptedAccessKeySecret")
        private String encryptedAccessKeySecret;

        @com.aliyun.core.annotation.NameInMap("EncryptedSecurityToken")
        private String encryptedSecurityToken;

        @com.aliyun.core.annotation.NameInMap("Expiration")
        private String expiration;

        private Credentials(Builder builder) {
            this.encryptedAccessKeyId = builder.encryptedAccessKeyId;
            this.encryptedAccessKeySecret = builder.encryptedAccessKeySecret;
            this.encryptedSecurityToken = builder.encryptedSecurityToken;
            this.expiration = builder.expiration;
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

        /**
         * @return expiration
         */
        public String getExpiration() {
            return this.expiration;
        }

        public static final class Builder {
            private String encryptedAccessKeyId; 
            private String encryptedAccessKeySecret; 
            private String encryptedSecurityToken; 
            private String expiration; 

            private Builder() {
            } 

            private Builder(Credentials model) {
                this.encryptedAccessKeyId = model.encryptedAccessKeyId;
                this.encryptedAccessKeySecret = model.encryptedAccessKeySecret;
                this.encryptedSecurityToken = model.encryptedSecurityToken;
                this.expiration = model.expiration;
            } 

            /**
             * EncryptedAccessKeyId.
             */
            public Builder encryptedAccessKeyId(String encryptedAccessKeyId) {
                this.encryptedAccessKeyId = encryptedAccessKeyId;
                return this;
            }

            /**
             * EncryptedAccessKeySecret.
             */
            public Builder encryptedAccessKeySecret(String encryptedAccessKeySecret) {
                this.encryptedAccessKeySecret = encryptedAccessKeySecret;
                return this;
            }

            /**
             * EncryptedSecurityToken.
             */
            public Builder encryptedSecurityToken(String encryptedSecurityToken) {
                this.encryptedSecurityToken = encryptedSecurityToken;
                return this;
            }

            /**
             * Expiration.
             */
            public Builder expiration(String expiration) {
                this.expiration = expiration;
                return this;
            }

            public Credentials build() {
                return new Credentials(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetUserTmpIdentityForPartnerResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserTmpIdentityForPartnerResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Credentials")
        private Credentials credentials;

        @com.aliyun.core.annotation.NameInMap("HasCustomRoleAuth")
        private Boolean hasCustomRoleAuth;

        private Data(Builder builder) {
            this.credentials = builder.credentials;
            this.hasCustomRoleAuth = builder.hasCustomRoleAuth;
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

        /**
         * @return hasCustomRoleAuth
         */
        public Boolean getHasCustomRoleAuth() {
            return this.hasCustomRoleAuth;
        }

        public static final class Builder {
            private Credentials credentials; 
            private Boolean hasCustomRoleAuth; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.credentials = model.credentials;
                this.hasCustomRoleAuth = model.hasCustomRoleAuth;
            } 

            /**
             * Credentials.
             */
            public Builder credentials(Credentials credentials) {
                this.credentials = credentials;
                return this;
            }

            /**
             * HasCustomRoleAuth.
             */
            public Builder hasCustomRoleAuth(Boolean hasCustomRoleAuth) {
                this.hasCustomRoleAuth = hasCustomRoleAuth;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
