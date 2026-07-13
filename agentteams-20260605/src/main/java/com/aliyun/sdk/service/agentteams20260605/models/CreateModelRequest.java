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
 * {@link CreateModelRequest} extends {@link RequestModel}
 *
 * <p>CreateModelRequest</p>
 */
public class CreateModelRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Protocols")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> protocols;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Provider")
    private String provider;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProviderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String providerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProviderName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String providerName;

    private CreateModelRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.protocols = builder.protocols;
        this.provider = builder.provider;
        this.providerId = builder.providerId;
        this.providerName = builder.providerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateModelRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return protocols
     */
    public java.util.List<String> getProtocols() {
        return this.protocols;
    }

    /**
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * @return providerId
     */
    public String getProviderId() {
        return this.providerId;
    }

    /**
     * @return providerName
     */
    public String getProviderName() {
        return this.providerName;
    }

    public static final class Builder extends Request.Builder<CreateModelRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private String description; 
        private String instanceId; 
        private String name; 
        private java.util.List<String> protocols; 
        private String provider; 
        private String providerId; 
        private String providerName; 

        private Builder() {
            super();
        } 

        private Builder(CreateModelRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.protocols = request.protocols;
            this.provider = request.provider;
            this.providerId = request.providerId;
            this.providerName = request.providerName;
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
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
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
         * <p>i-xxx</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;openai&quot;]</p>
         */
        public Builder protocols(java.util.List<String> protocols) {
            String protocolsShrink = shrink(protocols, "Protocols", "json");
            this.putBodyParameter("Protocols", protocolsShrink);
            this.protocols = protocols;
            return this;
        }

        /**
         * Provider.
         */
        public Builder provider(String provider) {
            this.putBodyParameter("Provider", provider);
            this.provider = provider;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>p-xxx</p>
         */
        public Builder providerId(String providerId) {
            this.putBodyParameter("ProviderId", providerId);
            this.providerId = providerId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-provider</p>
         */
        public Builder providerName(String providerName) {
            this.putBodyParameter("ProviderName", providerName);
            this.providerName = providerName;
            return this;
        }

        @Override
        public CreateModelRequest build() {
            return new CreateModelRequest(this);
        } 

    } 

}
