// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link RemoveResourceGroupModelTemplateRequest} extends {@link RequestModel}
 *
 * <p>RemoveResourceGroupModelTemplateRequest</p>
 */
public class RemoveResourceGroupModelTemplateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ModelTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelTemplateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> resourceGroupIds;

    private RemoveResourceGroupModelTemplateRequest(Builder builder) {
        super(builder);
        this.modelTemplateId = builder.modelTemplateId;
        this.resourceGroupIds = builder.resourceGroupIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveResourceGroupModelTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelTemplateId
     */
    public String getModelTemplateId() {
        return this.modelTemplateId;
    }

    /**
     * @return resourceGroupIds
     */
    public java.util.List<String> getResourceGroupIds() {
        return this.resourceGroupIds;
    }

    public static final class Builder extends Request.Builder<RemoveResourceGroupModelTemplateRequest, Builder> {
        private String modelTemplateId; 
        private java.util.List<String> resourceGroupIds; 

        private Builder() {
            super();
        } 

        private Builder(RemoveResourceGroupModelTemplateRequest request) {
            super(request);
            this.modelTemplateId = request.modelTemplateId;
            this.resourceGroupIds = request.resourceGroupIds;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mt-xxxx</p>
         */
        public Builder modelTemplateId(String modelTemplateId) {
            this.putBodyParameter("ModelTemplateId", modelTemplateId);
            this.modelTemplateId = modelTemplateId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder resourceGroupIds(java.util.List<String> resourceGroupIds) {
            this.putBodyParameter("ResourceGroupIds", resourceGroupIds);
            this.resourceGroupIds = resourceGroupIds;
            return this;
        }

        @Override
        public RemoveResourceGroupModelTemplateRequest build() {
            return new RemoveResourceGroupModelTemplateRequest(this);
        } 

    } 

}
