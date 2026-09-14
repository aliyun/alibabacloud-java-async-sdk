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
         * <p>The consumer description.</p>
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
         * <p>The gateway type. Valid values:</p>
         * <ul>
         * <li>API: a consumer for Cloud-Native API Gateway.</li>
         * <li>AI: a consumer for AI Gateway.</li>
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
         * <p>The consumer name.</p>
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
         * <p>The idempotency token generated by the caller as a globally unique value (UUID recommended), with a maximum length of 64 characters. Within approximately 24 hours after the first successful request, a duplicate request that carries the same ClientToken and identical request parameters directly returns the consumerId from the first creation without creating a new consumer. A request that carries the same ClientToken but different request parameters returns IdempotentParameterMismatch. If the first request is still being processed, IdempotentProcessing is returned. If this parameter is not specified, idempotency control is disabled and the behavior is consistent with earlier versions.</p>
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
         * <p>Specifies whether to perform only a dry run. If this parameter is set to true, the system performs the same parameter, permission, IAM, resource policy, resource existence, and business rule validations as a real creation request, but does not create the consumer, write to the database, create or delete SecretRef, or produce other side effects such as audit logs. If this parameter is not specified or is set to false, the behavior is consistent with earlier versions.</p>
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
