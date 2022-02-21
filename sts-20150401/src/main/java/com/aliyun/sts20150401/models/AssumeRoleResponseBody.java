// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sts20150401.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssumeRoleResponseBody} extends {@link TeaModel}
 *
 * <p>AssumeRoleResponseBody</p>
 */
public class AssumeRoleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("AssumedRoleUser")
    private AssumedRoleUser assumedRoleUser;

    @NameInMap("Credentials")
    private Credentials credentials;

    private AssumeRoleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.assumedRoleUser = builder.assumedRoleUser;
        this.credentials = builder.credentials;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssumeRoleResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
         * The temporary identity of the role.
         */
        public Builder assumedRoleUser(AssumedRoleUser assumedRoleUser) {
            this.assumedRoleUser = assumedRoleUser;
            return this;
        }

        /**
         * The access credential.
         * <p>
         * 
         */
        public Builder credentials(Credentials credentials) {
            this.credentials = credentials;
            return this;
        }

        public AssumeRoleResponseBody build() {
            return new AssumeRoleResponseBody(this);
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
             * The expiration time of the authorization.
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
