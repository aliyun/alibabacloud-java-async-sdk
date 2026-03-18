// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ModelRouterCreateApiKeyRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterCreateApiKeyRequest</p>
 */
public class ModelRouterCreateApiKeyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientId")
    private Long clientId;

    private ModelRouterCreateApiKeyRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterCreateApiKeyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientId
     */
    public Long getClientId() {
        return this.clientId;
    }

    public static final class Builder extends Request.Builder<ModelRouterCreateApiKeyRequest, Builder> {
        private Long clientId; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterCreateApiKeyRequest request) {
            super(request);
            this.clientId = request.clientId;
        } 

        /**
         * clientId.
         */
        public Builder clientId(Long clientId) {
            this.putBodyParameter("clientId", clientId);
            this.clientId = clientId;
            return this;
        }

        @Override
        public ModelRouterCreateApiKeyRequest build() {
            return new ModelRouterCreateApiKeyRequest(this);
        } 

    } 

}
