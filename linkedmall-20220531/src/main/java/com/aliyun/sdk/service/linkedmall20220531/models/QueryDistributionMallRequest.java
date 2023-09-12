// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20220531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDistributionMallRequest} extends {@link RequestModel}
 *
 * <p>QueryDistributionMallRequest</p>
 */
public class QueryDistributionMallRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("DistributionMallId")
    private String distributionMallId;

    @Body
    @NameInMap("TenantId")
    private String tenantId;

    private QueryDistributionMallRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.distributionMallId = builder.distributionMallId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDistributionMallRequest create() {
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
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<QueryDistributionMallRequest, Builder> {
        private String regionId; 
        private String distributionMallId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(QueryDistributionMallRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.distributionMallId = request.distributionMallId;
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
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public QueryDistributionMallRequest build() {
            return new QueryDistributionMallRequest(this);
        } 

    } 

}
