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
 * {@link GenerateJwtAuthenticationTokenResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateJwtAuthenticationTokenResponseBody</p>
 */
public class GenerateJwtAuthenticationTokenResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("jwtContent")
    private JwtContent jwtContent;

    @com.aliyun.core.annotation.NameInMap("revoked")
    private Boolean revoked;

    @com.aliyun.core.annotation.NameInMap("updateTime")
    private Long updateTime;

    private GenerateJwtAuthenticationTokenResponseBody(Builder builder) {
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
        this.jwtContent = builder.jwtContent;
        this.revoked = builder.revoked;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateJwtAuthenticationTokenResponseBody create() {
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
     * @return jwtContent
     */
    public JwtContent getJwtContent() {
        return this.jwtContent;
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
        private JwtContent jwtContent; 
        private Boolean revoked; 
        private Long updateTime; 

        private Builder() {
        } 

        private Builder(GenerateJwtAuthenticationTokenResponseBody model) {
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
            this.jwtContent = model.jwtContent;
            this.revoked = model.revoked;
            this.updateTime = model.updateTime;
        } 

        /**
         * <p>Authentication token ID.</p>
         * 
         * <strong>example:</strong>
         * <p>atntkn_01kqflm0sxxx8nmdc1cb5dskxxxxx</p>
         */
        public Builder authenticationTokenId(String authenticationTokenId) {
            this.authenticationTokenId = authenticationTokenId;
            return this;
        }

        /**
         * <p>Authentication token type.</p>
         * <blockquote>
         * <p>The value is fixed as <code>jwt</code>, indicating a JWT authentication token.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>jwt</p>
         */
        public Builder authenticationTokenType(String authenticationTokenType) {
            this.authenticationTokenType = authenticationTokenType;
            return this;
        }

        /**
         * <p>Authentication token consumer ID.</p>
         * 
         * <strong>example:</strong>
         * <p>test_jwt_subject</p>
         */
        public Builder consumerId(String consumerId) {
            this.consumerId = consumerId;
            return this;
        }

        /**
         * <p>Authentication token consumer type. Valid values:</p>
         * <ul>
         * <li><p>application: Application</p>
         * </li>
         * <li><p>custom: Custom type</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        public Builder consumerType(String consumerType) {
            this.consumerType = consumerType;
            return this;
        }

        /**
         * <p>The creation time of the authentication token, UNIX timestamp, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649830225000</p>
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>Authentication token creator ID.</p>
         * 
         * <strong>example:</strong>
         * <p>app_ngtkgrrxxxxktg5eao6z4xxxxx</p>
         */
        public Builder creatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }

        /**
         * <p>Authentication token creator type. Valid values:</p>
         * <ul>
         * <li>application: Application</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>application</p>
         */
        public Builder creatorType(String creatorType) {
            this.creatorType = creatorType;
            return this;
        }

        /**
         * <p>Credential provider ID.</p>
         * 
         * <strong>example:</strong>
         * <p>atp_01kr2cmj5gxxx4fvmls2e93dxxxxx</p>
         */
        public Builder credentialProviderId(String credentialProviderId) {
            this.credentialProviderId = credentialProviderId;
            return this;
        }

        /**
         * <p>Authentication token expiration time, UNIX timestamp, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1772693568000</p>
         */
        public Builder expirationTime(Long expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }

        /**
         * <p>Instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>JWT authentication token content.</p>
         */
        public Builder jwtContent(JwtContent jwtContent) {
            this.jwtContent = jwtContent;
            return this;
        }

        /**
         * <p>Whether the authentication token is revoked.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder revoked(Boolean revoked) {
            this.revoked = revoked;
            return this;
        }

        /**
         * <p>The update time of the authentication token, UNIX timestamp, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649830225000</p>
         */
        public Builder updateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public GenerateJwtAuthenticationTokenResponseBody build() {
            return new GenerateJwtAuthenticationTokenResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GenerateJwtAuthenticationTokenResponseBody} extends {@link TeaModel}
     *
     * <p>GenerateJwtAuthenticationTokenResponseBody</p>
     */
    public static class JwtContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("derivedShortToken")
        private String derivedShortToken;

        @com.aliyun.core.annotation.NameInMap("jwtValue")
        private String jwtValue;

        private JwtContent(Builder builder) {
            this.derivedShortToken = builder.derivedShortToken;
            this.jwtValue = builder.jwtValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JwtContent create() {
            return builder().build();
        }

        /**
         * @return derivedShortToken
         */
        public String getDerivedShortToken() {
            return this.derivedShortToken;
        }

        /**
         * @return jwtValue
         */
        public String getJwtValue() {
            return this.jwtValue;
        }

        public static final class Builder {
            private String derivedShortToken; 
            private String jwtValue; 

            private Builder() {
            } 

            private Builder(JwtContent model) {
                this.derivedShortToken = model.derivedShortToken;
                this.jwtValue = model.jwtValue;
            } 

            /**
             * <p>The derived short token of the JWT.</p>
             * 
             * <strong>example:</strong>
             * <p>sk-Nx2vzxxxxxxxxxxxxxxxxx</p>
             */
            public Builder derivedShortToken(String derivedShortToken) {
                this.derivedShortToken = derivedShortToken;
                return this;
            }

            /**
             * <p>JWT content.</p>
             * 
             * <strong>example:</strong>
             * <p>eyJhbGciOixxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
             */
            public Builder jwtValue(String jwtValue) {
                this.jwtValue = jwtValue;
                return this;
            }

            public JwtContent build() {
                return new JwtContent(this);
            } 

        } 

    }
}
