// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20190801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserLogRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserLogRequest</p>
 */
public class DescribeUserLogRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EslBarCode")
    private String eslBarCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FromDate")
    private String fromDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ItemBarCode")
    private String itemBarCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ItemId")
    private Long itemId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ItemTitle")
    private String itemTitle;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OperateStatus")
    private String operateStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OperateType")
    private String operateType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OperateUserId")
    private Long operateUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Reverse")
    private Boolean reverse;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StoreId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ToDate")
    private String toDate;

    private DescribeUserLogRequest(Builder builder) {
        super(builder);
        this.eslBarCode = builder.eslBarCode;
        this.fromDate = builder.fromDate;
        this.itemBarCode = builder.itemBarCode;
        this.itemId = builder.itemId;
        this.itemTitle = builder.itemTitle;
        this.operateStatus = builder.operateStatus;
        this.operateType = builder.operateType;
        this.operateUserId = builder.operateUserId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.reverse = builder.reverse;
        this.storeId = builder.storeId;
        this.toDate = builder.toDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserLogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eslBarCode
     */
    public String getEslBarCode() {
        return this.eslBarCode;
    }

    /**
     * @return fromDate
     */
    public String getFromDate() {
        return this.fromDate;
    }

    /**
     * @return itemBarCode
     */
    public String getItemBarCode() {
        return this.itemBarCode;
    }

    /**
     * @return itemId
     */
    public Long getItemId() {
        return this.itemId;
    }

    /**
     * @return itemTitle
     */
    public String getItemTitle() {
        return this.itemTitle;
    }

    /**
     * @return operateStatus
     */
    public String getOperateStatus() {
        return this.operateStatus;
    }

    /**
     * @return operateType
     */
    public String getOperateType() {
        return this.operateType;
    }

    /**
     * @return operateUserId
     */
    public Long getOperateUserId() {
        return this.operateUserId;
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
     * @return reverse
     */
    public Boolean getReverse() {
        return this.reverse;
    }

    /**
     * @return storeId
     */
    public String getStoreId() {
        return this.storeId;
    }

    /**
     * @return toDate
     */
    public String getToDate() {
        return this.toDate;
    }

    public static final class Builder extends Request.Builder<DescribeUserLogRequest, Builder> {
        private String eslBarCode; 
        private String fromDate; 
        private String itemBarCode; 
        private Long itemId; 
        private String itemTitle; 
        private String operateStatus; 
        private String operateType; 
        private Long operateUserId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Boolean reverse; 
        private String storeId; 
        private String toDate; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUserLogRequest request) {
            super(request);
            this.eslBarCode = request.eslBarCode;
            this.fromDate = request.fromDate;
            this.itemBarCode = request.itemBarCode;
            this.itemId = request.itemId;
            this.itemTitle = request.itemTitle;
            this.operateStatus = request.operateStatus;
            this.operateType = request.operateType;
            this.operateUserId = request.operateUserId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.reverse = request.reverse;
            this.storeId = request.storeId;
            this.toDate = request.toDate;
        } 

        /**
         * EslBarCode.
         */
        public Builder eslBarCode(String eslBarCode) {
            this.putBodyParameter("EslBarCode", eslBarCode);
            this.eslBarCode = eslBarCode;
            return this;
        }

        /**
         * FromDate.
         */
        public Builder fromDate(String fromDate) {
            this.putBodyParameter("FromDate", fromDate);
            this.fromDate = fromDate;
            return this;
        }

        /**
         * ItemBarCode.
         */
        public Builder itemBarCode(String itemBarCode) {
            this.putBodyParameter("ItemBarCode", itemBarCode);
            this.itemBarCode = itemBarCode;
            return this;
        }

        /**
         * ItemId.
         */
        public Builder itemId(Long itemId) {
            this.putBodyParameter("ItemId", itemId);
            this.itemId = itemId;
            return this;
        }

        /**
         * ItemTitle.
         */
        public Builder itemTitle(String itemTitle) {
            this.putBodyParameter("ItemTitle", itemTitle);
            this.itemTitle = itemTitle;
            return this;
        }

        /**
         * OperateStatus.
         */
        public Builder operateStatus(String operateStatus) {
            this.putBodyParameter("OperateStatus", operateStatus);
            this.operateStatus = operateStatus;
            return this;
        }

        /**
         * OperateType.
         */
        public Builder operateType(String operateType) {
            this.putBodyParameter("OperateType", operateType);
            this.operateType = operateType;
            return this;
        }

        /**
         * OperateUserId.
         */
        public Builder operateUserId(Long operateUserId) {
            this.putBodyParameter("OperateUserId", operateUserId);
            this.operateUserId = operateUserId;
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
         * Reverse.
         */
        public Builder reverse(Boolean reverse) {
            this.putBodyParameter("Reverse", reverse);
            this.reverse = reverse;
            return this;
        }

        /**
         * StoreId.
         */
        public Builder storeId(String storeId) {
            this.putBodyParameter("StoreId", storeId);
            this.storeId = storeId;
            return this;
        }

        /**
         * ToDate.
         */
        public Builder toDate(String toDate) {
            this.putBodyParameter("ToDate", toDate);
            this.toDate = toDate;
            return this;
        }

        @Override
        public DescribeUserLogRequest build() {
            return new DescribeUserLogRequest(this);
        } 

    } 

}
