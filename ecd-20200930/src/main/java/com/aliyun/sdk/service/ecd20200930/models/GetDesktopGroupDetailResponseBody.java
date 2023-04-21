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
         * Details of the desktop group.
         */
        public Builder desktops(Desktops desktops) {
            this.desktops = desktops;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDesktopGroupDetailResponseBody build() {
            return new GetDesktopGroupDetailResponseBody(this);
        } 

    } 

    public static class ScaleTimerInfos extends TeaModel {
        @NameInMap("BuyResAmount")
        private Integer buyResAmount;

        @NameInMap("Cron")
        private String cron;

        @NameInMap("KeepDuration")
        private Long keepDuration;

        @NameInMap("LoadPolicy")
        private Integer loadPolicy;

        @NameInMap("MaxResAmount")
        private Integer maxResAmount;

        @NameInMap("MinResAmount")
        private Integer minResAmount;

        @NameInMap("RatioThreshold")
        private Float ratioThreshold;

        @NameInMap("Type")
        private String type;

        private ScaleTimerInfos(Builder builder) {
            this.buyResAmount = builder.buyResAmount;
            this.cron = builder.cron;
            this.keepDuration = builder.keepDuration;
            this.loadPolicy = builder.loadPolicy;
            this.maxResAmount = builder.maxResAmount;
            this.minResAmount = builder.minResAmount;
            this.ratioThreshold = builder.ratioThreshold;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScaleTimerInfos create() {
            return builder().build();
        }

        /**
         * @return buyResAmount
         */
        public Integer getBuyResAmount() {
            return this.buyResAmount;
        }

        /**
         * @return cron
         */
        public String getCron() {
            return this.cron;
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
         * @return maxResAmount
         */
        public Integer getMaxResAmount() {
            return this.maxResAmount;
        }

        /**
         * @return minResAmount
         */
        public Integer getMinResAmount() {
            return this.minResAmount;
        }

        /**
         * @return ratioThreshold
         */
        public Float getRatioThreshold() {
            return this.ratioThreshold;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer buyResAmount; 
            private String cron; 
            private Long keepDuration; 
            private Integer loadPolicy; 
            private Integer maxResAmount; 
            private Integer minResAmount; 
            private Float ratioThreshold; 
            private String type; 

            /**
             * The number of purchased cloud desktops during the scaling event. Valid values: 0 to 200.
             */
            public Builder buyResAmount(Integer buyResAmount) {
                this.buyResAmount = buyResAmount;
                return this;
            }

            /**
             * The type of the CRON expression that is specified for the scheduled task.
             */
            public Builder cron(String cron) {
                this.cron = cron;
                return this;
            }

            /**
             * The retention period of a cloud desktop in the desktop group after the cloud desktop is disconnected. Unit: milliseconds.
             */
            public Builder keepDuration(Long keepDuration) {
                this.keepDuration = keepDuration;
                return this;
            }

            /**
             * The load balancing policy for the multi-session desktop group.
             */
            public Builder loadPolicy(Integer loadPolicy) {
                this.loadPolicy = loadPolicy;
                return this;
            }

            /**
             * The maximum number of cloud desktops that the system can scale. Valid values: 0 to 200.
             */
            public Builder maxResAmount(Integer maxResAmount) {
                this.maxResAmount = maxResAmount;
                return this;
            }

            /**
             * The minimum number of cloud desktops that the system must scale. Valid values: 0 to 200.
             */
            public Builder minResAmount(Integer minResAmount) {
                this.minResAmount = minResAmount;
                return this;
            }

            /**
             * The threshold for the ratio of connected sessions. This parameter is the condition that triggers auto scaling in a multi-session desktop group. `Ratio of connected sessions = Number of connected sessions/(Total number of cloud desktops × Maximum number of sessions allowed for each cloud desktop) × 100%`. If the specified threshold is reached, new cloud desktops are automatically created. If the specified threshold is not reached, idle cloud desktops are released.
             */
            public Builder ratioThreshold(Float ratioThreshold) {
                this.ratioThreshold = ratioThreshold;
                return this;
            }

            /**
             * The type of the scheduled task.
             * <p>
             * 
             * Valid values:
             * 
             * *   drop
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     decline policy
             * 
             *     <!-- -->
             * 
             *     .
             * 
             * *   normal
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     normal policy
             * 
             *     <!-- -->
             * 
             *     .
             * 
             * *   peak
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     peak hour policy
             * 
             *     <!-- -->
             * 
             *     .
             * 
             * *   rise
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     rise policy
             * 
             *     <!-- -->
             * 
             *     .
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ScaleTimerInfos build() {
                return new ScaleTimerInfos(this);
            } 

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
             * The CRON expression of the scheduled task.
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * Indicates whether the scheduled task is forcibly executed.
             */
            public Builder forced(Boolean forced) {
                this.forced = forced;
                return this;
            }

            /**
             * The status of the scheduled task.
             * <p>
             * 
             * Valid values:
             * 
             * *   1
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     The scheduled task is enabled
             * 
             *     <!-- -->
             * 
             *     .
             * 
             * *   2
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     The scheduled task is disabled
             * 
             *     <!-- -->
             * 
             *     .
             * 
             * *   3
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     The scheduled task is deleted
             * 
             *     <!-- -->
             * 
             *     .
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The type of the scheduled task.
             * <p>
             * 
             * Valid values:
             * 
             * *   1
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     scheduled reset
             * 
             *     <!-- -->
             * 
             *     .
             * 
             * *   2
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     scheduled startup
             * 
             *     <!-- -->
             * 
             *     .
             * 
             * *   3
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     scheduled stop
             * 
             *     <!-- -->
             * 
             *     .
             * 
             * *   4
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     scheduled restart
             * 
             *     <!-- -->
             * 
             *     .
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

        @NameInMap("BuyDesktopsCount")
        private Integer buyDesktopsCount;

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

        @NameInMap("ImageId")
        private String imageId;

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

        @NameInMap("NasFileSystemID")
        private String nasFileSystemID;

        @NameInMap("NasFileSystemName")
        private String nasFileSystemName;

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

        @NameInMap("PolicyGroupIds")
        private java.util.List < String > policyGroupIds;

        @NameInMap("PolicyGroupName")
        private String policyGroupName;

        @NameInMap("PolicyGroupNames")
        private java.util.List < String > policyGroupNames;

        @NameInMap("ProfileFollowSwitch")
        private Boolean profileFollowSwitch;

        @NameInMap("RatioThreshold")
        private Float ratioThreshold;

        @NameInMap("ResType")
        private Integer resType;

        @NameInMap("ResetType")
        private Integer resetType;

        @NameInMap("ScaleTimerInfos")
        private java.util.List < ScaleTimerInfos> scaleTimerInfos;

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

        @NameInMap("TimingStrategyInfo")
        private String timingStrategyInfo;

        @NameInMap("Version")
        private Long version;

        private Desktops(Builder builder) {
            this.allowAutoSetup = builder.allowAutoSetup;
            this.allowBufferCount = builder.allowBufferCount;
            this.bindAmount = builder.bindAmount;
            this.buyDesktopsCount = builder.buyDesktopsCount;
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
            this.imageId = builder.imageId;
            this.keepDuration = builder.keepDuration;
            this.loadPolicy = builder.loadPolicy;
            this.maxDesktopsCount = builder.maxDesktopsCount;
            this.memory = builder.memory;
            this.minDesktopsCount = builder.minDesktopsCount;
            this.nasFileSystemID = builder.nasFileSystemID;
            this.nasFileSystemName = builder.nasFileSystemName;
            this.officeSiteId = builder.officeSiteId;
            this.officeSiteName = builder.officeSiteName;
            this.officeSiteType = builder.officeSiteType;
            this.ownBundleId = builder.ownBundleId;
            this.ownBundleName = builder.ownBundleName;
            this.ownType = builder.ownType;
            this.payType = builder.payType;
            this.policyGroupId = builder.policyGroupId;
            this.policyGroupIds = builder.policyGroupIds;
            this.policyGroupName = builder.policyGroupName;
            this.policyGroupNames = builder.policyGroupNames;
            this.profileFollowSwitch = builder.profileFollowSwitch;
            this.ratioThreshold = builder.ratioThreshold;
            this.resType = builder.resType;
            this.resetType = builder.resetType;
            this.scaleTimerInfos = builder.scaleTimerInfos;
            this.status = builder.status;
            this.stopDuration = builder.stopDuration;
            this.systemDiskCategory = builder.systemDiskCategory;
            this.systemDiskSize = builder.systemDiskSize;
            this.timerInfos = builder.timerInfos;
            this.timingStrategyInfo = builder.timingStrategyInfo;
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
         * @return buyDesktopsCount
         */
        public Integer getBuyDesktopsCount() {
            return this.buyDesktopsCount;
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
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
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
         * @return nasFileSystemID
         */
        public String getNasFileSystemID() {
            return this.nasFileSystemID;
        }

        /**
         * @return nasFileSystemName
         */
        public String getNasFileSystemName() {
            return this.nasFileSystemName;
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
         * @return policyGroupIds
         */
        public java.util.List < String > getPolicyGroupIds() {
            return this.policyGroupIds;
        }

        /**
         * @return policyGroupName
         */
        public String getPolicyGroupName() {
            return this.policyGroupName;
        }

        /**
         * @return policyGroupNames
         */
        public java.util.List < String > getPolicyGroupNames() {
            return this.policyGroupNames;
        }

        /**
         * @return profileFollowSwitch
         */
        public Boolean getProfileFollowSwitch() {
            return this.profileFollowSwitch;
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
         * @return scaleTimerInfos
         */
        public java.util.List < ScaleTimerInfos> getScaleTimerInfos() {
            return this.scaleTimerInfos;
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
         * @return timingStrategyInfo
         */
        public String getTimingStrategyInfo() {
            return this.timingStrategyInfo;
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
            private Integer buyDesktopsCount; 
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
            private String imageId; 
            private Long keepDuration; 
            private Integer loadPolicy; 
            private Integer maxDesktopsCount; 
            private Long memory; 
            private Integer minDesktopsCount; 
            private String nasFileSystemID; 
            private String nasFileSystemName; 
            private String officeSiteId; 
            private String officeSiteName; 
            private String officeSiteType; 
            private String ownBundleId; 
            private String ownBundleName; 
            private Integer ownType; 
            private String payType; 
            private String policyGroupId; 
            private java.util.List < String > policyGroupIds; 
            private String policyGroupName; 
            private java.util.List < String > policyGroupNames; 
            private Boolean profileFollowSwitch; 
            private Float ratioThreshold; 
            private Integer resType; 
            private Integer resetType; 
            private java.util.List < ScaleTimerInfos> scaleTimerInfos; 
            private Integer status; 
            private Long stopDuration; 
            private String systemDiskCategory; 
            private Integer systemDiskSize; 
            private java.util.List < TimerInfos> timerInfos; 
            private String timingStrategyInfo; 
            private Long version; 

            /**
             * Indicates whether the auto scale-out feature is enabled for the desktop group.
             */
            public Builder allowAutoSetup(Integer allowAutoSetup) {
                this.allowAutoSetup = allowAutoSetup;
                return this;
            }

            /**
             * The number of reserved cloud desktops in the desktop group.
             */
            public Builder allowBufferCount(Integer allowBufferCount) {
                this.allowBufferCount = allowBufferCount;
                return this;
            }

            /**
             * The number of sessions that are allowed for each cloud desktop in the multi-session desktop group.
             */
            public Builder bindAmount(Integer bindAmount) {
                this.bindAmount = bindAmount;
                return this;
            }

            /**
             * The number of purchased cloud desktops. Valid values: 0 to 200.
             */
            public Builder buyDesktopsCount(Integer buyDesktopsCount) {
                this.buyDesktopsCount = buyDesktopsCount;
                return this;
            }

            /**
             * The remarks on the desktop group.
             */
            public Builder comments(String comments) {
                this.comments = comments;
                return this;
            }

            /**
             * The maximum period of time for which a session is effective. Unit: milliseconds.
             */
            public Builder connectDuration(Long connectDuration) {
                this.connectDuration = connectDuration;
                return this;
            }

            /**
             * The number of vCPUs.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The time when the desktop group was created. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The user who creates the desktop group.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * The category of the data disk.
             */
            public Builder dataDiskCategory(String dataDiskCategory) {
                this.dataDiskCategory = dataDiskCategory;
                return this;
            }

            /**
             * The size of the data disk.
             */
            public Builder dataDiskSize(String dataDiskSize) {
                this.dataDiskSize = dataDiskSize;
                return this;
            }

            /**
             * The ID of the desktop group.
             */
            public Builder desktopGroupId(String desktopGroupId) {
                this.desktopGroupId = desktopGroupId;
                return this;
            }

            /**
             * The name of the desktop group.
             */
            public Builder desktopGroupName(String desktopGroupName) {
                this.desktopGroupName = desktopGroupName;
                return this;
            }

            /**
             * The ID of the directory, which is the same as the ID of the workspace.
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * The type of the directory.
             */
            public Builder directoryType(String directoryType) {
                this.directoryType = directoryType;
                return this;
            }

            /**
             * The time when the desktop group expires.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * The number of vGPUs.
             */
            public Builder gpuCount(Float gpuCount) {
                this.gpuCount = gpuCount;
                return this;
            }

            /**
             * The GPU specifications.
             */
            public Builder gpuSpec(String gpuSpec) {
                this.gpuSpec = gpuSpec;
                return this;
            }

            /**
             * The maximum period of time for which a session remains idle. Unit: milliseconds.
             */
            public Builder idleDisconnectDuration(Long idleDisconnectDuration) {
                this.idleDisconnectDuration = idleDisconnectDuration;
                return this;
            }

            /**
             * The ID of the image.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * The retention period of a cloud desktop in the desktop group after the cloud desktop is disconnected. Unit: milliseconds.
             */
            public Builder keepDuration(Long keepDuration) {
                this.keepDuration = keepDuration;
                return this;
            }

            /**
             * The load balancing policy for the multi-session desktop group.
             * <p>
             * 
             * Valid values:
             * 
             * *   0
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     depth first
             * 
             *     <!-- -->
             * 
             *     .
             * 
             * *   1
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     breadth first
             * 
             *     <!-- -->
             * 
             *     .
             */
            public Builder loadPolicy(Integer loadPolicy) {
                this.loadPolicy = loadPolicy;
                return this;
            }

            /**
             * The maximum number of cloud desktops that the desktop group can contain.
             */
            public Builder maxDesktopsCount(Integer maxDesktopsCount) {
                this.maxDesktopsCount = maxDesktopsCount;
                return this;
            }

            /**
             * The memory size.
             */
            public Builder memory(Long memory) {
                this.memory = memory;
                return this;
            }

            /**
             * The minimum number of cloud desktops that the desktop group must retain.
             */
            public Builder minDesktopsCount(Integer minDesktopsCount) {
                this.minDesktopsCount = minDesktopsCount;
                return this;
            }

            /**
             * The ID of the Apsara File Storage NAS (NAS) file system.
             */
            public Builder nasFileSystemID(String nasFileSystemID) {
                this.nasFileSystemID = nasFileSystemID;
                return this;
            }

            /**
             * The name of the NAS file system.
             */
            public Builder nasFileSystemName(String nasFileSystemName) {
                this.nasFileSystemName = nasFileSystemName;
                return this;
            }

            /**
             * The ID of the workspace.
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * The name of the workspace.
             */
            public Builder officeSiteName(String officeSiteName) {
                this.officeSiteName = officeSiteName;
                return this;
            }

            /**
             * The type of the workspace.
             */
            public Builder officeSiteType(String officeSiteType) {
                this.officeSiteType = officeSiteType;
                return this;
            }

            /**
             * The ID of the desktop template.
             */
            public Builder ownBundleId(String ownBundleId) {
                this.ownBundleId = ownBundleId;
                return this;
            }

            /**
             * The name of the desktop template.
             */
            public Builder ownBundleName(String ownBundleName) {
                this.ownBundleName = ownBundleName;
                return this;
            }

            /**
             * The type of the desktop group.
             * <p>
             * 
             * Valid values:
             * 
             * *   0
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     personal desktop group
             * 
             *     <!-- -->
             * 
             *     .
             * 
             * *   1
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     shared desktop group (multi-session)
             * 
             *     <!-- -->
             * 
             *     .
             */
            public Builder ownType(Integer ownType) {
                this.ownType = ownType;
                return this;
            }

            /**
             * The billing method.
             * <p>
             * 
             * Valid values:
             * 
             * *   PostPaid
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     pay-as-you-go
             * 
             *     <!-- -->
             * 
             *     .
             * 
             * *   PrePaid
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     subscription
             * 
             *     <!-- -->
             * 
             *     .
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * The ID of the security policy group.
             */
            public Builder policyGroupId(String policyGroupId) {
                this.policyGroupId = policyGroupId;
                return this;
            }

            /**
             * The IDs of the policies with which the desktop group is associated.
             */
            public Builder policyGroupIds(java.util.List < String > policyGroupIds) {
                this.policyGroupIds = policyGroupIds;
                return this;
            }

            /**
             * The name of the security policy group.
             */
            public Builder policyGroupName(String policyGroupName) {
                this.policyGroupName = policyGroupName;
                return this;
            }

            /**
             * The names of the policies.
             */
            public Builder policyGroupNames(java.util.List < String > policyGroupNames) {
                this.policyGroupNames = policyGroupNames;
                return this;
            }

            /**
             * Indicates whether data roaming is enabled.
             */
            public Builder profileFollowSwitch(Boolean profileFollowSwitch) {
                this.profileFollowSwitch = profileFollowSwitch;
                return this;
            }

            /**
             * The session usage threshold for the multi-session desktop group that has an auto scaling policy in effect.
             */
            public Builder ratioThreshold(Float ratioThreshold) {
                this.ratioThreshold = ratioThreshold;
                return this;
            }

            /**
             * The type of the resource. Only Elastic Compute Service (ECS) instances are supported.
             * <p>
             * 
             * Valid values:
             * 
             * *   0
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     ECS
             * 
             *     <!-- -->
             * 
             *     .
             */
            public Builder resType(Integer resType) {
                this.resType = resType;
                return this;
            }

            /**
             * Indicates which type of disk is reset for cloud desktops in the desktop group.
             * <p>
             * 
             * Valid values:
             * 
             * *   0
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     No disks are reset
             * 
             *     <!-- -->
             * 
             *     .
             * 
             * *   1
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     Only the system disk is reset
             * 
             *     <!-- -->
             * 
             *     .
             * 
             * *   2
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     Only the data disk is reset
             * 
             *     <!-- -->
             * 
             *     .
             * 
             * *   3
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     Both the system disk and data disk are reset
             * 
             *     <!-- -->
             * 
             *     .
             */
            public Builder resetType(Integer resetType) {
                this.resetType = resetType;
                return this;
            }

            /**
             * Details of the scheduled tasks.
             */
            public Builder scaleTimerInfos(java.util.List < ScaleTimerInfos> scaleTimerInfos) {
                this.scaleTimerInfos = scaleTimerInfos;
                return this;
            }

            /**
             * The status of the desktop group.
             * <p>
             * 
             * Valid values:
             * 
             * *   0
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     The desktop group is unpaid
             * 
             *     <!-- -->
             * 
             *     .
             * 
             * *   1
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     The desktop group is paid
             * 
             *     <!-- -->
             * 
             *     .
             * 
             * *   2
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     The desktop group has an overdue payment or expired
             * 
             *     <!-- -->
             * 
             *     .
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The period of time before an idle cloud desktop enters the Stopped state. When the specified period of time is reached, the idle cloud desktop automatically stops. If an end user connects to a stopped cloud desktop, the cloud desktop automatically starts. Unit: milliseconds.
             */
            public Builder stopDuration(Long stopDuration) {
                this.stopDuration = stopDuration;
                return this;
            }

            /**
             * The category of the system disk.
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * The size of the system disk.
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * The list of scheduled points in time for desktop group tasks.
             */
            public Builder timerInfos(java.util.List < TimerInfos> timerInfos) {
                this.timerInfos = timerInfos;
                return this;
            }

            /**
             * The information about the scheduling policy.
             */
            public Builder timingStrategyInfo(String timingStrategyInfo) {
                this.timingStrategyInfo = timingStrategyInfo;
                return this;
            }

            /**
             * The version number of the desktop group.
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
