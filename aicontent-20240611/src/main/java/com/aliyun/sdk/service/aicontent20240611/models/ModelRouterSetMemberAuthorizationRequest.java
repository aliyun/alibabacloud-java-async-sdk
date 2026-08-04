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
 * {@link ModelRouterSetMemberAuthorizationRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterSetMemberAuthorizationRequest</p>
 */
public class ModelRouterSetMemberAuthorizationRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("clientId")
    private Long clientId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("allowedModelGroupConfig")
    private String allowedModelGroupConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("allowedModels")
    private String allowedModels;

    private ModelRouterSetMemberAuthorizationRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.id = builder.id;
        this.allowedModelGroupConfig = builder.allowedModelGroupConfig;
        this.allowedModels = builder.allowedModels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterSetMemberAuthorizationRequest create() {
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

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return allowedModelGroupConfig
     */
    public String getAllowedModelGroupConfig() {
        return this.allowedModelGroupConfig;
    }

    /**
     * @return allowedModels
     */
    public String getAllowedModels() {
        return this.allowedModels;
    }

    public static final class Builder extends Request.Builder<ModelRouterSetMemberAuthorizationRequest, Builder> {
        private Long clientId; 
        private Long id; 
        private String allowedModelGroupConfig; 
        private String allowedModels; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterSetMemberAuthorizationRequest request) {
            super(request);
            this.clientId = request.clientId;
            this.id = request.id;
            this.allowedModelGroupConfig = request.allowedModelGroupConfig;
            this.allowedModels = request.allowedModels;
        } 

        /**
         * clientId.
         */
        public Builder clientId(Long clientId) {
            this.putPathParameter("clientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.putPathParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * allowedModelGroupConfig.
         */
        public Builder allowedModelGroupConfig(String allowedModelGroupConfig) {
            this.putBodyParameter("allowedModelGroupConfig", allowedModelGroupConfig);
            this.allowedModelGroupConfig = allowedModelGroupConfig;
            return this;
        }

        /**
         * allowedModels.
         */
        public Builder allowedModels(String allowedModels) {
            this.putBodyParameter("allowedModels", allowedModels);
            this.allowedModels = allowedModels;
            return this;
        }

        @Override
        public ModelRouterSetMemberAuthorizationRequest build() {
            return new ModelRouterSetMemberAuthorizationRequest(this);
        } 

    } 

}
