// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20220531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDistributionBillDetailRequest} extends {@link RequestModel}
 *
 * <p>QueryDistributionBillDetailRequest</p>
 */
public class QueryDistributionBillDetailRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("BillId")
    private String billId;

    @Body
    @NameInMap("BillPeriod")
    private String billPeriod;

    @Body
    @NameInMap("BillStatus")
    private String billStatus;

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
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("TenantId")
    private String tenantId;

    private QueryDistributionBillDetailRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.billId = builder.billId;
        this.billPeriod = builder.billPeriod;
        this.billStatus = builder.billStatus;
        this.distributionMallId = builder.distributionMallId;
        this.distributionMallName = builder.distributionMallName;
        this.distributorId = builder.distributorId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDistributionBillDetailRequest create() {
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
     * @return billId
     */
    public String getBillId() {
        return this.billId;
    }

    /**
     * @return billPeriod
     */
    public String getBillPeriod() {
        return this.billPeriod;
    }

    /**
     * @return billStatus
     */
    public String getBillStatus() {
        return this.billStatus;
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

    public static final class Builder extends Request.Builder<QueryDistributionBillDetailRequest, Builder> {
        private String regionId; 
        private String billId; 
        private String billPeriod; 
        private String billStatus; 
        private String distributionMallId; 
        private String distributionMallName; 
        private String distributorId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(QueryDistributionBillDetailRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.billId = request.billId;
            this.billPeriod = request.billPeriod;
            this.billStatus = request.billStatus;
            this.distributionMallId = request.distributionMallId;
            this.distributionMallName = request.distributionMallName;
            this.distributorId = request.distributorId;
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
         * BillId.
         */
        public Builder billId(String billId) {
            this.putBodyParameter("BillId", billId);
            this.billId = billId;
            return this;
        }

        /**
         * BillPeriod.
         */
        public Builder billPeriod(String billPeriod) {
            this.putBodyParameter("BillPeriod", billPeriod);
            this.billPeriod = billPeriod;
            return this;
        }

        /**
         * BillStatus.
         */
        public Builder billStatus(String billStatus) {
            this.putBodyParameter("BillStatus", billStatus);
            this.billStatus = billStatus;
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
        public QueryDistributionBillDetailRequest build() {
            return new QueryDistributionBillDetailRequest(this);
        } 

    } 

}
