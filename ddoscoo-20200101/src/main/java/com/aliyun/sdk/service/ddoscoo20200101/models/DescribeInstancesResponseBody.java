// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstancesResponseBody</p>
 */
public class DescribeInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instances")
    private java.util.List<Instances> instances;

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
    public java.util.List<Instances> getInstances() {
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
        private java.util.List<Instances> instances; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>The details about the instances.</p>
         */
        public Builder instances(java.util.List<Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>A0AF40CC-814A-5A86-AEAA-6F19E88B8A39</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of the instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInstancesResponseBody build() {
            return new DescribeInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
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
             * <p>The time when the instance was created. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1637751953000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The overdue status of the instance. The value is fixed as <strong>0</strong>, which indicates that your Alibaba Cloud account does not have overdue payments. The instance supports only the subscription billing method.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder debtStatus(Integer debtStatus) {
                this.debtStatus = debtStatus;
                return this;
            }

            /**
             * <p>The mitigation plan of the instance. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Anti-DDoS Proxy (Outside Chinese Mainland) instance of the Insurance mitigation plan</li>
             * <li><strong>1</strong>: Anti-DDoS Proxy (Outside Chinese Mainland) instance of the Unlimited mitigation plan</li>
             * <li><strong>2</strong>: Anti-DDoS Proxy (Outside Chinese Mainland) instance of the Chinese Mainland Acceleration (CMA) mitigation plan</li>
             * <li><strong>9</strong>: Anti-DDoS Proxy (Chinese Mainland) instance of the Profession mitigation plan</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder edition(Integer edition) {
                this.edition = edition;
                return this;
            }

            /**
             * <p>The traffic forwarding status of the instance. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The instance no longer forwards service traffic.</li>
             * <li><strong>1</strong>: The instance forwards service traffic as expected.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder enabled(Integer enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The time when the instance expires. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1640361600000</p>
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ddoscoo-cn-7pp2g9ed****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The IP address of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>203.199.XX.XX</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The IP address-based forwarding mode of the instance. Valid values:</p>
             * <ul>
             * <li><strong>fnat</strong>: Requests from IPv4 addresses are forwarded to origin servers that use IPv4 addresses and requests from IPv6 addresses are forwarded to origin servers that use IPv6 addresses.</li>
             * <li><strong>v6tov4</strong>: All requests are forwarded to origin servers that use IPv4 addresses.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>fnat</p>
             */
            public Builder ipMode(String ipMode) {
                this.ipMode = ipMode;
                return this;
            }

            /**
             * <p>The IP version of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Ipv4</strong></li>
             * <li><strong>Ipv6</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Ipv4</p>
             */
            public Builder ipVersion(String ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * <p>Indicates whether the metering method of the 95th percentile burstable clean bandwidth is enabled for the instance. Valid values:</p>
             * <ul>
             * <li>0: no</li>
             * <li>1: yes</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder isFirstOpenBw(Long isFirstOpenBw) {
                this.isFirstOpenBw = isFirstOpenBw;
                return this;
            }

            /**
             * <p>Indicates whether the metering method of the 95th percentile burstable QPS is enabled for the instance. Valid values:</p>
             * <ul>
             * <li>0: no</li>
             * <li>1: yes</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder isFirstOpenQps(Long isFirstOpenQps) {
                this.isFirstOpenQps = isFirstOpenQps;
                return this;
            }

            /**
             * <p>The remarks of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>doc-test</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The status of the instance. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: normal</li>
             * <li><strong>2</strong>: expired</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
