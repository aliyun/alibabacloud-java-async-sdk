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
 * {@link CreateAiModelSourceRequest} extends {@link RequestModel}
 *
 * <p>CreateAiModelSourceRequest</p>
 */
public class CreateAiModelSourceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("callNamePrefix")
    private String callNamePrefix;

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
    @com.aliyun.core.annotation.NameInMap("serviceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private CreateAiModelSourceRequest(Builder builder) {
        super(builder);
        this.callNamePrefix = builder.callNamePrefix;
        this.displayName = builder.displayName;
        this.gatewayId = builder.gatewayId;
        this.provider = builder.provider;
        this.serviceId = builder.serviceId;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAiModelSourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callNamePrefix
     */
    public String getCallNamePrefix() {
        return this.callNamePrefix;
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
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<CreateAiModelSourceRequest, Builder> {
        private String callNamePrefix; 
        private String displayName; 
        private String gatewayId; 
        private String provider; 
        private String serviceId; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateAiModelSourceRequest request) {
            super(request);
            this.callNamePrefix = request.callNamePrefix;
            this.displayName = request.displayName;
            this.gatewayId = request.gatewayId;
            this.provider = request.provider;
            this.serviceId = request.serviceId;
            this.clientToken = request.clientToken;
        } 

        /**
         * callNamePrefix.
         */
        public Builder callNamePrefix(String callNamePrefix) {
            this.putBodyParameter("callNamePrefix", callNamePrefix);
            this.callNamePrefix = callNamePrefix;
            return this;
        }

        /**
         * <p>The display name of the model source or model provider.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Model Studio model source</p>
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("displayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The ID of the AI gateway instance to which the resource belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-d00000000000000000000</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putBodyParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The stable identifier of the model provider.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen</p>
         */
        public Builder provider(String provider) {
            this.putBodyParameter("provider", provider);
            this.provider = provider;
            return this;
        }

        /**
         * <p>The ID of the AI service bound to the model source.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>svc-d00000000000000000000</p>
         */
        public Builder serviceId(String serviceId) {
            this.putBodyParameter("serviceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>The idempotency token generated by the caller to identify the same creation or retry operation.</p>
         * 
         * <strong>example:</strong>
         * <p>b1907ca4-952c-4c5f-8d1f-0aa6ae339c96</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public CreateAiModelSourceRequest build() {
            return new CreateAiModelSourceRequest(this);
        } 

    } 

}
