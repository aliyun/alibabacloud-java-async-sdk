// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListDIAlarmRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDIAlarmRulesResponseBody</p>
 */
public class ListDIAlarmRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PagingInfo")
    private PagingInfo pagingInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDIAlarmRulesResponseBody(Builder builder) {
        this.pagingInfo = builder.pagingInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDIAlarmRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return pagingInfo
     */
    public PagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PagingInfo pagingInfo; 
        private String requestId; 

        /**
         * <p>The pagination information.</p>
         */
        public Builder pagingInfo(PagingInfo pagingInfo) {
            this.pagingInfo = pagingInfo;
            return this;
        }

        /**
         * <p>The request ID. You can use the ID to query logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>74C2FECD-5B3A-554A-BCF5-351A36DE9815</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDIAlarmRulesResponseBody build() {
            return new ListDIAlarmRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDIAlarmRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDIAlarmRulesResponseBody</p>
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
             * <p>Critical</p>
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
     * {@link ListDIAlarmRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDIAlarmRulesResponseBody</p>
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
             * <p>The recipient type. Valid values: AliyunUid, DingToken, FeishuToken, and WebHookUrl.</p>
             * 
             * <strong>example:</strong>
             * <p>DingToken</p>
             */
            public Builder receiverType(String receiverType) {
                this.receiverType = receiverType;
                return this;
            }

            /**
             * <p>The recipient.</p>
             * <ul>
             * <li>If the value of the ReceiverType parameter is AliyunUid, the value of this parameter is the Alibaba Cloud account ID of a user.</li>
             * <li>If the value of the ReceiverType parameter is DingToken, the value of this parameter is the token of a DingTalk chatbot.</li>
             * </ul>
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
     * {@link ListDIAlarmRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDIAlarmRulesResponseBody</p>
     */
    public static class NotificationSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InhibitionInterval")
        @Deprecated
        private Long inhibitionInterval;

        @com.aliyun.core.annotation.NameInMap("MuteInterval")
        private Long muteInterval;

        @com.aliyun.core.annotation.NameInMap("NotificationChannels")
        private java.util.List<NotificationChannels> notificationChannels;

        @com.aliyun.core.annotation.NameInMap("NotificationReceivers")
        private java.util.List<NotificationReceivers> notificationReceivers;

        private NotificationSettings(Builder builder) {
            this.inhibitionInterval = builder.inhibitionInterval;
            this.muteInterval = builder.muteInterval;
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
         * @return muteInterval
         */
        public Long getMuteInterval() {
            return this.muteInterval;
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
            private Long inhibitionInterval; 
            private Long muteInterval; 
            private java.util.List<NotificationChannels> notificationChannels; 
            private java.util.List<NotificationReceivers> notificationReceivers; 

            /**
             * <p>The duration of the alert suppression interval. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder inhibitionInterval(Long inhibitionInterval) {
                this.inhibitionInterval = inhibitionInterval;
                return this;
            }

            /**
             * <p>The duration of the alert suppression interval. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder muteInterval(Long muteInterval) {
                this.muteInterval = muteInterval;
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
             * <p>The settings of alert notification recipients.</p>
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
     * {@link ListDIAlarmRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDIAlarmRulesResponseBody</p>
     */
    public static class TriggerConditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DdlReportTags")
        @Deprecated
        private java.util.List<String> ddlReportTags;

        @com.aliyun.core.annotation.NameInMap("DdlTypes")
        private java.util.List<String> ddlTypes;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("Severity")
        private String severity;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private Long threshold;

        private TriggerConditions(Builder builder) {
            this.ddlReportTags = builder.ddlReportTags;
            this.ddlTypes = builder.ddlTypes;
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
        public java.util.List<String> getDdlReportTags() {
            return this.ddlReportTags;
        }

        /**
         * @return ddlTypes
         */
        public java.util.List<String> getDdlTypes() {
            return this.ddlTypes;
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
            private java.util.List<String> ddlReportTags; 
            private java.util.List<String> ddlTypes; 
            private Long duration; 
            private String severity; 
            private Long threshold; 

            /**
             * <p>The types of DDL operations for which the alert rule takes effect. This parameter is returned only if the MetricType parameter is set to DdlReport.</p>
             */
            public Builder ddlReportTags(java.util.List<String> ddlReportTags) {
                this.ddlReportTags = ddlReportTags;
                return this;
            }

            /**
             * <p>The types of DDL operations for which the alert rule takes effect. This parameter is returned only if the MetricType parameter is set to DdlReport.</p>
             */
            public Builder ddlTypes(java.util.List<String> ddlTypes) {
                this.ddlTypes = ddlTypes;
                return this;
            }

            /**
             * <p>The time interval for alert calculation. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
             * <p>Critical</p>
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * <p>The alert threshold.</p>
             * <ul>
             * <li>If the alert rule is for task status, no threshold is used.</li>
             * <li>If the alert rule is for failovers, the threshold is the number of failovers.</li>
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
     * {@link ListDIAlarmRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDIAlarmRulesResponseBody</p>
     */
    public static class DIJobAlarmRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DIAlarmRuleId")
        @Deprecated
        private Long DIAlarmRuleId;

        @com.aliyun.core.annotation.NameInMap("DIJobId")
        private Long DIJobId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("MetricType")
        private String metricType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NotificationSettings")
        private NotificationSettings notificationSettings;

        @com.aliyun.core.annotation.NameInMap("TriggerConditions")
        private java.util.List<TriggerConditions> triggerConditions;

        private DIJobAlarmRules(Builder builder) {
            this.DIAlarmRuleId = builder.DIAlarmRuleId;
            this.DIJobId = builder.DIJobId;
            this.description = builder.description;
            this.enabled = builder.enabled;
            this.id = builder.id;
            this.metricType = builder.metricType;
            this.name = builder.name;
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
         * @return id
         */
        public Long getId() {
            return this.id;
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
        public java.util.List<TriggerConditions> getTriggerConditions() {
            return this.triggerConditions;
        }

        public static final class Builder {
            private Long DIAlarmRuleId; 
            private Long DIJobId; 
            private String description; 
            private Boolean enabled; 
            private Long id; 
            private String metricType; 
            private String name; 
            private NotificationSettings notificationSettings; 
            private java.util.List<TriggerConditions> triggerConditions; 

            /**
             * <p>This parameter is deprecated. Use the Id parameter instead.</p>
             * 
             * <strong>example:</strong>
             * <p>72402</p>
             */
            public Builder DIAlarmRuleId(Long DIAlarmRuleId) {
                this.DIAlarmRuleId = DIAlarmRuleId;
                return this;
            }

            /**
             * <p>The ID of the synchronization task.</p>
             * 
             * <strong>example:</strong>
             * <p>32594</p>
             */
            public Builder DIJobId(Long DIJobId) {
                this.DIJobId = DIJobId;
                return this;
            }

            /**
             * <p>The description of the alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>rule descrition</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether the alert rule is enabled. Valid values: True and False.</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The ID of the alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>72402</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The metric type in the alert rule. Valid values:</p>
             * <ul>
             * <li>Heartbeat</li>
             * <li>FailoverCount</li>
             * <li>Delay</li>
             * <li>DdlReport</li>
             * <li>ResourceUtilization</li>
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
             * <p>The name of the alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>rule_name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The alert notification method and recipient settings.</p>
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

            public DIJobAlarmRules build() {
                return new DIJobAlarmRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDIAlarmRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDIAlarmRulesResponseBody</p>
     */
    public static class PagingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DIJobAlarmRules")
        private java.util.List<DIJobAlarmRules> DIJobAlarmRules;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private PagingInfo(Builder builder) {
            this.DIJobAlarmRules = builder.DIJobAlarmRules;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PagingInfo create() {
            return builder().build();
        }

        /**
         * @return DIJobAlarmRules
         */
        public java.util.List<DIJobAlarmRules> getDIJobAlarmRules() {
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
            private java.util.List<DIJobAlarmRules> DIJobAlarmRules; 
            private Long pageNumber; 
            private Long pageSize; 
            private Long totalCount; 

            /**
             * <p>The alert rules.</p>
             */
            public Builder DIJobAlarmRules(java.util.List<DIJobAlarmRules> DIJobAlarmRules) {
                this.DIJobAlarmRules = DIJobAlarmRules;
                return this;
            }

            /**
             * <p>The page number. Pages start from page 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PagingInfo build() {
                return new PagingInfo(this);
            } 

        } 

    }
}
