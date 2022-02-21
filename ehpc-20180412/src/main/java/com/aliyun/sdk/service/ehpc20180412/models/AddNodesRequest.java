// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddNodesRequest} extends {@link RequestModel}
 *
 * <p>AddNodesRequest</p>
 */
public class AddNodesRequest extends Request {
    @Query
    @NameInMap("AllocatePublicAddress")
    private Boolean allocatePublicAddress;

    @Query
    @NameInMap("AutoRenew")
    private String autoRenew;

    @Query
    @NameInMap("AutoRenewPeriod")
    private Integer autoRenewPeriod;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("ComputeEnableHt")
    private Boolean computeEnableHt;

    @Query
    @NameInMap("ComputeSpotPriceLimit")
    private String computeSpotPriceLimit;

    @Query
    @NameInMap("ComputeSpotStrategy")
    private String computeSpotStrategy;

    @Query
    @NameInMap("Count")
    @Validation(required = true)
    private Integer count;

    @Query
    @NameInMap("CreateMode")
    private String createMode;

    @Query
    @NameInMap("DataDisks")
    private java.util.List < DataDisks> dataDisks;

    @Query
    @NameInMap("EcsChargeType")
    private String ecsChargeType;

    @Query
    @NameInMap("HostNamePrefix")
    private String hostNamePrefix;

    @Query
    @NameInMap("HostNameSuffix")
    private String hostNameSuffix;

    @Query
    @NameInMap("ImageId")
    private String imageId;

    @Query
    @NameInMap("ImageOwnerAlias")
    private String imageOwnerAlias;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("InternetChargeType")
    private String internetChargeType;

    @Query
    @NameInMap("InternetMaxBandWidthIn")
    @Validation(maximum = 100)
    private Integer internetMaxBandWidthIn;

    @Query
    @NameInMap("InternetMaxBandWidthOut")
    @Validation(maximum = 100)
    private Integer internetMaxBandWidthOut;

    @Query
    @NameInMap("JobQueue")
    private String jobQueue;

    @Query
    @NameInMap("MinCount")
    private Integer minCount;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("PeriodUnit")
    private String periodUnit;

    @Query
    @NameInMap("Sync")
    private Boolean sync;

    @Query
    @NameInMap("SystemDiskLevel")
    private String systemDiskLevel;

    @Query
    @NameInMap("SystemDiskSize")
    private Integer systemDiskSize;

    @Query
    @NameInMap("SystemDiskType")
    private String systemDiskType;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    private AddNodesRequest(Builder builder) {
        super(builder);
        this.allocatePublicAddress = builder.allocatePublicAddress;
        this.autoRenew = builder.autoRenew;
        this.autoRenewPeriod = builder.autoRenewPeriod;
        this.clientToken = builder.clientToken;
        this.clusterId = builder.clusterId;
        this.computeEnableHt = builder.computeEnableHt;
        this.computeSpotPriceLimit = builder.computeSpotPriceLimit;
        this.computeSpotStrategy = builder.computeSpotStrategy;
        this.count = builder.count;
        this.createMode = builder.createMode;
        this.dataDisks = builder.dataDisks;
        this.ecsChargeType = builder.ecsChargeType;
        this.hostNamePrefix = builder.hostNamePrefix;
        this.hostNameSuffix = builder.hostNameSuffix;
        this.imageId = builder.imageId;
        this.imageOwnerAlias = builder.imageOwnerAlias;
        this.instanceType = builder.instanceType;
        this.internetChargeType = builder.internetChargeType;
        this.internetMaxBandWidthIn = builder.internetMaxBandWidthIn;
        this.internetMaxBandWidthOut = builder.internetMaxBandWidthOut;
        this.jobQueue = builder.jobQueue;
        this.minCount = builder.minCount;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.sync = builder.sync;
        this.systemDiskLevel = builder.systemDiskLevel;
        this.systemDiskSize = builder.systemDiskSize;
        this.systemDiskType = builder.systemDiskType;
        this.vSwitchId = builder.vSwitchId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddNodesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allocatePublicAddress
     */
    public Boolean getAllocatePublicAddress() {
        return this.allocatePublicAddress;
    }

    /**
     * @return autoRenew
     */
    public String getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return autoRenewPeriod
     */
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return computeEnableHt
     */
    public Boolean getComputeEnableHt() {
        return this.computeEnableHt;
    }

    /**
     * @return computeSpotPriceLimit
     */
    public String getComputeSpotPriceLimit() {
        return this.computeSpotPriceLimit;
    }

    /**
     * @return computeSpotStrategy
     */
    public String getComputeSpotStrategy() {
        return this.computeSpotStrategy;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return createMode
     */
    public String getCreateMode() {
        return this.createMode;
    }

    /**
     * @return dataDisks
     */
    public java.util.List < DataDisks> getDataDisks() {
        return this.dataDisks;
    }

    /**
     * @return ecsChargeType
     */
    public String getEcsChargeType() {
        return this.ecsChargeType;
    }

    /**
     * @return hostNamePrefix
     */
    public String getHostNamePrefix() {
        return this.hostNamePrefix;
    }

    /**
     * @return hostNameSuffix
     */
    public String getHostNameSuffix() {
        return this.hostNameSuffix;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return imageOwnerAlias
     */
    public String getImageOwnerAlias() {
        return this.imageOwnerAlias;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return internetMaxBandWidthIn
     */
    public Integer getInternetMaxBandWidthIn() {
        return this.internetMaxBandWidthIn;
    }

    /**
     * @return internetMaxBandWidthOut
     */
    public Integer getInternetMaxBandWidthOut() {
        return this.internetMaxBandWidthOut;
    }

    /**
     * @return jobQueue
     */
    public String getJobQueue() {
        return this.jobQueue;
    }

    /**
     * @return minCount
     */
    public Integer getMinCount() {
        return this.minCount;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return sync
     */
    public Boolean getSync() {
        return this.sync;
    }

    /**
     * @return systemDiskLevel
     */
    public String getSystemDiskLevel() {
        return this.systemDiskLevel;
    }

    /**
     * @return systemDiskSize
     */
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

    /**
     * @return systemDiskType
     */
    public String getSystemDiskType() {
        return this.systemDiskType;
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

    public static final class Builder extends Request.Builder<AddNodesRequest, Builder> {
        private Boolean allocatePublicAddress; 
        private String autoRenew; 
        private Integer autoRenewPeriod; 
        private String clientToken; 
        private String clusterId; 
        private Boolean computeEnableHt; 
        private String computeSpotPriceLimit; 
        private String computeSpotStrategy; 
        private Integer count; 
        private String createMode; 
        private java.util.List < DataDisks> dataDisks; 
        private String ecsChargeType; 
        private String hostNamePrefix; 
        private String hostNameSuffix; 
        private String imageId; 
        private String imageOwnerAlias; 
        private String instanceType; 
        private String internetChargeType; 
        private Integer internetMaxBandWidthIn; 
        private Integer internetMaxBandWidthOut; 
        private String jobQueue; 
        private Integer minCount; 
        private Integer period; 
        private String periodUnit; 
        private Boolean sync; 
        private String systemDiskLevel; 
        private Integer systemDiskSize; 
        private String systemDiskType; 
        private String vSwitchId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(AddNodesRequest response) {
            super(response);
            this.allocatePublicAddress = response.allocatePublicAddress;
            this.autoRenew = response.autoRenew;
            this.autoRenewPeriod = response.autoRenewPeriod;
            this.clientToken = response.clientToken;
            this.clusterId = response.clusterId;
            this.computeEnableHt = response.computeEnableHt;
            this.computeSpotPriceLimit = response.computeSpotPriceLimit;
            this.computeSpotStrategy = response.computeSpotStrategy;
            this.count = response.count;
            this.createMode = response.createMode;
            this.dataDisks = response.dataDisks;
            this.ecsChargeType = response.ecsChargeType;
            this.hostNamePrefix = response.hostNamePrefix;
            this.hostNameSuffix = response.hostNameSuffix;
            this.imageId = response.imageId;
            this.imageOwnerAlias = response.imageOwnerAlias;
            this.instanceType = response.instanceType;
            this.internetChargeType = response.internetChargeType;
            this.internetMaxBandWidthIn = response.internetMaxBandWidthIn;
            this.internetMaxBandWidthOut = response.internetMaxBandWidthOut;
            this.jobQueue = response.jobQueue;
            this.minCount = response.minCount;
            this.period = response.period;
            this.periodUnit = response.periodUnit;
            this.sync = response.sync;
            this.systemDiskLevel = response.systemDiskLevel;
            this.systemDiskSize = response.systemDiskSize;
            this.systemDiskType = response.systemDiskType;
            this.vSwitchId = response.vSwitchId;
            this.zoneId = response.zoneId;
        } 

        /**
         * AllocatePublicAddress.
         */
        public Builder allocatePublicAddress(Boolean allocatePublicAddress) {
            this.putQueryParameter("AllocatePublicAddress", allocatePublicAddress);
            this.allocatePublicAddress = allocatePublicAddress;
            return this;
        }

        /**
         * AutoRenew.
         */
        public Builder autoRenew(String autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * AutoRenewPeriod.
         */
        public Builder autoRenewPeriod(Integer autoRenewPeriod) {
            this.putQueryParameter("AutoRenewPeriod", autoRenewPeriod);
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ComputeEnableHt.
         */
        public Builder computeEnableHt(Boolean computeEnableHt) {
            this.putQueryParameter("ComputeEnableHt", computeEnableHt);
            this.computeEnableHt = computeEnableHt;
            return this;
        }

        /**
         * ComputeSpotPriceLimit.
         */
        public Builder computeSpotPriceLimit(String computeSpotPriceLimit) {
            this.putQueryParameter("ComputeSpotPriceLimit", computeSpotPriceLimit);
            this.computeSpotPriceLimit = computeSpotPriceLimit;
            return this;
        }

        /**
         * ComputeSpotStrategy.
         */
        public Builder computeSpotStrategy(String computeSpotStrategy) {
            this.putQueryParameter("ComputeSpotStrategy", computeSpotStrategy);
            this.computeSpotStrategy = computeSpotStrategy;
            return this;
        }

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.putQueryParameter("Count", count);
            this.count = count;
            return this;
        }

        /**
         * CreateMode.
         */
        public Builder createMode(String createMode) {
            this.putQueryParameter("CreateMode", createMode);
            this.createMode = createMode;
            return this;
        }

        /**
         * DataDisks.
         */
        public Builder dataDisks(java.util.List < DataDisks> dataDisks) {
            this.putQueryParameter("DataDisks", dataDisks);
            this.dataDisks = dataDisks;
            return this;
        }

        /**
         * EcsChargeType.
         */
        public Builder ecsChargeType(String ecsChargeType) {
            this.putQueryParameter("EcsChargeType", ecsChargeType);
            this.ecsChargeType = ecsChargeType;
            return this;
        }

        /**
         * HostNamePrefix.
         */
        public Builder hostNamePrefix(String hostNamePrefix) {
            this.putQueryParameter("HostNamePrefix", hostNamePrefix);
            this.hostNamePrefix = hostNamePrefix;
            return this;
        }

        /**
         * HostNameSuffix.
         */
        public Builder hostNameSuffix(String hostNameSuffix) {
            this.putQueryParameter("HostNameSuffix", hostNameSuffix);
            this.hostNameSuffix = hostNameSuffix;
            return this;
        }

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * ImageOwnerAlias.
         */
        public Builder imageOwnerAlias(String imageOwnerAlias) {
            this.putQueryParameter("ImageOwnerAlias", imageOwnerAlias);
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }

        /**
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * InternetChargeType.
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * InternetMaxBandWidthIn.
         */
        public Builder internetMaxBandWidthIn(Integer internetMaxBandWidthIn) {
            this.putQueryParameter("InternetMaxBandWidthIn", internetMaxBandWidthIn);
            this.internetMaxBandWidthIn = internetMaxBandWidthIn;
            return this;
        }

        /**
         * InternetMaxBandWidthOut.
         */
        public Builder internetMaxBandWidthOut(Integer internetMaxBandWidthOut) {
            this.putQueryParameter("InternetMaxBandWidthOut", internetMaxBandWidthOut);
            this.internetMaxBandWidthOut = internetMaxBandWidthOut;
            return this;
        }

        /**
         * JobQueue.
         */
        public Builder jobQueue(String jobQueue) {
            this.putQueryParameter("JobQueue", jobQueue);
            this.jobQueue = jobQueue;
            return this;
        }

        /**
         * MinCount.
         */
        public Builder minCount(Integer minCount) {
            this.putQueryParameter("MinCount", minCount);
            this.minCount = minCount;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * PeriodUnit.
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * Sync.
         */
        public Builder sync(Boolean sync) {
            this.putQueryParameter("Sync", sync);
            this.sync = sync;
            return this;
        }

        /**
         * SystemDiskLevel.
         */
        public Builder systemDiskLevel(String systemDiskLevel) {
            this.putQueryParameter("SystemDiskLevel", systemDiskLevel);
            this.systemDiskLevel = systemDiskLevel;
            return this;
        }

        /**
         * SystemDiskSize.
         */
        public Builder systemDiskSize(Integer systemDiskSize) {
            this.putQueryParameter("SystemDiskSize", systemDiskSize);
            this.systemDiskSize = systemDiskSize;
            return this;
        }

        /**
         * SystemDiskType.
         */
        public Builder systemDiskType(String systemDiskType) {
            this.putQueryParameter("SystemDiskType", systemDiskType);
            this.systemDiskType = systemDiskType;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public AddNodesRequest build() {
            return new AddNodesRequest(this);
        } 

    } 

    public static class DataDisks extends TeaModel {
        @NameInMap("DataDiskCategory")
        private String dataDiskCategory;

        @NameInMap("DataDiskDeleteWithInstance")
        private Boolean dataDiskDeleteWithInstance;

        @NameInMap("DataDiskEncrypted")
        private Boolean dataDiskEncrypted;

        @NameInMap("DataDiskKMSKeyId")
        private String dataDiskKMSKeyId;

        @NameInMap("DataDiskPerformanceLevel")
        private String dataDiskPerformanceLevel;

        @NameInMap("DataDiskSize")
        private Integer dataDiskSize;

        private DataDisks(Builder builder) {
            this.dataDiskCategory = builder.dataDiskCategory;
            this.dataDiskDeleteWithInstance = builder.dataDiskDeleteWithInstance;
            this.dataDiskEncrypted = builder.dataDiskEncrypted;
            this.dataDiskKMSKeyId = builder.dataDiskKMSKeyId;
            this.dataDiskPerformanceLevel = builder.dataDiskPerformanceLevel;
            this.dataDiskSize = builder.dataDiskSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDisks create() {
            return builder().build();
        }

        /**
         * @return dataDiskCategory
         */
        public String getDataDiskCategory() {
            return this.dataDiskCategory;
        }

        /**
         * @return dataDiskDeleteWithInstance
         */
        public Boolean getDataDiskDeleteWithInstance() {
            return this.dataDiskDeleteWithInstance;
        }

        /**
         * @return dataDiskEncrypted
         */
        public Boolean getDataDiskEncrypted() {
            return this.dataDiskEncrypted;
        }

        /**
         * @return dataDiskKMSKeyId
         */
        public String getDataDiskKMSKeyId() {
            return this.dataDiskKMSKeyId;
        }

        /**
         * @return dataDiskPerformanceLevel
         */
        public String getDataDiskPerformanceLevel() {
            return this.dataDiskPerformanceLevel;
        }

        /**
         * @return dataDiskSize
         */
        public Integer getDataDiskSize() {
            return this.dataDiskSize;
        }

        public static final class Builder {
            private String dataDiskCategory; 
            private Boolean dataDiskDeleteWithInstance; 
            private Boolean dataDiskEncrypted; 
            private String dataDiskKMSKeyId; 
            private String dataDiskPerformanceLevel; 
            private Integer dataDiskSize; 

            /**
             * DataDiskCategory.
             */
            public Builder dataDiskCategory(String dataDiskCategory) {
                this.dataDiskCategory = dataDiskCategory;
                return this;
            }

            /**
             * DataDiskDeleteWithInstance.
             */
            public Builder dataDiskDeleteWithInstance(Boolean dataDiskDeleteWithInstance) {
                this.dataDiskDeleteWithInstance = dataDiskDeleteWithInstance;
                return this;
            }

            /**
             * DataDiskEncrypted.
             */
            public Builder dataDiskEncrypted(Boolean dataDiskEncrypted) {
                this.dataDiskEncrypted = dataDiskEncrypted;
                return this;
            }

            /**
             * DataDiskKMSKeyId.
             */
            public Builder dataDiskKMSKeyId(String dataDiskKMSKeyId) {
                this.dataDiskKMSKeyId = dataDiskKMSKeyId;
                return this;
            }

            /**
             * DataDiskPerformanceLevel.
             */
            public Builder dataDiskPerformanceLevel(String dataDiskPerformanceLevel) {
                this.dataDiskPerformanceLevel = dataDiskPerformanceLevel;
                return this;
            }

            /**
             * DataDiskSize.
             */
            public Builder dataDiskSize(Integer dataDiskSize) {
                this.dataDiskSize = dataDiskSize;
                return this;
            }

            public DataDisks build() {
                return new DataDisks(this);
            } 

        } 

    }
}
