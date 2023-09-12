// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20220531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryLogistics4DistributionRequest} extends {@link RequestModel}
 *
 * <p>QueryLogistics4DistributionRequest</p>
 */
public class QueryLogistics4DistributionRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("DistributorId")
    private String distributorId;

    @Body
    @NameInMap("MainDistributionOrderId")
    private String mainDistributionOrderId;

    @Body
    @NameInMap("RequestId")
    private String requestId;

    @Body
    @NameInMap("TenantId")
    private String tenantId;

    private QueryLogistics4DistributionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.distributorId = builder.distributorId;
        this.mainDistributionOrderId = builder.mainDistributionOrderId;
        this.requestId = builder.requestId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryLogistics4DistributionRequest create() {
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
     * @return mainDistributionOrderId
     */
    public String getMainDistributionOrderId() {
        return this.mainDistributionOrderId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<QueryLogistics4DistributionRequest, Builder> {
        private String regionId; 
        private String distributorId; 
        private String mainDistributionOrderId; 
        private String requestId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(QueryLogistics4DistributionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.distributorId = request.distributorId;
            this.mainDistributionOrderId = request.mainDistributionOrderId;
            this.requestId = request.requestId;
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
         * MainDistributionOrderId.
         */
        public Builder mainDistributionOrderId(String mainDistributionOrderId) {
            this.putBodyParameter("MainDistributionOrderId", mainDistributionOrderId);
            this.mainDistributionOrderId = mainDistributionOrderId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.putBodyParameter("RequestId", requestId);
            this.requestId = requestId;
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
        public QueryLogistics4DistributionRequest build() {
            return new QueryLogistics4DistributionRequest(this);
        } 

    } 

}
