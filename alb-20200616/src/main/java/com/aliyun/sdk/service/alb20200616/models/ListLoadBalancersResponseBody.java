// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

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
 * {@link ListLoadBalancersResponseBody} extends {@link TeaModel}
 *
 * <p>ListLoadBalancersResponseBody</p>
 */
public class ListLoadBalancersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LoadBalancers")
    private java.util.List<LoadBalancers> loadBalancers;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListLoadBalancersResponseBody(Builder builder) {
        this.loadBalancers = builder.loadBalancers;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLoadBalancersResponseBody create() {
        return builder().build();
    }

    /**
     * @return loadBalancers
     */
    public java.util.List<LoadBalancers> getLoadBalancers() {
        return this.loadBalancers;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<LoadBalancers> loadBalancers; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>A list of ALB instances.</p>
         */
        public Builder loadBalancers(java.util.List<LoadBalancers> loadBalancers) {
            this.loadBalancers = loadBalancers;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
         * <li>If a value is returned for <strong>NextToken</strong>, the value is used to retrieve a new page of results.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>365F4154-92F6-4AE4-92F8-7FF34B540710</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListLoadBalancersResponseBody build() {
            return new ListLoadBalancersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLoadBalancersResponseBody} extends {@link TeaModel}
     *
     * <p>ListLoadBalancersResponseBody</p>
     */
    public static class AccessLogConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogProject")
        private String logProject;

        @com.aliyun.core.annotation.NameInMap("LogStore")
        private String logStore;

        private AccessLogConfig(Builder builder) {
            this.logProject = builder.logProject;
            this.logStore = builder.logStore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessLogConfig create() {
            return builder().build();
        }

        /**
         * @return logProject
         */
        public String getLogProject() {
            return this.logProject;
        }

        /**
         * @return logStore
         */
        public String getLogStore() {
            return this.logStore;
        }

        public static final class Builder {
            private String logProject; 
            private String logStore; 

            /**
             * <p>The Simple Log Service project.</p>
             * 
             * <strong>example:</strong>
             * <p>sls-setter</p>
             */
            public Builder logProject(String logProject) {
                this.logProject = logProject;
                return this;
            }

            /**
             * <p>The Logstore.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder logStore(String logStore) {
                this.logStore = logStore;
                return this;
            }

            public AccessLogConfig build() {
                return new AccessLogConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListLoadBalancersResponseBody} extends {@link TeaModel}
     *
     * <p>ListLoadBalancersResponseBody</p>
     */
    public static class DeletionProtectionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("EnabledTime")
        private String enabledTime;

        private DeletionProtectionConfig(Builder builder) {
            this.enabled = builder.enabled;
            this.enabledTime = builder.enabledTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeletionProtectionConfig create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return enabledTime
         */
        public String getEnabledTime() {
            return this.enabledTime;
        }

        public static final class Builder {
            private Boolean enabled; 
            private String enabledTime; 

            /**
             * <p>Indicates whether deletion protection is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The time when deletion protection is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-02T02:49:05Z</p>
             */
            public Builder enabledTime(String enabledTime) {
                this.enabledTime = enabledTime;
                return this;
            }

            public DeletionProtectionConfig build() {
                return new DeletionProtectionConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListLoadBalancersResponseBody} extends {@link TeaModel}
     *
     * <p>ListLoadBalancersResponseBody</p>
     */
    public static class LoadBalancerBillingConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        private LoadBalancerBillingConfig(Builder builder) {
            this.payType = builder.payType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoadBalancerBillingConfig create() {
            return builder().build();
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        public static final class Builder {
            private String payType; 

            /**
             * <p>The billing method. Valid values:</p>
             * <p>Only <strong>PostPay</strong> may be returned, which indicates the pay-as-you-go billing method.</p>
             * 
             * <strong>example:</strong>
             * <p>PostPay</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            public LoadBalancerBillingConfig build() {
                return new LoadBalancerBillingConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListLoadBalancersResponseBody} extends {@link TeaModel}
     *
     * <p>ListLoadBalancersResponseBody</p>
     */
    public static class LoadBalancerOperationLocks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LockReason")
        private String lockReason;

        @com.aliyun.core.annotation.NameInMap("LockType")
        private String lockType;

        private LoadBalancerOperationLocks(Builder builder) {
            this.lockReason = builder.lockReason;
            this.lockType = builder.lockType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoadBalancerOperationLocks create() {
            return builder().build();
        }

        /**
         * @return lockReason
         */
        public String getLockReason() {
            return this.lockReason;
        }

        /**
         * @return lockType
         */
        public String getLockType() {
            return this.lockType;
        }

        public static final class Builder {
            private String lockReason; 
            private String lockType; 

            /**
             * <p>The reason why the ALB instance is locked. This parameter is valid only if <strong>LoadBalancerBussinessStatus</strong> is set to <strong>Abnormal</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>Test LockReason</p>
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            /**
             * <p>The lock type. Valid values:</p>
             * <ul>
             * <li><strong>SecurityLocked</strong>: The ALB instance is locked due to security risks.</li>
             * <li><strong>RelatedResourceLocked</strong>: The ALB instance is locked due to other resources associated with the ALB instance.</li>
             * <li><strong>FinancialLocked</strong>: The ALB instance is locked due to overdue payments.</li>
             * <li><strong>ResidualLocked</strong>: The ALB instance is locked because the associated resources have overdue payments and the resources are released.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FinancialLocked</p>
             */
            public Builder lockType(String lockType) {
                this.lockType = lockType;
                return this;
            }

            public LoadBalancerOperationLocks build() {
                return new LoadBalancerOperationLocks(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListLoadBalancersResponseBody} extends {@link TeaModel}
     *
     * <p>ListLoadBalancersResponseBody</p>
     */
    public static class ModificationProtectionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ModificationProtectionConfig(Builder builder) {
            this.reason = builder.reason;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModificationProtectionConfig create() {
            return builder().build();
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String reason; 
            private String status; 

            /**
             * <p>The reason why the configuration read-only mode is enabled.</p>
             * <p>The reason must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-).</p>
             * <p>This parameter is available only if the <strong>ModificationProtectionStatus</strong> parameter is set to <strong>ConsoleProtection</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>Test Reason</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>Indicates whether the configuration read-only mode is enabled for the ALB instance. Valid values:</p>
             * <ul>
             * <li><strong>NonProtection</strong>: Modification protection is disabled. In this case, you cannot set the ModificationProtectionReason parameter. If the ModificationProtectionReason parameter is specified, the value is cleared.</li>
             * <li><strong>ConsoleProtection</strong>: Modification protection is enabled. In this case, you can set the ModificationProtectionReason parameter.</li>
             * </ul>
             * <blockquote>
             * <p> If the value is <strong>ConsoleProtection</strong>, modification protection is enabled. You cannot modify the configurations of the ALB instance in the ALB console. However, you can call API operations to modify the configurations of the ALB instance.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ConsoleProtection</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ModificationProtectionConfig build() {
                return new ModificationProtectionConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListLoadBalancersResponseBody} extends {@link TeaModel}
     *
     * <p>ListLoadBalancersResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The tag key of the ALB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>KeyTest</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the ALB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>alueTest</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListLoadBalancersResponseBody} extends {@link TeaModel}
     *
     * <p>ListLoadBalancersResponseBody</p>
     */
    public static class LoadBalancers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessLogConfig")
        private AccessLogConfig accessLogConfig;

        @com.aliyun.core.annotation.NameInMap("AddressAllocatedMode")
        private String addressAllocatedMode;

        @com.aliyun.core.annotation.NameInMap("AddressIpVersion")
        private String addressIpVersion;

        @com.aliyun.core.annotation.NameInMap("AddressType")
        private String addressType;

        @com.aliyun.core.annotation.NameInMap("BandwidthPackageId")
        private String bandwidthPackageId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DNSName")
        private String DNSName;

        @com.aliyun.core.annotation.NameInMap("DeletionProtectionConfig")
        private DeletionProtectionConfig deletionProtectionConfig;

        @com.aliyun.core.annotation.NameInMap("Ipv6AddressType")
        private String ipv6AddressType;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerBillingConfig")
        private LoadBalancerBillingConfig loadBalancerBillingConfig;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerBussinessStatus")
        private String loadBalancerBussinessStatus;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerEdition")
        private String loadBalancerEdition;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
        private String loadBalancerId;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerName")
        private String loadBalancerName;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerOperationLocks")
        private java.util.List<LoadBalancerOperationLocks> loadBalancerOperationLocks;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerStatus")
        private String loadBalancerStatus;

        @com.aliyun.core.annotation.NameInMap("ModificationProtectionConfig")
        private ModificationProtectionConfig modificationProtectionConfig;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private LoadBalancers(Builder builder) {
            this.accessLogConfig = builder.accessLogConfig;
            this.addressAllocatedMode = builder.addressAllocatedMode;
            this.addressIpVersion = builder.addressIpVersion;
            this.addressType = builder.addressType;
            this.bandwidthPackageId = builder.bandwidthPackageId;
            this.createTime = builder.createTime;
            this.DNSName = builder.DNSName;
            this.deletionProtectionConfig = builder.deletionProtectionConfig;
            this.ipv6AddressType = builder.ipv6AddressType;
            this.loadBalancerBillingConfig = builder.loadBalancerBillingConfig;
            this.loadBalancerBussinessStatus = builder.loadBalancerBussinessStatus;
            this.loadBalancerEdition = builder.loadBalancerEdition;
            this.loadBalancerId = builder.loadBalancerId;
            this.loadBalancerName = builder.loadBalancerName;
            this.loadBalancerOperationLocks = builder.loadBalancerOperationLocks;
            this.loadBalancerStatus = builder.loadBalancerStatus;
            this.modificationProtectionConfig = builder.modificationProtectionConfig;
            this.resourceGroupId = builder.resourceGroupId;
            this.tags = builder.tags;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoadBalancers create() {
            return builder().build();
        }

        /**
         * @return accessLogConfig
         */
        public AccessLogConfig getAccessLogConfig() {
            return this.accessLogConfig;
        }

        /**
         * @return addressAllocatedMode
         */
        public String getAddressAllocatedMode() {
            return this.addressAllocatedMode;
        }

        /**
         * @return addressIpVersion
         */
        public String getAddressIpVersion() {
            return this.addressIpVersion;
        }

        /**
         * @return addressType
         */
        public String getAddressType() {
            return this.addressType;
        }

        /**
         * @return bandwidthPackageId
         */
        public String getBandwidthPackageId() {
            return this.bandwidthPackageId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return DNSName
         */
        public String getDNSName() {
            return this.DNSName;
        }

        /**
         * @return deletionProtectionConfig
         */
        public DeletionProtectionConfig getDeletionProtectionConfig() {
            return this.deletionProtectionConfig;
        }

        /**
         * @return ipv6AddressType
         */
        public String getIpv6AddressType() {
            return this.ipv6AddressType;
        }

        /**
         * @return loadBalancerBillingConfig
         */
        public LoadBalancerBillingConfig getLoadBalancerBillingConfig() {
            return this.loadBalancerBillingConfig;
        }

        /**
         * @return loadBalancerBussinessStatus
         */
        public String getLoadBalancerBussinessStatus() {
            return this.loadBalancerBussinessStatus;
        }

        /**
         * @return loadBalancerEdition
         */
        public String getLoadBalancerEdition() {
            return this.loadBalancerEdition;
        }

        /**
         * @return loadBalancerId
         */
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        /**
         * @return loadBalancerName
         */
        public String getLoadBalancerName() {
            return this.loadBalancerName;
        }

        /**
         * @return loadBalancerOperationLocks
         */
        public java.util.List<LoadBalancerOperationLocks> getLoadBalancerOperationLocks() {
            return this.loadBalancerOperationLocks;
        }

        /**
         * @return loadBalancerStatus
         */
        public String getLoadBalancerStatus() {
            return this.loadBalancerStatus;
        }

        /**
         * @return modificationProtectionConfig
         */
        public ModificationProtectionConfig getModificationProtectionConfig() {
            return this.modificationProtectionConfig;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private AccessLogConfig accessLogConfig; 
            private String addressAllocatedMode; 
            private String addressIpVersion; 
            private String addressType; 
            private String bandwidthPackageId; 
            private String createTime; 
            private String DNSName; 
            private DeletionProtectionConfig deletionProtectionConfig; 
            private String ipv6AddressType; 
            private LoadBalancerBillingConfig loadBalancerBillingConfig; 
            private String loadBalancerBussinessStatus; 
            private String loadBalancerEdition; 
            private String loadBalancerId; 
            private String loadBalancerName; 
            private java.util.List<LoadBalancerOperationLocks> loadBalancerOperationLocks; 
            private String loadBalancerStatus; 
            private ModificationProtectionConfig modificationProtectionConfig; 
            private String resourceGroupId; 
            private java.util.List<Tags> tags; 
            private String vpcId; 

            /**
             * <p>The configurations of access logs.</p>
             */
            public Builder accessLogConfig(AccessLogConfig accessLogConfig) {
                this.accessLogConfig = accessLogConfig;
                return this;
            }

            /**
             * <p>The mode in which IP addresses are allocated. Valid values:</p>
             * <ul>
             * <li><strong>Fixed</strong>: The ALB instance uses a static IP address.</li>
             * <li><strong>Dynamic</strong>: dynamically allocates an IP address to each zone of the ALB instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Fixed</p>
             */
            public Builder addressAllocatedMode(String addressAllocatedMode) {
                this.addressAllocatedMode = addressAllocatedMode;
                return this;
            }

            /**
             * <p>The IP version. Valid values:</p>
             * <ul>
             * <li><strong>IPv4</strong></li>
             * <li><strong>DualStack</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DualStack</p>
             */
            public Builder addressIpVersion(String addressIpVersion) {
                this.addressIpVersion = addressIpVersion;
                return this;
            }

            /**
             * <p>The type of IP address that the ALB instance uses to provide services. Valid values:</p>
             * <ul>
             * <li><strong>Internet</strong>: The ALB instance is assigned a public IP address. The domain name is resolved to the public IP address. The ALB instance is accessible over the Internet.</li>
             * <li><strong>Intranet</strong>: The ALB instance is assigned only a private IP address. The domain name is resolved to the private IP address. The ALB instance is accessible only within the VPC of the ALB instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Intranet</p>
             */
            public Builder addressType(String addressType) {
                this.addressType = addressType;
                return this;
            }

            /**
             * <p>The ID of the Internet Shared Bandwidth instance that is associated with the Internet-facing ALB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cbwp-bp1vevu8h3ieh****</p>
             */
            public Builder bandwidthPackageId(String bandwidthPackageId) {
                this.bandwidthPackageId = bandwidthPackageId;
                return this;
            }

            /**
             * <p>The time when the resource was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-02T02:49:05Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>alb-95qnr2itwu9orb****.cn-hangzhou.alb.aliyuncs.com</p>
             */
            public Builder DNSName(String DNSName) {
                this.DNSName = DNSName;
                return this;
            }

            /**
             * <p>The configuration of the deletion protection feature.</p>
             */
            public Builder deletionProtectionConfig(DeletionProtectionConfig deletionProtectionConfig) {
                this.deletionProtectionConfig = deletionProtectionConfig;
                return this;
            }

            /**
             * <p>The type of IPv6 address used by the ALB instance. Valid values:</p>
             * <ul>
             * <li><strong>Internet</strong> The ALB instance is assigned a public IP address. The domain name is resolved to the public IP address. The ALB instance is accessible over the Internet.</li>
             * <li><strong>Intranet</strong> The ALB instance is assigned only a private IP address. The domain name is resolved to the private IP address. The ALB instance is accessible only within the VPC of the ALB instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Intranet</p>
             */
            public Builder ipv6AddressType(String ipv6AddressType) {
                this.ipv6AddressType = ipv6AddressType;
                return this;
            }

            /**
             * <p>The billing information about the ALB instance.</p>
             */
            public Builder loadBalancerBillingConfig(LoadBalancerBillingConfig loadBalancerBillingConfig) {
                this.loadBalancerBillingConfig = loadBalancerBillingConfig;
                return this;
            }

            /**
             * <p>The status of the ALB instance. Valid values:</p>
             * <ul>
             * <li><strong>Abnormal</strong></li>
             * <li><strong>Normal</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder loadBalancerBussinessStatus(String loadBalancerBussinessStatus) {
                this.loadBalancerBussinessStatus = loadBalancerBussinessStatus;
                return this;
            }

            /**
             * <p>The edition of the ALB instance. The features and billing rules vary based on the edition. Valid values:</p>
             * <ul>
             * <li><strong>Basic</strong></li>
             * <li><strong>Standard</strong></li>
             * <li><strong>StandardWithWaf</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Standard</p>
             */
            public Builder loadBalancerEdition(String loadBalancerEdition) {
                this.loadBalancerEdition = loadBalancerEdition;
                return this;
            }

            /**
             * <p>The ID of the ALB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>alb-o9ulmq5hgn68jk****</p>
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * <p>The name of the ALB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>alb-instance-test</p>
             */
            public Builder loadBalancerName(String loadBalancerName) {
                this.loadBalancerName = loadBalancerName;
                return this;
            }

            /**
             * <p>The configuration of the operation lock.</p>
             */
            public Builder loadBalancerOperationLocks(java.util.List<LoadBalancerOperationLocks> loadBalancerOperationLocks) {
                this.loadBalancerOperationLocks = loadBalancerOperationLocks;
                return this;
            }

            /**
             * <p>The status of the ALB instance. Valid values:</p>
             * <ul>
             * <li><strong>Inactive</strong>: The ALB instance is disabled. ALB instances in the Inactive state do not forward traffic.</li>
             * <li><strong>Active</strong>: The ALB instance is running.</li>
             * <li><strong>Provisioning</strong>: The ALB instance is being created.</li>
             * <li><strong>Configuring</strong>: The ALB instance is being modified.</li>
             * <li><strong>CreateFailed</strong>: The system failed to create the ALB instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder loadBalancerStatus(String loadBalancerStatus) {
                this.loadBalancerStatus = loadBalancerStatus;
                return this;
            }

            /**
             * <p>The configuration of modification protection.</p>
             */
            public Builder modificationProtectionConfig(ModificationProtectionConfig modificationProtectionConfig) {
                this.modificationProtectionConfig = modificationProtectionConfig;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-atstuj3rtop****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The information about the tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The ID of the VPC in which the ALB instance is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1b49rqrybk45nio****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public LoadBalancers build() {
                return new LoadBalancers(this);
            } 

        } 

    }
}
