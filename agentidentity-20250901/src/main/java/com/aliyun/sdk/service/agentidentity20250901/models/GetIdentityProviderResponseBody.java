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
 * {@link GetIdentityProviderResponseBody} extends {@link TeaModel}
 *
 * <p>GetIdentityProviderResponseBody</p>
 */
public class GetIdentityProviderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IdentityProvider")
    private IdentityProvider identityProvider;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetIdentityProviderResponseBody(Builder builder) {
        this.identityProvider = builder.identityProvider;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIdentityProviderResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return identityProvider
     */
    public IdentityProvider getIdentityProvider() {
        return this.identityProvider;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private IdentityProvider identityProvider; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetIdentityProviderResponseBody model) {
            this.identityProvider = model.identityProvider;
            this.requestId = model.requestId;
        } 

        /**
         * IdentityProvider.
         */
        public Builder identityProvider(IdentityProvider identityProvider) {
            this.identityProvider = identityProvider;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetIdentityProviderResponseBody build() {
            return new GetIdentityProviderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetIdentityProviderResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderResponseBody</p>
     */
    public static class IdentityProvider extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowedAudience")
        private java.util.List<String> allowedAudience;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DiscoveryURL")
        private String discoveryURL;

        @com.aliyun.core.annotation.NameInMap("IdentityProviderArn")
        private String identityProviderArn;

        @com.aliyun.core.annotation.NameInMap("IdentityProviderName")
        private String identityProviderName;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private IdentityProvider(Builder builder) {
            this.allowedAudience = builder.allowedAudience;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.discoveryURL = builder.discoveryURL;
            this.identityProviderArn = builder.identityProviderArn;
            this.identityProviderName = builder.identityProviderName;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IdentityProvider create() {
            return builder().build();
        }

        /**
         * @return allowedAudience
         */
        public java.util.List<String> getAllowedAudience() {
            return this.allowedAudience;
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
         * @return discoveryURL
         */
        public String getDiscoveryURL() {
            return this.discoveryURL;
        }

        /**
         * @return identityProviderArn
         */
        public String getIdentityProviderArn() {
            return this.identityProviderArn;
        }

        /**
         * @return identityProviderName
         */
        public String getIdentityProviderName() {
            return this.identityProviderName;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private java.util.List<String> allowedAudience; 
            private String createTime; 
            private String description; 
            private String discoveryURL; 
            private String identityProviderArn; 
            private String identityProviderName; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(IdentityProvider model) {
                this.allowedAudience = model.allowedAudience;
                this.createTime = model.createTime;
                this.description = model.description;
                this.discoveryURL = model.discoveryURL;
                this.identityProviderArn = model.identityProviderArn;
                this.identityProviderName = model.identityProviderName;
                this.updateTime = model.updateTime;
            } 

            /**
             * AllowedAudience.
             */
            public Builder allowedAudience(java.util.List<String> allowedAudience) {
                this.allowedAudience = allowedAudience;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DiscoveryURL.
             */
            public Builder discoveryURL(String discoveryURL) {
                this.discoveryURL = discoveryURL;
                return this;
            }

            /**
             * IdentityProviderArn.
             */
            public Builder identityProviderArn(String identityProviderArn) {
                this.identityProviderArn = identityProviderArn;
                return this;
            }

            /**
             * IdentityProviderName.
             */
            public Builder identityProviderName(String identityProviderName) {
                this.identityProviderName = identityProviderName;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public IdentityProvider build() {
                return new IdentityProvider(this);
            } 

        } 

    }
}
