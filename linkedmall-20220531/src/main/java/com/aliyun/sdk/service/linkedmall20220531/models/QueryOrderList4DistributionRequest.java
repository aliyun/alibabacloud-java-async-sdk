// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20220531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryOrderList4DistributionRequest} extends {@link RequestModel}
 *
 * <p>QueryOrderList4DistributionRequest</p>
 */
public class QueryOrderList4DistributionRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("DistributorId")
    private String distributorId;

    @Body
    @NameInMap("FilterOption")
    private String filterOption;

    @Body
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("TenantId")
    private String tenantId;

    private QueryOrderList4DistributionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.distributorId = builder.distributorId;
        this.filterOption = builder.filterOption;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryOrderList4DistributionRequest create() {
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
     * @return filterOption
     */
    public String getFilterOption() {
        return this.filterOption;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<QueryOrderList4DistributionRequest, Builder> {
        private String regionId; 
        private String distributorId; 
        private String filterOption; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(QueryOrderList4DistributionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.distributorId = request.distributorId;
            this.filterOption = request.filterOption;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
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
         * FilterOption.
         */
        public Builder filterOption(String filterOption) {
            this.putBodyParameter("FilterOption", filterOption);
            this.filterOption = filterOption;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
        public QueryOrderList4DistributionRequest build() {
            return new QueryOrderList4DistributionRequest(this);
        } 

    } 

}
