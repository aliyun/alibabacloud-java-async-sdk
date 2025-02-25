// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

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
         * <p>The details about the Anti-DDoS Origin instances.</p>
         */
        public Builder instanceList(java.util.List < InstanceList> instanceList) {
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
         * <p>The total number of Anti-DDoS Origin instances.</p>
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
             * <p>The events that trigger automatic association.</p>
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
            private String product; 
            private String remark; 
            private String resourceGroupId; 
            private String status; 

            /**
             * <p>The condition that triggers automatic association of the instance with an object.</p>
             */
            public Builder autoProtectCondition(AutoProtectCondition autoProtectCondition) {
                this.autoProtectCondition = autoProtectCondition;
                return this;
            }

            /**
             * <p>Indicates whether auto-renewal is enabled for the instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
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
             * <p>The number of protected public IP addresses for which blackhole filtering is triggered.</p>
             * <blockquote>
             * <p> You can call the <a href="https://help.aliyun.com/document_detail/118692.html">DeleteBlackhole</a> operation to deactivate blackhole filtering for a protected IP address.</p>
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
             * <p>The type of the instance.</p>
             * <ul>
             * <li><strong>ddos_ddosorigin_public_cn</strong>: Anti-DDoS Origin 2.0 (Pay-as-you-go) on the China site (aliyun.com).</li>
             * <li><strong>ddos_ddosorigin_public_intl</strong>: Anti-DDoS Origin 2.0 (Pay-as-you-go) on the International site (alibabacloud.com).</li>
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
             * <p>The application scope of the instance.</p>
             * <ul>
             * <li><strong>1</strong>: The instance supports public IP addresses in all regions.</li>
             * <li><strong>2</strong>: The instance supports public IP addresses in regions in the Chinese mainland.</li>
             * <li><strong>3</strong>: The instance supports public IP addresses in regions outside the Chinese mainland.</li>
             * <li><strong>4</strong>: The instance supports public IP addresses in a region in or outside the Chinese mainland.</li>
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
             * DebtStatus.
             */
            public Builder debtStatus(Long debtStatus) {
                this.debtStatus = debtStatus;
                return this;
            }

            /**
             * <p>The time when the instance expires. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1640275200000</p>
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The time when the instance was purchased. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1592886047000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ddosbgp-cn-oew1pjrk****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The mitigation plan of the instance. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: the Professional mitigation plan</li>
             * <li><strong>1</strong>: the Enterprise mitigation plan</li>
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
             * <p>The protocol type of the IP address asset that is protected by the instance. Valid values:</p>
             * <ul>
             * <li><strong>Ipv4</strong></li>
             * <li><strong>Ipv6</strong></li>
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
             * <p>The type of the cloud service that is associated with the Anti-DDoS Origin instance By default, this parameter is not returned. If the Anti-DDoS Origin instance is created by using a different cloud service, the code of the cloud service is returned.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><strong>gamebox</strong>: The Anti-DDoS Origin instance is created by using Game Security Box.</li>
             * <li><strong>eip</strong>: The Anti-DDoS Origin instance is created by using an elastic IP address (EIP) for which Anti-DDoS (Enhanced Edition) is enabled.</li>
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
             * <p>The description of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The status of the instance. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: normal</li>
             * <li><strong>2</strong>: expired</li>
             * <li><strong>3</strong>: released</li>
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
