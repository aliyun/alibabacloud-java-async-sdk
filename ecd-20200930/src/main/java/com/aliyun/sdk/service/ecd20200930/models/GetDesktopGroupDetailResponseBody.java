// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link GetDesktopGroupDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetDesktopGroupDetailResponseBody</p>
 */
public class GetDesktopGroupDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Desktops")
    private Desktops desktops;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetDesktopGroupDetailResponseBody model) {
            this.desktops = model.desktops;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The cloud computers within the share.</p>
         */
        public Builder desktops(Desktops desktops) {
            this.desktops = desktops;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1B5268CE-5EB3-545F-9F38-A8BCF710****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDesktopGroupDetailResponseBody build() {
            return new GetDesktopGroupDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDesktopGroupDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetDesktopGroupDetailResponseBody</p>
     */
    public static class ScaleTimerInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BuyResAmount")
        private Integer buyResAmount;

        @com.aliyun.core.annotation.NameInMap("Cron")
        private String cron;

        @com.aliyun.core.annotation.NameInMap("KeepDuration")
        private Long keepDuration;

        @com.aliyun.core.annotation.NameInMap("LoadPolicy")
        private Integer loadPolicy;

        @com.aliyun.core.annotation.NameInMap("MaxResAmount")
        private Integer maxResAmount;

        @com.aliyun.core.annotation.NameInMap("MinResAmount")
        private Integer minResAmount;

        @com.aliyun.core.annotation.NameInMap("RatioThreshold")
        private Float ratioThreshold;

        @com.aliyun.core.annotation.NameInMap("Type")
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

            private Builder() {
            } 

            private Builder(ScaleTimerInfos model) {
                this.buyResAmount = model.buyResAmount;
                this.cron = model.cron;
                this.keepDuration = model.keepDuration;
                this.loadPolicy = model.loadPolicy;
                this.maxResAmount = model.maxResAmount;
                this.minResAmount = model.minResAmount;
                this.ratioThreshold = model.ratioThreshold;
                this.type = model.type;
            } 

            /**
             * <p>The number of cloud computers that you purchase in the cloud computer pool. This parameter is one of the auto scaling parameters. Valid values: 0 to 200.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder buyResAmount(Integer buyResAmount) {
                this.buyResAmount = buyResAmount;
                return this;
            }

            /**
             * <p>The cron expression for the scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>0 0 0 * * ?</p>
             */
            public Builder cron(String cron) {
                this.cron = cron;
                return this;
            }

            /**
             * <p>The duration that is retained after the session is disconnected. Unit: milliseconds. Valid values: 180000 to 345600000. That is, the session can be retained for 3 to 5760 minutes (4 days). If you specify the value to 0, the session is permanently retained.</p>
             * <p>When a session is disconnected, take note of the following situations: If an end user does not resume the session within the specified duration, the session is closed and all unsaved data is cleared. If the end user resumes the session within the specified duration, the end user can still access data of the session.</p>
             * 
             * <strong>example:</strong>
             * <p>600000</p>
             */
            public Builder keepDuration(Long keepDuration) {
                this.keepDuration = keepDuration;
                return this;
            }

            /**
             * <p>The load balancing policy for the multi-session many-to-many share.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>0: depth-first.</li>
             * <li>1: breadth-first.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder loadPolicy(Integer loadPolicy) {
                this.loadPolicy = loadPolicy;
                return this;
            }

            /**
             * <p>The maximum number of cloud computers in the cloud computer pool. This parameter is one of the auto scaling parameters. Valid values: 0 to 200.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder maxResAmount(Integer maxResAmount) {
                this.maxResAmount = maxResAmount;
                return this;
            }

            /**
             * <p>The minimum number of cloud computers in the cloud computer pool. This parameter is one of the auto scaling parameters. Valid values: 0 to 200.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minResAmount(Integer minResAmount) {
                this.minResAmount = minResAmount;
                return this;
            }

            /**
             * <p>The threshold for the ratio of connected sessions, which triggers automatic scaling of cloud computers within the multi-session many-to-many share. To calculate the ratio of connected sessions, use the following formula:</p>
             * <p><code>Ratio of connected sessions = Number of connected sessions/(Total number of cloud computers × Maximum number of sessions allowed for each cloud computer) × 100%</code>.</p>
             * <p>If the session ratio exceeds the threshold, new cloud computers are provisioned. If it falls below the threshold, additional cloud computers are removed.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder ratioThreshold(Float ratioThreshold) {
                this.ratioThreshold = ratioThreshold;
                return this;
            }

            /**
             * <p>The type of the scheduled task.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>drop: decline policy</li>
             * <li>normal: normal policy</li>
             * <li>peak: peak hour policy</li>
             * <li>rise: rise policy</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>rise</p>
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
    /**
     * 
     * {@link GetDesktopGroupDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetDesktopGroupDetailResponseBody</p>
     */
    public static class TimerInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CronExpression")
        private String cronExpression;

        @com.aliyun.core.annotation.NameInMap("Forced")
        private Boolean forced;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TimerType")
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

            private Builder() {
            } 

            private Builder(TimerInfos model) {
                this.cronExpression = model.cronExpression;
                this.forced = model.forced;
                this.status = model.status;
                this.timerType = model.timerType;
            } 

            /**
             * <p>The cron expression.</p>
             * 
             * <strong>example:</strong>
             * <p>0 58 11 ? * 2</p>
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * <p>Indicates whether the scheduled task is forcibly executed.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder forced(Boolean forced) {
                this.forced = forced;
                return this;
            }

            /**
             * <p>The status of the cloud computer pool.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>1: enabled</li>
             * <li>2: disabled</li>
             * <li>3: deleted</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the scheduled task.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>1: scheduled reset</li>
             * <li>2: scheduled startup</li>
             * <li>3: scheduled stop</li>
             * <li>4: scheduled restart</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link GetDesktopGroupDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetDesktopGroupDetailResponseBody</p>
     */
    public static class Desktops extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowAutoSetup")
        private Integer allowAutoSetup;

        @com.aliyun.core.annotation.NameInMap("AllowBufferCount")
        private Integer allowBufferCount;

        @com.aliyun.core.annotation.NameInMap("BindAmount")
        private Integer bindAmount;

        @com.aliyun.core.annotation.NameInMap("BuyDesktopsCount")
        private Integer buyDesktopsCount;

        @com.aliyun.core.annotation.NameInMap("Comments")
        private String comments;

        @com.aliyun.core.annotation.NameInMap("ConnectDuration")
        private Long connectDuration;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("DataDiskCategory")
        private String dataDiskCategory;

        @com.aliyun.core.annotation.NameInMap("DataDiskSize")
        private String dataDiskSize;

        @com.aliyun.core.annotation.NameInMap("DesktopGroupId")
        private String desktopGroupId;

        @com.aliyun.core.annotation.NameInMap("DesktopGroupName")
        private String desktopGroupName;

        @com.aliyun.core.annotation.NameInMap("DirectoryId")
        private String directoryId;

        @com.aliyun.core.annotation.NameInMap("DirectoryType")
        private String directoryType;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("GpuCount")
        private Float gpuCount;

        @com.aliyun.core.annotation.NameInMap("GpuSpec")
        private String gpuSpec;

        @com.aliyun.core.annotation.NameInMap("IdleDisconnectDuration")
        private Long idleDisconnectDuration;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("KeepDuration")
        private Long keepDuration;

        @com.aliyun.core.annotation.NameInMap("LoadPolicy")
        private Integer loadPolicy;

        @com.aliyun.core.annotation.NameInMap("MaxDesktopsCount")
        private Integer maxDesktopsCount;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Long memory;

        @com.aliyun.core.annotation.NameInMap("MinDesktopsCount")
        private Integer minDesktopsCount;

        @com.aliyun.core.annotation.NameInMap("NasFileSystemID")
        private String nasFileSystemID;

        @com.aliyun.core.annotation.NameInMap("NasFileSystemName")
        private String nasFileSystemName;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
        private String officeSiteId;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteName")
        private String officeSiteName;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteType")
        private String officeSiteType;

        @com.aliyun.core.annotation.NameInMap("OwnBundleId")
        private String ownBundleId;

        @com.aliyun.core.annotation.NameInMap("OwnBundleName")
        private String ownBundleName;

        @com.aliyun.core.annotation.NameInMap("OwnType")
        private Integer ownType;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("PolicyGroupId")
        private String policyGroupId;

        @com.aliyun.core.annotation.NameInMap("PolicyGroupIds")
        private java.util.List<String> policyGroupIds;

        @com.aliyun.core.annotation.NameInMap("PolicyGroupName")
        private String policyGroupName;

        @com.aliyun.core.annotation.NameInMap("PolicyGroupNames")
        private java.util.List<String> policyGroupNames;

        @com.aliyun.core.annotation.NameInMap("ProfileFollowSwitch")
        private Boolean profileFollowSwitch;

        @com.aliyun.core.annotation.NameInMap("RatioThreshold")
        private Float ratioThreshold;

        @com.aliyun.core.annotation.NameInMap("ResType")
        private Integer resType;

        @com.aliyun.core.annotation.NameInMap("ResetType")
        private Integer resetType;

        @com.aliyun.core.annotation.NameInMap("ScaleTimerInfos")
        private java.util.List<ScaleTimerInfos> scaleTimerInfos;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("StopDuration")
        private Long stopDuration;

        @com.aliyun.core.annotation.NameInMap("SystemDiskCategory")
        private String systemDiskCategory;

        @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
        private Integer systemDiskSize;

        @com.aliyun.core.annotation.NameInMap("TimerInfos")
        private java.util.List<TimerInfos> timerInfos;

        @com.aliyun.core.annotation.NameInMap("TimingStrategyInfo")
        private String timingStrategyInfo;

        @com.aliyun.core.annotation.NameInMap("Version")
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
        public java.util.List<String> getPolicyGroupIds() {
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
        public java.util.List<String> getPolicyGroupNames() {
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
        public java.util.List<ScaleTimerInfos> getScaleTimerInfos() {
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
        public java.util.List<TimerInfos> getTimerInfos() {
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
            private java.util.List<String> policyGroupIds; 
            private String policyGroupName; 
            private java.util.List<String> policyGroupNames; 
            private Boolean profileFollowSwitch; 
            private Float ratioThreshold; 
            private Integer resType; 
            private Integer resetType; 
            private java.util.List<ScaleTimerInfos> scaleTimerInfos; 
            private Integer status; 
            private Long stopDuration; 
            private String systemDiskCategory; 
            private Integer systemDiskSize; 
            private java.util.List<TimerInfos> timerInfos; 
            private String timingStrategyInfo; 
            private Long version; 

            private Builder() {
            } 

            private Builder(Desktops model) {
                this.allowAutoSetup = model.allowAutoSetup;
                this.allowBufferCount = model.allowBufferCount;
                this.bindAmount = model.bindAmount;
                this.buyDesktopsCount = model.buyDesktopsCount;
                this.comments = model.comments;
                this.connectDuration = model.connectDuration;
                this.cpu = model.cpu;
                this.creationTime = model.creationTime;
                this.creator = model.creator;
                this.dataDiskCategory = model.dataDiskCategory;
                this.dataDiskSize = model.dataDiskSize;
                this.desktopGroupId = model.desktopGroupId;
                this.desktopGroupName = model.desktopGroupName;
                this.directoryId = model.directoryId;
                this.directoryType = model.directoryType;
                this.expiredTime = model.expiredTime;
                this.gpuCount = model.gpuCount;
                this.gpuSpec = model.gpuSpec;
                this.idleDisconnectDuration = model.idleDisconnectDuration;
                this.imageId = model.imageId;
                this.keepDuration = model.keepDuration;
                this.loadPolicy = model.loadPolicy;
                this.maxDesktopsCount = model.maxDesktopsCount;
                this.memory = model.memory;
                this.minDesktopsCount = model.minDesktopsCount;
                this.nasFileSystemID = model.nasFileSystemID;
                this.nasFileSystemName = model.nasFileSystemName;
                this.officeSiteId = model.officeSiteId;
                this.officeSiteName = model.officeSiteName;
                this.officeSiteType = model.officeSiteType;
                this.ownBundleId = model.ownBundleId;
                this.ownBundleName = model.ownBundleName;
                this.ownType = model.ownType;
                this.payType = model.payType;
                this.policyGroupId = model.policyGroupId;
                this.policyGroupIds = model.policyGroupIds;
                this.policyGroupName = model.policyGroupName;
                this.policyGroupNames = model.policyGroupNames;
                this.profileFollowSwitch = model.profileFollowSwitch;
                this.ratioThreshold = model.ratioThreshold;
                this.resType = model.resType;
                this.resetType = model.resetType;
                this.scaleTimerInfos = model.scaleTimerInfos;
                this.status = model.status;
                this.stopDuration = model.stopDuration;
                this.systemDiskCategory = model.systemDiskCategory;
                this.systemDiskSize = model.systemDiskSize;
                this.timerInfos = model.timerInfos;
                this.timingStrategyInfo = model.timingStrategyInfo;
                this.version = model.version;
            } 

            /**
             * <p>Specifies whether to enable batch-based automatic creation of cloud computers in the subscription cloud computer share.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>0: enables batch-based automatic creation of cloud computers.</li>
             * <li>1: disables batch-based automatic creation of cloud computers.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder allowAutoSetup(Integer allowAutoSetup) {
                this.allowAutoSetup = allowAutoSetup;
                return this;
            }

            /**
             * <p>This parameter applies to pay-as-you-go cloud computer shares and specifies the number of standby cloud computers that can be reserved per cloud computer share. Valid values:</p>
             * <ul>
             * <li>0: does not reserve any cloud computers.</li>
             * <li>N: reserves N cloud computers (1≤ N ≤ 100).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder allowBufferCount(Integer allowBufferCount) {
                this.allowBufferCount = allowBufferCount;
                return this;
            }

            /**
             * <p>The maximum number of concurrent sessions allowed per cloud computer within the multi-session many-to-many share.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder bindAmount(Integer bindAmount) {
                this.bindAmount = bindAmount;
                return this;
            }

            /**
             * <ul>
             * <li>The number of purchased cloud computers in the subscription share. Valid values: 0 to 200.</li>
             * <li>The minimum initial number of cloud computers created in the pay-as-you-go share. Default value: 1. Valid values: 0 to <code>MaxDesktopsCount</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder buyDesktopsCount(Integer buyDesktopsCount) {
                this.buyDesktopsCount = buyDesktopsCount;
                return this;
            }

            /**
             * <p>The remarks.</p>
             * 
             * <strong>example:</strong>
             * <p>for students</p>
             */
            public Builder comments(String comments) {
                this.comments = comments;
                return this;
            }

            /**
             * <p>The maximum period of time during which the session is connected. When the specified maximum period of time is reached, the session is automatically disconnected. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>60000</p>
             */
            public Builder connectDuration(Long connectDuration) {
                this.connectDuration = connectDuration;
                return this;
            }

            /**
             * <p>The number of vCPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The time when the desktop group was created. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-11-06T08:28Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account that creates the cloud computer pool.</p>
             * 
             * <strong>example:</strong>
             * <p>155177335370****</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The category of the user disk.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_essd</p>
             */
            public Builder dataDiskCategory(String dataDiskCategory) {
                this.dataDiskCategory = dataDiskCategory;
                return this;
            }

            /**
             * <p>The user disk capacity. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder dataDiskSize(String dataDiskSize) {
                this.dataDiskSize = dataDiskSize;
                return this;
            }

            /**
             * <p>The ID of the cloud computer share.</p>
             * 
             * <strong>example:</strong>
             * <p>dg-3uiojcc0j4kh7****</p>
             */
            public Builder desktopGroupId(String desktopGroupId) {
                this.desktopGroupId = desktopGroupId;
                return this;
            }

            /**
             * <p>The name of the cloud computer share.</p>
             * 
             * <strong>example:</strong>
             * <p>DesktopGroupDemo</p>
             */
            public Builder desktopGroupName(String desktopGroupName) {
                this.desktopGroupName = desktopGroupName;
                return this;
            }

            /**
             * <p>The ID of the directory or office network.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou+dir-363353****</p>
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * <p>The type of the directory.</p>
             * 
             * <strong>example:</strong>
             * <p>SIMPLE</p>
             */
            public Builder directoryType(String directoryType) {
                this.directoryType = directoryType;
                return this;
            }

            /**
             * <p>The expiration date of the subscription cloud computer share.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-31T15:59Z</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The number of vGPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder gpuCount(Float gpuCount) {
                this.gpuCount = gpuCount;
                return this;
            }

            /**
             * <p>The GPU specifications.</p>
             * 
             * <strong>example:</strong>
             * <p>NVIDIA T4</p>
             */
            public Builder gpuSpec(String gpuSpec) {
                this.gpuSpec = gpuSpec;
                return this;
            }

            /**
             * <p>After an end user connects to a cloud computer, the session is established. If the system does not detect any inputs from the keyboard or mouse within the specified period of time, the session is closed. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>900000</p>
             */
            public Builder idleDisconnectDuration(Long idleDisconnectDuration) {
                this.idleDisconnectDuration = idleDisconnectDuration;
                return this;
            }

            /**
             * <p>The ID of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>m-4zfb6zj728hhr****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The amount of time to retain a session after it is disconnected. Unit: milliseconds. Valid values: 180000 to 345600000. That is, the session can be retained for 3 to 5760 minutes (4 days). If you specify the value to 0, the session is permanently retained.</p>
             * <p>When a session is disconnected, take note of the following situations: If an end user does not resume the session within the specified duration, the session is closed and all unsaved data is cleared. If the end user resumes the session within the specified duration, the end user can still access data of the session.</p>
             * 
             * <strong>example:</strong>
             * <p>180000</p>
             */
            public Builder keepDuration(Long keepDuration) {
                this.keepDuration = keepDuration;
                return this;
            }

            /**
             * <p>The load balancing policy for the multi-session many-to-many share.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>0: depth-first.</li>
             * <li>1: breadth-first.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder loadPolicy(Integer loadPolicy) {
                this.loadPolicy = loadPolicy;
                return this;
            }

            /**
             * <p>The maximum number of cloud computers allowed in the pay-as-you-go cloud computer share.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxDesktopsCount(Integer maxDesktopsCount) {
                this.maxDesktopsCount = maxDesktopsCount;
                return this;
            }

            /**
             * <p>The memory size. Unit: MiB.</p>
             * 
             * <strong>example:</strong>
             * <p>4096</p>
             */
            public Builder memory(Long memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The number of cloud computers created in the initial batch within the subscription cloud computer share.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minDesktopsCount(Integer minDesktopsCount) {
                this.minDesktopsCount = minDesktopsCount;
                return this;
            }

            /**
             * <p>The ID of the File Storage NAS (NAS) file system for the user data roaming feature.</p>
             * 
             * <strong>example:</strong>
             * <p>0783b4****</p>
             */
            public Builder nasFileSystemID(String nasFileSystemID) {
                this.nasFileSystemID = nasFileSystemID;
                return this;
            }

            /**
             * <p>The name of the NAS file system for the user data roaming feature.</p>
             * 
             * <strong>example:</strong>
             * <p>abcd</p>
             */
            public Builder nasFileSystemName(String nasFileSystemName) {
                this.nasFileSystemName = nasFileSystemName;
                return this;
            }

            /**
             * <p>The ID of the office network.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou+dir-990541****</p>
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * <p>The name of the office network in which the cloud computer resides.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder officeSiteName(String officeSiteName) {
                this.officeSiteName = officeSiteName;
                return this;
            }

            /**
             * <p>The office network type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>PERSONAL: individual office network</li>
             * <li>SIMPLE: convenience office network</li>
             * <li>AD_CONNECTOR: enterprise Active Directory (AD) office network</li>
             * <li>RAM: Resource Access Management (RAM)-based office network</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SIMPLE</p>
             */
            public Builder officeSiteType(String officeSiteType) {
                this.officeSiteType = officeSiteType;
                return this;
            }

            /**
             * <p>The ID of the cloud computer template.</p>
             * 
             * <strong>example:</strong>
             * <p>b-1se9fb37r5tfq****</p>
             */
            public Builder ownBundleId(String ownBundleId) {
                this.ownBundleId = ownBundleId;
                return this;
            }

            /**
             * <p>The name of the cloud computer template.</p>
             * 
             * <strong>example:</strong>
             * <p>BundleDemo</p>
             */
            public Builder ownBundleName(String ownBundleName) {
                this.ownBundleName = ownBundleName;
                return this;
            }

            /**
             * <p>The type of the cloud computer share.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>0: a one-to-many share.</li>
             * <li>1: a many-to-many share.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ownType(Integer ownType) {
                this.ownType = ownType;
                return this;
            }

            /**
             * <p>The billing method.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>PostPaid: pay-as-you-go.</p>
             * </li>
             * <li><p>PrePaid: subscription.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PrePaid</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>The ID of the applied policy.</p>
             * 
             * <strong>example:</strong>
             * <p>pg-9cktlowtxfl6****</p>
             */
            public Builder policyGroupId(String policyGroupId) {
                this.policyGroupId = policyGroupId;
                return this;
            }

            /**
             * <p>The IDs of the applied policies.</p>
             */
            public Builder policyGroupIds(java.util.List<String> policyGroupIds) {
                this.policyGroupIds = policyGroupIds;
                return this;
            }

            /**
             * <p>The name of the applied policy.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder policyGroupName(String policyGroupName) {
                this.policyGroupName = policyGroupName;
                return this;
            }

            /**
             * <p>The names of the applied policies.</p>
             */
            public Builder policyGroupNames(java.util.List<String> policyGroupNames) {
                this.policyGroupNames = policyGroupNames;
                return this;
            }

            /**
             * <p>Indicates whether user data roaming is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder profileFollowSwitch(Boolean profileFollowSwitch) {
                this.profileFollowSwitch = profileFollowSwitch;
                return this;
            }

            /**
             * <p>The threshold for the ratio of connected sessions, which triggers automatic scaling of cloud computers within the multi-session many-to-many share. To calculate the ratio of connected sessions, use the following formula:</p>
             * <p><code>Ratio of connected sessions = Number of connected sessions/(Total number of cloud computers × Maximum number of sessions allowed for each cloud computer) × 100%</code>.</p>
             * <p>If the session ratio exceeds the threshold, new cloud computers are provisioned. If it falls below the threshold, additional cloud computers are removed.</p>
             * 
             * <strong>example:</strong>
             * <p>0.6</p>
             */
            public Builder ratioThreshold(Float ratioThreshold) {
                this.ratioThreshold = ratioThreshold;
                return this;
            }

            /**
             * <p>The type of the resource. Only Elastic Compute Service (ECS) instances are supported.</p>
             * <p>Valid value:</p>
             * <ul>
             * <li>0: ECS</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder resType(Integer resType) {
                this.resType = resType;
                return this;
            }

            /**
             * <p>The disk reset type of the cloud computer.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>0: does not reset disks.</li>
             * <li>1: resets only the system disk.</li>
             * <li>2: resets only the user disk.</li>
             * <li>3: resets the system disk and the user disk.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder resetType(Integer resetType) {
                this.resetType = resetType;
                return this;
            }

            /**
             * <p>The scheduled tasks.</p>
             */
            public Builder scaleTimerInfos(java.util.List<ScaleTimerInfos> scaleTimerInfos) {
                this.scaleTimerInfos = scaleTimerInfos;
                return this;
            }

            /**
             * <p>The status of the cloud computer share.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>0: The cloud computer share is unpaid.</li>
             * <li>1: The cloud computer share is normal.</li>
             * <li>2: The cloud computer share expired, or your account has an overdue payment.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The period of time before the idle cloud computer enters the Stopped state. If the specified value is reached, the cloud computer is automatically stopped. If an end user connects to the stopped cloud computer, the cloud computer automatically starts. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>180000</p>
             */
            public Builder stopDuration(Long stopDuration) {
                this.stopDuration = stopDuration;
                return this;
            }

            /**
             * <p>The category of the system disk.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_essd</p>
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * <p>The system disk capacity. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * <p>The list of scheduled points in time for desktop group tasks.</p>
             */
            public Builder timerInfos(java.util.List<TimerInfos> timerInfos) {
                this.timerInfos = timerInfos;
                return this;
            }

            /**
             * <p>The information about the scheduling policy.</p>
             * 
             * <strong>example:</strong>
             * <p>abcd</p>
             */
            public Builder timingStrategyInfo(String timingStrategyInfo) {
                this.timingStrategyInfo = timingStrategyInfo;
                return this;
            }

            /**
             * <p>The version number of the cloud computer share.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
