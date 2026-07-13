// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentteams20260605.models;

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
 * {@link CreateMcpRequest} extends {@link RequestModel}
 *
 * <p>CreateMcpRequest</p>
 */
public class CreateMcpRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Addresses")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> addresses;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuthConfig")
    private String authConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuthEnabled")
    private Boolean authEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateType")
    private String createType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SwaggerConfig")
    private String swaggerConfig;

    private CreateMcpRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.addresses = builder.addresses;
        this.authConfig = builder.authConfig;
        this.authEnabled = builder.authEnabled;
        this.clientToken = builder.clientToken;
        this.createType = builder.createType;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.protocol = builder.protocol;
        this.swaggerConfig = builder.swaggerConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMcpRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return addresses
     */
    public java.util.List<String> getAddresses() {
        return this.addresses;
    }

    /**
     * @return authConfig
     */
    public String getAuthConfig() {
        return this.authConfig;
    }

    /**
     * @return authEnabled
     */
    public Boolean getAuthEnabled() {
        return this.authEnabled;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return createType
     */
    public String getCreateType() {
        return this.createType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return swaggerConfig
     */
    public String getSwaggerConfig() {
        return this.swaggerConfig;
    }

    public static final class Builder extends Request.Builder<CreateMcpRequest, Builder> {
        private String regionId; 
        private java.util.List<String> addresses; 
        private String authConfig; 
        private Boolean authEnabled; 
        private String clientToken; 
        private String createType; 
        private String description; 
        private String instanceId; 
        private String name; 
        private String protocol; 
        private String swaggerConfig; 

        private Builder() {
            super();
        } 

        private Builder(CreateMcpRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.addresses = request.addresses;
            this.authConfig = request.authConfig;
            this.authEnabled = request.authEnabled;
            this.clientToken = request.clientToken;
            this.createType = request.createType;
            this.description = request.description;
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.protocol = request.protocol;
            this.swaggerConfig = request.swaggerConfig;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;<a href="https://example.com/mcp%22%5D">https://example.com/mcp&quot;]</a></p>
         */
        public Builder addresses(java.util.List<String> addresses) {
            String addressesShrink = shrink(addresses, "Addresses", "json");
            this.putBodyParameter("Addresses", addressesShrink);
            this.addresses = addresses;
            return this;
        }

        /**
         * AuthConfig.
         */
        public Builder authConfig(String authConfig) {
            this.putBodyParameter("AuthConfig", authConfig);
            this.authConfig = authConfig;
            return this;
        }

        /**
         * AuthEnabled.
         */
        public Builder authEnabled(Boolean authEnabled) {
            this.putBodyParameter("AuthEnabled", authEnabled);
            this.authEnabled = authEnabled;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * CreateType.
         */
        public Builder createType(String createType) {
            this.putBodyParameter("CreateType", createType);
            this.createType = createType;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ins-xxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AgentTeams</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Protocol.
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * SwaggerConfig.
         */
        public Builder swaggerConfig(String swaggerConfig) {
            this.putBodyParameter("SwaggerConfig", swaggerConfig);
            this.swaggerConfig = swaggerConfig;
            return this;
        }

        @Override
        public CreateMcpRequest build() {
            return new CreateMcpRequest(this);
        } 

    } 

}
