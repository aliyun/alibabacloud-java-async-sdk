// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserLogRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserLogRequest</p>
 */
public class DescribeUserLogRequest extends Request {
    @Body
    @NameInMap("EslBarCode")
    private String eslBarCode;

    @Body
    @NameInMap("ExtraParams")
    private String extraParams;

    @Body
    @NameInMap("FromDate")
    private String fromDate;

    @Body
    @NameInMap("ItemBarCode")
    private String itemBarCode;

    @Body
    @NameInMap("ItemShortTitle")
    private String itemShortTitle;

    @Body
    @NameInMap("LogId")
    private String logId;

    @Body
    @NameInMap("OperationStatus")
    private String operationStatus;

    @Body
    @NameInMap("OperationType")
    private String operationType;

    @Body
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("StoreId")
    @Validation(required = true)
    private String storeId;

    @Body
    @NameInMap("ToDate")
    private String toDate;

    @Body
    @NameInMap("UserId")
    private String userId;

    private DescribeUserLogRequest(Builder builder) {
        super(builder);
        this.eslBarCode = builder.eslBarCode;
        this.extraParams = builder.extraParams;
        this.fromDate = builder.fromDate;
        this.itemBarCode = builder.itemBarCode;
        this.itemShortTitle = builder.itemShortTitle;
        this.logId = builder.logId;
        this.operationStatus = builder.operationStatus;
        this.operationType = builder.operationType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.storeId = builder.storeId;
        this.toDate = builder.toDate;
        this.userId = builder.userId;
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
     * @return extraParams
     */
    public String getExtraParams() {
        return this.extraParams;
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
     * @return itemShortTitle
     */
    public String getItemShortTitle() {
        return this.itemShortTitle;
    }

    /**
     * @return logId
     */
    public String getLogId() {
        return this.logId;
    }

    /**
     * @return operationStatus
     */
    public String getOperationStatus() {
        return this.operationStatus;
    }

    /**
     * @return operationType
     */
    public String getOperationType() {
        return this.operationType;
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

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<DescribeUserLogRequest, Builder> {
        private String eslBarCode; 
        private String extraParams; 
        private String fromDate; 
        private String itemBarCode; 
        private String itemShortTitle; 
        private String logId; 
        private String operationStatus; 
        private String operationType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String storeId; 
        private String toDate; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUserLogRequest request) {
            super(request);
            this.eslBarCode = request.eslBarCode;
            this.extraParams = request.extraParams;
            this.fromDate = request.fromDate;
            this.itemBarCode = request.itemBarCode;
            this.itemShortTitle = request.itemShortTitle;
            this.logId = request.logId;
            this.operationStatus = request.operationStatus;
            this.operationType = request.operationType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.storeId = request.storeId;
            this.toDate = request.toDate;
            this.userId = request.userId;
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
         * ExtraParams.
         */
        public Builder extraParams(String extraParams) {
            this.putBodyParameter("ExtraParams", extraParams);
            this.extraParams = extraParams;
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
         * ItemShortTitle.
         */
        public Builder itemShortTitle(String itemShortTitle) {
            this.putBodyParameter("ItemShortTitle", itemShortTitle);
            this.itemShortTitle = itemShortTitle;
            return this;
        }

        /**
         * LogId.
         */
        public Builder logId(String logId) {
            this.putBodyParameter("LogId", logId);
            this.logId = logId;
            return this;
        }

        /**
         * OperationStatus.
         */
        public Builder operationStatus(String operationStatus) {
            this.putBodyParameter("OperationStatus", operationStatus);
            this.operationStatus = operationStatus;
            return this;
        }

        /**
         * OperationType.
         */
        public Builder operationType(String operationType) {
            this.putBodyParameter("OperationType", operationType);
            this.operationType = operationType;
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

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public DescribeUserLogRequest build() {
            return new DescribeUserLogRequest(this);
        } 

    } 

}
