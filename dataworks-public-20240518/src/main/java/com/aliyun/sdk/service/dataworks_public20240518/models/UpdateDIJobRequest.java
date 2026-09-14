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
    @Deprecated
    private Long DIJobId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileSpec")
    private String fileSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobSettings")
    private JobSettings jobSettings;

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
    @com.aliyun.core.annotation.NameInMap("TableMappings")
    private java.util.List<TableMappings> tableMappings;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TransformationRules")
    private java.util.List<TransformationRules> transformationRules;

    private UpdateDIJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.DIJobId = builder.DIJobId;
        this.description = builder.description;
        this.fileSpec = builder.fileSpec;
        this.id = builder.id;
        this.jobSettings = builder.jobSettings;
        this.owner = builder.owner;
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
     * @return fileSpec
     */
    public String getFileSpec() {
        return this.fileSpec;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return jobSettings
     */
    public JobSettings getJobSettings() {
        return this.jobSettings;
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

    public static final class Builder extends Request.Builder<UpdateDIJobRequest, Builder> {
        private String regionId; 
        private Long DIJobId; 
        private String description; 
        private String fileSpec; 
        private Long id; 
        private JobSettings jobSettings; 
        private String owner; 
        private Long projectId; 
        private ResourceSettings resourceSettings; 
        private java.util.List<TableMappings> tableMappings; 
        private java.util.List<TransformationRules> transformationRules; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDIJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.DIJobId = request.DIJobId;
            this.description = request.description;
            this.fileSpec = request.fileSpec;
            this.id = request.id;
            this.jobSettings = request.jobSettings;
            this.owner = request.owner;
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
         * <p>This parameter is deprecated. Use the <code>Id</code> parameter instead.</p>
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
         * <p>The description of the synchronization job.</p>
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
         * <p>The job configuration in script mode.</p>
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
         * <p>The ID of the synchronization job.</p>
         * 
         * <strong>example:</strong>
         * <p>11588</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The settings for the synchronization job. This includes DDL handling settings, data type mappings for columns between the source and destination, and runtime parameters.</p>
         */
        public Builder jobSettings(JobSettings jobSettings) {
            String jobSettingsShrink = shrink(jobSettings, "JobSettings", "json");
            this.putBodyParameter("JobSettings", jobSettingsShrink);
            this.jobSettings = jobSettings;
            return this;
        }

        /**
         * <p>The owner of the synchronization job.</p>
         * 
         * <strong>example:</strong>
         * <p>95279527</p>
         */
        public Builder owner(String owner) {
            this.putQueryParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * <p>The ID of the DataWorks workspace. You can call the <a href="https://help.aliyun.com/document_detail/178393.html">ListProjects</a> operation to get the workspace ID.</p>
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
         * <p>A list of object transformation mappings. Each mapping specifies a set of selection rules for source objects and a list of transformation rules that apply to the selected objects.</p>
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
         * <p>A list of transformation rule definitions.</p>
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

            private Builder() {
            } 

            private Builder(ColumnDataTypeSettings model) {
                this.destinationDataType = model.destinationDataType;
                this.sourceDataType = model.sourceDataType;
            } 

            /**
             * <p>The destination data type. Examples: <code>bigint</code>, <code>boolean</code>, <code>string</code>, <code>text</code>, <code>datetime</code>, <code>timestamp</code>, <code>decimal</code>, and <code>binary</code>. The supported data types depend on the destination data source.</p>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder destinationDataType(String destinationDataType) {
                this.destinationDataType = destinationDataType;
                return this;
            }

            /**
             * <p>The source data type. Examples: <code>bigint</code>, <code>boolean</code>, <code>string</code>, <code>text</code>, <code>datetime</code>, <code>timestamp</code>, <code>decimal</code>, and <code>binary</code>. The supported data types depend on the source data source.</p>
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

            private Builder() {
            } 

            private Builder(CycleScheduleSettings model) {
                this.scheduleParameters = model.scheduleParameters;
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

            private Builder() {
            } 

            private Builder(DdlHandlingSettings model) {
                this.action = model.action;
                this.type = model.type;
            } 

            /**
             * <p>The handling action. Valid values:</p>
             * <ul>
             * <li><p><code>Ignore</code>: Ignores the DDL message.</p>
             * </li>
             * <li><p><code>Critical</code>: Reports an error and terminates the synchronization job.</p>
             * </li>
             * <li><p><code>Normal</code>: Processes the DDL message normally.</p>
             * </li>
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
             * <li><p><code>RenameColumn</code></p>
             * </li>
             * <li><p><code>ModifyColumn</code></p>
             * </li>
             * <li><p><code>CreateTable</code></p>
             * </li>
             * <li><p><code>TruncateTable</code></p>
             * </li>
             * <li><p><code>DropTable</code></p>
             * </li>
             * <li><p><code>DropColumn</code></p>
             * </li>
             * <li><p><code>AddColumn</code></p>
             * </li>
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

            private Builder() {
            } 

            private Builder(RuntimeSettings model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>The name of the setting. Valid values:</p>
             * <ul>
             * <li><p><code>src.offline.datasource.max.connection</code>: The maximum number of concurrent connections to the source for an offline synchronization job.</p>
             * </li>
             * <li><p><code>dst.offline.truncate</code>: Specifies whether to truncate the destination table before an offline synchronization job.</p>
             * </li>
             * <li><p><code>runtime.offline.speed.limit.enable</code>: Specifies whether to enable speed limiting for an offline synchronization job.</p>
             * </li>
             * <li><p><code>runtime.offline.concurrent</code>: The concurrency level for an offline synchronization job.</p>
             * </li>
             * <li><p><code>runtime.enable.auto.create.schema</code>: Specifies whether to automatically create a schema at the destination.</p>
             * </li>
             * <li><p><code>runtime.realtime.concurrent</code>: The concurrency level for a real-time synchronization job.</p>
             * </li>
             * <li><p><code>runtime.realtime.failover.minute.dataxcdc</code>: The number of minutes to wait before a failover retry.</p>
             * </li>
             * <li><p><code>runtime.realtime.failover.times.dataxcdc</code>: The number of failover retries.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>src.offline.datasource.max.connection</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value of the setting.</p>
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
     * {@link UpdateDIJobRequest} extends {@link TeaModel}
     *
     * <p>UpdateDIJobRequest</p>
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
             * <p>The job settings for specific data synchronization channels. You can apply special configurations to certain channels. Currently, <code>Holo2Holo</code> (synchronization from Hologres to Hologres) and <code>Holo2Kafka</code> (synchronization from Hologres to Kafka) are supported.</p>
             * <ol>
             * <li><code>Holo2Kafka</code></li>
             * </ol>
             * <ul>
             * <li><p>Example: <code>{&quot;destinationChannelSettings&quot;:{&quot;kafkaClientProperties&quot;:[{&quot;key&quot;:&quot;linger.ms&quot;,&quot;value&quot;:&quot;100&quot;}],&quot;keyColumns&quot;:[&quot;col3&quot;],&quot;writeMode&quot;:&quot;canal&quot;}}</code>
             * <code>kafkaClientProperties</code>: The Kafka producer parameters used when writing to Kafka.</p>
             * </li>
             * <li><p><code>keyColumns</code>: The columns whose values are written to the key of a Kafka message.</p>
             * </li>
             * <li><p><code>writeMode</code>: The format for writing data to Kafka. Valid values: <code>json</code> and <code>canal</code>.</p>
             * </li>
             * </ul>
             * <ol start="2">
             * <li><code>Holo2Holo</code></li>
             * </ol>
             * <ul>
             * <li><p>Example: <code>{&quot;destinationChannelSettings&quot;:{&quot;conflictMode&quot;:&quot;replace&quot;,&quot;dynamicColumnAction&quot;:&quot;replay&quot;,&quot;writeMode&quot;:&quot;replay&quot;}}</code></p>
             * </li>
             * <li><p><code>conflictMode</code>: The conflict handling policy for writing data to Hologres. Valid values: <code>replace</code> (overwrite) and <code>ignore</code> (ignore).</p>
             * </li>
             * <li><p><code>writeMode</code>: The method for writing data to Hologres. Valid values: <code>replay</code> and <code>insert</code>.</p>
             * </li>
             * <li><p><code>dynamicColumnAction</code>: The action for handling dynamic columns when writing data to Hologres. Valid values: <code>replay</code>, <code>insert</code>, and <code>ignore</code>.</p>
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
             * <p>An array of column data type mappings.</p>
             * <blockquote>
             * <p>[&quot;ColumnDataTypeSettings&quot;:[ { &quot;SourceDataType&quot;:&quot;Bigint&quot;, &quot;DestinationDataType&quot;:&quot;Text&quot; } ]</p>
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
             * <p>An array of DDL handling settings.</p>
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
     * {@link UpdateDIJobRequest} extends {@link TeaModel}
     *
     * <p>UpdateDIJobRequest</p>
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
             * <p>The number of CUs for the Data Integration resource group used by the offline synchronization job.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder requestedCu(Double requestedCu) {
                this.requestedCu = requestedCu;
                return this;
            }

            /**
             * <p>The name of the Data Integration resource group used by the offline synchronization job.</p>
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
     * {@link UpdateDIJobRequest} extends {@link TeaModel}
     *
     * <p>UpdateDIJobRequest</p>
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
             * <p>The number of CUs for the Data Integration resource group used by the real-time synchronization job.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder requestedCu(Double requestedCu) {
                this.requestedCu = requestedCu;
                return this;
            }

            /**
             * <p>The name of the Data Integration resource group used by the real-time synchronization job.</p>
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
     * {@link UpdateDIJobRequest} extends {@link TeaModel}
     *
     * <p>UpdateDIJobRequest</p>
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
             * <p>The number of CUs for the scheduling resource group used by the offline synchronization job.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder requestedCu(Double requestedCu) {
                this.requestedCu = requestedCu;
                return this;
            }

            /**
             * <p>The name of the scheduling resource group used by the offline synchronization job.</p>
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

            private Builder() {
            } 

            private Builder(ResourceSettings model) {
                this.offlineResourceSettings = model.offlineResourceSettings;
                this.realtimeResourceSettings = model.realtimeResourceSettings;
                this.scheduleResourceSettings = model.scheduleResourceSettings;
            } 

            /**
             * <p>The resource settings for the offline synchronization job.</p>
             */
            public Builder offlineResourceSettings(OfflineResourceSettings offlineResourceSettings) {
                this.offlineResourceSettings = offlineResourceSettings;
                return this;
            }

            /**
             * <p>The resource settings for the real-time synchronization job.</p>
             */
            public Builder realtimeResourceSettings(RealtimeResourceSettings realtimeResourceSettings) {
                this.realtimeResourceSettings = realtimeResourceSettings;
                return this;
            }

            /**
             * <p>The scheduling resource settings.</p>
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

            private Builder() {
            } 

            private Builder(SourceObjectSelectionRules model) {
                this.action = model.action;
                this.expression = model.expression;
                this.expressionType = model.expressionType;
                this.objectType = model.objectType;
            } 

            /**
             * <p>The selection action. Valid values: <code>Include</code> and <code>Exclude</code>.</p>
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
             * <p>The type of the expression. Valid values: <code>Exact</code> and <code>Regex</code>.</p>
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
             * <li><p><code>Table</code> (table)</p>
             * </li>
             * <li><p><code>Schema</code> (schema)</p>
             * </li>
             * <li><p><code>Database</code> (database)</p>
             * </li>
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

            private Builder() {
            } 

            private Builder(TableMappingsTransformationRules model) {
                this.ruleActionType = model.ruleActionType;
                this.ruleName = model.ruleName;
                this.ruleTargetType = model.ruleTargetType;
            } 

            /**
             * <p>The type of the action. Valid values:</p>
             * <ul>
             * <li><p><code>DefinePrimaryKey</code>: Defines a primary key.</p>
             * </li>
             * <li><p><code>Rename</code>: Renames an object.</p>
             * </li>
             * <li><p><code>AddColumn</code>: Adds a column.</p>
             * </li>
             * <li><p><code>HandleDml</code>: Handles DML operations.</p>
             * </li>
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
             * <p>The name of the transformation rule. The name must be unique for a specific combination of <code>RuleActionType</code> and <code>RuleTargetType</code> and can be up to 50 characters long.</p>
             * 
             * <strong>example:</strong>
             * <p>rename_rule_1</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The type of the target object. Valid values:</p>
             * <ul>
             * <li><p><code>Table</code> (table)</p>
             * </li>
             * <li><p><code>Schema</code> (schema)</p>
             * </li>
             * <li><p><code>Database</code> (database)</p>
             * </li>
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
     * {@link UpdateDIJobRequest} extends {@link TeaModel}
     *
     * <p>UpdateDIJobRequest</p>
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
             * <p>The rules for selecting source objects. Each rule can select a different type of source object to synchronize, such as a source database or table.</p>
             */
            public Builder sourceObjectSelectionRules(java.util.List<SourceObjectSelectionRules> sourceObjectSelectionRules) {
                this.sourceObjectSelectionRules = sourceObjectSelectionRules;
                return this;
            }

            /**
             * <p>The transformation rules for the source objects.</p>
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

            private Builder() {
            } 

            private Builder(TransformationRules model) {
                this.ruleActionType = model.ruleActionType;
                this.ruleExpression = model.ruleExpression;
                this.ruleName = model.ruleName;
                this.ruleTargetType = model.ruleTargetType;
            } 

            /**
             * <p>The type of the action. Valid values:</p>
             * <ul>
             * <li><p><code>DefinePrimaryKey</code>: Defines a primary key.</p>
             * </li>
             * <li><p><code>Rename</code>: Renames an object.</p>
             * </li>
             * <li><p><code>AddColumn</code>: Adds a column.</p>
             * </li>
             * <li><p><code>HandleDml</code>: Handles DML operations.</p>
             * </li>
             * <li><p><code>DefineIncrementalCondition</code>: Defines an incremental condition.</p>
             * </li>
             * <li><p><code>DefineCycleScheduleSettings</code>: Defines periodic scheduling settings.</p>
             * </li>
             * <li><p><code>DefinePartitionKey</code>: Defines a partition key.</p>
             * </li>
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
             * <p>The rule expression, specified as a JSON string.</p>
             * <ol>
             * <li>Rename rule (<code>Rename</code>)</li>
             * </ol>
             * <ul>
             * <li><p>Example: <code>{&quot;expression&quot;:&quot;${srcDatasourceName}_${srcDatabaseName}_0922&quot;}</code></p>
             * </li>
             * <li><p><code>expression</code>: The expression for the rename transformation rule. The expression supports variables, including <code>${srcDatasourceName}</code> (source data source name), <code>${srcDatabaseName}</code> (source database name), and <code>${srcTableName}</code> (source table name).</p>
             * </li>
             * </ul>
             * <ol start="2">
             * <li>Add column rule (<code>AddColumn</code>)</li>
             * </ol>
             * <ul>
             * <li><p>Example: <code>{&quot;columns&quot;:[{&quot;columnName&quot;:&quot;my_add_column&quot;,&quot;columnValueType&quot;:&quot;Constant&quot;,&quot;columnValue&quot;:&quot;123&quot;}]}</code></p>
             * </li>
             * <li><p>If this rule is not specified, no columns are added.</p>
             * </li>
             * <li><p><code>columnName</code>: The name of the column to add.</p>
             * </li>
             * <li><p><code>columnValueType</code>: The value type of the added column. Valid values: <code>Constant</code> and <code>Variable</code>.</p>
             * </li>
             * <li><p><code>columnValue</code>: The value of the added column. If <code>columnValueType</code> is <code>Constant</code>, the value is a custom constant of the string type. If <code>columnValueType</code> is <code>Variable</code>, the value is a built-in variable. Valid built-in variables: <code>EXECUTE_TIME</code> (execution time, Long type), <code>DB_NAME_SRC</code> (source database name, String type), <code>DATASOURCE_NAME_SRC</code> (source data source name, String type), <code>TABLE_NAME_SRC</code> (source table name, String type), <code>DB_NAME_DEST</code> (destination database name, String type), <code>DATASOURCE_NAME_DEST</code> (destination data source name, String type), <code>TABLE_NAME_DEST</code> (destination table name, String type), and <code>DB_NAME_SRC_TRANSED</code> (transformed database name, String type).</p>
             * </li>
             * </ul>
             * <ol start="3">
             * <li>Define primary key rule (<code>DefinePrimaryKey</code>)</li>
             * </ol>
             * <ul>
             * <li><p>Example: <code>{&quot;columns&quot;:[&quot;ukcolumn1&quot;,&quot;ukcolumn2&quot;]}</code></p>
             * </li>
             * <li><p>If this rule is not specified, the primary key of the source is used by default.</p>
             * </li>
             * <li><p>Data Integration does not modify the structure of an existing destination table. If a specified primary key column does not exist in the table, the synchronization job fails.</p>
             * </li>
             * <li><p>When a destination table is automatically created, Data Integration includes the defined primary key columns in the structure. If a specified primary key column is not in the destination column set, the synchronization job fails.</p>
             * </li>
             * </ul>
             * <ol start="4">
             * <li>DML handling rule (<code>HandleDml</code>)</li>
             * </ol>
             * <ul>
             * <li><p>Example: <code>{&quot;dmlPolicies&quot;:[{&quot;dmlType&quot;:&quot;Delete&quot;,&quot;dmlAction&quot;:&quot;Filter&quot;,&quot;filterCondition&quot;:&quot;id &gt; 1&quot;}]}</code></p>
             * </li>
             * <li><p>If this rule is not specified, the default action for <code>Insert</code>, <code>Update</code>, and <code>Delete</code> operations is <code>Normal</code>.</p>
             * </li>
             * <li><p><code>dmlType</code>: The DML operation type. Valid values: <code>Insert</code>, <code>Update</code>, and <code>Delete</code>.</p>
             * </li>
             * <li><p><code>dmlAction</code>: The DML handling policy. Valid values: <code>Normal</code> (process the operation), <code>Ignore</code> (ignore the operation), <code>Filter</code> (conditionally process the operation, used when <code>dmlType</code> is <code>Update</code> or <code>Delete</code>), and <code>LogicalDelete</code> (perform a logical delete).</p>
             * </li>
             * <li><p><code>filterCondition</code>: The DML filter condition, used when <code>dmlAction</code> is <code>Filter</code>.</p>
             * </li>
             * </ul>
             * <ol start="5">
             * <li>Incremental condition rule (<code>DefineIncrementalCondition</code>)</li>
             * </ol>
             * <ul>
             * <li><p>Example: <code>{&quot;where&quot;:&quot;id &gt; 0&quot;}</code></p>
             * </li>
             * <li><p>The <code>WHERE</code> clause for the incremental condition.</p>
             * </li>
             * </ul>
             * <ol start="6">
             * <li>Periodic scheduling rule (<code>DefineCycleScheduleSettings</code>)</li>
             * </ol>
             * <ul>
             * <li><p>Example: <code>{&quot;cronExpress&quot;:&quot; * * * * * *&quot;, &quot;cycleType&quot;:&quot;1&quot;}</code></p>
             * </li>
             * <li><p>Specifies the scheduling parameters for a periodic job.</p>
             * </li>
             * </ul>
             * <ol start="7">
             * <li>Define partition key rule (<code>DefinePartitionKey</code>)</li>
             * </ol>
             * <ul>
             * <li><p>Example: <code>{&quot;columns&quot;:[&quot;id&quot;]}</code></p>
             * </li>
             * <li><p>Specifies the partition key.</p>
             * </li>
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
             * <p>The name of the transformation rule. The name must be unique for a specific combination of <code>RuleActionType</code> and <code>RuleTargetType</code> and can be up to 50 characters long.</p>
             * 
             * <strong>example:</strong>
             * <p>rename_rule_1</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The type of the target object. Valid values:</p>
             * <ul>
             * <li><p><code>Table</code> (table)</p>
             * </li>
             * <li><p><code>Schema</code> (schema)</p>
             * </li>
             * <li><p><code>Database</code> (database)</p>
             * </li>
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
