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
 * {@link ModelRouterUpdateModelGroupRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterUpdateModelGroupRequest</p>
 */
public class ModelRouterUpdateModelGroupRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("groupId")
    private String groupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Long> modelList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private ModelRouterUpdateModelGroupRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.modelList = builder.modelList;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterUpdateModelGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return modelList
     */
    public java.util.List<Long> getModelList() {
        return this.modelList;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<ModelRouterUpdateModelGroupRequest, Builder> {
        private String groupId; 
        private java.util.List<Long> modelList; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterUpdateModelGroupRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.modelList = request.modelList;
            this.name = request.name;
        } 

        /**
         * groupId.
         */
        public Builder groupId(String groupId) {
            this.putPathParameter("groupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[101, 102, 103]</p>
         */
        public Builder modelList(java.util.List<Long> modelList) {
            this.putBodyParameter("modelList", modelList);
            this.modelList = modelList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>专业版套餐</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public ModelRouterUpdateModelGroupRequest build() {
            return new ModelRouterUpdateModelGroupRequest(this);
        } 

    } 

}
