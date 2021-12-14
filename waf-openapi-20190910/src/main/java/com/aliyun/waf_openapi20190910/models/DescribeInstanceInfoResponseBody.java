// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeInstanceInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceInfoResponseBody</p>
 */
public class DescribeInstanceInfoResponseBody extends TeaModel {
    @NameInMap("InstanceInfo")
    private InstanceInfo instanceInfo;

    @NameInMap("RequestId")
    private String requestId;


    private DescribeInstanceInfoResponseBody(Builder builder) {
        this.instanceInfo = builder.instanceInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceInfo
     */
    public InstanceInfo getInstanceInfo() {
        return this.instanceInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InstanceInfo instanceInfo; 
        private String requestId; 

        /**
         * <p>InstanceInfo.</p>
         */
        public Builder instanceInfo(InstanceInfo instanceInfo) {
            this.instanceInfo = instanceInfo;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceInfoResponseBody build() {
            return new DescribeInstanceInfoResponseBody(this);
        } 

    } 

    public static class InstanceInfo extends TeaModel {
        @NameInMap("EndDate")
        private Long endDate;

        @NameInMap("InDebt")
        private Integer inDebt;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("PayType")
        private Integer payType;

        @NameInMap("Region")
        private String region;

        @NameInMap("RemainDay")
        private Integer remainDay;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("SubscriptionType")
        private String subscriptionType;

        @NameInMap("Trial")
        private Integer trial;

        @NameInMap("Version")
        private String version;


        private InstanceInfo(Builder builder) {
            this.endDate = builder.endDate;
            this.inDebt = builder.inDebt;
            this.instanceId = builder.instanceId;
            this.payType = builder.payType;
            this.region = builder.region;
            this.remainDay = builder.remainDay;
            this.status = builder.status;
            this.subscriptionType = builder.subscriptionType;
            this.trial = builder.trial;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceInfo create() {
            return builder().build();
        }

        /**
         * @return endDate
         */
        public Long getEndDate() {
            return this.endDate;
        }

        /**
         * @return inDebt
         */
        public Integer getInDebt() {
            return this.inDebt;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return payType
         */
        public Integer getPayType() {
            return this.payType;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return remainDay
         */
        public Integer getRemainDay() {
            return this.remainDay;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return subscriptionType
         */
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        /**
         * @return trial
         */
        public Integer getTrial() {
            return this.trial;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Long endDate; 
            private Integer inDebt; 
            private String instanceId; 
            private Integer payType; 
            private String region; 
            private Integer remainDay; 
            private Integer status; 
            private String subscriptionType; 
            private Integer trial; 
            private String version; 

            /**
             * <p>EndDate.</p>
             */
            public Builder endDate(Long endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * <p>InDebt.</p>
             */
            public Builder inDebt(Integer inDebt) {
                this.inDebt = inDebt;
                return this;
            }

            /**
             * <p>InstanceId.</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>PayType.</p>
             */
            public Builder payType(Integer payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>Region.</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>RemainDay.</p>
             */
            public Builder remainDay(Integer remainDay) {
                this.remainDay = remainDay;
                return this;
            }

            /**
             * <p>Status.</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>SubscriptionType.</p>
             */
            public Builder subscriptionType(String subscriptionType) {
                this.subscriptionType = subscriptionType;
                return this;
            }

            /**
             * <p>Trial.</p>
             */
            public Builder trial(Integer trial) {
                this.trial = trial;
                return this;
            }

            /**
             * <p>Version.</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public InstanceInfo build() {
                return new InstanceInfo(this);
            } 

        } 

    }
}
