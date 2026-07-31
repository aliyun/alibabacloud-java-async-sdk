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
 * {@link ModelRouterCreateModelGroupRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterCreateModelGroupRequest</p>
 */
public class ModelRouterCreateModelGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Long> modelList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private ModelRouterCreateModelGroupRequest(Builder builder) {
        super(builder);
        this.modelList = builder.modelList;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterCreateModelGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<ModelRouterCreateModelGroupRequest, Builder> {
        private java.util.List<Long> modelList; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterCreateModelGroupRequest request) {
            super(request);
            this.modelList = request.modelList;
            this.name = request.name;
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
        public ModelRouterCreateModelGroupRequest build() {
            return new ModelRouterCreateModelGroupRequest(this);
        } 

    } 

}
