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
 * {@link CreateDIJobRequest} extends {@link RequestModel}
 *
 * <p>CreateDIJobRequest</p>
 */
public class CreateDIJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationDataSourceSettings")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<DestinationDataSourceSettings> destinationDataSourceSettings;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationDataSourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destinationDataSourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobName")
    @Deprecated
    private String jobName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobSettings")
    private JobSettings jobSettings;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobType")
    private String jobType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MigrationType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String migrationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceSettings")
    @com.aliyun.core.annotation.Validation(required = true)
    private ResourceSettings resourceSettings;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceDataSourceSettings")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<SourceDataSourceSettings> sourceDataSourceSettings;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceDataSourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceDataSourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableMappings")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<TableMappings> tableMappings;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransformationRules")
    private java.util.List<TransformationRules> transformationRules;

    private CreateDIJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.destinationDataSourceSettings = builder.destinationDataSourceSettings;
        this.destinationDataSourceType = builder.destinationDataSourceType;
        this.jobName = builder.jobName;
        this.jobSettings = builder.jobSettings;
        this.jobType = builder.jobType;
        this.migrationType = builder.migrationType;
        this.name = builder.name;
        this.projectId = builder.projectId;
        this.resourceSettings = builder.resourceSettings;
        this.sourceDataSourceSettings = builder.sourceDataSourceSettings;
        this.sourceDataSourceType = builder.sourceDataSourceType;
        this.tableMappings = builder.tableMappings;
        this.transformationRules = builder.transformationRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDIJobRequest create() {
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
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
    }

    /**
     * @return migrationType
     */
    public String getMigrationType() {
        return this.migrationType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return tableMappings
     */
    public java.util.List<TableMappings> getTableMappings() {
        return this.tableMappings;
    }

    /**
     * @return transformationRules
     */
    public java.util.List<TransformationRules> getTransformationRules() {
        return this.transformationRules;
    }

    public static final class Builder extends Request.Builder<CreateDIJobRequest, Builder> {
        private String regionId; 
        private String description; 
        private java.util.List<DestinationDataSourceSettings> destinationDataSourceSettings; 
        private String destinationDataSourceType; 
        private String jobName; 
        private JobSettings jobSettings; 
        private String jobType; 
        private String migrationType; 
        private String name; 
        private Long projectId; 
        private ResourceSettings resourceSettings; 
        private java.util.List<SourceDataSourceSettings> sourceDataSourceSettings; 
        private String sourceDataSourceType; 
        private java.util.List<TableMappings> tableMappings; 
        private java.util.List<TransformationRules> transformationRules; 

        private Builder() {
            super();
        } 

        private Builder(CreateDIJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.destinationDataSourceSettings = request.destinationDataSourceSettings;
            this.destinationDataSourceType = request.destinationDataSourceType;
            this.jobName = request.jobName;
            this.jobSettings = request.jobSettings;
            this.jobType = request.jobType;
            this.migrationType = request.migrationType;
            this.name = request.name;
            this.projectId = request.projectId;
            this.resourceSettings = request.resourceSettings;
            this.sourceDataSourceSettings = request.sourceDataSourceSettings;
            this.sourceDataSourceType = request.sourceDataSourceType;
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
         * <p>The description of the synchronization task.</p>
         * 
         * <strong>example:</strong>
         * <p>The description of the synchronization task.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The settings of the destination. Only a single destination is supported.</p>
         * <p>This parameter is required.</p>
         */
        public Builder destinationDataSourceSettings(java.util.List<DestinationDataSourceSettings> destinationDataSourceSettings) {
            String destinationDataSourceSettingsShrink = shrink(destinationDataSourceSettings, "DestinationDataSourceSettings", "json");
            this.putQueryParameter("DestinationDataSourceSettings", destinationDataSourceSettingsShrink);
            this.destinationDataSourceSettings = destinationDataSourceSettings;
            return this;
        }

        /**
         * <p>The destination type. Valid values: Hologres, OSS-HDFS, OSS, MaxCompute, LogHub, StarRocks, DataHub, AnalyticDB for MySQL, Kafka, and Hive.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Hologres</p>
         */
        public Builder destinationDataSourceType(String destinationDataSourceType) {
            this.putQueryParameter("DestinationDataSourceType", destinationDataSourceType);
            this.destinationDataSourceType = destinationDataSourceType;
            return this;
        }

        /**
         * <p>This parameter is deprecated and is replaced by the Name parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql_to_holo_sync_8772</p>
         */
        public Builder jobName(String jobName) {
            this.putQueryParameter("JobName", jobName);
            this.jobName = jobName;
            return this;
        }

        /**
         * <p>The settings for the dimension of the synchronization task. The settings include processing policies for DDL messages, policies for data type mappings between source fields and destination fields, and runtime parameters of the synchronization task.</p>
         */
        public Builder jobSettings(JobSettings jobSettings) {
            String jobSettingsShrink = shrink(jobSettings, "JobSettings", "json");
            this.putQueryParameter("JobSettings", jobSettingsShrink);
            this.jobSettings = jobSettings;
            return this;
        }

        /**
         * <p>The type of the task. This parameter is optional. Valid values:</p>
         * <ul>
         * <li>DatabaseRealtimeMigration: A real-time synchronization task used to synchronize only full data, only incremental data, or full and incremental data in multiple tables of multiple databases at the source.</li>
         * <li>DatabaseOfflineMigration: A batch synchronization task used to synchronize only full data, only incremental data, or full and incremental data in multiple tables of multiple databases at the source.</li>
         * <li>SingleTableRealtimeMigration: A real-time synchronization task used to synchronize only data in single table at the source.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DatabaseRealtimeMigration</p>
         */
        public Builder jobType(String jobType) {
            this.putQueryParameter("JobType", jobType);
            this.jobType = jobType;
            return this;
        }

        /**
         * <p>The synchronization type. Valid values:</p>
         * <ul>
         * <li>FullAndRealtimeIncremental: full synchronization and real-time incremental synchronization of data in an entire database</li>
         * <li>RealtimeIncremental: real-time incremental synchronization of data in a single table</li>
         * <li>Full: full batch synchronization of data in an entire database</li>
         * <li>OfflineIncremental: batch incremental synchronization of data in an entire database</li>
         * <li>FullAndOfflineIncremental: full synchronization and batch incremental synchronization of data in an entire database</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FullAndRealtimeIncremental</p>
         */
        public Builder migrationType(String migrationType) {
            this.putQueryParameter("MigrationType", migrationType);
            this.migrationType = migrationType;
            return this;
        }

        /**
         * <p>The name of the synchronization task.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql_to_holo_sync_8772</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to query the ID.</p>
         * <p>You must configure this parameter to specify the DataWorks workspace to which the API operation is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The resource settings.</p>
         * <p>This parameter is required.</p>
         */
        public Builder resourceSettings(ResourceSettings resourceSettings) {
            String resourceSettingsShrink = shrink(resourceSettings, "ResourceSettings", "json");
            this.putQueryParameter("ResourceSettings", resourceSettingsShrink);
            this.resourceSettings = resourceSettings;
            return this;
        }

        /**
         * <p>The settings of the source. Only a single source is supported.</p>
         * <p>This parameter is required.</p>
         */
        public Builder sourceDataSourceSettings(java.util.List<SourceDataSourceSettings> sourceDataSourceSettings) {
            String sourceDataSourceSettingsShrink = shrink(sourceDataSourceSettings, "SourceDataSourceSettings", "json");
            this.putQueryParameter("SourceDataSourceSettings", sourceDataSourceSettingsShrink);
            this.sourceDataSourceSettings = sourceDataSourceSettings;
            return this;
        }

        /**
         * <p>The source type. Valid values: PolarDB, MySQL, Kafka, LogHub, Hologres, Oracle, OceanBase, MongoDB, Redshift, Hive, SQL Server, Doris, and ClickHouse.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder sourceDataSourceType(String sourceDataSourceType) {
            this.putQueryParameter("SourceDataSourceType", sourceDataSourceType);
            this.sourceDataSourceType = sourceDataSourceType;
            return this;
        }

        /**
         * <p>The list of mappings between rules used to select synchronization objects in the source and transformation rules applied to the selected synchronization objects. Each entry in the list displays a mapping between a rule used to select synchronization objects and a transformation rule applied to the selected synchronization objects.</p>
         * <blockquote>
         * <p> [ { &quot;SourceObjectSelectionRules&quot;:[ { &quot;ObjectType&quot;:&quot;Database&quot;, &quot;Action&quot;:&quot;Include&quot;, &quot;ExpressionType&quot;:&quot;Exact&quot;, &quot;Expression&quot;:&quot;biz_db&quot; }, { &quot;ObjectType&quot;:&quot;Schema&quot;, &quot;Action&quot;:&quot;Include&quot;, &quot;ExpressionType&quot;:&quot;Exact&quot;, &quot;Expression&quot;:&quot;s1&quot; }, { &quot;ObjectType&quot;:&quot;Table&quot;, &quot;Action&quot;:&quot;Include&quot;, &quot;ExpressionType&quot;:&quot;Exact&quot;, &quot;Expression&quot;:&quot;table1&quot; } ], &quot;TransformationRuleNames&quot;:[ { &quot;RuleName&quot;:&quot;my_database_rename_rule&quot;, &quot;RuleActionType&quot;:&quot;Rename&quot;, &quot;RuleTargetType&quot;:&quot;Schema&quot; } ] } ]</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         */
        public Builder tableMappings(java.util.List<TableMappings> tableMappings) {
            String tableMappingsShrink = shrink(tableMappings, "TableMappings", "json");
            this.putQueryParameter("TableMappings", tableMappingsShrink);
            this.tableMappings = tableMappings;
            return this;
        }

        /**
         * <p>The list of transformation rules for objects involved in the synchronization task.</p>
         * <blockquote>
         * <p> [ { &quot;RuleName&quot;:&quot;my_database_rename_rule&quot;, &quot;RuleActionType&quot;:&quot;Rename&quot;, &quot;RuleTargetType&quot;:&quot;Schema&quot;, &quot;RuleExpression&quot;:&quot;{&quot;expression&quot;:&quot;${srcDatasoureName}_${srcDatabaseName}&quot;}&quot; } ]</p>
         * </blockquote>
         */
        public Builder transformationRules(java.util.List<TransformationRules> transformationRules) {
            String transformationRulesShrink = shrink(transformationRules, "TransformationRules", "json");
            this.putQueryParameter("TransformationRules", transformationRulesShrink);
            this.transformationRules = transformationRules;
            return this;
        }

        @Override
        public CreateDIJobRequest build() {
            return new CreateDIJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDIJobRequest} extends {@link TeaModel}
     *
     * <p>CreateDIJobRequest</p>
     */
    public static class DestinationDataSourceSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSourceName")
        private String dataSourceName;

        private DestinationDataSourceSettings(Builder builder) {
            this.dataSourceName = builder.dataSourceName;
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

        public static final class Builder {
            private String dataSourceName; 

            private Builder() {
            } 

            private Builder(DestinationDataSourceSettings model) {
                this.dataSourceName = model.dataSourceName;
            } 

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

            public DestinationDataSourceSettings build() {
                return new DestinationDataSourceSettings(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDIJobRequest} extends {@link TeaModel}
     *
     * <p>CreateDIJobRequest</p>
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

            private Builder() {
            } 

            private Builder(ColumnDataTypeSettings model) {
                this.destinationDataType = model.destinationDataType;
                this.sourceDataType = model.sourceDataType;
            } 

            /**
             * <p>The data type of the destination field. Valid values: bigint, boolean, string, text, datetime, timestamp, decimal, and binary. Different types of data sources support different data types.</p>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder destinationDataType(String destinationDataType) {
                this.destinationDataType = destinationDataType;
                return this;
            }

            /**
             * <p>The data type of the source field. Valid values: Valid values: bigint, boolean, string, text, datetime, timestamp, decimal, and binary. Different types of data sources support different data types.</p>
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
     * {@link CreateDIJobRequest} extends {@link TeaModel}
     *
     * <p>CreateDIJobRequest</p>
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

            private Builder() {
            } 

            private Builder(CycleScheduleSettings model) {
                this.cycleMigrationType = model.cycleMigrationType;
                this.scheduleParameters = model.scheduleParameters;
            } 

            /**
             * <p>The synchronization type that requires periodic scheduling. Valid values:</p>
             * <ul>
             * <li>Full: full synchronization</li>
             * <li>OfflineIncremental: batch incremental synchronization</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Full</p>
             */
            public Builder cycleMigrationType(String cycleMigrationType) {
                this.cycleMigrationType = cycleMigrationType;
                return this;
            }

            /**
             * <p>The scheduling parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>bizdate=$bizdate</p>
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
     * {@link CreateDIJobRequest} extends {@link TeaModel}
     *
     * <p>CreateDIJobRequest</p>
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

            private Builder() {
            } 

            private Builder(DdlHandlingSettings model) {
                this.action = model.action;
                this.type = model.type;
            } 

            /**
             * <p>The processing policy. Valid values:</p>
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
     * {@link CreateDIJobRequest} extends {@link TeaModel}
     *
     * <p>CreateDIJobRequest</p>
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

            private Builder() {
            } 

            private Builder(RuntimeSettings model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>The name of the configuration item. Valid values:</p>
             * <ul>
             * <li>src.offline.datasource.max.connection: specifies the maximum number of connections that are allowed for reading data from the source of a batch synchronization task.</li>
             * <li>dst.offline.truncate: specifies whether to clear the destination table before data writing.</li>
             * <li>runtime.offline.speed.limit.enable: specifies whether throttling is enabled for a batch synchronization task.</li>
             * <li>runtime.offline.concurrent: specifies the maximum number of parallel threads that are allowed for a batch synchronization task.</li>
             * <li>runtime.enable.auto.create.schema: specifies whether schemas are automatically created in the destination of a synchronization task.</li>
             * <li>runtime.realtime.concurrent: specifies the maximum number of parallel threads that are allowed for a real-time synchronization task.</li>
             * <li>runtime.realtime.failover.minute.dataxcdc: specifies the maximum waiting duration before a synchronization task retries the next restart if the previous restart fails after failover occurs. Unit: minutes.</li>
             * <li>runtime.realtime.failover.times.dataxcdc: specifies the maximum number of failures that are allowed for restarting a synchronization task after failovers occur.</li>
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
     * {@link CreateDIJobRequest} extends {@link TeaModel}
     *
     * <p>CreateDIJobRequest</p>
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

            private Builder() {
            } 

            private Builder(JobSettings model) {
                this.channelSettings = model.channelSettings;
                this.columnDataTypeSettings = model.columnDataTypeSettings;
                this.cycleScheduleSettings = model.cycleScheduleSettings;
                this.ddlHandlingSettings = model.ddlHandlingSettings;
                this.runtimeSettings = model.runtimeSettings;
            } 

            /**
             * <p>The channel control settings for the synchronization task. You can configure special channel control settings for the following synchronization links: data synchronization between Hologres data sources and data synchronization from Hologres to Kafka.</p>
             * <ol>
             * <li>Holo2Kafka</li>
             * </ol>
             * <ul>
             * <li>Example: {&quot;destinationChannelSettings&quot;:{&quot;kafkaClientProperties&quot;:[{&quot;key&quot;:&quot;linger.ms&quot;,&quot;value&quot;:&quot;100&quot;}],&quot;keyColumns&quot;:[&quot;col3&quot;],&quot;writeMode&quot;:&quot;canal&quot;}}</li>
             * <li>kafkaClientProperties: the parameters related to a Kafka producer, which are used when you write data to a Kafka data source.</li>
             * <li>keyColumns: the names of Kafka columns to which you want to write data.</li>
             * <li>writeMode: the writing format of the Kafka data source. Valid values: json and canal.</li>
             * </ul>
             * <ol start="2">
             * <li>Holo2Holo</li>
             * </ol>
             * <ul>
             * <li>Example: {&quot;destinationChannelSettings&quot;:{&quot;conflictMode&quot;:&quot;replace&quot;,&quot;dynamicColumnAction&quot;:&quot;replay&quot;,&quot;writeMode&quot;:&quot;replay&quot;}}</li>
             * <li>conflictMode: the policy used to handle a conflict that occurs during data writing to Hologres. Valid values: replace and ignore.</li>
             * <li>writeMode: the mode in which you want to write data to Hologres. Valid values: replay and insert.</li>
             * <li>dynamicColumnAction: the mode in which you want to write data to dynamic columns in a Hologres table. Valid values: replay, insert, and ignore.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;structInfo&quot;:&quot;MANAGED&quot;,&quot;storageType&quot;:&quot;TEXTFILE&quot;,&quot;writeMode&quot;:&quot;APPEND&quot;,&quot;partitionColumns&quot;:[{&quot;columnName&quot;:&quot;pt&quot;,&quot;columnType&quot;:&quot;STRING&quot;,&quot;comment&quot;:&quot;&quot;}],&quot;fieldDelimiter&quot;:&quot;&quot;}</p>
             */
            public Builder channelSettings(String channelSettings) {
                this.channelSettings = channelSettings;
                return this;
            }

            /**
             * <p>The data type mappings between source fields and destination fields.</p>
             * <blockquote>
             * <p> &quot;ColumnDataTypeSettings&quot;:[ { &quot;SourceDataType&quot;:&quot;Bigint&quot;, &quot;DestinationDataType&quot;:&quot;Text&quot; } ]</p>
             * </blockquote>
             */
            public Builder columnDataTypeSettings(java.util.List<ColumnDataTypeSettings> columnDataTypeSettings) {
                this.columnDataTypeSettings = columnDataTypeSettings;
                return this;
            }

            /**
             * <p>The settings for periodic scheduling.</p>
             */
            public Builder cycleScheduleSettings(CycleScheduleSettings cycleScheduleSettings) {
                this.cycleScheduleSettings = cycleScheduleSettings;
                return this;
            }

            /**
             * <p>The processing settings for DDL messages.</p>
             * <blockquote>
             * <p> &quot;DDLHandlingSettings&quot;:[ { &quot;Type&quot;:&quot;Insert&quot;, &quot;Action&quot;:&quot;Normal&quot; } ]</p>
             * </blockquote>
             */
            public Builder ddlHandlingSettings(java.util.List<DdlHandlingSettings> ddlHandlingSettings) {
                this.ddlHandlingSettings = ddlHandlingSettings;
                return this;
            }

            /**
             * <p>The runtime settings.</p>
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
     * {@link CreateDIJobRequest} extends {@link TeaModel}
     *
     * <p>CreateDIJobRequest</p>
     */
    public static class OfflineResourceSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RequestedCu")
        private Double requestedCu;

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
        public Double getRequestedCu() {
            return this.requestedCu;
        }

        /**
         * @return resourceGroupIdentifier
         */
        public String getResourceGroupIdentifier() {
            return this.resourceGroupIdentifier;
        }

        public static final class Builder {
            private Double requestedCu; 
            private String resourceGroupIdentifier; 

            private Builder() {
            } 

            private Builder(OfflineResourceSettings model) {
                this.requestedCu = model.requestedCu;
                this.resourceGroupIdentifier = model.resourceGroupIdentifier;
            } 

            /**
             * <p>The number of compute units (CUs) in the resource group for Data Integration that are used for batch synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>2.0</p>
             */
            public Builder requestedCu(Double requestedCu) {
                this.requestedCu = requestedCu;
                return this;
            }

            /**
             * <p>The name of the resource group for Data Integration that are used for batch synchronization.</p>
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
     * {@link CreateDIJobRequest} extends {@link TeaModel}
     *
     * <p>CreateDIJobRequest</p>
     */
    public static class RealtimeResourceSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RequestedCu")
        private Double requestedCu;

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
        public Double getRequestedCu() {
            return this.requestedCu;
        }

        /**
         * @return resourceGroupIdentifier
         */
        public String getResourceGroupIdentifier() {
            return this.resourceGroupIdentifier;
        }

        public static final class Builder {
            private Double requestedCu; 
            private String resourceGroupIdentifier; 

            private Builder() {
            } 

            private Builder(RealtimeResourceSettings model) {
                this.requestedCu = model.requestedCu;
                this.resourceGroupIdentifier = model.resourceGroupIdentifier;
            } 

            /**
             * <p>The number of CUs in the resource group for Data Integration that are used for real-time synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>2.0</p>
             */
            public Builder requestedCu(Double requestedCu) {
                this.requestedCu = requestedCu;
                return this;
            }

            /**
             * <p>The name of the resource group for Data Integration that are used for real-time synchronization.</p>
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
     * {@link CreateDIJobRequest} extends {@link TeaModel}
     *
     * <p>CreateDIJobRequest</p>
     */
    public static class ScheduleResourceSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RequestedCu")
        private Double requestedCu;

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
        public Double getRequestedCu() {
            return this.requestedCu;
        }

        /**
         * @return resourceGroupIdentifier
         */
        public String getResourceGroupIdentifier() {
            return this.resourceGroupIdentifier;
        }

        public static final class Builder {
            private Double requestedCu; 
            private String resourceGroupIdentifier; 

            private Builder() {
            } 

            private Builder(ScheduleResourceSettings model) {
                this.requestedCu = model.requestedCu;
                this.resourceGroupIdentifier = model.resourceGroupIdentifier;
            } 

            /**
             * <p>The number of CUs in the resource group for scheduling that are used for batch synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>2.0</p>
             */
            public Builder requestedCu(Double requestedCu) {
                this.requestedCu = requestedCu;
                return this;
            }

            /**
             * <p>The name of the resource group for scheduling that is used for batch synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>S_res_group_235454102432001_1579085295030</p>
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
     * {@link CreateDIJobRequest} extends {@link TeaModel}
     *
     * <p>CreateDIJobRequest</p>
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

            private Builder() {
            } 

            private Builder(ResourceSettings model) {
                this.offlineResourceSettings = model.offlineResourceSettings;
                this.realtimeResourceSettings = model.realtimeResourceSettings;
                this.scheduleResourceSettings = model.scheduleResourceSettings;
            } 

            /**
             * <p>The resource settings for batch synchronization.</p>
             */
            public Builder offlineResourceSettings(OfflineResourceSettings offlineResourceSettings) {
                this.offlineResourceSettings = offlineResourceSettings;
                return this;
            }

            /**
             * <p>The resource settings for real-time synchronization.</p>
             */
            public Builder realtimeResourceSettings(RealtimeResourceSettings realtimeResourceSettings) {
                this.realtimeResourceSettings = realtimeResourceSettings;
                return this;
            }

            /**
             * <p>The resource settings for scheduling.</p>
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
     * {@link CreateDIJobRequest} extends {@link TeaModel}
     *
     * <p>CreateDIJobRequest</p>
     */
    public static class DataSourceProperties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Encoding")
        private String encoding;

        @com.aliyun.core.annotation.NameInMap("Timezone")
        private String timezone;

        private DataSourceProperties(Builder builder) {
            this.encoding = builder.encoding;
            this.timezone = builder.timezone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSourceProperties create() {
            return builder().build();
        }

        /**
         * @return encoding
         */
        public String getEncoding() {
            return this.encoding;
        }

        /**
         * @return timezone
         */
        public String getTimezone() {
            return this.timezone;
        }

        public static final class Builder {
            private String encoding; 
            private String timezone; 

            private Builder() {
            } 

            private Builder(DataSourceProperties model) {
                this.encoding = model.encoding;
                this.timezone = model.timezone;
            } 

            /**
             * <p>The encoding format of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>UTF-8</p>
             */
            public Builder encoding(String encoding) {
                this.encoding = encoding;
                return this;
            }

            /**
             * <p>The time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>GMT+8</p>
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            public DataSourceProperties build() {
                return new DataSourceProperties(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDIJobRequest} extends {@link TeaModel}
     *
     * <p>CreateDIJobRequest</p>
     */
    public static class SourceDataSourceSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSourceName")
        private String dataSourceName;

        @com.aliyun.core.annotation.NameInMap("DataSourceProperties")
        private DataSourceProperties dataSourceProperties;

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
        public DataSourceProperties getDataSourceProperties() {
            return this.dataSourceProperties;
        }

        public static final class Builder {
            private String dataSourceName; 
            private DataSourceProperties dataSourceProperties; 

            private Builder() {
            } 

            private Builder(SourceDataSourceSettings model) {
                this.dataSourceName = model.dataSourceName;
                this.dataSourceProperties = model.dataSourceProperties;
            } 

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
            public Builder dataSourceProperties(DataSourceProperties dataSourceProperties) {
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
     * {@link CreateDIJobRequest} extends {@link TeaModel}
     *
     * <p>CreateDIJobRequest</p>
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

            private Builder() {
            } 

            private Builder(SourceObjectSelectionRules model) {
                this.action = model.action;
                this.expression = model.expression;
                this.expressionType = model.expressionType;
                this.objectType = model.objectType;
            } 

            /**
             * <p>The operation that is performed to select objects. Valid values: Include and Exclude.</p>
             * 
             * <strong>example:</strong>
             * <p>Include</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

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
             * <p>The expression type. Valid values: Exact and Regex.</p>
             * 
             * <strong>example:</strong>
             * <p>Exact</p>
             */
            public Builder expressionType(String expressionType) {
                this.expressionType = expressionType;
                return this;
            }

            /**
             * <p>The object type. Valid values:</p>
             * <ul>
             * <li>Table</li>
             * <li>Schema</li>
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
     * {@link CreateDIJobRequest} extends {@link TeaModel}
     *
     * <p>CreateDIJobRequest</p>
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

            private Builder() {
            } 

            private Builder(TableMappingsTransformationRules model) {
                this.ruleActionType = model.ruleActionType;
                this.ruleName = model.ruleName;
                this.ruleTargetType = model.ruleTargetType;
            } 

            /**
             * <p>The action type. Valid values:</p>
             * <ul>
             * <li>DefinePrimaryKey</li>
             * <li>Rename</li>
             * <li>AddColumn</li>
             * <li>HandleDml</li>
             * <li>DefineIncrementalCondition</li>
             * <li>DefineCycleScheduleSettings</li>
             * <li>DefineRuntimeSettings</li>
             * <li>DefinePartitionKey</li>
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
             * <p>The type of the object on which you want to perform the action. Valid values:</p>
             * <ul>
             * <li>Table</li>
             * <li>Schema</li>
             * <li>Database</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Table</p>
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
     * {@link CreateDIJobRequest} extends {@link TeaModel}
     *
     * <p>CreateDIJobRequest</p>
     */
    public static class TableMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SourceObjectSelectionRules")
        private java.util.List<SourceObjectSelectionRules> sourceObjectSelectionRules;

        @com.aliyun.core.annotation.NameInMap("TransformationRules")
        private java.util.List<TableMappingsTransformationRules> transformationRules;

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
        public java.util.List<TableMappingsTransformationRules> getTransformationRules() {
            return this.transformationRules;
        }

        public static final class Builder {
            private java.util.List<SourceObjectSelectionRules> sourceObjectSelectionRules; 
            private java.util.List<TableMappingsTransformationRules> transformationRules; 

            private Builder() {
            } 

            private Builder(TableMappings model) {
                this.sourceObjectSelectionRules = model.sourceObjectSelectionRules;
                this.transformationRules = model.transformationRules;
            } 

            /**
             * <p>The list of rules used to select synchronization objects in the source.</p>
             */
            public Builder sourceObjectSelectionRules(java.util.List<SourceObjectSelectionRules> sourceObjectSelectionRules) {
                this.sourceObjectSelectionRules = sourceObjectSelectionRules;
                return this;
            }

            /**
             * <p>The list of transformation rules that you want to apply to the synchronization objects selected from the source. Each entry in the list defines a transformation rule.</p>
             */
            public Builder transformationRules(java.util.List<TableMappingsTransformationRules> transformationRules) {
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
     * {@link CreateDIJobRequest} extends {@link TeaModel}
     *
     * <p>CreateDIJobRequest</p>
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

            private Builder() {
            } 

            private Builder(TransformationRules model) {
                this.ruleActionType = model.ruleActionType;
                this.ruleExpression = model.ruleExpression;
                this.ruleName = model.ruleName;
                this.ruleTargetType = model.ruleTargetType;
            } 

            /**
             * <p>The action type. Valid values:</p>
             * <ul>
             * <li>DefinePrimaryKey</li>
             * <li>Rename</li>
             * <li>AddColumn</li>
             * <li>HandleDml</li>
             * <li>DefineIncrementalCondition</li>
             * <li>DefineCycleScheduleSettings</li>
             * <li>DefinePartitionKey</li>
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
             * <p>The expression of the rule. The expression must be a JSON string.</p>
             * <ol>
             * <li>Example of a renaming rule</li>
             * </ol>
             * <ul>
             * <li>Example: {&quot;expression&quot;:&quot;${srcDatasourceName}_${srcDatabaseName}_0922&quot; }</li>
             * <li>expression: the expression of the renaming rule. You can use the following variables in an expression: ${srcDatasourceName}, ${srcDatabaseName}, and ${srcTableName}. ${srcDatasourceName} specifies the name of the source. ${srcDatabaseName} specifies the name of a source database. ${srcTableName} specifies the name of a source table.</li>
             * </ul>
             * <ol start="2">
             * <li>Example of a column addition rule</li>
             * </ol>
             * <ul>
             * <li>Example: {&quot;columns&quot;:[{&quot;columnName&quot;:&quot;my_add_column&quot;,&quot;columnValueType&quot;:&quot;Constant&quot;,&quot;columnValue&quot;:&quot;123&quot;}]}</li>
             * <li>If you do not configure such a rule, no fields are added to the destination and no values are assigned by default.</li>
             * <li>columnName: the name of the field that is added.</li>
             * <li>columnValueType: the value type of the field. Valid values: Constant and Variable.</li>
             * <li>columnValue: the value of the field. If the columnValueType parameter is set to Constant, set the columnValue parameter to a constant of the STRING data type. If the columnValueType parameter is set to Variable, set the columnValue parameter to a built-in variable. The following built-in variables are supported: EXECUTE_TIME (LONG data type), DB_NAME_SRC (STRING data type), DATASOURCE_NAME_SRC (STRING data type), TABLE_NAME_SRC (STRING data type), DB_NAME_DEST (STRING data type), DATASOURCE_NAME_DEST (STRING data type), TABLE_NAME_DEST (STRING data type), and DB_NAME_SRC_TRANSED (STRING data type). EXECUTE_TIME specifies the execution time. DB_NAME_SRC specifies the name of a source database. DATASOURCE_NAME_SRC specifies the name of the source. TABLE_NAME_SRC specifies the name of a source table. DB_NAME_DEST specifies the name of a destination database. DATASOURCE_NAME_DEST specifies the name of the destination. TABLE_NAME_DEST specifies the name of a destination table. DB_NAME_SRC_TRANSED specifies the database name obtained after a transformation.</li>
             * </ul>
             * <ol start="3">
             * <li>Example of a rule used to specify primary key fields for a destination table</li>
             * </ol>
             * <ul>
             * <li>Example: {&quot;columns&quot;:[&quot;ukcolumn1&quot;,&quot;ukcolumn2&quot;]}</li>
             * <li>If you do not configure such a rule, the primary key fields in the mapped source table are used for the destination table by default.</li>
             * <li>If the destination table is an existing table, Data Integration does not modify the schema of the destination table. If the specified primary key fields do not exist in the destination table, an error is reported when the synchronization task starts to run.</li>
             * <li>If the destination table is automatically created by the system, Data Integration automatically creates the schema of the destination table. The schema contains the primary key fields that you specify. If the specified primary key fields do not exist in the destination table, an error is reported when the synchronization task starts to run.</li>
             * </ul>
             * <ol start="4">
             * <li>Example of a rule used to process DML messages</li>
             * </ol>
             * <ul>
             * <li>Example: {&quot;dmlPolicies&quot;:[{&quot;dmlType&quot;:&quot;Delete&quot;,&quot;dmlAction&quot;:&quot;Filter&quot;,&quot;filterCondition&quot;:&quot;id &gt; 1&quot;}]}</li>
             * <li>If you do not configure such a rule, the default processing policy for messages generated for insert, update, and delete operations is Normal.</li>
             * <li>dmlType: the DML operation. Valid values: Insert, Update, and Delete.</li>
             * <li>dmlAction: the processing policy for DML messages. Valid values: Normal, Ignore, Filter, and LogicalDelete. Filter indicates conditional processing. You can set the dmlAction parameter to Filter only when the dmlType parameter is set to Update or Delete.</li>
             * <li>filterCondition: the condition used to filter DML messages. This parameter is required only when the dmlAction parameter is set to Filter.</li>
             * </ul>
             * <ol start="5">
             * <li>Example of a rule used to perform incremental synchronization</li>
             * </ol>
             * <ul>
             * <li>Example: {&quot;where&quot;:&quot;id &gt; 0&quot;}</li>
             * <li>You can configure such a rule to perform incremental synchronization.</li>
             * </ul>
             * <ol start="6">
             * <li>Example of a rule used to configure scheduling parameters for an auto triggered task</li>
             * </ol>
             * <ul>
             * <li>Example: {&quot;cronExpress&quot;:&quot; * * * * * *&quot;, &quot;cycleType&quot;:&quot;1&quot;}</li>
             * <li>You can configure such a rule to configure scheduling parameters for an auto triggered task.</li>
             * </ul>
             * <ol start="7">
             * <li>Example of a rule used to specify a partition key</li>
             * </ol>
             * <ul>
             * <li>Example: {&quot;columns&quot;:[&quot;id&quot;]}</li>
             * <li>You can configure such a rule to specify a partition key.</li>
             * </ul>
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
             * <p>The type of the object on which you want to perform the action. Valid values:</p>
             * <ul>
             * <li>Table</li>
             * <li>Schema</li>
             * <li>Database</li>
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
}
