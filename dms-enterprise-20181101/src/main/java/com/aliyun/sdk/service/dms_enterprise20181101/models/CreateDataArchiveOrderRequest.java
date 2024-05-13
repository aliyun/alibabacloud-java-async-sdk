// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDataArchiveOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateDataArchiveOrderRequest</p>
 */
public class CreateDataArchiveOrderRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comment")
    @com.aliyun.core.annotation.Validation(required = true)
    private String comment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Param")
    @com.aliyun.core.annotation.Validation(required = true)
    private Param param;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentId")
    private Long parentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PluginType")
    private String pluginType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelatedUserList")
    private java.util.List < String > relatedUserList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private CreateDataArchiveOrderRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.comment = builder.comment;
        this.param = builder.param;
        this.parentId = builder.parentId;
        this.pluginType = builder.pluginType;
        this.relatedUserList = builder.relatedUserList;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataArchiveOrderRequest create() {
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
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return param
     */
    public Param getParam() {
        return this.param;
    }

    /**
     * @return parentId
     */
    public Long getParentId() {
        return this.parentId;
    }

    /**
     * @return pluginType
     */
    public String getPluginType() {
        return this.pluginType;
    }

    /**
     * @return relatedUserList
     */
    public java.util.List < String > getRelatedUserList() {
        return this.relatedUserList;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<CreateDataArchiveOrderRequest, Builder> {
        private String regionId; 
        private String comment; 
        private Param param; 
        private Long parentId; 
        private String pluginType; 
        private java.util.List < String > relatedUserList; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataArchiveOrderRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.comment = request.comment;
            this.param = request.param;
            this.parentId = request.parentId;
            this.pluginType = request.pluginType;
            this.relatedUserList = request.relatedUserList;
            this.tid = request.tid;
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
         * The description of the task.
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * The parameters for archiving data.
         */
        public Builder param(Param param) {
            String paramShrink = shrink(param, "Param", "json");
            this.putQueryParameter("Param", paramShrink);
            this.param = param;
            return this;
        }

        /**
         * The ID of the parent ticket. A parent ticket is generated only when a child ticket is created.
         */
        public Builder parentId(Long parentId) {
            this.putQueryParameter("ParentId", parentId);
            this.parentId = parentId;
            return this;
        }

        /**
         * The type of the plug-in. Default value: DATA_ARCHIVE.
         */
        public Builder pluginType(String pluginType) {
            this.putQueryParameter("PluginType", pluginType);
            this.pluginType = pluginType;
            return this;
        }

        /**
         * The list of the related users.
         */
        public Builder relatedUserList(java.util.List < String > relatedUserList) {
            String relatedUserListShrink = shrink(relatedUserList, "RelatedUserList", "json");
            this.putQueryParameter("RelatedUserList", relatedUserListShrink);
            this.relatedUserList = relatedUserList;
            return this;
        }

        /**
         * The tenant ID. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to obtain the tenant ID.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public CreateDataArchiveOrderRequest build() {
            return new CreateDataArchiveOrderRequest(this);
        } 

    } 

    public static class TableIncludes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TableName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("TableWhere")
        private String tableWhere;

        private TableIncludes(Builder builder) {
            this.tableName = builder.tableName;
            this.tableWhere = builder.tableWhere;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableIncludes create() {
            return builder().build();
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return tableWhere
         */
        public String getTableWhere() {
            return this.tableWhere;
        }

        public static final class Builder {
            private String tableName; 
            private String tableWhere; 

            /**
             * The name of the table.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * The filter condition specified by the WHERE clause of the archiving configuration. If a time variable is used in the filter condition, the filter condition is specified in the following format: field name <=\"${variable name}\". The variable name in the filter condition must be the same as the Name value of Variables.
             */
            public Builder tableWhere(String tableWhere) {
                this.tableWhere = tableWhere;
                return this;
            }

            public TableIncludes build() {
                return new TableIncludes(this);
            } 

        } 

    }
    public static class Variables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Pattern")
        private String pattern;

        private Variables(Builder builder) {
            this.name = builder.name;
            this.pattern = builder.pattern;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Variables create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pattern
         */
        public String getPattern() {
            return this.pattern;
        }

        public static final class Builder {
            private String name; 
            private String pattern; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Pattern.
             */
            public Builder pattern(String pattern) {
                this.pattern = pattern;
                return this;
            }

            public Variables build() {
                return new Variables(this);
            } 

        } 

    }
    public static class Param extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArchiveMethod")
        @com.aliyun.core.annotation.Validation(required = true)
        private String archiveMethod;

        @com.aliyun.core.annotation.NameInMap("CronStr")
        private String cronStr;

        @com.aliyun.core.annotation.NameInMap("DatabaseId")
        private String databaseId;

        @com.aliyun.core.annotation.NameInMap("Logic")
        private Boolean logic;

        @com.aliyun.core.annotation.NameInMap("OrderAfter")
        private java.util.List < String > orderAfter;

        @com.aliyun.core.annotation.NameInMap("RunMethod")
        @com.aliyun.core.annotation.Validation(required = true)
        private String runMethod;

        @com.aliyun.core.annotation.NameInMap("SourceCatalogName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String sourceCatalogName;

        @com.aliyun.core.annotation.NameInMap("SourceInstanceName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String sourceInstanceName;

        @com.aliyun.core.annotation.NameInMap("SourceSchemaName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String sourceSchemaName;

        @com.aliyun.core.annotation.NameInMap("TableIncludes")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < TableIncludes> tableIncludes;

        @com.aliyun.core.annotation.NameInMap("TableMapping")
        private java.util.List < String > tableMapping;

        @com.aliyun.core.annotation.NameInMap("TargetInstanceHost")
        @com.aliyun.core.annotation.Validation(required = true)
        private String targetInstanceHost;

        @com.aliyun.core.annotation.NameInMap("Variables")
        private java.util.List < Variables> variables;

        private Param(Builder builder) {
            this.archiveMethod = builder.archiveMethod;
            this.cronStr = builder.cronStr;
            this.databaseId = builder.databaseId;
            this.logic = builder.logic;
            this.orderAfter = builder.orderAfter;
            this.runMethod = builder.runMethod;
            this.sourceCatalogName = builder.sourceCatalogName;
            this.sourceInstanceName = builder.sourceInstanceName;
            this.sourceSchemaName = builder.sourceSchemaName;
            this.tableIncludes = builder.tableIncludes;
            this.tableMapping = builder.tableMapping;
            this.targetInstanceHost = builder.targetInstanceHost;
            this.variables = builder.variables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Param create() {
            return builder().build();
        }

        /**
         * @return archiveMethod
         */
        public String getArchiveMethod() {
            return this.archiveMethod;
        }

        /**
         * @return cronStr
         */
        public String getCronStr() {
            return this.cronStr;
        }

        /**
         * @return databaseId
         */
        public String getDatabaseId() {
            return this.databaseId;
        }

        /**
         * @return logic
         */
        public Boolean getLogic() {
            return this.logic;
        }

        /**
         * @return orderAfter
         */
        public java.util.List < String > getOrderAfter() {
            return this.orderAfter;
        }

        /**
         * @return runMethod
         */
        public String getRunMethod() {
            return this.runMethod;
        }

        /**
         * @return sourceCatalogName
         */
        public String getSourceCatalogName() {
            return this.sourceCatalogName;
        }

        /**
         * @return sourceInstanceName
         */
        public String getSourceInstanceName() {
            return this.sourceInstanceName;
        }

        /**
         * @return sourceSchemaName
         */
        public String getSourceSchemaName() {
            return this.sourceSchemaName;
        }

        /**
         * @return tableIncludes
         */
        public java.util.List < TableIncludes> getTableIncludes() {
            return this.tableIncludes;
        }

        /**
         * @return tableMapping
         */
        public java.util.List < String > getTableMapping() {
            return this.tableMapping;
        }

        /**
         * @return targetInstanceHost
         */
        public String getTargetInstanceHost() {
            return this.targetInstanceHost;
        }

        /**
         * @return variables
         */
        public java.util.List < Variables> getVariables() {
            return this.variables;
        }

        public static final class Builder {
            private String archiveMethod; 
            private String cronStr; 
            private String databaseId; 
            private Boolean logic; 
            private java.util.List < String > orderAfter; 
            private String runMethod; 
            private String sourceCatalogName; 
            private String sourceInstanceName; 
            private String sourceSchemaName; 
            private java.util.List < TableIncludes> tableIncludes; 
            private java.util.List < String > tableMapping; 
            private String targetInstanceHost; 
            private java.util.List < Variables> variables; 

            /**
             * The type of the destination database for archiving data. Valid values:
             * <p>
             * 
             * >  If you set ArchiveMethod to a value other than inner_oss, you must connect the destination database for archiving data to Data Management (DMS) before you create the data archiving ticket. After the database is connected to DMS, the database is displayed in the Instances Connected section of the DMS console.
             * 
             * *   **inner_oss**: dedicated storage, which is a built-in Object Storage Service (OSS) bucket.
             * *   **oss_userself**: OSS bucket of the user.
             * *   **mysql**: ApsaraDB RDS for MySQL instance.
             * *   **polardb**: PolarDB for MySQL cluster.
             * *   **adb_mysql**: AnalyticDB for MySQL V3.0 cluster.
             * *   **lindorm**: ApsaraDB for Lindorm instance.
             */
            public Builder archiveMethod(String archiveMethod) {
                this.archiveMethod = archiveMethod;
                return this;
            }

            /**
             * A crontab expression that specifies the scheduling cycle to run the task. For more information, see the [Crontab expressions](~~206581~~) section of the "Create shadow tables for synchronization" topic. This parameter is required if RunMethod is set to schedule.
             */
            public Builder cronStr(String cronStr) {
                this.cronStr = cronStr;
                return this;
            }

            /**
             * DatabaseId.
             */
            public Builder databaseId(String databaseId) {
                this.databaseId = databaseId;
                return this;
            }

            /**
             * Specifies whether the database is a logical database.
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * The post behaviors.
             */
            public Builder orderAfter(java.util.List < String > orderAfter) {
                this.orderAfter = orderAfter;
                return this;
            }

            /**
             * The method that is used to run the data archiving task. Valid values:
             * <p>
             * 
             * *   **schedule**: The data archiving task is periodically scheduled.
             * *   **now**: The data archiving task is immediately run.
             */
            public Builder runMethod(String runMethod) {
                this.runMethod = runMethod;
                return this;
            }

            /**
             * The catalog of the source database. Valid values:
             * <p>
             * 
             * *   **def**: Set this parameter to def if the source database is of the two-layer logical schema, such as a MySQL database, a PolarDB for MySQL cluster, or an AnalyticDB for MySQL instance.
             * *   **An empty string**: Set this parameter to an empty string if the source database is an ApsaraDB for Lindorm or ApsaraDB for MongoDB instance.
             * *   **Catalog name**: Set this parameter to the catalog name of the source database if the source database is of the three-layer logical schema, such as a PostgreSQL database.
             */
            public Builder sourceCatalogName(String sourceCatalogName) {
                this.sourceCatalogName = sourceCatalogName;
                return this;
            }

            /**
             * The name of the source instance.
             */
            public Builder sourceInstanceName(String sourceInstanceName) {
                this.sourceInstanceName = sourceInstanceName;
                return this;
            }

            /**
             * The schema name of the source database. The schema name of the source database is the same as that of the destination database. If the source database is a MySQL database, this parameter specifies the name of the source database. If the source database is a PostgreSQL database, this parameter specifies the schema name of the source database.
             */
            public Builder sourceSchemaName(String sourceSchemaName) {
                this.sourceSchemaName = sourceSchemaName;
                return this;
            }

            /**
             * The collection of tables to be archived.
             */
            public Builder tableIncludes(java.util.List < TableIncludes> tableIncludes) {
                this.tableIncludes = tableIncludes;
                return this;
            }

            /**
             * The table names mapped to the destination database. If you call an API operation to create the data archiving ticket, you do not need to specify this parameter. The default value is used.
             */
            public Builder tableMapping(java.util.List < String > tableMapping) {
                this.tableMapping = tableMapping;
                return this;
            }

            /**
             * The host of the destination instance. If the destination instance can be accessed over an internal network or the Internet, preferentially set the value to the internal endpoint of the destination instance.
             * <p>
             * 
             * *   If the data is archived in an OSS bucket, set the value to the name of the bucket.
             * *   If the data is archived in the dedicated storage space, set the value to inner_oss.
             */
            public Builder targetInstanceHost(String targetInstanceHost) {
                this.targetInstanceHost = targetInstanceHost;
                return this;
            }

            /**
             * The configuration of archiving variables. You can use a time variable as a filter condition for archiving data. Each variable has two attributes: name and pattern.
             */
            public Builder variables(java.util.List < Variables> variables) {
                this.variables = variables;
                return this;
            }

            public Param build() {
                return new Param(this);
            } 

        } 

    }
}
