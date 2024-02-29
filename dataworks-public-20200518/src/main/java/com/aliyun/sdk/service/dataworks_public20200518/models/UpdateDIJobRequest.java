// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDIJobRequest} extends {@link RequestModel}
 *
 * <p>UpdateDIJobRequest</p>
 */
public class UpdateDIJobRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("DIJobId")
    private Long DIJobId;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("JobSettings")
    private JobSettings jobSettings;

    @Body
    @NameInMap("ResourceSettings")
    private ResourceSettings resourceSettings;

    @Body
    @NameInMap("TableMappings")
    private java.util.List < TableMappings> tableMappings;

    @Body
    @NameInMap("TransformationRules")
    private java.util.List < TransformationRules> transformationRules;

    private UpdateDIJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.DIJobId = builder.DIJobId;
        this.description = builder.description;
        this.jobSettings = builder.jobSettings;
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
         * DIJobId.
         */
        public Builder DIJobId(Long DIJobId) {
            this.putBodyParameter("DIJobId", DIJobId);
            this.DIJobId = DIJobId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * JobSettings.
         */
        public Builder jobSettings(JobSettings jobSettings) {
            String jobSettingsShrink = shrink(jobSettings, "JobSettings", "json");
            this.putBodyParameter("JobSettings", jobSettingsShrink);
            this.jobSettings = jobSettings;
            return this;
        }

        /**
         * ResourceSettings.
         */
        public Builder resourceSettings(ResourceSettings resourceSettings) {
            String resourceSettingsShrink = shrink(resourceSettings, "ResourceSettings", "json");
            this.putBodyParameter("ResourceSettings", resourceSettingsShrink);
            this.resourceSettings = resourceSettings;
            return this;
        }

        /**
         * TableMappings.
         */
        public Builder tableMappings(java.util.List < TableMappings> tableMappings) {
            String tableMappingsShrink = shrink(tableMappings, "TableMappings", "json");
            this.putBodyParameter("TableMappings", tableMappingsShrink);
            this.tableMappings = tableMappings;
            return this;
        }

        /**
         * TransformationRules.
         */
        public Builder transformationRules(java.util.List < TransformationRules> transformationRules) {
            String transformationRulesShrink = shrink(transformationRules, "TransformationRules", "json");
            this.putBodyParameter("TransformationRules", transformationRulesShrink);
            this.transformationRules = transformationRules;
            return this;
        }

        @Override
        public UpdateDIJobRequest build() {
            return new UpdateDIJobRequest(this);
        } 

    } 

    public static class ColumnDataTypeSettings extends TeaModel {
        @NameInMap("DestinationDataType")
        private String destinationDataType;

        @NameInMap("SourceDataType")
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
    public static class CycleScheduleSettings extends TeaModel {
        @NameInMap("ScheduleParameters")
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
    public static class DdlHandlingSettings extends TeaModel {
        @NameInMap("Action")
        private String action;

        @NameInMap("Type")
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
    public static class RuntimeSettings extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
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
    public static class JobSettings extends TeaModel {
        @NameInMap("ChannelSettings")
        private String channelSettings;

        @NameInMap("ColumnDataTypeSettings")
        private java.util.List < ColumnDataTypeSettings> columnDataTypeSettings;

        @NameInMap("CycleScheduleSettings")
        private CycleScheduleSettings cycleScheduleSettings;

        @NameInMap("DdlHandlingSettings")
        private java.util.List < DdlHandlingSettings> ddlHandlingSettings;

        @NameInMap("RuntimeSettings")
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
    public static class OfflineResourceSettings extends TeaModel {
        @NameInMap("ResourceGroupIdentifier")
        private String resourceGroupIdentifier;

        private OfflineResourceSettings(Builder builder) {
            this.resourceGroupIdentifier = builder.resourceGroupIdentifier;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OfflineResourceSettings create() {
            return builder().build();
        }

        /**
         * @return resourceGroupIdentifier
         */
        public String getResourceGroupIdentifier() {
            return this.resourceGroupIdentifier;
        }

        public static final class Builder {
            private String resourceGroupIdentifier; 

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
    public static class RealtimeResourceSettings extends TeaModel {
        @NameInMap("ResourceGroupIdentifier")
        private String resourceGroupIdentifier;

        private RealtimeResourceSettings(Builder builder) {
            this.resourceGroupIdentifier = builder.resourceGroupIdentifier;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RealtimeResourceSettings create() {
            return builder().build();
        }

        /**
         * @return resourceGroupIdentifier
         */
        public String getResourceGroupIdentifier() {
            return this.resourceGroupIdentifier;
        }

        public static final class Builder {
            private String resourceGroupIdentifier; 

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
    public static class ResourceSettings extends TeaModel {
        @NameInMap("OfflineResourceSettings")
        private OfflineResourceSettings offlineResourceSettings;

        @NameInMap("RealtimeResourceSettings")
        private RealtimeResourceSettings realtimeResourceSettings;

        private ResourceSettings(Builder builder) {
            this.offlineResourceSettings = builder.offlineResourceSettings;
            this.realtimeResourceSettings = builder.realtimeResourceSettings;
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

        public static final class Builder {
            private OfflineResourceSettings offlineResourceSettings; 
            private RealtimeResourceSettings realtimeResourceSettings; 

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

            public ResourceSettings build() {
                return new ResourceSettings(this);
            } 

        } 

    }
    public static class SourceObjectSelectionRules extends TeaModel {
        @NameInMap("Expression")
        private String expression;

        @NameInMap("ObjectType")
        private String objectType;

        private SourceObjectSelectionRules(Builder builder) {
            this.expression = builder.expression;
            this.objectType = builder.objectType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceObjectSelectionRules create() {
            return builder().build();
        }

        /**
         * @return expression
         */
        public String getExpression() {
            return this.expression;
        }

        /**
         * @return objectType
         */
        public String getObjectType() {
            return this.objectType;
        }

        public static final class Builder {
            private String expression; 
            private String objectType; 

            /**
             * Expression.
             */
            public Builder expression(String expression) {
                this.expression = expression;
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
    public static class TableMappingsTransformationRules extends TeaModel {
        @NameInMap("RuleActionType")
        private String ruleActionType;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("RuleTargetType")
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
    public static class TableMappings extends TeaModel {
        @NameInMap("SourceObjectSelectionRules")
        private java.util.List < SourceObjectSelectionRules> sourceObjectSelectionRules;

        @NameInMap("TransformationRules")
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
    public static class TransformationRules extends TeaModel {
        @NameInMap("RuleActionType")
        private String ruleActionType;

        @NameInMap("RuleExpression")
        private String ruleExpression;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("RuleTargetType")
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
