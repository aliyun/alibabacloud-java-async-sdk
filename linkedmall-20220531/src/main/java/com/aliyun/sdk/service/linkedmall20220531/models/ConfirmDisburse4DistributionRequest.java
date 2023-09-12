// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20220531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfirmDisburse4DistributionRequest} extends {@link RequestModel}
 *
 * <p>ConfirmDisburse4DistributionRequest</p>
 */
public class ConfirmDisburse4DistributionRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("DistributionTradeId")
    private String distributionTradeId;

    @Body
    @NameInMap("DistributorId")
    private String distributorId;

    @Body
    @NameInMap("MainDistributionOrderId")
    private String mainDistributionOrderId;

    @Body
    @NameInMap("TenantId")
    private String tenantId;

    private ConfirmDisburse4DistributionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.distributionTradeId = builder.distributionTradeId;
        this.distributorId = builder.distributorId;
        this.mainDistributionOrderId = builder.mainDistributionOrderId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfirmDisburse4DistributionRequest create() {
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
     * @return distributionTradeId
     */
    public String getDistributionTradeId() {
        return this.distributionTradeId;
    }

    /**
     * @return distributorId
     */
    public String getDistributorId() {
        return this.distributorId;
    }

    /**
     * @return mainDistributionOrderId
     */
    public String getMainDistributionOrderId() {
        return this.mainDistributionOrderId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<ConfirmDisburse4DistributionRequest, Builder> {
        private String regionId; 
        private String distributionTradeId; 
        private String distributorId; 
        private String mainDistributionOrderId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ConfirmDisburse4DistributionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.distributionTradeId = request.distributionTradeId;
            this.distributorId = request.distributorId;
            this.mainDistributionOrderId = request.mainDistributionOrderId;
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
         * DistributionTradeId.
         */
        public Builder distributionTradeId(String distributionTradeId) {
            this.putBodyParameter("DistributionTradeId", distributionTradeId);
            this.distributionTradeId = distributionTradeId;
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
         * MainDistributionOrderId.
         */
        public Builder mainDistributionOrderId(String mainDistributionOrderId) {
            this.putBodyParameter("MainDistributionOrderId", mainDistributionOrderId);
            this.mainDistributionOrderId = mainDistributionOrderId;
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
        public ConfirmDisburse4DistributionRequest build() {
            return new ConfirmDisburse4DistributionRequest(this);
        } 

    } 

}
