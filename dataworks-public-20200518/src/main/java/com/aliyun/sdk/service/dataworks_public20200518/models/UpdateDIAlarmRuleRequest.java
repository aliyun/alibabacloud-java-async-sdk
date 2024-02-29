// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDIAlarmRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateDIAlarmRuleRequest</p>
 */
public class UpdateDIAlarmRuleRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("DIAlarmRuleId")
    @Validation(required = true)
    private Long DIAlarmRuleId;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("Enabled")
    private Boolean enabled;

    @Body
    @NameInMap("MetricType")
    @Validation(required = true)
    private String metricType;

    @Body
    @NameInMap("NotificationSettings")
    @Validation(required = true)
    private NotificationSettings notificationSettings;

    @Body
    @NameInMap("TriggerConditions")
    @Validation(required = true)
    private java.util.List < TriggerConditions> triggerConditions;

    private UpdateDIAlarmRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.DIAlarmRuleId = builder.DIAlarmRuleId;
        this.description = builder.description;
        this.enabled = builder.enabled;
        this.metricType = builder.metricType;
        this.notificationSettings = builder.notificationSettings;
        this.triggerConditions = builder.triggerConditions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDIAlarmRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return DIAlarmRuleId
     */
    public Long getDIAlarmRuleId() {
        return this.DIAlarmRuleId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return metricType
     */
    public String getMetricType() {
        return this.metricType;
    }

    /**
     * @return notificationSettings
     */
    public NotificationSettings getNotificationSettings() {
        return this.notificationSettings;
    }

    /**
     * @return triggerConditions
     */
    public java.util.List < TriggerConditions> getTriggerConditions() {
        return this.triggerConditions;
    }

    public static final class Builder extends Request.Builder<UpdateDIAlarmRuleRequest, Builder> {
        private String regionId; 
        private Long DIAlarmRuleId; 
        private String description; 
        private Boolean enabled; 
        private String metricType; 
        private NotificationSettings notificationSettings; 
        private java.util.List < TriggerConditions> triggerConditions; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDIAlarmRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.DIAlarmRuleId = request.DIAlarmRuleId;
            this.description = request.description;
            this.enabled = request.enabled;
            this.metricType = request.metricType;
            this.notificationSettings = request.notificationSettings;
            this.triggerConditions = request.triggerConditions;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * DIAlarmRuleId.
         */
        public Builder DIAlarmRuleId(Long DIAlarmRuleId) {
            this.putBodyParameter("DIAlarmRuleId", DIAlarmRuleId);
            this.DIAlarmRuleId = DIAlarmRuleId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.putBodyParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * MetricType.
         */
        public Builder metricType(String metricType) {
            this.putBodyParameter("MetricType", metricType);
            this.metricType = metricType;
            return this;
        }

        /**
         * NotificationSettings.
         */
        public Builder notificationSettings(NotificationSettings notificationSettings) {
            String notificationSettingsShrink = shrink(notificationSettings, "NotificationSettings", "json");
            this.putBodyParameter("NotificationSettings", notificationSettingsShrink);
            this.notificationSettings = notificationSettings;
            return this;
        }

        /**
         * TriggerConditions.
         */
        public Builder triggerConditions(java.util.List < TriggerConditions> triggerConditions) {
            String triggerConditionsShrink = shrink(triggerConditions, "TriggerConditions", "json");
            this.putBodyParameter("TriggerConditions", triggerConditionsShrink);
            this.triggerConditions = triggerConditions;
            return this;
        }

        @Override
        public UpdateDIAlarmRuleRequest build() {
            return new UpdateDIAlarmRuleRequest(this);
        } 

    } 

    public static class NotificationChannels extends TeaModel {
        @NameInMap("Channels")
        private java.util.List < String > channels;

        @NameInMap("Severity")
        private String severity;

        private NotificationChannels(Builder builder) {
            this.channels = builder.channels;
            this.severity = builder.severity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotificationChannels create() {
            return builder().build();
        }

        /**
         * @return channels
         */
        public java.util.List < String > getChannels() {
            return this.channels;
        }

        /**
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        public static final class Builder {
            private java.util.List < String > channels; 
            private String severity; 

            /**
             * Channels.
             */
            public Builder channels(java.util.List < String > channels) {
                this.channels = channels;
                return this;
            }

            /**
             * Severity.
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            public NotificationChannels build() {
                return new NotificationChannels(this);
            } 

        } 

    }
    public static class NotificationReceivers extends TeaModel {
        @NameInMap("ReceiverType")
        private String receiverType;

        @NameInMap("ReceiverValues")
        private java.util.List < String > receiverValues;

        private NotificationReceivers(Builder builder) {
            this.receiverType = builder.receiverType;
            this.receiverValues = builder.receiverValues;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotificationReceivers create() {
            return builder().build();
        }

        /**
         * @return receiverType
         */
        public String getReceiverType() {
            return this.receiverType;
        }

        /**
         * @return receiverValues
         */
        public java.util.List < String > getReceiverValues() {
            return this.receiverValues;
        }

        public static final class Builder {
            private String receiverType; 
            private java.util.List < String > receiverValues; 

            /**
             * ReceiverType.
             */
            public Builder receiverType(String receiverType) {
                this.receiverType = receiverType;
                return this;
            }

            /**
             * ReceiverValues.
             */
            public Builder receiverValues(java.util.List < String > receiverValues) {
                this.receiverValues = receiverValues;
                return this;
            }

            public NotificationReceivers build() {
                return new NotificationReceivers(this);
            } 

        } 

    }
    public static class NotificationSettings extends TeaModel {
        @NameInMap("InhibitionInterval")
        private Integer inhibitionInterval;

        @NameInMap("NotificationChannels")
        @Validation(required = true)
        private java.util.List < NotificationChannels> notificationChannels;

        @NameInMap("NotificationReceivers")
        @Validation(required = true)
        private java.util.List < NotificationReceivers> notificationReceivers;

        private NotificationSettings(Builder builder) {
            this.inhibitionInterval = builder.inhibitionInterval;
            this.notificationChannels = builder.notificationChannels;
            this.notificationReceivers = builder.notificationReceivers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotificationSettings create() {
            return builder().build();
        }

        /**
         * @return inhibitionInterval
         */
        public Integer getInhibitionInterval() {
            return this.inhibitionInterval;
        }

        /**
         * @return notificationChannels
         */
        public java.util.List < NotificationChannels> getNotificationChannels() {
            return this.notificationChannels;
        }

        /**
         * @return notificationReceivers
         */
        public java.util.List < NotificationReceivers> getNotificationReceivers() {
            return this.notificationReceivers;
        }

        public static final class Builder {
            private Integer inhibitionInterval; 
            private java.util.List < NotificationChannels> notificationChannels; 
            private java.util.List < NotificationReceivers> notificationReceivers; 

            /**
             * InhibitionInterval.
             */
            public Builder inhibitionInterval(Integer inhibitionInterval) {
                this.inhibitionInterval = inhibitionInterval;
                return this;
            }

            /**
             * NotificationChannels.
             */
            public Builder notificationChannels(java.util.List < NotificationChannels> notificationChannels) {
                this.notificationChannels = notificationChannels;
                return this;
            }

            /**
             * NotificationReceivers.
             */
            public Builder notificationReceivers(java.util.List < NotificationReceivers> notificationReceivers) {
                this.notificationReceivers = notificationReceivers;
                return this;
            }

            public NotificationSettings build() {
                return new NotificationSettings(this);
            } 

        } 

    }
    public static class TriggerConditions extends TeaModel {
        @NameInMap("Duration")
        private Long duration;

        @NameInMap("Severity")
        private String severity;

        @NameInMap("Threshold")
        private Long threshold;

        private TriggerConditions(Builder builder) {
            this.duration = builder.duration;
            this.severity = builder.severity;
            this.threshold = builder.threshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TriggerConditions create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        /**
         * @return threshold
         */
        public Long getThreshold() {
            return this.threshold;
        }

        public static final class Builder {
            private Long duration; 
            private String severity; 
            private Long threshold; 

            /**
             * Duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * Severity.
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * Threshold.
             */
            public Builder threshold(Long threshold) {
                this.threshold = threshold;
                return this;
            }

            public TriggerConditions build() {
                return new TriggerConditions(this);
            } 

        } 

    }
}
