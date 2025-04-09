// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430.models;

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
         * <p>The NLB instances.</p>
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
         * <p>The token that determines the start point of the next query. Valid values:</p>
         * <ul>
         * <li>If this is your first query and no subsequent queries are to be sent, ignore this parameter.</li>
         * <li>If a subsequent query is to be sent, set the parameter to the value of NextToken that is returned from the last call.</li>
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
    public static class DeletionProtectionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("EnabledTime")
        private String enabledTime;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        private DeletionProtectionConfig(Builder builder) {
            this.enabled = builder.enabled;
            this.enabledTime = builder.enabledTime;
            this.reason = builder.reason;
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

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        public static final class Builder {
            private Boolean enabled; 
            private String enabledTime; 
            private String reason; 

            private Builder() {
            } 

            private Builder(DeletionProtectionConfig model) {
                this.enabled = model.enabled;
                this.enabledTime = model.enabledTime;
                this.reason = model.reason;
            } 

            /**
             * <p>Indicates whether deletion protection is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: enabled</li>
             * <li><strong>false</strong>: disabled</li>
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
             * <p>The time when deletion protection was enabled. The time is displayed in UTC in <code>yyyy-MM-ddTHH:mm:ssZ</code> format.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-12-01T17:22Z</p>
             */
            public Builder enabledTime(String enabledTime) {
                this.enabledTime = enabledTime;
                return this;
            }

            /**
             * <p>The reason why the deletion protection feature is enabled or disabled. The reason must be 2 to 128 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The reason must start with a letter.</p>
             * 
             * <strong>example:</strong>
             * <p>The instance is running</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
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
             * <p>The billing method of the NLB instance. Only <strong>PostPay</strong> is supported, which indicates the pay-as-you-go billing method.</p>
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
    public static class ModificationProtectionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnabledTime")
        private String enabledTime;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ModificationProtectionConfig(Builder builder) {
            this.enabledTime = builder.enabledTime;
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
         * @return enabledTime
         */
        public String getEnabledTime() {
            return this.enabledTime;
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
            private String enabledTime; 
            private String reason; 
            private String status; 

            private Builder() {
            } 

            private Builder(ModificationProtectionConfig model) {
                this.enabledTime = model.enabledTime;
                this.reason = model.reason;
                this.status = model.status;
            } 

            /**
             * <p>The time when the configuration read-only mode was enabled. The time is displayed in UTC in <code>yyyy-MM-ddTHH:mm:ssZ</code> format.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-12-01T17:22Z</p>
             */
            public Builder enabledTime(String enabledTime) {
                this.enabledTime = enabledTime;
                return this;
            }

            /**
             * <p>The reason why the configuration read-only mode is enabled. The reason must be 2 to 128 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The reason must start with a letter.</p>
             * <p>This parameter takes effect only if <strong>Status</strong> is set to <strong>ConsoleProtection</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>Service guarantee period</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>Indicates whether the configuration read-only mode is enabled. Valid values:</p>
             * <ul>
             * <li><strong>NonProtection</strong>: disabled. In this case, <strong>Reason</strong> is not returned. If <strong>Reason</strong> is set, the value is cleared.</li>
             * <li><strong>ConsoleProtection</strong>: enabled. In this case, <strong>Reason</strong> is returned.</li>
             * </ul>
             * <blockquote>
             * <p> If you set this parameter to <strong>ConsoleProtection</strong>, you cannot use the NLB console to modify instance configurations. However, you can call API operations to modify instance configurations.</p>
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
    public static class OperationLocks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LockReason")
        private String lockReason;

        @com.aliyun.core.annotation.NameInMap("LockType")
        private String lockType;

        private OperationLocks(Builder builder) {
            this.lockReason = builder.lockReason;
            this.lockType = builder.lockType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationLocks create() {
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

            private Builder(OperationLocks model) {
                this.lockReason = model.lockReason;
                this.lockType = model.lockType;
            } 

            /**
             * <p>The reason why the NLB instance is locked.</p>
             * 
             * <strong>example:</strong>
             * <p>Service exception</p>
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            /**
             * <p>The type of lock. Valid values:</p>
             * <ul>
             * <li><strong>SecurityLocked</strong>: The NLB instance is locked due to security reasons.</li>
             * <li><strong>RelatedResourceLocked</strong>: The NLB instance is locked due to association issues.</li>
             * <li><strong>FinancialLocked</strong>: The NLB instance is locked due to overdue payments.</li>
             * <li><strong>ResidualLocked</strong>: The NLB instance is locked because the payments of the associated resources are overdue and the resources are released.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SecurityLocked</p>
             */
            public Builder lockType(String lockType) {
                this.lockType = lockType;
                return this;
            }

            public OperationLocks build() {
                return new OperationLocks(this);
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>KeyTest</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>ValueTest</p>
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
        @com.aliyun.core.annotation.NameInMap("AllocationId")
        private String allocationId;

        @com.aliyun.core.annotation.NameInMap("EniId")
        private String eniId;

        @com.aliyun.core.annotation.NameInMap("Ipv6Address")
        private String ipv6Address;

        @com.aliyun.core.annotation.NameInMap("PrivateIPv4Address")
        private String privateIPv4Address;

        @com.aliyun.core.annotation.NameInMap("PrivateIPv4HcStatus")
        private String privateIPv4HcStatus;

        @com.aliyun.core.annotation.NameInMap("PrivateIPv6HcStatus")
        private String privateIPv6HcStatus;

        @com.aliyun.core.annotation.NameInMap("PublicIPv4Address")
        private String publicIPv4Address;

        private LoadBalancerAddresses(Builder builder) {
            this.allocationId = builder.allocationId;
            this.eniId = builder.eniId;
            this.ipv6Address = builder.ipv6Address;
            this.privateIPv4Address = builder.privateIPv4Address;
            this.privateIPv4HcStatus = builder.privateIPv4HcStatus;
            this.privateIPv6HcStatus = builder.privateIPv6HcStatus;
            this.publicIPv4Address = builder.publicIPv4Address;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoadBalancerAddresses create() {
            return builder().build();
        }

        /**
         * @return allocationId
         */
        public String getAllocationId() {
            return this.allocationId;
        }

        /**
         * @return eniId
         */
        public String getEniId() {
            return this.eniId;
        }

        /**
         * @return ipv6Address
         */
        public String getIpv6Address() {
            return this.ipv6Address;
        }

        /**
         * @return privateIPv4Address
         */
        public String getPrivateIPv4Address() {
            return this.privateIPv4Address;
        }

        /**
         * @return privateIPv4HcStatus
         */
        public String getPrivateIPv4HcStatus() {
            return this.privateIPv4HcStatus;
        }

        /**
         * @return privateIPv6HcStatus
         */
        public String getPrivateIPv6HcStatus() {
            return this.privateIPv6HcStatus;
        }

        /**
         * @return publicIPv4Address
         */
        public String getPublicIPv4Address() {
            return this.publicIPv4Address;
        }

        public static final class Builder {
            private String allocationId; 
            private String eniId; 
            private String ipv6Address; 
            private String privateIPv4Address; 
            private String privateIPv4HcStatus; 
            private String privateIPv6HcStatus; 
            private String publicIPv4Address; 

            private Builder() {
            } 

            private Builder(LoadBalancerAddresses model) {
                this.allocationId = model.allocationId;
                this.eniId = model.eniId;
                this.ipv6Address = model.ipv6Address;
                this.privateIPv4Address = model.privateIPv4Address;
                this.privateIPv4HcStatus = model.privateIPv4HcStatus;
                this.privateIPv6HcStatus = model.privateIPv6HcStatus;
                this.publicIPv4Address = model.publicIPv4Address;
            } 

            /**
             * <p>The ID of the elastic IP address (EIP).</p>
             * 
             * <strong>example:</strong>
             * <p>eip-bp1aedxso6u80u0qf****</p>
             */
            public Builder allocationId(String allocationId) {
                this.allocationId = allocationId;
                return this;
            }

            /**
             * <p>The ID of the elastic network interface (ENI) attached to the NLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>eni-bp12f1xhs5yal61a****</p>
             */
            public Builder eniId(String eniId) {
                this.eniId = eniId;
                return this;
            }

            /**
             * <p>The IPv6 address used by the NLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2001:db8:1:1:1:1:1:1</p>
             */
            public Builder ipv6Address(String ipv6Address) {
                this.ipv6Address = ipv6Address;
                return this;
            }

            /**
             * <p>The private IPv4 address of the NLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.3.32</p>
             */
            public Builder privateIPv4Address(String privateIPv4Address) {
                this.privateIPv4Address = privateIPv4Address;
                return this;
            }

            /**
             * <p>The health status of the private IPv4 address of the NLB instance. Valid values:</p>
             * <ul>
             * <li><strong>Healthy</strong></li>
             * <li><strong>Unhealthy</strong></li>
             * </ul>
             * <blockquote>
             * <p>This parameter is returned only when the Status of the zone is Active.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Healthy</p>
             */
            public Builder privateIPv4HcStatus(String privateIPv4HcStatus) {
                this.privateIPv4HcStatus = privateIPv4HcStatus;
                return this;
            }

            /**
             * <p>The health status of the IPv6 address of the NLB instance. Valid values:</p>
             * <ul>
             * <li><strong>Healthy</strong></li>
             * <li><strong>Unhealthy</strong></li>
             * </ul>
             * <blockquote>
             * <p>This parameter is returned only when the Status of the zone is Active.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Healthy</p>
             */
            public Builder privateIPv6HcStatus(String privateIPv6HcStatus) {
                this.privateIPv6HcStatus = privateIPv6HcStatus;
                return this;
            }

            /**
             * <p>The public IPv4 address of the NLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>120.XX.XX.69</p>
             */
            public Builder publicIPv4Address(String publicIPv4Address) {
                this.publicIPv4Address = publicIPv4Address;
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
             * <p>The IP addresses that are used by the NLB instance.</p>
             */
            public Builder loadBalancerAddresses(java.util.List<LoadBalancerAddresses> loadBalancerAddresses) {
                this.loadBalancerAddresses = loadBalancerAddresses;
                return this;
            }

            /**
             * <p>The zone status. Valid values:</p>
             * <ul>
             * <li><p><strong>Active</strong>: The zone is available.</p>
             * </li>
             * <li><p><strong>Stopped</strong>: The zone is disabled. You can set the zone to this status only by using Cloud Architect Design Tools (CADT).</p>
             * </li>
             * <li><p><strong>Shifted</strong>: The DNS record is removed.</p>
             * </li>
             * <li><p><strong>Starting</strong>: The zone is being enabled. You can set the zone to this status only by using CADT.</p>
             * </li>
             * <li><p><strong>Stopping</strong> You can set the zone to this status only by using CADT.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the vSwitch in the zone. By default, each zone contains one vSwitch and one subnet.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1rmcrwg3erh1fh8****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The name of the zone. You can call the <a href="https://help.aliyun.com/document_detail/443890.html">DescribeZones</a> operation to query the zones.</p>
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
        @com.aliyun.core.annotation.NameInMap("AddressIpVersion")
        private String addressIpVersion;

        @com.aliyun.core.annotation.NameInMap("AddressType")
        private String addressType;

        @com.aliyun.core.annotation.NameInMap("BandwidthPackageId")
        private String bandwidthPackageId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CrossZoneEnabled")
        private Boolean crossZoneEnabled;

        @com.aliyun.core.annotation.NameInMap("DNSName")
        private String DNSName;

        @com.aliyun.core.annotation.NameInMap("DeletionProtectionConfig")
        private DeletionProtectionConfig deletionProtectionConfig;

        @com.aliyun.core.annotation.NameInMap("Ipv6AddressType")
        private String ipv6AddressType;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerBillingConfig")
        private LoadBalancerBillingConfig loadBalancerBillingConfig;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerBusinessStatus")
        private String loadBalancerBusinessStatus;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
        private String loadBalancerId;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerName")
        private String loadBalancerName;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerStatus")
        private String loadBalancerStatus;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerType")
        private String loadBalancerType;

        @com.aliyun.core.annotation.NameInMap("ModificationProtectionConfig")
        private ModificationProtectionConfig modificationProtectionConfig;

        @com.aliyun.core.annotation.NameInMap("OperationLocks")
        private java.util.List<OperationLocks> operationLocks;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

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
            this.addressIpVersion = builder.addressIpVersion;
            this.addressType = builder.addressType;
            this.bandwidthPackageId = builder.bandwidthPackageId;
            this.createTime = builder.createTime;
            this.crossZoneEnabled = builder.crossZoneEnabled;
            this.DNSName = builder.DNSName;
            this.deletionProtectionConfig = builder.deletionProtectionConfig;
            this.ipv6AddressType = builder.ipv6AddressType;
            this.loadBalancerBillingConfig = builder.loadBalancerBillingConfig;
            this.loadBalancerBusinessStatus = builder.loadBalancerBusinessStatus;
            this.loadBalancerId = builder.loadBalancerId;
            this.loadBalancerName = builder.loadBalancerName;
            this.loadBalancerStatus = builder.loadBalancerStatus;
            this.loadBalancerType = builder.loadBalancerType;
            this.modificationProtectionConfig = builder.modificationProtectionConfig;
            this.operationLocks = builder.operationLocks;
            this.regionId = builder.regionId;
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
         * @return crossZoneEnabled
         */
        public Boolean getCrossZoneEnabled() {
            return this.crossZoneEnabled;
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
         * @return loadBalancerBusinessStatus
         */
        public String getLoadBalancerBusinessStatus() {
            return this.loadBalancerBusinessStatus;
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
         * @return loadBalancerStatus
         */
        public String getLoadBalancerStatus() {
            return this.loadBalancerStatus;
        }

        /**
         * @return loadBalancerType
         */
        public String getLoadBalancerType() {
            return this.loadBalancerType;
        }

        /**
         * @return modificationProtectionConfig
         */
        public ModificationProtectionConfig getModificationProtectionConfig() {
            return this.modificationProtectionConfig;
        }

        /**
         * @return operationLocks
         */
        public java.util.List<OperationLocks> getOperationLocks() {
            return this.operationLocks;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
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
            private String addressIpVersion; 
            private String addressType; 
            private String bandwidthPackageId; 
            private String createTime; 
            private Boolean crossZoneEnabled; 
            private String DNSName; 
            private DeletionProtectionConfig deletionProtectionConfig; 
            private String ipv6AddressType; 
            private LoadBalancerBillingConfig loadBalancerBillingConfig; 
            private String loadBalancerBusinessStatus; 
            private String loadBalancerId; 
            private String loadBalancerName; 
            private String loadBalancerStatus; 
            private String loadBalancerType; 
            private ModificationProtectionConfig modificationProtectionConfig; 
            private java.util.List<OperationLocks> operationLocks; 
            private String regionId; 
            private String resourceGroupId; 
            private java.util.List<String> securityGroupIds; 
            private java.util.List<Tags> tags; 
            private String vpcId; 
            private java.util.List<ZoneMappings> zoneMappings; 

            private Builder() {
            } 

            private Builder(LoadBalancers model) {
                this.addressIpVersion = model.addressIpVersion;
                this.addressType = model.addressType;
                this.bandwidthPackageId = model.bandwidthPackageId;
                this.createTime = model.createTime;
                this.crossZoneEnabled = model.crossZoneEnabled;
                this.DNSName = model.DNSName;
                this.deletionProtectionConfig = model.deletionProtectionConfig;
                this.ipv6AddressType = model.ipv6AddressType;
                this.loadBalancerBillingConfig = model.loadBalancerBillingConfig;
                this.loadBalancerBusinessStatus = model.loadBalancerBusinessStatus;
                this.loadBalancerId = model.loadBalancerId;
                this.loadBalancerName = model.loadBalancerName;
                this.loadBalancerStatus = model.loadBalancerStatus;
                this.loadBalancerType = model.loadBalancerType;
                this.modificationProtectionConfig = model.modificationProtectionConfig;
                this.operationLocks = model.operationLocks;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.securityGroupIds = model.securityGroupIds;
                this.tags = model.tags;
                this.vpcId = model.vpcId;
                this.zoneMappings = model.zoneMappings;
            } 

            /**
             * <p>The IP version. Valid values:</p>
             * <ul>
             * <li><strong>ipv4</strong>: IPv4</li>
             * <li><strong>DualStack</strong>: dual stack</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ipv4</p>
             */
            public Builder addressIpVersion(String addressIpVersion) {
                this.addressIpVersion = addressIpVersion;
                return this;
            }

            /**
             * <p>The type of IPv4 address used by the NLB instance. Valid values:</p>
             * <ul>
             * <li><strong>Internet</strong>: The NLB instance uses a public IP address. The domain name of the NLB instance is resolved to the public IP address. Therefore, the NLB instance can be accessed over the Internet.</li>
             * <li><strong>Intranet</strong>: The NLB instance uses a private IP address. The domain name of the NLB instance is resolved to the private IP address. Therefore, the NLB instance can be accessed over the VPC where the NLB instance is deployed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Internet</p>
             */
            public Builder addressType(String addressType) {
                this.addressType = addressType;
                return this;
            }

            /**
             * <p>The ID of the EIP bandwidth plan that is associated with the NLB instance if the NLB instance uses a public IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>cbwp-bp1vevu8h3ieh****</p>
             */
            public Builder bandwidthPackageId(String bandwidthPackageId) {
                this.bandwidthPackageId = bandwidthPackageId;
                return this;
            }

            /**
             * <p>The time when the resource was created. The time is displayed in UTC in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-18T17:22Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Indicates whether cross-zone load balancing is enabled for the NLB instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: enabled</li>
             * <li><strong>false</strong>: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder crossZoneEnabled(Boolean crossZoneEnabled) {
                this.crossZoneEnabled = crossZoneEnabled;
                return this;
            }

            /**
             * <p>The domain name of the NLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>nlb-wb7r6dlwetvt5j****.cn-hangzhou.nlb.aliyuncs.com</p>
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
             * <p>The type of IPv6 address used by the NLB instance. Valid values:</p>
             * <ul>
             * <li><strong>Internet</strong>: The NLB instance uses a public IP address. The domain name of the NLB instance is resolved to the public IP address. Therefore, the NLB instance can be accessed over the Internet.</li>
             * <li><strong>Intranet</strong>: The NLB instance uses a private IP address. The domain name of the NLB instance is resolved to the private IP address. Therefore, the NLB instance can be accessed over the VPC where the NLB instance is deployed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Internet</p>
             */
            public Builder ipv6AddressType(String ipv6AddressType) {
                this.ipv6AddressType = ipv6AddressType;
                return this;
            }

            /**
             * <p>The billing settings of the NLB instance.</p>
             */
            public Builder loadBalancerBillingConfig(LoadBalancerBillingConfig loadBalancerBillingConfig) {
                this.loadBalancerBillingConfig = loadBalancerBillingConfig;
                return this;
            }

            /**
             * <p>The business status of the NLB instance. Valid values:</p>
             * <ul>
             * <li><strong>Abnormal</strong>: The NLB instance is not working as expected.</li>
             * <li><strong>Normal</strong>: The NLB instance is working as expected.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder loadBalancerBusinessStatus(String loadBalancerBusinessStatus) {
                this.loadBalancerBusinessStatus = loadBalancerBusinessStatus;
                return this;
            }

            /**
             * <p>The ID of the NLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>nlb-83ckzc8d4xlp8o****</p>
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * <p>The name of the NLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>NLB1</p>
             */
            public Builder loadBalancerName(String loadBalancerName) {
                this.loadBalancerName = loadBalancerName;
                return this;
            }

            /**
             * <p>The status of the NLB instance. Valid values:</p>
             * <ul>
             * <li><strong>Inactive</strong>: The NLB instance is disabled. Listeners of NLB instances in the Inactive state do not forward traffic.</li>
             * <li><strong>Active</strong>: The NLB instance is running.</li>
             * <li><strong>Provisioning</strong>: The NLB instance is being created.</li>
             * <li><strong>Configuring</strong>: The NLB instance is being modified.</li>
             * <li><strong>Deleting</strong>: The NLB instance is being deleted.</li>
             * <li><strong>Deleted</strong>: The NLB instance is deleted.</li>
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
             * <p>The type of the SLB instance. Only <strong>Network</strong> is returned, which indicates NLB.</p>
             * 
             * <strong>example:</strong>
             * <p>Network</p>
             */
            public Builder loadBalancerType(String loadBalancerType) {
                this.loadBalancerType = loadBalancerType;
                return this;
            }

            /**
             * <p>The configuration of the configuration read-only mode.</p>
             */
            public Builder modificationProtectionConfig(ModificationProtectionConfig modificationProtectionConfig) {
                this.modificationProtectionConfig = modificationProtectionConfig;
                return this;
            }

            /**
             * <p>The configuration of the operation lock. This parameter takes effect if the value of <code>LoadBalancerBussinessStatus</code> is <strong>Abnormal</strong>.</p>
             */
            public Builder operationLocks(java.util.List<OperationLocks> operationLocks) {
                this.operationLocks = operationLocks;
                return this;
            }

            /**
             * <p>The ID of the region where the NLB instance is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
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
             * <p>The security group to which the NLB instance is added.</p>
             */
            public Builder securityGroupIds(java.util.List<String> securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * <p>A list of tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The ID of the VPC where the NLB instance is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1b49rqrybk45nio****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The mappings between zones and vSwitches.</p>
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
