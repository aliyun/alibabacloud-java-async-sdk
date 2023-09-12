// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20220531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InitApplyRefund4DistributionRequest} extends {@link RequestModel}
 *
 * <p>InitApplyRefund4DistributionRequest</p>
 */
public class InitApplyRefund4DistributionRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("BizClaimType")
    private Integer bizClaimType;

    @Body
    @NameInMap("DistributorId")
    private String distributorId;

    @Body
    @NameInMap("GoodsStatus")
    private Integer goodsStatus;

    @Body
    @NameInMap("SubDistributionOrderId")
    private String subDistributionOrderId;

    @Body
    @NameInMap("TenantId")
    private String tenantId;

    private InitApplyRefund4DistributionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizClaimType = builder.bizClaimType;
        this.distributorId = builder.distributorId;
        this.goodsStatus = builder.goodsStatus;
        this.subDistributionOrderId = builder.subDistributionOrderId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitApplyRefund4DistributionRequest create() {
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
     * @return bizClaimType
     */
    public Integer getBizClaimType() {
        return this.bizClaimType;
    }

    /**
     * @return distributorId
     */
    public String getDistributorId() {
        return this.distributorId;
    }

    /**
     * @return goodsStatus
     */
    public Integer getGoodsStatus() {
        return this.goodsStatus;
    }

    /**
     * @return subDistributionOrderId
     */
    public String getSubDistributionOrderId() {
        return this.subDistributionOrderId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<InitApplyRefund4DistributionRequest, Builder> {
        private String regionId; 
        private Integer bizClaimType; 
        private String distributorId; 
        private Integer goodsStatus; 
        private String subDistributionOrderId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(InitApplyRefund4DistributionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizClaimType = request.bizClaimType;
            this.distributorId = request.distributorId;
            this.goodsStatus = request.goodsStatus;
            this.subDistributionOrderId = request.subDistributionOrderId;
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
         * BizClaimType.
         */
        public Builder bizClaimType(Integer bizClaimType) {
            this.putBodyParameter("BizClaimType", bizClaimType);
            this.bizClaimType = bizClaimType;
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
         * GoodsStatus.
         */
        public Builder goodsStatus(Integer goodsStatus) {
            this.putBodyParameter("GoodsStatus", goodsStatus);
            this.goodsStatus = goodsStatus;
            return this;
        }

        /**
         * SubDistributionOrderId.
         */
        public Builder subDistributionOrderId(String subDistributionOrderId) {
            this.putBodyParameter("SubDistributionOrderId", subDistributionOrderId);
            this.subDistributionOrderId = subDistributionOrderId;
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
        public InitApplyRefund4DistributionRequest build() {
            return new InitApplyRefund4DistributionRequest(this);
        } 

    } 

}
