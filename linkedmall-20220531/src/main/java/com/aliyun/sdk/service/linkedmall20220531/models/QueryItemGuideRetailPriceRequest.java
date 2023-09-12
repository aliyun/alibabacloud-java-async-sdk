// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20220531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryItemGuideRetailPriceRequest} extends {@link RequestModel}
 *
 * <p>QueryItemGuideRetailPriceRequest</p>
 */
public class QueryItemGuideRetailPriceRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("DistributionMallId")
    private String distributionMallId;

    @Body
    @NameInMap("DistributorId")
    private String distributorId;

    @Body
    @NameInMap("LmItemIds")
    private java.util.List < String > lmItemIds;

    @Body
    @NameInMap("TenantId")
    private String tenantId;

    private QueryItemGuideRetailPriceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.distributionMallId = builder.distributionMallId;
        this.distributorId = builder.distributorId;
        this.lmItemIds = builder.lmItemIds;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryItemGuideRetailPriceRequest create() {
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
     * @return lmItemIds
     */
    public java.util.List < String > getLmItemIds() {
        return this.lmItemIds;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<QueryItemGuideRetailPriceRequest, Builder> {
        private String regionId; 
        private String distributionMallId; 
        private String distributorId; 
        private java.util.List < String > lmItemIds; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(QueryItemGuideRetailPriceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.distributionMallId = request.distributionMallId;
            this.distributorId = request.distributorId;
            this.lmItemIds = request.lmItemIds;
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
         * LmItemIds.
         */
        public Builder lmItemIds(java.util.List < String > lmItemIds) {
            String lmItemIdsShrink = shrink(lmItemIds, "LmItemIds", "json");
            this.putBodyParameter("LmItemIds", lmItemIdsShrink);
            this.lmItemIds = lmItemIds;
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
        public QueryItemGuideRetailPriceRequest build() {
            return new QueryItemGuideRetailPriceRequest(this);
        } 

    } 

}
