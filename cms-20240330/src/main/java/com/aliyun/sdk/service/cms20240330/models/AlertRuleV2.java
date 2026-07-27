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
 * {@link AlertRuleV2} extends {@link TeaModel}
 *
 * <p>AlertRuleV2</p>
 */
public class AlertRuleV2 extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("actionIntegrationConfig")
    private ActionIntegrationConfig actionIntegrationConfig;

    @com.aliyun.core.annotation.NameInMap("annotations")
    private java.util.Map<String, String> annotations;

    @com.aliyun.core.annotation.NameInMap("armsIntegrationConfig")
    private ArmsIntegrationConfig armsIntegrationConfig;

    @com.aliyun.core.annotation.NameInMap("bizSource")
    private String bizSource;

    @com.aliyun.core.annotation.NameInMap("conditionConfig")
    private ConditionConfigUnified conditionConfig;

    @com.aliyun.core.annotation.NameInMap("contentTemplate")
    private String contentTemplate;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("datasourceConfig")
    private DatasourceConfigUnified datasourceConfig;

    @com.aliyun.core.annotation.NameInMap("datasourceType")
    private String datasourceType;

    @com.aliyun.core.annotation.NameInMap("displayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("labels")
    private java.util.Map<String, String> labels;

    @com.aliyun.core.annotation.NameInMap("notifyConfig")
    private NotifyConfigUnified notifyConfig;

    @com.aliyun.core.annotation.NameInMap("notifyStrategyId")
    private String notifyStrategyId;

    @com.aliyun.core.annotation.NameInMap("observeResourceConfig")
    private ObserveResourceConfig observeResourceConfig;

    @com.aliyun.core.annotation.NameInMap("observeResourceGlobalScope")
    @Deprecated
    private Boolean observeResourceGlobalScope;

    @com.aliyun.core.annotation.NameInMap("observeResourceList")
    private java.util.List<String> observeResourceList;

    @com.aliyun.core.annotation.NameInMap("observeResourceType")
    @Deprecated
    private String observeResourceType;

    @com.aliyun.core.annotation.NameInMap("partitionKey")
    private String partitionKey;

    @com.aliyun.core.annotation.NameInMap("queryConfig")
    private QueryConfigUnified queryConfig;

    @com.aliyun.core.annotation.NameInMap("rcaConfig")
    private AlertRuleRcaConfig rcaConfig;

    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("scheduleConfig")
    private ScheduleConfigUnified scheduleConfig;

    @com.aliyun.core.annotation.NameInMap("severityLevels")
    private String severityLevels;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private String updatedAt;

    @com.aliyun.core.annotation.NameInMap("uuid")
    private String uuid;

    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private AlertRuleV2(Builder builder) {
        this.actionIntegrationConfig = builder.actionIntegrationConfig;
        this.annotations = builder.annotations;
        this.armsIntegrationConfig = builder.armsIntegrationConfig;
        this.bizSource = builder.bizSource;
        this.conditionConfig = builder.conditionConfig;
        this.contentTemplate = builder.contentTemplate;
        this.createdAt = builder.createdAt;
        this.datasourceConfig = builder.datasourceConfig;
        this.datasourceType = builder.datasourceType;
        this.displayName = builder.displayName;
        this.enabled = builder.enabled;
        this.labels = builder.labels;
        this.notifyConfig = builder.notifyConfig;
        this.notifyStrategyId = builder.notifyStrategyId;
        this.observeResourceConfig = builder.observeResourceConfig;
        this.observeResourceGlobalScope = builder.observeResourceGlobalScope;
        this.observeResourceList = builder.observeResourceList;
        this.observeResourceType = builder.observeResourceType;
        this.partitionKey = builder.partitionKey;
        this.queryConfig = builder.queryConfig;
        this.rcaConfig = builder.rcaConfig;
        this.regionId = builder.regionId;
        this.scheduleConfig = builder.scheduleConfig;
        this.severityLevels = builder.severityLevels;
        this.status = builder.status;
        this.updatedAt = builder.updatedAt;
        this.uuid = builder.uuid;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlertRuleV2 create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionIntegrationConfig
     */
    public ActionIntegrationConfig getActionIntegrationConfig() {
        return this.actionIntegrationConfig;
    }

    /**
     * @return annotations
     */
    public java.util.Map<String, String> getAnnotations() {
        return this.annotations;
    }

    /**
     * @return armsIntegrationConfig
     */
    public ArmsIntegrationConfig getArmsIntegrationConfig() {
        return this.armsIntegrationConfig;
    }

    /**
     * @return bizSource
     */
    public String getBizSource() {
        return this.bizSource;
    }

    /**
     * @return conditionConfig
     */
    public ConditionConfigUnified getConditionConfig() {
        return this.conditionConfig;
    }

    /**
     * @return contentTemplate
     */
    public String getContentTemplate() {
        return this.contentTemplate;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return datasourceConfig
     */
    public DatasourceConfigUnified getDatasourceConfig() {
        return this.datasourceConfig;
    }

    /**
     * @return datasourceType
     */
    public String getDatasourceType() {
        return this.datasourceType;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return labels
     */
    public java.util.Map<String, String> getLabels() {
        return this.labels;
    }

    /**
     * @return notifyConfig
     */
    public NotifyConfigUnified getNotifyConfig() {
        return this.notifyConfig;
    }

    /**
     * @return notifyStrategyId
     */
    public String getNotifyStrategyId() {
        return this.notifyStrategyId;
    }

    /**
     * @return observeResourceConfig
     */
    public ObserveResourceConfig getObserveResourceConfig() {
        return this.observeResourceConfig;
    }

    /**
     * @return observeResourceGlobalScope
     */
    public Boolean getObserveResourceGlobalScope() {
        return this.observeResourceGlobalScope;
    }

    /**
     * @return observeResourceList
     */
    public java.util.List<String> getObserveResourceList() {
        return this.observeResourceList;
    }

    /**
     * @return observeResourceType
     */
    public String getObserveResourceType() {
        return this.observeResourceType;
    }

    /**
     * @return partitionKey
     */
    public String getPartitionKey() {
        return this.partitionKey;
    }

    /**
     * @return queryConfig
     */
    public QueryConfigUnified getQueryConfig() {
        return this.queryConfig;
    }

    /**
     * @return rcaConfig
     */
    public AlertRuleRcaConfig getRcaConfig() {
        return this.rcaConfig;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return scheduleConfig
     */
    public ScheduleConfigUnified getScheduleConfig() {
        return this.scheduleConfig;
    }

    /**
     * @return severityLevels
     */
    public String getSeverityLevels() {
        return this.severityLevels;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private ActionIntegrationConfig actionIntegrationConfig; 
        private java.util.Map<String, String> annotations; 
        private ArmsIntegrationConfig armsIntegrationConfig; 
        private String bizSource; 
        private ConditionConfigUnified conditionConfig; 
        private String contentTemplate; 
        private String createdAt; 
        private DatasourceConfigUnified datasourceConfig; 
        private String datasourceType; 
        private String displayName; 
        private Boolean enabled; 
        private java.util.Map<String, String> labels; 
        private NotifyConfigUnified notifyConfig; 
        private String notifyStrategyId; 
        private ObserveResourceConfig observeResourceConfig; 
        private Boolean observeResourceGlobalScope; 
        private java.util.List<String> observeResourceList; 
        private String observeResourceType; 
        private String partitionKey; 
        private QueryConfigUnified queryConfig; 
        private AlertRuleRcaConfig rcaConfig; 
        private String regionId; 
        private ScheduleConfigUnified scheduleConfig; 
        private String severityLevels; 
        private String status; 
        private String updatedAt; 
        private String uuid; 
        private String workspace; 

        private Builder() {
        } 

        private Builder(AlertRuleV2 model) {
            this.actionIntegrationConfig = model.actionIntegrationConfig;
            this.annotations = model.annotations;
            this.armsIntegrationConfig = model.armsIntegrationConfig;
            this.bizSource = model.bizSource;
            this.conditionConfig = model.conditionConfig;
            this.contentTemplate = model.contentTemplate;
            this.createdAt = model.createdAt;
            this.datasourceConfig = model.datasourceConfig;
            this.datasourceType = model.datasourceType;
            this.displayName = model.displayName;
            this.enabled = model.enabled;
            this.labels = model.labels;
            this.notifyConfig = model.notifyConfig;
            this.notifyStrategyId = model.notifyStrategyId;
            this.observeResourceConfig = model.observeResourceConfig;
            this.observeResourceGlobalScope = model.observeResourceGlobalScope;
            this.observeResourceList = model.observeResourceList;
            this.observeResourceType = model.observeResourceType;
            this.partitionKey = model.partitionKey;
            this.queryConfig = model.queryConfig;
            this.rcaConfig = model.rcaConfig;
            this.regionId = model.regionId;
            this.scheduleConfig = model.scheduleConfig;
            this.severityLevels = model.severityLevels;
            this.status = model.status;
            this.updatedAt = model.updatedAt;
            this.uuid = model.uuid;
            this.workspace = model.workspace;
        } 

        /**
         * actionIntegrationConfig.
         */
        public Builder actionIntegrationConfig(ActionIntegrationConfig actionIntegrationConfig) {
            this.actionIntegrationConfig = actionIntegrationConfig;
            return this;
        }

        /**
         * annotations.
         */
        public Builder annotations(java.util.Map<String, String> annotations) {
            this.annotations = annotations;
            return this;
        }

        /**
         * armsIntegrationConfig.
         */
        public Builder armsIntegrationConfig(ArmsIntegrationConfig armsIntegrationConfig) {
            this.armsIntegrationConfig = armsIntegrationConfig;
            return this;
        }

        /**
         * bizSource.
         */
        public Builder bizSource(String bizSource) {
            this.bizSource = bizSource;
            return this;
        }

        /**
         * conditionConfig.
         */
        public Builder conditionConfig(ConditionConfigUnified conditionConfig) {
            this.conditionConfig = conditionConfig;
            return this;
        }

        /**
         * contentTemplate.
         */
        public Builder contentTemplate(String contentTemplate) {
            this.contentTemplate = contentTemplate;
            return this;
        }

        /**
         * createdAt.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * datasourceConfig.
         */
        public Builder datasourceConfig(DatasourceConfigUnified datasourceConfig) {
            this.datasourceConfig = datasourceConfig;
            return this;
        }

        /**
         * datasourceType.
         */
        public Builder datasourceType(String datasourceType) {
            this.datasourceType = datasourceType;
            return this;
        }

        /**
         * displayName.
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * labels.
         */
        public Builder labels(java.util.Map<String, String> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * notifyConfig.
         */
        public Builder notifyConfig(NotifyConfigUnified notifyConfig) {
            this.notifyConfig = notifyConfig;
            return this;
        }

        /**
         * notifyStrategyId.
         */
        public Builder notifyStrategyId(String notifyStrategyId) {
            this.notifyStrategyId = notifyStrategyId;
            return this;
        }

        /**
         * observeResourceConfig.
         */
        public Builder observeResourceConfig(ObserveResourceConfig observeResourceConfig) {
            this.observeResourceConfig = observeResourceConfig;
            return this;
        }

        /**
         * observeResourceGlobalScope.
         */
        public Builder observeResourceGlobalScope(Boolean observeResourceGlobalScope) {
            this.observeResourceGlobalScope = observeResourceGlobalScope;
            return this;
        }

        /**
         * observeResourceList.
         */
        public Builder observeResourceList(java.util.List<String> observeResourceList) {
            this.observeResourceList = observeResourceList;
            return this;
        }

        /**
         * observeResourceType.
         */
        public Builder observeResourceType(String observeResourceType) {
            this.observeResourceType = observeResourceType;
            return this;
        }

        /**
         * partitionKey.
         */
        public Builder partitionKey(String partitionKey) {
            this.partitionKey = partitionKey;
            return this;
        }

        /**
         * queryConfig.
         */
        public Builder queryConfig(QueryConfigUnified queryConfig) {
            this.queryConfig = queryConfig;
            return this;
        }

        /**
         * rcaConfig.
         */
        public Builder rcaConfig(AlertRuleRcaConfig rcaConfig) {
            this.rcaConfig = rcaConfig;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * scheduleConfig.
         */
        public Builder scheduleConfig(ScheduleConfigUnified scheduleConfig) {
            this.scheduleConfig = scheduleConfig;
            return this;
        }

        /**
         * severityLevels.
         */
        public Builder severityLevels(String severityLevels) {
            this.severityLevels = severityLevels;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * updatedAt.
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * uuid.
         */
        public Builder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public AlertRuleV2 build() {
            return new AlertRuleV2(this);
        } 

    } 

}
