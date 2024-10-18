// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateDIJobRequest} extends {@link RequestModel}
 *
 * <p>UpdateDIJobRequest</p>
 */
public class UpdateDIJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DIJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long DIJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobSettings")
    private JobSettings jobSettings;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceSettings")
    private ResourceSettings resourceSettings;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableMappings")
    private java.util.List < TableMappings> tableMappings;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransformationRules")
    private java.util.List < TransformationRules> transformationRules;

    private UpdateDIJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.DIJobId = builder.DIJobId;
        this.description = builder.description;
        this.jobSettings = builder.jobSettings;
        this.projectId = builder.projectId;
        this.resourceSettings = builder.resourceSettings;
        this.tableMappings = builder.tableMappings;
        this.transformationRules = builder.transformationRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDIJobRequest create() {
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
     * @return jobSettings
     */
    public JobSettings getJobSettings() {
        return this.jobSettings;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return resourceSettings
     */
    public ResourceSettings getResourceSettings() {
        return this.resourceSettings;
    }

    /**
     * @return tableMappings
     */
    public java.util.List < TableMappings> getTableMappings() {
        return this.tableMappings;
    }

    /**
     * @return transformationRules
     */
    public java.util.List < TransformationRules> getTransformationRules() {
        return this.transformationRules;
    }

    public static final class Builder extends Request.Builder<UpdateDIJobRequest, Builder> {
        private String regionId; 
        private Long DIJobId; 
        private String description; 
        private JobSettings jobSettings; 
        private Long projectId; 
        private ResourceSettings resourceSettings; 
        private java.util.List < TableMappings> tableMappings; 
        private java.util.List < TransformationRules> transformationRules; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDIJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.DIJobId = request.DIJobId;
            this.description = request.description;
            this.jobSettings = request.jobSettings;
            this.projectId = request.projectId;
            this.resourceSettings = request.resourceSettings;
            this.tableMappings = request.tableMappings;
            this.transformationRules = request.transformationRules;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>11588</p>
         */
        public Builder DIJobId(Long DIJobId) {
            this.putQueryParameter("DIJobId", DIJobId);
            this.DIJobId = DIJobId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * JobSettings.
         */
        public Builder jobSettings(JobSettings jobSettings) {
            String jobSettingsShrink = shrink(jobSettings, "JobSettings", "json");
            this.putQueryParameter("JobSettings", jobSettingsShrink);
            this.jobSettings = jobSettings;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * ResourceSettings.
         */
        public Builder resourceSettings(ResourceSettings resourceSettings) {
            String resourceSettingsShrink = shrink(resourceSettings, "ResourceSettings", "json");
            this.putQueryParameter("ResourceSettings", resourceSettingsShrink);
            this.resourceSettings = resourceSettings;
            return this;
        }

        /**
         * TableMappings.
         */
        public Builder tableMappings(java.util.List < TableMappings> tableMappings) {
            String tableMappingsShrink = shrink(tableMappings, "TableMappings", "json");
            this.putQueryParameter("TableMappings", tableMappingsShrink);
            this.tableMappings = tableMappings;
            return this;
        }

        /**
         * TransformationRules.
         */
        public Builder transformationRules(java.util.List < TransformationRules> transformationRules) {
            String transformationRulesShrink = shrink(transformationRules, "TransformationRules", "json");
            this.putQueryParameter("TransformationRules", transformationRulesShrink);
            this.transformationRules = transformationRules;
            return this;
        }

        @Override
        public UpdateDIJobRequest build() {
            return new UpdateDIJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateDIJobRequest} extends {@link TeaModel}
     *
     * <p>UpdateDIJobRequest</p>
     */
    public static class ColumnDataTypeSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestinationDataType")
        private String destinationDataType;

        @com.aliyun.core.annotation.NameInMap("SourceDataType")
        private String sourceDataType;

        private ColumnDataTypeSettings(Builder builder) {
            this.destinationDataType = builder.destinationDataType;
            this.sourceDataType = builder.sourceDataType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ColumnDataTypeSettings create() {
            return builder().build();
        }

        /**
         * @return destinationDataType
         */
        public String getDestinationDataType() {
            return this.destinationDataType;
        }

        /**
         * @return sourceDataType
         */
        public String getSourceDataType() {
            return this.sourceDataType;
        }

        public static final class Builder {
            private String destinationDataType; 
            private String sourceDataType; 

            /**
             * DestinationDataType.
             */
            public Builder destinationDataType(String destinationDataType) {
                this.destinationDataType = destinationDataType;
                return this;
            }

            /**
             * SourceDataType.
             */
            public Builder sourceDataType(String sourceDataType) {
                this.sourceDataType = sourceDataType;
                return this;
            }

            public ColumnDataTypeSettings build() {
                return new ColumnDataTypeSettings(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateDIJobRequest} extends {@link TeaModel}
     *
     * <p>UpdateDIJobRequest</p>
     */
    public static class CycleScheduleSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ScheduleParameters")
        private String scheduleParameters;

        private CycleScheduleSettings(Builder builder) {
            this.scheduleParameters = builder.scheduleParameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CycleScheduleSettings create() {
            return builder().build();
        }

        /**
         * @return scheduleParameters
         */
        public String getScheduleParameters() {
            return this.scheduleParameters;
        }

        public static final class Builder {
            private String scheduleParameters; 

            /**
             * ScheduleParameters.
             */
            public Builder scheduleParameters(String scheduleParameters) {
                this.scheduleParameters = scheduleParameters;
                return this;
            }

            public CycleScheduleSettings build() {
                return new CycleScheduleSettings(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateDIJobRequest} extends {@link TeaModel}
     *
     * <p>UpdateDIJobRequest</p>
     */
    public static class DdlHandlingSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private DdlHandlingSettings(Builder builder) {
            this.action = builder.action;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DdlHandlingSettings create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String action; 
            private String type; 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DdlHandlingSettings build() {
                return new DdlHandlingSettings(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateDIJobRequest} extends {@link TeaModel}
     *
     * <p>UpdateDIJobRequest</p>
     */
    public static class RuntimeSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private RuntimeSettings(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuntimeSettings create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public RuntimeSettings build() {
                return new RuntimeSettings(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateDIJobRequest} extends {@link TeaModel}
     *
     * <p>UpdateDIJobRequest</p>
     */
    public static class JobSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelSettings")
        private String channelSettings;

        @com.aliyun.core.annotation.NameInMap("ColumnDataTypeSettings")
        private java.util.List < ColumnDataTypeSettings> columnDataTypeSettings;

        @com.aliyun.core.annotation.NameInMap("CycleScheduleSettings")
        private CycleScheduleSettings cycleScheduleSettings;

        @com.aliyun.core.annotation.NameInMap("DdlHandlingSettings")
        private java.util.List < DdlHandlingSettings> ddlHandlingSettings;

        @com.aliyun.core.annotation.NameInMap("RuntimeSettings")
        private java.util.List < RuntimeSettings> runtimeSettings;

        private JobSettings(Builder builder) {
            this.channelSettings = builder.channelSettings;
            this.columnDataTypeSettings = builder.columnDataTypeSettings;
            this.cycleScheduleSettings = builder.cycleScheduleSettings;
            this.ddlHandlingSettings = builder.ddlHandlingSettings;
            this.runtimeSettings = builder.runtimeSettings;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobSettings create() {
            return builder().build();
        }

        /**
         * @return channelSettings
         */
        public String getChannelSettings() {
            return this.channelSettings;
        }

        /**
         * @return columnDataTypeSettings
         */
        public java.util.List < ColumnDataTypeSettings> getColumnDataTypeSettings() {
            return this.columnDataTypeSettings;
        }

        /**
         * @return cycleScheduleSettings
         */
        public CycleScheduleSettings getCycleScheduleSettings() {
            return this.cycleScheduleSettings;
        }

        /**
         * @return ddlHandlingSettings
         */
        public java.util.List < DdlHandlingSettings> getDdlHandlingSettings() {
            return this.ddlHandlingSettings;
        }

        /**
         * @return runtimeSettings
         */
        public java.util.List < RuntimeSettings> getRuntimeSettings() {
            return this.runtimeSettings;
        }

        public static final class Builder {
            private String channelSettings; 
            private java.util.List < ColumnDataTypeSettings> columnDataTypeSettings; 
            private CycleScheduleSettings cycleScheduleSettings; 
            private java.util.List < DdlHandlingSettings> ddlHandlingSettings; 
            private java.util.List < RuntimeSettings> runtimeSettings; 

            /**
             * ChannelSettings.
             */
            public Builder channelSettings(String channelSettings) {
                this.channelSettings = channelSettings;
                return this;
            }

            /**
             * ColumnDataTypeSettings.
             */
            public Builder columnDataTypeSettings(java.util.List < ColumnDataTypeSettings> columnDataTypeSettings) {
                this.columnDataTypeSettings = columnDataTypeSettings;
                return this;
            }

            /**
             * CycleScheduleSettings.
             */
            public Builder cycleScheduleSettings(CycleScheduleSettings cycleScheduleSettings) {
                this.cycleScheduleSettings = cycleScheduleSettings;
                return this;
            }

            /**
             * DdlHandlingSettings.
             */
            public Builder ddlHandlingSettings(java.util.List < DdlHandlingSettings> ddlHandlingSettings) {
                this.ddlHandlingSettings = ddlHandlingSettings;
                return this;
            }

            /**
             * RuntimeSettings.
             */
            public Builder runtimeSettings(java.util.List < RuntimeSettings> runtimeSettings) {
                this.runtimeSettings = runtimeSettings;
                return this;
            }

            public JobSettings build() {
                return new JobSettings(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateDIJobRequest} extends {@link TeaModel}
     *
     * <p>UpdateDIJobRequest</p>
     */
    public static class OfflineResourceSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RequestedCu")
        private Long requestedCu;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupIdentifier")
        private String resourceGroupIdentifier;

        private OfflineResourceSettings(Builder builder) {
            this.requestedCu = builder.requestedCu;
            this.resourceGroupIdentifier = builder.resourceGroupIdentifier;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OfflineResourceSettings create() {
            return builder().build();
        }

        /**
         * @return requestedCu
         */
        public Long getRequestedCu() {
            return this.requestedCu;
        }

        /**
         * @return resourceGroupIdentifier
         */
        public String getResourceGroupIdentifier() {
            return this.resourceGroupIdentifier;
        }

        public static final class Builder {
            private Long requestedCu; 
            private String resourceGroupIdentifier; 

            /**
             * RequestedCu.
             */
            public Builder requestedCu(Long requestedCu) {
                this.requestedCu = requestedCu;
                return this;
            }

            /**
             * ResourceGroupIdentifier.
             */
            public Builder resourceGroupIdentifier(String resourceGroupIdentifier) {
                this.resourceGroupIdentifier = resourceGroupIdentifier;
                return this;
            }

            public OfflineResourceSettings build() {
                return new OfflineResourceSettings(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateDIJobRequest} extends {@link TeaModel}
     *
     * <p>UpdateDIJobRequest</p>
     */
    public static class RealtimeResourceSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RequestedCu")
        private Long requestedCu;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupIdentifier")
        private String resourceGroupIdentifier;

        private RealtimeResourceSettings(Builder builder) {
            this.requestedCu = builder.requestedCu;
            this.resourceGroupIdentifier = builder.resourceGroupIdentifier;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RealtimeResourceSettings create() {
            return builder().build();
        }

        /**
         * @return requestedCu
         */
        public Long getRequestedCu() {
            return this.requestedCu;
        }

        /**
         * @return resourceGroupIdentifier
         */
        public String getResourceGroupIdentifier() {
            return this.resourceGroupIdentifier;
        }

        public static final class Builder {
            private Long requestedCu; 
            private String resourceGroupIdentifier; 

            /**
             * RequestedCu.
             */
            public Builder requestedCu(Long requestedCu) {
                this.requestedCu = requestedCu;
                return this;
            }

            /**
             * ResourceGroupIdentifier.
             */
            public Builder resourceGroupIdentifier(String resourceGroupIdentifier) {
                this.resourceGroupIdentifier = resourceGroupIdentifier;
                return this;
            }

            public RealtimeResourceSettings build() {
                return new RealtimeResourceSettings(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateDIJobRequest} extends {@link TeaModel}
     *
     * <p>UpdateDIJobRequest</p>
     */
    public static class ScheduleResourceSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RequestedCu")
        private Long requestedCu;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupIdentifier")
        private String resourceGroupIdentifier;

        private ScheduleResourceSettings(Builder builder) {
            this.requestedCu = builder.requestedCu;
            this.resourceGroupIdentifier = builder.resourceGroupIdentifier;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScheduleResourceSettings create() {
            return builder().build();
        }

        /**
         * @return requestedCu
         */
        public Long getRequestedCu() {
            return this.requestedCu;
        }

        /**
         * @return resourceGroupIdentifier
         */
        public String getResourceGroupIdentifier() {
            return this.resourceGroupIdentifier;
        }

        public static final class Builder {
            private Long requestedCu; 
            private String resourceGroupIdentifier; 

            /**
             * RequestedCu.
             */
            public Builder requestedCu(Long requestedCu) {
                this.requestedCu = requestedCu;
                return this;
            }

            /**
             * ResourceGroupIdentifier.
             */
            public Builder resourceGroupIdentifier(String resourceGroupIdentifier) {
                this.resourceGroupIdentifier = resourceGroupIdentifier;
                return this;
            }

            public ScheduleResourceSettings build() {
                return new ScheduleResourceSettings(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateDIJobRequest} extends {@link TeaModel}
     *
     * <p>UpdateDIJobRequest</p>
     */
    public static class ResourceSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OfflineResourceSettings")
        private OfflineResourceSettings offlineResourceSettings;

        @com.aliyun.core.annotation.NameInMap("RealtimeResourceSettings")
        private RealtimeResourceSettings realtimeResourceSettings;

        @com.aliyun.core.annotation.NameInMap("ScheduleResourceSettings")
        private ScheduleResourceSettings scheduleResourceSettings;

        private ResourceSettings(Builder builder) {
            this.offlineResourceSettings = builder.offlineResourceSettings;
            this.realtimeResourceSettings = builder.realtimeResourceSettings;
            this.scheduleResourceSettings = builder.scheduleResourceSettings;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceSettings create() {
            return builder().build();
        }

        /**
         * @return offlineResourceSettings
         */
        public OfflineResourceSettings getOfflineResourceSettings() {
            return this.offlineResourceSettings;
        }

        /**
         * @return realtimeResourceSettings
         */
        public RealtimeResourceSettings getRealtimeResourceSettings() {
            return this.realtimeResourceSettings;
        }

        /**
         * @return scheduleResourceSettings
         */
        public ScheduleResourceSettings getScheduleResourceSettings() {
            return this.scheduleResourceSettings;
        }

        public static final class Builder {
            private OfflineResourceSettings offlineResourceSettings; 
            private RealtimeResourceSettings realtimeResourceSettings; 
            private ScheduleResourceSettings scheduleResourceSettings; 

            /**
             * OfflineResourceSettings.
             */
            public Builder offlineResourceSettings(OfflineResourceSettings offlineResourceSettings) {
                this.offlineResourceSettings = offlineResourceSettings;
                return this;
            }

            /**
             * RealtimeResourceSettings.
             */
            public Builder realtimeResourceSettings(RealtimeResourceSettings realtimeResourceSettings) {
                this.realtimeResourceSettings = realtimeResourceSettings;
                return this;
            }

            /**
             * ScheduleResourceSettings.
             */
            public Builder scheduleResourceSettings(ScheduleResourceSettings scheduleResourceSettings) {
                this.scheduleResourceSettings = scheduleResourceSettings;
                return this;
            }

            public ResourceSettings build() {
                return new ResourceSettings(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateDIJobRequest} extends {@link TeaModel}
     *
     * <p>UpdateDIJobRequest</p>
     */
    public static class SourceObjectSelectionRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("Expression")
        private String expression;

        @com.aliyun.core.annotation.NameInMap("ExpressionType")
        private String expressionType;

        @com.aliyun.core.annotation.NameInMap("ObjectType")
        private String objectType;

        private SourceObjectSelectionRules(Builder builder) {
            this.action = builder.action;
            this.expression = builder.expression;
            this.expressionType = builder.expressionType;
            this.objectType = builder.objectType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceObjectSelectionRules create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return expression
         */
        public String getExpression() {
            return this.expression;
        }

        /**
         * @return expressionType
         */
        public String getExpressionType() {
            return this.expressionType;
        }

        /**
         * @return objectType
         */
        public String getObjectType() {
            return this.objectType;
        }

        public static final class Builder {
            private String action; 
            private String expression; 
            private String expressionType; 
            private String objectType; 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * Expression.
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * ExpressionType.
             */
            public Builder expressionType(String expressionType) {
                this.expressionType = expressionType;
                return this;
            }

            /**
             * ObjectType.
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            public SourceObjectSelectionRules build() {
                return new SourceObjectSelectionRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateDIJobRequest} extends {@link TeaModel}
     *
     * <p>UpdateDIJobRequest</p>
     */
    public static class TableMappingsTransformationRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleActionType")
        private String ruleActionType;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("RuleTargetType")
        private String ruleTargetType;

        private TableMappingsTransformationRules(Builder builder) {
            this.ruleActionType = builder.ruleActionType;
            this.ruleName = builder.ruleName;
            this.ruleTargetType = builder.ruleTargetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableMappingsTransformationRules create() {
            return builder().build();
        }

        /**
         * @return ruleActionType
         */
        public String getRuleActionType() {
            return this.ruleActionType;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return ruleTargetType
         */
        public String getRuleTargetType() {
            return this.ruleTargetType;
        }

        public static final class Builder {
            private String ruleActionType; 
            private String ruleName; 
            private String ruleTargetType; 

            /**
             * RuleActionType.
             */
            public Builder ruleActionType(String ruleActionType) {
                this.ruleActionType = ruleActionType;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * RuleTargetType.
             */
            public Builder ruleTargetType(String ruleTargetType) {
                this.ruleTargetType = ruleTargetType;
                return this;
            }

            public TableMappingsTransformationRules build() {
                return new TableMappingsTransformationRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateDIJobRequest} extends {@link TeaModel}
     *
     * <p>UpdateDIJobRequest</p>
     */
    public static class TableMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SourceObjectSelectionRules")
        private java.util.List < SourceObjectSelectionRules> sourceObjectSelectionRules;

        @com.aliyun.core.annotation.NameInMap("TransformationRules")
        private java.util.List < TableMappingsTransformationRules> transformationRules;

        private TableMappings(Builder builder) {
            this.sourceObjectSelectionRules = builder.sourceObjectSelectionRules;
            this.transformationRules = builder.transformationRules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableMappings create() {
            return builder().build();
        }

        /**
         * @return sourceObjectSelectionRules
         */
        public java.util.List < SourceObjectSelectionRules> getSourceObjectSelectionRules() {
            return this.sourceObjectSelectionRules;
        }

        /**
         * @return transformationRules
         */
        public java.util.List < TableMappingsTransformationRules> getTransformationRules() {
            return this.transformationRules;
        }

        public static final class Builder {
            private java.util.List < SourceObjectSelectionRules> sourceObjectSelectionRules; 
            private java.util.List < TableMappingsTransformationRules> transformationRules; 

            /**
             * SourceObjectSelectionRules.
             */
            public Builder sourceObjectSelectionRules(java.util.List < SourceObjectSelectionRules> sourceObjectSelectionRules) {
                this.sourceObjectSelectionRules = sourceObjectSelectionRules;
                return this;
            }

            /**
             * TransformationRules.
             */
            public Builder transformationRules(java.util.List < TableMappingsTransformationRules> transformationRules) {
                this.transformationRules = transformationRules;
                return this;
            }

            public TableMappings build() {
                return new TableMappings(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateDIJobRequest} extends {@link TeaModel}
     *
     * <p>UpdateDIJobRequest</p>
     */
    public static class TransformationRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleActionType")
        private String ruleActionType;

        @com.aliyun.core.annotation.NameInMap("RuleExpression")
        private String ruleExpression;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("RuleTargetType")
        private String ruleTargetType;

        private TransformationRules(Builder builder) {
            this.ruleActionType = builder.ruleActionType;
            this.ruleExpression = builder.ruleExpression;
            this.ruleName = builder.ruleName;
            this.ruleTargetType = builder.ruleTargetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransformationRules create() {
            return builder().build();
        }

        /**
         * @return ruleActionType
         */
        public String getRuleActionType() {
            return this.ruleActionType;
        }

        /**
         * @return ruleExpression
         */
        public String getRuleExpression() {
            return this.ruleExpression;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return ruleTargetType
         */
        public String getRuleTargetType() {
            return this.ruleTargetType;
        }

        public static final class Builder {
            private String ruleActionType; 
            private String ruleExpression; 
            private String ruleName; 
            private String ruleTargetType; 

            /**
             * RuleActionType.
             */
            public Builder ruleActionType(String ruleActionType) {
                this.ruleActionType = ruleActionType;
                return this;
            }

            /**
             * RuleExpression.
             */
            public Builder ruleExpression(String ruleExpression) {
                this.ruleExpression = ruleExpression;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * RuleTargetType.
             */
            public Builder ruleTargetType(String ruleTargetType) {
                this.ruleTargetType = ruleTargetType;
                return this;
            }

            public TransformationRules build() {
                return new TransformationRules(this);
            } 

        } 

    }
}
