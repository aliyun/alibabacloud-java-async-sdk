// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20220531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRefundApplicationDetail4DistributionRequest} extends {@link RequestModel}
 *
 * <p>QueryRefundApplicationDetail4DistributionRequest</p>
 */
public class QueryRefundApplicationDetail4DistributionRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("DistributorId")
    private String distributorId;

    @Body
    @NameInMap("SubDistributionOrderId")
    private String subDistributionOrderId;

    @Body
    @NameInMap("TenantId")
    private String tenantId;

    private QueryRefundApplicationDetail4DistributionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.distributorId = builder.distributorId;
        this.subDistributionOrderId = builder.subDistributionOrderId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRefundApplicationDetail4DistributionRequest create() {
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

    public static final class Builder extends Request.Builder<QueryRefundApplicationDetail4DistributionRequest, Builder> {
        private String regionId; 
        private String distributorId; 
        private String subDistributionOrderId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(QueryRefundApplicationDetail4DistributionRequest request) {
            super(request);
            this.regionId = request.regionId;
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
        public QueryRefundApplicationDetail4DistributionRequest build() {
            return new QueryRefundApplicationDetail4DistributionRequest(this);
        } 

    } 

}
