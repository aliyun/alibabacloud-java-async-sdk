// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The information about orders.</p>
         */
        public Builder orderSummary(java.util.List < OrderSummary> orderSummary) {
            this.orderSummary = orderSummary;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A8FE12AA-300D-5FDF-806F-C2CB99161F32</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListEffectiveOrdersResponseBody build() {
            return new ListEffectiveOrdersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEffectiveOrdersResponseBody} extends {@link TeaModel}
     *
     * <p>ListEffectiveOrdersResponseBody</p>
     */
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
             * <p>The UID of the user who placed the order.</p>
             * 
             * <strong>example:</strong>
             * <p>2698420314****</p>
             */
            public Builder buyerId(String buyerId) {
                this.buyerId = buyerId;
                return this;
            }

            /**
             * <p>The time when the instance expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-11-24 00:00:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The maximum number of database instances that you can use DMS to manage.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder insNum(String insNum) {
                this.insNum = insNum;
                return this;
            }

            /**
             * <p>The ID of the instance for the purchased service.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp1xd1v866****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The ID of the order.</p>
             * 
             * <strong>example:</strong>
             * <p>2190037****</p>
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * <p>The time when the instance is started.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-10-24 00:00:00</p>
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
    /**
     * 
     * {@link ListEffectiveOrdersResponseBody} extends {@link TeaModel}
     *
     * <p>ListEffectiveOrdersResponseBody</p>
     */
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
             * <p>The commodity code of DMS.</p>
             * <ul>
             * <li>dms_pre_public_cn: DMS that uses the subscription billing method</li>
             * <li>dms_post_public_cn: DMS that uses the pay-as-you-go billing method</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>dms_pre_public_cn</p>
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * <p>The type of the service.</p>
             * <ul>
             * <li><strong>VersionType</strong>: DMS that supports control modes</li>
             * <li><strong>SensitiveDataProtection</strong>: DMS that supports sensitive data protection</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VersionType</p>
             */
            public Builder commodityType(String commodityType) {
                this.commodityType = commodityType;
                return this;
            }

            /**
             * <p>Details about the orders.</p>
             */
            public Builder orderList(java.util.List < OrderList> orderList) {
                this.orderList = orderList;
                return this;
            }

            /**
             * <p>The sum of the number of instances that you can use DMS to manage in all orders.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder totalQuota(Integer totalQuota) {
                this.totalQuota = totalQuota;
                return this;
            }

            /**
             * <p>The control mode of DMS. Valid values:</p>
             * <ul>
             * <li><strong>stand</strong>: Stable Change</li>
             * <li><strong>safety</strong>: Security Collaboration</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>safety</p>
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
