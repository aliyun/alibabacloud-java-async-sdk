// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

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
 * {@link DeleteResourceGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteResourceGroupRequest</p>
 */
public class DeleteResourceGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupIds")
    private java.util.List<String> resourceGroupIds;

    private DeleteResourceGroupRequest(Builder builder) {
        super(builder);
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceGroupIds = builder.resourceGroupIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteResourceGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceGroupIds
     */
    public java.util.List<String> getResourceGroupIds() {
        return this.resourceGroupIds;
    }

    public static final class Builder extends Request.Builder<DeleteResourceGroupRequest, Builder> {
        private String resourceGroupId; 
        private java.util.List<String> resourceGroupIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteResourceGroupRequest request) {
            super(request);
            this.resourceGroupId = request.resourceGroupId;
            this.resourceGroupIds = request.resourceGroupIds;
        } 

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ResourceGroupIds.
         */
        public Builder resourceGroupIds(java.util.List<String> resourceGroupIds) {
            this.putQueryParameter("ResourceGroupIds", resourceGroupIds);
            this.resourceGroupIds = resourceGroupIds;
            return this;
        }

        @Override
        public DeleteResourceGroupRequest build() {
            return new DeleteResourceGroupRequest(this);
        } 

    } 

}
