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
 * {@link DescribeUserBuyStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserBuyStatusResponseBody</p>
 */
public class DescribeUserBuyStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeUserBuyStatusResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserBuyStatusResponseBody create() {
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

        private Builder(DescribeUserBuyStatusResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response parameters.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>81D8EC0C-0804-51AD-8C38-17ED0BC74892</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUserBuyStatusResponseBody build() {
            return new DescribeUserBuyStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUserBuyStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserBuyStatusResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanBuy")
        private Boolean canBuy;

        @com.aliyun.core.annotation.NameInMap("Capacity")
        private Integer capacity;

        @com.aliyun.core.annotation.NameInMap("DurationDays")
        private Long durationDays;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("MainUserId")
        private Long mainUserId;

        @com.aliyun.core.annotation.NameInMap("MainUserName")
        private String mainUserName;

        @com.aliyun.core.annotation.NameInMap("MasterUserId")
        private Long masterUserId;

        @com.aliyun.core.annotation.NameInMap("MasterUserName")
        private String masterUserName;

        @com.aliyun.core.annotation.NameInMap("RdOrder")
        private Integer rdOrder;

        @com.aliyun.core.annotation.NameInMap("SasInstanceId")
        private String sasInstanceId;

        @com.aliyun.core.annotation.NameInMap("SubUserId")
        private Long subUserId;

        @com.aliyun.core.annotation.NameInMap("SubUserName")
        private String subUserName;

        private Data(Builder builder) {
            this.canBuy = builder.canBuy;
            this.capacity = builder.capacity;
            this.durationDays = builder.durationDays;
            this.endTime = builder.endTime;
            this.mainUserId = builder.mainUserId;
            this.mainUserName = builder.mainUserName;
            this.masterUserId = builder.masterUserId;
            this.masterUserName = builder.masterUserName;
            this.rdOrder = builder.rdOrder;
            this.sasInstanceId = builder.sasInstanceId;
            this.subUserId = builder.subUserId;
            this.subUserName = builder.subUserName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return mainUserId
         */
        public Long getMainUserId() {
            return this.mainUserId;
        }

        /**
         * @return mainUserName
         */
        public String getMainUserName() {
            return this.mainUserName;
        }

        /**
         * @return masterUserId
         */
        public Long getMasterUserId() {
            return this.masterUserId;
        }

        /**
         * @return masterUserName
         */
        public String getMasterUserName() {
            return this.masterUserName;
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
         * @return subUserId
         */
        public Long getSubUserId() {
            return this.subUserId;
        }

        /**
         * @return subUserName
         */
        public String getSubUserName() {
            return this.subUserName;
        }

        public static final class Builder {
            private Boolean canBuy; 
            private Integer capacity; 
            private Long durationDays; 
            private Long endTime; 
            private Long mainUserId; 
            private String mainUserName; 
            private Long masterUserId; 
            private String masterUserName; 
            private Integer rdOrder; 
            private String sasInstanceId; 
            private Long subUserId; 
            private String subUserName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.canBuy = model.canBuy;
                this.capacity = model.capacity;
                this.durationDays = model.durationDays;
                this.endTime = model.endTime;
                this.mainUserId = model.mainUserId;
                this.mainUserName = model.mainUserName;
                this.masterUserId = model.masterUserId;
                this.masterUserName = model.masterUserName;
                this.rdOrder = model.rdOrder;
                this.sasInstanceId = model.sasInstanceId;
                this.subUserId = model.subUserId;
                this.subUserName = model.subUserName;
            } 

            /**
             * <p>Indicates whether the current account can perform operations on threat analysis orders. Valid values:</p>
             * <ul>
             * <li><p>true: The account can purchase, upgrade, or downgrade threat analysis.</p>
             * </li>
             * <li><p>false: The account cannot perform operations on threat analysis orders.</p>
             * </li>
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
             * <p>The purchased capacity of Simple Log Service (SLS) for threat analysis. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder capacity(Integer capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * <p>The number of days before threat analysis expires.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder durationDays(Long durationDays) {
                this.durationDays = durationDays;
                return this;
            }

            /**
             * <p>The expiration time of threat analysis. This value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1669823999000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that purchased threat analysis.</p>
             * 
             * <strong>example:</strong>
             * <p>123XXXXXX</p>
             */
            public Builder mainUserId(Long mainUserId) {
                this.mainUserId = mainUserId;
                return this;
            }

            /**
             * <p>The name of the Alibaba Cloud account that purchased threat analysis.</p>
             * 
             * <strong>example:</strong>
             * <p>sas_account_xxx</p>
             */
            public Builder mainUserName(String mainUserName) {
                this.mainUserName = mainUserName;
                return this;
            }

            /**
             * <p>The ID of the master account of the resource directory.</p>
             * 
             * <strong>example:</strong>
             * <p>123XXXXXX</p>
             */
            public Builder masterUserId(Long masterUserId) {
                this.masterUserId = masterUserId;
                return this;
            }

            /**
             * <p>The display name of the master account of the resource directory.</p>
             * 
             * <strong>example:</strong>
             * <p>rd_master_xxx</p>
             */
            public Builder masterUserName(String masterUserName) {
                this.masterUserName = masterUserName;
                return this;
            }

            /**
             * <p>The type of the current order.</p>
             * <ul>
             * <li><p>0: The order includes threat analysis traffic and capacity.</p>
             * </li>
             * <li><p>1: The order includes only threat analysis capacity.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder rdOrder(Integer rdOrder) {
                this.rdOrder = rdOrder;
                return this;
            }

            /**
             * <p>The ID of the Security Center instance.</p>
             * 
             * <strong>example:</strong>
             * <p>sas-instance-xxxxx</p>
             */
            public Builder sasInstanceId(String sasInstanceId) {
                this.sasInstanceId = sasInstanceId;
                return this;
            }

            /**
             * <p>The ID of the currently logged-on Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>123XXXXXX</p>
             */
            public Builder subUserId(Long subUserId) {
                this.subUserId = subUserId;
                return this;
            }

            /**
             * <p>The name of the currently logged-on Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>sas_account_xxx</p>
             */
            public Builder subUserName(String subUserName) {
                this.subUserName = subUserName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
