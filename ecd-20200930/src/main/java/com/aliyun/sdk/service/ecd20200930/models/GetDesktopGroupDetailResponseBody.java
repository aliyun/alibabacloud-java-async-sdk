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
         * The information about the cloud computer pool.
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
             * The number of cloud computers that you purchase in the cloud computer pool. This parameter is one of the auto scaling parameters. Valid values: 0 to 200.
             */
            public Builder buyResAmount(Integer buyResAmount) {
                this.buyResAmount = buyResAmount;
                return this;
            }

            /**
             * The cron expression for the scheduled task.
             */
            public Builder cron(String cron) {
                this.cron = cron;
                return this;
            }

            /**
             * The duration that is retained after the session is disconnected. Unit: milliseconds. Valid values: 180000 to 345600000. That is, the session can be retained for 3 to 5760 minutes (4 days). If you specify the value to 0, the session is permanently retained.
             * <p>
             * 
             * When a session is disconnected, take note of the following situations: If an end user does not resume the session within the specified duration, the session is closed and all unsaved data is cleared. If the end user resumes the session within the specified duration, the end user can still access data of the session.
             */
            public Builder keepDuration(Long keepDuration) {
                this.keepDuration = keepDuration;
                return this;
            }

            /**
             * The load balancing policy of the multi-session cloud computer pool.
             * <p>
             * 
             * Valid values:
             * 
             * *   0: depth-first
             * *   1: breadth-first
             */
            public Builder loadPolicy(Integer loadPolicy) {
                this.loadPolicy = loadPolicy;
                return this;
            }

            /**
             * The maximum number of cloud computers in the cloud computer pool. This parameter is one of the auto scaling parameters. Valid values: 0 to 200.
             */
            public Builder maxResAmount(Integer maxResAmount) {
                this.maxResAmount = maxResAmount;
                return this;
            }

            /**
             * The minimum number of cloud computers in the cloud computer pool. This parameter is one of the auto scaling parameters. Valid values: 0 to 200.
             */
            public Builder minResAmount(Integer minResAmount) {
                this.minResAmount = minResAmount;
                return this;
            }

            /**
             * The threshold for the ratio of connected sessions. This parameter is the condition that triggers auto scaling in a multi-session cloud computer pool. To calculate the ratio of connected sessions, use the following formula:
             * <p>
             * 
             * `Ratio of connected sessions = Number of connected sessions/(Total number of cloud computers × Maximum number of sessions allowed for each cloud computer) × 100%`
             * 
             * If the ratio of connected sessions is greater than the specified value, new cloud computers are created. If the ratio of connected sessions is smaller than the specified value, idle cloud computers are deleted.
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
             * *   drop: decline policy
             * *   normal: normal policy
             * *   peak: peak hour policy
             * *   rise: rise policy
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
             * The cron expression.
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
             * The status of the cloud computer pool.
             * <p>
             * 
             * Valid values:
             * 
             * *   1: enabled
             * *   2: disabled
             * *   3: deleted
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
             * *   1: scheduled reset
             * *   2: scheduled startup
             * *   3: scheduled stop
             * *   4: scheduled restart
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
             * Indicates whether cloud computers can be automatically created in the subscription cloud computer pool.
             * <p>
             * 
             * Valid values:
             * 
             * *   0: false
             * *   1: true
             */
            public Builder allowAutoSetup(Integer allowAutoSetup) {
                this.allowAutoSetup = allowAutoSetup;
                return this;
            }

            /**
             * The number of cloud computers that is allowed to be reserved in the pay-as-you-go cloud computer pool. Valid values:
             * <p>
             * 
             * *   0: does not allow the system to reserve cloud computers.
             * *   N: allows the system to reserve N cloud computers. (1≤ N ≤ 100)
             */
            public Builder allowBufferCount(Integer allowBufferCount) {
                this.allowBufferCount = allowBufferCount;
                return this;
            }

            /**
             * The number of concurrent sessions that is allowed for each cloud computer in a multi-session cloud computer pool.
             */
            public Builder bindAmount(Integer bindAmount) {
                this.bindAmount = bindAmount;
                return this;
            }

            /**
             * *   This parameter has different meanings based on the billing method of the cloud computer pool. For a subscription pool, this parameter indicates the number of cloud computers that you purchase in the pool. Valid values: 0 to 200.
             * <p>
             * *   For a pay-as-you-go pool, this parameter indicates the minimum number of cloud computers that you can create in the pool. Default value: 1. Valid values: 0 to `MaxDesktopsCount`.
             */
            public Builder buyDesktopsCount(Integer buyDesktopsCount) {
                this.buyDesktopsCount = buyDesktopsCount;
                return this;
            }

            /**
             * The remarks.
             */
            public Builder comments(String comments) {
                this.comments = comments;
                return this;
            }

            /**
             * The maximum period of time during which the session is connected. When the specified maximum period of time is reached, the session is automatically disconnected. Unit: milliseconds.
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
             * The Alibaba Cloud account that creates the cloud computer pool.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * The category of the user disk.
             */
            public Builder dataDiskCategory(String dataDiskCategory) {
                this.dataDiskCategory = dataDiskCategory;
                return this;
            }

            /**
             * The user disk capacity. Unit: GiB.
             */
            public Builder dataDiskSize(String dataDiskSize) {
                this.dataDiskSize = dataDiskSize;
                return this;
            }

            /**
             * The ID of the cloud computer pool.
             */
            public Builder desktopGroupId(String desktopGroupId) {
                this.desktopGroupId = desktopGroupId;
                return this;
            }

            /**
             * The name of the cloud computer pool that is queried.
             */
            public Builder desktopGroupName(String desktopGroupName) {
                this.desktopGroupName = desktopGroupName;
                return this;
            }

            /**
             * The ID of the directory or office network.
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
             * The time when the subscription cloud computer pool expires.
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
             * After an end user connects to a cloud computer, the session is established. If the system does not detect any inputs from the keyboard or mouse within the specified period of time, the session is closed. Unit: milliseconds.
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
             * The amount of time to retain a session after it is disconnected. Unit: milliseconds. Valid values: 180000 to 345600000. That is, the session can be retained for 3 to 5760 minutes (4 days). If you specify the value to 0, the session is permanently retained.
             * <p>
             * 
             * When a session is disconnected, take note of the following situations: If an end user does not resume the session within the specified duration, the session is closed and all unsaved data is cleared. If the end user resumes the session within the specified duration, the end user can still access data of the session.
             */
            public Builder keepDuration(Long keepDuration) {
                this.keepDuration = keepDuration;
                return this;
            }

            /**
             * The load balancing policy of the multi-session cloud computer pool.
             * <p>
             * 
             * Valid values:
             * 
             * *   0: depth-first
             * *   1: breadth-first
             */
            public Builder loadPolicy(Integer loadPolicy) {
                this.loadPolicy = loadPolicy;
                return this;
            }

            /**
             * The maximum number of cloud computers that can be housed in the pay-as-you-go cloud computer pool.
             */
            public Builder maxDesktopsCount(Integer maxDesktopsCount) {
                this.maxDesktopsCount = maxDesktopsCount;
                return this;
            }

            /**
             * The memory size. Unit: MiB.
             */
            public Builder memory(Long memory) {
                this.memory = memory;
                return this;
            }

            /**
             * The maximum number of cloud computers that can be automatically created in the subscription cloud computer pool.
             */
            public Builder minDesktopsCount(Integer minDesktopsCount) {
                this.minDesktopsCount = minDesktopsCount;
                return this;
            }

            /**
             * The ID of the Apsara File Storage NAS (NAS) file system for the user data roaming feature.
             */
            public Builder nasFileSystemID(String nasFileSystemID) {
                this.nasFileSystemID = nasFileSystemID;
                return this;
            }

            /**
             * The name of the NAS file system for the user data roaming feature.
             */
            public Builder nasFileSystemName(String nasFileSystemName) {
                this.nasFileSystemName = nasFileSystemName;
                return this;
            }

            /**
             * The ID of the office network.
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * The name of the office network in which the cloud computer pool resides.
             */
            public Builder officeSiteName(String officeSiteName) {
                this.officeSiteName = officeSiteName;
                return this;
            }

            /**
             * The office network type.
             * <p>
             * 
             * Valid values:
             * 
             * *   PERSONAL: individual office network
             * *   SIMPLE: convenience office network
             * *   AD_CONNECTOR: enterprise Active Directory (AD) office network
             * *   RAM: Resource Access Management (RAM)-based office network
             */
            public Builder officeSiteType(String officeSiteType) {
                this.officeSiteType = officeSiteType;
                return this;
            }

            /**
             * The ID of the cloud computer template.
             */
            public Builder ownBundleId(String ownBundleId) {
                this.ownBundleId = ownBundleId;
                return this;
            }

            /**
             * The name of the cloud computer template.
             */
            public Builder ownBundleName(String ownBundleName) {
                this.ownBundleName = ownBundleName;
                return this;
            }

            /**
             * The type of the cloud computer pool.
             * <p>
             * 
             * Valid values:
             * 
             * *   0: individual (single session)
             * *   1: shared (multiple sessions)
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
             * *   PostPaid: pay-as-you-go.
             * 
             * *   PrePaid: subscription.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * The ID of the policy that is associated with the cloud computer pool.
             */
            public Builder policyGroupId(String policyGroupId) {
                this.policyGroupId = policyGroupId;
                return this;
            }

            /**
             * The IDs of policies that are associated with the cloud computer pool.
             */
            public Builder policyGroupIds(java.util.List < String > policyGroupIds) {
                this.policyGroupIds = policyGroupIds;
                return this;
            }

            /**
             * The name of the policy that is associated with the cloud computer pool.
             */
            public Builder policyGroupName(String policyGroupName) {
                this.policyGroupName = policyGroupName;
                return this;
            }

            /**
             * The names of policies that are associated with the cloud computer pool.
             */
            public Builder policyGroupNames(java.util.List < String > policyGroupNames) {
                this.policyGroupNames = policyGroupNames;
                return this;
            }

            /**
             * Indicates whether user data roaming is enabled.
             */
            public Builder profileFollowSwitch(Boolean profileFollowSwitch) {
                this.profileFollowSwitch = profileFollowSwitch;
                return this;
            }

            /**
             * The threshold for the ratio of connected sessions. This parameter is the condition that triggers auto scaling in a multi-session cloud computer pool. To calculate the ratio of connected sessions, use the following formula:
             * <p>
             * 
             * `Ratio of connected sessions = Number of connected sessions/(Total number of cloud computers × Maximum number of sessions allowed for each cloud computer) × 100%`
             * 
             * If the ratio of connected sessions is greater than the specified value, new cloud computers are created. If the ratio of connected sessions is smaller than the specified value, idle cloud computers are deleted.
             */
            public Builder ratioThreshold(Float ratioThreshold) {
                this.ratioThreshold = ratioThreshold;
                return this;
            }

            /**
             * The type of the resource. Only Elastic Compute Service (ECS) instances are supported.
             * <p>
             * 
             * Valid value:
             * 
             * *   0: ECS
             */
            public Builder resType(Integer resType) {
                this.resType = resType;
                return this;
            }

            /**
             * The disk reset type of the cloud computer.
             * <p>
             * 
             * Valid values:
             * 
             * *   0: does not reset disks.
             * *   1: resets only the system disk.
             * *   2: resets only the user disk.
             * *   3: resets the system disk and the user disk.
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
             * The payment status of the cloud computer pool.
             * <p>
             * 
             * Valid values:
             * 
             * *   0: unpaid
             * *   1: paid
             * *   2: overdue or expired
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The period of time before the idle cloud computer enters the Stopped state. If the specified value is reached, the cloud computer is automatically stopped. If an end user connects to the stopped cloud computer, the cloud computer automatically starts. Unit: milliseconds.
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
             * The system disk capacity. Unit: GiB.
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
             * The version number of the cloud computer pool.
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
