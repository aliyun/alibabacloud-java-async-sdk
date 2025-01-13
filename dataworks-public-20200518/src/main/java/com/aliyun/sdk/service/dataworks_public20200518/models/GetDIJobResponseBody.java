// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link GetDIJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetDIJobResponseBody</p>
 */
public class GetDIJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDIJobResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDIJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * <p>The information about the synchronization task.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0000-ABCD-EFG****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDIJobResponseBody build() {
            return new GetDIJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDIJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetDIJobResponseBody</p>
     */
    public static class DestinationDataSourceSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSourceName")
        private String dataSourceName;

        @com.aliyun.core.annotation.NameInMap("DataSourceProperties")
        private java.util.Map<String, String> dataSourceProperties;

        private DestinationDataSourceSettings(Builder builder) {
            this.dataSourceName = builder.dataSourceName;
            this.dataSourceProperties = builder.dataSourceProperties;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DestinationDataSourceSettings create() {
            return builder().build();
        }

        /**
         * @return dataSourceName
         */
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        /**
         * @return dataSourceProperties
         */
        public java.util.Map<String, String> getDataSourceProperties() {
            return this.dataSourceProperties;
        }

        public static final class Builder {
            private String dataSourceName; 
            private java.util.Map<String, String> dataSourceProperties; 

            /**
             * <p>The name of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>holo_datasource_1</p>
             */
            public Builder dataSourceName(String dataSourceName) {
                this.dataSourceName = dataSourceName;
                return this;
            }

            /**
             * <p>The properties of the data source.</p>
             */
            public Builder dataSourceProperties(java.util.Map<String, String> dataSourceProperties) {
                this.dataSourceProperties = dataSourceProperties;
                return this;
            }

            public DestinationDataSourceSettings build() {
                return new DestinationDataSourceSettings(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDIJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetDIJobResponseBody</p>
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
             * <p>The data type of a destination field.</p>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder destinationDataType(String destinationDataType) {
                this.destinationDataType = destinationDataType;
                return this;
            }

            /**
             * <p>The data type of a source field.</p>
             * 
             * <strong>example:</strong>
             * <p>bigint</p>
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
     * {@link GetDIJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetDIJobResponseBody</p>
     */
    public static class CycleScheduleSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CycleMigrationType")
        private String cycleMigrationType;

        @com.aliyun.core.annotation.NameInMap("ScheduleParameters")
        private String scheduleParameters;

        private CycleScheduleSettings(Builder builder) {
            this.cycleMigrationType = builder.cycleMigrationType;
            this.scheduleParameters = builder.scheduleParameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CycleScheduleSettings create() {
            return builder().build();
        }

        /**
         * @return cycleMigrationType
         */
        public String getCycleMigrationType() {
            return this.cycleMigrationType;
        }

        /**
         * @return scheduleParameters
         */
        public String getScheduleParameters() {
            return this.scheduleParameters;
        }

        public static final class Builder {
            private String cycleMigrationType; 
            private String scheduleParameters; 

            /**
             * CycleMigrationType.
             */
            public Builder cycleMigrationType(String cycleMigrationType) {
                this.cycleMigrationType = cycleMigrationType;
                return this;
            }

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
     * {@link GetDIJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetDIJobResponseBody</p>
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
             * <p>The processing policy for DDL messages. Valid values:</p>
             * <ul>
             * <li>Ignore: ignores a DDL message.</li>
             * <li>Critical: reports an error for a DDL message.</li>
             * <li>Normal: normally processes a DDL message.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Critical</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The type of the DDL operation. Valid values:</p>
             * <ul>
             * <li>RenameColumn</li>
             * <li>ModifyColumn</li>
             * <li>CreateTable</li>
             * <li>TruncateTable</li>
             * <li>DropTable</li>
             * <li>DropColumn</li>
             * <li>AddColumn</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AddColumn</p>
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
     * {@link GetDIJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetDIJobResponseBody</p>
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
             * <p>The name of the configuration item. Valid values:</p>
             * <ul>
             * <li>runtime.offline.speed.limit.mb: indicates the maximum transmission rate that is allowed for a batch synchronization task. This configuration item takes effect only when runtime.offline.speed.limit.enable is set to true.</li>
             * <li>runtime.offline.speed.limit.enable: indicates whether throttling is enabled for a batch synchronization task.</li>
             * <li>dst.offline.connection.max: indicates the maximum number of connections that are allowed for writing data to the destination of a batch synchronization task.</li>
             * <li>runtime.offline.concurrent: indicates the maximum number of parallel threads that are allowed for a batch synchronization task.</li>
             * <li>dst.realtime.connection.max: indicates the maximum number of connections that are allowed for writing data to the destination of a real-time synchronization task.</li>
             * <li>runtime.enable.auto.create.schema: indicates whether schemas are automatically created in the destination of a synchronization task.</li>
             * <li>src.offline.datasource.max.connection: indicates the maximum number of connections that are allowed for reading data from the source of a batch synchronization task.</li>
             * <li>runtime.realtime.concurrent: indicates the maximum number of parallel threads that are allowed for a real-time synchronization task.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>runtime.offline.concurrent</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value of the configuration item.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
     * {@link GetDIJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetDIJobResponseBody</p>
     */
    public static class JobSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelSettings")
        private String channelSettings;

        @com.aliyun.core.annotation.NameInMap("ColumnDataTypeSettings")
        private java.util.List<ColumnDataTypeSettings> columnDataTypeSettings;

        @com.aliyun.core.annotation.NameInMap("CycleScheduleSettings")
        private CycleScheduleSettings cycleScheduleSettings;

        @com.aliyun.core.annotation.NameInMap("DdlHandlingSettings")
        private java.util.List<DdlHandlingSettings> ddlHandlingSettings;

        @com.aliyun.core.annotation.NameInMap("RuntimeSettings")
        private java.util.List<RuntimeSettings> runtimeSettings;

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
        public java.util.List<ColumnDataTypeSettings> getColumnDataTypeSettings() {
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
        public java.util.List<DdlHandlingSettings> getDdlHandlingSettings() {
            return this.ddlHandlingSettings;
        }

        /**
         * @return runtimeSettings
         */
        public java.util.List<RuntimeSettings> getRuntimeSettings() {
            return this.runtimeSettings;
        }

        public static final class Builder {
            private String channelSettings; 
            private java.util.List<ColumnDataTypeSettings> columnDataTypeSettings; 
            private CycleScheduleSettings cycleScheduleSettings; 
            private java.util.List<DdlHandlingSettings> ddlHandlingSettings; 
            private java.util.List<RuntimeSettings> runtimeSettings; 

            /**
             * ChannelSettings.
             */
            public Builder channelSettings(String channelSettings) {
                this.channelSettings = channelSettings;
                return this;
            }

            /**
             * <p>The settings for data type mappings between source fields and destination fields. The value of this parameter is an array.</p>
             */
            public Builder columnDataTypeSettings(java.util.List<ColumnDataTypeSettings> columnDataTypeSettings) {
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
             * <p>The settings for processing DDL messages. The value of this parameter is an array.</p>
             */
            public Builder ddlHandlingSettings(java.util.List<DdlHandlingSettings> ddlHandlingSettings) {
                this.ddlHandlingSettings = ddlHandlingSettings;
                return this;
            }

            /**
             * <p>The runtime settings. The value of this parameter is an array.</p>
             */
            public Builder runtimeSettings(java.util.List<RuntimeSettings> runtimeSettings) {
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
     * {@link GetDIJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetDIJobResponseBody</p>
     */
    public static class OfflineResourceSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceGroupIdentifier")
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
             * <p>The identifier of the resource group for Data Integration used for batch synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>S_res_group_111_222</p>
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
     * {@link GetDIJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetDIJobResponseBody</p>
     */
    public static class RealtimeResourceSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceGroupIdentifier")
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
             * <p>The identifier of the resource group for Data Integration used for real-time synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>S_res_group_111_222</p>
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
     * {@link GetDIJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetDIJobResponseBody</p>
     */
    public static class ResourceSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OfflineResourceSettings")
        private OfflineResourceSettings offlineResourceSettings;

        @com.aliyun.core.annotation.NameInMap("RealtimeResourceSettings")
        private RealtimeResourceSettings realtimeResourceSettings;

        @com.aliyun.core.annotation.NameInMap("RequestedCu")
        private Float requestedCu;

        private ResourceSettings(Builder builder) {
            this.offlineResourceSettings = builder.offlineResourceSettings;
            this.realtimeResourceSettings = builder.realtimeResourceSettings;
            this.requestedCu = builder.requestedCu;
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
         * @return requestedCu
         */
        public Float getRequestedCu() {
            return this.requestedCu;
        }

        public static final class Builder {
            private OfflineResourceSettings offlineResourceSettings; 
            private RealtimeResourceSettings realtimeResourceSettings; 
            private Float requestedCu; 

            /**
             * <p>The resource used for batch synchronization.</p>
             */
            public Builder offlineResourceSettings(OfflineResourceSettings offlineResourceSettings) {
                this.offlineResourceSettings = offlineResourceSettings;
                return this;
            }

            /**
             * <p>The resource used for real-time synchronization.</p>
             */
            public Builder realtimeResourceSettings(RealtimeResourceSettings realtimeResourceSettings) {
                this.realtimeResourceSettings = realtimeResourceSettings;
                return this;
            }

            /**
             * RequestedCu.
             */
            public Builder requestedCu(Float requestedCu) {
                this.requestedCu = requestedCu;
                return this;
            }

            public ResourceSettings build() {
                return new ResourceSettings(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDIJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetDIJobResponseBody</p>
     */
    public static class SourceDataSourceSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSourceName")
        private String dataSourceName;

        @com.aliyun.core.annotation.NameInMap("DataSourceProperties")
        private java.util.Map<String, String> dataSourceProperties;

        private SourceDataSourceSettings(Builder builder) {
            this.dataSourceName = builder.dataSourceName;
            this.dataSourceProperties = builder.dataSourceProperties;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceDataSourceSettings create() {
            return builder().build();
        }

        /**
         * @return dataSourceName
         */
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        /**
         * @return dataSourceProperties
         */
        public java.util.Map<String, String> getDataSourceProperties() {
            return this.dataSourceProperties;
        }

        public static final class Builder {
            private String dataSourceName; 
            private java.util.Map<String, String> dataSourceProperties; 

            /**
             * <p>The name of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql_datasource_1</p>
             */
            public Builder dataSourceName(String dataSourceName) {
                this.dataSourceName = dataSourceName;
                return this;
            }

            /**
             * <p>The properties of the data source.</p>
             */
            public Builder dataSourceProperties(java.util.Map<String, String> dataSourceProperties) {
                this.dataSourceProperties = dataSourceProperties;
                return this;
            }

            public SourceDataSourceSettings build() {
                return new SourceDataSourceSettings(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDIJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetDIJobResponseBody</p>
     */
    public static class SourceObjectSelectionRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Expression")
        private String expression;

        @com.aliyun.core.annotation.NameInMap("ObjectType")
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
             * <p>The expression.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql_table_1</p>
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * <p>The type of the object. Valid values:</p>
             * <ul>
             * <li>Table</li>
             * <li>Database</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Table</p>
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
     * {@link GetDIJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetDIJobResponseBody</p>
     */
    public static class TransformationRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleActionType")
        private String ruleActionType;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("RuleTargetType")
        private String ruleTargetType;

        private TransformationRules(Builder builder) {
            this.ruleActionType = builder.ruleActionType;
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
             * <p>The type of the action. Valid values:</p>
             * <ul>
             * <li>DefinePrimaryKey</li>
             * <li>Rename</li>
             * <li>AddColumn</li>
             * <li>HandleDml</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Rename</p>
             */
            public Builder ruleActionType(String ruleActionType) {
                this.ruleActionType = ruleActionType;
                return this;
            }

            /**
             * <p>The name of the rule. If the values of the RuleActionType parameter and the RuleTargetType parameter are the same for multiple transformation rules, you must make sure that the transformation rule names are unique.</p>
             * 
             * <strong>example:</strong>
             * <p>rename_rule_1</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The type of the object on which the action is performed. Valid values:</p>
             * <ul>
             * <li>Table</li>
             * <li>Schema</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Table</p>
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
    /**
     * 
     * {@link GetDIJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetDIJobResponseBody</p>
     */
    public static class TableMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SourceObjectSelectionRules")
        private java.util.List<SourceObjectSelectionRules> sourceObjectSelectionRules;

        @com.aliyun.core.annotation.NameInMap("TransformationRules")
        private java.util.List<TransformationRules> transformationRules;

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
        public java.util.List<SourceObjectSelectionRules> getSourceObjectSelectionRules() {
            return this.sourceObjectSelectionRules;
        }

        /**
         * @return transformationRules
         */
        public java.util.List<TransformationRules> getTransformationRules() {
            return this.transformationRules;
        }

        public static final class Builder {
            private java.util.List<SourceObjectSelectionRules> sourceObjectSelectionRules; 
            private java.util.List<TransformationRules> transformationRules; 

            /**
             * <p>The rule used to select synchronization objects in the source. Multiple rules may be returned.</p>
             */
            public Builder sourceObjectSelectionRules(java.util.List<SourceObjectSelectionRules> sourceObjectSelectionRules) {
                this.sourceObjectSelectionRules = sourceObjectSelectionRules;
                return this;
            }

            /**
             * <p>The transformation rules that are applied to the selected synchronization objects.</p>
             */
            public Builder transformationRules(java.util.List<TransformationRules> transformationRules) {
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
     * {@link GetDIJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetDIJobResponseBody</p>
     */
    public static class DataTransformationRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleActionType")
        private String ruleActionType;

        @com.aliyun.core.annotation.NameInMap("RuleExpression")
        private String ruleExpression;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("RuleTargetType")
        private String ruleTargetType;

        private DataTransformationRules(Builder builder) {
            this.ruleActionType = builder.ruleActionType;
            this.ruleExpression = builder.ruleExpression;
            this.ruleName = builder.ruleName;
            this.ruleTargetType = builder.ruleTargetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataTransformationRules create() {
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
             * <p>The type of the action. Valid values:</p>
             * <ul>
             * <li>DefinePrimaryKey</li>
             * <li>Rename</li>
             * <li>AddColumn</li>
             * <li>HandleDml</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Rename</p>
             */
            public Builder ruleActionType(String ruleActionType) {
                this.ruleActionType = ruleActionType;
                return this;
            }

            /**
             * <p>The expression of the rule. The expression is a JSON string.</p>
             * <p>Example of a renaming rule: {&quot;expression&quot;:&quot;${srcDatasourceName}_${srcDatabaseName}_0922&quot;,&quot;variables&quot;:[{&quot;variableName&quot;:&quot;srcDatabaseName&quot;,&quot;variableRules&quot;:[{&quot;from&quot;:&quot;fromdb&quot;,&quot;to&quot;:&quot;todb&quot;}]}]}</p>
             * <p>expression: the expression of the renaming rule. The expression may contain the following variables: ${srcDatasourceName}, ${srcDatabaseName}, and ${srcTableName}. ${srcDatasourceName} indicates the name of the source. ${srcDatabaseName} indicates the name of a source database. ${srcTableName} indicates the name of a source table. variables: the generation rule for a variable used in the expression of the renaming rule. The default value of the specified variable is the original value of the object indicated by the variable. A group of string replacement rules used to change the original values may be returned. variableName: the name of the variable. The variable name is not enclosed in ${}. variableRules: the string replacement rules for variables. The system runs the string replacement rules in sequence for string replacement. from indicates the original string. to indicates the new string. Example of a rule used to add a specific field to the destination and assign a value to the field: {&quot;columns&quot;:[{&quot;columnName&quot;:&quot;my_add_column&quot;,&quot;columnValueType&quot;:&quot;Constant&quot;,&quot;columnValue&quot;:&quot;123&quot;}]}</p>
             * <p>If no rule of this type is configured, no fields are added to the destination and no values are assigned by default. columnName: the name of the field that is added. columnValueType: the value type of the field. Valid values: Constant and Variable. columnValue: the value of the field that is added. If the valueType parameter is set to Constant, the value of the columnValue parameter must be a constant of the STRING type. If the valueType parameter is set to Variable, the value of the columnValue parameter must be a built-in variable. The following built-in variables are supported: EXECUTE_TIME (LONG data type), DB_NAME_SRC (STRING data type), DATASOURCE_NAME_SRC (STRING data type), TABLE_NAME_SRC (STRING data type), DB_NAME_DEST (STRING data type), DATASOURCE_NAME_DEST (STRING data type), TABLE_NAME_DEST (STRING data type), and DB_NAME_SRC_TRANSED (STRING data type). EXECUTE_TIME indicates the execution time. DB_NAME_SRC indicates the name of a source database. DATASOURCE_NAME_SRC indicates the name of the source. TABLE_NAME_SRC indicates the name of a source table. DB_NAME_DEST indicates the name of a destination database. DATASOURCE_NAME_DEST indicates the name of the destination. TABLE_NAME_DEST indicates the name of a destination table. DB_NAME_SRC_TRANSED indicates the database name obtained after a transformation. Example of a rule used to specify primary key fields for a destination table: {&quot;columns&quot;:[&quot;ukcolumn1&quot;,&quot;ukcolumn2&quot;]}</p>
             * <p>If no rule of this type is configured, the primary key fields in the mapped source table are used for the destination table by default. If the destination table is an existing table, Data Integration does not modify the schema of the destination table. If the specified primary key fields do not exist in the destination table, an error is reported when the synchronization task starts to run. If the destination table is automatically created by the system, Data Integration automatically creates the schema of the destination table. The schema contains the primary key fields that you specify. If the specified primary key fields do not exist in the destination table, an error is reported when the synchronization task starts to run. Example of a rule used to process DML messages: {&quot;dmlPolicies&quot;:[{&quot;dmlType&quot;:&quot;Delete&quot;,&quot;dmlAction&quot;:&quot;Filter&quot;,&quot;filterCondition&quot;:&quot;id &gt; 1&quot;}]}</p>
             * <p>If no rule of this type is configured, the default processing policy for messages generated for insert, update, and delete operations is Normal. dmlType: the DML operation. Valid values: Insert, Update, and Delete. dmlAction: the processing policy for DML messages. Valid values: Normal, Ignore, Filter, and LogicalDelete. Filter indicates conditional processing. The value Filter is returned for the dmlAction parameter only when the dmlType parameter is set to Update or Delete. filterCondition: the condition used to filter DML messages. This parameter is returned only when the dmlAction parameter is set to Filter.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;expression&quot;:&quot;${srcDatasoureName}_${srcDatabaseName}&quot;}</p>
             */
            public Builder ruleExpression(String ruleExpression) {
                this.ruleExpression = ruleExpression;
                return this;
            }

            /**
             * <p>The name of the rule. If the values of the RuleActionType parameter and the RuleTargetType parameter are the same for multiple transformation rules, you must make sure that the transformation rule names are unique.</p>
             * 
             * <strong>example:</strong>
             * <p>rename_rule_1</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The type of the object on which the action is performed. Valid values:</p>
             * <ul>
             * <li>Table</li>
             * <li>Schema</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Table</p>
             */
            public Builder ruleTargetType(String ruleTargetType) {
                this.ruleTargetType = ruleTargetType;
                return this;
            }

            public DataTransformationRules build() {
                return new DataTransformationRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDIJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetDIJobResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private Long createdTime;

        @com.aliyun.core.annotation.NameInMap("CreatedUid")
        private String createdUid;

        @com.aliyun.core.annotation.NameInMap("DIJobId")
        private Long DIJobId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DestinationDataSourceSettings")
        private java.util.List<DestinationDataSourceSettings> destinationDataSourceSettings;

        @com.aliyun.core.annotation.NameInMap("DestinationDataSourceType")
        private String destinationDataSourceType;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("JobName")
        private String jobName;

        @com.aliyun.core.annotation.NameInMap("JobSettings")
        private JobSettings jobSettings;

        @com.aliyun.core.annotation.NameInMap("JobStatus")
        private String jobStatus;

        @com.aliyun.core.annotation.NameInMap("MigrationType")
        private String migrationType;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("ResourceSettings")
        private ResourceSettings resourceSettings;

        @com.aliyun.core.annotation.NameInMap("RunStats")
        private java.util.Map<String, String> runStats;

        @com.aliyun.core.annotation.NameInMap("SourceDataSourceSettings")
        private java.util.List<SourceDataSourceSettings> sourceDataSourceSettings;

        @com.aliyun.core.annotation.NameInMap("SourceDataSourceType")
        private String sourceDataSourceType;

        @com.aliyun.core.annotation.NameInMap("StartedTime")
        private Long startedTime;

        @com.aliyun.core.annotation.NameInMap("StartedUid")
        private String startedUid;

        @com.aliyun.core.annotation.NameInMap("TableMappings")
        private java.util.List<TableMappings> tableMappings;

        @com.aliyun.core.annotation.NameInMap("TransformationRules")
        private java.util.List<DataTransformationRules> transformationRules;

        @com.aliyun.core.annotation.NameInMap("UpdatedTime")
        private Long updatedTime;

        @com.aliyun.core.annotation.NameInMap("UpdatedUid")
        private String updatedUid;

        private Data(Builder builder) {
            this.createdTime = builder.createdTime;
            this.createdUid = builder.createdUid;
            this.DIJobId = builder.DIJobId;
            this.description = builder.description;
            this.destinationDataSourceSettings = builder.destinationDataSourceSettings;
            this.destinationDataSourceType = builder.destinationDataSourceType;
            this.errorMessage = builder.errorMessage;
            this.jobName = builder.jobName;
            this.jobSettings = builder.jobSettings;
            this.jobStatus = builder.jobStatus;
            this.migrationType = builder.migrationType;
            this.projectId = builder.projectId;
            this.resourceSettings = builder.resourceSettings;
            this.runStats = builder.runStats;
            this.sourceDataSourceSettings = builder.sourceDataSourceSettings;
            this.sourceDataSourceType = builder.sourceDataSourceType;
            this.startedTime = builder.startedTime;
            this.startedUid = builder.startedUid;
            this.tableMappings = builder.tableMappings;
            this.transformationRules = builder.transformationRules;
            this.updatedTime = builder.updatedTime;
            this.updatedUid = builder.updatedUid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createdTime
         */
        public Long getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return createdUid
         */
        public String getCreatedUid() {
            return this.createdUid;
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
         * @return destinationDataSourceSettings
         */
        public java.util.List<DestinationDataSourceSettings> getDestinationDataSourceSettings() {
            return this.destinationDataSourceSettings;
        }

        /**
         * @return destinationDataSourceType
         */
        public String getDestinationDataSourceType() {
            return this.destinationDataSourceType;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return jobName
         */
        public String getJobName() {
            return this.jobName;
        }

        /**
         * @return jobSettings
         */
        public JobSettings getJobSettings() {
            return this.jobSettings;
        }

        /**
         * @return jobStatus
         */
        public String getJobStatus() {
            return this.jobStatus;
        }

        /**
         * @return migrationType
         */
        public String getMigrationType() {
            return this.migrationType;
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
         * @return runStats
         */
        public java.util.Map<String, String> getRunStats() {
            return this.runStats;
        }

        /**
         * @return sourceDataSourceSettings
         */
        public java.util.List<SourceDataSourceSettings> getSourceDataSourceSettings() {
            return this.sourceDataSourceSettings;
        }

        /**
         * @return sourceDataSourceType
         */
        public String getSourceDataSourceType() {
            return this.sourceDataSourceType;
        }

        /**
         * @return startedTime
         */
        public Long getStartedTime() {
            return this.startedTime;
        }

        /**
         * @return startedUid
         */
        public String getStartedUid() {
            return this.startedUid;
        }

        /**
         * @return tableMappings
         */
        public java.util.List<TableMappings> getTableMappings() {
            return this.tableMappings;
        }

        /**
         * @return transformationRules
         */
        public java.util.List<DataTransformationRules> getTransformationRules() {
            return this.transformationRules;
        }

        /**
         * @return updatedTime
         */
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        /**
         * @return updatedUid
         */
        public String getUpdatedUid() {
            return this.updatedUid;
        }

        public static final class Builder {
            private Long createdTime; 
            private String createdUid; 
            private Long DIJobId; 
            private String description; 
            private java.util.List<DestinationDataSourceSettings> destinationDataSourceSettings; 
            private String destinationDataSourceType; 
            private String errorMessage; 
            private String jobName; 
            private JobSettings jobSettings; 
            private String jobStatus; 
            private String migrationType; 
            private Long projectId; 
            private ResourceSettings resourceSettings; 
            private java.util.Map<String, String> runStats; 
            private java.util.List<SourceDataSourceSettings> sourceDataSourceSettings; 
            private String sourceDataSourceType; 
            private Long startedTime; 
            private String startedUid; 
            private java.util.List<TableMappings> tableMappings; 
            private java.util.List<DataTransformationRules> transformationRules; 
            private Long updatedTime; 
            private String updatedUid; 

            /**
             * <p>The timestamp when the synchronization task was created. The timestamp is accurate to the second.</p>
             * 
             * <strong>example:</strong>
             * <p>1671516776</p>
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The ID of the user who creates the synchronization task.</p>
             * 
             * <strong>example:</strong>
             * <p>100000001</p>
             */
            public Builder createdUid(String createdUid) {
                this.createdUid = createdUid;
                return this;
            }

            /**
             * <p>The ID of the synchronization task.</p>
             * 
             * <strong>example:</strong>
             * <p>11588</p>
             */
            public Builder DIJobId(Long DIJobId) {
                this.DIJobId = DIJobId;
                return this;
            }

            /**
             * <p>The description of the synchronization task.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The settings of the destination. Only a single destination is supported.</p>
             */
            public Builder destinationDataSourceSettings(java.util.List<DestinationDataSourceSettings> destinationDataSourceSettings) {
                this.destinationDataSourceSettings = destinationDataSourceSettings;
                return this;
            }

            /**
             * <p>The type of the destination. The value Hologres is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>Hologres</p>
             */
            public Builder destinationDataSourceType(String destinationDataSourceType) {
                this.destinationDataSourceType = destinationDataSourceType;
                return this;
            }

            /**
             * <p>The error message returned if the value of the JobStatus parameter is Failed.</p>
             * 
             * <strong>example:</strong>
             * <p>error details xxx</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The name of the synchronization task.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql_to_holo_sync_445</p>
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * <p>The settings for the dimension of the synchronization task. The settings include processing policies for DDL messages, policies for data type mappings between source fields and destination fields, and runtime parameters of the synchronization task.</p>
             */
            public Builder jobSettings(JobSettings jobSettings) {
                this.jobSettings = jobSettings;
                return this;
            }

            /**
             * <p>The task status. Valid values:</p>
             * <ul>
             * <li>Finished</li>
             * <li>Initialized</li>
             * <li>Stopped</li>
             * <li>Failed</li>
             * <li>Running</li>
             * <li>Stopping</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder jobStatus(String jobStatus) {
                this.jobStatus = jobStatus;
                return this;
            }

            /**
             * <p>The synchronization type. Valid values:</p>
             * <ul>
             * <li>FullAndRealtimeIncremental: one-time full synchronization and real-time incremental synchronization</li>
             * <li>RealtimeIncremental: real-time incremental synchronization</li>
             * <li>Full: one-time full synchronization</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FullAndRealtimeIncremental</p>
             */
            public Builder migrationType(String migrationType) {
                this.migrationType = migrationType;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The resource settings.</p>
             */
            public Builder resourceSettings(ResourceSettings resourceSettings) {
                this.resourceSettings = resourceSettings;
                return this;
            }

            /**
             * <p>The information about the running of the synchronization task.</p>
             */
            public Builder runStats(java.util.Map<String, String> runStats) {
                this.runStats = runStats;
                return this;
            }

            /**
             * <p>The settings of the source. Only a single source is supported.</p>
             */
            public Builder sourceDataSourceSettings(java.util.List<SourceDataSourceSettings> sourceDataSourceSettings) {
                this.sourceDataSourceSettings = sourceDataSourceSettings;
                return this;
            }

            /**
             * <p>The type of the source. The value MySQL is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder sourceDataSourceType(String sourceDataSourceType) {
                this.sourceDataSourceType = sourceDataSourceType;
                return this;
            }

            /**
             * <p>The timestamp when the synchronization task was last started. The timestamp is accurate to the second.</p>
             * 
             * <strong>example:</strong>
             * <p>1673859999</p>
             */
            public Builder startedTime(Long startedTime) {
                this.startedTime = startedTime;
                return this;
            }

            /**
             * <p>The ID of the user who last starts the synchronization task.</p>
             * 
             * <strong>example:</strong>
             * <p>100000001</p>
             */
            public Builder startedUid(String startedUid) {
                this.startedUid = startedUid;
                return this;
            }

            /**
             * <p>The list of mappings between rules used to select synchronization objects in the source and transformation rules applied to the selected synchronization objects. Each entry in the list displays a mapping between a rule used to select synchronization objects and a transformation rule applied to the selected synchronization objects.</p>
             */
            public Builder tableMappings(java.util.List<TableMappings> tableMappings) {
                this.tableMappings = tableMappings;
                return this;
            }

            /**
             * <p>The list of transformation rules for objects involved in the synchronization task. Each entry in the list defines a transformation rule.</p>
             */
            public Builder transformationRules(java.util.List<DataTransformationRules> transformationRules) {
                this.transformationRules = transformationRules;
                return this;
            }

            /**
             * <p>The timestamp when the synchronization task was last modified. The timestamp is accurate to the second.</p>
             * 
             * <strong>example:</strong>
             * <p>1673859985</p>
             */
            public Builder updatedTime(Long updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            /**
             * <p>The ID of the user who last modifies the synchronization task.</p>
             * 
             * <strong>example:</strong>
             * <p>100000001</p>
             */
            public Builder updatedUid(String updatedUid) {
                this.updatedUid = updatedUid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
