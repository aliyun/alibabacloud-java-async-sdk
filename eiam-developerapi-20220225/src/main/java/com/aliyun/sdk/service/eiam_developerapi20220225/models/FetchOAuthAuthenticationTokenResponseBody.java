// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.sdk.gateway.eiam.dev.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * 
 * {@link FetchOAuthAuthenticationTokenResponseBody} extends {@link TeaModel}
 *
 * <p>FetchOAuthAuthenticationTokenResponseBody</p>
 */
public class FetchOAuthAuthenticationTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("authenticationTokenId")
    private String authenticationTokenId;

    @com.aliyun.core.annotation.NameInMap("authenticationTokenType")
    private String authenticationTokenType;

    @com.aliyun.core.annotation.NameInMap("consumerId")
    private String consumerId;

    @com.aliyun.core.annotation.NameInMap("consumerType")
    private String consumerType;

    @com.aliyun.core.annotation.NameInMap("createTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("creatorId")
    private String creatorId;

    @com.aliyun.core.annotation.NameInMap("creatorType")
    private String creatorType;

    @com.aliyun.core.annotation.NameInMap("credentialProviderId")
    private String credentialProviderId;

    @com.aliyun.core.annotation.NameInMap("expirationTime")
    private Long expirationTime;

    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("oauthAccessTokenContent")
    private OauthAccessTokenContent oauthAccessTokenContent;

    @com.aliyun.core.annotation.NameInMap("revoked")
    private Boolean revoked;

    @com.aliyun.core.annotation.NameInMap("updateTime")
    private Long updateTime;

    private FetchOAuthAuthenticationTokenResponseBody(Builder builder) {
        this.authenticationTokenId = builder.authenticationTokenId;
        this.authenticationTokenType = builder.authenticationTokenType;
        this.consumerId = builder.consumerId;
        this.consumerType = builder.consumerType;
        this.createTime = builder.createTime;
        this.creatorId = builder.creatorId;
        this.creatorType = builder.creatorType;
        this.credentialProviderId = builder.credentialProviderId;
        this.expirationTime = builder.expirationTime;
        this.instanceId = builder.instanceId;
        this.oauthAccessTokenContent = builder.oauthAccessTokenContent;
        this.revoked = builder.revoked;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FetchOAuthAuthenticationTokenResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authenticationTokenId
     */
    public String getAuthenticationTokenId() {
        return this.authenticationTokenId;
    }

    /**
     * @return authenticationTokenType
     */
    public String getAuthenticationTokenType() {
        return this.authenticationTokenType;
    }

    /**
     * @return consumerId
     */
    public String getConsumerId() {
        return this.consumerId;
    }

    /**
     * @return consumerType
     */
    public String getConsumerType() {
        return this.consumerType;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return creatorId
     */
    public String getCreatorId() {
        return this.creatorId;
    }

    /**
     * @return creatorType
     */
    public String getCreatorType() {
        return this.creatorType;
    }

    /**
     * @return credentialProviderId
     */
    public String getCredentialProviderId() {
        return this.credentialProviderId;
    }

    /**
     * @return expirationTime
     */
    public Long getExpirationTime() {
        return this.expirationTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return oauthAccessTokenContent
     */
    public OauthAccessTokenContent getOauthAccessTokenContent() {
        return this.oauthAccessTokenContent;
    }

    /**
     * @return revoked
     */
    public Boolean getRevoked() {
        return this.revoked;
    }

    /**
     * @return updateTime
     */
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String authenticationTokenId; 
        private String authenticationTokenType; 
        private String consumerId; 
        private String consumerType; 
        private Long createTime; 
        private String creatorId; 
        private String creatorType; 
        private String credentialProviderId; 
        private Long expirationTime; 
        private String instanceId; 
        private OauthAccessTokenContent oauthAccessTokenContent; 
        private Boolean revoked; 
        private Long updateTime; 

        private Builder() {
        } 

        private Builder(FetchOAuthAuthenticationTokenResponseBody model) {
            this.authenticationTokenId = model.authenticationTokenId;
            this.authenticationTokenType = model.authenticationTokenType;
            this.consumerId = model.consumerId;
            this.consumerType = model.consumerType;
            this.createTime = model.createTime;
            this.creatorId = model.creatorId;
            this.creatorType = model.creatorType;
            this.credentialProviderId = model.credentialProviderId;
            this.expirationTime = model.expirationTime;
            this.instanceId = model.instanceId;
            this.oauthAccessTokenContent = model.oauthAccessTokenContent;
            this.revoked = model.revoked;
            this.updateTime = model.updateTime;
        } 

        /**
         * authenticationTokenId.
         */
        public Builder authenticationTokenId(String authenticationTokenId) {
            this.authenticationTokenId = authenticationTokenId;
            return this;
        }

        /**
         * authenticationTokenType.
         */
        public Builder authenticationTokenType(String authenticationTokenType) {
            this.authenticationTokenType = authenticationTokenType;
            return this;
        }

        /**
         * consumerId.
         */
        public Builder consumerId(String consumerId) {
            this.consumerId = consumerId;
            return this;
        }

        /**
         * consumerType.
         */
        public Builder consumerType(String consumerType) {
            this.consumerType = consumerType;
            return this;
        }

        /**
         * createTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * creatorId.
         */
        public Builder creatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }

        /**
         * creatorType.
         */
        public Builder creatorType(String creatorType) {
            this.creatorType = creatorType;
            return this;
        }

        /**
         * credentialProviderId.
         */
        public Builder credentialProviderId(String credentialProviderId) {
            this.credentialProviderId = credentialProviderId;
            return this;
        }

        /**
         * expirationTime.
         */
        public Builder expirationTime(Long expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }

        /**
         * <p>EIAM实例ID。</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * oauthAccessTokenContent.
         */
        public Builder oauthAccessTokenContent(OauthAccessTokenContent oauthAccessTokenContent) {
            this.oauthAccessTokenContent = oauthAccessTokenContent;
            return this;
        }

        /**
         * revoked.
         */
        public Builder revoked(Boolean revoked) {
            this.revoked = revoked;
            return this;
        }

        /**
         * updateTime.
         */
        public Builder updateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public FetchOAuthAuthenticationTokenResponseBody build() {
            return new FetchOAuthAuthenticationTokenResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link FetchOAuthAuthenticationTokenResponseBody} extends {@link TeaModel}
     *
     * <p>FetchOAuthAuthenticationTokenResponseBody</p>
     */
    public static class OauthAccessTokenContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accessTokenValue")
        private String accessTokenValue;

        @com.aliyun.core.annotation.NameInMap("scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("tokenType")
        private String tokenType;

        private OauthAccessTokenContent(Builder builder) {
            this.accessTokenValue = builder.accessTokenValue;
            this.scope = builder.scope;
            this.tokenType = builder.tokenType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OauthAccessTokenContent create() {
            return builder().build();
        }

        /**
         * @return accessTokenValue
         */
        public String getAccessTokenValue() {
            return this.accessTokenValue;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return tokenType
         */
        public String getTokenType() {
            return this.tokenType;
        }

        public static final class Builder {
            private String accessTokenValue; 
            private String scope; 
            private String tokenType; 

            private Builder() {
            } 

            private Builder(OauthAccessTokenContent model) {
                this.accessTokenValue = model.accessTokenValue;
                this.scope = model.scope;
                this.tokenType = model.tokenType;
            } 

            /**
             * accessTokenValue.
             */
            public Builder accessTokenValue(String accessTokenValue) {
                this.accessTokenValue = accessTokenValue;
                return this;
            }

            /**
             * scope.
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * tokenType.
             */
            public Builder tokenType(String tokenType) {
                this.tokenType = tokenType;
                return this;
            }

            public OauthAccessTokenContent build() {
                return new OauthAccessTokenContent(this);
            } 

        } 

    }
}
