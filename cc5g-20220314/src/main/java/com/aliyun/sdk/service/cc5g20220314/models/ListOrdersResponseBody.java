// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOrdersResponseBody} extends {@link TeaModel}
 *
 * <p>ListOrdersResponseBody</p>
 */
public class ListOrdersResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private String maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("Orders")
    private java.util.List < Orders> orders;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private String totalCount;

    private ListOrdersResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.orders = builder.orders;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOrdersResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public String getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return orders
     */
    public java.util.List < Orders> getOrders() {
        return this.orders;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String maxResults; 
        private String nextToken; 
        private java.util.List < Orders> orders; 
        private String requestId; 
        private String totalCount; 

        /**
         * MaxResults.
         */
        public Builder maxResults(String maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * 数组，返回示例目录。
         */
        public Builder orders(java.util.List < Orders> orders) {
            this.orders = orders;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListOrdersResponseBody build() {
            return new ListOrdersResponseBody(this);
        } 

    } 

    public static class Orders extends TeaModel {
        @NameInMap("Action")
        private String action;

        @NameInMap("CardCount")
        private String cardCount;

        @NameInMap("CardNetType")
        private String cardNetType;

        @NameInMap("CardType")
        private String cardType;

        @NameInMap("ContactName")
        private String contactName;

        @NameInMap("ContactPhone")
        private String contactPhone;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("LogisticsId")
        private String logisticsId;

        @NameInMap("LogisticsStatus")
        private String logisticsStatus;

        @NameInMap("LogisticsType")
        private String logisticsType;

        @NameInMap("LogisticsUpdateTime")
        private String logisticsUpdateTime;

        @NameInMap("OrderId")
        private String orderId;

        @NameInMap("PayTime")
        private String payTime;

        @NameInMap("PostAddress")
        private String postAddress;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Status")
        private String status;

        private Orders(Builder builder) {
            this.action = builder.action;
            this.cardCount = builder.cardCount;
            this.cardNetType = builder.cardNetType;
            this.cardType = builder.cardType;
            this.contactName = builder.contactName;
            this.contactPhone = builder.contactPhone;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.logisticsId = builder.logisticsId;
            this.logisticsStatus = builder.logisticsStatus;
            this.logisticsType = builder.logisticsType;
            this.logisticsUpdateTime = builder.logisticsUpdateTime;
            this.orderId = builder.orderId;
            this.payTime = builder.payTime;
            this.postAddress = builder.postAddress;
            this.regionId = builder.regionId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Orders create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return cardCount
         */
        public String getCardCount() {
            return this.cardCount;
        }

        /**
         * @return cardNetType
         */
        public String getCardNetType() {
            return this.cardNetType;
        }

        /**
         * @return cardType
         */
        public String getCardType() {
            return this.cardType;
        }

        /**
         * @return contactName
         */
        public String getContactName() {
            return this.contactName;
        }

        /**
         * @return contactPhone
         */
        public String getContactPhone() {
            return this.contactPhone;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return logisticsId
         */
        public String getLogisticsId() {
            return this.logisticsId;
        }

        /**
         * @return logisticsStatus
         */
        public String getLogisticsStatus() {
            return this.logisticsStatus;
        }

        /**
         * @return logisticsType
         */
        public String getLogisticsType() {
            return this.logisticsType;
        }

        /**
         * @return logisticsUpdateTime
         */
        public String getLogisticsUpdateTime() {
            return this.logisticsUpdateTime;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return payTime
         */
        public String getPayTime() {
            return this.payTime;
        }

        /**
         * @return postAddress
         */
        public String getPostAddress() {
            return this.postAddress;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String action; 
            private String cardCount; 
            private String cardNetType; 
            private String cardType; 
            private String contactName; 
            private String contactPhone; 
            private String createTime; 
            private String description; 
            private String logisticsId; 
            private String logisticsStatus; 
            private String logisticsType; 
            private String logisticsUpdateTime; 
            private String orderId; 
            private String payTime; 
            private String postAddress; 
            private String regionId; 
            private String status; 

            /**
             * 代表创建时间的资源属性字段
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * CardCount.
             */
            public Builder cardCount(String cardCount) {
                this.cardCount = cardCount;
                return this;
            }

            /**
             * CardNetType.
             */
            public Builder cardNetType(String cardNetType) {
                this.cardNetType = cardNetType;
                return this;
            }

            /**
             * CardType.
             */
            public Builder cardType(String cardType) {
                this.cardType = cardType;
                return this;
            }

            /**
             * ContactName.
             */
            public Builder contactName(String contactName) {
                this.contactName = contactName;
                return this;
            }

            /**
             * ContactPhone.
             */
            public Builder contactPhone(String contactPhone) {
                this.contactPhone = contactPhone;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * LogisticsId.
             */
            public Builder logisticsId(String logisticsId) {
                this.logisticsId = logisticsId;
                return this;
            }

            /**
             * LogisticsStatus.
             */
            public Builder logisticsStatus(String logisticsStatus) {
                this.logisticsStatus = logisticsStatus;
                return this;
            }

            /**
             * LogisticsType.
             */
            public Builder logisticsType(String logisticsType) {
                this.logisticsType = logisticsType;
                return this;
            }

            /**
             * LogisticsUpdateTime.
             */
            public Builder logisticsUpdateTime(String logisticsUpdateTime) {
                this.logisticsUpdateTime = logisticsUpdateTime;
                return this;
            }

            /**
             * OrderId.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * PayTime.
             */
            public Builder payTime(String payTime) {
                this.payTime = payTime;
                return this;
            }

            /**
             * PostAddress.
             */
            public Builder postAddress(String postAddress) {
                this.postAddress = postAddress;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * 代表资源名称的资源属性字段
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Orders build() {
                return new Orders(this);
            } 

        } 

    }
}
