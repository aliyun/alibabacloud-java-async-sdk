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
         * <p>The scheduled task groups.</p>
         */
        public Builder configTimers(java.util.List<ConfigTimers> configTimers) {
            this.putQueryParameter("ConfigTimers", configTimers);
            this.configTimers = configTimers;
            return this;
        }

        /**
         * <p>The description of the configuration group.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the configuration group.</p>
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
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the region. Set the value to <code>cn-shanghai</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
                this.timerType = model.timerType;
                this.triggerType = model.triggerType;
            } 

            /**
             * <p>Specifies whether to allow end users to configure scheduled tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder allowClientSetting(Boolean allowClientSetting) {
                this.allowClientSetting = allowClientSetting;
                return this;
            }

            /**
             * <p>The cron expression specified in the scheduled task.</p>
             * <blockquote>
             * <p> The time must be in UTC. For example, if your local time is 24:00 (UTC+8), you must set the value to 0 0 16 ? * 1,2,3,4,5,6,7.</p>
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
             * <p>Specifies whether to forcibly execute the scheduled task. A value of true specifies the scheduled task will run forcefully, ignoring the cloud computer and connection status.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enforce(Boolean enforce) {
                this.enforce = enforce;
                return this;
            }

            /**
             * <p>The interval at which the scheduled task is executed. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * NotificationTime.
             */
            public Builder notificationTime(Integer notificationTime) {
                this.notificationTime = notificationTime;
                return this;
            }

            /**
             * <p>The type of the scheduled operation. If you set TimerType to NoConnect, you can specify this parameter.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Hibernate: scheduled hibernation.</li>
             * <li>Shutdown: scheduled shutdown.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Shutdown</p>
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * <p>The process whitelist. If whitelisted processes are running, the scheduled task does not take effect upon inactivity.</p>
             */
            public Builder processWhitelist(java.util.List<String> processWhitelist) {
                this.processWhitelist = processWhitelist;
                return this;
            }

            /**
             * <p>The reset option.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>RESET_TYPE_SYSTEM: resets the system disk.</li>
             * <li>RESET_TYPE_USER_DISK: resets the data disk.</li>
             * <li>RESET_TYPE_BOTH: resets the system disk and data disk.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RESET_TYPE_SYSTEM</p>
             */
            public Builder resetType(String resetType) {
                this.resetType = resetType;
                return this;
            }

            /**
             * <p>The scheduled task type.</p>
             * <p>Valid value:</p>
             * <ul>
             * <li>NoOperationDisconnect: scheduled disconnection upon inactivity.</li>
             * <li>NoConnect: scheduled disconnection upon specified operation (OperationType).</li>
             * <li>TimerBoot: scheduled start.</li>
             * <li>TimerReset: scheduled reset.</li>
             * <li>NoOperationShutdown: scheduled shutdown upon inactivity.</li>
             * <li>NoOperationHibernate: scheduled hibernation upon inactivity.</li>
             * <li>TimerShutdown: scheduled shutdown.</li>
             * <li>NoOperationReboot: scheduled restart upon inactivity.</li>
             * <li>TimerReboot: scheduled restart.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TIMER_BOOT</p>
             */
            public Builder timerType(String timerType) {
                this.timerType = timerType;
                return this;
            }

            /**
             * <p>The method to trigger the scheduled task upon inactivity.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Advanced: intelligent detection.</li>
             * <li>Standard: standard detection.</li>
             * </ul>
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
