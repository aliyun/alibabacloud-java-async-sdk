// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstancesResponseBody</p>
 */
public class DescribeInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instances")
    private java.util.List < Instances> instances;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeInstancesResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instances
     */
    public java.util.List < Instances> getInstances() {
        return this.instances;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Instances> instances; 
        private String requestId; 
        private Long totalCount; 

        /**
         * The details about the instances.
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of the instances.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInstancesResponseBody build() {
            return new DescribeInstancesResponseBody(this);
        } 

    } 

    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DebtStatus")
        private Integer debtStatus;

        @com.aliyun.core.annotation.NameInMap("Edition")
        private Integer edition;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Integer enabled;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private Long expireTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("IpMode")
        private String ipMode;

        @com.aliyun.core.annotation.NameInMap("IpVersion")
        private String ipVersion;

        @com.aliyun.core.annotation.NameInMap("IsFirstOpenBw")
        private Long isFirstOpenBw;

        @com.aliyun.core.annotation.NameInMap("IsFirstOpenQps")
        private Long isFirstOpenQps;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private Instances(Builder builder) {
            this.createTime = builder.createTime;
            this.debtStatus = builder.debtStatus;
            this.edition = builder.edition;
            this.enabled = builder.enabled;
            this.expireTime = builder.expireTime;
            this.instanceId = builder.instanceId;
            this.ip = builder.ip;
            this.ipMode = builder.ipMode;
            this.ipVersion = builder.ipVersion;
            this.isFirstOpenBw = builder.isFirstOpenBw;
            this.isFirstOpenQps = builder.isFirstOpenQps;
            this.remark = builder.remark;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return debtStatus
         */
        public Integer getDebtStatus() {
            return this.debtStatus;
        }

        /**
         * @return edition
         */
        public Integer getEdition() {
            return this.edition;
        }

        /**
         * @return enabled
         */
        public Integer getEnabled() {
            return this.enabled;
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return ipMode
         */
        public String getIpMode() {
            return this.ipMode;
        }

        /**
         * @return ipVersion
         */
        public String getIpVersion() {
            return this.ipVersion;
        }

        /**
         * @return isFirstOpenBw
         */
        public Long getIsFirstOpenBw() {
            return this.isFirstOpenBw;
        }

        /**
         * @return isFirstOpenQps
         */
        public Long getIsFirstOpenQps() {
            return this.isFirstOpenQps;
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
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long createTime; 
            private Integer debtStatus; 
            private Integer edition; 
            private Integer enabled; 
            private Long expireTime; 
            private String instanceId; 
            private String ip; 
            private String ipMode; 
            private String ipVersion; 
            private Long isFirstOpenBw; 
            private Long isFirstOpenQps; 
            private String remark; 
            private Integer status; 

            /**
             * The time when the instance was created. The value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The overdue status of the instance. The value is fixed as **0**, which indicates that your Alibaba Cloud account does not have overdue payments. The instance supports only the subscription billing method.
             */
            public Builder debtStatus(Integer debtStatus) {
                this.debtStatus = debtStatus;
                return this;
            }

            /**
             * The mitigation plan of the instance. Valid values:
             * <p>
             * 
             * *   **0**: Anti-DDoS Proxy (Outside Chinese Mainland) instance of the Insurance mitigation plan
             * *   **1**: Anti-DDoS Proxy (Outside Chinese Mainland) instance of the Unlimited mitigation plan
             * *   **2**: Anti-DDoS Proxy (Outside Chinese Mainland) instance of the Chinese Mainland Acceleration (CMA) mitigation plan
             * *   **9**: Anti-DDoS Proxy (Chinese Mainland) instance of the Profession mitigation plan
             */
            public Builder edition(Integer edition) {
                this.edition = edition;
                return this;
            }

            /**
             * The traffic forwarding status of the instance. Valid values:
             * <p>
             * 
             * *   **0**: The instance no longer forwards service traffic.
             * *   **1**: The instance forwards service traffic as expected.
             */
            public Builder enabled(Integer enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * The time when the instance expires. The value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
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
             * The IP address of the instance.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The IP address-based forwarding mode of the instance. Valid values:
             * <p>
             * 
             * *   **fnat**: Requests from IPv4 addresses are forwarded to origin servers that use IPv4 addresses and requests from IPv6 addresses are forwarded to origin servers that use IPv6 addresses.
             * *   **v6tov4**: All requests are forwarded to origin servers that use IPv4 addresses.
             */
            public Builder ipMode(String ipMode) {
                this.ipMode = ipMode;
                return this;
            }

            /**
             * The IP version of the instance. Valid values:
             * <p>
             * 
             * *   **Ipv4**
             * *   **Ipv6**
             */
            public Builder ipVersion(String ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * Indicates whether the metering method of the 95th percentile burstable clean bandwidth is enabled for the instance. Valid values:
             * <p>
             * 
             * *   0: no
             * *   1: yes
             */
            public Builder isFirstOpenBw(Long isFirstOpenBw) {
                this.isFirstOpenBw = isFirstOpenBw;
                return this;
            }

            /**
             * Indicates whether the metering method of the 95th percentile burstable QPS is enabled for the instance. Valid values:
             * <p>
             * 
             * *   0: no
             * *   1: yes
             */
            public Builder isFirstOpenQps(Long isFirstOpenQps) {
                this.isFirstOpenQps = isFirstOpenQps;
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
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
