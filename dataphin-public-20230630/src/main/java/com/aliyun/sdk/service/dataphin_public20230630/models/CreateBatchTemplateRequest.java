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
 * {@link CreateBatchTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateBatchTemplateRequest</p>
 */
public class CreateBatchTemplateRequest extends Request {
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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    private CreateBatchTemplateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.createCommand = builder.createCommand;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBatchTemplateRequest create() {
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

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<CreateBatchTemplateRequest, Builder> {
        private String regionId; 
        private CreateCommand createCommand; 
        private Long opTenantId; 
        private String opUserId; 
        private Long projectId; 

        private Builder() {
            super();
        } 

        private Builder(CreateBatchTemplateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.createCommand = request.createCommand;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
            this.projectId = request.projectId;
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
         * <p>The command to create a template.</p>
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

        /**
         * <p>The project ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public CreateBatchTemplateRequest build() {
            return new CreateBatchTemplateRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateBatchTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateBatchTemplateRequest</p>
     */
    public static class DataSourceConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Catalog")
        private String catalog;

        @com.aliyun.core.annotation.NameInMap("DsId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String dsId;

        @com.aliyun.core.annotation.NameInMap("Schema")
        private String schema;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private DataSourceConfig(Builder builder) {
            this.catalog = builder.catalog;
            this.dsId = builder.dsId;
            this.schema = builder.schema;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSourceConfig create() {
            return builder().build();
        }

        /**
         * @return catalog
         */
        public String getCatalog() {
            return this.catalog;
        }

        /**
         * @return dsId
         */
        public String getDsId() {
            return this.dsId;
        }

        /**
         * @return schema
         */
        public String getSchema() {
            return this.schema;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String catalog; 
            private String dsId; 
            private String schema; 
            private String type; 

            private Builder() {
            } 

            private Builder(DataSourceConfig model) {
                this.catalog = model.catalog;
                this.dsId = model.dsId;
                this.schema = model.schema;
                this.type = model.type;
            } 

            /**
             * <p>The catalog of the data source for the database SQL template.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder catalog(String catalog) {
                this.catalog = catalog;
                return this;
            }

            /**
             * <p>The ID of the data source for the database SQL template.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder dsId(String dsId) {
                this.dsId = dsId;
                return this;
            }

            /**
             * <p>The schema of the data source for the database SQL template.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder schema(String schema) {
                this.schema = schema;
                return this;
            }

            /**
             * <p>The type of the data source for the database SQL template. Valid values: MYSQL, ORACLE, ADB_FOR_PG, OUSHUDB, PRESTO, POSTGRE_SQL, STARROCKS, CLICKHOUSE, ANALYTICDB, ADB_FOR_MYSQL_V3, GAUSSDB, SELECTDB, DORIS, SQL_SERVER, HOLOGRES, OPENGAUSS, DAMENG, OCEANBASE, TRINO, POLARDB_X2, LINDORM, EMR_SPARK_SERVERLESS, TDSQL_FOR_PG, TDSQL_FOR_MYSQL, GBASE_8A, and TDENGINE.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>MYSQL</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DataSourceConfig build() {
                return new DataSourceConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateBatchTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateBatchTemplateRequest</p>
     */
    public static class Params extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EncryptEnabled")
        private Boolean encryptEnabled;

        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Params(Builder builder) {
            this.description = builder.description;
            this.encryptEnabled = builder.encryptEnabled;
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Params create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return encryptEnabled
         */
        public Boolean getEncryptEnabled() {
            return this.encryptEnabled;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private Boolean encryptEnabled; 
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Params model) {
                this.description = model.description;
                this.encryptEnabled = model.encryptEnabled;
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The parameter description.</p>
             * 
             * <strong>example:</strong>
             * <p>Input date</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Specifies whether encryption is enabled for the parameter.</p>
             */
            public Builder encryptEnabled(Boolean encryptEnabled) {
                this.encryptEnabled = encryptEnabled;
                return this;
            }

            /**
             * <p>The key of the parameter.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>param1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The default value of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Params build() {
                return new Params(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateBatchTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateBatchTemplateRequest</p>
     */
    public static class CreateCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        @com.aliyun.core.annotation.Validation(required = true)
        private String content;

        @com.aliyun.core.annotation.NameInMap("DataSourceConfig")
        private DataSourceConfig dataSourceConfig;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DevResourceGroupId")
        private String devResourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Directory")
        @com.aliyun.core.annotation.Validation(required = true)
        private String directory;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("OperatorType")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer operatorType;

        @com.aliyun.core.annotation.NameInMap("Params")
        private java.util.List<Params> params;

        @com.aliyun.core.annotation.NameInMap("PythonModuleIds")
        private java.util.List<Long> pythonModuleIds;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ShareRuntimeResource")
        private Boolean shareRuntimeResource;

        private CreateCommand(Builder builder) {
            this.content = builder.content;
            this.dataSourceConfig = builder.dataSourceConfig;
            this.description = builder.description;
            this.devResourceGroupId = builder.devResourceGroupId;
            this.directory = builder.directory;
            this.engine = builder.engine;
            this.name = builder.name;
            this.operatorType = builder.operatorType;
            this.params = builder.params;
            this.pythonModuleIds = builder.pythonModuleIds;
            this.resourceGroupId = builder.resourceGroupId;
            this.shareRuntimeResource = builder.shareRuntimeResource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateCommand create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return dataSourceConfig
         */
        public DataSourceConfig getDataSourceConfig() {
            return this.dataSourceConfig;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return devResourceGroupId
         */
        public String getDevResourceGroupId() {
            return this.devResourceGroupId;
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
         * @return operatorType
         */
        public Integer getOperatorType() {
            return this.operatorType;
        }

        /**
         * @return params
         */
        public java.util.List<Params> getParams() {
            return this.params;
        }

        /**
         * @return pythonModuleIds
         */
        public java.util.List<Long> getPythonModuleIds() {
            return this.pythonModuleIds;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return shareRuntimeResource
         */
        public Boolean getShareRuntimeResource() {
            return this.shareRuntimeResource;
        }

        public static final class Builder {
            private String content; 
            private DataSourceConfig dataSourceConfig; 
            private String description; 
            private String devResourceGroupId; 
            private String directory; 
            private String engine; 
            private String name; 
            private Integer operatorType; 
            private java.util.List<Params> params; 
            private java.util.List<Long> pythonModuleIds; 
            private String resourceGroupId; 
            private Boolean shareRuntimeResource; 

            private Builder() {
            } 

            private Builder(CreateCommand model) {
                this.content = model.content;
                this.dataSourceConfig = model.dataSourceConfig;
                this.description = model.description;
                this.devResourceGroupId = model.devResourceGroupId;
                this.directory = model.directory;
                this.engine = model.engine;
                this.name = model.name;
                this.operatorType = model.operatorType;
                this.params = model.params;
                this.pythonModuleIds = model.pythonModuleIds;
                this.resourceGroupId = model.resourceGroupId;
                this.shareRuntimeResource = model.shareRuntimeResource;
            } 

            /**
             * <p>The content of the template.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>echo 123</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The datasource config for database SQL templates, which takes effect only for database SQL templates.</p>
             */
            public Builder dataSourceConfig(DataSourceConfig dataSourceConfig) {
                this.dataSourceConfig = dataSourceConfig;
                return this;
            }

            /**
             * <p>The description of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>Shell template for data processing</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the resource group in the development environment. By default, the default resource group of the project is used.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder devResourceGroupId(String devResourceGroupId) {
                this.devResourceGroupId = devResourceGroupId;
                return this;
            }

            /**
             * <p>The directory of the template.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>/Data Development/Templates</p>
             */
            public Builder directory(String directory) {
                this.directory = directory;
                return this;
            }

            /**
             * <p>The compute engine version. Valid values: PYTHON_2_7, PYTHON_3_7, and PYTHON_3_11.</p>
             * 
             * <strong>example:</strong>
             * <p>PYTHON_3_7</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The name of the template.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Data processing template</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The node type of the template. Valid values: 10: Shell, 21: Python, 998: Database SQL, 5: MaxCompute SQL, 6: MapReduce on MaxCompute, 8: Spark on MaxCompute, 28: Hologres SQL, 1: Hive SQL, 2: MapReduce on Yarn, 18: Spark on Yarn, 78: Impala SQL, 80: Spark SQL, 10000: Inceptor SQL, 51: AnalyticDB for PostgreSQL SQL, 81: GaussDB SQL, 82: Databricks SQL, 76: ArgoDB SQL, 79: StarRocks SQL, 202: SelectDB SQL, 201: Doris SQL, and 203: OushuDB SQL.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder operatorType(Integer operatorType) {
                this.operatorType = operatorType;
                return this;
            }

            /**
             * <p>The list of template parameters.</p>
             */
            public Builder params(java.util.List<Params> params) {
                this.params = params;
                return this;
            }

            /**
             * <p>The list of IDs of dependent third-party Python packages.</p>
             */
            public Builder pythonModuleIds(java.util.List<Long> pythonModuleIds) {
                this.pythonModuleIds = pythonModuleIds;
                return this;
            }

            /**
             * <p>The ID of the resource group in the production environment. By default, the default resource group of the project is used.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>Specifies whether to share runtime resources.</p>
             */
            public Builder shareRuntimeResource(Boolean shareRuntimeResource) {
                this.shareRuntimeResource = shareRuntimeResource;
                return this;
            }

            public CreateCommand build() {
                return new CreateCommand(this);
            } 

        } 

    }
}
