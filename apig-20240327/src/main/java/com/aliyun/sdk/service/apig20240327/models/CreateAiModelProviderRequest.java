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
 * {@link CreateAiModelProviderRequest} extends {@link RequestModel}
 *
 * <p>CreateAiModelProviderRequest</p>
 */
public class CreateAiModelProviderRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("displayName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String displayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("provider")
    @com.aliyun.core.annotation.Validation(required = true)
    private String provider;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceIds")
    private java.util.List<String> serviceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private CreateAiModelProviderRequest(Builder builder) {
        super(builder);
        this.displayName = builder.displayName;
        this.gatewayId = builder.gatewayId;
        this.provider = builder.provider;
        this.serviceIds = builder.serviceIds;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAiModelProviderRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * @return serviceIds
     */
    public java.util.List<String> getServiceIds() {
        return this.serviceIds;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<CreateAiModelProviderRequest, Builder> {
        private String displayName; 
        private String gatewayId; 
        private String provider; 
        private java.util.List<String> serviceIds; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateAiModelProviderRequest request) {
            super(request);
            this.displayName = request.displayName;
            this.gatewayId = request.gatewayId;
            this.provider = request.provider;
            this.serviceIds = request.serviceIds;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenAI</p>
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("displayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-ucbx3s2m****</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putBodyParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>openai</p>
         */
        public Builder provider(String provider) {
            this.putBodyParameter("provider", provider);
            this.provider = provider;
            return this;
        }

        /**
         * serviceIds.
         */
        public Builder serviceIds(java.util.List<String> serviceIds) {
            this.putBodyParameter("serviceIds", serviceIds);
            this.serviceIds = serviceIds;
            return this;
        }

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public CreateAiModelProviderRequest build() {
            return new CreateAiModelProviderRequest(this);
        } 

    } 

}
