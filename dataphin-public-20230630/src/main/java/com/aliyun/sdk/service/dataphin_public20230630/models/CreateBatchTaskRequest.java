// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link CreateBatchTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateBatchTaskRequest</p>
 */
public class CreateBatchTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private CreateCommand createCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    private CreateBatchTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.createCommand = builder.createCommand;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBatchTaskRequest create() {
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
     * @return createCommand
     */
    public CreateCommand getCreateCommand() {
        return this.createCommand;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return opUserId
     */
    public String getOpUserId() {
        return this.opUserId;
    }

    public static final class Builder extends Request.Builder<CreateBatchTaskRequest, Builder> {
        private String regionId; 
        private CreateCommand createCommand; 
        private Long opTenantId; 
        private String opUserId; 

        private Builder() {
            super();
        } 

        private Builder(CreateBatchTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.createCommand = request.createCommand;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
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
         * <p>The create command.</p>
         * <p>This parameter is required.</p>
         */
        public Builder createCommand(CreateCommand createCommand) {
            String createCommandShrink = shrink(createCommand, "CreateCommand", "json");
            this.putBodyParameter("CreateCommand", createCommandShrink);
            this.createCommand = createCommand;
            return this;
        }

        /**
         * <p>The tenant ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>The ID of the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        @Override
        public CreateBatchTaskRequest build() {
            return new CreateBatchTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateBatchTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateBatchTaskRequest</p>
     */
    public static class DatabricksPythonConnectInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DevHttpPath")
        private String devHttpPath;

        @com.aliyun.core.annotation.NameInMap("EnableDatabricksPythonConnect")
        private Boolean enableDatabricksPythonConnect;

        @com.aliyun.core.annotation.NameInMap("ProdHttpPath")
        private String prodHttpPath;

        private DatabricksPythonConnectInfo(Builder builder) {
            this.devHttpPath = builder.devHttpPath;
            this.enableDatabricksPythonConnect = builder.enableDatabricksPythonConnect;
            this.prodHttpPath = builder.prodHttpPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabricksPythonConnectInfo create() {
            return builder().build();
        }

        /**
         * @return devHttpPath
         */
        public String getDevHttpPath() {
            return this.devHttpPath;
        }

        /**
         * @return enableDatabricksPythonConnect
         */
        public Boolean getEnableDatabricksPythonConnect() {
            return this.enableDatabricksPythonConnect;
        }

        /**
         * @return prodHttpPath
         */
        public String getProdHttpPath() {
            return this.prodHttpPath;
        }

        public static final class Builder {
            private String devHttpPath; 
            private Boolean enableDatabricksPythonConnect; 
            private String prodHttpPath; 

            private Builder() {
            } 

            private Builder(DatabricksPythonConnectInfo model) {
                this.devHttpPath = model.devHttpPath;
                this.enableDatabricksPythonConnect = model.enableDatabricksPythonConnect;
                this.prodHttpPath = model.prodHttpPath;
            } 

            /**
             * <p>The HTTP path for the development environment.</p>
             * 
             * <strong>example:</strong>
             * <p>/sql/1.0/warehouses/dev</p>
             */
            public Builder devHttpPath(String devHttpPath) {
                this.devHttpPath = devHttpPath;
                return this;
            }

            /**
             * <p>Specifies whether to enable Databricks Python connect.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableDatabricksPythonConnect(Boolean enableDatabricksPythonConnect) {
                this.enableDatabricksPythonConnect = enableDatabricksPythonConnect;
                return this;
            }

            /**
             * <p>The HTTP path for the production environment.</p>
             * 
             * <strong>example:</strong>
             * <p>/sql/1.0/warehouses/prod</p>
             */
            public Builder prodHttpPath(String prodHttpPath) {
                this.prodHttpPath = prodHttpPath;
                return this;
            }

            public DatabricksPythonConnectInfo build() {
                return new DatabricksPythonConnectInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateBatchTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateBatchTaskRequest</p>
     */
    public static class PaiConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExperimentId")
        private String experimentId;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("WorkSpaceId")
        private String workSpaceId;

        private PaiConfig(Builder builder) {
            this.experimentId = builder.experimentId;
            this.region = builder.region;
            this.workSpaceId = builder.workSpaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PaiConfig create() {
            return builder().build();
        }

        /**
         * @return experimentId
         */
        public String getExperimentId() {
            return this.experimentId;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return workSpaceId
         */
        public String getWorkSpaceId() {
            return this.workSpaceId;
        }

        public static final class Builder {
            private String experimentId; 
            private String region; 
            private String workSpaceId; 

            private Builder() {
            } 

            private Builder(PaiConfig model) {
                this.experimentId = model.experimentId;
                this.region = model.region;
                this.workSpaceId = model.workSpaceId;
            } 

            /**
             * <p>The ID of the PAI experiment.</p>
             * 
             * <strong>example:</strong>
             * <p>789012</p>
             */
            public Builder experimentId(String experimentId) {
                this.experimentId = experimentId;
                return this;
            }

            /**
             * <p>The PAI region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The ID of the PAI workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder workSpaceId(String workSpaceId) {
                this.workSpaceId = workSpaceId;
                return this;
            }

            public PaiConfig build() {
                return new PaiConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateBatchTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateBatchTaskRequest</p>
     */
    public static class CreateCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CodeTemplateId")
        private String codeTemplateId;

        @com.aliyun.core.annotation.NameInMap("CodeTemplateVersion")
        private Integer codeTemplateVersion;

        @com.aliyun.core.annotation.NameInMap("DataSourceCatalog")
        private String dataSourceCatalog;

        @com.aliyun.core.annotation.NameInMap("DataSourceId")
        private String dataSourceId;

        @com.aliyun.core.annotation.NameInMap("DataSourceSchema")
        private String dataSourceSchema;

        @com.aliyun.core.annotation.NameInMap("DatabricksPythonConnectInfo")
        private DatabricksPythonConnectInfo databricksPythonConnectInfo;

        @com.aliyun.core.annotation.NameInMap("Description")
        @com.aliyun.core.annotation.Validation(required = true)
        private String description;

        @com.aliyun.core.annotation.NameInMap("DevelopOwnerIdList")
        private java.util.List<String> developOwnerIdList;

        @com.aliyun.core.annotation.NameInMap("Directory")
        @com.aliyun.core.annotation.Validation(required = true)
        private String directory;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("OpsOwnerIdList")
        private java.util.List<String> opsOwnerIdList;

        @com.aliyun.core.annotation.NameInMap("PaiConfig")
        private PaiConfig paiConfig;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("PythonModuleList")
        private java.util.List<String> pythonModuleList;

        @com.aliyun.core.annotation.NameInMap("ScheduleType")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer scheduleType;

        @com.aliyun.core.annotation.NameInMap("SparkDynamicResourceSwitch")
        private Boolean sparkDynamicResourceSwitch;

        @com.aliyun.core.annotation.NameInMap("SparkResourceEffectScope")
        private String sparkResourceEffectScope;

        @com.aliyun.core.annotation.NameInMap("SparkSqlResourceConfigMap")
        private String sparkSqlResourceConfigMap;

        @com.aliyun.core.annotation.NameInMap("SparkVersion")
        private String sparkVersion;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer taskType;

        private CreateCommand(Builder builder) {
            this.codeTemplateId = builder.codeTemplateId;
            this.codeTemplateVersion = builder.codeTemplateVersion;
            this.dataSourceCatalog = builder.dataSourceCatalog;
            this.dataSourceId = builder.dataSourceId;
            this.dataSourceSchema = builder.dataSourceSchema;
            this.databricksPythonConnectInfo = builder.databricksPythonConnectInfo;
            this.description = builder.description;
            this.developOwnerIdList = builder.developOwnerIdList;
            this.directory = builder.directory;
            this.engine = builder.engine;
            this.name = builder.name;
            this.opsOwnerIdList = builder.opsOwnerIdList;
            this.paiConfig = builder.paiConfig;
            this.projectId = builder.projectId;
            this.pythonModuleList = builder.pythonModuleList;
            this.scheduleType = builder.scheduleType;
            this.sparkDynamicResourceSwitch = builder.sparkDynamicResourceSwitch;
            this.sparkResourceEffectScope = builder.sparkResourceEffectScope;
            this.sparkSqlResourceConfigMap = builder.sparkSqlResourceConfigMap;
            this.sparkVersion = builder.sparkVersion;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateCommand create() {
            return builder().build();
        }

        /**
         * @return codeTemplateId
         */
        public String getCodeTemplateId() {
            return this.codeTemplateId;
        }

        /**
         * @return codeTemplateVersion
         */
        public Integer getCodeTemplateVersion() {
            return this.codeTemplateVersion;
        }

        /**
         * @return dataSourceCatalog
         */
        public String getDataSourceCatalog() {
            return this.dataSourceCatalog;
        }

        /**
         * @return dataSourceId
         */
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        /**
         * @return dataSourceSchema
         */
        public String getDataSourceSchema() {
            return this.dataSourceSchema;
        }

        /**
         * @return databricksPythonConnectInfo
         */
        public DatabricksPythonConnectInfo getDatabricksPythonConnectInfo() {
            return this.databricksPythonConnectInfo;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return developOwnerIdList
         */
        public java.util.List<String> getDevelopOwnerIdList() {
            return this.developOwnerIdList;
        }

        /**
         * @return directory
         */
        public String getDirectory() {
            return this.directory;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return opsOwnerIdList
         */
        public java.util.List<String> getOpsOwnerIdList() {
            return this.opsOwnerIdList;
        }

        /**
         * @return paiConfig
         */
        public PaiConfig getPaiConfig() {
            return this.paiConfig;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return pythonModuleList
         */
        public java.util.List<String> getPythonModuleList() {
            return this.pythonModuleList;
        }

        /**
         * @return scheduleType
         */
        public Integer getScheduleType() {
            return this.scheduleType;
        }

        /**
         * @return sparkDynamicResourceSwitch
         */
        public Boolean getSparkDynamicResourceSwitch() {
            return this.sparkDynamicResourceSwitch;
        }

        /**
         * @return sparkResourceEffectScope
         */
        public String getSparkResourceEffectScope() {
            return this.sparkResourceEffectScope;
        }

        /**
         * @return sparkSqlResourceConfigMap
         */
        public String getSparkSqlResourceConfigMap() {
            return this.sparkSqlResourceConfigMap;
        }

        /**
         * @return sparkVersion
         */
        public String getSparkVersion() {
            return this.sparkVersion;
        }

        /**
         * @return taskType
         */
        public Integer getTaskType() {
            return this.taskType;
        }

        public static final class Builder {
            private String codeTemplateId; 
            private Integer codeTemplateVersion; 
            private String dataSourceCatalog; 
            private String dataSourceId; 
            private String dataSourceSchema; 
            private DatabricksPythonConnectInfo databricksPythonConnectInfo; 
            private String description; 
            private java.util.List<String> developOwnerIdList; 
            private String directory; 
            private String engine; 
            private String name; 
            private java.util.List<String> opsOwnerIdList; 
            private PaiConfig paiConfig; 
            private Long projectId; 
            private java.util.List<String> pythonModuleList; 
            private Integer scheduleType; 
            private Boolean sparkDynamicResourceSwitch; 
            private String sparkResourceEffectScope; 
            private String sparkSqlResourceConfigMap; 
            private String sparkVersion; 
            private Integer taskType; 

            private Builder() {
            } 

            private Builder(CreateCommand model) {
                this.codeTemplateId = model.codeTemplateId;
                this.codeTemplateVersion = model.codeTemplateVersion;
                this.dataSourceCatalog = model.dataSourceCatalog;
                this.dataSourceId = model.dataSourceId;
                this.dataSourceSchema = model.dataSourceSchema;
                this.databricksPythonConnectInfo = model.databricksPythonConnectInfo;
                this.description = model.description;
                this.developOwnerIdList = model.developOwnerIdList;
                this.directory = model.directory;
                this.engine = model.engine;
                this.name = model.name;
                this.opsOwnerIdList = model.opsOwnerIdList;
                this.paiConfig = model.paiConfig;
                this.projectId = model.projectId;
                this.pythonModuleList = model.pythonModuleList;
                this.scheduleType = model.scheduleType;
                this.sparkDynamicResourceSwitch = model.sparkDynamicResourceSwitch;
                this.sparkResourceEffectScope = model.sparkResourceEffectScope;
                this.sparkSqlResourceConfigMap = model.sparkSqlResourceConfigMap;
                this.sparkVersion = model.sparkVersion;
                this.taskType = model.taskType;
            } 

            /**
             * <p>The ID of the offline code template.</p>
             * 
             * <strong>example:</strong>
             * <p>st_123456</p>
             */
            public Builder codeTemplateId(String codeTemplateId) {
                this.codeTemplateId = codeTemplateId;
                return this;
            }

            /**
             * <p>The version of the offline code template.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder codeTemplateVersion(Integer codeTemplateVersion) {
                this.codeTemplateVersion = codeTemplateVersion;
                return this;
            }

            /**
             * <p>The catalog for database SQL tasks. This parameter takes effect only for data source types that require a catalog, such as Presto.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql_catalog</p>
             */
            public Builder dataSourceCatalog(String dataSourceCatalog) {
                this.dataSourceCatalog = dataSourceCatalog;
                return this;
            }

            /**
             * <p>The ID of the data source for database SQL tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>12131111</p>
             */
            public Builder dataSourceId(String dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * <p>The schema for database SQL tasks. This parameter takes effect only for data source types that require a schema, such as Oracle.</p>
             * 
             * <strong>example:</strong>
             * <p>erp</p>
             */
            public Builder dataSourceSchema(String dataSourceSchema) {
                this.dataSourceSchema = dataSourceSchema;
                return this;
            }

            /**
             * <p>The Python connection configuration.</p>
             */
            public Builder databricksPythonConnectInfo(DatabricksPythonConnectInfo databricksPythonConnectInfo) {
                this.databricksPythonConnectInfo = databricksPythonConnectInfo;
                return this;
            }

            /**
             * <p>The description.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>xx test.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The IDs of the development owners.</p>
             */
            public Builder developOwnerIdList(java.util.List<String> developOwnerIdList) {
                this.developOwnerIdList = developOwnerIdList;
                return this;
            }

            /**
             * <p>The directory in the menu tree to which the task belongs.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>/a/b</p>
             */
            public Builder directory(String directory) {
                this.directory = directory;
                return this;
            }

            /**
             * <p>The task execution engine, such as Python tasks. Valid values:</p>
             * <ul>
             * <li>PYTHON2_7</li>
             * <li>PYTHON3_7</li>
             * <li>PYTHON3_11</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PYTHON3_7</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The name of the offline task.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test111</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The IDs of the O&amp;M owners.</p>
             */
            public Builder opsOwnerIdList(java.util.List<String> opsOwnerIdList) {
                this.opsOwnerIdList = opsOwnerIdList;
                return this;
            }

            /**
             * <p>The PAI configuration.</p>
             */
            public Builder paiConfig(PaiConfig paiConfig) {
                this.paiConfig = paiConfig;
                return this;
            }

            /**
             * <p>The ID of the project to which the task belongs.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>10121101</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The third-party Python packages that the task depends on.</p>
             */
            public Builder pythonModuleList(java.util.List<String> pythonModuleList) {
                this.pythonModuleList = pythonModuleList;
                return this;
            }

            /**
             * <p>The scheduling type. Valid values: 1 (periodic task) and 3 (manual task).</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder scheduleType(Integer scheduleType) {
                this.scheduleType = scheduleType;
                return this;
            }

            /**
             * <p>Specifies whether to enable dynamic resource configuration for Spark. This parameter takes effect only for Spark SQL tasks. If you do not specify this parameter, dynamic resource configuration is enabled by default for Spark SQL tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder sparkDynamicResourceSwitch(Boolean sparkDynamicResourceSwitch) {
                this.sparkDynamicResourceSwitch = sparkDynamicResourceSwitch;
                return this;
            }

            /**
             * <p>The effective scope of Spark resources. Valid values: ONLY_PROD and PROD_AND_DEV. If you do not specify this parameter, the default value ONLY_PROD is used for Spark SQL tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>ONLY_PROD</p>
             */
            public Builder sparkResourceEffectScope(String sparkResourceEffectScope) {
                this.sparkResourceEffectScope = sparkResourceEffectScope;
                return this;
            }

            /**
             * <p>The resource configuration for the Spark task. The value is a JSON string, such as {&quot;spark.executor.memory&quot;:&quot;2g&quot;}.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;spark.executor.memory&quot;:&quot;2g&quot;}</p>
             */
            public Builder sparkSqlResourceConfigMap(String sparkSqlResourceConfigMap) {
                this.sparkSqlResourceConfigMap = sparkSqlResourceConfigMap;
                return this;
            }

            /**
             * <p>The MaxCompute Spark version. Valid values: MAX_COMPUTE_23X, MAX_COMPUTE_245X, and MAX_COMPUTE_311X. For Apsara Stack, only MAX_COMPUTE_APSARA is supported. Display names such as Spark 2.3.0, Spark 2.4.5, and Spark 3.1.1 are also accepted.</p>
             * 
             * <strong>example:</strong>
             * <p>Spark 3.1.1</p>
             */
            public Builder sparkVersion(String sparkVersion) {
                this.sparkVersion = sparkVersion;
                return this;
            }

            /**
             * <p>The task type. Valid values:</p>
             * <ul>
             * <li>1: Hive_SQL.</li>
             * <li>101: Hive_SQL_23X.</li>
             * <li>111: HIVE_SQL_FUSION_INSIGHT_80X.</li>
             * <li>131: COMMON_HIVE_SQL.</li>
             * <li>2: HADOOP_MR.</li>
             * <li>5: MaxCompute_SQL.</li>
             * <li>6: MaxCompute_MR.</li>
             * <li>7: SPARK_SQL_ON_MAX_COMPUTE.</li>
             * <li>8: SPARK_JAR_ON_MAX_COMPUTE.</li>
             * <li>17: SPARK_SQL_ON_HIVE.</li>
             * <li>18: Spark_JAR_ON_HIVE.</li>
             * <li>10: Shell.</li>
             * <li>71: PAI_DESIGNER.</li>
             * <li>15: DataX.</li>
             * <li>16: Merge.</li>
             * <li>21: Python.</li>
             * <li>22: Python37x.</li>
             * <li>23: Perl.</li>
             * <li>24: Python311x.</li>
             * <li>25: OneService_SQL.</li>
             * <li>26: ONE_SERVICE_SQL_ADB_FOR_PG.</li>
             * <li>27: OneService_SQL_Hive11x.</li>
             * <li>29: OneService_SQL_Hive23x.</li>
             * <li>75: ONE_SERVICE_SQL_TDH_INCEPTOR.</li>
             * <li>91: ONE_SERVICE_SQL_HIVE_CDP.</li>
             * <li>92: ONE_SERVICE_SQL_HIVE_ASIA_INFO_DP_53X.</li>
             * <li>30: Dlink.</li>
             * <li>33: ONE_SERVICE_SQL_ADB_FOR_MYSQL.</li>
             * <li>31: Logical.</li>
             * <li>41: Flink_Streaming.</li>
             * <li>42: Flink_Batch.</li>
             * <li>51: ADB_FOR_PG.</li>
             * <li>100: DryRun.</li>
             * <li>902: CHECK.</li>
             * <li>999: VIRTUAL.</li>
             * <li>10000: INCEPTOR_SQL.</li>
             * <li>28: HOLOGRES_SQL.</li>
             * <li>76: ARGODB_SQL.</li>
             * <li>78: IMPALA_SQL.</li>
             * <li>79: STARROCKS_SQL.</li>
             * <li>80: SPARK_SQL.</li>
             * <li>81: GAUSS_SQL.</li>
             * <li>998: DATABASE_SQL.</li>
             * <li>997: EXTERNAL_TRIGGER.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder taskType(Integer taskType) {
                this.taskType = taskType;
                return this;
            }

            public CreateCommand build() {
                return new CreateCommand(this);
            } 

        } 

    }
}
