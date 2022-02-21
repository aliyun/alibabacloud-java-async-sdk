// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sts20150401.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssumeRoleWithOIDCResponseBody} extends {@link TeaModel}
 *
 * <p>AssumeRoleWithOIDCResponseBody</p>
 */
public class AssumeRoleWithOIDCResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("OIDCTokenInfo")
    private OIDCTokenInfo OIDCTokenInfo;

    @NameInMap("AssumedRoleUser")
    private AssumedRoleUser assumedRoleUser;

    @NameInMap("Credentials")
    private Credentials credentials;

    private AssumeRoleWithOIDCResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.OIDCTokenInfo = builder.OIDCTokenInfo;
        this.assumedRoleUser = builder.assumedRoleUser;
        this.credentials = builder.credentials;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssumeRoleWithOIDCResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return OIDCTokenInfo
     */
    public OIDCTokenInfo getOIDCTokenInfo() {
        return this.OIDCTokenInfo;
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

    public static final class Builder {
        private String requestId; 
        private OIDCTokenInfo OIDCTokenInfo; 
        private AssumedRoleUser assumedRoleUser; 
        private Credentials credentials; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the parsed OIDC Token.
         */
        public Builder OIDCTokenInfo(OIDCTokenInfo OIDCTokenInfo) {
            this.OIDCTokenInfo = OIDCTokenInfo;
            return this;
        }

        /**
         * The temporary role-playing identity.
         */
        public Builder assumedRoleUser(AssumedRoleUser assumedRoleUser) {
            this.assumedRoleUser = assumedRoleUser;
            return this;
        }

        /**
         * The temporary access credential (STS Token).
         */
        public Builder credentials(Credentials credentials) {
            this.credentials = credentials;
            return this;
        }

        public AssumeRoleWithOIDCResponseBody build() {
            return new AssumeRoleWithOIDCResponseBody(this);
        } 

    } 

    public static class OIDCTokenInfo extends TeaModel {
        @NameInMap("Subject")
        private String subject;

        @NameInMap("Issuer")
        private String issuer;

        @NameInMap("ClientIds")
        private String clientIds;

        private OIDCTokenInfo(Builder builder) {
            this.subject = builder.subject;
            this.issuer = builder.issuer;
            this.clientIds = builder.clientIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OIDCTokenInfo create() {
            return builder().build();
        }

        /**
         * @return subject
         */
        public String getSubject() {
            return this.subject;
        }

        /**
         * @return issuer
         */
        public String getIssuer() {
            return this.issuer;
        }

        /**
         * @return clientIds
         */
        public String getClientIds() {
            return this.clientIds;
        }

        public static final class Builder {
            private String subject; 
            private String issuer; 
            private String clientIds; 

            /**
             * oidc main body.
             * <p>
             * 
             * The value of the sub" field in the corresponding OIDC Token.
             * 
             */
            public Builder subject(String subject) {
                this.subject = subject;
                return this;
            }

            /**
             * The URL of the OIDC issuer.
             * <p>
             * 
             * The value of the "iss" field in the corresponding OIDC Token.
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * OIDC audience. Separate multiple IDs with commas (,).
             * <p>
             * 
             * The value of the "aud" field in the corresponding OIDC Token.
             */
            public Builder clientIds(String clientIds) {
                this.clientIds = clientIds;
                return this;
            }

            public OIDCTokenInfo build() {
                return new OIDCTokenInfo(this);
            } 

        } 

    }
    public static class AssumedRoleUser extends TeaModel {
        @NameInMap("AssumedRoleId")
        private String assumedRoleId;

        @NameInMap("Arn")
        private String arn;

        private AssumedRoleUser(Builder builder) {
            this.assumedRoleId = builder.assumedRoleId;
            this.arn = builder.arn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssumedRoleUser create() {
            return builder().build();
        }

        /**
         * @return assumedRoleId
         */
        public String getAssumedRoleId() {
            return this.assumedRoleId;
        }

        /**
         * @return arn
         */
        public String getArn() {
            return this.arn;
        }

        public static final class Builder {
            private String assumedRoleId; 
            private String arn; 

            /**
             * The ID of the temporary identity.
             */
            public Builder assumedRoleId(String assumedRoleId) {
                this.assumedRoleId = assumedRoleId;
                return this;
            }

            /**
             * The ARN of the temporary identity.
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            public AssumedRoleUser build() {
                return new AssumedRoleUser(this);
            } 

        } 

    }
    public static class Credentials extends TeaModel {
        @NameInMap("SecurityToken")
        private String securityToken;

        @NameInMap("Expiration")
        private String expiration;

        @NameInMap("AccessKeySecret")
        private String accessKeySecret;

        @NameInMap("AccessKeyId")
        private String accessKeyId;

        private Credentials(Builder builder) {
            this.securityToken = builder.securityToken;
            this.expiration = builder.expiration;
            this.accessKeySecret = builder.accessKeySecret;
            this.accessKeyId = builder.accessKeyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Credentials create() {
            return builder().build();
        }

        /**
         * @return securityToken
         */
        public String getSecurityToken() {
            return this.securityToken;
        }

        /**
         * @return expiration
         */
        public String getExpiration() {
            return this.expiration;
        }

        /**
         * @return accessKeySecret
         */
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        /**
         * @return accessKeyId
         */
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public static final class Builder {
            private String securityToken; 
            private String expiration; 
            private String accessKeySecret; 
            private String accessKeyId; 

            /**
             * The security token.
             */
            public Builder securityToken(String securityToken) {
                this.securityToken = securityToken;
                return this;
            }

            /**
             * The expiration time.
             */
            public Builder expiration(String expiration) {
                this.expiration = expiration;
                return this;
            }

            /**
             * The accesskey pair.
             */
            public Builder accessKeySecret(String accessKeySecret) {
                this.accessKeySecret = accessKeySecret;
                return this;
            }

            /**
             * The accesskey ID.
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            public Credentials build() {
                return new Credentials(this);
            } 

        } 

    }
}
