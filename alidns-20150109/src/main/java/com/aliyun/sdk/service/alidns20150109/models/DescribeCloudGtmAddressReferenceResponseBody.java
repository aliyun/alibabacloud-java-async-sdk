// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * Address.
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * AddressId.
         */
        public Builder addressId(String addressId) {
            this.addressId = addressId;
            return this;
        }

        /**
         * AddressPools.
         */
        public Builder addressPools(AddressPools addressPools) {
            this.addressPools = addressPools;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCloudGtmAddressReferenceResponseBody build() {
            return new DescribeCloudGtmAddressReferenceResponseBody(this);
        } 

    } 

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
             * AddressPoolLbStrategy.
             */
            public Builder addressPoolLbStrategy(String addressPoolLbStrategy) {
                this.addressPoolLbStrategy = addressPoolLbStrategy;
                return this;
            }

            /**
             * AvailableStatus.
             */
            public Builder availableStatus(String availableStatus) {
                this.availableStatus = availableStatus;
                return this;
            }

            /**
             * ConfigId.
             */
            public Builder configId(String configId) {
                this.configId = configId;
                return this;
            }

            /**
             * EnableStatus.
             */
            public Builder enableStatus(String enableStatus) {
                this.enableStatus = enableStatus;
                return this;
            }

            /**
             * HealthStatus.
             */
            public Builder healthStatus(String healthStatus) {
                this.healthStatus = healthStatus;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * ScheduleDomainName.
             */
            public Builder scheduleDomainName(String scheduleDomainName) {
                this.scheduleDomainName = scheduleDomainName;
                return this;
            }

            /**
             * ScheduleHostname.
             */
            public Builder scheduleHostname(String scheduleHostname) {
                this.scheduleHostname = scheduleHostname;
                return this;
            }

            /**
             * ScheduleRrType.
             */
            public Builder scheduleRrType(String scheduleRrType) {
                this.scheduleRrType = scheduleRrType;
                return this;
            }

            /**
             * ScheduleZoneName.
             */
            public Builder scheduleZoneName(String scheduleZoneName) {
                this.scheduleZoneName = scheduleZoneName;
                return this;
            }

            /**
             * SequenceLbStrategyMode.
             */
            public Builder sequenceLbStrategyMode(String sequenceLbStrategyMode) {
                this.sequenceLbStrategyMode = sequenceLbStrategyMode;
                return this;
            }

            /**
             * Ttl.
             */
            public Builder ttl(Integer ttl) {
                this.ttl = ttl;
                return this;
            }

            /**
             * VersionCode.
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
    public static class InstanceConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceConfig")
        private java.util.List < InstanceConfig> instanceConfig;

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
        public java.util.List < InstanceConfig> getInstanceConfig() {
            return this.instanceConfig;
        }

        public static final class Builder {
            private java.util.List < InstanceConfig> instanceConfig; 

            /**
             * InstanceConfig.
             */
            public Builder instanceConfig(java.util.List < InstanceConfig> instanceConfig) {
                this.instanceConfig = instanceConfig;
                return this;
            }

            public InstanceConfigs build() {
                return new InstanceConfigs(this);
            } 

        } 

    }
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
             * AddressLbStrategy.
             */
            public Builder addressLbStrategy(String addressLbStrategy) {
                this.addressLbStrategy = addressLbStrategy;
                return this;
            }

            /**
             * AddressPoolId.
             */
            public Builder addressPoolId(String addressPoolId) {
                this.addressPoolId = addressPoolId;
                return this;
            }

            /**
             * AddressPoolName.
             */
            public Builder addressPoolName(String addressPoolName) {
                this.addressPoolName = addressPoolName;
                return this;
            }

            /**
             * AddressPoolType.
             */
            public Builder addressPoolType(String addressPoolType) {
                this.addressPoolType = addressPoolType;
                return this;
            }

            /**
             * AvailableStatus.
             */
            public Builder availableStatus(String availableStatus) {
                this.availableStatus = availableStatus;
                return this;
            }

            /**
             * EnableStatus.
             */
            public Builder enableStatus(String enableStatus) {
                this.enableStatus = enableStatus;
                return this;
            }

            /**
             * HealthJudgement.
             */
            public Builder healthJudgement(String healthJudgement) {
                this.healthJudgement = healthJudgement;
                return this;
            }

            /**
             * HealthStatus.
             */
            public Builder healthStatus(String healthStatus) {
                this.healthStatus = healthStatus;
                return this;
            }

            /**
             * InstanceConfigs.
             */
            public Builder instanceConfigs(InstanceConfigs instanceConfigs) {
                this.instanceConfigs = instanceConfigs;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * SequenceLbStrategyMode.
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
    public static class AddressPools extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressPool")
        private java.util.List < AddressPool> addressPool;

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
        public java.util.List < AddressPool> getAddressPool() {
            return this.addressPool;
        }

        public static final class Builder {
            private java.util.List < AddressPool> addressPool; 

            /**
             * AddressPool.
             */
            public Builder addressPool(java.util.List < AddressPool> addressPool) {
                this.addressPool = addressPool;
                return this;
            }

            public AddressPools build() {
                return new AddressPools(this);
            } 

        } 

    }
}
