// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

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
 * {@link DescribeInstanceListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceListResponseBody</p>
 */
public class DescribeInstanceListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceList")
    private java.util.List<InstanceList> instanceList;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceList
     */
    public java.util.List<InstanceList> getInstanceList() {
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
        private java.util.List<InstanceList> instanceList; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(DescribeInstanceListResponseBody model) {
            this.instanceList = model.instanceList;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>The details of the Anti-DDoS Origin instances.</p>
         */
        public Builder instanceList(java.util.List<InstanceList> instanceList) {
            this.instanceList = instanceList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>381D5D33-BB8F-395F-8EE4-AE3BB4B523C4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of Anti-DDoS Origin instances returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public DescribeInstanceListResponseBody build() {
            return new DescribeInstanceListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceListResponseBody</p>
     */
    public static class AutoProtectCondition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Events")
        private java.util.List<String> events;

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
        public java.util.List<String> getEvents() {
            return this.events;
        }

        public static final class Builder {
            private java.util.List<String> events; 

            private Builder() {
            } 

            private Builder(AutoProtectCondition model) {
                this.events = model.events;
            } 

            /**
             * <p>The events on which automatic binding is based.</p>
             */
            public Builder events(java.util.List<String> events) {
                this.events = events;
                return this;
            }

            public AutoProtectCondition build() {
                return new AutoProtectCondition(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceListResponseBody</p>
     */
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

        @com.aliyun.core.annotation.NameInMap("DebtStatus")
        private Long debtStatus;

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

        @com.aliyun.core.annotation.NameInMap("LogExt")
        private String logExt;

        @com.aliyun.core.annotation.NameInMap("Product")
        private String product;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private InstanceList(Builder builder) {
            this.autoProtectCondition = builder.autoProtectCondition;
            this.autoRenewal = builder.autoRenewal;
            this.blackholdingCount = builder.blackholdingCount;
            this.commodityType = builder.commodityType;
            this.coverageType = builder.coverageType;
            this.debtStatus = builder.debtStatus;
            this.expireTime = builder.expireTime;
            this.gmtCreate = builder.gmtCreate;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.ipType = builder.ipType;
            this.logExt = builder.logExt;
            this.product = builder.product;
            this.remark = builder.remark;
            this.resourceGroupId = builder.resourceGroupId;
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
         * @return debtStatus
         */
        public Long getDebtStatus() {
            return this.debtStatus;
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
         * @return logExt
         */
        public String getLogExt() {
            return this.logExt;
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
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
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
            private Long debtStatus; 
            private Long expireTime; 
            private Long gmtCreate; 
            private String instanceId; 
            private String instanceType; 
            private String ipType; 
            private String logExt; 
            private String product; 
            private String remark; 
            private String resourceGroupId; 
            private String status; 

            private Builder() {
            } 

            private Builder(InstanceList model) {
                this.autoProtectCondition = model.autoProtectCondition;
                this.autoRenewal = model.autoRenewal;
                this.blackholdingCount = model.blackholdingCount;
                this.commodityType = model.commodityType;
                this.coverageType = model.coverageType;
                this.debtStatus = model.debtStatus;
                this.expireTime = model.expireTime;
                this.gmtCreate = model.gmtCreate;
                this.instanceId = model.instanceId;
                this.instanceType = model.instanceType;
                this.ipType = model.ipType;
                this.logExt = model.logExt;
                this.product = model.product;
                this.remark = model.remark;
                this.resourceGroupId = model.resourceGroupId;
                this.status = model.status;
            } 

            /**
             * <p>The automatic binding condition.</p>
             */
            public Builder autoProtectCondition(AutoProtectCondition autoProtectCondition) {
                this.autoProtectCondition = autoProtectCondition;
                return this;
            }

            /**
             * <p>Indicates whether auto-renewal is enabled for the instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Enabled.</li>
             * <li><strong>false</strong>: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder autoRenewal(Boolean autoRenewal) {
                this.autoRenewal = autoRenewal;
                return this;
            }

            /**
             * <p>The number of IP addresses that are in blackhole filtering status among the assets that are assigned public IP addresses protected by the instance.</p>
             * <blockquote>
             * <p>You can invoke <a href="https://help.aliyun.com/document_detail/118692.html">DeleteBlackhole</a> to deactivate blackhole filtering for a single protected IP address.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder blackholdingCount(String blackholdingCount) {
                this.blackholdingCount = blackholdingCount;
                return this;
            }

            /**
             * <p>The commodity type of the instance.</p>
             * <ul>
             * <li><strong>ddos_ddosorigin_public_cn</strong>: Anti-DDoS Origin 2.0 (Pay-as-you-go) China site.</li>
             * <li><strong>ddos_ddosorigin_public_intl</strong>: Anti-DDoS Origin 2.0 (Pay-as-you-go) International site.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ddos_ddosorigin_public_cn</p>
             */
            public Builder commodityType(String commodityType) {
                this.commodityType = commodityType;
                return this;
            }

            /**
             * <p>The asset overwrite type of the instance.</p>
             * <ul>
             * <li><strong>1</strong>: Supports assets that are assigned public IP addresses in multiple regions globally.</li>
             * <li><strong>2</strong>: Supports assets that are assigned public IP addresses in multiple regions in the Chinese mainland.</li>
             * <li><strong>3</strong>: Supports assets that are assigned public IP addresses in multiple regions outside the Chinese mainland.</li>
             * <li><strong>4</strong>: Supports assets that are assigned public IP addresses in a single region globally.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder coverageType(Integer coverageType) {
                this.coverageType = coverageType;
                return this;
            }

            /**
             * <p>The overdue payment status. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: No overdue payment.</li>
             * <li><strong>1</strong>: Overdue payment.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder debtStatus(Long debtStatus) {
                this.debtStatus = debtStatus;
                return this;
            }

            /**
             * <p>The expiration time of the instance. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1640275200000</p>
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The purchase time of the instance. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1592886047000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ddosbgp-cn-oew1pjrk****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The mitigation plan type of the instance. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Professional.</li>
             * <li><strong>1</strong>: Enterprise.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The protocol type of the IP assets protected by the instance. Valid values:</p>
             * <ul>
             * <li><strong>IPv4</strong>: IPv4 protocol.</li>
             * <li><strong>IPv6</strong>: IPv6 protocol.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IPv4</p>
             */
            public Builder ipType(String ipType) {
                this.ipType = ipType;
                return this;
            }

            /**
             * <p>The full logs property.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;mitigationAnalysis\&quot;:\&quot;on\&quot;,\&quot;mitigationAnalysisCapacity\&quot;:1,\&quot;ttl\&quot;:180}</p>
             */
            public Builder logExt(String logExt) {
                this.logExt = logExt;
                return this;
            }

            /**
             * <p>The type of the cloud service associated with the instance. This parameter is not returned by default. It is returned only when the Anti-DDoS Origin instance is created by another cloud service, with the corresponding cloud service code.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><strong>gamebox</strong>: The Anti-DDoS Origin instance is created by Game Security Box.</li>
             * <li><strong>eip</strong>: The Anti-DDoS Origin instance is created by an EIP with Anti-DDoS (Enhanced) enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>gamebox</p>
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * <p>The remark of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aek3ccjxxxxx</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The status of the instance. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Normal.</li>
             * <li><strong>2</strong>: Expired.</li>
             * <li><strong>3</strong>: Released.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
