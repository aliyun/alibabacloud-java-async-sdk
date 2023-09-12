// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20220531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryItemDetailWithDivisionRequest} extends {@link RequestModel}
 *
 * <p>QueryItemDetailWithDivisionRequest</p>
 */
public class QueryItemDetailWithDivisionRequest extends Request {
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
    @NameInMap("DivisionCode")
    private String divisionCode;

    @Body
    @NameInMap("LmItemId")
    private String lmItemId;

    @Body
    @NameInMap("TenantId")
    private String tenantId;

    private QueryItemDetailWithDivisionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.distributionMallId = builder.distributionMallId;
        this.distributorId = builder.distributorId;
        this.divisionCode = builder.divisionCode;
        this.lmItemId = builder.lmItemId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryItemDetailWithDivisionRequest create() {
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
     * @return divisionCode
     */
    public String getDivisionCode() {
        return this.divisionCode;
    }

    /**
     * @return lmItemId
     */
    public String getLmItemId() {
        return this.lmItemId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<QueryItemDetailWithDivisionRequest, Builder> {
        private String regionId; 
        private String distributionMallId; 
        private String distributorId; 
        private String divisionCode; 
        private String lmItemId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(QueryItemDetailWithDivisionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.distributionMallId = request.distributionMallId;
            this.distributorId = request.distributorId;
            this.divisionCode = request.divisionCode;
            this.lmItemId = request.lmItemId;
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
         * DivisionCode.
         */
        public Builder divisionCode(String divisionCode) {
            this.putBodyParameter("DivisionCode", divisionCode);
            this.divisionCode = divisionCode;
            return this;
        }

        /**
         * LmItemId.
         */
        public Builder lmItemId(String lmItemId) {
            this.putBodyParameter("LmItemId", lmItemId);
            this.lmItemId = lmItemId;
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
        public QueryItemDetailWithDivisionRequest build() {
            return new QueryItemDetailWithDivisionRequest(this);
        } 

    } 

}
