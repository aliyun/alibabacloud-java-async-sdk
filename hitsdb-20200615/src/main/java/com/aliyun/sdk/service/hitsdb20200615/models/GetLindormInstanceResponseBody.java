// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLindormInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetLindormInstanceResponseBody</p>
 */
public class GetLindormInstanceResponseBody extends TeaModel {
    @NameInMap("AliUid")
    private Long aliUid;

    @NameInMap("AutoRenew")
    private Boolean autoRenew;

    @NameInMap("ColdStorage")
    private Integer coldStorage;

    @NameInMap("CreateMilliseconds")
    private Long createMilliseconds;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("DeletionProtection")
    private String deletionProtection;

    @NameInMap("DiskCategory")
    private String diskCategory;

    @NameInMap("DiskThreshold")
    private String diskThreshold;

    @NameInMap("DiskUsage")
    private String diskUsage;

    @NameInMap("EnableCdc")
    private Boolean enableCdc;

    @NameInMap("EnableCompute")
    private Boolean enableCompute;

    @NameInMap("EnableKms")
    private Boolean enableKms;

    @NameInMap("EnableSSL")
    private Boolean enableSSL;

    @NameInMap("EngineList")
    private java.util.List < EngineList> engineList;

    @NameInMap("EngineType")
    private Integer engineType;

    @NameInMap("ExpireTime")
    private String expireTime;

    @NameInMap("ExpiredMilliseconds")
    private Long expiredMilliseconds;

    @NameInMap("InstanceAlias")
    private String instanceAlias;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("InstanceStatus")
    private String instanceStatus;

    @NameInMap("InstanceStorage")
    private String instanceStorage;

    @NameInMap("NetworkType")
    private String networkType;

    @NameInMap("PayType")
    private String payType;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServiceType")
    private String serviceType;

    @NameInMap("VpcId")
    private String vpcId;

    @NameInMap("VswitchId")
    private String vswitchId;

    @NameInMap("ZoneId")
    private String zoneId;

    private GetLindormInstanceResponseBody(Builder builder) {
        this.aliUid = builder.aliUid;
        this.autoRenew = builder.autoRenew;
        this.coldStorage = builder.coldStorage;
        this.createMilliseconds = builder.createMilliseconds;
        this.createTime = builder.createTime;
        this.deletionProtection = builder.deletionProtection;
        this.diskCategory = builder.diskCategory;
        this.diskThreshold = builder.diskThreshold;
        this.diskUsage = builder.diskUsage;
        this.enableCdc = builder.enableCdc;
        this.enableCompute = builder.enableCompute;
        this.enableKms = builder.enableKms;
        this.enableSSL = builder.enableSSL;
        this.engineList = builder.engineList;
        this.engineType = builder.engineType;
        this.expireTime = builder.expireTime;
        this.expiredMilliseconds = builder.expiredMilliseconds;
        this.instanceAlias = builder.instanceAlias;
        this.instanceId = builder.instanceId;
        this.instanceStatus = builder.instanceStatus;
        this.instanceStorage = builder.instanceStorage;
        this.networkType = builder.networkType;
        this.payType = builder.payType;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.serviceType = builder.serviceType;
        this.vpcId = builder.vpcId;
        this.vswitchId = builder.vswitchId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLindormInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return aliUid
     */
    public Long getAliUid() {
        return this.aliUid;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return coldStorage
     */
    public Integer getColdStorage() {
        return this.coldStorage;
    }

    /**
     * @return createMilliseconds
     */
    public Long getCreateMilliseconds() {
        return this.createMilliseconds;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return deletionProtection
     */
    public String getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * @return diskCategory
     */
    public String getDiskCategory() {
        return this.diskCategory;
    }

    /**
     * @return diskThreshold
     */
    public String getDiskThreshold() {
        return this.diskThreshold;
    }

    /**
     * @return diskUsage
     */
    public String getDiskUsage() {
        return this.diskUsage;
    }

    /**
     * @return enableCdc
     */
    public Boolean getEnableCdc() {
        return this.enableCdc;
    }

    /**
     * @return enableCompute
     */
    public Boolean getEnableCompute() {
        return this.enableCompute;
    }

    /**
     * @return enableKms
     */
    public Boolean getEnableKms() {
        return this.enableKms;
    }

    /**
     * @return enableSSL
     */
    public Boolean getEnableSSL() {
        return this.enableSSL;
    }

    /**
     * @return engineList
     */
    public java.util.List < EngineList> getEngineList() {
        return this.engineList;
    }

    /**
     * @return engineType
     */
    public Integer getEngineType() {
        return this.engineType;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return expiredMilliseconds
     */
    public Long getExpiredMilliseconds() {
        return this.expiredMilliseconds;
    }

    /**
     * @return instanceAlias
     */
    public String getInstanceAlias() {
        return this.instanceAlias;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceStatus
     */
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    /**
     * @return instanceStorage
     */
    public String getInstanceStorage() {
        return this.instanceStorage;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceType
     */
    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vswitchId
     */
    public String getVswitchId() {
        return this.vswitchId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder {
        private Long aliUid; 
        private Boolean autoRenew; 
        private Integer coldStorage; 
        private Long createMilliseconds; 
        private String createTime; 
        private String deletionProtection; 
        private String diskCategory; 
        private String diskThreshold; 
        private String diskUsage; 
        private Boolean enableCdc; 
        private Boolean enableCompute; 
        private Boolean enableKms; 
        private Boolean enableSSL; 
        private java.util.List < EngineList> engineList; 
        private Integer engineType; 
        private String expireTime; 
        private Long expiredMilliseconds; 
        private String instanceAlias; 
        private String instanceId; 
        private String instanceStatus; 
        private String instanceStorage; 
        private String networkType; 
        private String payType; 
        private String regionId; 
        private String requestId; 
        private String serviceType; 
        private String vpcId; 
        private String vswitchId; 
        private String zoneId; 

        /**
         * AliUid.
         */
        public Builder aliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }

        /**
         * AutoRenew.
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * ColdStorage.
         */
        public Builder coldStorage(Integer coldStorage) {
            this.coldStorage = coldStorage;
            return this;
        }

        /**
         * CreateMilliseconds.
         */
        public Builder createMilliseconds(Long createMilliseconds) {
            this.createMilliseconds = createMilliseconds;
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
         * DeletionProtection.
         */
        public Builder deletionProtection(String deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * DiskCategory.
         */
        public Builder diskCategory(String diskCategory) {
            this.diskCategory = diskCategory;
            return this;
        }

        /**
         * DiskThreshold.
         */
        public Builder diskThreshold(String diskThreshold) {
            this.diskThreshold = diskThreshold;
            return this;
        }

        /**
         * DiskUsage.
         */
        public Builder diskUsage(String diskUsage) {
            this.diskUsage = diskUsage;
            return this;
        }

        /**
         * EnableCdc.
         */
        public Builder enableCdc(Boolean enableCdc) {
            this.enableCdc = enableCdc;
            return this;
        }

        /**
         * EnableCompute.
         */
        public Builder enableCompute(Boolean enableCompute) {
            this.enableCompute = enableCompute;
            return this;
        }

        /**
         * EnableKms.
         */
        public Builder enableKms(Boolean enableKms) {
            this.enableKms = enableKms;
            return this;
        }

        /**
         * EnableSSL.
         */
        public Builder enableSSL(Boolean enableSSL) {
            this.enableSSL = enableSSL;
            return this;
        }

        /**
         * EngineList.
         */
        public Builder engineList(java.util.List < EngineList> engineList) {
            this.engineList = engineList;
            return this;
        }

        /**
         * EngineType.
         */
        public Builder engineType(Integer engineType) {
            this.engineType = engineType;
            return this;
        }

        /**
         * ExpireTime.
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * ExpiredMilliseconds.
         */
        public Builder expiredMilliseconds(Long expiredMilliseconds) {
            this.expiredMilliseconds = expiredMilliseconds;
            return this;
        }

        /**
         * InstanceAlias.
         */
        public Builder instanceAlias(String instanceAlias) {
            this.instanceAlias = instanceAlias;
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
         * InstanceStatus.
         */
        public Builder instanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }

        /**
         * InstanceStorage.
         */
        public Builder instanceStorage(String instanceStorage) {
            this.instanceStorage = instanceStorage;
            return this;
        }

        /**
         * NetworkType.
         */
        public Builder networkType(String networkType) {
            this.networkType = networkType;
            return this;
        }

        /**
         * PayType.
         */
        public Builder payType(String payType) {
            this.payType = payType;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
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
         * ServiceType.
         */
        public Builder serviceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * VswitchId.
         */
        public Builder vswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public GetLindormInstanceResponseBody build() {
            return new GetLindormInstanceResponseBody(this);
        } 

    } 

    public static class EngineList extends TeaModel {
        @NameInMap("CoreCount")
        private String coreCount;

        @NameInMap("CpuCount")
        private String cpuCount;

        @NameInMap("Engine")
        private String engine;

        @NameInMap("IsLastVersion")
        private Boolean isLastVersion;

        @NameInMap("LatestVersion")
        private String latestVersion;

        @NameInMap("MemorySize")
        private String memorySize;

        @NameInMap("Version")
        private String version;

        private EngineList(Builder builder) {
            this.coreCount = builder.coreCount;
            this.cpuCount = builder.cpuCount;
            this.engine = builder.engine;
            this.isLastVersion = builder.isLastVersion;
            this.latestVersion = builder.latestVersion;
            this.memorySize = builder.memorySize;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EngineList create() {
            return builder().build();
        }

        /**
         * @return coreCount
         */
        public String getCoreCount() {
            return this.coreCount;
        }

        /**
         * @return cpuCount
         */
        public String getCpuCount() {
            return this.cpuCount;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return isLastVersion
         */
        public Boolean getIsLastVersion() {
            return this.isLastVersion;
        }

        /**
         * @return latestVersion
         */
        public String getLatestVersion() {
            return this.latestVersion;
        }

        /**
         * @return memorySize
         */
        public String getMemorySize() {
            return this.memorySize;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String coreCount; 
            private String cpuCount; 
            private String engine; 
            private Boolean isLastVersion; 
            private String latestVersion; 
            private String memorySize; 
            private String version; 

            /**
             * CoreCount.
             */
            public Builder coreCount(String coreCount) {
                this.coreCount = coreCount;
                return this;
            }

            /**
             * CpuCount.
             */
            public Builder cpuCount(String cpuCount) {
                this.cpuCount = cpuCount;
                return this;
            }

            /**
             * Engine.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * IsLastVersion.
             */
            public Builder isLastVersion(Boolean isLastVersion) {
                this.isLastVersion = isLastVersion;
                return this;
            }

            /**
             * LatestVersion.
             */
            public Builder latestVersion(String latestVersion) {
                this.latestVersion = latestVersion;
                return this;
            }

            /**
             * MemorySize.
             */
            public Builder memorySize(String memorySize) {
                this.memorySize = memorySize;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public EngineList build() {
                return new EngineList(this);
            } 

        } 

    }
}
