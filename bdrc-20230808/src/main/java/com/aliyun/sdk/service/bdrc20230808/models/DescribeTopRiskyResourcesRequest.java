// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bdrc20230808.models;

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
 * {@link DescribeTopRiskyResourcesRequest} extends {@link RequestModel}
 *
 * <p>DescribeTopRiskyResourcesRequest</p>
 */
public class DescribeTopRiskyResourcesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceCategoryId")
    private String resourceCategoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerIds")
    private java.util.List<Long> resourceOwnerIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    private DescribeTopRiskyResourcesRequest(Builder builder) {
        super(builder);
        this.resourceCategoryId = builder.resourceCategoryId;
        this.resourceOwnerIds = builder.resourceOwnerIds;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTopRiskyResourcesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceCategoryId
     */
    public String getResourceCategoryId() {
        return this.resourceCategoryId;
    }

    /**
     * @return resourceOwnerIds
     */
    public java.util.List<Long> getResourceOwnerIds() {
        return this.resourceOwnerIds;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<DescribeTopRiskyResourcesRequest, Builder> {
        private String resourceCategoryId; 
        private java.util.List<Long> resourceOwnerIds; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTopRiskyResourcesRequest request) {
            super(request);
            this.resourceCategoryId = request.resourceCategoryId;
            this.resourceOwnerIds = request.resourceOwnerIds;
            this.resourceType = request.resourceType;
        } 

        /**
         * ResourceCategoryId.
         */
        public Builder resourceCategoryId(String resourceCategoryId) {
            this.putQueryParameter("ResourceCategoryId", resourceCategoryId);
            this.resourceCategoryId = resourceCategoryId;
            return this;
        }

        /**
         * ResourceOwnerIds.
         */
        public Builder resourceOwnerIds(java.util.List<Long> resourceOwnerIds) {
            String resourceOwnerIdsShrink = shrink(resourceOwnerIds, "ResourceOwnerIds", "json");
            this.putQueryParameter("ResourceOwnerIds", resourceOwnerIdsShrink);
            this.resourceOwnerIds = resourceOwnerIds;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public DescribeTopRiskyResourcesRequest build() {
            return new DescribeTopRiskyResourcesRequest(this);
        } 

    } 

}
