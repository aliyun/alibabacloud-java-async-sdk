// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudGtmAddressPoolReferenceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudGtmAddressPoolReferenceResponseBody</p>
 */
public class DescribeCloudGtmAddressPoolReferenceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AddressPoolId")
    private String addressPoolId;

    @com.aliyun.core.annotation.NameInMap("AddressPoolName")
    private String addressPoolName;

    @com.aliyun.core.annotation.NameInMap("InstanceConfigs")
    private InstanceConfigs instanceConfigs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCloudGtmAddressPoolReferenceResponseBody(Builder builder) {
        this.addressPoolId = builder.addressPoolId;
        this.addressPoolName = builder.addressPoolName;
        this.instanceConfigs = builder.instanceConfigs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudGtmAddressPoolReferenceResponseBody create() {
        return builder().build();
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
     * @return instanceConfigs
     */
    public InstanceConfigs getInstanceConfigs() {
        return this.instanceConfigs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String addressPoolId; 
        private String addressPoolName; 
        private InstanceConfigs instanceConfigs; 
        private String requestId; 

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
         * InstanceConfigs.
         */
        public Builder instanceConfigs(InstanceConfigs instanceConfigs) {
            this.instanceConfigs = instanceConfigs;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCloudGtmAddressPoolReferenceResponseBody build() {
            return new DescribeCloudGtmAddressPoolReferenceResponseBody(this);
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
}
