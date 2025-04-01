// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sts20150401.models;

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
 * {@link AssumeRoleWithOIDCResponseBody} extends {@link TeaModel}
 *
 * <p>AssumeRoleWithOIDCResponseBody</p>
 */
public class AssumeRoleWithOIDCResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AssumedRoleUser")
    private AssumedRoleUser assumedRoleUser;

    @com.aliyun.core.annotation.NameInMap("Credentials")
    private Credentials credentials;

    @com.aliyun.core.annotation.NameInMap("OIDCTokenInfo")
    private OIDCTokenInfo OIDCTokenInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AssumeRoleWithOIDCResponseBody(Builder builder) {
        this.assumedRoleUser = builder.assumedRoleUser;
        this.credentials = builder.credentials;
        this.OIDCTokenInfo = builder.OIDCTokenInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssumeRoleWithOIDCResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assumedRoleUser
     */
    public AssumedRoleUser getAssumedRoleUser() {
        return this.assumedRoleUser;
    }

    /**
     * @return credentials
     */
    public Credentials getCredentials() {
        return this.credentials;
    }

    /**
     * @return OIDCTokenInfo
     */
    public OIDCTokenInfo getOIDCTokenInfo() {
        return this.OIDCTokenInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AssumedRoleUser assumedRoleUser; 
        private Credentials credentials; 
        private OIDCTokenInfo OIDCTokenInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AssumeRoleWithOIDCResponseBody model) {
            this.assumedRoleUser = model.assumedRoleUser;
            this.credentials = model.credentials;
            this.OIDCTokenInfo = model.OIDCTokenInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The temporary identity that you use to assume the RAM role.</p>
         */
        public Builder assumedRoleUser(AssumedRoleUser assumedRoleUser) {
            this.assumedRoleUser = assumedRoleUser;
            return this;
        }

        /**
         * <p>The access credentials.</p>
         */
        public Builder credentials(Credentials credentials) {
            this.credentials = credentials;
            return this;
        }

        /**
         * <p>The information about the OIDC token.</p>
         */
        public Builder OIDCTokenInfo(OIDCTokenInfo OIDCTokenInfo) {
            this.OIDCTokenInfo = OIDCTokenInfo;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>3D57EAD2-8723-1F26-B69C-F8707D8B565D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AssumeRoleWithOIDCResponseBody build() {
            return new AssumeRoleWithOIDCResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AssumeRoleWithOIDCResponseBody} extends {@link TeaModel}
     *
     * <p>AssumeRoleWithOIDCResponseBody</p>
     */
    public static class AssumedRoleUser extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Arn")
        private String arn;

        @com.aliyun.core.annotation.NameInMap("AssumedRoleId")
        private String assumedRoleId;

        private AssumedRoleUser(Builder builder) {
            this.arn = builder.arn;
            this.assumedRoleId = builder.assumedRoleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssumedRoleUser create() {
            return builder().build();
        }

        /**
         * @return arn
         */
        public String getArn() {
            return this.arn;
        }

        /**
         * @return assumedRoleId
         */
        public String getAssumedRoleId() {
            return this.assumedRoleId;
        }

        public static final class Builder {
            private String arn; 
            private String assumedRoleId; 

            private Builder() {
            } 

            private Builder(AssumedRoleUser model) {
                this.arn = model.arn;
                this.assumedRoleId = model.assumedRoleId;
            } 

            /**
             * <p>The ARN of the temporary identity that you use to assume the RAM role.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::113511544585****:role/testoidc/TestOidcAssumedRoleSession</p>
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * <p>The ID of the temporary identity that you use to assume the RAM role.</p>
             * 
             * <strong>example:</strong>
             * <p>33157794895460****</p>
             */
            public Builder assumedRoleId(String assumedRoleId) {
                this.assumedRoleId = assumedRoleId;
                return this;
            }

            public AssumedRoleUser build() {
                return new AssumedRoleUser(this);
            } 

        } 

    }
    /**
     * 
     * {@link AssumeRoleWithOIDCResponseBody} extends {@link TeaModel}
     *
     * <p>AssumeRoleWithOIDCResponseBody</p>
     */
    public static class Credentials extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessKeyId")
        private String accessKeyId;

        @com.aliyun.core.annotation.NameInMap("AccessKeySecret")
        private String accessKeySecret;

        @com.aliyun.core.annotation.NameInMap("Expiration")
        private String expiration;

        @com.aliyun.core.annotation.NameInMap("SecurityToken")
        private String securityToken;

        private Credentials(Builder builder) {
            this.accessKeyId = builder.accessKeyId;
            this.accessKeySecret = builder.accessKeySecret;
            this.expiration = builder.expiration;
            this.securityToken = builder.securityToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Credentials create() {
            return builder().build();
        }

        /**
         * @return accessKeyId
         */
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        /**
         * @return accessKeySecret
         */
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        /**
         * @return expiration
         */
        public String getExpiration() {
            return this.expiration;
        }

        /**
         * @return securityToken
         */
        public String getSecurityToken() {
            return this.securityToken;
        }

        public static final class Builder {
            private String accessKeyId; 
            private String accessKeySecret; 
            private String expiration; 
            private String securityToken; 

            private Builder() {
            } 

            private Builder(Credentials model) {
                this.accessKeyId = model.accessKeyId;
                this.accessKeySecret = model.accessKeySecret;
                this.expiration = model.expiration;
                this.securityToken = model.securityToken;
            } 

            /**
             * <p>The AccessKey ID.</p>
             * 
             * <strong>example:</strong>
             * <p>STS.NUgYrLnoC37mZZCNnAbez****</p>
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * <p>The AccessKey secret.</p>
             * 
             * <strong>example:</strong>
             * <p>CVwjCkNzTMupZ8NbTCxCBRq3K16jtcWFTJAyBEv2****</p>
             */
            public Builder accessKeySecret(String accessKeySecret) {
                this.accessKeySecret = accessKeySecret;
                return this;
            }

            /**
             * <p>The time when the STS token expires. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-10-20T04:27:09Z</p>
             */
            public Builder expiration(String expiration) {
                this.expiration = expiration;
                return this;
            }

            /**
             * <p>The STS token.</p>
             * <blockquote>
             * <p>Alibaba Cloud STS does not impose limits on the length of STS tokens. We strongly recommend that you do not specify a maximum length for STS tokens.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>CAIShwJ1q6Ft5B2yfSjIr5bSEsj4g7BihPWGWHz****</p>
             */
            public Builder securityToken(String securityToken) {
                this.securityToken = securityToken;
                return this;
            }

            public Credentials build() {
                return new Credentials(this);
            } 

        } 

    }
    /**
     * 
     * {@link AssumeRoleWithOIDCResponseBody} extends {@link TeaModel}
     *
     * <p>AssumeRoleWithOIDCResponseBody</p>
     */
    public static class OIDCTokenInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientIds")
        private String clientIds;

        @com.aliyun.core.annotation.NameInMap("ExpirationTime")
        private String expirationTime;

        @com.aliyun.core.annotation.NameInMap("IssuanceTime")
        private String issuanceTime;

        @com.aliyun.core.annotation.NameInMap("Issuer")
        private String issuer;

        @com.aliyun.core.annotation.NameInMap("Subject")
        private String subject;

        @com.aliyun.core.annotation.NameInMap("VerificationInfo")
        private String verificationInfo;

        private OIDCTokenInfo(Builder builder) {
            this.clientIds = builder.clientIds;
            this.expirationTime = builder.expirationTime;
            this.issuanceTime = builder.issuanceTime;
            this.issuer = builder.issuer;
            this.subject = builder.subject;
            this.verificationInfo = builder.verificationInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OIDCTokenInfo create() {
            return builder().build();
        }

        /**
         * @return clientIds
         */
        public String getClientIds() {
            return this.clientIds;
        }

        /**
         * @return expirationTime
         */
        public String getExpirationTime() {
            return this.expirationTime;
        }

        /**
         * @return issuanceTime
         */
        public String getIssuanceTime() {
            return this.issuanceTime;
        }

        /**
         * @return issuer
         */
        public String getIssuer() {
            return this.issuer;
        }

        /**
         * @return subject
         */
        public String getSubject() {
            return this.subject;
        }

        /**
         * @return verificationInfo
         */
        public String getVerificationInfo() {
            return this.verificationInfo;
        }

        public static final class Builder {
            private String clientIds; 
            private String expirationTime; 
            private String issuanceTime; 
            private String issuer; 
            private String subject; 
            private String verificationInfo; 

            private Builder() {
            } 

            private Builder(OIDCTokenInfo model) {
                this.clientIds = model.clientIds;
                this.expirationTime = model.expirationTime;
                this.issuanceTime = model.issuanceTime;
                this.issuer = model.issuer;
                this.subject = model.subject;
                this.verificationInfo = model.verificationInfo;
            } 

            /**
             * <p>The audience. If multiple audiences are returned, the audiences are separated by commas (,).</p>
             * <p>The audience is represented by the <code>aud</code> field in the OIDC Token.</p>
             * 
             * <strong>example:</strong>
             * <p>496271242565057****</p>
             */
            public Builder clientIds(String clientIds) {
                this.clientIds = clientIds;
                return this;
            }

            /**
             * <p>The time when the OIDC token expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-10-20T04:27:09Z</p>
             */
            public Builder expirationTime(String expirationTime) {
                this.expirationTime = expirationTime;
                return this;
            }

            /**
             * <p>The time when the OIDC token was issued.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-10-20T03:27:09Z</p>
             */
            public Builder issuanceTime(String issuanceTime) {
                this.issuanceTime = issuanceTime;
                return this;
            }

            /**
             * <p>The URL of the issuer,</p>
             * <p>which is represented by the <code>iss</code> field in the OIDC Token.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://dev-xxxxxx.okta.com">https://dev-xxxxxx.okta.com</a></p>
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * <p>The subject,</p>
             * <p>which is represented by the <code>sub</code> field in the OIDC Token.</p>
             * 
             * <strong>example:</strong>
             * <p>KryrkIdjylZb7agUgCEf****</p>
             */
            public Builder subject(String subject) {
                this.subject = subject;
                return this;
            }

            /**
             * <p>The verification information about the OIDC token. For more information, see <a href="https://help.aliyun.com/document_detail/327123.html">Manage an OIDC IdP</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder verificationInfo(String verificationInfo) {
                this.verificationInfo = verificationInfo;
                return this;
            }

            public OIDCTokenInfo build() {
                return new OIDCTokenInfo(this);
            } 

        } 

    }
}
