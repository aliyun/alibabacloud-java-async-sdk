// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryChannelItemBillDownloadUrlRequest} extends {@link RequestModel}
 *
 * <p>QueryChannelItemBillDownloadUrlRequest</p>
 */
public class QueryChannelItemBillDownloadUrlRequest extends Request {
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
    @NameInMap("BizId")
    private String bizId;

    @Body
    @NameInMap("BizName")
    private String bizName;

    @Body
    @NameInMap("LmShopId")
    private Long lmShopId;

    @Body
    @NameInMap("LmShopName")
    private String lmShopName;

    @Body
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("TenantId")
    private String tenantId;

    private QueryChannelItemBillDownloadUrlRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.billId = builder.billId;
        this.billPeriod = builder.billPeriod;
        this.billStatus = builder.billStatus;
        this.bizId = builder.bizId;
        this.bizName = builder.bizName;
        this.lmShopId = builder.lmShopId;
        this.lmShopName = builder.lmShopName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryChannelItemBillDownloadUrlRequest create() {
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
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return bizName
     */
    public String getBizName() {
        return this.bizName;
    }

    /**
     * @return lmShopId
     */
    public Long getLmShopId() {
        return this.lmShopId;
    }

    /**
     * @return lmShopName
     */
    public String getLmShopName() {
        return this.lmShopName;
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

    public static final class Builder extends Request.Builder<QueryChannelItemBillDownloadUrlRequest, Builder> {
        private String regionId; 
        private String billId; 
        private String billPeriod; 
        private String billStatus; 
        private String bizId; 
        private String bizName; 
        private Long lmShopId; 
        private String lmShopName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(QueryChannelItemBillDownloadUrlRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.billId = request.billId;
            this.billPeriod = request.billPeriod;
            this.billStatus = request.billStatus;
            this.bizId = request.bizId;
            this.bizName = request.bizName;
            this.lmShopId = request.lmShopId;
            this.lmShopName = request.lmShopName;
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
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putBodyParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * BizName.
         */
        public Builder bizName(String bizName) {
            this.putBodyParameter("BizName", bizName);
            this.bizName = bizName;
            return this;
        }

        /**
         * LmShopId.
         */
        public Builder lmShopId(Long lmShopId) {
            this.putBodyParameter("LmShopId", lmShopId);
            this.lmShopId = lmShopId;
            return this;
        }

        /**
         * LmShopName.
         */
        public Builder lmShopName(String lmShopName) {
            this.putBodyParameter("LmShopName", lmShopName);
            this.lmShopName = lmShopName;
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
        public QueryChannelItemBillDownloadUrlRequest build() {
            return new QueryChannelItemBillDownloadUrlRequest(this);
        } 

    } 

}
