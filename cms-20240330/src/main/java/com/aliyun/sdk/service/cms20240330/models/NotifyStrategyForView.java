// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link NotifyStrategyForView} extends {@link TeaModel}
 *
 * <p>NotifyStrategyForView</p>
 */
public class NotifyStrategyForView extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("autoRecoverSeconds")
    private Integer autoRecoverSeconds;

    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("customTemplateEntries")
    private java.util.List<CustomTemplateEntries> customTemplateEntries;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("enable")
    private Boolean enable;

    @com.aliyun.core.annotation.NameInMap("filterSetting")
    private FilterSetting filterSetting;

    @com.aliyun.core.annotation.NameInMap("groupingSetting")
    @com.aliyun.core.annotation.Validation(required = true)
    private GroupingSetting groupingSetting;

    @com.aliyun.core.annotation.NameInMap("ignoreRestoredNotification")
    private Boolean ignoreRestoredNotification;

    @com.aliyun.core.annotation.NameInMap("incidentEscalationPolicies")
    private java.util.List<?> incidentEscalationPolicies;

    @com.aliyun.core.annotation.NameInMap("notifyStrategyId")
    private String notifyStrategyId;

    @com.aliyun.core.annotation.NameInMap("notifyStrategyName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String notifyStrategyName;

    @com.aliyun.core.annotation.NameInMap("pushingSetting")
    private PushingSetting pushingSetting;

    @com.aliyun.core.annotation.NameInMap("receiverNames")
    private java.util.List<String> receiverNames;

    @com.aliyun.core.annotation.NameInMap("repeatNotifySetting")
    private RepeatNotifySetting repeatNotifySetting;

    @com.aliyun.core.annotation.NameInMap("routes")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Routes> routes;

    @com.aliyun.core.annotation.NameInMap("syncFromType")
    private String syncFromType;

    @com.aliyun.core.annotation.NameInMap("updateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    @com.aliyun.core.annotation.NameInMap("workspaceFilterSetting")
    private WorkspaceFilterSetting workspaceFilterSetting;

    private NotifyStrategyForView(Builder builder) {
        this.autoRecoverSeconds = builder.autoRecoverSeconds;
        this.createTime = builder.createTime;
        this.customTemplateEntries = builder.customTemplateEntries;
        this.description = builder.description;
        this.enable = builder.enable;
        this.filterSetting = builder.filterSetting;
        this.groupingSetting = builder.groupingSetting;
        this.ignoreRestoredNotification = builder.ignoreRestoredNotification;
        this.incidentEscalationPolicies = builder.incidentEscalationPolicies;
        this.notifyStrategyId = builder.notifyStrategyId;
        this.notifyStrategyName = builder.notifyStrategyName;
        this.pushingSetting = builder.pushingSetting;
        this.receiverNames = builder.receiverNames;
        this.repeatNotifySetting = builder.repeatNotifySetting;
        this.routes = builder.routes;
        this.syncFromType = builder.syncFromType;
        this.updateTime = builder.updateTime;
        this.userId = builder.userId;
        this.workspace = builder.workspace;
        this.workspaceFilterSetting = builder.workspaceFilterSetting;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NotifyStrategyForView create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoRecoverSeconds
     */
    public Integer getAutoRecoverSeconds() {
        return this.autoRecoverSeconds;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return customTemplateEntries
     */
    public java.util.List<CustomTemplateEntries> getCustomTemplateEntries() {
        return this.customTemplateEntries;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return filterSetting
     */
    public FilterSetting getFilterSetting() {
        return this.filterSetting;
    }

    /**
     * @return groupingSetting
     */
    public GroupingSetting getGroupingSetting() {
        return this.groupingSetting;
    }

    /**
     * @return ignoreRestoredNotification
     */
    public Boolean getIgnoreRestoredNotification() {
        return this.ignoreRestoredNotification;
    }

    /**
     * @return incidentEscalationPolicies
     */
    public java.util.List<?> getIncidentEscalationPolicies() {
        return this.incidentEscalationPolicies;
    }

    /**
     * @return notifyStrategyId
     */
    public String getNotifyStrategyId() {
        return this.notifyStrategyId;
    }

    /**
     * @return notifyStrategyName
     */
    public String getNotifyStrategyName() {
        return this.notifyStrategyName;
    }

    /**
     * @return pushingSetting
     */
    public PushingSetting getPushingSetting() {
        return this.pushingSetting;
    }

    /**
     * @return receiverNames
     */
    public java.util.List<String> getReceiverNames() {
        return this.receiverNames;
    }

    /**
     * @return repeatNotifySetting
     */
    public RepeatNotifySetting getRepeatNotifySetting() {
        return this.repeatNotifySetting;
    }

    /**
     * @return routes
     */
    public java.util.List<Routes> getRoutes() {
        return this.routes;
    }

    /**
     * @return syncFromType
     */
    public String getSyncFromType() {
        return this.syncFromType;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    /**
     * @return workspaceFilterSetting
     */
    public WorkspaceFilterSetting getWorkspaceFilterSetting() {
        return this.workspaceFilterSetting;
    }

    public static final class Builder {
        private Integer autoRecoverSeconds; 
        private String createTime; 
        private java.util.List<CustomTemplateEntries> customTemplateEntries; 
        private String description; 
        private Boolean enable; 
        private FilterSetting filterSetting; 
        private GroupingSetting groupingSetting; 
        private Boolean ignoreRestoredNotification; 
        private java.util.List<?> incidentEscalationPolicies; 
        private String notifyStrategyId; 
        private String notifyStrategyName; 
        private PushingSetting pushingSetting; 
        private java.util.List<String> receiverNames; 
        private RepeatNotifySetting repeatNotifySetting; 
        private java.util.List<Routes> routes; 
        private String syncFromType; 
        private String updateTime; 
        private String userId; 
        private String workspace; 
        private WorkspaceFilterSetting workspaceFilterSetting; 

        private Builder() {
        } 

        private Builder(NotifyStrategyForView model) {
            this.autoRecoverSeconds = model.autoRecoverSeconds;
            this.createTime = model.createTime;
            this.customTemplateEntries = model.customTemplateEntries;
            this.description = model.description;
            this.enable = model.enable;
            this.filterSetting = model.filterSetting;
            this.groupingSetting = model.groupingSetting;
            this.ignoreRestoredNotification = model.ignoreRestoredNotification;
            this.incidentEscalationPolicies = model.incidentEscalationPolicies;
            this.notifyStrategyId = model.notifyStrategyId;
            this.notifyStrategyName = model.notifyStrategyName;
            this.pushingSetting = model.pushingSetting;
            this.receiverNames = model.receiverNames;
            this.repeatNotifySetting = model.repeatNotifySetting;
            this.routes = model.routes;
            this.syncFromType = model.syncFromType;
            this.updateTime = model.updateTime;
            this.userId = model.userId;
            this.workspace = model.workspace;
            this.workspaceFilterSetting = model.workspaceFilterSetting;
        } 

        /**
         * <p>The automatic recovery time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder autoRecoverSeconds(Integer autoRecoverSeconds) {
            this.autoRecoverSeconds = autoRecoverSeconds;
            return this;
        }

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-11T08:21:58Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The notification channel templates.</p>
         */
        public Builder customTemplateEntries(java.util.List<CustomTemplateEntries> customTemplateEntries) {
            this.customTemplateEntries = customTemplateEntries;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>Indicates whether the notification strategy is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * <p>The filter settings.</p>
         */
        public Builder filterSetting(FilterSetting filterSetting) {
            this.filterSetting = filterSetting;
            return this;
        }

        /**
         * <p>The grouping settings.</p>
         * <p>This parameter is required.</p>
         */
        public Builder groupingSetting(GroupingSetting groupingSetting) {
            this.groupingSetting = groupingSetting;
            return this;
        }

        /**
         * <p>Indicates whether recovery notifications are sent.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder ignoreRestoredNotification(Boolean ignoreRestoredNotification) {
            this.ignoreRestoredNotification = ignoreRestoredNotification;
            return this;
        }

        /**
         * <p>The list of associated escalation policies.</p>
         */
        public Builder incidentEscalationPolicies(java.util.List<?> incidentEscalationPolicies) {
            this.incidentEscalationPolicies = incidentEscalationPolicies;
            return this;
        }

        /**
         * <p>The unique identifier of the notification strategy.</p>
         * 
         * <strong>example:</strong>
         * <p>12312-31-23-123-1-23123</p>
         */
        public Builder notifyStrategyId(String notifyStrategyId) {
            this.notifyStrategyId = notifyStrategyId;
            return this;
        }

        /**
         * <p>The name of the notification strategy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TestStrategy</p>
         */
        public Builder notifyStrategyName(String notifyStrategyName) {
            this.notifyStrategyName = notifyStrategyName;
            return this;
        }

        /**
         * <p>The push settings.</p>
         */
        public Builder pushingSetting(PushingSetting pushingSetting) {
            this.pushingSetting = pushingSetting;
            return this;
        }

        /**
         * <p>The list of recipient names.</p>
         */
        public Builder receiverNames(java.util.List<String> receiverNames) {
            this.receiverNames = receiverNames;
            return this;
        }

        /**
         * <p>The repeat notification settings.</p>
         */
        public Builder repeatNotifySetting(RepeatNotifySetting repeatNotifySetting) {
            this.repeatNotifySetting = repeatNotifySetting;
            return this;
        }

        /**
         * <p>The notification channel routing settings.</p>
         * <p>This parameter is required.</p>
         */
        public Builder routes(java.util.List<Routes> routes) {
            this.routes = routes;
            return this;
        }

        /**
         * <p>The source type of the synchronization policy.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;ARMS&quot;</p>
         */
        public Builder syncFromType(String syncFromType) {
            this.syncFromType = syncFromType;
            return this;
        }

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-05-30T02:29:09Z</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123123****</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * <p>The workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-test</p>
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        /**
         * <p>The workspace filter settings.</p>
         */
        public Builder workspaceFilterSetting(WorkspaceFilterSetting workspaceFilterSetting) {
            this.workspaceFilterSetting = workspaceFilterSetting;
            return this;
        }

        public NotifyStrategyForView build() {
            return new NotifyStrategyForView(this);
        } 

    } 

    /**
     * 
     * {@link NotifyStrategyForView} extends {@link TeaModel}
     *
     * <p>NotifyStrategyForView</p>
     */
    public static class CustomTemplateEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("targetType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String targetType;

        @com.aliyun.core.annotation.NameInMap("templateUuid")
        @com.aliyun.core.annotation.Validation(required = true)
        private String templateUuid;

        private CustomTemplateEntries(Builder builder) {
            this.targetType = builder.targetType;
            this.templateUuid = builder.templateUuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomTemplateEntries create() {
            return builder().build();
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        /**
         * @return templateUuid
         */
        public String getTemplateUuid() {
            return this.templateUuid;
        }

        public static final class Builder {
            private String targetType; 
            private String templateUuid; 

            private Builder() {
            } 

            private Builder(CustomTemplateEntries model) {
                this.targetType = model.targetType;
                this.templateUuid = model.templateUuid;
            } 

            /**
             * <p>The notification type.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>SMS</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * <p>The template UUID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>123-12-312-312-31-23</p>
             */
            public Builder templateUuid(String templateUuid) {
                this.templateUuid = templateUuid;
                return this;
            }

            public CustomTemplateEntries build() {
                return new CustomTemplateEntries(this);
            } 

        } 

    }
    /**
     * 
     * {@link NotifyStrategyForView} extends {@link TeaModel}
     *
     * <p>NotifyStrategyForView</p>
     */
    public static class GroupingSetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("groupingKeys")
        private java.util.List<String> groupingKeys;

        @com.aliyun.core.annotation.NameInMap("periodMin")
        private Integer periodMin;

        @com.aliyun.core.annotation.NameInMap("silenceSec")
        private Integer silenceSec;

        @com.aliyun.core.annotation.NameInMap("times")
        private Integer times;

        private GroupingSetting(Builder builder) {
            this.groupingKeys = builder.groupingKeys;
            this.periodMin = builder.periodMin;
            this.silenceSec = builder.silenceSec;
            this.times = builder.times;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupingSetting create() {
            return builder().build();
        }

        /**
         * @return groupingKeys
         */
        public java.util.List<String> getGroupingKeys() {
            return this.groupingKeys;
        }

        /**
         * @return periodMin
         */
        public Integer getPeriodMin() {
            return this.periodMin;
        }

        /**
         * @return silenceSec
         */
        public Integer getSilenceSec() {
            return this.silenceSec;
        }

        /**
         * @return times
         */
        public Integer getTimes() {
            return this.times;
        }

        public static final class Builder {
            private java.util.List<String> groupingKeys; 
            private Integer periodMin; 
            private Integer silenceSec; 
            private Integer times; 

            private Builder() {
            } 

            private Builder(GroupingSetting model) {
                this.groupingKeys = model.groupingKeys;
                this.periodMin = model.periodMin;
                this.silenceSec = model.silenceSec;
                this.times = model.times;
            } 

            /**
             * <p>The grouping keys.</p>
             */
            public Builder groupingKeys(java.util.List<String> groupingKeys) {
                this.groupingKeys = groupingKeys;
                return this;
            }

            /**
             * <p>The check period in minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder periodMin(Integer periodMin) {
                this.periodMin = periodMin;
                return this;
            }

            /**
             * <p>The silence duration in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder silenceSec(Integer silenceSec) {
                this.silenceSec = silenceSec;
                return this;
            }

            /**
             * <p>The number of times the alert is triggered.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder times(Integer times) {
                this.times = times;
                return this;
            }

            public GroupingSetting build() {
                return new GroupingSetting(this);
            } 

        } 

    }
    /**
     * 
     * {@link NotifyStrategyForView} extends {@link TeaModel}
     *
     * <p>NotifyStrategyForView</p>
     */
    public static class PushingSetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alertActionIds")
        private java.util.List<String> alertActionIds;

        @com.aliyun.core.annotation.NameInMap("restoreActionIds")
        private java.util.List<String> restoreActionIds;

        @com.aliyun.core.annotation.NameInMap("templateUuid")
        private String templateUuid;

        private PushingSetting(Builder builder) {
            this.alertActionIds = builder.alertActionIds;
            this.restoreActionIds = builder.restoreActionIds;
            this.templateUuid = builder.templateUuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PushingSetting create() {
            return builder().build();
        }

        /**
         * @return alertActionIds
         */
        public java.util.List<String> getAlertActionIds() {
            return this.alertActionIds;
        }

        /**
         * @return restoreActionIds
         */
        public java.util.List<String> getRestoreActionIds() {
            return this.restoreActionIds;
        }

        /**
         * @return templateUuid
         */
        public String getTemplateUuid() {
            return this.templateUuid;
        }

        public static final class Builder {
            private java.util.List<String> alertActionIds; 
            private java.util.List<String> restoreActionIds; 
            private String templateUuid; 

            private Builder() {
            } 

            private Builder(PushingSetting model) {
                this.alertActionIds = model.alertActionIds;
                this.restoreActionIds = model.restoreActionIds;
                this.templateUuid = model.templateUuid;
            } 

            /**
             * <p>The list of alert action IDs.</p>
             */
            public Builder alertActionIds(java.util.List<String> alertActionIds) {
                this.alertActionIds = alertActionIds;
                return this;
            }

            /**
             * <p>The list of recovery action IDs.</p>
             */
            public Builder restoreActionIds(java.util.List<String> restoreActionIds) {
                this.restoreActionIds = restoreActionIds;
                return this;
            }

            /**
             * <p>The template UUID.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;template-abc123&quot;</p>
             */
            public Builder templateUuid(String templateUuid) {
                this.templateUuid = templateUuid;
                return this;
            }

            public PushingSetting build() {
                return new PushingSetting(this);
            } 

        } 

    }
    /**
     * 
     * {@link NotifyStrategyForView} extends {@link TeaModel}
     *
     * <p>NotifyStrategyForView</p>
     */
    public static class RepeatNotifySetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endIncidentState")
        private String endIncidentState;

        @com.aliyun.core.annotation.NameInMap("repeatInterval")
        private Integer repeatInterval;

        private RepeatNotifySetting(Builder builder) {
            this.endIncidentState = builder.endIncidentState;
            this.repeatInterval = builder.repeatInterval;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RepeatNotifySetting create() {
            return builder().build();
        }

        /**
         * @return endIncidentState
         */
        public String getEndIncidentState() {
            return this.endIncidentState;
        }

        /**
         * @return repeatInterval
         */
        public Integer getRepeatInterval() {
            return this.repeatInterval;
        }

        public static final class Builder {
            private String endIncidentState; 
            private Integer repeatInterval; 

            private Builder() {
            } 

            private Builder(RepeatNotifySetting model) {
                this.endIncidentState = model.endIncidentState;
                this.repeatInterval = model.repeatInterval;
            } 

            /**
             * <p>The end incident state.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;Resolved&quot;</p>
             */
            public Builder endIncidentState(String endIncidentState) {
                this.endIncidentState = endIncidentState;
                return this;
            }

            /**
             * <p>The time interval for repeat notifications.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder repeatInterval(Integer repeatInterval) {
                this.repeatInterval = repeatInterval;
                return this;
            }

            public RepeatNotifySetting build() {
                return new RepeatNotifySetting(this);
            } 

        } 

    }
    /**
     * 
     * {@link NotifyStrategyForView} extends {@link TeaModel}
     *
     * <p>NotifyStrategyForView</p>
     */
    public static class Channels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("channelType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String channelType;

        @com.aliyun.core.annotation.NameInMap("enabledSubChannels")
        private java.util.List<String> enabledSubChannels;

        @com.aliyun.core.annotation.NameInMap("receivers")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> receivers;

        private Channels(Builder builder) {
            this.channelType = builder.channelType;
            this.enabledSubChannels = builder.enabledSubChannels;
            this.receivers = builder.receivers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Channels create() {
            return builder().build();
        }

        /**
         * @return channelType
         */
        public String getChannelType() {
            return this.channelType;
        }

        /**
         * @return enabledSubChannels
         */
        public java.util.List<String> getEnabledSubChannels() {
            return this.enabledSubChannels;
        }

        /**
         * @return receivers
         */
        public java.util.List<String> getReceivers() {
            return this.receivers;
        }

        public static final class Builder {
            private String channelType; 
            private java.util.List<String> enabledSubChannels; 
            private java.util.List<String> receivers; 

            private Builder() {
            } 

            private Builder(Channels model) {
                this.channelType = model.channelType;
                this.enabledSubChannels = model.enabledSubChannels;
                this.receivers = model.receivers;
            } 

            /**
             * <p>The channel type.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>CONTACT</p>
             */
            public Builder channelType(String channelType) {
                this.channelType = channelType;
                return this;
            }

            /**
             * <p>The enabled notification types.</p>
             */
            public Builder enabledSubChannels(java.util.List<String> enabledSubChannels) {
                this.enabledSubChannels = enabledSubChannels;
                return this;
            }

            /**
             * <p>The channel receivers.</p>
             * <p>This parameter is required.</p>
             */
            public Builder receivers(java.util.List<String> receivers) {
                this.receivers = receivers;
                return this;
            }

            public Channels build() {
                return new Channels(this);
            } 

        } 

    }
    /**
     * 
     * {@link NotifyStrategyForView} extends {@link TeaModel}
     *
     * <p>NotifyStrategyForView</p>
     */
    public static class EffectTimeRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dayInWeek")
        private java.util.List<Integer> dayInWeek;

        @com.aliyun.core.annotation.NameInMap("endTimeInMinute")
        @com.aliyun.core.annotation.Validation(maximum = 1439)
        private Integer endTimeInMinute;

        @com.aliyun.core.annotation.NameInMap("startTimeInMinute")
        @com.aliyun.core.annotation.Validation(maximum = 1438)
        private Integer startTimeInMinute;

        @com.aliyun.core.annotation.NameInMap("timeZone")
        private String timeZone;

        private EffectTimeRange(Builder builder) {
            this.dayInWeek = builder.dayInWeek;
            this.endTimeInMinute = builder.endTimeInMinute;
            this.startTimeInMinute = builder.startTimeInMinute;
            this.timeZone = builder.timeZone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EffectTimeRange create() {
            return builder().build();
        }

        /**
         * @return dayInWeek
         */
        public java.util.List<Integer> getDayInWeek() {
            return this.dayInWeek;
        }

        /**
         * @return endTimeInMinute
         */
        public Integer getEndTimeInMinute() {
            return this.endTimeInMinute;
        }

        /**
         * @return startTimeInMinute
         */
        public Integer getStartTimeInMinute() {
            return this.startTimeInMinute;
        }

        /**
         * @return timeZone
         */
        public String getTimeZone() {
            return this.timeZone;
        }

        public static final class Builder {
            private java.util.List<Integer> dayInWeek; 
            private Integer endTimeInMinute; 
            private Integer startTimeInMinute; 
            private String timeZone; 

            private Builder() {
            } 

            private Builder(EffectTimeRange model) {
                this.dayInWeek = model.dayInWeek;
                this.endTimeInMinute = model.endTimeInMinute;
                this.startTimeInMinute = model.startTimeInMinute;
                this.timeZone = model.timeZone;
            } 

            /**
             * <p>The effective days (Monday to Sunday).</p>
             */
            public Builder dayInWeek(java.util.List<Integer> dayInWeek) {
                this.dayInWeek = dayInWeek;
                return this;
            }

            /**
             * <p>The end time in minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder endTimeInMinute(Integer endTimeInMinute) {
                this.endTimeInMinute = endTimeInMinute;
                return this;
            }

            /**
             * <p>The start time in minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder startTimeInMinute(Integer startTimeInMinute) {
                this.startTimeInMinute = startTimeInMinute;
                return this;
            }

            /**
             * <p>The time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>+08:00</p>
             */
            public Builder timeZone(String timeZone) {
                this.timeZone = timeZone;
                return this;
            }

            public EffectTimeRange build() {
                return new EffectTimeRange(this);
            } 

        } 

    }
    /**
     * 
     * {@link NotifyStrategyForView} extends {@link TeaModel}
     *
     * <p>NotifyStrategyForView</p>
     */
    public static class Routes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("channels")
        private java.util.List<Channels> channels;

        @com.aliyun.core.annotation.NameInMap("digitalEmployeeName")
        private String digitalEmployeeName;

        @com.aliyun.core.annotation.NameInMap("effectTimeRange")
        private EffectTimeRange effectTimeRange;

        @com.aliyun.core.annotation.NameInMap("enableRca")
        private Boolean enableRca;

        @com.aliyun.core.annotation.NameInMap("filterSetting")
        private FilterSetting filterSetting;

        @com.aliyun.core.annotation.NameInMap("severities")
        private java.util.List<String> severities;

        private Routes(Builder builder) {
            this.channels = builder.channels;
            this.digitalEmployeeName = builder.digitalEmployeeName;
            this.effectTimeRange = builder.effectTimeRange;
            this.enableRca = builder.enableRca;
            this.filterSetting = builder.filterSetting;
            this.severities = builder.severities;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Routes create() {
            return builder().build();
        }

        /**
         * @return channels
         */
        public java.util.List<Channels> getChannels() {
            return this.channels;
        }

        /**
         * @return digitalEmployeeName
         */
        public String getDigitalEmployeeName() {
            return this.digitalEmployeeName;
        }

        /**
         * @return effectTimeRange
         */
        public EffectTimeRange getEffectTimeRange() {
            return this.effectTimeRange;
        }

        /**
         * @return enableRca
         */
        public Boolean getEnableRca() {
            return this.enableRca;
        }

        /**
         * @return filterSetting
         */
        public FilterSetting getFilterSetting() {
            return this.filterSetting;
        }

        /**
         * @return severities
         */
        public java.util.List<String> getSeverities() {
            return this.severities;
        }

        public static final class Builder {
            private java.util.List<Channels> channels; 
            private String digitalEmployeeName; 
            private EffectTimeRange effectTimeRange; 
            private Boolean enableRca; 
            private FilterSetting filterSetting; 
            private java.util.List<String> severities; 

            private Builder() {
            } 

            private Builder(Routes model) {
                this.channels = model.channels;
                this.digitalEmployeeName = model.digitalEmployeeName;
                this.effectTimeRange = model.effectTimeRange;
                this.enableRca = model.enableRca;
                this.filterSetting = model.filterSetting;
                this.severities = model.severities;
            } 

            /**
             * <p>The notification channels.</p>
             */
            public Builder channels(java.util.List<Channels> channels) {
                this.channels = channels;
                return this;
            }

            /**
             * <p>The name of the digital employee.</p>
             * 
             * <strong>example:</strong>
             * <p>OnCallAssistant</p>
             */
            public Builder digitalEmployeeName(String digitalEmployeeName) {
                this.digitalEmployeeName = digitalEmployeeName;
                return this;
            }

            /**
             * <p>The effective time range.</p>
             */
            public Builder effectTimeRange(EffectTimeRange effectTimeRange) {
                this.effectTimeRange = effectTimeRange;
                return this;
            }

            /**
             * <p>Indicates whether root cause analysis is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableRca(Boolean enableRca) {
                this.enableRca = enableRca;
                return this;
            }

            /**
             * <p>The routing settings.</p>
             */
            public Builder filterSetting(FilterSetting filterSetting) {
                this.filterSetting = filterSetting;
                return this;
            }

            /**
             * <p>The list of severity levels.</p>
             */
            public Builder severities(java.util.List<String> severities) {
                this.severities = severities;
                return this;
            }

            public Routes build() {
                return new Routes(this);
            } 

        } 

    }
}
