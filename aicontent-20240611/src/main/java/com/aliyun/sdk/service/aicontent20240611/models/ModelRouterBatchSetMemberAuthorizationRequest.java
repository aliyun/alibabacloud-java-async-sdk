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
 * {@link ModelRouterBatchSetMemberAuthorizationRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterBatchSetMemberAuthorizationRequest</p>
 */
public class ModelRouterBatchSetMemberAuthorizationRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("allowedModelGroupConfig")
    private String allowedModelGroupConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userIdList")
    @com.aliyun.core.annotation.Validation(maxLength = 50, minLength = 1)
    private java.util.List<Long> userIdList;

    private ModelRouterBatchSetMemberAuthorizationRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.allowedModelGroupConfig = builder.allowedModelGroupConfig;
        this.userIdList = builder.userIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterBatchSetMemberAuthorizationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return userIdList
     */
    public java.util.List<Long> getUserIdList() {
        return this.userIdList;
    }

    public static final class Builder extends Request.Builder<ModelRouterBatchSetMemberAuthorizationRequest, Builder> {
        private Long id; 
        private String allowedModelGroupConfig; 
        private java.util.List<Long> userIdList; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterBatchSetMemberAuthorizationRequest request) {
            super(request);
            this.id = request.id;
            this.allowedModelGroupConfig = request.allowedModelGroupConfig;
            this.userIdList = request.userIdList;
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
         * userIdList.
         */
        public Builder userIdList(java.util.List<Long> userIdList) {
            this.putBodyParameter("userIdList", userIdList);
            this.userIdList = userIdList;
            return this;
        }

        @Override
        public ModelRouterBatchSetMemberAuthorizationRequest build() {
            return new ModelRouterBatchSetMemberAuthorizationRequest(this);
        } 

    } 

}
