// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceListResponseBody</p>
 */
public class DescribeInstanceListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceList")
    private java.util.List < InstanceList> instanceList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private DescribeInstanceListResponseBody(Builder builder) {
        this.instanceList = builder.instanceList;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceListResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceList
     */
    public java.util.List < InstanceList> getInstanceList() {
        return this.instanceList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List < InstanceList> instanceList; 
        private String requestId; 
        private Long total; 

        /**
         * The details about the Anti-DDoS Origin instance.
         */
        public Builder instanceList(java.util.List < InstanceList> instanceList) {
            this.instanceList = instanceList;
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
         * The total number of Anti-DDoS Origin instances.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public DescribeInstanceListResponseBody build() {
            return new DescribeInstanceListResponseBody(this);
        } 

    } 

    public static class AutoProtectCondition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Events")
        private java.util.List < String > events;

        private AutoProtectCondition(Builder builder) {
            this.events = builder.events;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoProtectCondition create() {
            return builder().build();
        }

        /**
         * @return events
         */
        public java.util.List < String > getEvents() {
            return this.events;
        }

        public static final class Builder {
            private java.util.List < String > events; 

            /**
             * Events.
             */
            public Builder events(java.util.List < String > events) {
                this.events = events;
                return this;
            }

            public AutoProtectCondition build() {
                return new AutoProtectCondition(this);
            } 

        } 

    }
    public static class InstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoProtectCondition")
        private AutoProtectCondition autoProtectCondition;

        @com.aliyun.core.annotation.NameInMap("AutoRenewal")
        private Boolean autoRenewal;

        @com.aliyun.core.annotation.NameInMap("BlackholdingCount")
        private String blackholdingCount;

        @com.aliyun.core.annotation.NameInMap("CommodityType")
        private String commodityType;

        @com.aliyun.core.annotation.NameInMap("CoverageType")
        private Integer coverageType;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private Long expireTime;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("IpType")
        private String ipType;

        @com.aliyun.core.annotation.NameInMap("Product")
        private String product;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private InstanceList(Builder builder) {
            this.autoProtectCondition = builder.autoProtectCondition;
            this.autoRenewal = builder.autoRenewal;
            this.blackholdingCount = builder.blackholdingCount;
            this.commodityType = builder.commodityType;
            this.coverageType = builder.coverageType;
            this.expireTime = builder.expireTime;
            this.gmtCreate = builder.gmtCreate;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.ipType = builder.ipType;
            this.product = builder.product;
            this.remark = builder.remark;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceList create() {
            return builder().build();
        }

        /**
         * @return autoProtectCondition
         */
        public AutoProtectCondition getAutoProtectCondition() {
            return this.autoProtectCondition;
        }

        /**
         * @return autoRenewal
         */
        public Boolean getAutoRenewal() {
            return this.autoRenewal;
        }

        /**
         * @return blackholdingCount
         */
        public String getBlackholdingCount() {
            return this.blackholdingCount;
        }

        /**
         * @return commodityType
         */
        public String getCommodityType() {
            return this.commodityType;
        }

        /**
         * @return coverageType
         */
        public Integer getCoverageType() {
            return this.coverageType;
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return ipType
         */
        public String getIpType() {
            return this.ipType;
        }

        /**
         * @return product
         */
        public String getProduct() {
            return this.product;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private AutoProtectCondition autoProtectCondition; 
            private Boolean autoRenewal; 
            private String blackholdingCount; 
            private String commodityType; 
            private Integer coverageType; 
            private Long expireTime; 
            private Long gmtCreate; 
            private String instanceId; 
            private String instanceType; 
            private String ipType; 
            private String product; 
            private String remark; 
            private String status; 

            /**
             * AutoProtectCondition.
             */
            public Builder autoProtectCondition(AutoProtectCondition autoProtectCondition) {
                this.autoProtectCondition = autoProtectCondition;
                return this;
            }

            /**
             * Indicates whether auto-renewal is enabled for the instance. Valid values:
             * <p>
             * 
             * *   **true**: enabled
             * *   **false**: disabled
             */
            public Builder autoRenewal(Boolean autoRenewal) {
                this.autoRenewal = autoRenewal;
                return this;
            }

            /**
             * The number of protected public IP addresses for which blackhole filtering is triggered.
             * <p>
             * 
             * >  You can call the [DeleteBlackhole](~~118692~~) operation to deactivate blackhole filtering for a protected IP address.
             */
            public Builder blackholdingCount(String blackholdingCount) {
                this.blackholdingCount = blackholdingCount;
                return this;
            }

            /**
             * CommodityType.
             */
            public Builder commodityType(String commodityType) {
                this.commodityType = commodityType;
                return this;
            }

            /**
             * CoverageType.
             */
            public Builder coverageType(Integer coverageType) {
                this.coverageType = coverageType;
                return this;
            }

            /**
             * The time when the instance expires. This value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * The time when the instance was purchased. This value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The mitigation plan of the instance. Valid values:
             * <p>
             * 
             * *   **0**: the Professional mitigation plan
             * *   **1**: the Enterprise mitigation plan
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The protocol type of the IP address asset that is protected by the instance. Valid values:
             * <p>
             * 
             * *   **Ipv4**: IPv4
             * *   **Ipv6**: IPv6
             */
            public Builder ipType(String ipType) {
                this.ipType = ipType;
                return this;
            }

            /**
             * The type of the cloud service that is associated with the Anti-DDoS Origin instance. By default, this parameter is not returned. If the Anti-DDoS Origin instance is created by using a different cloud service, the code of the cloud service is returned.
             * <p>
             * 
             * Valid values:
             * 
             * *   **gamebox**: The Anti-DDoS Origin instance is created by using Game Security Box.
             * *   **eip**: The Anti-DDoS Origin instance is created by using an elastic IP address (EIP) for which Anti-DDoS (Enhanced Edition) is enabled.
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * The remarks of the instance.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * The status of the instance. Valid values:
             * <p>
             * 
             * *   **1**: normal
             * *   **2**: expired
             * *   **3**: released
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public InstanceList build() {
                return new InstanceList(this);
            } 

        } 

    }
}
