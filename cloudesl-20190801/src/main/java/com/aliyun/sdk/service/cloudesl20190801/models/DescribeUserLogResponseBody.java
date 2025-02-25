// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20190801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserLogResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserLogResponseBody</p>
 */
public class DescribeUserLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("UserLogs")
    private UserLogs userLogs;

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
    public UserLogs getUserLogs() {
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
        private UserLogs userLogs; 

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
        public Builder userLogs(UserLogs userLogs) {
            this.userLogs = userLogs;
            return this;
        }

        public DescribeUserLogResponseBody build() {
            return new DescribeUserLogResponseBody(this);
        } 

    } 

    public static class UserLogInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EslBarCode")
        private String eslBarCode;

        @com.aliyun.core.annotation.NameInMap("ItemActionPrice")
        private Integer itemActionPrice;

        @com.aliyun.core.annotation.NameInMap("ItemBarCode")
        private String itemBarCode;

        @com.aliyun.core.annotation.NameInMap("ItemId")
        private Long itemId;

        @com.aliyun.core.annotation.NameInMap("ItemTitle")
        private String itemTitle;

        @com.aliyun.core.annotation.NameInMap("Mac")
        private String mac;

        @com.aliyun.core.annotation.NameInMap("OperateStatus")
        private String operateStatus;

        @com.aliyun.core.annotation.NameInMap("OperateTime")
        private String operateTime;

        @com.aliyun.core.annotation.NameInMap("OperateType")
        private String operateType;

        @com.aliyun.core.annotation.NameInMap("OperateUserId")
        private Long operateUserId;

        @com.aliyun.core.annotation.NameInMap("ShelfCode")
        private String shelfCode;

        @com.aliyun.core.annotation.NameInMap("StoreId")
        private String storeId;

        private UserLogInfo(Builder builder) {
            this.eslBarCode = builder.eslBarCode;
            this.itemActionPrice = builder.itemActionPrice;
            this.itemBarCode = builder.itemBarCode;
            this.itemId = builder.itemId;
            this.itemTitle = builder.itemTitle;
            this.mac = builder.mac;
            this.operateStatus = builder.operateStatus;
            this.operateTime = builder.operateTime;
            this.operateType = builder.operateType;
            this.operateUserId = builder.operateUserId;
            this.shelfCode = builder.shelfCode;
            this.storeId = builder.storeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserLogInfo create() {
            return builder().build();
        }

        /**
         * @return eslBarCode
         */
        public String getEslBarCode() {
            return this.eslBarCode;
        }

        /**
         * @return itemActionPrice
         */
        public Integer getItemActionPrice() {
            return this.itemActionPrice;
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
         * @return mac
         */
        public String getMac() {
            return this.mac;
        }

        /**
         * @return operateStatus
         */
        public String getOperateStatus() {
            return this.operateStatus;
        }

        /**
         * @return operateTime
         */
        public String getOperateTime() {
            return this.operateTime;
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
         * @return shelfCode
         */
        public String getShelfCode() {
            return this.shelfCode;
        }

        /**
         * @return storeId
         */
        public String getStoreId() {
            return this.storeId;
        }

        public static final class Builder {
            private String eslBarCode; 
            private Integer itemActionPrice; 
            private String itemBarCode; 
            private Long itemId; 
            private String itemTitle; 
            private String mac; 
            private String operateStatus; 
            private String operateTime; 
            private String operateType; 
            private Long operateUserId; 
            private String shelfCode; 
            private String storeId; 

            /**
             * EslBarCode.
             */
            public Builder eslBarCode(String eslBarCode) {
                this.eslBarCode = eslBarCode;
                return this;
            }

            /**
             * ItemActionPrice.
             */
            public Builder itemActionPrice(Integer itemActionPrice) {
                this.itemActionPrice = itemActionPrice;
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
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * ItemTitle.
             */
            public Builder itemTitle(String itemTitle) {
                this.itemTitle = itemTitle;
                return this;
            }

            /**
             * Mac.
             */
            public Builder mac(String mac) {
                this.mac = mac;
                return this;
            }

            /**
             * OperateStatus.
             */
            public Builder operateStatus(String operateStatus) {
                this.operateStatus = operateStatus;
                return this;
            }

            /**
             * OperateTime.
             */
            public Builder operateTime(String operateTime) {
                this.operateTime = operateTime;
                return this;
            }

            /**
             * OperateType.
             */
            public Builder operateType(String operateType) {
                this.operateType = operateType;
                return this;
            }

            /**
             * OperateUserId.
             */
            public Builder operateUserId(Long operateUserId) {
                this.operateUserId = operateUserId;
                return this;
            }

            /**
             * ShelfCode.
             */
            public Builder shelfCode(String shelfCode) {
                this.shelfCode = shelfCode;
                return this;
            }

            /**
             * StoreId.
             */
            public Builder storeId(String storeId) {
                this.storeId = storeId;
                return this;
            }

            public UserLogInfo build() {
                return new UserLogInfo(this);
            } 

        } 

    }
    public static class UserLogs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserLogInfo")
        private java.util.List < UserLogInfo> userLogInfo;

        private UserLogs(Builder builder) {
            this.userLogInfo = builder.userLogInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserLogs create() {
            return builder().build();
        }

        /**
         * @return userLogInfo
         */
        public java.util.List < UserLogInfo> getUserLogInfo() {
            return this.userLogInfo;
        }

        public static final class Builder {
            private java.util.List < UserLogInfo> userLogInfo; 

            /**
             * UserLogInfo.
             */
            public Builder userLogInfo(java.util.List < UserLogInfo> userLogInfo) {
                this.userLogInfo = userLogInfo;
                return this;
            }

            public UserLogs build() {
                return new UserLogs(this);
            } 

        } 

    }
}
