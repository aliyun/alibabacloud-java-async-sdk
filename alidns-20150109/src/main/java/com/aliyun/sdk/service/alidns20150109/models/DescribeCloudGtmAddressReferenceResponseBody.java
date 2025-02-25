// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DescribeCloudGtmAddressReferenceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudGtmAddressReferenceResponseBody</p>
 */
public class DescribeCloudGtmAddressReferenceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Address")
    private String address;

    @com.aliyun.core.annotation.NameInMap("AddressId")
    private String addressId;

    @com.aliyun.core.annotation.NameInMap("AddressPools")
    private AddressPools addressPools;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCloudGtmAddressReferenceResponseBody(Builder builder) {
        this.address = builder.address;
        this.addressId = builder.addressId;
        this.addressPools = builder.addressPools;
        this.name = builder.name;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudGtmAddressReferenceResponseBody create() {
        return builder().build();
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return addressId
     */
    public String getAddressId() {
        return this.addressId;
    }

    /**
     * @return addressPools
     */
    public AddressPools getAddressPools() {
        return this.addressPools;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String address; 
        private String addressId; 
        private AddressPools addressPools; 
        private String name; 
        private String requestId; 

        /**
         * <p>IP address or domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>223.5.XX.XX</p>
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * <p>The address ID. This ID uniquely identifies the address.</p>
         * 
         * <strong>example:</strong>
         * <p>addr-89564584963974**40</p>
         */
        public Builder addressId(String addressId) {
            this.addressId = addressId;
            return this;
        }

        /**
         * <p>The address pools.</p>
         */
        public Builder addressPools(AddressPools addressPools) {
            this.addressPools = addressPools;
            return this;
        }

        /**
         * <p>Address name.</p>
         * 
         * <strong>example:</strong>
         * <p>Address-1</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>Unique request identification code.</p>
         * 
         * <strong>example:</strong>
         * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCloudGtmAddressReferenceResponseBody build() {
            return new DescribeCloudGtmAddressReferenceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCloudGtmAddressReferenceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudGtmAddressReferenceResponseBody</p>
     */
    public static class InstanceConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressPoolLbStrategy")
        private String addressPoolLbStrategy;

        @com.aliyun.core.annotation.NameInMap("AvailableStatus")
        private String availableStatus;

        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private String configId;

        @com.aliyun.core.annotation.NameInMap("EnableStatus")
        private String enableStatus;

        @com.aliyun.core.annotation.NameInMap("HealthStatus")
        private String healthStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("ScheduleDomainName")
        private String scheduleDomainName;

        @com.aliyun.core.annotation.NameInMap("ScheduleHostname")
        private String scheduleHostname;

        @com.aliyun.core.annotation.NameInMap("ScheduleRrType")
        private String scheduleRrType;

        @com.aliyun.core.annotation.NameInMap("ScheduleZoneName")
        private String scheduleZoneName;

        @com.aliyun.core.annotation.NameInMap("SequenceLbStrategyMode")
        private String sequenceLbStrategyMode;

        @com.aliyun.core.annotation.NameInMap("Ttl")
        private Integer ttl;

        @com.aliyun.core.annotation.NameInMap("VersionCode")
        private String versionCode;

        private InstanceConfig(Builder builder) {
            this.addressPoolLbStrategy = builder.addressPoolLbStrategy;
            this.availableStatus = builder.availableStatus;
            this.configId = builder.configId;
            this.enableStatus = builder.enableStatus;
            this.healthStatus = builder.healthStatus;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.remark = builder.remark;
            this.scheduleDomainName = builder.scheduleDomainName;
            this.scheduleHostname = builder.scheduleHostname;
            this.scheduleRrType = builder.scheduleRrType;
            this.scheduleZoneName = builder.scheduleZoneName;
            this.sequenceLbStrategyMode = builder.sequenceLbStrategyMode;
            this.ttl = builder.ttl;
            this.versionCode = builder.versionCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceConfig create() {
            return builder().build();
        }

        /**
         * @return addressPoolLbStrategy
         */
        public String getAddressPoolLbStrategy() {
            return this.addressPoolLbStrategy;
        }

        /**
         * @return availableStatus
         */
        public String getAvailableStatus() {
            return this.availableStatus;
        }

        /**
         * @return configId
         */
        public String getConfigId() {
            return this.configId;
        }

        /**
         * @return enableStatus
         */
        public String getEnableStatus() {
            return this.enableStatus;
        }

        /**
         * @return healthStatus
         */
        public String getHealthStatus() {
            return this.healthStatus;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return scheduleDomainName
         */
        public String getScheduleDomainName() {
            return this.scheduleDomainName;
        }

        /**
         * @return scheduleHostname
         */
        public String getScheduleHostname() {
            return this.scheduleHostname;
        }

        /**
         * @return scheduleRrType
         */
        public String getScheduleRrType() {
            return this.scheduleRrType;
        }

        /**
         * @return scheduleZoneName
         */
        public String getScheduleZoneName() {
            return this.scheduleZoneName;
        }

        /**
         * @return sequenceLbStrategyMode
         */
        public String getSequenceLbStrategyMode() {
            return this.sequenceLbStrategyMode;
        }

        /**
         * @return ttl
         */
        public Integer getTtl() {
            return this.ttl;
        }

        /**
         * @return versionCode
         */
        public String getVersionCode() {
            return this.versionCode;
        }

        public static final class Builder {
            private String addressPoolLbStrategy; 
            private String availableStatus; 
            private String configId; 
            private String enableStatus; 
            private String healthStatus; 
            private String instanceId; 
            private String instanceName; 
            private String remark; 
            private String scheduleDomainName; 
            private String scheduleHostname; 
            private String scheduleRrType; 
            private String scheduleZoneName; 
            private String sequenceLbStrategyMode; 
            private Integer ttl; 
            private String versionCode; 

            /**
             * <p>The policy for load balancing between address pools. Valid values:</p>
             * <ul>
             * <li>round_robin: All address pools are returned for Domain Name System (DNS) requests from any source. All address pools are sorted in round-robin mode each time they are returned.</li>
             * <li>sequence: The address pool with the smallest sequence number is preferentially returned for DNS requests from any source. The sequence number indicates the priority for returning the address pool. A smaller sequence number indicates a higher priority. If the address pool with the smallest sequence number is unavailable, the address pool with the second smallest sequence number is returned.</li>
             * <li>weight: You can set a different weight value for each address pool. This way, address pools are returned based on the weight values.</li>
             * <li>source_nearest: Different address pools are returned based on the sources of DNS requests. This way, users can access nearby address pools.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>round_robin</p>
             */
            public Builder addressPoolLbStrategy(String addressPoolLbStrategy) {
                this.addressPoolLbStrategy = addressPoolLbStrategy;
                return this;
            }

            /**
             * <p>The availability state of the access domain name. Valid values:</p>
             * <ul>
             * <li>available: If the access domain name is <strong>enabled</strong> and the health state is normal, the access domain name is deemed <strong>available</strong>.</li>
             * <li>unavailable: If the access domain name is <strong>disabled</strong> or the health state is <strong>abnormal</strong>, the access domain name is deemed <strong>unavailable</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>available</p>
             */
            public Builder availableStatus(String availableStatus) {
                this.availableStatus = availableStatus;
                return this;
            }

            /**
             * <p>The configuration ID of the access domain name. Two configuration IDs exist when the access domain name is bound to the same GTM instance but an A record and an AAAA record are configured for the access domain name. The configuration ID uniquely identifies a configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>config-00**01</p>
             */
            public Builder configId(String configId) {
                this.configId = configId;
                return this;
            }

            /**
             * <p>The enabling state of the access domain name. Valid values:</p>
             * <ul>
             * <li>enable: The access domain name is enabled and the intelligent scheduling policy of the corresponding GTM instance takes effect.</li>
             * <li>disable: The access domain name is disabled and the intelligent scheduling policy of the corresponding GTM instance does not take effect.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enable</p>
             */
            public Builder enableStatus(String enableStatus) {
                this.enableStatus = enableStatus;
                return this;
            }

            /**
             * <p>The health state of the access domain name. Valid values:</p>
             * <ul>
             * <li>ok: The health state of the access domain name is normal and all address pools that are referenced by the access domain name are available.</li>
             * <li>ok_alert: The health state of the access domain name is warning and some of the address pools that are referenced by the access domain name are unavailable. In this case, only the available address pools are returned for DNS requests.</li>
             * <li>exceptional: The health state of the access domain name is abnormal and all address pools that are referenced by the access domain name are unavailable. In this case, addresses in the non-empty address pool with the smallest sequence number are preferentially used for fallback resolution. This returns DNS results for clients as much as possible.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ok</p>
             */
            public Builder healthStatus(String healthStatus) {
                this.healthStatus = healthStatus;
                return this;
            }

            /**
             * <p>The ID of the GTM 3.0 instance.</p>
             * 
             * <strong>example:</strong>
             * <p>gtm-cn-zz11t58**0k</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>Remarks.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The access domain name. The value of this parameter is composed of the value of ScheduleHostname and the value of ScheduleZoneName.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder scheduleDomainName(String scheduleDomainName) {
                this.scheduleDomainName = scheduleDomainName;
                return this;
            }

            /**
             * <p>Host record of the domain accessed by GTM.</p>
             * 
             * <strong>example:</strong>
             * <p>www</p>
             */
            public Builder scheduleHostname(String scheduleHostname) {
                this.scheduleHostname = scheduleHostname;
                return this;
            }

            /**
             * <p>DNS record types for the scheduling domain:</p>
             * <ul>
             * <li>A: IPv4 address</li>
             * <li>AAAA: IPv6 address</li>
             * <li>CNAME: Domain name</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>A</p>
             */
            public Builder scheduleRrType(String scheduleRrType) {
                this.scheduleRrType = scheduleRrType;
                return this;
            }

            /**
             * <p>The zone such as example.com or subzone such as a.example.com of the access domain name. In most cases, the zone or subzone is hosted by the Public Authoritative DNS module of Alibaba Cloud DNS. This zone belongs to the account to which the GTM instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder scheduleZoneName(String scheduleZoneName) {
                this.scheduleZoneName = scheduleZoneName;
                return this;
            }

            /**
             * <p>The mode used if the address pool with the smallest sequence number is recovered. This parameter is returned when AddressPoolLbStrategy is set to sequence. Valid values:</p>
             * <ul>
             * <li>preemptive: The address pool with the smallest sequence number is preferentially used if this address pool is recovered.</li>
             * <li>non_preemptive: The current address pool is still used even if the address pool with the smallest sequence number is recovered.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>preemptive</p>
             */
            public Builder sequenceLbStrategyMode(String sequenceLbStrategyMode) {
                this.sequenceLbStrategyMode = sequenceLbStrategyMode;
                return this;
            }

            /**
             * <p>Global TTL (in seconds), the TTL value for domain name resolution to addresses in the address pool, which affects the caching time of DNS records in the ISP&quot;s LocalDNS. Custom TTL values are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder ttl(Integer ttl) {
                this.ttl = ttl;
                return this;
            }

            /**
             * <p>Global Traffic Management version 3.0 instance types:</p>
             * <ul>
             * <li>standard: Standard Edition</li>
             * <li>ultimate: Ultimate Edition</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ultimate</p>
             */
            public Builder versionCode(String versionCode) {
                this.versionCode = versionCode;
                return this;
            }

            public InstanceConfig build() {
                return new InstanceConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCloudGtmAddressReferenceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudGtmAddressReferenceResponseBody</p>
     */
    public static class InstanceConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceConfig")
        private java.util.List<InstanceConfig> instanceConfig;

        private InstanceConfigs(Builder builder) {
            this.instanceConfig = builder.instanceConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceConfigs create() {
            return builder().build();
        }

        /**
         * @return instanceConfig
         */
        public java.util.List<InstanceConfig> getInstanceConfig() {
            return this.instanceConfig;
        }

        public static final class Builder {
            private java.util.List<InstanceConfig> instanceConfig; 

            /**
             * InstanceConfig.
             */
            public Builder instanceConfig(java.util.List<InstanceConfig> instanceConfig) {
                this.instanceConfig = instanceConfig;
                return this;
            }

            public InstanceConfigs build() {
                return new InstanceConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCloudGtmAddressReferenceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudGtmAddressReferenceResponseBody</p>
     */
    public static class AddressPool extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressLbStrategy")
        private String addressLbStrategy;

        @com.aliyun.core.annotation.NameInMap("AddressPoolId")
        private String addressPoolId;

        @com.aliyun.core.annotation.NameInMap("AddressPoolName")
        private String addressPoolName;

        @com.aliyun.core.annotation.NameInMap("AddressPoolType")
        private String addressPoolType;

        @com.aliyun.core.annotation.NameInMap("AvailableStatus")
        private String availableStatus;

        @com.aliyun.core.annotation.NameInMap("EnableStatus")
        private String enableStatus;

        @com.aliyun.core.annotation.NameInMap("HealthJudgement")
        private String healthJudgement;

        @com.aliyun.core.annotation.NameInMap("HealthStatus")
        private String healthStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceConfigs")
        private InstanceConfigs instanceConfigs;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("SequenceLbStrategyMode")
        private String sequenceLbStrategyMode;

        private AddressPool(Builder builder) {
            this.addressLbStrategy = builder.addressLbStrategy;
            this.addressPoolId = builder.addressPoolId;
            this.addressPoolName = builder.addressPoolName;
            this.addressPoolType = builder.addressPoolType;
            this.availableStatus = builder.availableStatus;
            this.enableStatus = builder.enableStatus;
            this.healthJudgement = builder.healthJudgement;
            this.healthStatus = builder.healthStatus;
            this.instanceConfigs = builder.instanceConfigs;
            this.remark = builder.remark;
            this.sequenceLbStrategyMode = builder.sequenceLbStrategyMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddressPool create() {
            return builder().build();
        }

        /**
         * @return addressLbStrategy
         */
        public String getAddressLbStrategy() {
            return this.addressLbStrategy;
        }

        /**
         * @return addressPoolId
         */
        public String getAddressPoolId() {
            return this.addressPoolId;
        }

        /**
         * @return addressPoolName
         */
        public String getAddressPoolName() {
            return this.addressPoolName;
        }

        /**
         * @return addressPoolType
         */
        public String getAddressPoolType() {
            return this.addressPoolType;
        }

        /**
         * @return availableStatus
         */
        public String getAvailableStatus() {
            return this.availableStatus;
        }

        /**
         * @return enableStatus
         */
        public String getEnableStatus() {
            return this.enableStatus;
        }

        /**
         * @return healthJudgement
         */
        public String getHealthJudgement() {
            return this.healthJudgement;
        }

        /**
         * @return healthStatus
         */
        public String getHealthStatus() {
            return this.healthStatus;
        }

        /**
         * @return instanceConfigs
         */
        public InstanceConfigs getInstanceConfigs() {
            return this.instanceConfigs;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return sequenceLbStrategyMode
         */
        public String getSequenceLbStrategyMode() {
            return this.sequenceLbStrategyMode;
        }

        public static final class Builder {
            private String addressLbStrategy; 
            private String addressPoolId; 
            private String addressPoolName; 
            private String addressPoolType; 
            private String availableStatus; 
            private String enableStatus; 
            private String healthJudgement; 
            private String healthStatus; 
            private InstanceConfigs instanceConfigs; 
            private String remark; 
            private String sequenceLbStrategyMode; 

            /**
             * <p>Load balancing policy among addresses in the address pool:</p>
             * <ul>
             * <li>round_robin: Round-robin, for any source of DNS resolution requests, all addresses are returned, with a rotation sort applied to all addresses each time.</li>
             * <li>sequence: Sequential, for any source of DNS resolution requests, returns the address with the smaller sequence number (the sequence number indicates the priority of address return, with smaller numbers having higher priority). If the address with the smaller sequence number is unavailable, the next address with a smaller sequence number is returned.</li>
             * <li>weight: Weighted, supports setting different weight values for each address, realizing the return of addresses according to the ratio of weight for DNS query resolutions.</li>
             * <li>source_nearest: Source-nearest, i.e., intelligent resolution function, where GTM can return different addresses based on the source of different DNS resolution requests, achieving the effect of users accessing nearby.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>round_robin</p>
             */
            public Builder addressLbStrategy(String addressLbStrategy) {
                this.addressLbStrategy = addressLbStrategy;
                return this;
            }

            /**
             * <p>The ID of the address pool.</p>
             * 
             * <strong>example:</strong>
             * <p>pool-895280232254422016</p>
             */
            public Builder addressPoolId(String addressPoolId) {
                this.addressPoolId = addressPoolId;
                return this;
            }

            /**
             * <p>Address pool name.</p>
             * 
             * <strong>example:</strong>
             * <p>AddressPool-1</p>
             */
            public Builder addressPoolName(String addressPoolName) {
                this.addressPoolName = addressPoolName;
                return this;
            }

            /**
             * <p>Address pool type:</p>
             * <ul>
             * <li>IPv4</li>
             * <li>IPv6</li>
             * <li>domain</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IPv4</p>
             */
            public Builder addressPoolType(String addressPoolType) {
                this.addressPoolType = addressPoolType;
                return this;
            }

            /**
             * <p>Address pool availability status:</p>
             * <ul>
             * <li>available</li>
             * <li>unavailable</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>available</p>
             */
            public Builder availableStatus(String availableStatus) {
                this.availableStatus = availableStatus;
                return this;
            }

            /**
             * <p>Address pool status:</p>
             * <ul>
             * <li>enable: Enabled status</li>
             * <li>disable: Disabled status</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enable</p>
             */
            public Builder enableStatus(String enableStatus) {
                this.enableStatus = enableStatus;
                return this;
            }

            /**
             * <p>The condition for determining the health status of the address pool. Valid values:</p>
             * <ul>
             * <li>any_ok: At least one address in the address pool is available.</li>
             * <li>p30_ok: At least 30% of the addresses in the address pool are available.</li>
             * <li>p50_ok: At least 50% of the addresses in the address pool are available.</li>
             * <li>p70_ok: At least 70% of the addresses in the address pool are available.</li>
             * <li>all_ok: All addresses in the address pool are available.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>any_ok</p>
             */
            public Builder healthJudgement(String healthJudgement) {
                this.healthJudgement = healthJudgement;
                return this;
            }

            /**
             * <p>The health state of the address pool. Valid values:</p>
             * <ul>
             * <li>ok: The health state of the address pool is normal and all addresses that are referenced by the address pool are available.</li>
             * <li>ok_alert: The health state of the address pool is warning and some of the addresses that are referenced by the address pool are unavailable. However, the address pool is deemed normal. In this case, only the available addresses are returned for DNS requests.</li>
             * <li>exceptional: The health state of the address pool is abnormal and some or all of the addresses that are referenced by the address pool are unavailable. In this case, the address pool is deemed abnormal.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ok</p>
             */
            public Builder healthStatus(String healthStatus) {
                this.healthStatus = healthStatus;
                return this;
            }

            /**
             * <p>The instances that reference the address pool.</p>
             */
            public Builder instanceConfigs(InstanceConfigs instanceConfigs) {
                this.instanceConfigs = instanceConfigs;
                return this;
            }

            /**
             * <p>Remarks for the address pool.</p>
             * 
             * <strong>example:</strong>
             * <p>pool-1</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>Load balancing policy between addresses in sequential mode during the recovery of preceding resources service mode:</p>
             * <ul>
             * <li>preemptive: Preemption mode, where upon recovery of preceding resources, priority is given to using addresses with smaller sequence numbers;</li>
             * <li>non_preemptive: Non-preemption mode, where upon recovery of preceding resources, the current address continues to be used;</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>preemptive</p>
             */
            public Builder sequenceLbStrategyMode(String sequenceLbStrategyMode) {
                this.sequenceLbStrategyMode = sequenceLbStrategyMode;
                return this;
            }

            public AddressPool build() {
                return new AddressPool(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCloudGtmAddressReferenceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudGtmAddressReferenceResponseBody</p>
     */
    public static class AddressPools extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressPool")
        private java.util.List<AddressPool> addressPool;

        private AddressPools(Builder builder) {
            this.addressPool = builder.addressPool;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddressPools create() {
            return builder().build();
        }

        /**
         * @return addressPool
         */
        public java.util.List<AddressPool> getAddressPool() {
            return this.addressPool;
        }

        public static final class Builder {
            private java.util.List<AddressPool> addressPool; 

            /**
             * AddressPool.
             */
            public Builder addressPool(java.util.List<AddressPool> addressPool) {
                this.addressPool = addressPool;
                return this;
            }

            public AddressPools build() {
                return new AddressPools(this);
            } 

        } 

    }
}
