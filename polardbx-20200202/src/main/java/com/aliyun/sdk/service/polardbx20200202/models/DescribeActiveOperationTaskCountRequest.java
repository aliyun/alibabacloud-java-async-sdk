// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeActiveOperationTaskCountRequest} extends {@link RequestModel}
 *
 * <p>DescribeActiveOperationTaskCountRequest</p>
 */
public class DescribeActiveOperationTaskCountRequest extends Request {
    @Query
    @NameInMap("Category")
    private String category;

    @Query
    @NameInMap("Product")
    private String product;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DescribeActiveOperationTaskCountRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.product = builder.product;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeActiveOperationTaskCountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeActiveOperationTaskCountRequest, Builder> {
        private String category; 
        private String product; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeActiveOperationTaskCountRequest request) {
            super(request);
            this.category = request.category;
            this.product = request.product;
            this.regionId = request.regionId;
        } 

        /**
         * Category.
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * Product.
         */
        public Builder product(String product) {
            this.putQueryParameter("Product", product);
            this.product = product;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeActiveOperationTaskCountRequest build() {
            return new DescribeActiveOperationTaskCountRequest(this);
        } 

    } 

}
