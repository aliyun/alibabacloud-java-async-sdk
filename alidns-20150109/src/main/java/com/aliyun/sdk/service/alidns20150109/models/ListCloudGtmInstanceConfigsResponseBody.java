// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCloudGtmInstanceConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCloudGtmInstanceConfigsResponseBody</p>
 */
public class ListCloudGtmInstanceConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceConfigs")
    private InstanceConfigs instanceConfigs;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalItems")
    private Integer totalItems;

    @com.aliyun.core.annotation.NameInMap("TotalPages")
    private Integer totalPages;

    private ListCloudGtmInstanceConfigsResponseBody(Builder builder) {
        this.instanceConfigs = builder.instanceConfigs;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalItems = builder.totalItems;
        this.totalPages = builder.totalPages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCloudGtmInstanceConfigsResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceConfigs
     */
    public InstanceConfigs getInstanceConfigs() {
        return this.instanceConfigs;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalItems
     */
    public Integer getTotalItems() {
        return this.totalItems;
    }

    /**
     * @return totalPages
     */
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static final class Builder {
        private InstanceConfigs instanceConfigs; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalItems; 
        private Integer totalPages; 

        /**
         * InstanceConfigs.
         */
        public Builder instanceConfigs(InstanceConfigs instanceConfigs) {
            this.instanceConfigs = instanceConfigs;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalItems.
         */
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * TotalPages.
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public ListCloudGtmInstanceConfigsResponseBody build() {
            return new ListCloudGtmInstanceConfigsResponseBody(this);
        } 

    } 

    public static class RequestSource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RequestSource")
        private java.util.List < String > requestSource;

        private RequestSource(Builder builder) {
            this.requestSource = builder.requestSource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestSource create() {
            return builder().build();
        }

        /**
         * @return requestSource
         */
        public java.util.List < String > getRequestSource() {
            return this.requestSource;
        }

        public static final class Builder {
            private java.util.List < String > requestSource; 

            /**
             * RequestSource.
             */
            public Builder requestSource(java.util.List < String > requestSource) {
                this.requestSource = requestSource;
                return this;
            }

            public RequestSource build() {
                return new RequestSource(this);
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

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("EnableStatus")
        private String enableStatus;

        @com.aliyun.core.annotation.NameInMap("HealthJudgement")
        private String healthJudgement;

        @com.aliyun.core.annotation.NameInMap("HealthStatus")
        private String healthStatus;

        @com.aliyun.core.annotation.NameInMap("RequestSource")
        private RequestSource requestSource;

        @com.aliyun.core.annotation.NameInMap("SeqNonPreemptiveSchedule")
        private Boolean seqNonPreemptiveSchedule;

        @com.aliyun.core.annotation.NameInMap("SequenceLbStrategyMode")
        private String sequenceLbStrategyMode;

        @com.aliyun.core.annotation.NameInMap("SerialNumber")
        private Integer serialNumber;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("UpdateTimestamp")
        private Long updateTimestamp;

        @com.aliyun.core.annotation.NameInMap("WeightValue")
        private Integer weightValue;

        private AddressPool(Builder builder) {
            this.addressLbStrategy = builder.addressLbStrategy;
            this.addressPoolId = builder.addressPoolId;
            this.addressPoolName = builder.addressPoolName;
            this.addressPoolType = builder.addressPoolType;
            this.availableStatus = builder.availableStatus;
            this.createTime = builder.createTime;
            this.createTimestamp = builder.createTimestamp;
            this.enableStatus = builder.enableStatus;
            this.healthJudgement = builder.healthJudgement;
            this.healthStatus = builder.healthStatus;
            this.requestSource = builder.requestSource;
            this.seqNonPreemptiveSchedule = builder.seqNonPreemptiveSchedule;
            this.sequenceLbStrategyMode = builder.sequenceLbStrategyMode;
            this.serialNumber = builder.serialNumber;
            this.updateTime = builder.updateTime;
            this.updateTimestamp = builder.updateTimestamp;
            this.weightValue = builder.weightValue;
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
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
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
         * @return requestSource
         */
        public RequestSource getRequestSource() {
            return this.requestSource;
        }

        /**
         * @return seqNonPreemptiveSchedule
         */
        public Boolean getSeqNonPreemptiveSchedule() {
            return this.seqNonPreemptiveSchedule;
        }

        /**
         * @return sequenceLbStrategyMode
         */
        public String getSequenceLbStrategyMode() {
            return this.sequenceLbStrategyMode;
        }

        /**
         * @return serialNumber
         */
        public Integer getSerialNumber() {
            return this.serialNumber;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return updateTimestamp
         */
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        /**
         * @return weightValue
         */
        public Integer getWeightValue() {
            return this.weightValue;
        }

        public static final class Builder {
            private String addressLbStrategy; 
            private String addressPoolId; 
            private String addressPoolName; 
            private String addressPoolType; 
            private String availableStatus; 
            private String createTime; 
            private Long createTimestamp; 
            private String enableStatus; 
            private String healthJudgement; 
            private String healthStatus; 
            private RequestSource requestSource; 
            private Boolean seqNonPreemptiveSchedule; 
            private String sequenceLbStrategyMode; 
            private Integer serialNumber; 
            private String updateTime; 
            private Long updateTimestamp; 
            private Integer weightValue; 

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
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreateTimestamp.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
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
             * RequestSource.
             */
            public Builder requestSource(RequestSource requestSource) {
                this.requestSource = requestSource;
                return this;
            }

            /**
             * SeqNonPreemptiveSchedule.
             */
            public Builder seqNonPreemptiveSchedule(Boolean seqNonPreemptiveSchedule) {
                this.seqNonPreemptiveSchedule = seqNonPreemptiveSchedule;
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
             * SerialNumber.
             */
            public Builder serialNumber(Integer serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * UpdateTimestamp.
             */
            public Builder updateTimestamp(Long updateTimestamp) {
                this.updateTimestamp = updateTimestamp;
                return this;
            }

            /**
             * WeightValue.
             */
            public Builder weightValue(Integer weightValue) {
                this.weightValue = weightValue;
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
    public static class InstanceConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressPoolLbStrategy")
        private String addressPoolLbStrategy;

        @com.aliyun.core.annotation.NameInMap("AddressPools")
        private AddressPools addressPools;

        @com.aliyun.core.annotation.NameInMap("AvailableStatus")
        private String availableStatus;

        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private String configId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("EnableStatus")
        private String enableStatus;

        @com.aliyun.core.annotation.NameInMap("HealthStatus")
        private String healthStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("ScheduleDomainName")
        private String scheduleDomainName;

        @com.aliyun.core.annotation.NameInMap("ScheduleHostname")
        private String scheduleHostname;

        @com.aliyun.core.annotation.NameInMap("ScheduleRrType")
        private String scheduleRrType;

        @com.aliyun.core.annotation.NameInMap("ScheduleZoneMode")
        private String scheduleZoneMode;

        @com.aliyun.core.annotation.NameInMap("ScheduleZoneName")
        private String scheduleZoneName;

        @com.aliyun.core.annotation.NameInMap("SequenceLbStrategyMode")
        private String sequenceLbStrategyMode;

        @com.aliyun.core.annotation.NameInMap("Ttl")
        private Integer ttl;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("UpdateTimestamp")
        private Long updateTimestamp;

        @com.aliyun.core.annotation.NameInMap("VersionCode")
        private String versionCode;

        private InstanceConfig(Builder builder) {
            this.addressPoolLbStrategy = builder.addressPoolLbStrategy;
            this.addressPools = builder.addressPools;
            this.availableStatus = builder.availableStatus;
            this.commodityCode = builder.commodityCode;
            this.configId = builder.configId;
            this.createTime = builder.createTime;
            this.createTimestamp = builder.createTimestamp;
            this.enableStatus = builder.enableStatus;
            this.healthStatus = builder.healthStatus;
            this.instanceId = builder.instanceId;
            this.remark = builder.remark;
            this.scheduleDomainName = builder.scheduleDomainName;
            this.scheduleHostname = builder.scheduleHostname;
            this.scheduleRrType = builder.scheduleRrType;
            this.scheduleZoneMode = builder.scheduleZoneMode;
            this.scheduleZoneName = builder.scheduleZoneName;
            this.sequenceLbStrategyMode = builder.sequenceLbStrategyMode;
            this.ttl = builder.ttl;
            this.updateTime = builder.updateTime;
            this.updateTimestamp = builder.updateTimestamp;
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
         * @return addressPools
         */
        public AddressPools getAddressPools() {
            return this.addressPools;
        }

        /**
         * @return availableStatus
         */
        public String getAvailableStatus() {
            return this.availableStatus;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return configId
         */
        public String getConfigId() {
            return this.configId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
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
         * @return scheduleZoneMode
         */
        public String getScheduleZoneMode() {
            return this.scheduleZoneMode;
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
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return updateTimestamp
         */
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        /**
         * @return versionCode
         */
        public String getVersionCode() {
            return this.versionCode;
        }

        public static final class Builder {
            private String addressPoolLbStrategy; 
            private AddressPools addressPools; 
            private String availableStatus; 
            private String commodityCode; 
            private String configId; 
            private String createTime; 
            private Long createTimestamp; 
            private String enableStatus; 
            private String healthStatus; 
            private String instanceId; 
            private String remark; 
            private String scheduleDomainName; 
            private String scheduleHostname; 
            private String scheduleRrType; 
            private String scheduleZoneMode; 
            private String scheduleZoneName; 
            private String sequenceLbStrategyMode; 
            private Integer ttl; 
            private String updateTime; 
            private Long updateTimestamp; 
            private String versionCode; 

            /**
             * AddressPoolLbStrategy.
             */
            public Builder addressPoolLbStrategy(String addressPoolLbStrategy) {
                this.addressPoolLbStrategy = addressPoolLbStrategy;
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
             * AvailableStatus.
             */
            public Builder availableStatus(String availableStatus) {
                this.availableStatus = availableStatus;
                return this;
            }

            /**
             * CommodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
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
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreateTimestamp.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
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
             * ScheduleZoneMode.
             */
            public Builder scheduleZoneMode(String scheduleZoneMode) {
                this.scheduleZoneMode = scheduleZoneMode;
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
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * UpdateTimestamp.
             */
            public Builder updateTimestamp(Long updateTimestamp) {
                this.updateTimestamp = updateTimestamp;
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
