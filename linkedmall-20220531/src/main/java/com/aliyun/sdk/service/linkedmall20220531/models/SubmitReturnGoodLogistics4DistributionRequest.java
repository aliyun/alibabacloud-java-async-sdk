// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20220531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitReturnGoodLogistics4DistributionRequest} extends {@link RequestModel}
 *
 * <p>SubmitReturnGoodLogistics4DistributionRequest</p>
 */
public class SubmitReturnGoodLogistics4DistributionRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("CpCode")
    private String cpCode;

    @Body
    @NameInMap("DisputeId")
    private Long disputeId;

    @Body
    @NameInMap("DistributorId")
    private String distributorId;

    @Body
    @NameInMap("LogisticsNo")
    private String logisticsNo;

    @Body
    @NameInMap("SubDistributionOrderId")
    private String subDistributionOrderId;

    @Body
    @NameInMap("TenantId")
    private String tenantId;

    private SubmitReturnGoodLogistics4DistributionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.cpCode = builder.cpCode;
        this.disputeId = builder.disputeId;
        this.distributorId = builder.distributorId;
        this.logisticsNo = builder.logisticsNo;
        this.subDistributionOrderId = builder.subDistributionOrderId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitReturnGoodLogistics4DistributionRequest create() {
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
     * @return cpCode
     */
    public String getCpCode() {
        return this.cpCode;
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
     * @return logisticsNo
     */
    public String getLogisticsNo() {
        return this.logisticsNo;
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

    public static final class Builder extends Request.Builder<SubmitReturnGoodLogistics4DistributionRequest, Builder> {
        private String regionId; 
        private String cpCode; 
        private Long disputeId; 
        private String distributorId; 
        private String logisticsNo; 
        private String subDistributionOrderId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitReturnGoodLogistics4DistributionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.cpCode = request.cpCode;
            this.disputeId = request.disputeId;
            this.distributorId = request.distributorId;
            this.logisticsNo = request.logisticsNo;
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
         * CpCode.
         */
        public Builder cpCode(String cpCode) {
            this.putBodyParameter("CpCode", cpCode);
            this.cpCode = cpCode;
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
         * LogisticsNo.
         */
        public Builder logisticsNo(String logisticsNo) {
            this.putBodyParameter("LogisticsNo", logisticsNo);
            this.logisticsNo = logisticsNo;
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
        public SubmitReturnGoodLogistics4DistributionRequest build() {
            return new SubmitReturnGoodLogistics4DistributionRequest(this);
        } 

    } 

}
