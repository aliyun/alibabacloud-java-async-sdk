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
 * {@link AssumeRoleResponseBody} extends {@link TeaModel}
 *
 * <p>AssumeRoleResponseBody</p>
 */
public class AssumeRoleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AssumedRoleUser")
    private AssumedRoleUser assumedRoleUser;

    @com.aliyun.core.annotation.NameInMap("Credentials")
    private Credentials credentials;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AssumeRoleResponseBody(Builder builder) {
        this.assumedRoleUser = builder.assumedRoleUser;
        this.credentials = builder.credentials;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssumeRoleResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AssumedRoleUser assumedRoleUser; 
        private Credentials credentials; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AssumeRoleResponseBody model) {
            this.assumedRoleUser = model.assumedRoleUser;
            this.credentials = model.credentials;
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
         * <p>The STS credentials.</p>
         */
        public Builder credentials(Credentials credentials) {
            this.credentials = credentials;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6894B13B-6D71-4EF5-88FA-F32781734A7F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AssumeRoleResponseBody build() {
            return new AssumeRoleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AssumeRoleResponseBody} extends {@link TeaModel}
     *
     * <p>AssumeRoleResponseBody</p>
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
             * <p>acs:ram::123456789012****:role/adminrole/alice</p>
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * <p>The ID of the temporary identity that you use to assume the RAM role.</p>
             * 
             * <strong>example:</strong>
             * <p>34458433936495****:alice</p>
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
     * {@link AssumeRoleResponseBody} extends {@link TeaModel}
     *
     * <p>AssumeRoleResponseBody</p>
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
             * <p>STS.L4aBSCSJVMuKg5U1****</p>
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * <p>The AccessKey secret.</p>
             * 
             * <strong>example:</strong>
             * <p>wyLTSmsyPGP1ohvvw8xYgB29dlGI8KMiH2pK****</p>
             */
            public Builder accessKeySecret(String accessKeySecret) {
                this.accessKeySecret = accessKeySecret;
                return this;
            }

            /**
             * <p>The time when the STS token expires. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-04-09T11:52:19Z</p>
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
             * <hr>
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
}
