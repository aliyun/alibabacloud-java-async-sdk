// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateDIAlarmRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateDIAlarmRuleRequest</p>
 */
public class UpdateDIAlarmRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DIAlarmRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long DIAlarmRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DIJobId")
    private Long DIJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricType")
    private String metricType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotificationSettings")
    private NotificationSettings notificationSettings;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TriggerConditions")
    private java.util.List < TriggerConditions> triggerConditions;

    private UpdateDIAlarmRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.DIAlarmRuleId = builder.DIAlarmRuleId;
        this.DIJobId = builder.DIJobId;
        this.description = builder.description;
        this.enabled = builder.enabled;
        this.metricType = builder.metricType;
        this.name = builder.name;
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
     * @return DIJobId
     */
    public Long getDIJobId() {
        return this.DIJobId;
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
     * @return name
     */
    public String getName() {
        return this.name;
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
        private Long DIJobId; 
        private String description; 
        private Boolean enabled; 
        private String metricType; 
        private String name; 
        private NotificationSettings notificationSettings; 
        private java.util.List < TriggerConditions> triggerConditions; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDIAlarmRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.DIAlarmRuleId = request.DIAlarmRuleId;
            this.DIJobId = request.DIJobId;
            this.description = request.description;
            this.enabled = request.enabled;
            this.metricType = request.metricType;
            this.name = request.name;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>34982</p>
         */
        public Builder DIAlarmRuleId(Long DIAlarmRuleId) {
            this.putQueryParameter("DIAlarmRuleId", DIAlarmRuleId);
            this.DIAlarmRuleId = DIAlarmRuleId;
            return this;
        }

        /**
         * DIJobId.
         */
        public Builder DIJobId(Long DIJobId) {
            this.putQueryParameter("DIJobId", DIJobId);
            this.DIJobId = DIJobId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.putQueryParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * MetricType.
         */
        public Builder metricType(String metricType) {
            this.putQueryParameter("MetricType", metricType);
            this.metricType = metricType;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * NotificationSettings.
         */
        public Builder notificationSettings(NotificationSettings notificationSettings) {
            String notificationSettingsShrink = shrink(notificationSettings, "NotificationSettings", "json");
            this.putQueryParameter("NotificationSettings", notificationSettingsShrink);
            this.notificationSettings = notificationSettings;
            return this;
        }

        /**
         * TriggerConditions.
         */
        public Builder triggerConditions(java.util.List < TriggerConditions> triggerConditions) {
            String triggerConditionsShrink = shrink(triggerConditions, "TriggerConditions", "json");
            this.putQueryParameter("TriggerConditions", triggerConditionsShrink);
            this.triggerConditions = triggerConditions;
            return this;
        }

        @Override
        public UpdateDIAlarmRuleRequest build() {
            return new UpdateDIAlarmRuleRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateDIAlarmRuleRequest} extends {@link TeaModel}
     *
     * <p>UpdateDIAlarmRuleRequest</p>
     */
    public static class NotificationChannels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Channels")
        private java.util.List < String > channels;

        @com.aliyun.core.annotation.NameInMap("Severity")
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
    /**
     * 
     * {@link UpdateDIAlarmRuleRequest} extends {@link TeaModel}
     *
     * <p>UpdateDIAlarmRuleRequest</p>
     */
    public static class NotificationReceivers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReceiverType")
        private String receiverType;

        @com.aliyun.core.annotation.NameInMap("ReceiverValues")
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
    /**
     * 
     * {@link UpdateDIAlarmRuleRequest} extends {@link TeaModel}
     *
     * <p>UpdateDIAlarmRuleRequest</p>
     */
    public static class NotificationSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InhibitionInterval")
        private Long inhibitionInterval;

        @com.aliyun.core.annotation.NameInMap("NotificationChannels")
        private java.util.List < NotificationChannels> notificationChannels;

        @com.aliyun.core.annotation.NameInMap("NotificationReceivers")
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
        public Long getInhibitionInterval() {
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
            private Long inhibitionInterval; 
            private java.util.List < NotificationChannels> notificationChannels; 
            private java.util.List < NotificationReceivers> notificationReceivers; 

            /**
             * InhibitionInterval.
             */
            public Builder inhibitionInterval(Long inhibitionInterval) {
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
    /**
     * 
     * {@link UpdateDIAlarmRuleRequest} extends {@link TeaModel}
     *
     * <p>UpdateDIAlarmRuleRequest</p>
     */
    public static class TriggerConditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DdlReportTags")
        private java.util.List < String > ddlReportTags;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("Severity")
        private String severity;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private Long threshold;

        private TriggerConditions(Builder builder) {
            this.ddlReportTags = builder.ddlReportTags;
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
         * @return ddlReportTags
         */
        public java.util.List < String > getDdlReportTags() {
            return this.ddlReportTags;
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
            private java.util.List < String > ddlReportTags; 
            private Long duration; 
            private String severity; 
            private Long threshold; 

            /**
             * DdlReportTags.
             */
            public Builder ddlReportTags(java.util.List < String > ddlReportTags) {
                this.ddlReportTags = ddlReportTags;
                return this;
            }

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
