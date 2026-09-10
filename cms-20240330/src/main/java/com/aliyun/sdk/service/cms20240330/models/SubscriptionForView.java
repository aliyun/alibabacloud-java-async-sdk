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
 * {@link SubscriptionForView} extends {@link TeaModel}
 *
 * <p>SubscriptionForView</p>
 */
public class SubscriptionForView extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agentConfig")
    private AgentConfig agentConfig;

    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("enable")
    private Boolean enable;

    @com.aliyun.core.annotation.NameInMap("filterSetting")
    private FilterSetting filterSetting;

    @com.aliyun.core.annotation.NameInMap("notifyStrategyId")
    private String notifyStrategyId;

    @com.aliyun.core.annotation.NameInMap("pushingSetting")
    private PushingSetting pushingSetting;

    @com.aliyun.core.annotation.NameInMap("subscribeLegacyEvent")
    private Boolean subscribeLegacyEvent;

    @com.aliyun.core.annotation.NameInMap("subscriptionId")
    private String subscriptionId;

    @com.aliyun.core.annotation.NameInMap("subscriptionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subscriptionName;

    @com.aliyun.core.annotation.NameInMap("subscriptionType")
    private String subscriptionType;

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

    private SubscriptionForView(Builder builder) {
        this.agentConfig = builder.agentConfig;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.enable = builder.enable;
        this.filterSetting = builder.filterSetting;
        this.notifyStrategyId = builder.notifyStrategyId;
        this.pushingSetting = builder.pushingSetting;
        this.subscribeLegacyEvent = builder.subscribeLegacyEvent;
        this.subscriptionId = builder.subscriptionId;
        this.subscriptionName = builder.subscriptionName;
        this.subscriptionType = builder.subscriptionType;
        this.syncFromType = builder.syncFromType;
        this.updateTime = builder.updateTime;
        this.userId = builder.userId;
        this.workspace = builder.workspace;
        this.workspaceFilterSetting = builder.workspaceFilterSetting;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubscriptionForView create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentConfig
     */
    public AgentConfig getAgentConfig() {
        return this.agentConfig;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
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
     * @return notifyStrategyId
     */
    public String getNotifyStrategyId() {
        return this.notifyStrategyId;
    }

    /**
     * @return pushingSetting
     */
    public PushingSetting getPushingSetting() {
        return this.pushingSetting;
    }

    /**
     * @return subscribeLegacyEvent
     */
    public Boolean getSubscribeLegacyEvent() {
        return this.subscribeLegacyEvent;
    }

    /**
     * @return subscriptionId
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * @return subscriptionName
     */
    public String getSubscriptionName() {
        return this.subscriptionName;
    }

    /**
     * @return subscriptionType
     */
    public String getSubscriptionType() {
        return this.subscriptionType;
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
        private AgentConfig agentConfig; 
        private String createTime; 
        private String description; 
        private Boolean enable; 
        private FilterSetting filterSetting; 
        private String notifyStrategyId; 
        private PushingSetting pushingSetting; 
        private Boolean subscribeLegacyEvent; 
        private String subscriptionId; 
        private String subscriptionName; 
        private String subscriptionType; 
        private String syncFromType; 
        private String updateTime; 
        private String userId; 
        private String workspace; 
        private WorkspaceFilterSetting workspaceFilterSetting; 

        private Builder() {
        } 

        private Builder(SubscriptionForView model) {
            this.agentConfig = model.agentConfig;
            this.createTime = model.createTime;
            this.description = model.description;
            this.enable = model.enable;
            this.filterSetting = model.filterSetting;
            this.notifyStrategyId = model.notifyStrategyId;
            this.pushingSetting = model.pushingSetting;
            this.subscribeLegacyEvent = model.subscribeLegacyEvent;
            this.subscriptionId = model.subscriptionId;
            this.subscriptionName = model.subscriptionName;
            this.subscriptionType = model.subscriptionType;
            this.syncFromType = model.syncFromType;
            this.updateTime = model.updateTime;
            this.userId = model.userId;
            this.workspace = model.workspace;
            this.workspaceFilterSetting = model.workspaceFilterSetting;
        } 

        /**
         * <p>The Agent configuration information.</p>
         */
        public Builder agentConfig(AgentConfig agentConfig) {
            this.agentConfig = agentConfig;
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
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace test</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>Indicates whether the subscription is enabled.</p>
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
         * <p>The UUID of the notification policy.</p>
         * 
         * <strong>example:</strong>
         * <p>23123123</p>
         */
        public Builder notifyStrategyId(String notifyStrategyId) {
            this.notifyStrategyId = notifyStrategyId;
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
         * <p>Indicates whether to subscribe to legacy product events (CMS 1.0, ARMS, or SLS events where workspace=null). Valid values: true: Subscribed. false or null: Not subscribed.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder subscribeLegacyEvent(Boolean subscribeLegacyEvent) {
            this.subscribeLegacyEvent = subscribeLegacyEvent;
            return this;
        }

        /**
         * <p>The unique identifier of the subscription.</p>
         * 
         * <strong>example:</strong>
         * <p>123123123123</p>
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * <p>The name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SubscriptionTest</p>
         */
        public Builder subscriptionName(String subscriptionName) {
            this.subscriptionName = subscriptionName;
            return this;
        }

        /**
         * <p>The subscription type.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder subscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
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
         * <p>2025-05-23T02:29:02Z</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123123123</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * <p>The workspace identifier.</p>
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

        public SubscriptionForView build() {
            return new SubscriptionForView(this);
        } 

    } 

    /**
     * 
     * {@link SubscriptionForView} extends {@link TeaModel}
     *
     * <p>SubscriptionForView</p>
     */
    public static class AgentConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentUuid")
        private String agentUuid;

        @com.aliyun.core.annotation.NameInMap("routes")
        private java.util.List<NotifyRouteForSubscription> routes;

        private AgentConfig(Builder builder) {
            this.agentUuid = builder.agentUuid;
            this.routes = builder.routes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentConfig create() {
            return builder().build();
        }

        /**
         * @return agentUuid
         */
        public String getAgentUuid() {
            return this.agentUuid;
        }

        /**
         * @return routes
         */
        public java.util.List<NotifyRouteForSubscription> getRoutes() {
            return this.routes;
        }

        public static final class Builder {
            private String agentUuid; 
            private java.util.List<NotifyRouteForSubscription> routes; 

            private Builder() {
            } 

            private Builder(AgentConfig model) {
                this.agentUuid = model.agentUuid;
                this.routes = model.routes;
            } 

            /**
             * <p>The unique identifier of the Agent.</p>
             * 
             * <strong>example:</strong>
             * <p>agent-uuid-001</p>
             */
            public Builder agentUuid(String agentUuid) {
                this.agentUuid = agentUuid;
                return this;
            }

            /**
             * <p>The list of Agent routing configurations.</p>
             */
            public Builder routes(java.util.List<NotifyRouteForSubscription> routes) {
                this.routes = routes;
                return this;
            }

            public AgentConfig build() {
                return new AgentConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubscriptionForView} extends {@link TeaModel}
     *
     * <p>SubscriptionForView</p>
     */
    public static class PushingSetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alertActionIds")
        private java.util.List<String> alertActionIds;

        @com.aliyun.core.annotation.NameInMap("responsePlanId")
        private String responsePlanId;

        @com.aliyun.core.annotation.NameInMap("restoreActionIds")
        private java.util.List<String> restoreActionIds;

        @com.aliyun.core.annotation.NameInMap("templateUuid")
        private String templateUuid;

        private PushingSetting(Builder builder) {
            this.alertActionIds = builder.alertActionIds;
            this.responsePlanId = builder.responsePlanId;
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
         * @return responsePlanId
         */
        public String getResponsePlanId() {
            return this.responsePlanId;
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
            private String responsePlanId; 
            private java.util.List<String> restoreActionIds; 
            private String templateUuid; 

            private Builder() {
            } 

            private Builder(PushingSetting model) {
                this.alertActionIds = model.alertActionIds;
                this.responsePlanId = model.responsePlanId;
                this.restoreActionIds = model.restoreActionIds;
                this.templateUuid = model.templateUuid;
            } 

            /**
             * <p>The list of action integration IDs for alert pushing.</p>
             */
            public Builder alertActionIds(java.util.List<String> alertActionIds) {
                this.alertActionIds = alertActionIds;
                return this;
            }

            /**
             * <p>The action plan ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123123123</p>
             */
            public Builder responsePlanId(String responsePlanId) {
                this.responsePlanId = responsePlanId;
                return this;
            }

            /**
             * <p>The list of action integration IDs for recovery pushing.</p>
             */
            public Builder restoreActionIds(java.util.List<String> restoreActionIds) {
                this.restoreActionIds = restoreActionIds;
                return this;
            }

            /**
             * <p>The UUID of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>123123123</p>
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
}
