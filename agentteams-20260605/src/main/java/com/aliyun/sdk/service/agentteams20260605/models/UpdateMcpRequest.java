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
 * {@link UpdateMcpRequest} extends {@link RequestModel}
 *
 * <p>UpdateMcpRequest</p>
 */
public class UpdateMcpRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SwaggerConfig")
    private String swaggerConfig;

    private UpdateMcpRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.addresses = builder.addresses;
        this.authConfig = builder.authConfig;
        this.authEnabled = builder.authEnabled;
        this.clientToken = builder.clientToken;
        this.createType = builder.createType;
        this.description = builder.description;
        this.id = builder.id;
        this.instanceId = builder.instanceId;
        this.swaggerConfig = builder.swaggerConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMcpRequest create() {
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
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return swaggerConfig
     */
    public String getSwaggerConfig() {
        return this.swaggerConfig;
    }

    public static final class Builder extends Request.Builder<UpdateMcpRequest, Builder> {
        private String regionId; 
        private java.util.List<String> addresses; 
        private String authConfig; 
        private Boolean authEnabled; 
        private String clientToken; 
        private String createType; 
        private String description; 
        private String id; 
        private String instanceId; 
        private String swaggerConfig; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMcpRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.addresses = request.addresses;
            this.authConfig = request.authConfig;
            this.authEnabled = request.authEnabled;
            this.clientToken = request.clientToken;
            this.createType = request.createType;
            this.description = request.description;
            this.id = request.id;
            this.instanceId = request.instanceId;
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
         * <p>AgentTeams</p>
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
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
         * SwaggerConfig.
         */
        public Builder swaggerConfig(String swaggerConfig) {
            this.putBodyParameter("SwaggerConfig", swaggerConfig);
            this.swaggerConfig = swaggerConfig;
            return this;
        }

        @Override
        public UpdateMcpRequest build() {
            return new UpdateMcpRequest(this);
        } 

    } 

}
