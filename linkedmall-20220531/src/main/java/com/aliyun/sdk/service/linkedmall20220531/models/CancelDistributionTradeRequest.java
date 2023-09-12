// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20220531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelDistributionTradeRequest} extends {@link RequestModel}
 *
 * <p>CancelDistributionTradeRequest</p>
 */
public class CancelDistributionTradeRequest extends Request {
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
    @NameInMap("TenantId")
    private String tenantId;

    private CancelDistributionTradeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.distributionTradeId = builder.distributionTradeId;
        this.distributorId = builder.distributorId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelDistributionTradeRequest create() {
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
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<CancelDistributionTradeRequest, Builder> {
        private String regionId; 
        private String distributionTradeId; 
        private String distributorId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(CancelDistributionTradeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.distributionTradeId = request.distributionTradeId;
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
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public CancelDistributionTradeRequest build() {
            return new CancelDistributionTradeRequest(this);
        } 

    } 

}
