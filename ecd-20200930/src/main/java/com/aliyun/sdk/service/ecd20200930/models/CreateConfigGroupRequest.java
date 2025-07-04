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
 * {@link CreateConfigGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateConfigGroupRequest</p>
 */
public class CreateConfigGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigTimers")
    private java.util.List<ConfigTimers> configTimers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 500)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateConfigGroupRequest(Builder builder) {
        super(builder);
        this.configTimers = builder.configTimers;
        this.description = builder.description;
        this.name = builder.name;
        this.productType = builder.productType;
        this.regionId = builder.regionId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConfigGroupRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateConfigGroupRequest, Builder> {
        private java.util.List<ConfigTimers> configTimers; 
        private String description; 
        private String name; 
        private String productType; 
        private String regionId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateConfigGroupRequest request) {
            super(request);
            this.configTimers = request.configTimers;
            this.description = request.description;
            this.name = request.name;
            this.productType = request.productType;
            this.regionId = request.regionId;
            this.type = request.type;
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
         * <p>The name of the configuration group.</p>
         * <p>This parameter is required.</p>
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
         * <p>The service type of the configuration group.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>CLOUD_DESKTOP: the cloud computer service.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CLOUD_DESKTOP</p>
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
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

        /**
         * <p>The group type.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>Timer: a scheduled task group.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Timer</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateConfigGroupRequest build() {
            return new CreateConfigGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateConfigGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateConfigGroupRequest</p>
     */
    public static class SegmentTimers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndCronExpression")
        private String endCronExpression;

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

        @com.aliyun.core.annotation.NameInMap("StartCronExpression")
        private String startCronExpression;

        @com.aliyun.core.annotation.NameInMap("TimerOrder")
        private Integer timerOrder;

        @com.aliyun.core.annotation.NameInMap("Timezone")
        private String timezone;

        @com.aliyun.core.annotation.NameInMap("TriggerType")
        private String triggerType;

        private SegmentTimers(Builder builder) {
            this.endCronExpression = builder.endCronExpression;
            this.enforce = builder.enforce;
            this.interval = builder.interval;
            this.notificationTime = builder.notificationTime;
            this.operationType = builder.operationType;
            this.processWhitelist = builder.processWhitelist;
            this.resetType = builder.resetType;
            this.startCronExpression = builder.startCronExpression;
            this.timerOrder = builder.timerOrder;
            this.timezone = builder.timezone;
            this.triggerType = builder.triggerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SegmentTimers create() {
            return builder().build();
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

        public static final class Builder {
            private String endCronExpression; 
            private Boolean enforce; 
            private Integer interval; 
            private Integer notificationTime; 
            private String operationType; 
            private java.util.List<String> processWhitelist; 
            private String resetType; 
            private String startCronExpression; 
            private Integer timerOrder; 
            private String timezone; 
            private String triggerType; 

            private Builder() {
            } 

            private Builder(SegmentTimers model) {
                this.endCronExpression = model.endCronExpression;
                this.enforce = model.enforce;
                this.interval = model.interval;
                this.notificationTime = model.notificationTime;
                this.operationType = model.operationType;
                this.processWhitelist = model.processWhitelist;
                this.resetType = model.resetType;
                this.startCronExpression = model.startCronExpression;
                this.timerOrder = model.timerOrder;
                this.timezone = model.timezone;
                this.triggerType = model.triggerType;
            } 

            /**
             * EndCronExpression.
             */
            public Builder endCronExpression(String endCronExpression) {
                this.endCronExpression = endCronExpression;
                return this;
            }

            /**
             * Enforce.
             */
            public Builder enforce(Boolean enforce) {
                this.enforce = enforce;
                return this;
            }

            /**
             * Interval.
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
             * OperationType.
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * ProcessWhitelist.
             */
            public Builder processWhitelist(java.util.List<String> processWhitelist) {
                this.processWhitelist = processWhitelist;
                return this;
            }

            /**
             * ResetType.
             */
            public Builder resetType(String resetType) {
                this.resetType = resetType;
                return this;
            }

            /**
             * StartCronExpression.
             */
            public Builder startCronExpression(String startCronExpression) {
                this.startCronExpression = startCronExpression;
                return this;
            }

            /**
             * TimerOrder.
             */
            public Builder timerOrder(Integer timerOrder) {
                this.timerOrder = timerOrder;
                return this;
            }

            /**
             * Timezone.
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            /**
             * TriggerType.
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            public SegmentTimers build() {
                return new SegmentTimers(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateConfigGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateConfigGroupRequest</p>
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
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>Specifies whether to allow end users to configure the scheduled task.</p>
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
             * <p> The time must be in UTC. For example, for 24:00 (UTC+8), you must set the value to 0 0 16 ? * 1,2,3,4,5,6,7</p>
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
             * <p>Specifies whether to forcefully execute the scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
             * <p>The process whitelist. If whitelisted processes are running, the scheduled task does not take effect.</p>
             */
            public Builder processWhitelist(java.util.List<String> processWhitelist) {
                this.processWhitelist = processWhitelist;
                return this;
            }

            /**
             * <p>The reset option.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>RESET_TYPE_SYSTEM: resets only the system disk.</li>
             * <li>RESET_TYPE_USER_DISK: resets only the data disk.</li>
             * <li>RESET_TYPE_BOTH: resets the system and data disks.</li>
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
             * SegmentTimers.
             */
            public Builder segmentTimers(java.util.List<SegmentTimers> segmentTimers) {
                this.segmentTimers = segmentTimers;
                return this;
            }

            /**
             * <p>The scheduled task type.</p>
             * <p>Valid values:</p>
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
             * <p>This parameter is required.</p>
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
