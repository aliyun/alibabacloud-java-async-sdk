// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link CreateConsumerRequest} extends {@link RequestModel}
 *
 * <p>CreateConsumerRequest</p>
 */
public class CreateConsumerRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("akSkIdentityConfigs")
    private java.util.List<AkSkIdentityConfig> akSkIdentityConfigs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("apikeyIdentityConfig")
    private ApiKeyIdentityConfig apikeyIdentityConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enable")
    private Boolean enable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("expireAt")
    private Long expireAt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("gatewayType")
    private String gatewayType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("jwtIdentityConfig")
    private JwtIdentityConfig jwtIdentityConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dryRun")
    private Boolean dryRun;

    private CreateConsumerRequest(Builder builder) {
        super(builder);
        this.akSkIdentityConfigs = builder.akSkIdentityConfigs;
        this.apikeyIdentityConfig = builder.apikeyIdentityConfig;
        this.description = builder.description;
        this.enable = builder.enable;
        this.expireAt = builder.expireAt;
        this.gatewayType = builder.gatewayType;
        this.jwtIdentityConfig = builder.jwtIdentityConfig;
        this.name = builder.name;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConsumerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return akSkIdentityConfigs
     */
    public java.util.List<AkSkIdentityConfig> getAkSkIdentityConfigs() {
        return this.akSkIdentityConfigs;
    }

    /**
     * @return apikeyIdentityConfig
     */
    public ApiKeyIdentityConfig getApikeyIdentityConfig() {
        return this.apikeyIdentityConfig;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return expireAt
     */
    public Long getExpireAt() {
        return this.expireAt;
    }

    /**
     * @return gatewayType
     */
    public String getGatewayType() {
        return this.gatewayType;
    }

    /**
     * @return jwtIdentityConfig
     */
    public JwtIdentityConfig getJwtIdentityConfig() {
        return this.jwtIdentityConfig;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static final class Builder extends Request.Builder<CreateConsumerRequest, Builder> {
        private java.util.List<AkSkIdentityConfig> akSkIdentityConfigs; 
        private ApiKeyIdentityConfig apikeyIdentityConfig; 
        private String description; 
        private Boolean enable; 
        private Long expireAt; 
        private String gatewayType; 
        private JwtIdentityConfig jwtIdentityConfig; 
        private String name; 
        private String clientToken; 
        private Boolean dryRun; 

        private Builder() {
            super();
        } 

        private Builder(CreateConsumerRequest request) {
            super(request);
            this.akSkIdentityConfigs = request.akSkIdentityConfigs;
            this.apikeyIdentityConfig = request.apikeyIdentityConfig;
            this.description = request.description;
            this.enable = request.enable;
            this.expireAt = request.expireAt;
            this.gatewayType = request.gatewayType;
            this.jwtIdentityConfig = request.jwtIdentityConfig;
            this.name = request.name;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
        } 

        /**
         * <p>The list of AK/SK identity configurations.</p>
         */
        public Builder akSkIdentityConfigs(java.util.List<AkSkIdentityConfig> akSkIdentityConfigs) {
            this.putBodyParameter("akSkIdentityConfigs", akSkIdentityConfigs);
            this.akSkIdentityConfigs = akSkIdentityConfigs;
            return this;
        }

        /**
         * <p>The identity configuration for API key authentication.</p>
         */
        public Builder apikeyIdentityConfig(ApiKeyIdentityConfig apikeyIdentityConfig) {
            this.putBodyParameter("apikeyIdentityConfig", apikeyIdentityConfig);
            this.apikeyIdentityConfig = apikeyIdentityConfig;
            return this;
        }

        /**
         * <p>The description of the consumer.</p>
         * 
         * <strong>example:</strong>
         * <p>consumer for test</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to enable the consumer.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enable(Boolean enable) {
            this.putBodyParameter("enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * <p>The expiration time of the consumer. The value must be a positive integer that represents a UNIX timestamp in seconds and is later than the current time. If this parameter is left empty, the consumer never expires. The API key, JWT, and HMAC of the same consumer share this expiration time. Milliseconds are not automatically converted to seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1893456000</p>
         */
        public Builder expireAt(Long expireAt) {
            this.putBodyParameter("expireAt", expireAt);
            this.expireAt = expireAt;
            return this;
        }

        /**
         * <p>The gateway type. Valid values:</p>
         * <ul>
         * <li>API: the consumer of a cloud-native API gateway.</li>
         * <li>AI: the consumer of an AI gateway.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>API</p>
         */
        public Builder gatewayType(String gatewayType) {
            this.putBodyParameter("gatewayType", gatewayType);
            this.gatewayType = gatewayType;
            return this;
        }

        /**
         * <p>The JWT identity configuration.</p>
         */
        public Builder jwtIdentityConfig(JwtIdentityConfig jwtIdentityConfig) {
            this.putBodyParameter("jwtIdentityConfig", jwtIdentityConfig);
            this.jwtIdentityConfig = jwtIdentityConfig;
            return this;
        }

        /**
         * <p>The name of the consumer.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The idempotence identity. You can invoke the API with a globally unique value (a UUID is recommended) that does not exceed 64 characters in length. If you invoke a duplicate request with the same ClientToken and identical request parameters within 24 hours after the first request succeeds, the system directly returns the consumer ID created by the first request without creating a new consumer. If you invoke a request with the same ClientToken but different request parameters, the system returns IdempotentParameterMismatch. If the first request is still being processed, the system returns IdempotentProcessing. If this parameter is left empty, idempotence control is disabled, and the behavior is the same as that of the existing version.</p>
         * 
         * <strong>example:</strong>
         * <p>5f7a2c1e-9b3d-4e8f-a1c6-0d2b8e4f7a13</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run. If you set this parameter to true, the system performs the same parameter, permission, IAM, resource policy, resource existence, and business rule checks as a real creation request, but does not create the consumer, write data to the database, create or delete a SecretRef, or generate audit logs. If this parameter is left empty or set to false, the behavior is the same as that of the previous version.</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        @Override
        public CreateConsumerRequest build() {
            return new CreateConsumerRequest(this);
        } 

    } 

}
