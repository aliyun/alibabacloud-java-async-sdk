// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20220531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDistributionMallRequest} extends {@link RequestModel}
 *
 * <p>ListDistributionMallRequest</p>
 */
public class ListDistributionMallRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("ChannelSupplierId")
    private String channelSupplierId;

    @Body
    @NameInMap("DistributionMallId")
    private String distributionMallId;

    @Body
    @NameInMap("DistributionMallName")
    private String distributionMallName;

    @Body
    @NameInMap("DistributorId")
    private String distributorId;

    @Body
    @NameInMap("EndDate")
    private String endDate;

    @Body
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("StartDate")
    private String startDate;

    @Body
    @NameInMap("TenantId")
    private String tenantId;

    private ListDistributionMallRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.channelSupplierId = builder.channelSupplierId;
        this.distributionMallId = builder.distributionMallId;
        this.distributionMallName = builder.distributionMallName;
        this.distributorId = builder.distributorId;
        this.endDate = builder.endDate;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.startDate = builder.startDate;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDistributionMallRequest create() {
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
     * @return channelSupplierId
     */
    public String getChannelSupplierId() {
        return this.channelSupplierId;
    }

    /**
     * @return distributionMallId
     */
    public String getDistributionMallId() {
        return this.distributionMallId;
    }

    /**
     * @return distributionMallName
     */
    public String getDistributionMallName() {
        return this.distributionMallName;
    }

    /**
     * @return distributorId
     */
    public String getDistributorId() {
        return this.distributorId;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
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
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<ListDistributionMallRequest, Builder> {
        private String regionId; 
        private String channelSupplierId; 
        private String distributionMallId; 
        private String distributionMallName; 
        private String distributorId; 
        private String endDate; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String startDate; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListDistributionMallRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.channelSupplierId = request.channelSupplierId;
            this.distributionMallId = request.distributionMallId;
            this.distributionMallName = request.distributionMallName;
            this.distributorId = request.distributorId;
            this.endDate = request.endDate;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.startDate = request.startDate;
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
         * ChannelSupplierId.
         */
        public Builder channelSupplierId(String channelSupplierId) {
            this.putBodyParameter("ChannelSupplierId", channelSupplierId);
            this.channelSupplierId = channelSupplierId;
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
         * DistributionMallName.
         */
        public Builder distributionMallName(String distributionMallName) {
            this.putBodyParameter("DistributionMallName", distributionMallName);
            this.distributionMallName = distributionMallName;
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
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.putBodyParameter("EndDate", endDate);
            this.endDate = endDate;
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
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putBodyParameter("StartDate", startDate);
            this.startDate = startDate;
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
        public ListDistributionMallRequest build() {
            return new ListDistributionMallRequest(this);
        } 

    } 

}
