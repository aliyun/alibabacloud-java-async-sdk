// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sts20150401.models;

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
    @NameInMap("AssumedRoleUser")
    private AssumedRoleUser assumedRoleUser;

    @NameInMap("Credentials")
    private Credentials credentials;

    @NameInMap("OIDCTokenInfo")
    private OIDCTokenInfo OIDCTokenInfo;

    @NameInMap("RequestId")
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

        /**
         * The temporary identity that you use to assume the RAM role.
         */
        public Builder assumedRoleUser(AssumedRoleUser assumedRoleUser) {
            this.assumedRoleUser = assumedRoleUser;
            return this;
        }

        /**
         * The access credentials.
         */
        public Builder credentials(Credentials credentials) {
            this.credentials = credentials;
            return this;
        }

        /**
         * The information about the OIDC token.
         */
        public Builder OIDCTokenInfo(OIDCTokenInfo OIDCTokenInfo) {
            this.OIDCTokenInfo = OIDCTokenInfo;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AssumeRoleWithOIDCResponseBody build() {
            return new AssumeRoleWithOIDCResponseBody(this);
        } 

    } 

    public static class AssumedRoleUser extends TeaModel {
        @NameInMap("Arn")
        private String arn;

        @NameInMap("AssumedRoleId")
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

            /**
             * The ARN of the temporary identity that you use to assume the RAM role.
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * The ID of the temporary identity that you use to assume the RAM role.
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
    public static class Credentials extends TeaModel {
        @NameInMap("AccessKeyId")
        private String accessKeyId;

        @NameInMap("AccessKeySecret")
        private String accessKeySecret;

        @NameInMap("Expiration")
        private String expiration;

        @NameInMap("SecurityToken")
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

            /**
             * The AccessKey ID.
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * The AccessKey secret.
             */
            public Builder accessKeySecret(String accessKeySecret) {
                this.accessKeySecret = accessKeySecret;
                return this;
            }

            /**
             * The time when the STS token expires. The time is displayed in UTC.
             */
            public Builder expiration(String expiration) {
                this.expiration = expiration;
                return this;
            }

            /**
             * The STS token.
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
    public static class OIDCTokenInfo extends TeaModel {
        @NameInMap("ClientIds")
        private String clientIds;

        @NameInMap("Issuer")
        private String issuer;

        @NameInMap("Subject")
        private String subject;

        private OIDCTokenInfo(Builder builder) {
            this.clientIds = builder.clientIds;
            this.issuer = builder.issuer;
            this.subject = builder.subject;
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

        public static final class Builder {
            private String clientIds; 
            private String issuer; 
            private String subject; 

            /**
             * The audience. If multiple audiences are returned, the audiences are separated by commas (,).
             * <p>
             * 
             * The audience is represented by the `aud` field in the OIDC Token.
             */
            public Builder clientIds(String clientIds) {
                this.clientIds = clientIds;
                return this;
            }

            /**
             * The URL of the issuer,
             * <p>
             * 
             * which is represented by the `iss` field in the OIDC Token.
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * The subject,
             * <p>
             * 
             * which is represented by the `sub` field in the OIDC Token.
             */
            public Builder subject(String subject) {
                this.subject = subject;
                return this;
            }

            public OIDCTokenInfo build() {
                return new OIDCTokenInfo(this);
            } 

        } 

    }
}
