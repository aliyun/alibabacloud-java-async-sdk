// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20220531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryChildDivisionCodeByIdRequest} extends {@link RequestModel}
 *
 * <p>QueryChildDivisionCodeByIdRequest</p>
 */
public class QueryChildDivisionCodeByIdRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("DistributorId")
    private String distributorId;

    @Body
    @NameInMap("DivisionCode")
    private String divisionCode;

    @Body
    @NameInMap("TenantId")
    private String tenantId;

    private QueryChildDivisionCodeByIdRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.distributorId = builder.distributorId;
        this.divisionCode = builder.divisionCode;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryChildDivisionCodeByIdRequest create() {
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
     * @return divisionCode
     */
    public String getDivisionCode() {
        return this.divisionCode;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<QueryChildDivisionCodeByIdRequest, Builder> {
        private String regionId; 
        private String distributorId; 
        private String divisionCode; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(QueryChildDivisionCodeByIdRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.distributorId = request.distributorId;
            this.divisionCode = request.divisionCode;
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
         * DivisionCode.
         */
        public Builder divisionCode(String divisionCode) {
            this.putBodyParameter("DivisionCode", divisionCode);
            this.divisionCode = divisionCode;
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
        public QueryChildDivisionCodeByIdRequest build() {
            return new QueryChildDivisionCodeByIdRequest(this);
        } 

    } 

}
