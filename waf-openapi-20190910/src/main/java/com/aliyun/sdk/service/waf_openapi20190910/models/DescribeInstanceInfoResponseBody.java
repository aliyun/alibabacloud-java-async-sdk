// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceInfoResponseBody</p>
 */
public class DescribeInstanceInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceInfo")
    private InstanceInfo instanceInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * The information about the WAF instance.
         */
        public Builder instanceInfo(InstanceInfo instanceInfo) {
            this.instanceInfo = instanceInfo;
            return this;
        }

        /**
         * The ID of the request.
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
        @com.aliyun.core.annotation.NameInMap("EndDate")
        private Long endDate;

        @com.aliyun.core.annotation.NameInMap("InDebt")
        private Integer inDebt;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private Integer payType;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("RemainDay")
        private Integer remainDay;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("SubscriptionType")
        private String subscriptionType;

        @com.aliyun.core.annotation.NameInMap("Trial")
        private Integer trial;

        @com.aliyun.core.annotation.NameInMap("Version")
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
             * The expiration time of the WAF instance. This value is a UNIX timestamp. Unit: seconds.
             * <p>
             * 
             * >  If the value of **PayType** is **0**, this parameter is not returned. The value 0 indicates that no WAF instances are purchased.
             */
            public Builder endDate(Long endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * Indicates whether the WAF instance has overdue payments. Valid values:
             * <p>
             * 
             * *   **0**: The instance has overdue payments.
             * *   **1**: The instance does not have overdue payments.
             * 
             * >  If the value of **PayType** is **0**, this parameter is not returned. The value 0 indicates that no WAF instances are purchased.
             */
            public Builder inDebt(Integer inDebt) {
                this.inDebt = inDebt;
                return this;
            }

            /**
             * The ID of the WAF instance.
             * <p>
             * 
             * >  If the value of **PayType** is **0**, this parameter is not returned. The value 0 indicates that no WAF instances are purchased.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The activation status of WAF. Valid values:
             * <p>
             * 
             * *   **0**: No WAF instances are purchased within the Alibaba Cloud account.
             * *   **1**: A subscription WAF instance is purchased within the Alibaba Cloud account.
             */
            public Builder payType(Integer payType) {
                this.payType = payType;
                return this;
            }

            /**
             * The region in which the WAF instance resides. Valid values:
             * <p>
             * 
             * *   **cn**: a region in the Chinese mainland
             * *   **cn-hongkong**: a region outside the Chinese mainland
             * 
             * >  If the value of **PayType** is **0**, this parameter is not returned. The value 0 indicates that no WAF instances are purchased.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The number of remaining days before the trial period of the WAF instance ends.
             * <p>
             * 
             * >  This parameter is returned only if the value of **Trial** is **1**. The value 1 indicates that the free trial of a WAF instance is activated.
             */
            public Builder remainDay(Integer remainDay) {
                this.remainDay = remainDay;
                return this;
            }

            /**
             * Indicates whether the WAF instance expires. Valid values:
             * <p>
             * 
             * *   **0**: The instance expires.
             * *   **1**: The instance does not expire.
             * 
             * >  If the value of **PayType** is **0**, this parameter is not returned. The value 0 indicates that no WAF instances are purchased.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The billing method of the WAF instance: The value is fixed as **Subscription**.
             * <p>
             * 
             * >  If the value of **PayType** is **0**, this parameter is not returned. The value 0 indicates that no WAF instances are purchased.
             */
            public Builder subscriptionType(String subscriptionType) {
                this.subscriptionType = subscriptionType;
                return this;
            }

            /**
             * Indicates whether a WAF instance of the free trial edition is activated within the Alibaba Cloud account. Valid values:
             * <p>
             * 
             * *   **0**: no
             * *   **1**: yes
             * 
             * >  This parameter is returned only if a WAF instance of the free trial edition is activated within the Alibaba Cloud account.
             */
            public Builder trial(Integer trial) {
                this.trial = trial;
                return this;
            }

            /**
             * The edition of the WAF instance. Valid values:
             * <p>
             * 
             * *   **version_pro_china**: a WAF Pro instance in the Chinese mainland
             * *   **version_business_china**: a WAF Business instance in the Chinese mainland
             * *   **version_enterprise_china**: a WAF Enterprise instance in the Chinese mainland
             * *   **version_exclusive_china**: a WAF Exclusive instance in the Chinese mainland
             * *   **version_hybrid_cloud_standard_china**: a Hybrid Cloud WAF instance in the Chinese mainland
             * *   **version_pro_china**: a WAF Pro instance outside the Chinese mainland
             * *   **version_business**: a WAF Business instance outside the Chinese mainland
             * *   **version_enterprise**: a WAF Enterprise instance outside the Chinese mainland
             * *   **version_exclusive**: a WAF Exclusive instance outside the Chinese mainland
             * *   **version_hybrid_cloud_standard**: a Hybrid Cloud WAF instance outside the Chinese mainland
             * 
             * The preceding list contains all the editions of WAF instances within accounts that are created at the International site. If the returned version is not in the list, check whether your account is created at the International site.
             * 
             * >  If the value of **PayType** is **0**, this parameter is not returned. The value 0 indicates that no WAF instances are purchased.
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
