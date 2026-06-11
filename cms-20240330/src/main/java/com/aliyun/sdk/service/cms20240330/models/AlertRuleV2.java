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

    @com.aliyun.core.annotation.NameInMap("conditionConfig")
    private ConditionConfigUnified conditionConfig;

    @com.aliyun.core.annotation.NameInMap("contentTemplate")
    private String contentTemplate;

    @com.aliyun.core.annotation.NameInMap("coveredSeverityLevels")
    private String coveredSeverityLevels;

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

    @com.aliyun.core.annotation.NameInMap("observeResourceGlobalScope")
    private Boolean observeResourceGlobalScope;

    @com.aliyun.core.annotation.NameInMap("observeResourceList")
    private String observeResourceList;

    @com.aliyun.core.annotation.NameInMap("observeResourceType")
    private String observeResourceType;

    @com.aliyun.core.annotation.NameInMap("queryConfig")
    private QueryConfigUnified queryConfig;

    @com.aliyun.core.annotation.NameInMap("scheduleConfig")
    private ScheduleConfigUnified scheduleConfig;

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
        this.conditionConfig = builder.conditionConfig;
        this.contentTemplate = builder.contentTemplate;
        this.coveredSeverityLevels = builder.coveredSeverityLevels;
        this.createdAt = builder.createdAt;
        this.datasourceConfig = builder.datasourceConfig;
        this.datasourceType = builder.datasourceType;
        this.displayName = builder.displayName;
        this.enabled = builder.enabled;
        this.labels = builder.labels;
        this.notifyConfig = builder.notifyConfig;
        this.observeResourceGlobalScope = builder.observeResourceGlobalScope;
        this.observeResourceList = builder.observeResourceList;
        this.observeResourceType = builder.observeResourceType;
        this.queryConfig = builder.queryConfig;
        this.scheduleConfig = builder.scheduleConfig;
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
     * @return coveredSeverityLevels
     */
    public String getCoveredSeverityLevels() {
        return this.coveredSeverityLevels;
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
     * @return observeResourceGlobalScope
     */
    public Boolean getObserveResourceGlobalScope() {
        return this.observeResourceGlobalScope;
    }

    /**
     * @return observeResourceList
     */
    public String getObserveResourceList() {
        return this.observeResourceList;
    }

    /**
     * @return observeResourceType
     */
    public String getObserveResourceType() {
        return this.observeResourceType;
    }

    /**
     * @return queryConfig
     */
    public QueryConfigUnified getQueryConfig() {
        return this.queryConfig;
    }

    /**
     * @return scheduleConfig
     */
    public ScheduleConfigUnified getScheduleConfig() {
        return this.scheduleConfig;
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
        private ConditionConfigUnified conditionConfig; 
        private String contentTemplate; 
        private String coveredSeverityLevels; 
        private String createdAt; 
        private DatasourceConfigUnified datasourceConfig; 
        private String datasourceType; 
        private String displayName; 
        private Boolean enabled; 
        private java.util.Map<String, String> labels; 
        private NotifyConfigUnified notifyConfig; 
        private Boolean observeResourceGlobalScope; 
        private String observeResourceList; 
        private String observeResourceType; 
        private QueryConfigUnified queryConfig; 
        private ScheduleConfigUnified scheduleConfig; 
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
            this.conditionConfig = model.conditionConfig;
            this.contentTemplate = model.contentTemplate;
            this.coveredSeverityLevels = model.coveredSeverityLevels;
            this.createdAt = model.createdAt;
            this.datasourceConfig = model.datasourceConfig;
            this.datasourceType = model.datasourceType;
            this.displayName = model.displayName;
            this.enabled = model.enabled;
            this.labels = model.labels;
            this.notifyConfig = model.notifyConfig;
            this.observeResourceGlobalScope = model.observeResourceGlobalScope;
            this.observeResourceList = model.observeResourceList;
            this.observeResourceType = model.observeResourceType;
            this.queryConfig = model.queryConfig;
            this.scheduleConfig = model.scheduleConfig;
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
         * <p>注解</p>
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
         * conditionConfig.
         */
        public Builder conditionConfig(ConditionConfigUnified conditionConfig) {
            this.conditionConfig = conditionConfig;
            return this;
        }

        /**
         * <p>内容模板</p>
         */
        public Builder contentTemplate(String contentTemplate) {
            this.contentTemplate = contentTemplate;
            return this;
        }

        /**
         * coveredSeverityLevels.
         */
        public Builder coveredSeverityLevels(String coveredSeverityLevels) {
            this.coveredSeverityLevels = coveredSeverityLevels;
            return this;
        }

        /**
         * <p>创建时间（只读），ISO 8601</p>
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
         * <p>显示名称</p>
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>是否启用</p>
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>标签</p>
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
         * observeResourceGlobalScope.
         */
        public Builder observeResourceGlobalScope(Boolean observeResourceGlobalScope) {
            this.observeResourceGlobalScope = observeResourceGlobalScope;
            return this;
        }

        /**
         * observeResourceList.
         */
        public Builder observeResourceList(String observeResourceList) {
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
         * queryConfig.
         */
        public Builder queryConfig(QueryConfigUnified queryConfig) {
            this.queryConfig = queryConfig;
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
         * <p>告警状态（只读）</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>更新时间（只读），ISO 8601</p>
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * <p>规则 UUID（系统生成，只读）</p>
         */
        public Builder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        /**
         * <p>工作空间</p>
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
