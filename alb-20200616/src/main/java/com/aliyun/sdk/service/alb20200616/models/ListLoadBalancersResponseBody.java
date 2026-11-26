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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListLoadBalancersResponseBody model) {
            this.loadBalancers = model.loadBalancers;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of Application Load Balancing instances.</p>
         */
        public Builder loadBalancers(java.util.List<LoadBalancers> loadBalancers) {
            this.loadBalancers = loadBalancers;
            return this;
        }

        /**
         * <p>The maximum number of entries returned per request.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>Indicates whether a next token is returned for subsequent queries. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no subsequent query is available.</li>
         * <li>If <strong>NextToken</strong> is returned, the value indicates the token used to start the next query.</li>
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
         * <p>The total number of entries.</p>
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

            private Builder() {
            } 

            private Builder(AccessLogConfig model) {
                this.logProject = model.logProject;
                this.logStore = model.logStore;
            } 

            /**
             * <p>The log project.</p>
             * 
             * <strong>example:</strong>
             * <p>sls-setter</p>
             */
            public Builder logProject(String logProject) {
                this.logProject = logProject;
                return this;
            }

            /**
             * <p>The log store.</p>
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

            private Builder() {
            } 

            private Builder(DeletionProtectionConfig model) {
                this.enabled = model.enabled;
                this.enabledTime = model.enabledTime;
            } 

            /**
             * <p>The deletion protection status. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: Enabled.</p>
             * </li>
             * <li><p><strong>false</strong>: Disabled.</p>
             * </li>
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
             * <p>The time when deletion protection was enabled. The time is displayed in UTC and follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format.</p>
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

            private Builder() {
            } 

            private Builder(LoadBalancerBillingConfig model) {
                this.payType = model.payType;
            } 

            /**
             * <p>The billing method. Valid values:</p>
             * <ul>
             * <li><strong>PostPay</strong>: pay-as-you-go billing method.</li>
             * </ul>
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

            private Builder() {
            } 

            private Builder(LoadBalancerOperationLocks model) {
                this.lockReason = model.lockReason;
                this.lockType = model.lockType;
            } 

            /**
             * <p>The reason for the lock. This parameter is valid only when <strong>LoadBalancerBussinessStatus</strong> is set to <strong>Abnormal</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>Overdue payment</p>
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            /**
             * <p>The type of the lock. Valid values:</p>
             * <ul>
             * <li><p><strong>SecurityLocked</strong>: Security lock.</p>
             * </li>
             * <li><p><strong>RelatedResourceLocked</strong>: Associated resource lock.</p>
             * </li>
             * <li><p><strong>FinancialLocked</strong>: Financial lock.</p>
             * </li>
             * <li><p><strong>ResidualLocked</strong>: Residual lock.</p>
             * </li>
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

            private Builder() {
            } 

            private Builder(ModificationProtectionConfig model) {
                this.reason = model.reason;
                this.status = model.status;
            } 

            /**
             * <p>The reason for enabling modification protection.</p>
             * <p>The value must be 2 to 128 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter.</p>
             * <p>This parameter is returned only when <strong>Status</strong> is set to <strong>ConsoleProtection</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>Managed Instance</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The modification protection status of the Application Load Balancing instance. Valid values:</p>
             * <ul>
             * <li><p><strong>NonProtection</strong>: Modification protection is disabled. If <strong>Reason</strong> is configured, <strong>Reason</strong> is forcibly cleared.</p>
             * </li>
             * <li><p><strong>ConsoleProtection</strong>: Console modification protection is enabled. If <strong>Reason</strong> is configured, <strong>Reason</strong> takes effect.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>When this parameter is set to <strong>ConsoleProtection</strong>, modification protection is enabled. Users cannot modify the instance configuration in the load balancing console, but can invoke API operations to modify the instance configuration.</p>
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>KeyTest</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the instance.</p>
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
    public static class LoadBalancerAddresses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("AllocationId")
        private String allocationId;

        @com.aliyun.core.annotation.NameInMap("EipType")
        private String eipType;

        @com.aliyun.core.annotation.NameInMap("IntranetAddress")
        private String intranetAddress;

        @com.aliyun.core.annotation.NameInMap("IntranetAddressHcStatus")
        private String intranetAddressHcStatus;

        @com.aliyun.core.annotation.NameInMap("Ipv6Address")
        private String ipv6Address;

        @com.aliyun.core.annotation.NameInMap("Ipv6AddressHcStatus")
        private String ipv6AddressHcStatus;

        private LoadBalancerAddresses(Builder builder) {
            this.address = builder.address;
            this.allocationId = builder.allocationId;
            this.eipType = builder.eipType;
            this.intranetAddress = builder.intranetAddress;
            this.intranetAddressHcStatus = builder.intranetAddressHcStatus;
            this.ipv6Address = builder.ipv6Address;
            this.ipv6AddressHcStatus = builder.ipv6AddressHcStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoadBalancerAddresses create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return allocationId
         */
        public String getAllocationId() {
            return this.allocationId;
        }

        /**
         * @return eipType
         */
        public String getEipType() {
            return this.eipType;
        }

        /**
         * @return intranetAddress
         */
        public String getIntranetAddress() {
            return this.intranetAddress;
        }

        /**
         * @return intranetAddressHcStatus
         */
        public String getIntranetAddressHcStatus() {
            return this.intranetAddressHcStatus;
        }

        /**
         * @return ipv6Address
         */
        public String getIpv6Address() {
            return this.ipv6Address;
        }

        /**
         * @return ipv6AddressHcStatus
         */
        public String getIpv6AddressHcStatus() {
            return this.ipv6AddressHcStatus;
        }

        public static final class Builder {
            private String address; 
            private String allocationId; 
            private String eipType; 
            private String intranetAddress; 
            private String intranetAddressHcStatus; 
            private String ipv6Address; 
            private String ipv6AddressHcStatus; 

            private Builder() {
            } 

            private Builder(LoadBalancerAddresses model) {
                this.address = model.address;
                this.allocationId = model.allocationId;
                this.eipType = model.eipType;
                this.intranetAddress = model.intranetAddress;
                this.intranetAddressHcStatus = model.intranetAddressHcStatus;
                this.ipv6Address = model.ipv6Address;
                this.ipv6AddressHcStatus = model.ipv6AddressHcStatus;
            } 

            /**
             * <p>The IPv4 address.</p>
             * 
             * <strong>example:</strong>
             * <p>10.1.0.61</p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>The allocation ID of the elastic IP address (EIP).</p>
             * 
             * <strong>example:</strong>
             * <p>eip-uf6wm****1zj9</p>
             */
            public Builder allocationId(String allocationId) {
                this.allocationId = allocationId;
                return this;
            }

            /**
             * <p>The type of the EIP.</p>
             * 
             * <strong>example:</strong>
             * <p>Common</p>
             */
            public Builder eipType(String eipType) {
                this.eipType = eipType;
                return this;
            }

            /**
             * <p>The IPv4 private network address.</p>
             * 
             * <strong>example:</strong>
             * <p>10.1.0.61</p>
             */
            public Builder intranetAddress(String intranetAddress) {
                this.intranetAddress = intranetAddress;
                return this;
            }

            /**
             * <p>The health check status of the private network IPv4 address for the Application Load Balancer instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Healthy</p>
             */
            public Builder intranetAddressHcStatus(String intranetAddressHcStatus) {
                this.intranetAddressHcStatus = intranetAddressHcStatus;
                return this;
            }

            /**
             * <p>The IPv6 address.</p>
             * 
             * <strong>example:</strong>
             * <p>2408:xxxx:249:dd01:6f4:750f:xxxx:bcd9</p>
             */
            public Builder ipv6Address(String ipv6Address) {
                this.ipv6Address = ipv6Address;
                return this;
            }

            /**
             * <p>The health check status of the IPv6 address for the Application Load Balancer instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Healthy</p>
             */
            public Builder ipv6AddressHcStatus(String ipv6AddressHcStatus) {
                this.ipv6AddressHcStatus = ipv6AddressHcStatus;
                return this;
            }

            public LoadBalancerAddresses build() {
                return new LoadBalancerAddresses(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListLoadBalancersResponseBody} extends {@link TeaModel}
     *
     * <p>ListLoadBalancersResponseBody</p>
     */
    public static class ZoneMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LoadBalancerAddresses")
        private java.util.List<LoadBalancerAddresses> loadBalancerAddresses;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private ZoneMappings(Builder builder) {
            this.loadBalancerAddresses = builder.loadBalancerAddresses;
            this.status = builder.status;
            this.vSwitchId = builder.vSwitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZoneMappings create() {
            return builder().build();
        }

        /**
         * @return loadBalancerAddresses
         */
        public java.util.List<LoadBalancerAddresses> getLoadBalancerAddresses() {
            return this.loadBalancerAddresses;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private java.util.List<LoadBalancerAddresses> loadBalancerAddresses; 
            private String status; 
            private String vSwitchId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(ZoneMappings model) {
                this.loadBalancerAddresses = model.loadBalancerAddresses;
                this.status = model.status;
                this.vSwitchId = model.vSwitchId;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The instance addresses.</p>
             */
            public Builder loadBalancerAddresses(java.util.List<LoadBalancerAddresses> loadBalancerAddresses) {
                this.loadBalancerAddresses = loadBalancerAddresses;
                return this;
            }

            /**
             * <p>The status of the zone.</p>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the vSwitch in the zone. Each zone supports only one vSwitch and one subnet.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp12mw1f8k3jgy****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The zone ID of the Application Load Balancer instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-a</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ZoneMappings build() {
                return new ZoneMappings(this);
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

        @com.aliyun.core.annotation.NameInMap("SecurityGroupIds")
        private java.util.List<String> securityGroupIds;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("ZoneMappings")
        private java.util.List<ZoneMappings> zoneMappings;

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
            this.securityGroupIds = builder.securityGroupIds;
            this.tags = builder.tags;
            this.vpcId = builder.vpcId;
            this.zoneMappings = builder.zoneMappings;
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
         * @return securityGroupIds
         */
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
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

        /**
         * @return zoneMappings
         */
        public java.util.List<ZoneMappings> getZoneMappings() {
            return this.zoneMappings;
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
            private java.util.List<String> securityGroupIds; 
            private java.util.List<Tags> tags; 
            private String vpcId; 
            private java.util.List<ZoneMappings> zoneMappings; 

            private Builder() {
            } 

            private Builder(LoadBalancers model) {
                this.accessLogConfig = model.accessLogConfig;
                this.addressAllocatedMode = model.addressAllocatedMode;
                this.addressIpVersion = model.addressIpVersion;
                this.addressType = model.addressType;
                this.bandwidthPackageId = model.bandwidthPackageId;
                this.createTime = model.createTime;
                this.DNSName = model.DNSName;
                this.deletionProtectionConfig = model.deletionProtectionConfig;
                this.ipv6AddressType = model.ipv6AddressType;
                this.loadBalancerBillingConfig = model.loadBalancerBillingConfig;
                this.loadBalancerBussinessStatus = model.loadBalancerBussinessStatus;
                this.loadBalancerEdition = model.loadBalancerEdition;
                this.loadBalancerId = model.loadBalancerId;
                this.loadBalancerName = model.loadBalancerName;
                this.loadBalancerOperationLocks = model.loadBalancerOperationLocks;
                this.loadBalancerStatus = model.loadBalancerStatus;
                this.modificationProtectionConfig = model.modificationProtectionConfig;
                this.resourceGroupId = model.resourceGroupId;
                this.securityGroupIds = model.securityGroupIds;
                this.tags = model.tags;
                this.vpcId = model.vpcId;
                this.zoneMappings = model.zoneMappings;
            } 

            /**
             * <p>The access log configuration structure.</p>
             */
            public Builder accessLogConfig(AccessLogConfig accessLogConfig) {
                this.accessLogConfig = accessLogConfig;
                return this;
            }

            /**
             * <p>The address mode. Valid values:</p>
             * <ul>
             * <li><p><strong>Fixed</strong>: Fixed IP mode. Indicates that a fixed IP address is used.</p>
             * </li>
             * <li><p><strong>Dynamic</strong>: Dynamic IP mode. Indicates that an IP address is dynamically allocated to each zone.</p>
             * </li>
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
             * <li><p><strong>IPv4</strong>: IPv4.</p>
             * </li>
             * <li><p><strong>DualStack</strong>: Dual-stack.</p>
             * </li>
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
             * <p>The address type of the load balancing instance. Valid values:</p>
             * <ul>
             * <li><p><strong>Internet</strong>: The load balancing instance has a public IP address. The DNS domain name is parsed to the public IP address, so it can be accessed in the public network environment.</p>
             * </li>
             * <li><p><strong>Intranet</strong>: The load balancing instance has only a private IP address. The DNS domain name is parsed to the private IP address, so it can only be accessed in the internal network environment of the VPC where the load balancing instance is deployed.</p>
             * </li>
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
             * <p>The ID of the Internet Shared Bandwidth plan associated with the Internet-facing instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cbwp-bp1vevu8h3ieh****</p>
             */
            public Builder bandwidthPackageId(String bandwidthPackageId) {
                this.bandwidthPackageId = bandwidthPackageId;
                return this;
            }

            /**
             * <p>The time when the resource was created. The time is displayed in UTC and follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-02T02:49:05Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The DNS domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>alb-95qnr2itwu9orb****.cn-hangzhou.alb.aliyuncs.com</p>
             */
            public Builder DNSName(String DNSName) {
                this.DNSName = DNSName;
                return this;
            }

            /**
             * <p>The deletion protection configuration.</p>
             */
            public Builder deletionProtectionConfig(DeletionProtectionConfig deletionProtectionConfig) {
                this.deletionProtectionConfig = deletionProtectionConfig;
                return this;
            }

            /**
             * <p>The IPv6 network address type of the Application Load Balancing instance. Valid values:</p>
             * <ul>
             * <li><p><strong>Internet</strong>: Internet. The load balancing instance has a public IP address. The DNS domain name is parsed to the public IP address, so it can be accessed in the public network environment.</p>
             * </li>
             * <li><p><strong>Intranet</strong>: Private network. The load balancing instance has only a private IP address. The DNS domain name is parsed to the private IP address, so it can only be accessed in the internal network environment of the VPC where the load balancing instance is deployed.</p>
             * </li>
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
             * <p>The billing configuration of the load balancing instance.</p>
             */
            public Builder loadBalancerBillingConfig(LoadBalancerBillingConfig loadBalancerBillingConfig) {
                this.loadBalancerBillingConfig = loadBalancerBillingConfig;
                return this;
            }

            /**
             * <p>The business status of the load balancing instance. Valid values:</p>
             * <ul>
             * <li><p><strong>Abnormal</strong>: Abnormal.</p>
             * </li>
             * <li><p><strong>Normal</strong>: Normal.</p>
             * </li>
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
             * <p>The edition of the load balancing instance. Different editions have different feature limits and billing policy. Valid values:</p>
             * <ul>
             * <li><p><strong>Basic</strong>: Basic Edition.</p>
             * </li>
             * <li><p><strong>Standard</strong>: Standard Edition.</p>
             * </li>
             * <li><p><strong>StandardWithWaf</strong>: WAF-enhanced Edition.</p>
             * </li>
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
             * <p>The instance ID of the Application Load Balancing instance.</p>
             * 
             * <strong>example:</strong>
             * <p>alb-o9ulmq5hgn68jk****</p>
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * <p>The name of the load balancing instance.</p>
             * 
             * <strong>example:</strong>
             * <p>alb-instance-test</p>
             */
            public Builder loadBalancerName(String loadBalancerName) {
                this.loadBalancerName = loadBalancerName;
                return this;
            }

            /**
             * <p>The operation lock configuration of the load balancing instance.</p>
             */
            public Builder loadBalancerOperationLocks(java.util.List<LoadBalancerOperationLocks> loadBalancerOperationLocks) {
                this.loadBalancerOperationLocks = loadBalancerOperationLocks;
                return this;
            }

            /**
             * <p>The instance status of the Application Load Balancing instance. Valid values:</p>
             * <ul>
             * <li><p><strong>Inactive</strong>: Stopped. Indicates that the listeners of the instance no longer forward traffic.</p>
             * </li>
             * <li><p><strong>Active</strong>: Running.</p>
             * </li>
             * <li><p><strong>Provisioning</strong>: Creating.</p>
             * </li>
             * <li><p><strong>Configuring</strong>: Upgrade/Downgrade.</p>
             * </li>
             * <li><p><strong>CreateFailed</strong>: Creation failed.</p>
             * </li>
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
             * <p>The modification protection configuration.</p>
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
             * <p>The security groups to which the Application Load Balancing instance is added.</p>
             */
            public Builder securityGroupIds(java.util.List<String> securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * <p>The list of tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC) where the Application Load Balancing instance is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1b49rqryhk45nio****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The list of zone and vSwitch mappings. A maximum of 10 zones can be returned. If the current region supports two or more zones, at least two zones are returned.</p>
             */
            public Builder zoneMappings(java.util.List<ZoneMappings> zoneMappings) {
                this.zoneMappings = zoneMappings;
                return this;
            }

            public LoadBalancers build() {
                return new LoadBalancers(this);
            } 

        } 

    }
}
