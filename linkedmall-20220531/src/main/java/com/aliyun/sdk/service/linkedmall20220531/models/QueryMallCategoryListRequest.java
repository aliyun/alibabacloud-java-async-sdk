// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20220531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMallCategoryListRequest} extends {@link RequestModel}
 *
 * <p>QueryMallCategoryListRequest</p>
 */
public class QueryMallCategoryListRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("CategoryId")
    private Long categoryId;

    @Body
    @NameInMap("DistributionMallId")
    private String distributionMallId;

    @Body
    @NameInMap("DistributorId")
    private String distributorId;

    @Body
    @NameInMap("TenantId")
    private String tenantId;

    private QueryMallCategoryListRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.categoryId = builder.categoryId;
        this.distributionMallId = builder.distributionMallId;
        this.distributorId = builder.distributorId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMallCategoryListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return categoryId
     */
    public Long getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return distributionMallId
     */
    public String getDistributionMallId() {
        return this.distributionMallId;
    }

    /**
     * @return distributorId
     */
    public String getDistributorId() {
        return this.distributorId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<QueryMallCategoryListRequest, Builder> {
        private String regionId; 
        private Long categoryId; 
        private String distributionMallId; 
        private String distributorId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(QueryMallCategoryListRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.categoryId = request.categoryId;
            this.distributionMallId = request.distributionMallId;
            this.distributorId = request.distributorId;
            this.tenantId = request.tenantId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * CategoryId.
         */
        public Builder categoryId(Long categoryId) {
            this.putBodyParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * DistributionMallId.
         */
        public Builder distributionMallId(String distributionMallId) {
            this.putBodyParameter("DistributionMallId", distributionMallId);
            this.distributionMallId = distributionMallId;
            return this;
        }

        /**
         * DistributorId.
         */
        public Builder distributorId(String distributorId) {
            this.putBodyParameter("DistributorId", distributorId);
            this.distributorId = distributorId;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public QueryMallCategoryListRequest build() {
            return new QueryMallCategoryListRequest(this);
        } 

    } 

}
