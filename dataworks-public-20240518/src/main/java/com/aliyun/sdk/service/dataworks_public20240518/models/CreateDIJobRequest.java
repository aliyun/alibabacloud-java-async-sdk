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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DestinationDataSourceSettings")
    private java.util.List<DestinationDataSourceSettings> destinationDataSourceSettings;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationDataSourceType")
    private String destinationDataSourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileSpec")
    private String fileSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobName")
    @Deprecated
    private String jobName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobSettings")
    private JobSettings jobSettings;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobType")
    private String jobType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MigrationType")
    private String migrationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Owner")
    private String owner;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceSettings")
    private ResourceSettings resourceSettings;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceDataSourceSettings")
    private java.util.List<SourceDataSourceSettings> sourceDataSourceSettings;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceDataSourceType")
    private String sourceDataSourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TableMappings")
    private java.util.List<TableMappings> tableMappings;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TransformationRules")
    private java.util.List<TransformationRules> transformationRules;

    private CreateDIJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.destinationDataSourceSettings = builder.destinationDataSourceSettings;
        this.destinationDataSourceType = builder.destinationDataSourceType;
        this.fileSpec = builder.fileSpec;
        this.jobName = builder.jobName;
        this.jobSettings = builder.jobSettings;
        this.jobType = builder.jobType;
        this.migrationType = builder.migrationType;
        this.name = builder.name;
        this.owner = builder.owner;
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
     * @return fileSpec
     */
    public String getFileSpec() {
        return this.fileSpec;
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
     * @return owner
     */
    public String getOwner() {
        return this.owner;
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
        private String fileSpec; 
        private String jobName; 
        private JobSettings jobSettings; 
        private String jobType; 
        private String migrationType; 
        private String name; 
        private String owner; 
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
            this.fileSpec = request.fileSpec;
            this.jobName = request.jobName;
            this.jobSettings = request.jobSettings;
            this.jobType = request.jobType;
            this.migrationType = request.migrationType;
            this.name = request.name;
            this.owner = request.owner;
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
         * <p>The description of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>DI Job Demo</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The list of destination data source settings.</p>
         */
        public Builder destinationDataSourceSettings(java.util.List<DestinationDataSourceSettings> destinationDataSourceSettings) {
            String destinationDataSourceSettingsShrink = shrink(destinationDataSourceSettings, "DestinationDataSourceSettings", "json");
            this.putBodyParameter("DestinationDataSourceSettings", destinationDataSourceSettingsShrink);
            this.destinationDataSourceSettings = destinationDataSourceSettings;
            return this;
        }

        /**
         * <p>The type of the destination data source. Valid values: Hologres, OSS-HDFS, OSS, MaxCompute, LogHub, StarRocks, DataHub, AnalyticDB_For_MySQL, Kafka, Hive.</p>
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
         * <p>The code content in script mode.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;resourceSettings&quot;: {
         *         &quot;realtimeResourceSettings&quot;: {
         *             &quot;requestedCu&quot;: 2,
         *             &quot;resourceGroupIdentifier&quot;: &quot;Serverless_res_group_123_456&quot;
         *         },
         *         &quot;offlineResourceSettings&quot;: {
         *             &quot;requestedCu&quot;: 2,
         *             &quot;resourceGroupIdentifier&quot;: &quot;Serverless_res_group_123_456&quot;
         *         }
         *     },
         *     &quot;tableMappings&quot;: [
         *         {
         *             &quot;sourceObjectSelectionRules&quot;: [
         *                 {
         *                     &quot;expression&quot;: &quot;autotest_hologres&quot;,
         *                     &quot;action&quot;: &quot;Include&quot;,
         *                     &quot;expressionType&quot;: &quot;Exact&quot;,
         *                     &quot;objectType&quot;: &quot;Datasource&quot;
         *                 },
         *                 {
         *                     &quot;expression&quot;: &quot;auto_holo_2661647&quot;,
         *                     &quot;action&quot;: &quot;Include&quot;,
         *                     &quot;expressionType&quot;: &quot;Exact&quot;,
         *                     &quot;objectType&quot;: &quot;Table&quot;
         *                 },
         *                 {
         *                     &quot;expression&quot;: &quot;public&quot;,
         *                     &quot;action&quot;: &quot;Include&quot;,
         *                     &quot;expressionType&quot;: &quot;Exact&quot;,
         *                     &quot;objectType&quot;: &quot;Schema&quot;
         *                 }
         *             ],
         *             &quot;transformationRules&quot;: [
         *                 {
         *                     &quot;ruleTargetType&quot;: &quot;Table&quot;,
         *                     &quot;ruleActionType&quot;: &quot;SourceSchema&quot;,
         *                     &quot;ruleName&quot;: &quot;SourceSchema_Table_BStf8aXPSCJjOWGe&quot;
         *                 },
         *                 {
         *                     &quot;ruleTargetType&quot;: &quot;Schema&quot;,
         *                     &quot;ruleActionType&quot;: &quot;Rename&quot;,
         *                     &quot;ruleName&quot;: &quot;Rename_Schema_3qWNOIsljtInvKJy&quot;
         *                 },
         *                 {
         *                     &quot;ruleTargetType&quot;: &quot;Table&quot;,
         *                     &quot;ruleActionType&quot;: &quot;Rename&quot;,
         *                     &quot;ruleName&quot;: &quot;Rename_Table_o3PVQq1aIKDGoVVW&quot;
         *                 },
         *                 {
         *                     &quot;ruleTargetType&quot;: &quot;Table&quot;,
         *                     &quot;ruleActionType&quot;: &quot;DefineDstTableSettings&quot;,
         *                     &quot;ruleName&quot;: &quot;DefineDstTableSettings_Table_BhJltOmOCIc81fzi&quot;
         *                 },
         *                 {
         *                     &quot;ruleTargetType&quot;: &quot;Table&quot;,
         *                     &quot;ruleActionType&quot;: &quot;ColumnMapping&quot;,
         *                     &quot;ruleName&quot;: &quot;ColumnMapping_Table_nP4hJPX1wh2W3fpo&quot;
         *                 }
         *             ]
         *         }
         *     ],
         *     &quot;sourceDataSourceSettings&quot;: [
         *         {
         *             &quot;dataSourceProperties&quot;: {
         *                 &quot;timeZone&quot;: &quot;Asia/Shanghai&quot;
         *             },
         *             &quot;dataSourceName&quot;: &quot;autotest_hologres&quot;
         *         }
         *     ],
         *     &quot;jobSettings&quot;: {
         *         &quot;runtimeSettings&quot;: [</p>
         * <pre><code>    ],
         *     &quot;ddlHandlingSettings&quot;: [
         * 
         *     ],
         *     &quot;columnDataTypeSettings&quot;: [
         * 
         *     ],
         *     &quot;cycleScheduleSettings&quot;: {
         * 
         *     },
         *     &quot;channelSettings&quot;: {
         *         &quot;destinationChannelSettings&quot;: {
         *             &quot;conflictMode&quot;: &quot;replace&quot;,
         *             &quot;dynamicColumnAction&quot;: &quot;replay&quot;,
         *             &quot;writeMode&quot;: &quot;replay&quot;
         *         },
         *         &quot;sourceChannelSettings&quot;: {
         * 
         *         }
         *     }
         * },
         * &quot;destinationDataSourceType&quot;: &quot;Hologres&quot;,
         * &quot;transformationRules&quot;: [
         *     {
         *         &quot;ruleTargetType&quot;: &quot;Table&quot;,
         *         &quot;ruleName&quot;: &quot;SourceSchema_Table_BStf8aXPSCJjOWGe&quot;,
         *         &quot;ruleActionType&quot;: &quot;SourceSchema&quot;,
         *         &quot;ruleExpression&quot;: {
         *             &quot;columns&quot;: [
         *                 {
         *                     &quot;name&quot;: &quot;id&quot;,
         *                     &quot;category&quot;: &quot;normal&quot;,
         *                     &quot;type&quot;: &quot;BIGINT&quot;
         *                 },
         *                 {
         *                     &quot;name&quot;: &quot;decimal&quot;,
         *                     &quot;category&quot;: &quot;normal&quot;,
         *                     &quot;type&quot;: &quot;DECIMAL&quot;
         *                 }
         *             ]
         *         }
         *     },
         *     {
         *         &quot;ruleTargetType&quot;: &quot;Schema&quot;,
         *         &quot;ruleName&quot;: &quot;Rename_Schema_3qWNOIsljtInvKJy&quot;,
         *         &quot;ruleActionType&quot;: &quot;Rename&quot;,
         *         &quot;ruleExpression&quot;: {
         *             &quot;expression&quot;: &quot;public&quot;
         *         }
         *     },
         *     {
         *         &quot;ruleTargetType&quot;: &quot;Table&quot;,
         *         &quot;ruleName&quot;: &quot;Rename_Table_o3PVQq1aIKDGoVVW&quot;,
         *         &quot;ruleActionType&quot;: &quot;Rename&quot;,
         *         &quot;ruleExpression&quot;: {
         *             &quot;expression&quot;: &quot;auto_holo_2661647_dst&quot;
         *         }
         *     },
         *     {
         *         &quot;ruleTargetType&quot;: &quot;Table&quot;,
         *         &quot;ruleName&quot;: &quot;DefineDstTableSettings_Table_BhJltOmOCIc81fzi&quot;,
         *         &quot;ruleActionType&quot;: &quot;DefineDstTableSettings&quot;,
         *         &quot;ruleExpression&quot;: {
         *             &quot;ddlString&quot;: &quot;BEGIN;
         * </code></pre>
         * <p>CREATE TABLE IF NOT EXISTS public.auto_holo_2661647_dst (
         *    id          BIGINT PRIMARY KEY,
         *    &quot;decimal&quot;   DECIMAL(38,18)
         * );
         * CALL SET_TABLE_PROPERTY(\&quot;public.auto_holo_2661647_dst\&quot;, \&quot;time_to_live_in_seconds\&quot;, \&quot;3153600000\&quot;);
         * CALL SET_TABLE_PROPERTY(\&quot;public.auto_holo_2661647_dst\&quot;, \&quot;orientation\&quot;, \&quot;column\&quot;);
         * CALL SET_TABLE_PROPERTY(\&quot;public.auto_holo_2661647_dst\&quot;, \&quot;binlog.level\&quot;, \&quot;replica\&quot;);
         * CALL SET_TABLE_PROPERTY(\&quot;public.auto_holo_2661647_dst\&quot;, \&quot;binlog.ttl\&quot;, \&quot;2592000\&quot;);
         * CALL SET_TABLE_PROPERTY(\&quot;public.auto_holo_2661647_dst\&quot;, \&quot;bitmap_columns\&quot;, \&quot;&quot;text&quot;,&quot;char&quot;,&quot;varchar&quot;\&quot;);
         * CALL SET_TABLE_PROPERTY(\&quot;public.auto_holo_2661647_dst\&quot;, \&quot;dictionary_encoding_columns\&quot;, \&quot;&quot;text&quot;:auto,&quot;bytea&quot;:auto,&quot;char&quot;:auto,&quot;varchar&quot;:auto\&quot;);
         * CALL SET_TABLE_PROPERTY(\&quot;public.auto_holo_2661647_dst\&quot;, \&quot;distribution_key\&quot;, \&quot;&quot;id&quot;\&quot;);
         * COMMIT;
         * &quot;,
         *                 &quot;ddlType&quot;: &quot;STRUCT&quot;
         *             }
         *         },
         *         {
         *             &quot;ruleTargetType&quot;: &quot;Table&quot;,
         *             &quot;ruleName&quot;: &quot;ColumnMapping_Table_nP4hJPX1wh2W3fpo&quot;,
         *             &quot;ruleActionType&quot;: &quot;ColumnMapping&quot;,
         *             &quot;ruleExpression&quot;: {
         *                 &quot;columnMapping&quot;: [
         *                     {
         *                         &quot;sourceColName&quot;: &quot;id&quot;,
         *                         &quot;dstColName&quot;: &quot;id&quot;
         *                     },
         *                     {
         *                         &quot;sourceColName&quot;: &quot;decimal&quot;,
         *                         &quot;dstColName&quot;: &quot;decimal&quot;
         *                     }
         *                 ]
         *             }
         *         }
         *     ],
         *     &quot;migrationType&quot;: &quot;FullAndRealtimeIncremental&quot;,
         *     &quot;destinationDataSourceSettings&quot;: [
         *         {
         *             &quot;dataSourceProperties&quot;: {</p>
         * <pre><code>        },
         *         &quot;dataSourceName&quot;: &quot;autotest_hologres&quot;
         *     }
         * ],
         * &quot;sourceDataSourceType&quot;: &quot;Hologres&quot;
         * </code></pre>
         * <p>}</p>
         */
        public Builder fileSpec(String fileSpec) {
            this.putBodyParameter("FileSpec", fileSpec);
            this.fileSpec = fileSpec;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> Use the Name parameter instead.</p>
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
         * <p>The task-level settings, including DDL handling policies, source-to-destination column data type mapping policies, and task runtime parameters.</p>
         */
        public Builder jobSettings(JobSettings jobSettings) {
            String jobSettingsShrink = shrink(jobSettings, "JobSettings", "json");
            this.putBodyParameter("JobSettings", jobSettingsShrink);
            this.jobSettings = jobSettings;
            return this;
        }

        /**
         * <p>The task type. Valid values:</p>
         * <ul>
         * <li><p>DatabaseRealtimeMigration: real-time migration of entire databases. Performs streaming synchronization of multiple tables from multiple source databases. Supports full-only, incremental-only, or full and incremental synchronization.</p>
         * </li>
         * <li><p>DatabaseOfflineMigration: offline migration of entire databases. Performs batch synchronization of multiple tables from multiple source databases. Supports full-only, incremental-only, or full and incremental synchronization.</p>
         * </li>
         * <li><p>SingleTableRealtimeMigration: real-time migration of a single table. Performs streaming synchronization of a single source table.</p>
         * </li>
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
         * <li>FullAndRealtimeIncremental: full and real-time incremental synchronization for entire databases in real time.</li>
         * <li>RealtimeIncremental: real-time incremental synchronization for single tables in real time.</li>
         * <li>Full: full synchronization for entire databases offline.</li>
         * <li>OfflineIncremental: offline incremental synchronization for entire databases offline.</li>
         * <li>FullAndOfflineIncremental: full and offline incremental synchronization for entire databases offline.</li>
         * </ul>
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
         * <p>The name of the task.</p>
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
         * <p>The owner of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>3726346</p>
         */
        public Builder owner(String owner) {
            this.putQueryParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the workspace management page to obtain the ID.</p>
         * <p>This parameter specifies the DataWorks workspace for this API call.</p>
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
         */
        public Builder resourceSettings(ResourceSettings resourceSettings) {
            String resourceSettingsShrink = shrink(resourceSettings, "ResourceSettings", "json");
            this.putBodyParameter("ResourceSettings", resourceSettingsShrink);
            this.resourceSettings = resourceSettings;
            return this;
        }

        /**
         * <p>The list of source data source settings.</p>
         */
        public Builder sourceDataSourceSettings(java.util.List<SourceDataSourceSettings> sourceDataSourceSettings) {
            String sourceDataSourceSettingsShrink = shrink(sourceDataSourceSettings, "SourceDataSourceSettings", "json");
            this.putBodyParameter("SourceDataSourceSettings", sourceDataSourceSettingsShrink);
            this.sourceDataSourceSettings = sourceDataSourceSettings;
            return this;
        }

        /**
         * <p>The type of the source data source. Valid values: PolarDB, MySQL, Kafka, LogHub, Hologres, Oracle, OceanBase, MongoDB, RedShift, Hive, SQLServer, Doris, ClickHouse.</p>
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
         * <p>The list of synchronization object transformation mappings. Each element describes a group of source object selection rules and the transformation rules applied to that group.</p>
         * <blockquote>
         * <p>[ { &quot;SourceObjectSelectionRules&quot;:[ { &quot;ObjectType&quot;:&quot;Database&quot;, &quot;Action&quot;:&quot;Include&quot;, &quot;ExpressionType&quot;:&quot;Exact&quot;, &quot;Expression&quot;:&quot;biz_db&quot; }, { &quot;ObjectType&quot;:&quot;Schema&quot;, &quot;Action&quot;:&quot;Include&quot;, &quot;ExpressionType&quot;:&quot;Exact&quot;, &quot;Expression&quot;:&quot;s1&quot; }, { &quot;ObjectType&quot;:&quot;Table&quot;, &quot;Action&quot;:&quot;Include&quot;, &quot;ExpressionType&quot;:&quot;Exact&quot;, &quot;Expression&quot;:&quot;table1&quot; } ], &quot;TransformationRuleNames&quot;:[ { &quot;RuleName&quot;:&quot;my_database_rename_rule&quot;, &quot;RuleActionType&quot;:&quot;Rename&quot;, &quot;RuleTargetType&quot;:&quot;Schema&quot; } ] } ]</p>
         * </blockquote>
         */
        public Builder tableMappings(java.util.List<TableMappings> tableMappings) {
            String tableMappingsShrink = shrink(tableMappings, "TableMappings", "json");
            this.putBodyParameter("TableMappings", tableMappingsShrink);
            this.tableMappings = tableMappings;
            return this;
        }

        /**
         * <p>The list of synchronization object transformation rule definitions.</p>
         * <blockquote>
         * <p>[ { &quot;RuleName&quot;:&quot;my_database_rename_rule&quot;, &quot;RuleActionType&quot;:&quot;Rename&quot;, &quot;RuleTargetType&quot;:&quot;Schema&quot;, &quot;RuleExpression&quot;:&quot;{&quot;expression&quot;:&quot;${srcDatasoureName}_${srcDatabaseName}&quot;}&quot; } ]</p>
         * </blockquote>
         */
        public Builder transformationRules(java.util.List<TransformationRules> transformationRules) {
            String transformationRulesShrink = shrink(transformationRules, "TransformationRules", "json");
            this.putBodyParameter("TransformationRules", transformationRulesShrink);
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
    public static class DataSourceProperties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionProperties")
        private String connectionProperties;

        private DataSourceProperties(Builder builder) {
            this.connectionProperties = builder.connectionProperties;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSourceProperties create() {
            return builder().build();
        }

        /**
         * @return connectionProperties
         */
        public String getConnectionProperties() {
            return this.connectionProperties;
        }

        public static final class Builder {
            private String connectionProperties; 

            private Builder() {
            } 

            private Builder(DataSourceProperties model) {
                this.connectionProperties = model.connectionProperties;
            } 

            /**
             * <p>Specify either this parameter or DataSourceName. This parameter specifies custom data source connection configuration information, including the instance ID, access identity, and instance region.</p>
             * <p>This parameter supports only datasource config in instance pattern (ConnectionPropertiesMode). Different data sources have different property specifications. For more information, see <a href="https://help.aliyun.com/document_detail/2852465.html">Data source connection information ConnectionProperties</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;instanceId&quot;: &quot;rm-2ze09gn3x6xxx&quot;, &quot;password&quot;: &quot;xxxx&quot;, &quot;database&quot;: &quot;agent&quot;, &quot;username&quot;: &quot;zmtest&quot; &quot;regionId&quot;: &quot;cn-beijing&quot; }</p>
             */
            public Builder connectionProperties(String connectionProperties) {
                this.connectionProperties = connectionProperties;
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
    public static class DestinationDataSourceSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSourceName")
        private String dataSourceName;

        @com.aliyun.core.annotation.NameInMap("DataSourceProperties")
        private DataSourceProperties dataSourceProperties;

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
        public DataSourceProperties getDataSourceProperties() {
            return this.dataSourceProperties;
        }

        public static final class Builder {
            private String dataSourceName; 
            private DataSourceProperties dataSourceProperties; 

            private Builder() {
            } 

            private Builder(DestinationDataSourceSettings model) {
                this.dataSourceName = model.dataSourceName;
                this.dataSourceProperties = model.dataSourceProperties;
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

            /**
             * <p>The properties of the data source.</p>
             */
            public Builder dataSourceProperties(DataSourceProperties dataSourceProperties) {
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
             * <p>The destination data type, such as bigint, boolean, string, text, datetime, timestamp, decimal, or binary. The available types vary by data source type.</p>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder destinationDataType(String destinationDataType) {
                this.destinationDataType = destinationDataType;
                return this;
            }

            /**
             * <p>The source data type, such as bigint, boolean, string, text, datetime, timestamp, decimal, or binary. The available types vary by data source type.</p>
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
             * <p>The synchronization type that requires cycle scheduling. Valid values:</p>
             * <ul>
             * <li>Full: full synchronization.</li>
             * <li>OfflineIncremental: offline incremental synchronization.</li>
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
             * <p>The handling action. Valid values:</p>
             * <ul>
             * <li>Ignore: ignores the DDL operation.</li>
             * <li>Critical: reports an error.</li>
             * <li>Normal: processes the DDL operation normally.</li>
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
             * <p>The DDL type. Valid values:</p>
             * <ul>
             * <li>RenameColumn: renames a column.</li>
             * <li>ModifyColumn: modifies a column.</li>
             * <li>CreateTable: creates a table.</li>
             * <li>TruncateTable: truncates a table.</li>
             * <li>DropTable: drops a table.</li>
             * <li>DropColumn: drops a column.</li>
             * <li>AddColumn: adds a column.</li>
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
             * <p>The setting name. Valid values:</p>
             * <ul>
             * <li>src.offline.datasource.max.connection: the maximum number of connections to the source for offline batch tasks.</li>
             * <li>dst.offline.truncate: specifies whether to truncate the destination table.</li>
             * <li>runtime.offline.speed.limit.enable: specifies whether to enable throttling for offline batch tasks.</li>
             * <li>runtime.offline.concurrent: the concurrency of offline batch synchronization tasks.</li>
             * <li>runtime.enable.auto.create.schema: specifies whether to automatically create a schema on the destination.</li>
             * <li>runtime.realtime.concurrent: the concurrency of real-time tasks.</li>
             * <li>runtime.realtime.failover.minute.dataxcdc: the wait time in minutes before restarting after a failover failure.</li>
             * <li>runtime.realtime.failover.times.dataxcdc: the number of restart attempts after a failover failure.</li>
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
             * <p>The setting value.</p>
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
             * <p>The channel-related task settings. You can configure special settings for specific channels. Currently supported channels include Holo2Holo (synchronization from Hologres to Hologres) and Holo2Kafka (synchronization from Hologres to Kafka).</p>
             * <ol>
             * <li>Holo2Kafka</li>
             * </ol>
             * <ul>
             * <li>Example: {&quot;destinationChannelSettings&quot;:{&quot;kafkaClientProperties&quot;:[{&quot;key&quot;:&quot;linger.ms&quot;,&quot;value&quot;:&quot;100&quot;}],&quot;keyColumns&quot;:[&quot;col3&quot;],&quot;writeMode&quot;:&quot;canal&quot;}}</li>
             * <li>kafkaClientProperties: Kafka producer parameters used when writing to Kafka.</li>
             * <li>keyColumns: the columns whose values are written to Kafka.</li>
             * <li>writeMode: the Kafka write format. Currently supports json and canal.</li>
             * </ul>
             * <ol start="2">
             * <li>Holo2Holo</li>
             * </ol>
             * <ul>
             * <li><p>Example: {&quot;destinationChannelSettings&quot;:{&quot;conflictMode&quot;:&quot;replace&quot;,&quot;dynamicColumnAction&quot;:&quot;replay&quot;,&quot;writeMode&quot;:&quot;replay&quot;}}</p>
             * </li>
             * <li><p>conflictMode: the conflict handling policy when writing to Hologres. Valid values: replace (overwrite) and ignore.</p>
             * </li>
             * <li><p>writeMode: the write mode for Hologres. Valid values: replay and insert.</p>
             * </li>
             * <li><p>dynamicColumnAction: the dynamic column handling mode when writing to Hologres. Valid values: replay, insert, and ignore.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{
             *       &quot;structInfo&quot;: &quot;MANAGED&quot;,
             *       &quot;storageType&quot;: &quot;TEXTFILE&quot;,
             *       &quot;writeMode&quot;: &quot;APPEND&quot;,
             *       &quot;partitionColumns&quot;: [
             *             {
             *                   &quot;columnName&quot;: &quot;pt&quot;,
             *                   &quot;columnType&quot;: &quot;STRING&quot;,
             *                   &quot;comment&quot;: &quot;&quot;
             *             }
             *       ],
             *       &quot;fieldDelimiter&quot;: &quot;&quot;
             * }</p>
             */
            public Builder channelSettings(String channelSettings) {
                this.channelSettings = channelSettings;
                return this;
            }

            /**
             * <p>The column data type mapping array.</p>
             * <blockquote>
             * <p>[&quot;ColumnDataTypeSettings&quot;:[ { &quot;SourceDataType&quot;:&quot;Bigint&quot;, &quot;DestinationDataType&quot;:&quot;Text&quot; } ]</p>
             * </blockquote>
             */
            public Builder columnDataTypeSettings(java.util.List<ColumnDataTypeSettings> columnDataTypeSettings) {
                this.columnDataTypeSettings = columnDataTypeSettings;
                return this;
            }

            /**
             * <p>The cycle scheduling settings.</p>
             */
            public Builder cycleScheduleSettings(CycleScheduleSettings cycleScheduleSettings) {
                this.cycleScheduleSettings = cycleScheduleSettings;
                return this;
            }

            /**
             * <p>The DDL handling settings array.</p>
             * <blockquote>
             * <p>[&quot;DDLHandlingSettings&quot;:[ { &quot;Type&quot;:&quot;Insert&quot;, &quot;Action&quot;:&quot;Normal&quot; } ]</p>
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
             * <p>The number of compute units (CUs) of the data integration resource group used for offline synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder requestedCu(Double requestedCu) {
                this.requestedCu = requestedCu;
                return this;
            }

            /**
             * <p>The name of the data integration resource group used for offline synchronization.</p>
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
             * <p>The number of CUs of the data integration resource group used for real-time synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder requestedCu(Double requestedCu) {
                this.requestedCu = requestedCu;
                return this;
            }

            /**
             * <p>The name of the data integration resource group used for real-time synchronization.</p>
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
             * <p>The number of CUs of the scheduling resource group used for offline synchronization nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder requestedCu(Double requestedCu) {
                this.requestedCu = requestedCu;
                return this;
            }

            /**
             * <p>The name of the scheduling resource group used for offline synchronization nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>S_res_group_222_333</p>
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
             * <p>The offline synchronization resource settings.</p>
             */
            public Builder offlineResourceSettings(OfflineResourceSettings offlineResourceSettings) {
                this.offlineResourceSettings = offlineResourceSettings;
                return this;
            }

            /**
             * <p>The real-time synchronization resource settings.</p>
             */
            public Builder realtimeResourceSettings(RealtimeResourceSettings realtimeResourceSettings) {
                this.realtimeResourceSettings = realtimeResourceSettings;
                return this;
            }

            /**
             * <p>The schedule resource settings.</p>
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
    public static class SourceDataSourceSettingsDataSourceProperties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionProperties")
        private String connectionProperties;

        @com.aliyun.core.annotation.NameInMap("Encoding")
        private String encoding;

        @com.aliyun.core.annotation.NameInMap("Timezone")
        private String timezone;

        private SourceDataSourceSettingsDataSourceProperties(Builder builder) {
            this.connectionProperties = builder.connectionProperties;
            this.encoding = builder.encoding;
            this.timezone = builder.timezone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceDataSourceSettingsDataSourceProperties create() {
            return builder().build();
        }

        /**
         * @return connectionProperties
         */
        public String getConnectionProperties() {
            return this.connectionProperties;
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
            private String connectionProperties; 
            private String encoding; 
            private String timezone; 

            private Builder() {
            } 

            private Builder(SourceDataSourceSettingsDataSourceProperties model) {
                this.connectionProperties = model.connectionProperties;
                this.encoding = model.encoding;
                this.timezone = model.timezone;
            } 

            /**
             * <p>Specify either this parameter or DataSourceName. This parameter specifies custom data source connection configuration information, including the instance ID, access identity, and instance region.</p>
             * <p>This parameter supports only datasource config in instance pattern (ConnectionPropertiesMode). Different data sources have different property specifications. For more information, see <a href="https://help.aliyun.com/document_detail/2852465.html">Data source connection information ConnectionProperties</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;instanceId&quot;: &quot;rm-2ze09gn3x6xxx&quot;, &quot;password&quot;: &quot;xxxx&quot;, &quot;database&quot;: &quot;agent&quot;, &quot;username&quot;: &quot;zmtest&quot; &quot;regionId&quot;: &quot;cn-beijing&quot; }</p>
             */
            public Builder connectionProperties(String connectionProperties) {
                this.connectionProperties = connectionProperties;
                return this;
            }

            /**
             * <p>The database encoding.</p>
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
             * <p>Asia/Shanghai</p>
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            public SourceDataSourceSettingsDataSourceProperties build() {
                return new SourceDataSourceSettingsDataSourceProperties(this);
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
        private SourceDataSourceSettingsDataSourceProperties dataSourceProperties;

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
        public SourceDataSourceSettingsDataSourceProperties getDataSourceProperties() {
            return this.dataSourceProperties;
        }

        public static final class Builder {
            private String dataSourceName; 
            private SourceDataSourceSettingsDataSourceProperties dataSourceProperties; 

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
            public Builder dataSourceProperties(SourceDataSourceSettingsDataSourceProperties dataSourceProperties) {
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
             * <p>The selection action. Valid values: Include and Exclude.</p>
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
             * <li>DefinePrimaryKey: defines a primary key.</li>
             * <li>Rename: renames an object.</li>
             * <li>AddColumn: adds a column.</li>
             * <li>HandleDml: handles DML operations.</li>
             * <li>DefineIncrementalCondition: defines an incremental condition.</li>
             * <li>DefineCycleScheduleSettings: defines cycle scheduling settings.</li>
             * <li>DefinePartitionKey: defines a partition key.</li>
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
             * <p>The rule name. The name must be unique within the same action type and target type combination. The name cannot exceed 50 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>rename_rule_1</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The target type on which the action is applied. Valid values:</p>
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
             * <p>Each rule selects a set of source objects to synchronize. Multiple rules together select a single table.</p>
             */
            public Builder sourceObjectSelectionRules(java.util.List<SourceObjectSelectionRules> sourceObjectSelectionRules) {
                this.sourceObjectSelectionRules = sourceObjectSelectionRules;
                return this;
            }

            /**
             * <p>The list of synchronization object transformation rule definitions. Each element represents one transformation rule.</p>
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
             * <li>DefinePrimaryKey: defines a primary key.</li>
             * <li>Rename: renames an object.</li>
             * <li>AddColumn: adds a column.</li>
             * <li>HandleDml: handles DML operations.</li>
             * <li>DefineIncrementalCondition: defines an incremental condition.</li>
             * <li>DefineCycleScheduleSettings: defines cycle scheduling settings.</li>
             * <li>DefinePartitionKey: defines a partition key.</li>
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
             * <p>The rule expression in JSON string format.</p>
             * <ol>
             * <li>Rename rule (Rename)</li>
             * </ol>
             * <ul>
             * <li>Example: {&quot;expression&quot;:&quot;${srcDatasourceName}_${srcDatabaseName}_0922&quot; }</li>
             * <li>expression: the rename transformation rule expression. The expression supports the following variables: ${srcDatasourceName} (source data source name), ${srcDatabaseName} (source database name), and ${srcTableName} (source table name).</li>
             * </ul>
             * <ol start="2">
             * <li>Add column rule (AddColumn)</li>
             * </ol>
             * <ul>
             * <li>Example: {&quot;columns&quot;:[{&quot;columnName&quot;:&quot;my_add_column&quot;,&quot;columnValueType&quot;:&quot;Constant&quot;,&quot;columnValue&quot;:&quot;123&quot;}]}</li>
             * <li>If not specified, the default rule is to neither add columns nor perform replication.</li>
             * <li>columnName: the name of the additional column.</li>
             * <li>columnValueType: the value type of the additional column. Valid values: Constant and Variable.</li>
             * <li>columnValue: the value of the additional column. When columnValueType is set to Constant, the value is a custom constant of the String type. When columnValueType is set to Variable, the value is a built-in variable. Valid built-in variables: EXECUTE_TIME (execution time, Long type), DB_NAME_SRC (source database name, String type), DATASOURCE_NAME_SRC (source data source name, String type), TABLE_NAME_SRC (source table name, String type), DB_NAME_DEST (destination database name, String type), DATASOURCE_NAME_DEST (destination data source name, String type), TABLE_NAME_DEST (destination table name, String type), and DB_NAME_SRC_TRANSED (transformed database name, String type).</li>
             * </ul>
             * <ol start="3">
             * <li>Define primary key columns for the destination table (DefinePrimaryKey)</li>
             * </ol>
             * <ul>
             * <li>Example: {&quot;columns&quot;:[&quot;ukcolumn1&quot;,&quot;ukcolumn2&quot;]}</li>
             * <li>If not specified, the source primary key columns are used by default.</li>
             * <li>When the destination table already exists: the data integration system does not modify the destination table schema. If the specified primary key columns are not in the destination column set, the node reports an error upon startup.</li>
             * <li>When the destination table uses automatic creation: the data integration system automatically creates the destination table schema, which includes the defined primary key columns. If the specified primary key columns are not in the destination column set, the node reports an error upon startup.</li>
             * </ul>
             * <ol start="4">
             * <li>DML operations handling rule (HandleDml)</li>
             * </ol>
             * <ul>
             * <li>Example: {&quot;dmlPolicies&quot;:[{&quot;dmlType&quot;:&quot;Delete&quot;,&quot;dmlAction&quot;:&quot;Filter&quot;,&quot;filterCondition&quot;:&quot;id &gt; 1&quot;}]}</li>
             * <li>If not specified, the default rule is Normal for Insert, Update, and Delete.</li>
             * <li>dmlType: the DML operations type. Valid values: Insert, Update, and Delete.</li>
             * <li>dmlAction: the DML operations handling policy. Valid values: Normal (process normally), Ignore (ignore), Filter (conditionally process normally, used when dmlType is Update or Delete), and LogicalDelete (logical delete).</li>
             * <li>filterCondition: the DML filter condition, used when dmlAction is set to Filter.</li>
             * </ul>
             * <ol start="5">
             * <li>Incremental condition (DefineIncrementalCondition)</li>
             * </ol>
             * <ul>
             * <li>Example: {&quot;where&quot;:&quot;id &gt; 0&quot;}</li>
             * <li>Specifies the incremental filter condition.</li>
             * </ul>
             * <ol start="6">
             * <li>Cycle scheduling parameters (DefineCycleScheduleSettings)</li>
             * </ol>
             * <ul>
             * <li>Example: {&quot;cronExpress&quot;:&quot; * * * * * *&quot;, &quot;cycleType&quot;:&quot;1&quot;}</li>
             * <li>Specifies the cycle node scheduling parameters.</li>
             * </ul>
             * <ol start="7">
             * <li>Define partition key (DefinePartitionKey)</li>
             * </ol>
             * <ul>
             * <li>Example: {&quot;columns&quot;:[&quot;id&quot;]}</li>
             * <li>Specifies the partition key.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{
             *       &quot;expression&quot;: &quot;${srcDatasoureName}_${srcDatabaseName}&quot;
             * }</p>
             */
            public Builder ruleExpression(String ruleExpression) {
                this.ruleExpression = ruleExpression;
                return this;
            }

            /**
             * <p>The rule name. When the action type and target type are the same, the rule name must be unique. The name cannot exceed 50 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>rename_rule_1</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The target type on which the action is applied. Valid values:</p>
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
