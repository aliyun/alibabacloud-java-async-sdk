// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link UpdateDIAlarmRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateDIAlarmRuleRequest</p>
 */
public class UpdateDIAlarmRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DIAlarmRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long DIAlarmRuleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MetricType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metricType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NotificationSettings")
    @com.aliyun.core.annotation.Validation(required = true)
    private NotificationSettings notificationSettings;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TriggerConditions")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<TriggerConditions> triggerConditions;

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
    public java.util.List<TriggerConditions> getTriggerConditions() {
        return this.triggerConditions;
    }

    public static final class Builder extends Request.Builder<UpdateDIAlarmRuleRequest, Builder> {
        private String regionId; 
        private Long DIAlarmRuleId; 
        private String description; 
        private Boolean enabled; 
        private String metricType; 
        private NotificationSettings notificationSettings; 
        private java.util.List<TriggerConditions> triggerConditions; 

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
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The alert rule ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>34982</p>
         */
        public Builder DIAlarmRuleId(Long DIAlarmRuleId) {
            this.putBodyParameter("DIAlarmRuleId", DIAlarmRuleId);
            this.DIAlarmRuleId = DIAlarmRuleId;
            return this;
        }

        /**
         * <p>The description of the alert rule.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to enable the alert rule. By default, the alert rule is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabled(Boolean enabled) {
            this.putBodyParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>The metric type in the alert rule. Valid values:</p>
         * <ul>
         * <li>Heartbeat</li>
         * <li>FailoverCount</li>
         * <li>Delay</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Heartbeat</p>
         */
        public Builder metricType(String metricType) {
            this.putBodyParameter("MetricType", metricType);
            this.metricType = metricType;
            return this;
        }

        /**
         * <p>The alert notification settings.</p>
         * <p>This parameter is required.</p>
         */
        public Builder notificationSettings(NotificationSettings notificationSettings) {
            String notificationSettingsShrink = shrink(notificationSettings, "NotificationSettings", "json");
            this.putBodyParameter("NotificationSettings", notificationSettingsShrink);
            this.notificationSettings = notificationSettings;
            return this;
        }

        /**
         * <p>The conditions that can trigger the alert rule.</p>
         * <p>This parameter is required.</p>
         */
        public Builder triggerConditions(java.util.List<TriggerConditions> triggerConditions) {
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

    /**
     * 
     * {@link UpdateDIAlarmRuleRequest} extends {@link TeaModel}
     *
     * <p>UpdateDIAlarmRuleRequest</p>
     */
    public static class NotificationChannels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Channels")
        private java.util.List<String> channels;

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
        public java.util.List<String> getChannels() {
            return this.channels;
        }

        /**
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        public static final class Builder {
            private java.util.List<String> channels; 
            private String severity; 

            /**
             * <p>The alert notification methods.</p>
             */
            public Builder channels(java.util.List<String> channels) {
                this.channels = channels;
                return this;
            }

            /**
             * <p>The severity level. Valid values:</p>
             * <ul>
             * <li>Warning</li>
             * <li>Critical</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Warning</p>
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
        private java.util.List<String> receiverValues;

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
        public java.util.List<String> getReceiverValues() {
            return this.receiverValues;
        }

        public static final class Builder {
            private String receiverType; 
            private java.util.List<String> receiverValues; 

            /**
             * <p>The recipient type.</p>
             * <ul>
             * <li>If the alert notification method is Mail, Phone, or Sms, the recipient type is Alibaba Cloud account ID.</li>
             * <li>If the alert notification method is Ding, the recipient type is DingTalk chatbot token.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DingToken</p>
             */
            public Builder receiverType(String receiverType) {
                this.receiverType = receiverType;
                return this;
            }

            /**
             * <p>The recipients.</p>
             */
            public Builder receiverValues(java.util.List<String> receiverValues) {
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
        private Integer inhibitionInterval;

        @com.aliyun.core.annotation.NameInMap("NotificationChannels")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<NotificationChannels> notificationChannels;

        @com.aliyun.core.annotation.NameInMap("NotificationReceivers")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<NotificationReceivers> notificationReceivers;

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
        public java.util.List<NotificationChannels> getNotificationChannels() {
            return this.notificationChannels;
        }

        /**
         * @return notificationReceivers
         */
        public java.util.List<NotificationReceivers> getNotificationReceivers() {
            return this.notificationReceivers;
        }

        public static final class Builder {
            private Integer inhibitionInterval; 
            private java.util.List<NotificationChannels> notificationChannels; 
            private java.util.List<NotificationReceivers> notificationReceivers; 

            /**
             * <p>The duration of the alert suppression interval. Default value: 5. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder inhibitionInterval(Integer inhibitionInterval) {
                this.inhibitionInterval = inhibitionInterval;
                return this;
            }

            /**
             * <p>The alert notification methods.</p>
             * <p>This parameter is required.</p>
             */
            public Builder notificationChannels(java.util.List<NotificationChannels> notificationChannels) {
                this.notificationChannels = notificationChannels;
                return this;
            }

            /**
             * <p>The alert notification recipients.</p>
             * <p>This parameter is required.</p>
             */
            public Builder notificationReceivers(java.util.List<NotificationReceivers> notificationReceivers) {
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
        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("Severity")
        private String severity;

        @com.aliyun.core.annotation.NameInMap("Threshold")
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
             * <p>The time interval for alert calculation. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The severity level. Valid values:</p>
             * <ul>
             * <li>Warning</li>
             * <li>Critical</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Warning</p>
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * <p>The alert threshold.</p>
             * <ul>
             * <li>If the alert rule is for task status, you do not need to specify a threshold.</li>
             * <li>If the alert rule is for failovers, specify the number of failovers.</li>
             * <li>If the alert rule is for latency, specify the latency duration, in seconds.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>5</p>
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
