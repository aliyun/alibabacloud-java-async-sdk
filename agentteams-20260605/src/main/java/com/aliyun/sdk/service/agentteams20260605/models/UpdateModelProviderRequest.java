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
 * {@link UpdateModelProviderRequest} extends {@link RequestModel}
 *
 * <p>UpdateModelProviderRequest</p>
 */
public class UpdateModelProviderRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Address")
    @com.aliyun.core.annotation.Validation(required = true)
    private String address;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApiKeys")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> apiKeys;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

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
    @com.aliyun.core.annotation.NameInMap("Protocols")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> protocols;

    private UpdateModelProviderRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.address = builder.address;
        this.apiKeys = builder.apiKeys;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.id = builder.id;
        this.instanceId = builder.instanceId;
        this.protocols = builder.protocols;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateModelProviderRequest create() {
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
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return apiKeys
     */
    public java.util.List<String> getApiKeys() {
        return this.apiKeys;
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
     * @return protocols
     */
    public java.util.List<String> getProtocols() {
        return this.protocols;
    }

    public static final class Builder extends Request.Builder<UpdateModelProviderRequest, Builder> {
        private String regionId; 
        private String address; 
        private java.util.List<String> apiKeys; 
        private String clientToken; 
        private String description; 
        private String id; 
        private String instanceId; 
        private java.util.List<String> protocols; 

        private Builder() {
            super();
        } 

        private Builder(UpdateModelProviderRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.address = request.address;
            this.apiKeys = request.apiKeys;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.id = request.id;
            this.instanceId = request.instanceId;
            this.protocols = request.protocols;
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
         * <p><a href="https://api.example.com">https://api.example.com</a></p>
         */
        public Builder address(String address) {
            this.putBodyParameter("Address", address);
            this.address = address;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;sk-xxx&quot;]</p>
         */
        public Builder apiKeys(java.util.List<String> apiKeys) {
            String apiKeysShrink = shrink(apiKeys, "ApiKeys", "json");
            this.putBodyParameter("ApiKeys", apiKeysShrink);
            this.apiKeys = apiKeys;
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
         * <p>p-xxx</p>
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
         * <p>[&quot;openai&quot;]</p>
         */
        public Builder protocols(java.util.List<String> protocols) {
            String protocolsShrink = shrink(protocols, "Protocols", "json");
            this.putBodyParameter("Protocols", protocolsShrink);
            this.protocols = protocols;
            return this;
        }

        @Override
        public UpdateModelProviderRequest build() {
            return new UpdateModelProviderRequest(this);
        } 

    } 

}
