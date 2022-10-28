// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEffectiveOrdersResponseBody} extends {@link TeaModel}
 *
 * <p>ListEffectiveOrdersResponseBody</p>
 */
public class ListEffectiveOrdersResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("OrderSummary")
    private java.util.List < OrderSummary> orderSummary;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * OrderSummary.
         */
        public Builder orderSummary(java.util.List < OrderSummary> orderSummary) {
            this.orderSummary = orderSummary;
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
         * Success.
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
        @NameInMap("BuyerId")
        private String buyerId;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("InsNum")
        private String insNum;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("OrderId")
        private String orderId;

        @NameInMap("StartTime")
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
             * 购买用户UID
             */
            public Builder buyerId(String buyerId) {
                this.buyerId = buyerId;
                return this;
            }

            /**
             * 订单到期时间
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * 订单购买规格
             */
            public Builder insNum(String insNum) {
                this.insNum = insNum;
                return this;
            }

            /**
             * 购买商品实例ID
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * 购买订单ID
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * 订单开始时间
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
        @NameInMap("CommodityCode")
        private String commodityCode;

        @NameInMap("CommodityType")
        private String commodityType;

        @NameInMap("OrderList")
        private java.util.List < OrderList> orderList;

        @NameInMap("TotalQuota")
        private Integer totalQuota;

        @NameInMap("VersionType")
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
             * DMS的商品Code
             * <p>
             * - 中国站：dms_pre_public_cn（包年包月）、dms_post_public_cn（按量付费）
             * - 国际站：dms_pre_public_intl（包年包月）、dms_post_public_intl（按量付费）
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * 商品类型
             * <p>
             * - versionType：管控模式
             * - SensitiveDataProtection：敏感数据保护
             */
            public Builder commodityType(String commodityType) {
                this.commodityType = commodityType;
                return this;
            }

            /**
             * 订单明细
             */
            public Builder orderList(java.util.List < OrderList> orderList) {
                this.orderList = orderList;
                return this;
            }

            /**
             * OrderList订单明细额度总和
             */
            public Builder totalQuota(Integer totalQuota) {
                this.totalQuota = totalQuota;
                return this;
            }

            /**
             * 商品类型为管控模式时（CommodityType = versionType ），区分管控模式的类型：
             * <p>
             * - stand：稳定变更
             * - safety：安全协同
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
