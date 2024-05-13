// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEffectiveOrdersResponseBody} extends {@link TeaModel}
 *
 * <p>ListEffectiveOrdersResponseBody</p>
 */
public class ListEffectiveOrdersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("OrderSummary")
    private java.util.List < OrderSummary> orderSummary;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListEffectiveOrdersResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.orderSummary = builder.orderSummary;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEffectiveOrdersResponseBody create() {
        return builder().build();
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
     * @return orderSummary
     */
    public java.util.List < OrderSummary> getOrderSummary() {
        return this.orderSummary;
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

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private java.util.List < OrderSummary> orderSummary; 
        private String requestId; 
        private Boolean success; 

        /**
         * The error code returned if the request failed.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned if the request failed.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The information about orders.
         */
        public Builder orderSummary(java.util.List < OrderSummary> orderSummary) {
            this.orderSummary = orderSummary;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**: The request was successful.
         * *   **false**: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListEffectiveOrdersResponseBody build() {
            return new ListEffectiveOrdersResponseBody(this);
        } 

    } 

    public static class OrderList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BuyerId")
        private String buyerId;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("InsNum")
        private String insNum;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private OrderList(Builder builder) {
            this.buyerId = builder.buyerId;
            this.endTime = builder.endTime;
            this.insNum = builder.insNum;
            this.instanceId = builder.instanceId;
            this.orderId = builder.orderId;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderList create() {
            return builder().build();
        }

        /**
         * @return buyerId
         */
        public String getBuyerId() {
            return this.buyerId;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return insNum
         */
        public String getInsNum() {
            return this.insNum;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String buyerId; 
            private String endTime; 
            private String insNum; 
            private String instanceId; 
            private String orderId; 
            private String startTime; 

            /**
             * The UID of the user who placed the order.
             */
            public Builder buyerId(String buyerId) {
                this.buyerId = buyerId;
                return this;
            }

            /**
             * The time when the instance expires.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The maximum number of database instances that you can use DMS to manage.
             */
            public Builder insNum(String insNum) {
                this.insNum = insNum;
                return this;
            }

            /**
             * The ID of the instance for the purchased service.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The ID of the order.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * The time when the instance is started.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public OrderList build() {
                return new OrderList(this);
            } 

        } 

    }
    public static class OrderSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("CommodityType")
        private String commodityType;

        @com.aliyun.core.annotation.NameInMap("OrderList")
        private java.util.List < OrderList> orderList;

        @com.aliyun.core.annotation.NameInMap("TotalQuota")
        private Integer totalQuota;

        @com.aliyun.core.annotation.NameInMap("VersionType")
        private String versionType;

        private OrderSummary(Builder builder) {
            this.commodityCode = builder.commodityCode;
            this.commodityType = builder.commodityType;
            this.orderList = builder.orderList;
            this.totalQuota = builder.totalQuota;
            this.versionType = builder.versionType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderSummary create() {
            return builder().build();
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return commodityType
         */
        public String getCommodityType() {
            return this.commodityType;
        }

        /**
         * @return orderList
         */
        public java.util.List < OrderList> getOrderList() {
            return this.orderList;
        }

        /**
         * @return totalQuota
         */
        public Integer getTotalQuota() {
            return this.totalQuota;
        }

        /**
         * @return versionType
         */
        public String getVersionType() {
            return this.versionType;
        }

        public static final class Builder {
            private String commodityCode; 
            private String commodityType; 
            private java.util.List < OrderList> orderList; 
            private Integer totalQuota; 
            private String versionType; 

            /**
             * The commodity code of DMS.
             * <p>
             * 
             * *   dms_pre_public_cn: DMS that uses the subscription billing method
             * *   dms_post_public_cn: DMS that uses the pay-as-you-go billing method
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * The type of the service.
             * <p>
             * 
             * *   **VersionType**: DMS that supports control modes
             * *   **SensitiveDataProtection**: DMS that supports sensitive data protection
             */
            public Builder commodityType(String commodityType) {
                this.commodityType = commodityType;
                return this;
            }

            /**
             * Details about the orders.
             */
            public Builder orderList(java.util.List < OrderList> orderList) {
                this.orderList = orderList;
                return this;
            }

            /**
             * The sum of the number of instances that you can use DMS to manage in all orders.
             */
            public Builder totalQuota(Integer totalQuota) {
                this.totalQuota = totalQuota;
                return this;
            }

            /**
             * The control mode of DMS. Valid values:
             * <p>
             * 
             * *   **stand**: Stable Change
             * *   **safety**: Security Collaboration
             */
            public Builder versionType(String versionType) {
                this.versionType = versionType;
                return this;
            }

            public OrderSummary build() {
                return new OrderSummary(this);
            } 

        } 

    }
}
