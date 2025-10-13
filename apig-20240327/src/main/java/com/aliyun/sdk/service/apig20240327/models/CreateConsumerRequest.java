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

    private CreateConsumerRequest(Builder builder) {
        super(builder);
        this.akSkIdentityConfigs = builder.akSkIdentityConfigs;
        this.apikeyIdentityConfig = builder.apikeyIdentityConfig;
        this.description = builder.description;
        this.enable = builder.enable;
        this.gatewayType = builder.gatewayType;
        this.jwtIdentityConfig = builder.jwtIdentityConfig;
        this.name = builder.name;
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

    public static final class Builder extends Request.Builder<CreateConsumerRequest, Builder> {
        private java.util.List<AkSkIdentityConfig> akSkIdentityConfigs; 
        private ApiKeyIdentityConfig apikeyIdentityConfig; 
        private String description; 
        private Boolean enable; 
        private String gatewayType; 
        private JwtIdentityConfig jwtIdentityConfig; 
        private String name; 

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
        } 

        /**
         * akSkIdentityConfigs.
         */
        public Builder akSkIdentityConfigs(java.util.List<AkSkIdentityConfig> akSkIdentityConfigs) {
            this.putBodyParameter("akSkIdentityConfigs", akSkIdentityConfigs);
            this.akSkIdentityConfigs = akSkIdentityConfigs;
            return this;
        }

        /**
         * apikeyIdentityConfig.
         */
        public Builder apikeyIdentityConfig(ApiKeyIdentityConfig apikeyIdentityConfig) {
            this.putBodyParameter("apikeyIdentityConfig", apikeyIdentityConfig);
            this.apikeyIdentityConfig = apikeyIdentityConfig;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * enable.
         */
        public Builder enable(Boolean enable) {
            this.putBodyParameter("enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * gatewayType.
         */
        public Builder gatewayType(String gatewayType) {
            this.putBodyParameter("gatewayType", gatewayType);
            this.gatewayType = gatewayType;
            return this;
        }

        /**
         * jwtIdentityConfig.
         */
        public Builder jwtIdentityConfig(JwtIdentityConfig jwtIdentityConfig) {
            this.putBodyParameter("jwtIdentityConfig", jwtIdentityConfig);
            this.jwtIdentityConfig = jwtIdentityConfig;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public CreateConsumerRequest build() {
            return new CreateConsumerRequest(this);
        } 

    } 

}
