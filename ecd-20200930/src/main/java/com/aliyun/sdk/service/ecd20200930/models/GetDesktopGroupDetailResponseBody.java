// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDesktopGroupDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetDesktopGroupDetailResponseBody</p>
 */
public class GetDesktopGroupDetailResponseBody extends TeaModel {
    @NameInMap("Desktops")
    private Desktops desktops;

    @NameInMap("RequestId")
    private String requestId;

    private GetDesktopGroupDetailResponseBody(Builder builder) {
        this.desktops = builder.desktops;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDesktopGroupDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return desktops
     */
    public Desktops getDesktops() {
        return this.desktops;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Desktops desktops; 
        private String requestId; 

        /**
         * Desktops.
         */
        public Builder desktops(Desktops desktops) {
            this.desktops = desktops;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDesktopGroupDetailResponseBody build() {
            return new GetDesktopGroupDetailResponseBody(this);
        } 

    } 

    public static class TimerInfos extends TeaModel {
        @NameInMap("CronExpression")
        private String cronExpression;

        @NameInMap("Forced")
        private Boolean forced;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("TimerType")
        private Integer timerType;

        private TimerInfos(Builder builder) {
            this.cronExpression = builder.cronExpression;
            this.forced = builder.forced;
            this.status = builder.status;
            this.timerType = builder.timerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimerInfos create() {
            return builder().build();
        }

        /**
         * @return cronExpression
         */
        public String getCronExpression() {
            return this.cronExpression;
        }

        /**
         * @return forced
         */
        public Boolean getForced() {
            return this.forced;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return timerType
         */
        public Integer getTimerType() {
            return this.timerType;
        }

        public static final class Builder {
            private String cronExpression; 
            private Boolean forced; 
            private Integer status; 
            private Integer timerType; 

            /**
             * CronExpression.
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * Forced.
             */
            public Builder forced(Boolean forced) {
                this.forced = forced;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * TimerType.
             */
            public Builder timerType(Integer timerType) {
                this.timerType = timerType;
                return this;
            }

            public TimerInfos build() {
                return new TimerInfos(this);
            } 

        } 

    }
    public static class Desktops extends TeaModel {
        @NameInMap("AllowAutoSetup")
        private Integer allowAutoSetup;

        @NameInMap("AllowBufferCount")
        private Integer allowBufferCount;

        @NameInMap("BindAmount")
        private Integer bindAmount;

        @NameInMap("Comments")
        private String comments;

        @NameInMap("ConnectDuration")
        private Long connectDuration;

        @NameInMap("Cpu")
        private Integer cpu;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Creator")
        private String creator;

        @NameInMap("DataDiskCategory")
        private String dataDiskCategory;

        @NameInMap("DataDiskSize")
        private String dataDiskSize;

        @NameInMap("DesktopGroupId")
        private String desktopGroupId;

        @NameInMap("DesktopGroupName")
        private String desktopGroupName;

        @NameInMap("DirectoryId")
        private String directoryId;

        @NameInMap("DirectoryType")
        private String directoryType;

        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("GpuCount")
        private Float gpuCount;

        @NameInMap("GpuSpec")
        private String gpuSpec;

        @NameInMap("IdleDisconnectDuration")
        private Long idleDisconnectDuration;

        @NameInMap("KeepDuration")
        private Long keepDuration;

        @NameInMap("LoadPolicy")
        private Integer loadPolicy;

        @NameInMap("MaxDesktopsCount")
        private Integer maxDesktopsCount;

        @NameInMap("Memory")
        private Long memory;

        @NameInMap("MinDesktopsCount")
        private Integer minDesktopsCount;

        @NameInMap("OfficeSiteId")
        private String officeSiteId;

        @NameInMap("OfficeSiteName")
        private String officeSiteName;

        @NameInMap("OfficeSiteType")
        private String officeSiteType;

        @NameInMap("OwnBundleId")
        private String ownBundleId;

        @NameInMap("OwnBundleName")
        private String ownBundleName;

        @NameInMap("OwnType")
        private Integer ownType;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("PolicyGroupId")
        private String policyGroupId;

        @NameInMap("PolicyGroupName")
        private String policyGroupName;

        @NameInMap("RatioThreshold")
        private Float ratioThreshold;

        @NameInMap("ResType")
        private Integer resType;

        @NameInMap("ResetType")
        private Integer resetType;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("StopDuration")
        private Long stopDuration;

        @NameInMap("SystemDiskCategory")
        private String systemDiskCategory;

        @NameInMap("SystemDiskSize")
        private Integer systemDiskSize;

        @NameInMap("TimerInfos")
        private java.util.List < TimerInfos> timerInfos;

        @NameInMap("Version")
        private Long version;

        private Desktops(Builder builder) {
            this.allowAutoSetup = builder.allowAutoSetup;
            this.allowBufferCount = builder.allowBufferCount;
            this.bindAmount = builder.bindAmount;
            this.comments = builder.comments;
            this.connectDuration = builder.connectDuration;
            this.cpu = builder.cpu;
            this.creationTime = builder.creationTime;
            this.creator = builder.creator;
            this.dataDiskCategory = builder.dataDiskCategory;
            this.dataDiskSize = builder.dataDiskSize;
            this.desktopGroupId = builder.desktopGroupId;
            this.desktopGroupName = builder.desktopGroupName;
            this.directoryId = builder.directoryId;
            this.directoryType = builder.directoryType;
            this.expiredTime = builder.expiredTime;
            this.gpuCount = builder.gpuCount;
            this.gpuSpec = builder.gpuSpec;
            this.idleDisconnectDuration = builder.idleDisconnectDuration;
            this.keepDuration = builder.keepDuration;
            this.loadPolicy = builder.loadPolicy;
            this.maxDesktopsCount = builder.maxDesktopsCount;
            this.memory = builder.memory;
            this.minDesktopsCount = builder.minDesktopsCount;
            this.officeSiteId = builder.officeSiteId;
            this.officeSiteName = builder.officeSiteName;
            this.officeSiteType = builder.officeSiteType;
            this.ownBundleId = builder.ownBundleId;
            this.ownBundleName = builder.ownBundleName;
            this.ownType = builder.ownType;
            this.payType = builder.payType;
            this.policyGroupId = builder.policyGroupId;
            this.policyGroupName = builder.policyGroupName;
            this.ratioThreshold = builder.ratioThreshold;
            this.resType = builder.resType;
            this.resetType = builder.resetType;
            this.status = builder.status;
            this.stopDuration = builder.stopDuration;
            this.systemDiskCategory = builder.systemDiskCategory;
            this.systemDiskSize = builder.systemDiskSize;
            this.timerInfos = builder.timerInfos;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Desktops create() {
            return builder().build();
        }

        /**
         * @return allowAutoSetup
         */
        public Integer getAllowAutoSetup() {
            return this.allowAutoSetup;
        }

        /**
         * @return allowBufferCount
         */
        public Integer getAllowBufferCount() {
            return this.allowBufferCount;
        }

        /**
         * @return bindAmount
         */
        public Integer getBindAmount() {
            return this.bindAmount;
        }

        /**
         * @return comments
         */
        public String getComments() {
            return this.comments;
        }

        /**
         * @return connectDuration
         */
        public Long getConnectDuration() {
            return this.connectDuration;
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return dataDiskCategory
         */
        public String getDataDiskCategory() {
            return this.dataDiskCategory;
        }

        /**
         * @return dataDiskSize
         */
        public String getDataDiskSize() {
            return this.dataDiskSize;
        }

        /**
         * @return desktopGroupId
         */
        public String getDesktopGroupId() {
            return this.desktopGroupId;
        }

        /**
         * @return desktopGroupName
         */
        public String getDesktopGroupName() {
            return this.desktopGroupName;
        }

        /**
         * @return directoryId
         */
        public String getDirectoryId() {
            return this.directoryId;
        }

        /**
         * @return directoryType
         */
        public String getDirectoryType() {
            return this.directoryType;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return gpuCount
         */
        public Float getGpuCount() {
            return this.gpuCount;
        }

        /**
         * @return gpuSpec
         */
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        /**
         * @return idleDisconnectDuration
         */
        public Long getIdleDisconnectDuration() {
            return this.idleDisconnectDuration;
        }

        /**
         * @return keepDuration
         */
        public Long getKeepDuration() {
            return this.keepDuration;
        }

        /**
         * @return loadPolicy
         */
        public Integer getLoadPolicy() {
            return this.loadPolicy;
        }

        /**
         * @return maxDesktopsCount
         */
        public Integer getMaxDesktopsCount() {
            return this.maxDesktopsCount;
        }

        /**
         * @return memory
         */
        public Long getMemory() {
            return this.memory;
        }

        /**
         * @return minDesktopsCount
         */
        public Integer getMinDesktopsCount() {
            return this.minDesktopsCount;
        }

        /**
         * @return officeSiteId
         */
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        /**
         * @return officeSiteName
         */
        public String getOfficeSiteName() {
            return this.officeSiteName;
        }

        /**
         * @return officeSiteType
         */
        public String getOfficeSiteType() {
            return this.officeSiteType;
        }

        /**
         * @return ownBundleId
         */
        public String getOwnBundleId() {
            return this.ownBundleId;
        }

        /**
         * @return ownBundleName
         */
        public String getOwnBundleName() {
            return this.ownBundleName;
        }

        /**
         * @return ownType
         */
        public Integer getOwnType() {
            return this.ownType;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return policyGroupId
         */
        public String getPolicyGroupId() {
            return this.policyGroupId;
        }

        /**
         * @return policyGroupName
         */
        public String getPolicyGroupName() {
            return this.policyGroupName;
        }

        /**
         * @return ratioThreshold
         */
        public Float getRatioThreshold() {
            return this.ratioThreshold;
        }

        /**
         * @return resType
         */
        public Integer getResType() {
            return this.resType;
        }

        /**
         * @return resetType
         */
        public Integer getResetType() {
            return this.resetType;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return stopDuration
         */
        public Long getStopDuration() {
            return this.stopDuration;
        }

        /**
         * @return systemDiskCategory
         */
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        /**
         * @return systemDiskSize
         */
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        /**
         * @return timerInfos
         */
        public java.util.List < TimerInfos> getTimerInfos() {
            return this.timerInfos;
        }

        /**
         * @return version
         */
        public Long getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Integer allowAutoSetup; 
            private Integer allowBufferCount; 
            private Integer bindAmount; 
            private String comments; 
            private Long connectDuration; 
            private Integer cpu; 
            private String creationTime; 
            private String creator; 
            private String dataDiskCategory; 
            private String dataDiskSize; 
            private String desktopGroupId; 
            private String desktopGroupName; 
            private String directoryId; 
            private String directoryType; 
            private String expiredTime; 
            private Float gpuCount; 
            private String gpuSpec; 
            private Long idleDisconnectDuration; 
            private Long keepDuration; 
            private Integer loadPolicy; 
            private Integer maxDesktopsCount; 
            private Long memory; 
            private Integer minDesktopsCount; 
            private String officeSiteId; 
            private String officeSiteName; 
            private String officeSiteType; 
            private String ownBundleId; 
            private String ownBundleName; 
            private Integer ownType; 
            private String payType; 
            private String policyGroupId; 
            private String policyGroupName; 
            private Float ratioThreshold; 
            private Integer resType; 
            private Integer resetType; 
            private Integer status; 
            private Long stopDuration; 
            private String systemDiskCategory; 
            private Integer systemDiskSize; 
            private java.util.List < TimerInfos> timerInfos; 
            private Long version; 

            /**
             * AllowAutoSetup.
             */
            public Builder allowAutoSetup(Integer allowAutoSetup) {
                this.allowAutoSetup = allowAutoSetup;
                return this;
            }

            /**
             * AllowBufferCount.
             */
            public Builder allowBufferCount(Integer allowBufferCount) {
                this.allowBufferCount = allowBufferCount;
                return this;
            }

            /**
             * BindAmount.
             */
            public Builder bindAmount(Integer bindAmount) {
                this.bindAmount = bindAmount;
                return this;
            }

            /**
             * Comments.
             */
            public Builder comments(String comments) {
                this.comments = comments;
                return this;
            }

            /**
             * ConnectDuration.
             */
            public Builder connectDuration(Long connectDuration) {
                this.connectDuration = connectDuration;
                return this;
            }

            /**
             * Cpu.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * DataDiskCategory.
             */
            public Builder dataDiskCategory(String dataDiskCategory) {
                this.dataDiskCategory = dataDiskCategory;
                return this;
            }

            /**
             * DataDiskSize.
             */
            public Builder dataDiskSize(String dataDiskSize) {
                this.dataDiskSize = dataDiskSize;
                return this;
            }

            /**
             * DesktopGroupId.
             */
            public Builder desktopGroupId(String desktopGroupId) {
                this.desktopGroupId = desktopGroupId;
                return this;
            }

            /**
             * DesktopGroupName.
             */
            public Builder desktopGroupName(String desktopGroupName) {
                this.desktopGroupName = desktopGroupName;
                return this;
            }

            /**
             * DirectoryId.
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * DirectoryType.
             */
            public Builder directoryType(String directoryType) {
                this.directoryType = directoryType;
                return this;
            }

            /**
             * ExpiredTime.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * GpuCount.
             */
            public Builder gpuCount(Float gpuCount) {
                this.gpuCount = gpuCount;
                return this;
            }

            /**
             * GpuSpec.
             */
            public Builder gpuSpec(String gpuSpec) {
                this.gpuSpec = gpuSpec;
                return this;
            }

            /**
             * IdleDisconnectDuration.
             */
            public Builder idleDisconnectDuration(Long idleDisconnectDuration) {
                this.idleDisconnectDuration = idleDisconnectDuration;
                return this;
            }

            /**
             * KeepDuration.
             */
            public Builder keepDuration(Long keepDuration) {
                this.keepDuration = keepDuration;
                return this;
            }

            /**
             * LoadPolicy.
             */
            public Builder loadPolicy(Integer loadPolicy) {
                this.loadPolicy = loadPolicy;
                return this;
            }

            /**
             * MaxDesktopsCount.
             */
            public Builder maxDesktopsCount(Integer maxDesktopsCount) {
                this.maxDesktopsCount = maxDesktopsCount;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(Long memory) {
                this.memory = memory;
                return this;
            }

            /**
             * MinDesktopsCount.
             */
            public Builder minDesktopsCount(Integer minDesktopsCount) {
                this.minDesktopsCount = minDesktopsCount;
                return this;
            }

            /**
             * OfficeSiteId.
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * OfficeSiteName.
             */
            public Builder officeSiteName(String officeSiteName) {
                this.officeSiteName = officeSiteName;
                return this;
            }

            /**
             * OfficeSiteType.
             */
            public Builder officeSiteType(String officeSiteType) {
                this.officeSiteType = officeSiteType;
                return this;
            }

            /**
             * OwnBundleId.
             */
            public Builder ownBundleId(String ownBundleId) {
                this.ownBundleId = ownBundleId;
                return this;
            }

            /**
             * OwnBundleName.
             */
            public Builder ownBundleName(String ownBundleName) {
                this.ownBundleName = ownBundleName;
                return this;
            }

            /**
             * OwnType.
             */
            public Builder ownType(Integer ownType) {
                this.ownType = ownType;
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
             * PolicyGroupId.
             */
            public Builder policyGroupId(String policyGroupId) {
                this.policyGroupId = policyGroupId;
                return this;
            }

            /**
             * PolicyGroupName.
             */
            public Builder policyGroupName(String policyGroupName) {
                this.policyGroupName = policyGroupName;
                return this;
            }

            /**
             * RatioThreshold.
             */
            public Builder ratioThreshold(Float ratioThreshold) {
                this.ratioThreshold = ratioThreshold;
                return this;
            }

            /**
             * ResType.
             */
            public Builder resType(Integer resType) {
                this.resType = resType;
                return this;
            }

            /**
             * ResetType.
             */
            public Builder resetType(Integer resetType) {
                this.resetType = resetType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * StopDuration.
             */
            public Builder stopDuration(Long stopDuration) {
                this.stopDuration = stopDuration;
                return this;
            }

            /**
             * SystemDiskCategory.
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * SystemDiskSize.
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * TimerInfos.
             */
            public Builder timerInfos(java.util.List < TimerInfos> timerInfos) {
                this.timerInfos = timerInfos;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            public Desktops build() {
                return new Desktops(this);
            } 

        } 

    }
}
