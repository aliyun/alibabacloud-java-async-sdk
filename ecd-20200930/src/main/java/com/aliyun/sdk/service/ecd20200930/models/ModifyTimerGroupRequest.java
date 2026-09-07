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
 * {@link ModifyTimerGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyTimerGroupRequest</p>
 */
public class ModifyTimerGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigTimers")
    private java.util.List<ConfigTimers> configTimers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ModifyTimerGroupRequest(Builder builder) {
        super(builder);
        this.configTimers = builder.configTimers;
        this.description = builder.description;
        this.groupId = builder.groupId;
        this.name = builder.name;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTimerGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configTimers
     */
    public java.util.List<ConfigTimers> getConfigTimers() {
        return this.configTimers;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyTimerGroupRequest, Builder> {
        private java.util.List<ConfigTimers> configTimers; 
        private String description; 
        private String groupId; 
        private String name; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyTimerGroupRequest request) {
            super(request);
            this.configTimers = request.configTimers;
            this.description = request.description;
            this.groupId = request.groupId;
            this.name = request.name;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The configuration information of scheduled tasks.</p>
         */
        public Builder configTimers(java.util.List<ConfigTimers> configTimers) {
            this.putQueryParameter("ConfigTimers", configTimers);
            this.configTimers = configTimers;
            return this;
        }

        /**
         * <p>The description of the configuration group.</p>
         * 
         * <strong>example:</strong>
         * <p>ScheduledTask</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The configuration group ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cg-i1ruuudp92qpj****</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The name of the configuration group.</p>
         * 
         * <strong>example:</strong>
         * <p>ScheduledTask</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The region ID. This feature is not region-specific. Set this parameter to <code>cn-shanghai</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyTimerGroupRequest build() {
            return new ModifyTimerGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyTimerGroupRequest} extends {@link TeaModel}
     *
     * <p>ModifyTimerGroupRequest</p>
     */
    public static class SegmentTimers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppointmentTimer")
        private Long appointmentTimer;

        @com.aliyun.core.annotation.NameInMap("CreateSnapshot")
        private Boolean createSnapshot;

        @com.aliyun.core.annotation.NameInMap("EndCronExpression")
        private String endCronExpression;

        @com.aliyun.core.annotation.NameInMap("Enforce")
        private Boolean enforce;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private Integer interval;

        @com.aliyun.core.annotation.NameInMap("IpSegments")
        private java.util.List<String> ipSegments;

        @com.aliyun.core.annotation.NameInMap("LockScreenTime")
        private Integer lockScreenTime;

        @com.aliyun.core.annotation.NameInMap("NotificationTime")
        private Integer notificationTime;

        @com.aliyun.core.annotation.NameInMap("OperationType")
        private String operationType;

        @com.aliyun.core.annotation.NameInMap("ProcessWhitelist")
        private java.util.List<String> processWhitelist;

        @com.aliyun.core.annotation.NameInMap("ResetType")
        private String resetType;

        @com.aliyun.core.annotation.NameInMap("StartCronExpression")
        private String startCronExpression;

        @com.aliyun.core.annotation.NameInMap("TimerOrder")
        private Integer timerOrder;

        @com.aliyun.core.annotation.NameInMap("Timezone")
        private String timezone;

        @com.aliyun.core.annotation.NameInMap("TriggerType")
        private String triggerType;

        @com.aliyun.core.annotation.NameInMap("VerificationNotificationTime")
        private Integer verificationNotificationTime;

        @com.aliyun.core.annotation.NameInMap("VerificationTime")
        private Integer verificationTime;

        private SegmentTimers(Builder builder) {
            this.appointmentTimer = builder.appointmentTimer;
            this.createSnapshot = builder.createSnapshot;
            this.endCronExpression = builder.endCronExpression;
            this.enforce = builder.enforce;
            this.imageId = builder.imageId;
            this.interval = builder.interval;
            this.ipSegments = builder.ipSegments;
            this.lockScreenTime = builder.lockScreenTime;
            this.notificationTime = builder.notificationTime;
            this.operationType = builder.operationType;
            this.processWhitelist = builder.processWhitelist;
            this.resetType = builder.resetType;
            this.startCronExpression = builder.startCronExpression;
            this.timerOrder = builder.timerOrder;
            this.timezone = builder.timezone;
            this.triggerType = builder.triggerType;
            this.verificationNotificationTime = builder.verificationNotificationTime;
            this.verificationTime = builder.verificationTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SegmentTimers create() {
            return builder().build();
        }

        /**
         * @return appointmentTimer
         */
        public Long getAppointmentTimer() {
            return this.appointmentTimer;
        }

        /**
         * @return createSnapshot
         */
        public Boolean getCreateSnapshot() {
            return this.createSnapshot;
        }

        /**
         * @return endCronExpression
         */
        public String getEndCronExpression() {
            return this.endCronExpression;
        }

        /**
         * @return enforce
         */
        public Boolean getEnforce() {
            return this.enforce;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
        }

        /**
         * @return ipSegments
         */
        public java.util.List<String> getIpSegments() {
            return this.ipSegments;
        }

        /**
         * @return lockScreenTime
         */
        public Integer getLockScreenTime() {
            return this.lockScreenTime;
        }

        /**
         * @return notificationTime
         */
        public Integer getNotificationTime() {
            return this.notificationTime;
        }

        /**
         * @return operationType
         */
        public String getOperationType() {
            return this.operationType;
        }

        /**
         * @return processWhitelist
         */
        public java.util.List<String> getProcessWhitelist() {
            return this.processWhitelist;
        }

        /**
         * @return resetType
         */
        public String getResetType() {
            return this.resetType;
        }

        /**
         * @return startCronExpression
         */
        public String getStartCronExpression() {
            return this.startCronExpression;
        }

        /**
         * @return timerOrder
         */
        public Integer getTimerOrder() {
            return this.timerOrder;
        }

        /**
         * @return timezone
         */
        public String getTimezone() {
            return this.timezone;
        }

        /**
         * @return triggerType
         */
        public String getTriggerType() {
            return this.triggerType;
        }

        /**
         * @return verificationNotificationTime
         */
        public Integer getVerificationNotificationTime() {
            return this.verificationNotificationTime;
        }

        /**
         * @return verificationTime
         */
        public Integer getVerificationTime() {
            return this.verificationTime;
        }

        public static final class Builder {
            private Long appointmentTimer; 
            private Boolean createSnapshot; 
            private String endCronExpression; 
            private Boolean enforce; 
            private String imageId; 
            private Integer interval; 
            private java.util.List<String> ipSegments; 
            private Integer lockScreenTime; 
            private Integer notificationTime; 
            private String operationType; 
            private java.util.List<String> processWhitelist; 
            private String resetType; 
            private String startCronExpression; 
            private Integer timerOrder; 
            private String timezone; 
            private String triggerType; 
            private Integer verificationNotificationTime; 
            private Integer verificationTime; 

            private Builder() {
            } 

            private Builder(SegmentTimers model) {
                this.appointmentTimer = model.appointmentTimer;
                this.createSnapshot = model.createSnapshot;
                this.endCronExpression = model.endCronExpression;
                this.enforce = model.enforce;
                this.imageId = model.imageId;
                this.interval = model.interval;
                this.ipSegments = model.ipSegments;
                this.lockScreenTime = model.lockScreenTime;
                this.notificationTime = model.notificationTime;
                this.operationType = model.operationType;
                this.processWhitelist = model.processWhitelist;
                this.resetType = model.resetType;
                this.startCronExpression = model.startCronExpression;
                this.timerOrder = model.timerOrder;
                this.timezone = model.timezone;
                this.triggerType = model.triggerType;
                this.verificationNotificationTime = model.verificationNotificationTime;
                this.verificationTime = model.verificationTime;
            } 

            /**
             * <p>The appointment timer for executing scheduled tasks at specified time points.</p>
             * 
             * <strong>example:</strong>
             * <p>1764660600967</p>
             */
            public Builder appointmentTimer(Long appointmentTimer) {
                this.appointmentTimer = appointmentTimer;
                return this;
            }

            /**
             * <p>Specifies whether to create a snapshot.</p>
             */
            public Builder createSnapshot(Boolean createSnapshot) {
                this.createSnapshot = createSnapshot;
                return this;
            }

            /**
             * <p>The cron expression for the end time of the scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>0 0 18 ? * 1-5</p>
             */
            public Builder endCronExpression(String endCronExpression) {
                this.endCronExpression = endCronExpression;
                return this;
            }

            /**
             * <p>Specifies whether to forcefully execute the task. If this parameter is set to true, the scheduled task is forcefully executed regardless of the cloud desktop and connection status.</p>
             */
            public Builder enforce(Boolean enforce) {
                this.enforce = enforce;
                return this;
            }

            /**
             * <p>The image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>m-4zfb6zj728hhr****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The time interval. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>The list of IP CIDR blocks that take effect.</p>
             */
            public Builder ipSegments(java.util.List<String> ipSegments) {
                this.ipSegments = ipSegments;
                return this;
            }

            /**
             * <p>The duration of inactivity before the screen is locked for the no-operation lock screen feature. Unit: minutes. Only AD-joined cloud desktops are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder lockScreenTime(Integer lockScreenTime) {
                this.lockScreenTime = lockScreenTime;
                return this;
            }

            /**
             * <p>The advance notification time before the scheduled task is executed. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder notificationTime(Integer notificationTime) {
                this.notificationTime = notificationTime;
                return this;
            }

            /**
             * <p>The operation type of the scheduled task. Currently, only disconnect scheduled tasks support this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>Shutdown</p>
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * <p>The process whitelist for intelligent detection of no-operation scheduled tasks. If a specified process is running, the no-operation scheduled task is not triggered.</p>
             */
            public Builder processWhitelist(java.util.List<String> processWhitelist) {
                this.processWhitelist = processWhitelist;
                return this;
            }

            /**
             * <p>The reset type, which determines whether to reset and the scope of cloud disks to reset.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder resetType(String resetType) {
                this.resetType = resetType;
                return this;
            }

            /**
             * <p>The cron expression for the start time of the scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>0 0 8 ? * 1-5</p>
             */
            public Builder startCronExpression(String startCronExpression) {
                this.startCronExpression = startCronExpression;
                return this;
            }

            /**
             * <p>The execution order number of the timer.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder timerOrder(Integer timerOrder) {
                this.timerOrder = timerOrder;
                return this;
            }

            /**
             * <p>The time zone used by the scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>Asia/Shanghai</p>
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            /**
             * <p>The trigger configuration type for no-operation scheduled tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>Standard</p>
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            /**
             * <p>The advance notification time before verification is executed. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder verificationNotificationTime(Integer verificationNotificationTime) {
                this.verificationNotificationTime = verificationNotificationTime;
                return this;
            }

            /**
             * <p>The verification wait duration. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder verificationTime(Integer verificationTime) {
                this.verificationTime = verificationTime;
                return this;
            }

            public SegmentTimers build() {
                return new SegmentTimers(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyTimerGroupRequest} extends {@link TeaModel}
     *
     * <p>ModifyTimerGroupRequest</p>
     */
    public static class ConfigTimers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowClientSetting")
        private Boolean allowClientSetting;

        @com.aliyun.core.annotation.NameInMap("CronExpression")
        private String cronExpression;

        @com.aliyun.core.annotation.NameInMap("Enforce")
        private Boolean enforce;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private Integer interval;

        @com.aliyun.core.annotation.NameInMap("NotificationTime")
        private Integer notificationTime;

        @com.aliyun.core.annotation.NameInMap("OperationType")
        private String operationType;

        @com.aliyun.core.annotation.NameInMap("ProcessWhitelist")
        private java.util.List<String> processWhitelist;

        @com.aliyun.core.annotation.NameInMap("ResetType")
        private String resetType;

        @com.aliyun.core.annotation.NameInMap("SegmentTimers")
        private java.util.List<SegmentTimers> segmentTimers;

        @com.aliyun.core.annotation.NameInMap("TimerType")
        private String timerType;

        @com.aliyun.core.annotation.NameInMap("TriggerType")
        private String triggerType;

        private ConfigTimers(Builder builder) {
            this.allowClientSetting = builder.allowClientSetting;
            this.cronExpression = builder.cronExpression;
            this.enforce = builder.enforce;
            this.interval = builder.interval;
            this.notificationTime = builder.notificationTime;
            this.operationType = builder.operationType;
            this.processWhitelist = builder.processWhitelist;
            this.resetType = builder.resetType;
            this.segmentTimers = builder.segmentTimers;
            this.timerType = builder.timerType;
            this.triggerType = builder.triggerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigTimers create() {
            return builder().build();
        }

        /**
         * @return allowClientSetting
         */
        public Boolean getAllowClientSetting() {
            return this.allowClientSetting;
        }

        /**
         * @return cronExpression
         */
        public String getCronExpression() {
            return this.cronExpression;
        }

        /**
         * @return enforce
         */
        public Boolean getEnforce() {
            return this.enforce;
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
        }

        /**
         * @return notificationTime
         */
        public Integer getNotificationTime() {
            return this.notificationTime;
        }

        /**
         * @return operationType
         */
        public String getOperationType() {
            return this.operationType;
        }

        /**
         * @return processWhitelist
         */
        public java.util.List<String> getProcessWhitelist() {
            return this.processWhitelist;
        }

        /**
         * @return resetType
         */
        public String getResetType() {
            return this.resetType;
        }

        /**
         * @return segmentTimers
         */
        public java.util.List<SegmentTimers> getSegmentTimers() {
            return this.segmentTimers;
        }

        /**
         * @return timerType
         */
        public String getTimerType() {
            return this.timerType;
        }

        /**
         * @return triggerType
         */
        public String getTriggerType() {
            return this.triggerType;
        }

        public static final class Builder {
            private Boolean allowClientSetting; 
            private String cronExpression; 
            private Boolean enforce; 
            private Integer interval; 
            private Integer notificationTime; 
            private String operationType; 
            private java.util.List<String> processWhitelist; 
            private String resetType; 
            private java.util.List<SegmentTimers> segmentTimers; 
            private String timerType; 
            private String triggerType; 

            private Builder() {
            } 

            private Builder(ConfigTimers model) {
                this.allowClientSetting = model.allowClientSetting;
                this.cronExpression = model.cronExpression;
                this.enforce = model.enforce;
                this.interval = model.interval;
                this.notificationTime = model.notificationTime;
                this.operationType = model.operationType;
                this.processWhitelist = model.processWhitelist;
                this.resetType = model.resetType;
                this.segmentTimers = model.segmentTimers;
                this.timerType = model.timerType;
                this.triggerType = model.triggerType;
            } 

            /**
             * <p>Specifies whether to allow end users to configure scheduled tasks on their own.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder allowClientSetting(Boolean allowClientSetting) {
                this.allowClientSetting = allowClientSetting;
                return this;
            }

            /**
             * <p>The cron expression of the scheduled task.</p>
             * <blockquote>
             * <p>Specify the time in UTC. For example, to schedule a task at 00:00 (UTC+8) every day, set this parameter to 0 0 16 ? * 1,2,3,4,5,6,7.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0 0 16 ? * 1,2,3,4,5,6,7</p>
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * <p>Specifies whether to forcefully execute the task. If this parameter is set to true, the scheduled task is forcefully executed regardless of the cloud desktop and connection status.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enforce(Boolean enforce) {
                this.enforce = enforce;
                return this;
            }

            /**
             * <p>The time interval. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>The advance notification time before the scheduled task is executed. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder notificationTime(Integer notificationTime) {
                this.notificationTime = notificationTime;
                return this;
            }

            /**
             * <p>The operation type of the scheduled task. Currently, only disconnect scheduled tasks support this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>Shutdown</p>
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * <p>The process whitelist for intelligent detection of no-operation scheduled tasks. If a specified process is running, the no-operation scheduled task is not triggered.</p>
             */
            public Builder processWhitelist(java.util.List<String> processWhitelist) {
                this.processWhitelist = processWhitelist;
                return this;
            }

            /**
             * <p>The reset type, which determines whether to reset and the scope of cloud disks to reset.</p>
             * 
             * <strong>example:</strong>
             * <p>RESET_TYPE_SYSTEM</p>
             */
            public Builder resetType(String resetType) {
                this.resetType = resetType;
                return this;
            }

            /**
             * <p>The list of segment timer configurations.</p>
             */
            public Builder segmentTimers(java.util.List<SegmentTimers> segmentTimers) {
                this.segmentTimers = segmentTimers;
                return this;
            }

            /**
             * <p>The type of the scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>TimerBoot</p>
             */
            public Builder timerType(String timerType) {
                this.timerType = timerType;
                return this;
            }

            /**
             * <p>The trigger configuration type for no-operation scheduled tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>Standard</p>
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            public ConfigTimers build() {
                return new ConfigTimers(this);
            } 

        } 

    }
}
