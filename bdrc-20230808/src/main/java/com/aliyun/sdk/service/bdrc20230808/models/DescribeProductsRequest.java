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
 * {@link DescribeProductsRequest} extends {@link RequestModel}
 *
 * <p>DescribeProductsRequest</p>
 */
public class DescribeProductsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceCategoryId")
    private String resourceCategoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerIds")
    private java.util.List<Long> resourceOwnerIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceRegionId")
    private String resourceRegionId;

    private DescribeProductsRequest(Builder builder) {
        super(builder);
        this.productType = builder.productType;
        this.resourceCategoryId = builder.resourceCategoryId;
        this.resourceOwnerIds = builder.resourceOwnerIds;
        this.resourceRegionId = builder.resourceRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProductsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
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
     * @return resourceRegionId
     */
    public String getResourceRegionId() {
        return this.resourceRegionId;
    }

    public static final class Builder extends Request.Builder<DescribeProductsRequest, Builder> {
        private String productType; 
        private String resourceCategoryId; 
        private java.util.List<Long> resourceOwnerIds; 
        private String resourceRegionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeProductsRequest request) {
            super(request);
            this.productType = request.productType;
            this.resourceCategoryId = request.resourceCategoryId;
            this.resourceOwnerIds = request.resourceOwnerIds;
            this.resourceRegionId = request.resourceRegionId;
        } 

        /**
         * ProductType.
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
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
         * ResourceRegionId.
         */
        public Builder resourceRegionId(String resourceRegionId) {
            this.putQueryParameter("ResourceRegionId", resourceRegionId);
            this.resourceRegionId = resourceRegionId;
            return this;
        }

        @Override
        public DescribeProductsRequest build() {
            return new DescribeProductsRequest(this);
        } 

    } 

}
