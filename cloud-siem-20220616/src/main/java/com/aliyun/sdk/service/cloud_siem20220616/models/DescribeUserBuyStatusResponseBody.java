// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserBuyStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserBuyStatusResponseBody</p>
 */
public class DescribeUserBuyStatusResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
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

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUserBuyStatusResponseBody build() {
            return new DescribeUserBuyStatusResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CanBuy")
        private Boolean canBuy;

        @NameInMap("Capacity")
        private Integer capacity;

        @NameInMap("DurationDays")
        private Long durationDays;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("MainUserId")
        private Long mainUserId;

        @NameInMap("MainUserName")
        private String mainUserName;

        @NameInMap("MasterUserId")
        private Long masterUserId;

        @NameInMap("MasterUserName")
        private String masterUserName;

        @NameInMap("SasInstanceId")
        private String sasInstanceId;

        @NameInMap("SubUserId")
        private Long subUserId;

        @NameInMap("SubUserName")
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
            private String sasInstanceId; 
            private Long subUserId; 
            private String subUserName; 

            /**
             * CanBuy.
             */
            public Builder canBuy(Boolean canBuy) {
                this.canBuy = canBuy;
                return this;
            }

            /**
             * Capacity.
             */
            public Builder capacity(Integer capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * DurationDays.
             */
            public Builder durationDays(Long durationDays) {
                this.durationDays = durationDays;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * MainUserId.
             */
            public Builder mainUserId(Long mainUserId) {
                this.mainUserId = mainUserId;
                return this;
            }

            /**
             * MainUserName.
             */
            public Builder mainUserName(String mainUserName) {
                this.mainUserName = mainUserName;
                return this;
            }

            /**
             * MasterUserId.
             */
            public Builder masterUserId(Long masterUserId) {
                this.masterUserId = masterUserId;
                return this;
            }

            /**
             * MasterUserName.
             */
            public Builder masterUserName(String masterUserName) {
                this.masterUserName = masterUserName;
                return this;
            }

            /**
             * SasInstanceId.
             */
            public Builder sasInstanceId(String sasInstanceId) {
                this.sasInstanceId = sasInstanceId;
                return this;
            }

            /**
             * SubUserId.
             */
            public Builder subUserId(Long subUserId) {
                this.subUserId = subUserId;
                return this;
            }

            /**
             * SubUserName.
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