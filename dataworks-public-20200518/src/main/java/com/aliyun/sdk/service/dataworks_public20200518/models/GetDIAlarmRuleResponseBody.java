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
 * {@link GetDIAlarmRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetDIAlarmRuleResponseBody</p>
 */
public class GetDIAlarmRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DIAlarmRule")
    private DIAlarmRule DIAlarmRule;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDIAlarmRuleResponseBody(Builder builder) {
        this.DIAlarmRule = builder.DIAlarmRule;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDIAlarmRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return DIAlarmRule
     */
    public DIAlarmRule getDIAlarmRule() {
        return this.DIAlarmRule;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DIAlarmRule DIAlarmRule; 
        private String requestId; 

        /**
         * <p>The details of the alert rule.</p>
         */
        public Builder DIAlarmRule(DIAlarmRule DIAlarmRule) {
            this.DIAlarmRule = DIAlarmRule;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4A807D85-AC9F-55F7-A58F-998D5249CAD9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDIAlarmRuleResponseBody build() {
            return new GetDIAlarmRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDIAlarmRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetDIAlarmRuleResponseBody</p>
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
     * {@link GetDIAlarmRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetDIAlarmRuleResponseBody</p>
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
             * <p>The recipient type. Valid values: AliyunUid and DingToken.</p>
             * <ul>
             * <li>If the alert notification method is Mail, Phone, or Sms, the value of this parameter is <strong>AliyunUid</strong>, which indicates the Alibaba Cloud account ID.</li>
             * <li>If the alert notification method is Ding, the value of this parameter is <strong>DingToken</strong>, which indicates the DingTalk chatbot token.</li>
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
     * {@link GetDIAlarmRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetDIAlarmRuleResponseBody</p>
     */
    public static class NotificationSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InhibitionInterval")
        private Integer inhibitionInterval;

        @com.aliyun.core.annotation.NameInMap("NotificationChannels")
        private java.util.List<NotificationChannels> notificationChannels;

        @com.aliyun.core.annotation.NameInMap("NotificationReceivers")
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
             * <p>The duration of the alert suppression interval. Unit: minutes.</p>
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
             */
            public Builder notificationChannels(java.util.List<NotificationChannels> notificationChannels) {
                this.notificationChannels = notificationChannels;
                return this;
            }

            /**
             * <p>The alert notification recipients.</p>
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
     * {@link GetDIAlarmRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetDIAlarmRuleResponseBody</p>
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
             * <li>If the alert rule is for task status, no threshold is used.</li>
             * <li>If the alert rule is for failovers, specify the number of failovers.</li>
             * <li>If the alert rule is for latency, the threshold is the latency duration, in seconds.</li>
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
    /**
     * 
     * {@link GetDIAlarmRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetDIAlarmRuleResponseBody</p>
     */
    public static class DIAlarmRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private Long createdTime;

        @com.aliyun.core.annotation.NameInMap("CreatedUid")
        private String createdUid;

        @com.aliyun.core.annotation.NameInMap("DIAlarmRuleId")
        private Long DIAlarmRuleId;

        @com.aliyun.core.annotation.NameInMap("DIJobId")
        private Long DIJobId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("MetricType")
        private String metricType;

        @com.aliyun.core.annotation.NameInMap("NotificationSettings")
        private NotificationSettings notificationSettings;

        @com.aliyun.core.annotation.NameInMap("TriggerConditions")
        private java.util.List<TriggerConditions> triggerConditions;

        @com.aliyun.core.annotation.NameInMap("UpdatedTime")
        private Long updatedTime;

        @com.aliyun.core.annotation.NameInMap("UpdatedUid")
        private String updatedUid;

        private DIAlarmRule(Builder builder) {
            this.createdTime = builder.createdTime;
            this.createdUid = builder.createdUid;
            this.DIAlarmRuleId = builder.DIAlarmRuleId;
            this.DIJobId = builder.DIJobId;
            this.description = builder.description;
            this.enabled = builder.enabled;
            this.metricType = builder.metricType;
            this.notificationSettings = builder.notificationSettings;
            this.triggerConditions = builder.triggerConditions;
            this.updatedTime = builder.updatedTime;
            this.updatedUid = builder.updatedUid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DIAlarmRule create() {
            return builder().build();
        }

        /**
         * @return createdTime
         */
        public Long getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return createdUid
         */
        public String getCreatedUid() {
            return this.createdUid;
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

        /**
         * @return updatedTime
         */
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        /**
         * @return updatedUid
         */
        public String getUpdatedUid() {
            return this.updatedUid;
        }

        public static final class Builder {
            private Long createdTime; 
            private String createdUid; 
            private Long DIAlarmRuleId; 
            private Long DIJobId; 
            private String description; 
            private Boolean enabled; 
            private String metricType; 
            private NotificationSettings notificationSettings; 
            private java.util.List<TriggerConditions> triggerConditions; 
            private Long updatedTime; 
            private String updatedUid; 

            /**
             * <p>The timestamp when the alert rule was created. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1663573162</p>
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The ID of the user who creates the alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>10000001</p>
             */
            public Builder createdUid(String createdUid) {
                this.createdUid = createdUid;
                return this;
            }

            /**
             * <p>The alert rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>34988</p>
             */
            public Builder DIAlarmRuleId(Long DIAlarmRuleId) {
                this.DIAlarmRuleId = DIAlarmRuleId;
                return this;
            }

            /**
             * <p>The ID of the task with which the alert rule is associated.</p>
             * 
             * <strong>example:</strong>
             * <p>11170</p>
             */
            public Builder DIJobId(Long DIJobId) {
                this.DIJobId = DIJobId;
                return this;
            }

            /**
             * <p>The description of the alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql synchronizes to hologres heartbeat alert</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether the alert rule is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
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
             * 
             * <strong>example:</strong>
             * <p>Heartbeat</p>
             */
            public Builder metricType(String metricType) {
                this.metricType = metricType;
                return this;
            }

            /**
             * <p>The alert notification settings.</p>
             */
            public Builder notificationSettings(NotificationSettings notificationSettings) {
                this.notificationSettings = notificationSettings;
                return this;
            }

            /**
             * <p>The conditions that are used to trigger the alert rule.</p>
             */
            public Builder triggerConditions(java.util.List<TriggerConditions> triggerConditions) {
                this.triggerConditions = triggerConditions;
                return this;
            }

            /**
             * <p>The timestamp when the alert rule was last updated. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1663573163</p>
             */
            public Builder updatedTime(Long updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            /**
             * <p>The ID of the user who last updates the alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>10000001</p>
             */
            public Builder updatedUid(String updatedUid) {
                this.updatedUid = updatedUid;
                return this;
            }

            public DIAlarmRule build() {
                return new DIAlarmRule(this);
            } 

        } 

    }
}
