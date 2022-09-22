// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomerIssueCategoryRequest} extends {@link RequestModel}
 *
 * <p>DescribeCustomerIssueCategoryRequest</p>
 */
public class DescribeCustomerIssueCategoryRequest extends Request {
    @Query
    @NameInMap("Layer")
    private Long layer;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private DescribeCustomerIssueCategoryRequest(Builder builder) {
        super(builder);
        this.layer = builder.layer;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomerIssueCategoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return layer
     */
    public Long getLayer() {
        return this.layer;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeCustomerIssueCategoryRequest, Builder> {
        private Long layer; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCustomerIssueCategoryRequest request) {
            super(request);
            this.layer = request.layer;
            this.regionId = request.regionId;
        } 

        /**
         * Layer.
         */
        public Builder layer(Long layer) {
            this.putQueryParameter("Layer", layer);
            this.layer = layer;
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
        public DescribeCustomerIssueCategoryRequest build() {
            return new DescribeCustomerIssueCategoryRequest(this);
        } 

    } 

}
