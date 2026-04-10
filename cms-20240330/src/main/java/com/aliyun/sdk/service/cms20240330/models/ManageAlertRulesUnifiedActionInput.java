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
 * {@link ManageAlertRulesUnifiedActionInput} extends {@link TeaModel}
 *
 * <p>ManageAlertRulesUnifiedActionInput</p>
 */
public class ManageAlertRulesUnifiedActionInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("action")
    @com.aliyun.core.annotation.Validation(required = true)
    private String action;

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

    @com.aliyun.core.annotation.NameInMap("datasourceConfig")
    private DatasourceConfigUnified datasourceConfig;

    @com.aliyun.core.annotation.NameInMap("displayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("labels")
    private java.util.Map<String, String> labels;

    @com.aliyun.core.annotation.NameInMap("notifyConfig")
    private NotifyConfigUnified notifyConfig;

    @com.aliyun.core.annotation.NameInMap("queryConfig")
    private QueryConfigUnified queryConfig;

    @com.aliyun.core.annotation.NameInMap("scheduleConfig")
    private ScheduleConfigUnified scheduleConfig;

    @com.aliyun.core.annotation.NameInMap("uuid")
    private String uuid;

    @com.aliyun.core.annotation.NameInMap("uuidList")
    private java.util.List<String> uuidList;

    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private ManageAlertRulesUnifiedActionInput(Builder builder) {
        this.action = builder.action;
        this.actionIntegrationConfig = builder.actionIntegrationConfig;
        this.annotations = builder.annotations;
        this.armsIntegrationConfig = builder.armsIntegrationConfig;
        this.conditionConfig = builder.conditionConfig;
        this.contentTemplate = builder.contentTemplate;
        this.datasourceConfig = builder.datasourceConfig;
        this.displayName = builder.displayName;
        this.enabled = builder.enabled;
        this.labels = builder.labels;
        this.notifyConfig = builder.notifyConfig;
        this.queryConfig = builder.queryConfig;
        this.scheduleConfig = builder.scheduleConfig;
        this.uuid = builder.uuid;
        this.uuidList = builder.uuidList;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ManageAlertRulesUnifiedActionInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return action
     */
    public String getAction() {
        return this.action;
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
     * @return datasourceConfig
     */
    public DatasourceConfigUnified getDatasourceConfig() {
        return this.datasourceConfig;
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
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    /**
     * @return uuidList
     */
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private String action; 
        private ActionIntegrationConfig actionIntegrationConfig; 
        private java.util.Map<String, String> annotations; 
        private ArmsIntegrationConfig armsIntegrationConfig; 
        private ConditionConfigUnified conditionConfig; 
        private String contentTemplate; 
        private DatasourceConfigUnified datasourceConfig; 
        private String displayName; 
        private Boolean enabled; 
        private java.util.Map<String, String> labels; 
        private NotifyConfigUnified notifyConfig; 
        private QueryConfigUnified queryConfig; 
        private ScheduleConfigUnified scheduleConfig; 
        private String uuid; 
        private java.util.List<String> uuidList; 
        private String workspace; 

        private Builder() {
        } 

        private Builder(ManageAlertRulesUnifiedActionInput model) {
            this.action = model.action;
            this.actionIntegrationConfig = model.actionIntegrationConfig;
            this.annotations = model.annotations;
            this.armsIntegrationConfig = model.armsIntegrationConfig;
            this.conditionConfig = model.conditionConfig;
            this.contentTemplate = model.contentTemplate;
            this.datasourceConfig = model.datasourceConfig;
            this.displayName = model.displayName;
            this.enabled = model.enabled;
            this.labels = model.labels;
            this.notifyConfig = model.notifyConfig;
            this.queryConfig = model.queryConfig;
            this.scheduleConfig = model.scheduleConfig;
            this.uuid = model.uuid;
            this.uuidList = model.uuidList;
            this.workspace = model.workspace;
        } 

        /**
         * <p>操作类型</p>
         * <p>This parameter is required.</p>
         */
        public Builder action(String action) {
            this.action = action;
            return this;
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
         * datasourceConfig.
         */
        public Builder datasourceConfig(DatasourceConfigUnified datasourceConfig) {
            this.datasourceConfig = datasourceConfig;
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
         * <p>规则 UUID（UPDATE/PATCH 必填）</p>
         */
        public Builder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        /**
         * <p>待删除规则 UUID 列表（BATCH_DELETE）</p>
         */
        public Builder uuidList(java.util.List<String> uuidList) {
            this.uuidList = uuidList;
            return this;
        }

        /**
         * <p>工作空间（CREATE/UPDATE 等）</p>
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public ManageAlertRulesUnifiedActionInput build() {
            return new ManageAlertRulesUnifiedActionInput(this);
        } 

    } 

}
