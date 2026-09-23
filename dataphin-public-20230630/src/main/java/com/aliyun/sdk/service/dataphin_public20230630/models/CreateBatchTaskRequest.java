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
    public static class CreateCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSourceCatalog")
        private String dataSourceCatalog;

        @com.aliyun.core.annotation.NameInMap("DataSourceId")
        private String dataSourceId;

        @com.aliyun.core.annotation.NameInMap("DataSourceSchema")
        private String dataSourceSchema;

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

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("PythonModuleList")
        private java.util.List<String> pythonModuleList;

        @com.aliyun.core.annotation.NameInMap("ScheduleType")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer scheduleType;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer taskType;

        private CreateCommand(Builder builder) {
            this.dataSourceCatalog = builder.dataSourceCatalog;
            this.dataSourceId = builder.dataSourceId;
            this.dataSourceSchema = builder.dataSourceSchema;
            this.description = builder.description;
            this.developOwnerIdList = builder.developOwnerIdList;
            this.directory = builder.directory;
            this.engine = builder.engine;
            this.name = builder.name;
            this.opsOwnerIdList = builder.opsOwnerIdList;
            this.projectId = builder.projectId;
            this.pythonModuleList = builder.pythonModuleList;
            this.scheduleType = builder.scheduleType;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateCommand create() {
            return builder().build();
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
         * @return taskType
         */
        public Integer getTaskType() {
            return this.taskType;
        }

        public static final class Builder {
            private String dataSourceCatalog; 
            private String dataSourceId; 
            private String dataSourceSchema; 
            private String description; 
            private java.util.List<String> developOwnerIdList; 
            private String directory; 
            private String engine; 
            private String name; 
            private java.util.List<String> opsOwnerIdList; 
            private Long projectId; 
            private java.util.List<String> pythonModuleList; 
            private Integer scheduleType; 
            private Integer taskType; 

            private Builder() {
            } 

            private Builder(CreateCommand model) {
                this.dataSourceCatalog = model.dataSourceCatalog;
                this.dataSourceId = model.dataSourceId;
                this.dataSourceSchema = model.dataSourceSchema;
                this.description = model.description;
                this.developOwnerIdList = model.developOwnerIdList;
                this.directory = model.directory;
                this.engine = model.engine;
                this.name = model.name;
                this.opsOwnerIdList = model.opsOwnerIdList;
                this.projectId = model.projectId;
                this.pythonModuleList = model.pythonModuleList;
                this.scheduleType = model.scheduleType;
                this.taskType = model.taskType;
            } 

            /**
             * <p>The catalog for database SQL nodes. This parameter takes effect only for data source types that require a catalog, such as Presto.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql_catalog</p>
             */
            public Builder dataSourceCatalog(String dataSourceCatalog) {
                this.dataSourceCatalog = dataSourceCatalog;
                return this;
            }

            /**
             * <p>The data source ID for database SQL nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>12131111</p>
             */
            public Builder dataSourceId(String dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * <p>The schema for database SQL nodes. This parameter takes effect only for data source types that require a schema, such as Oracle.</p>
             * 
             * <strong>example:</strong>
             * <p>erp</p>
             */
            public Builder dataSourceSchema(String dataSourceSchema) {
                this.dataSourceSchema = dataSourceSchema;
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
             * <p>The list of development owner IDs.</p>
             */
            public Builder developOwnerIdList(java.util.List<String> developOwnerIdList) {
                this.developOwnerIdList = developOwnerIdList;
                return this;
            }

            /**
             * <p>The folder path in the menu tree to which the node belongs.</p>
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
             * <p>The execution engine for the node, such as for Python nodes. Valid values:</p>
             * <ul>
             * <li><ol>
             * <li>PYTHON2_7</li>
             * </ol>
             * </li>
             * <li><ol start="2">
             * <li>PYTHON3_7</li>
             * </ol>
             * </li>
             * <li><ol start="3">
             * <li>PYTHON3_11</li>
             * </ol>
             * </li>
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
             * <p>The name of the batch task.</p>
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
             * <p>The list of O&amp;M owner IDs.</p>
             */
            public Builder opsOwnerIdList(java.util.List<String> opsOwnerIdList) {
                this.opsOwnerIdList = opsOwnerIdList;
                return this;
            }

            /**
             * <p>The ID of the project to which the node belongs.</p>
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
             * <p>The list of Python third-party packages that the node depends on.</p>
             */
            public Builder pythonModuleList(java.util.List<String> pythonModuleList) {
                this.pythonModuleList = pythonModuleList;
                return this;
            }

            /**
             * <p>The schedule type. Valid values:</p>
             * <ul>
             * <li>1: periodic node.</li>
             * <li>3: manual node.</li>
             * </ul>
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
             * <p>The node type. Valid values:</p>
             * <ul>
             * <li>Hive_SQL: 1</li>
             * <li>Hive_SQL_23X: 101</li>
             * <li>HIVE_SQL_FUSION_INSIGHT_80X: 111</li>
             * <li>COMMON_HIVE_SQL: 131</li>
             * <li>HADOOP_MR: 2</li>
             * <li>MaxCompute_SQL: 5</li>
             * <li>MaxCompute_MR: 6</li>
             * <li>SPARK_SQL_ON_MAX_COMPUTE: 7</li>
             * <li>SPARK_JAR_ON_MAX_COMPUTE: 8</li>
             * <li>SPARK_SQL_ON_HIVE: 17</li>
             * <li>Spark_JAR_ON_HIVE: 18</li>
             * <li>Shell: 10</li>
             * <li>PAI_DESIGNER: 71</li>
             * <li>DataX: 15</li>
             * <li>Merge: 16</li>
             * <li>Python: 21</li>
             * <li>Python37x: 22</li>
             * <li>Perl: 23</li>
             * <li>Python311x: 24</li>
             * <li>OneService_SQL: 25</li>
             * <li>ONE_SERVICE_SQL_ADB_FOR_PG: 26</li>
             * <li>OneService_SQL_Hive11x: 27</li>
             * <li>OneService_SQL_Hive23x: 29</li>
             * <li>ONE_SERVICE_SQL_TDH_INCEPTOR: 75</li>
             * <li>ONE_SERVICE_SQL_HIVE_CDP: 91</li>
             * <li>ONE_SERVICE_SQL_HIVE_ASIA_INFO_DP_53X: 92</li>
             * <li>Dlink: 30</li>
             * <li>ONE_SERVICE_SQL_ADB_FOR_MYSQL: 33</li>
             * <li>Logical: 31</li>
             * <li>Flink_Streaming: 41</li>
             * <li>Flink_Batch: 42</li>
             * <li>ADB_FOR_PG: 51</li>
             * <li>DryRun: 100</li>
             * <li>CHECK: 902</li>
             * <li>VIRTUAL: 999</li>
             * <li>INCEPTOR_SQL: 10000</li>
             * <li>HOLOGRES_SQL: 28</li>
             * <li>ARGODB_SQL: 76</li>
             * <li>IMPALA_SQL: 78</li>
             * <li>STARROCKS_SQL: 79</li>
             * <li>SPARK_SQL: 80</li>
             * <li>GAUSS_SQL: 81</li>
             * <li>DATABASE_SQL: 998</li>
             * <li>EXTERNAL_TRIGGER: 997</li>
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
