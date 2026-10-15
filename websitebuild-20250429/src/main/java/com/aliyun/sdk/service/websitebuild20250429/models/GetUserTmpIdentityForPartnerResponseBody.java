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
         * <p>The request result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code. If the request is successful, the ErrorCode field is not returned. If the request fails, the ErrorCode field is returned. For more information, see the error code list in this topic.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>aliuid:1998006665794443 assumeRole not exist,serviceName:realtimelogpush.dcdnservices.aliyuncs.com</p>
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
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
             * <p>The encrypted temporary AccessKey ID.</p>
             * 
             * <strong>example:</strong>
             * <p>7t2Rzt37ND7-xxx</p>
             */
            public Builder encryptedAccessKeyId(String encryptedAccessKeyId) {
                this.encryptedAccessKeyId = encryptedAccessKeyId;
                return this;
            }

            /**
             * <p>The encrypted temporary AccessKey secret.</p>
             * 
             * <strong>example:</strong>
             * <p>7t2Rzt37ND7-xxx</p>
             */
            public Builder encryptedAccessKeySecret(String encryptedAccessKeySecret) {
                this.encryptedAccessKeySecret = encryptedAccessKeySecret;
                return this;
            }

            /**
             * <p>The encrypted STS token.</p>
             * 
             * <strong>example:</strong>
             * <p>7t2Rzt37ND7-xxx</p>
             */
            public Builder encryptedSecurityToken(String encryptedSecurityToken) {
                this.encryptedSecurityToken = encryptedSecurityToken;
                return this;
            }

            /**
             * <p>The estimated expiration time of the credential.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-04-29T14:00:00Z</p>
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
             * <p>The security token.</p>
             */
            public Builder credentials(Credentials credentials) {
                this.credentials = credentials;
                return this;
            }

            /**
             * <p>Indicates whether the customer authorization has been obtained.</p>
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
