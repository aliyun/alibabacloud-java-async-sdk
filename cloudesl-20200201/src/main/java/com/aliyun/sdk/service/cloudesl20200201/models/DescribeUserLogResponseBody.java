// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserLogResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserLogResponseBody</p>
 */
public class DescribeUserLogResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("DynamicCode")
    private String dynamicCode;

    @NameInMap("DynamicMessage")
    private String dynamicMessage;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("UserLogs")
    private java.util.List < UserLogs> userLogs;

    private DescribeUserLogResponseBody(Builder builder) {
        this.code = builder.code;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
        this.userLogs = builder.userLogs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserLogResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return userLogs
     */
    public java.util.List < UserLogs> getUserLogs() {
        return this.userLogs;
    }

    public static final class Builder {
        private String code; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private String errorCode; 
        private String errorMessage; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 
        private java.util.List < UserLogs> userLogs; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * DynamicCode.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * DynamicMessage.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * UserLogs.
         */
        public Builder userLogs(java.util.List < UserLogs> userLogs) {
            this.userLogs = userLogs;
            return this;
        }

        public DescribeUserLogResponseBody build() {
            return new DescribeUserLogResponseBody(this);
        } 

    } 

    public static class UserLogs extends TeaModel {
        @NameInMap("ActionPrice")
        private String actionPrice;

        @NameInMap("BePromotion")
        private Boolean bePromotion;

        @NameInMap("EslBarCode")
        private String eslBarCode;

        @NameInMap("EslSignal")
        private Integer eslSignal;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("I18nResultKey")
        private String i18nResultKey;

        @NameInMap("ItemBarCode")
        private String itemBarCode;

        @NameInMap("ItemId")
        private String itemId;

        @NameInMap("ItemShortTitle")
        private String itemShortTitle;

        @NameInMap("LogId")
        private String logId;

        @NameInMap("OperationResponseTime")
        private String operationResponseTime;

        @NameInMap("OperationSendTime")
        private String operationSendTime;

        @NameInMap("OperationStatus")
        private String operationStatus;

        @NameInMap("OperationType")
        private String operationType;

        @NameInMap("PriceUnit")
        private String priceUnit;

        @NameInMap("ResultCode")
        private String resultCode;

        @NameInMap("SpendTime")
        private String spendTime;

        @NameInMap("StoreId")
        private String storeId;

        @NameInMap("UserId")
        private String userId;

        private UserLogs(Builder builder) {
            this.actionPrice = builder.actionPrice;
            this.bePromotion = builder.bePromotion;
            this.eslBarCode = builder.eslBarCode;
            this.eslSignal = builder.eslSignal;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.i18nResultKey = builder.i18nResultKey;
            this.itemBarCode = builder.itemBarCode;
            this.itemId = builder.itemId;
            this.itemShortTitle = builder.itemShortTitle;
            this.logId = builder.logId;
            this.operationResponseTime = builder.operationResponseTime;
            this.operationSendTime = builder.operationSendTime;
            this.operationStatus = builder.operationStatus;
            this.operationType = builder.operationType;
            this.priceUnit = builder.priceUnit;
            this.resultCode = builder.resultCode;
            this.spendTime = builder.spendTime;
            this.storeId = builder.storeId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserLogs create() {
            return builder().build();
        }

        /**
         * @return actionPrice
         */
        public String getActionPrice() {
            return this.actionPrice;
        }

        /**
         * @return bePromotion
         */
        public Boolean getBePromotion() {
            return this.bePromotion;
        }

        /**
         * @return eslBarCode
         */
        public String getEslBarCode() {
            return this.eslBarCode;
        }

        /**
         * @return eslSignal
         */
        public Integer getEslSignal() {
            return this.eslSignal;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return i18nResultKey
         */
        public String getI18nResultKey() {
            return this.i18nResultKey;
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
        public String getItemId() {
            return this.itemId;
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
         * @return operationResponseTime
         */
        public String getOperationResponseTime() {
            return this.operationResponseTime;
        }

        /**
         * @return operationSendTime
         */
        public String getOperationSendTime() {
            return this.operationSendTime;
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
         * @return priceUnit
         */
        public String getPriceUnit() {
            return this.priceUnit;
        }

        /**
         * @return resultCode
         */
        public String getResultCode() {
            return this.resultCode;
        }

        /**
         * @return spendTime
         */
        public String getSpendTime() {
            return this.spendTime;
        }

        /**
         * @return storeId
         */
        public String getStoreId() {
            return this.storeId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String actionPrice; 
            private Boolean bePromotion; 
            private String eslBarCode; 
            private Integer eslSignal; 
            private String gmtCreate; 
            private String gmtModified; 
            private String i18nResultKey; 
            private String itemBarCode; 
            private String itemId; 
            private String itemShortTitle; 
            private String logId; 
            private String operationResponseTime; 
            private String operationSendTime; 
            private String operationStatus; 
            private String operationType; 
            private String priceUnit; 
            private String resultCode; 
            private String spendTime; 
            private String storeId; 
            private String userId; 

            /**
             * ActionPrice.
             */
            public Builder actionPrice(String actionPrice) {
                this.actionPrice = actionPrice;
                return this;
            }

            /**
             * BePromotion.
             */
            public Builder bePromotion(Boolean bePromotion) {
                this.bePromotion = bePromotion;
                return this;
            }

            /**
             * EslBarCode.
             */
            public Builder eslBarCode(String eslBarCode) {
                this.eslBarCode = eslBarCode;
                return this;
            }

            /**
             * EslSignal.
             */
            public Builder eslSignal(Integer eslSignal) {
                this.eslSignal = eslSignal;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * I18nResultKey.
             */
            public Builder i18nResultKey(String i18nResultKey) {
                this.i18nResultKey = i18nResultKey;
                return this;
            }

            /**
             * ItemBarCode.
             */
            public Builder itemBarCode(String itemBarCode) {
                this.itemBarCode = itemBarCode;
                return this;
            }

            /**
             * ItemId.
             */
            public Builder itemId(String itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * ItemShortTitle.
             */
            public Builder itemShortTitle(String itemShortTitle) {
                this.itemShortTitle = itemShortTitle;
                return this;
            }

            /**
             * LogId.
             */
            public Builder logId(String logId) {
                this.logId = logId;
                return this;
            }

            /**
             * OperationResponseTime.
             */
            public Builder operationResponseTime(String operationResponseTime) {
                this.operationResponseTime = operationResponseTime;
                return this;
            }

            /**
             * OperationSendTime.
             */
            public Builder operationSendTime(String operationSendTime) {
                this.operationSendTime = operationSendTime;
                return this;
            }

            /**
             * OperationStatus.
             */
            public Builder operationStatus(String operationStatus) {
                this.operationStatus = operationStatus;
                return this;
            }

            /**
             * OperationType.
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * PriceUnit.
             */
            public Builder priceUnit(String priceUnit) {
                this.priceUnit = priceUnit;
                return this;
            }

            /**
             * ResultCode.
             */
            public Builder resultCode(String resultCode) {
                this.resultCode = resultCode;
                return this;
            }

            /**
             * SpendTime.
             */
            public Builder spendTime(String spendTime) {
                this.spendTime = spendTime;
                return this;
            }

            /**
             * StoreId.
             */
            public Builder storeId(String storeId) {
                this.storeId = storeId;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public UserLogs build() {
                return new UserLogs(this);
            } 

        } 

    }
}
