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

    @com.aliyun.core.annotation.NameInMap("bizSource")
    private String bizSource;

    @com.aliyun.core.annotation.NameInMap("conditionConfig")
    private ConditionConfigUnified conditionConfig;

    @com.aliyun.core.annotation.NameInMap("contentTemplate")
    private String contentTemplate;

    @com.aliyun.core.annotation.NameInMap("datasourceConfig")
    private DatasourceConfigUnified datasourceConfig;

    @com.aliyun.core.annotation.NameInMap("displayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("drillEvalTime")
    private Long drillEvalTime;

    @com.aliyun.core.annotation.NameInMap("drillMode")
    private String drillMode;

    @com.aliyun.core.annotation.NameInMap("drillTimeRange")
    private DrillTimeRange drillTimeRange;

    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("labels")
    private java.util.Map<String, String> labels;

    @com.aliyun.core.annotation.NameInMap("notifyConfig")
    private NotifyConfigUnified notifyConfig;

    @com.aliyun.core.annotation.NameInMap("observeResourceConfig")
    private ObserveResourceConfig observeResourceConfig;

    @com.aliyun.core.annotation.NameInMap("observeResourceInstanceId")
    @Deprecated
    private String observeResourceInstanceId;

    @com.aliyun.core.annotation.NameInMap("observeResourceType")
    @Deprecated
    private String observeResourceType;

    @com.aliyun.core.annotation.NameInMap("queryConfig")
    private QueryConfigUnified queryConfig;

    @com.aliyun.core.annotation.NameInMap("rcaConfig")
    private AlertRuleRcaConfig rcaConfig;

    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

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
        this.bizSource = builder.bizSource;
        this.conditionConfig = builder.conditionConfig;
        this.contentTemplate = builder.contentTemplate;
        this.datasourceConfig = builder.datasourceConfig;
        this.displayName = builder.displayName;
        this.drillEvalTime = builder.drillEvalTime;
        this.drillMode = builder.drillMode;
        this.drillTimeRange = builder.drillTimeRange;
        this.enabled = builder.enabled;
        this.labels = builder.labels;
        this.notifyConfig = builder.notifyConfig;
        this.observeResourceConfig = builder.observeResourceConfig;
        this.observeResourceInstanceId = builder.observeResourceInstanceId;
        this.observeResourceType = builder.observeResourceType;
        this.queryConfig = builder.queryConfig;
        this.rcaConfig = builder.rcaConfig;
        this.regionId = builder.regionId;
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
     * @return drillEvalTime
     */
    public Long getDrillEvalTime() {
        return this.drillEvalTime;
    }

    /**
     * @return drillMode
     */
    public String getDrillMode() {
        return this.drillMode;
    }

    /**
     * @return drillTimeRange
     */
    public DrillTimeRange getDrillTimeRange() {
        return this.drillTimeRange;
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
     * @return observeResourceConfig
     */
    public ObserveResourceConfig getObserveResourceConfig() {
        return this.observeResourceConfig;
    }

    /**
     * @return observeResourceInstanceId
     */
    public String getObserveResourceInstanceId() {
        return this.observeResourceInstanceId;
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
        private String bizSource; 
        private ConditionConfigUnified conditionConfig; 
        private String contentTemplate; 
        private DatasourceConfigUnified datasourceConfig; 
        private String displayName; 
        private Long drillEvalTime; 
        private String drillMode; 
        private DrillTimeRange drillTimeRange; 
        private Boolean enabled; 
        private java.util.Map<String, String> labels; 
        private NotifyConfigUnified notifyConfig; 
        private ObserveResourceConfig observeResourceConfig; 
        private String observeResourceInstanceId; 
        private String observeResourceType; 
        private QueryConfigUnified queryConfig; 
        private AlertRuleRcaConfig rcaConfig; 
        private String regionId; 
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
            this.bizSource = model.bizSource;
            this.conditionConfig = model.conditionConfig;
            this.contentTemplate = model.contentTemplate;
            this.datasourceConfig = model.datasourceConfig;
            this.displayName = model.displayName;
            this.drillEvalTime = model.drillEvalTime;
            this.drillMode = model.drillMode;
            this.drillTimeRange = model.drillTimeRange;
            this.enabled = model.enabled;
            this.labels = model.labels;
            this.notifyConfig = model.notifyConfig;
            this.observeResourceConfig = model.observeResourceConfig;
            this.observeResourceInstanceId = model.observeResourceInstanceId;
            this.observeResourceType = model.observeResourceType;
            this.queryConfig = model.queryConfig;
            this.rcaConfig = model.rcaConfig;
            this.regionId = model.regionId;
            this.scheduleConfig = model.scheduleConfig;
            this.uuid = model.uuid;
            this.uuidList = model.uuidList;
            this.workspace = model.workspace;
        } 

        /**
         * <p>The action type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE</p>
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }

        /**
         * <p>The action integration configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;enabled&quot;:true,&quot;actions&quot;:[]}</p>
         */
        public Builder actionIntegrationConfig(ActionIntegrationConfig actionIntegrationConfig) {
            this.actionIntegrationConfig = actionIntegrationConfig;
            return this;
        }

        /**
         * <p>The annotations.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;summary&quot;:&quot;CPU usage exceeds 90%&quot;}</p>
         */
        public Builder annotations(java.util.Map<String, String> annotations) {
            this.annotations = annotations;
            return this;
        }

        /**
         * <p>The ARMS integration configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;enabled&quot;:false}</p>
         */
        public Builder armsIntegrationConfig(ArmsIntegrationConfig armsIntegrationConfig) {
            this.armsIntegrationConfig = armsIntegrationConfig;
            return this;
        }

        /**
         * <p>The business source. Valid values include managed_service_for_prometheus, umodel, application_insights, cloud_monitoring, and sls. Pass this field as needed for CREATE, UPDATE, and PATCH actions.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        public Builder bizSource(String bizSource) {
            this.bizSource = bizSource;
            return this;
        }

        /**
         * <p>The condition aggregation configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;PROMETHEUS_SIMPLE_CONDITION&quot;,&quot;durationSecs&quot;:0,&quot;severity&quot;:&quot;CRITICAL&quot;}</p>
         */
        public Builder conditionConfig(ConditionConfigUnified conditionConfig) {
            this.conditionConfig = conditionConfig;
            return this;
        }

        /**
         * <p>The content template.</p>
         * 
         * <strong>example:</strong>
         * <p>实例 {{instance}} CPU 使用率超过 {{threshold}}%</p>
         */
        public Builder contentTemplate(String contentTemplate) {
            this.contentTemplate = contentTemplate;
            return this;
        }

        /**
         * <p>The data source aggregation configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;PROMETHEUS&quot;,&quot;instanceId&quot;:&quot;prom-cn-hangzhou-xxxxx&quot;}</p>
         */
        public Builder datasourceConfig(DatasourceConfigUnified datasourceConfig) {
            this.datasourceConfig = datasourceConfig;
            return this;
        }

        /**
         * <p>The display name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The alert drill evaluation time in Unix milliseconds. This field is required by the backend when drillMode is ONE_SHOT. The time cannot be later than the current time or earlier than 90 days ago.</p>
         * 
         * <strong>example:</strong>
         * <p>1783728000000</p>
         */
        public Builder drillEvalTime(Long drillEvalTime) {
            this.drillEvalTime = drillEvalTime;
            return this;
        }

        /**
         * <p>The alert drill mode. This field is required by the backend when the action is DRILL_ALERT. Valid values: ONE_SHOT specifies a single point in time to simulate a complete lifecycle consisting of three events: OCCURRED, PERSISTENT, and RECOVERED. TIME_TRAVEL specifies a time range to simulate the lifecycle in multiple rounds based on the rule scheduling interval.</p>
         * 
         * <strong>example:</strong>
         * <p>ONE_SHOT</p>
         */
        public Builder drillMode(String drillMode) {
            this.drillMode = drillMode;
            return this;
        }

        /**
         * <p>The alert drill time range in Unix milliseconds. This field is required by the backend when drillMode is TIME_TRAVEL. The endTime must be later than the startTime and cannot be later than the current time. The lifecycle is simulated in multiple rounds based on the rule scheduling interval. The maximum number of rounds is 500. If the limit is exceeded, the backend returns a 400 error.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;startTime&quot;:1783728000000,&quot;endTime&quot;:1783814400000}</p>
         */
        public Builder drillTimeRange(DrillTimeRange drillTimeRange) {
            this.drillTimeRange = drillTimeRange;
            return this;
        }

        /**
         * <p>Specifies whether the rule is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>The labels.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;env&quot;:&quot;production&quot;}</p>
         */
        public Builder labels(java.util.Map<String, String> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * <p>The notification aggregation configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;DIRECT_NOTIFY&quot;,&quot;channels&quot;:[{&quot;type&quot;:&quot;GROUP&quot;,&quot;identifiers&quot;:[&quot;<contact-group-id>&quot;]}]}</p>
         */
        public Builder notifyConfig(NotifyConfigUnified notifyConfig) {
            this.notifyConfig = notifyConfig;
            return this;
        }

        /**
         * <p>The observable resource configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;relationType&quot;:&quot;CLOUD_INSTANCE&quot;,&quot;resources&quot;:[]}</p>
         */
        public Builder observeResourceConfig(ObserveResourceConfig observeResourceConfig) {
            this.observeResourceConfig = observeResourceConfig;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> The ID of the monitored object instance. For new integrations, use observeResourceConfig.resources instead. This field is retained only for compatibility with legacy SDKs.</p>
         * 
         * <strong>example:</strong>
         * <p>example-id-001</p>
         */
        public Builder observeResourceInstanceId(String observeResourceInstanceId) {
            this.observeResourceInstanceId = observeResourceInstanceId;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> The resource type of the monitored object. For new integrations, use observeResourceConfig.entityType instead. This field is retained only for compatibility with legacy SDKs.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder observeResourceType(String observeResourceType) {
            this.observeResourceType = observeResourceType;
            return this;
        }

        /**
         * <p>The query aggregation configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;PROMETHEUS_SINGLE_QUERY&quot;,&quot;expr&quot;:&quot;up &gt; 0&quot;}</p>
         */
        public Builder queryConfig(QueryConfigUnified queryConfig) {
            this.queryConfig = queryConfig;
            return this;
        }

        /**
         * <p>The root cause analysis (RCA) configuration. Pass this field as needed for CREATE, UPDATE, and PATCH actions.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;enabled&quot;:false}</p>
         */
        public Builder rcaConfig(AlertRuleRcaConfig rcaConfig) {
            this.rcaConfig = rcaConfig;
            return this;
        }

        /**
         * <p>The region ID. This aligns with V1 AlertRule.regionId. If not provided, the gateway callerRegionId is used.</p>
         * 
         * <strong>example:</strong>
         * <p>example-id-001</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The schedule aggregation configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;FIXED&quot;,&quot;intervalSecs&quot;:60}</p>
         */
        public Builder scheduleConfig(ScheduleConfigUnified scheduleConfig) {
            this.scheduleConfig = scheduleConfig;
            return this;
        }

        /**
         * <p>The UUID of the rule. This field is required for UPDATE and PATCH actions.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx-xxx-xxx</p>
         */
        public Builder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        /**
         * <p>The list of UUIDs for the rules to be deleted. This is used for the BATCH_DELETE action.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;cms_v2_81d01768-fee9-459f-af49-ab2704f1db2b&quot;]</p>
         */
        public Builder uuidList(java.util.List<String> uuidList) {
            this.uuidList = uuidList;
            return this;
        }

        /**
         * <p>The workspace ID. This field is required for CREATE, UPDATE, PATCH, DELETE, ENABLE, DISABLE, BATCH_DELETE, BATCH_ENABLE, and BATCH_DISABLE actions. It identifies the CloudMonitor workspace to which the rule belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-test</p>
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public ManageAlertRulesUnifiedActionInput build() {
            return new ManageAlertRulesUnifiedActionInput(this);
        } 

    } 

    /**
     * 
     * {@link ManageAlertRulesUnifiedActionInput} extends {@link TeaModel}
     *
     * <p>ManageAlertRulesUnifiedActionInput</p>
     */
    public static class DrillTimeRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private Long startTime;

        private DrillTimeRange(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DrillTimeRange create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Long endTime; 
            private Long startTime; 

            private Builder() {
            } 

            private Builder(DrillTimeRange model) {
                this.endTime = model.endTime;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The drill end time in Unix milliseconds. The end time must be later than the start time.</p>
             * 
             * <strong>example:</strong>
             * <p>1783814400000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The drill start time in Unix milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1783728000000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public DrillTimeRange build() {
                return new DrillTimeRange(this);
            } 

        } 

    }
}
