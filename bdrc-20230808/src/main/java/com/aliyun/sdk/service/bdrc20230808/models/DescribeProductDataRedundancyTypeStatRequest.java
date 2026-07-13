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
 * {@link DescribeProductDataRedundancyTypeStatRequest} extends {@link RequestModel}
 *
 * <p>DescribeProductDataRedundancyTypeStatRequest</p>
 */
public class DescribeProductDataRedundancyTypeStatRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceCategoryId")
    private String resourceCategoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerIds")
    private java.util.List<Long> resourceOwnerIds;

    private DescribeProductDataRedundancyTypeStatRequest(Builder builder) {
        super(builder);
        this.productType = builder.productType;
        this.resourceCategoryId = builder.resourceCategoryId;
        this.resourceOwnerIds = builder.resourceOwnerIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProductDataRedundancyTypeStatRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeProductDataRedundancyTypeStatRequest, Builder> {
        private String productType; 
        private String resourceCategoryId; 
        private java.util.List<Long> resourceOwnerIds; 

        private Builder() {
            super();
        } 

        private Builder(DescribeProductDataRedundancyTypeStatRequest request) {
            super(request);
            this.productType = request.productType;
            this.resourceCategoryId = request.resourceCategoryId;
            this.resourceOwnerIds = request.resourceOwnerIds;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
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

        @Override
        public DescribeProductDataRedundancyTypeStatRequest build() {
            return new DescribeProductDataRedundancyTypeStatRequest(this);
        } 

    } 

}
