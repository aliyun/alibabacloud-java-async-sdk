// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link GetUserPoolResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserPoolResponseBody</p>
 */
public class GetUserPoolResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserPool")
    private UserPool userPool;

    private GetUserPoolResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userPool = builder.userPool;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserPoolResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userPool
     */
    public UserPool getUserPool() {
        return this.userPool;
    }

    public static final class Builder {
        private String requestId; 
        private UserPool userPool; 

        private Builder() {
        } 

        private Builder(GetUserPoolResponseBody model) {
            this.requestId = model.requestId;
            this.userPool = model.userPool;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AABD6E03-4B3A-5687-88FF-72232670ED0C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The user pool information.</p>
         */
        public Builder userPool(UserPool userPool) {
            this.userPool = userPool;
            return this;
        }

        public GetUserPoolResponseBody build() {
            return new GetUserPoolResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUserPoolResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserPoolResponseBody</p>
     */
    public static class UserPool extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("OIDCDiscoveryURL")
        private String OIDCDiscoveryURL;

        @com.aliyun.core.annotation.NameInMap("SigninBaseURL")
        private String signinBaseURL;

        @com.aliyun.core.annotation.NameInMap("SourcePlatform")
        private String sourcePlatform;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("UserPoolId")
        private String userPoolId;

        @com.aliyun.core.annotation.NameInMap("UserPoolName")
        private String userPoolName;

        private UserPool(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.OIDCDiscoveryURL = builder.OIDCDiscoveryURL;
            this.signinBaseURL = builder.signinBaseURL;
            this.sourcePlatform = builder.sourcePlatform;
            this.updateTime = builder.updateTime;
            this.userPoolId = builder.userPoolId;
            this.userPoolName = builder.userPoolName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserPool create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return OIDCDiscoveryURL
         */
        public String getOIDCDiscoveryURL() {
            return this.OIDCDiscoveryURL;
        }

        /**
         * @return signinBaseURL
         */
        public String getSigninBaseURL() {
            return this.signinBaseURL;
        }

        /**
         * @return sourcePlatform
         */
        public String getSourcePlatform() {
            return this.sourcePlatform;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userPoolId
         */
        public String getUserPoolId() {
            return this.userPoolId;
        }

        /**
         * @return userPoolName
         */
        public String getUserPoolName() {
            return this.userPoolName;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String OIDCDiscoveryURL; 
            private String signinBaseURL; 
            private String sourcePlatform; 
            private String updateTime; 
            private String userPoolId; 
            private String userPoolName; 

            private Builder() {
            } 

            private Builder(UserPool model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.OIDCDiscoveryURL = model.OIDCDiscoveryURL;
                this.signinBaseURL = model.signinBaseURL;
                this.sourcePlatform = model.sourcePlatform;
                this.updateTime = model.updateTime;
                this.userPoolId = model.userPoolId;
                this.userPoolName = model.userPoolName;
            } 

            /**
             * <p>The creation time in ISO 8601 format (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2026-05-07T06:19:17Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the user pool.</p>
             * 
             * <strong>example:</strong>
             * <p>Sample user pool</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The discovery URL for the OpenID Connect (OIDC) protocol.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://signin-cn-beijing.aliyunagentid.com/up_7b6908bcb9ba4c****c8e187/.well-known/openid-configuration">https://signin-cn-beijing.aliyunagentid.com/up_7b6908bcb9ba4c****c8e187/.well-known/openid-configuration</a></p>
             */
            public Builder OIDCDiscoveryURL(String OIDCDiscoveryURL) {
                this.OIDCDiscoveryURL = OIDCDiscoveryURL;
                return this;
            }

            /**
             * <p>The base URL for logon.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://pre-signin-cn-hangzhou.aliyunagentid.com/up_e14d889*****716841">https://pre-signin-cn-hangzhou.aliyunagentid.com/up_e14d889*****716841</a></p>
             */
            public Builder signinBaseURL(String signinBaseURL) {
                this.signinBaseURL = signinBaseURL;
                return this;
            }

            /**
             * <p>The source platform.</p>
             * 
             * <strong>example:</strong>
             * <p>Manual</p>
             */
            public Builder sourcePlatform(String sourcePlatform) {
                this.sourcePlatform = sourcePlatform;
                return this;
            }

            /**
             * <p>The update time in ISO 8601 format (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2026-05-07T06:19:17Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The ID of the user pool.</p>
             * 
             * <strong>example:</strong>
             * <p>up_xxxxxxxxxxxxxxxxxxxx</p>
             */
            public Builder userPoolId(String userPoolId) {
                this.userPoolId = userPoolId;
                return this;
            }

            /**
             * <p>The name of the user pool.</p>
             * 
             * <strong>example:</strong>
             * <p>my-agent-userpool</p>
             */
            public Builder userPoolName(String userPoolName) {
                this.userPoolName = userPoolName;
                return this;
            }

            public UserPool build() {
                return new UserPool(this);
            } 

        } 

    }
}
