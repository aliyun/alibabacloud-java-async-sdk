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
 * {@link ModelRouterBatchBindModelGroupRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterBatchBindModelGroupRequest</p>
 */
public class ModelRouterBatchBindModelGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("allowedModelGroupConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private String allowedModelGroupConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientIdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Long> clientIdList;

    private ModelRouterBatchBindModelGroupRequest(Builder builder) {
        super(builder);
        this.allowedModelGroupConfig = builder.allowedModelGroupConfig;
        this.clientIdList = builder.clientIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterBatchBindModelGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowedModelGroupConfig
     */
    public String getAllowedModelGroupConfig() {
        return this.allowedModelGroupConfig;
    }

    /**
     * @return clientIdList
     */
    public java.util.List<Long> getClientIdList() {
        return this.clientIdList;
    }

    public static final class Builder extends Request.Builder<ModelRouterBatchBindModelGroupRequest, Builder> {
        private String allowedModelGroupConfig; 
        private java.util.List<Long> clientIdList; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterBatchBindModelGroupRequest request) {
            super(request);
            this.allowedModelGroupConfig = request.allowedModelGroupConfig;
            this.clientIdList = request.clientIdList;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;model_ids&quot;:[],&quot;group_ids&quot;:[&quot;mg_pro&quot;]}</p>
         */
        public Builder allowedModelGroupConfig(String allowedModelGroupConfig) {
            this.putBodyParameter("allowedModelGroupConfig", allowedModelGroupConfig);
            this.allowedModelGroupConfig = allowedModelGroupConfig;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[1001, 1002, 1003]</p>
         */
        public Builder clientIdList(java.util.List<Long> clientIdList) {
            this.putBodyParameter("clientIdList", clientIdList);
            this.clientIdList = clientIdList;
            return this;
        }

        @Override
        public ModelRouterBatchBindModelGroupRequest build() {
            return new ModelRouterBatchBindModelGroupRequest(this);
        } 

    } 

}
