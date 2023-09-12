// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20220531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelRefund4DistributionRequest} extends {@link RequestModel}
 *
 * <p>CancelRefund4DistributionRequest</p>
 */
public class CancelRefund4DistributionRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("DisputeId")
    private Long disputeId;

    @Body
    @NameInMap("DistributorId")
    private String distributorId;

    @Body
    @NameInMap("SubDistributionOrderId")
    private String subDistributionOrderId;

    @Body
    @NameInMap("TenantId")
    private String tenantId;

    private CancelRefund4DistributionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.disputeId = builder.disputeId;
        this.distributorId = builder.distributorId;
        this.subDistributionOrderId = builder.subDistributionOrderId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelRefund4DistributionRequest create() {
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
     * @return disputeId
     */
    public Long getDisputeId() {
        return this.disputeId;
    }

    /**
     * @return distributorId
     */
    public String getDistributorId() {
        return this.distributorId;
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

    public static final class Builder extends Request.Builder<CancelRefund4DistributionRequest, Builder> {
        private String regionId; 
        private Long disputeId; 
        private String distributorId; 
        private String subDistributionOrderId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(CancelRefund4DistributionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.disputeId = request.disputeId;
            this.distributorId = request.distributorId;
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
         * DisputeId.
         */
        public Builder disputeId(Long disputeId) {
            this.putBodyParameter("DisputeId", disputeId);
            this.disputeId = disputeId;
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
        public CancelRefund4DistributionRequest build() {
            return new CancelRefund4DistributionRequest(this);
        } 

    } 

}
