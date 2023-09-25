// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDIAlarmRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDIAlarmRulesResponseBody</p>
 */
public class ListDIAlarmRulesResponseBody extends TeaModel {
    @NameInMap("DIAlarmRulePaging")
    private DIAlarmRulePaging DIAlarmRulePaging;

    @NameInMap("RequestId")
    private String requestId;

    private ListDIAlarmRulesResponseBody(Builder builder) {
        this.DIAlarmRulePaging = builder.DIAlarmRulePaging;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDIAlarmRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return DIAlarmRulePaging
     */
    public DIAlarmRulePaging getDIAlarmRulePaging() {
        return this.DIAlarmRulePaging;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DIAlarmRulePaging DIAlarmRulePaging; 
        private String requestId; 

        /**
         * DIAlarmRulePaging.
         */
        public Builder DIAlarmRulePaging(DIAlarmRulePaging DIAlarmRulePaging) {
            this.DIAlarmRulePaging = DIAlarmRulePaging;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDIAlarmRulesResponseBody build() {
            return new ListDIAlarmRulesResponseBody(this);
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
        private java.util.List < NotificationChannels> notificationChannels;

        @NameInMap("NotificationReceivers")
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
    public static class DIJobAlarmRules extends TeaModel {
        @NameInMap("DIAlarmRuleId")
        private Long DIAlarmRuleId;

        @NameInMap("DIJobId")
        private Long DIJobId;

        @NameInMap("Description")
        private String description;

        @NameInMap("Enabled")
        private Boolean enabled;

        @NameInMap("MetricType")
        private String metricType;

        @NameInMap("NotificationSettings")
        private NotificationSettings notificationSettings;

        @NameInMap("TriggerConditions")
        private java.util.List < TriggerConditions> triggerConditions;

        private DIJobAlarmRules(Builder builder) {
            this.DIAlarmRuleId = builder.DIAlarmRuleId;
            this.DIJobId = builder.DIJobId;
            this.description = builder.description;
            this.enabled = builder.enabled;
            this.metricType = builder.metricType;
            this.notificationSettings = builder.notificationSettings;
            this.triggerConditions = builder.triggerConditions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DIJobAlarmRules create() {
            return builder().build();
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
        public java.util.List < TriggerConditions> getTriggerConditions() {
            return this.triggerConditions;
        }

        public static final class Builder {
            private Long DIAlarmRuleId; 
            private Long DIJobId; 
            private String description; 
            private Boolean enabled; 
            private String metricType; 
            private NotificationSettings notificationSettings; 
            private java.util.List < TriggerConditions> triggerConditions; 

            /**
             * DIAlarmRuleId.
             */
            public Builder DIAlarmRuleId(Long DIAlarmRuleId) {
                this.DIAlarmRuleId = DIAlarmRuleId;
                return this;
            }

            /**
             * DIJobId.
             */
            public Builder DIJobId(Long DIJobId) {
                this.DIJobId = DIJobId;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * MetricType.
             */
            public Builder metricType(String metricType) {
                this.metricType = metricType;
                return this;
            }

            /**
             * NotificationSettings.
             */
            public Builder notificationSettings(NotificationSettings notificationSettings) {
                this.notificationSettings = notificationSettings;
                return this;
            }

            /**
             * TriggerConditions.
             */
            public Builder triggerConditions(java.util.List < TriggerConditions> triggerConditions) {
                this.triggerConditions = triggerConditions;
                return this;
            }

            public DIJobAlarmRules build() {
                return new DIJobAlarmRules(this);
            } 

        } 

    }
    public static class DIAlarmRulePaging extends TeaModel {
        @NameInMap("DIJobAlarmRules")
        private java.util.List < DIJobAlarmRules> DIJobAlarmRules;

        @NameInMap("PageNumber")
        private Long pageNumber;

        @NameInMap("PageSize")
        private Long pageSize;

        @NameInMap("TotalCount")
        private Long totalCount;

        private DIAlarmRulePaging(Builder builder) {
            this.DIJobAlarmRules = builder.DIJobAlarmRules;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DIAlarmRulePaging create() {
            return builder().build();
        }

        /**
         * @return DIJobAlarmRules
         */
        public java.util.List < DIJobAlarmRules> getDIJobAlarmRules() {
            return this.DIJobAlarmRules;
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < DIJobAlarmRules> DIJobAlarmRules; 
            private Long pageNumber; 
            private Long pageSize; 
            private Long totalCount; 

            /**
             * DIJobAlarmRules.
             */
            public Builder DIJobAlarmRules(java.util.List < DIJobAlarmRules> DIJobAlarmRules) {
                this.DIJobAlarmRules = DIJobAlarmRules;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public DIAlarmRulePaging build() {
                return new DIAlarmRulePaging(this);
            } 

        } 

    }
}
