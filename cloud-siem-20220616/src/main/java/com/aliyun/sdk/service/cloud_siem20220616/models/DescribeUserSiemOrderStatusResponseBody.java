// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeUserSiemOrderStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserSiemOrderStatusResponseBody</p>
 */
public class DescribeUserSiemOrderStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeUserSiemOrderStatusResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserSiemOrderStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeUserSiemOrderStatusResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUserSiemOrderStatusResponseBody build() {
            return new DescribeUserSiemOrderStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUserSiemOrderStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserSiemOrderStatusResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsocInstanceId")
        private String asocInstanceId;

        @com.aliyun.core.annotation.NameInMap("AsocSubscriptionInstanceEndTime")
        private Long asocSubscriptionInstanceEndTime;

        @com.aliyun.core.annotation.NameInMap("AsocSubscriptionInstanceStartTime")
        private Long asocSubscriptionInstanceStartTime;

        @com.aliyun.core.annotation.NameInMap("CanBuy")
        private Boolean canBuy;

        @com.aliyun.core.annotation.NameInMap("Capacity")
        private Integer capacity;

        @com.aliyun.core.annotation.NameInMap("CapacityOrderFrom")
        private String capacityOrderFrom;

        @com.aliyun.core.annotation.NameInMap("DeliveryCapacity")
        private Integer deliveryCapacity;

        @com.aliyun.core.annotation.NameInMap("DurationDays")
        private Long durationDays;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("FlowCapacity")
        private Integer flowCapacity;

        @com.aliyun.core.annotation.NameInMap("MainUserId")
        private Long mainUserId;

        @com.aliyun.core.annotation.NameInMap("MasterUserId")
        private Long masterUserId;

        @com.aliyun.core.annotation.NameInMap("RdId")
        private String rdId;

        @com.aliyun.core.annotation.NameInMap("RdOrder")
        private Integer rdOrder;

        @com.aliyun.core.annotation.NameInMap("SasInstanceId")
        private String sasInstanceId;

        @com.aliyun.core.annotation.NameInMap("SiemOrderFrom")
        private String siemOrderFrom;

        @com.aliyun.core.annotation.NameInMap("SiemOrderStatus")
        private Integer siemOrderStatus;

        @com.aliyun.core.annotation.NameInMap("SubUserId")
        private Long subUserId;

        @com.aliyun.core.annotation.NameInMap("UserType")
        private String userType;

        private Data(Builder builder) {
            this.asocInstanceId = builder.asocInstanceId;
            this.asocSubscriptionInstanceEndTime = builder.asocSubscriptionInstanceEndTime;
            this.asocSubscriptionInstanceStartTime = builder.asocSubscriptionInstanceStartTime;
            this.canBuy = builder.canBuy;
            this.capacity = builder.capacity;
            this.capacityOrderFrom = builder.capacityOrderFrom;
            this.deliveryCapacity = builder.deliveryCapacity;
            this.durationDays = builder.durationDays;
            this.endTime = builder.endTime;
            this.flowCapacity = builder.flowCapacity;
            this.mainUserId = builder.mainUserId;
            this.masterUserId = builder.masterUserId;
            this.rdId = builder.rdId;
            this.rdOrder = builder.rdOrder;
            this.sasInstanceId = builder.sasInstanceId;
            this.siemOrderFrom = builder.siemOrderFrom;
            this.siemOrderStatus = builder.siemOrderStatus;
            this.subUserId = builder.subUserId;
            this.userType = builder.userType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return asocInstanceId
         */
        public String getAsocInstanceId() {
            return this.asocInstanceId;
        }

        /**
         * @return asocSubscriptionInstanceEndTime
         */
        public Long getAsocSubscriptionInstanceEndTime() {
            return this.asocSubscriptionInstanceEndTime;
        }

        /**
         * @return asocSubscriptionInstanceStartTime
         */
        public Long getAsocSubscriptionInstanceStartTime() {
            return this.asocSubscriptionInstanceStartTime;
        }

        /**
         * @return canBuy
         */
        public Boolean getCanBuy() {
            return this.canBuy;
        }

        /**
         * @return capacity
         */
        public Integer getCapacity() {
            return this.capacity;
        }

        /**
         * @return capacityOrderFrom
         */
        public String getCapacityOrderFrom() {
            return this.capacityOrderFrom;
        }

        /**
         * @return deliveryCapacity
         */
        public Integer getDeliveryCapacity() {
            return this.deliveryCapacity;
        }

        /**
         * @return durationDays
         */
        public Long getDurationDays() {
            return this.durationDays;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return flowCapacity
         */
        public Integer getFlowCapacity() {
            return this.flowCapacity;
        }

        /**
         * @return mainUserId
         */
        public Long getMainUserId() {
            return this.mainUserId;
        }

        /**
         * @return masterUserId
         */
        public Long getMasterUserId() {
            return this.masterUserId;
        }

        /**
         * @return rdId
         */
        public String getRdId() {
            return this.rdId;
        }

        /**
         * @return rdOrder
         */
        public Integer getRdOrder() {
            return this.rdOrder;
        }

        /**
         * @return sasInstanceId
         */
        public String getSasInstanceId() {
            return this.sasInstanceId;
        }

        /**
         * @return siemOrderFrom
         */
        public String getSiemOrderFrom() {
            return this.siemOrderFrom;
        }

        /**
         * @return siemOrderStatus
         */
        public Integer getSiemOrderStatus() {
            return this.siemOrderStatus;
        }

        /**
         * @return subUserId
         */
        public Long getSubUserId() {
            return this.subUserId;
        }

        /**
         * @return userType
         */
        public String getUserType() {
            return this.userType;
        }

        public static final class Builder {
            private String asocInstanceId; 
            private Long asocSubscriptionInstanceEndTime; 
            private Long asocSubscriptionInstanceStartTime; 
            private Boolean canBuy; 
            private Integer capacity; 
            private String capacityOrderFrom; 
            private Integer deliveryCapacity; 
            private Long durationDays; 
            private Long endTime; 
            private Integer flowCapacity; 
            private Long mainUserId; 
            private Long masterUserId; 
            private String rdId; 
            private Integer rdOrder; 
            private String sasInstanceId; 
            private String siemOrderFrom; 
            private Integer siemOrderStatus; 
            private Long subUserId; 
            private String userType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.asocInstanceId = model.asocInstanceId;
                this.asocSubscriptionInstanceEndTime = model.asocSubscriptionInstanceEndTime;
                this.asocSubscriptionInstanceStartTime = model.asocSubscriptionInstanceStartTime;
                this.canBuy = model.canBuy;
                this.capacity = model.capacity;
                this.capacityOrderFrom = model.capacityOrderFrom;
                this.deliveryCapacity = model.deliveryCapacity;
                this.durationDays = model.durationDays;
                this.endTime = model.endTime;
                this.flowCapacity = model.flowCapacity;
                this.mainUserId = model.mainUserId;
                this.masterUserId = model.masterUserId;
                this.rdId = model.rdId;
                this.rdOrder = model.rdOrder;
                this.sasInstanceId = model.sasInstanceId;
                this.siemOrderFrom = model.siemOrderFrom;
                this.siemOrderStatus = model.siemOrderStatus;
                this.subUserId = model.subUserId;
                this.userType = model.userType;
            } 

            /**
             * <p>The Agentic SOC Credits instance ID. If SiemOrderFrom is CREDITS_PRE_PAY, this field returns the Credits subscription instance ID for prepaid orders. If SiemOrderFrom is CREDITS_POST_PAY, this field returns the Credits pay-as-you-go instance ID. This field is empty if no Credits instance is found. For legacy orders, the Security Center instance ID is returned by SasInstanceId.</p>
             * 
             * <strong>example:</strong>
             * <p>asoc-instance-xxxxx</p>
             */
            public Builder asocInstanceId(String asocInstanceId) {
                this.asocInstanceId = asocInstanceId;
                return this;
            }

            /**
             * <p>The end time of the Agentic SOC Credits prepaid subscription, expressed as a 13-digit Unix timestamp in milliseconds. This field is returned only when SiemOrderFrom is CREDITS_PRE_PAY. In other cases, this field is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>1785542400456</p>
             */
            public Builder asocSubscriptionInstanceEndTime(Long asocSubscriptionInstanceEndTime) {
                this.asocSubscriptionInstanceEndTime = asocSubscriptionInstanceEndTime;
                return this;
            }

            /**
             * <p>The start time of the Agentic SOC Credits prepaid subscription, expressed as a 13-digit Unix timestamp in milliseconds. This field is returned only when SiemOrderFrom is CREDITS_PRE_PAY. In other cases, this field is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>1754006400123</p>
             */
            public Builder asocSubscriptionInstanceStartTime(Long asocSubscriptionInstanceStartTime) {
                this.asocSubscriptionInstanceStartTime = asocSubscriptionInstanceStartTime;
                return this;
            }

            /**
             * <p>Indicates whether the current account can perform order operations for threat detection and response. Valid values:</p>
             * <ul>
             * <li>true: The account can purchase, upgrade, or change specifications.</li>
             * <li>false: The account cannot perform order operations for threat detection and response.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder canBuy(Boolean canBuy) {
                this.canBuy = canBuy;
                return this;
            }

            /**
             * <p>The SLS log storage capacity purchased for threat detection and response, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder capacity(Integer capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * <p>The source of the log storage capacity order. Valid values:</p>
             * <ul>
             * <li>PRE_PAY_CAPACITY: a prepaid capacity order.</li>
             * <li>POST_PAY_CAPACITY: a pay-as-you-go capacity order.</li>
             * </ul>
             * <p>The capacity order source is independent of the traffic order source indicated by SiemOrderFrom.</p>
             * 
             * <strong>example:</strong>
             * <p>PRE_PAY_CAPACITY</p>
             */
            public Builder capacityOrderFrom(String capacityOrderFrom) {
                this.capacityOrderFrom = capacityOrderFrom;
                return this;
            }

            /**
             * <p>The SLS log storage capacity purchased for threat detection and response 1.0, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder deliveryCapacity(Integer deliveryCapacity) {
                this.deliveryCapacity = deliveryCapacity;
                return this;
            }

            /**
             * <p>The number of days until the threat detection and response service expires.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder durationDays(Long durationDays) {
                this.durationDays = durationDays;
                return this;
            }

            /**
             * <p>The expiration time of threat detection and response, expressed as a millisecond-level timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1669823999000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The traffic capacity purchased for threat detection and response, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder flowCapacity(Integer flowCapacity) {
                this.flowCapacity = flowCapacity;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account ID that purchased threat detection and response.</p>
             * 
             * <strong>example:</strong>
             * <p>123XXXXXX</p>
             */
            public Builder mainUserId(Long mainUserId) {
                this.mainUserId = mainUserId;
                return this;
            }

            /**
             * <p>The master account ID of the resource directory.</p>
             * 
             * <strong>example:</strong>
             * <p>123XXXXXX</p>
             */
            public Builder masterUserId(Long masterUserId) {
                this.masterUserId = masterUserId;
                return this;
            }

            /**
             * <p>The resource directory ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rd-xxxxxx</p>
             */
            public Builder rdId(String rdId) {
                this.rdId = rdId;
                return this;
            }

            /**
             * <p>Indicates whether the order is a SIEM public preview order.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder rdOrder(Integer rdOrder) {
                this.rdOrder = rdOrder;
                return this;
            }

            /**
             * <p>The Security Center instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sas-instance-xxxxx</p>
             */
            public Builder sasInstanceId(String sasInstanceId) {
                this.sasInstanceId = sasInstanceId;
                return this;
            }

            /**
             * <p>The source of the traffic order. Valid values:</p>
             * <ul>
             * <li>PRE_PAY_FLOW: a prepaid traffic order for threat detection and response.</li>
             * <li>POST_PAY_FLOW: a pay-as-you-go traffic order for threat detection and response.</li>
             * <li>CREDITS_PRE_PAY: an Agentic SOC Credits prepaid subscription.</li>
             * <li>CREDITS_POST_PAY: an Agentic SOC Credits pay-as-you-go instance.</li>
             * </ul>
             * <p>This field describes the traffic order source. The log storage capacity order source is independently indicated by CapacityOrderFrom.</p>
             * 
             * <strong>example:</strong>
             * <p>CREDITS_PRE_PAY</p>
             */
            public Builder siemOrderFrom(String siemOrderFrom) {
                this.siemOrderFrom = siemOrderFrom;
                return this;
            }

            /**
             * <p>Indicates whether a valid SIEM order exists. Valid values:</p>
             * <ul>
             * <li>1: The SIEM order is valid.</li>
             * <li>0: The SIEM order is invalid.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder siemOrderStatus(Integer siemOrderStatus) {
                this.siemOrderStatus = siemOrderStatus;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account ID of the current logon.</p>
             * 
             * <strong>example:</strong>
             * <p>123XXXXXX</p>
             */
            public Builder subUserId(Long subUserId) {
                this.subUserId = subUserId;
                return this;
            }

            /**
             * <p>The user type.</p>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder userType(String userType) {
                this.userType = userType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
