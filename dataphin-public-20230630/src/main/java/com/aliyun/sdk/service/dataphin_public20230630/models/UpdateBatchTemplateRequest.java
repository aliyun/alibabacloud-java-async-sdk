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
 * {@link UpdateBatchTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateBatchTemplateRequest</p>
 */
public class UpdateBatchTemplateRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpdateCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private UpdateCommand updateCommand;

    private UpdateBatchTemplateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
        this.projectId = builder.projectId;
        this.updateCommand = builder.updateCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBatchTemplateRequest create() {
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

    /**
     * @return updateCommand
     */
    public UpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static final class Builder extends Request.Builder<UpdateBatchTemplateRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private String opUserId; 
        private Long projectId; 
        private UpdateCommand updateCommand; 

        private Builder() {
            super();
        } 

        private Builder(UpdateBatchTemplateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
            this.projectId = request.projectId;
            this.updateCommand = request.updateCommand;
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

        /**
         * <p>The template update command.</p>
         * <p>This parameter is required.</p>
         */
        public Builder updateCommand(UpdateCommand updateCommand) {
            String updateCommandShrink = shrink(updateCommand, "UpdateCommand", "json");
            this.putBodyParameter("UpdateCommand", updateCommandShrink);
            this.updateCommand = updateCommand;
            return this;
        }

        @Override
        public UpdateBatchTemplateRequest build() {
            return new UpdateBatchTemplateRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateBatchTemplateRequest} extends {@link TeaModel}
     *
     * <p>UpdateBatchTemplateRequest</p>
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
     * {@link UpdateBatchTemplateRequest} extends {@link TeaModel}
     *
     * <p>UpdateBatchTemplateRequest</p>
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
     * {@link UpdateBatchTemplateRequest} extends {@link TeaModel}
     *
     * <p>UpdateBatchTemplateRequest</p>
     */
    public static class UpdateCommand extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("Params")
        private java.util.List<Params> params;

        @com.aliyun.core.annotation.NameInMap("PythonModuleIds")
        private java.util.List<Long> pythonModuleIds;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ShareRuntimeResource")
        private Boolean shareRuntimeResource;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long templateId;

        private UpdateCommand(Builder builder) {
            this.content = builder.content;
            this.dataSourceConfig = builder.dataSourceConfig;
            this.description = builder.description;
            this.devResourceGroupId = builder.devResourceGroupId;
            this.directory = builder.directory;
            this.name = builder.name;
            this.params = builder.params;
            this.pythonModuleIds = builder.pythonModuleIds;
            this.resourceGroupId = builder.resourceGroupId;
            this.shareRuntimeResource = builder.shareRuntimeResource;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateCommand create() {
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
         * @return name
         */
        public String getName() {
            return this.name;
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

        /**
         * @return templateId
         */
        public Long getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private String content; 
            private DataSourceConfig dataSourceConfig; 
            private String description; 
            private String devResourceGroupId; 
            private String directory; 
            private String name; 
            private java.util.List<Params> params; 
            private java.util.List<Long> pythonModuleIds; 
            private String resourceGroupId; 
            private Boolean shareRuntimeResource; 
            private Long templateId; 

            private Builder() {
            } 

            private Builder(UpdateCommand model) {
                this.content = model.content;
                this.dataSourceConfig = model.dataSourceConfig;
                this.description = model.description;
                this.devResourceGroupId = model.devResourceGroupId;
                this.directory = model.directory;
                this.name = model.name;
                this.params = model.params;
                this.pythonModuleIds = model.pythonModuleIds;
                this.resourceGroupId = model.resourceGroupId;
                this.shareRuntimeResource = model.shareRuntimeResource;
                this.templateId = model.templateId;
            } 

            /**
             * <p>The template content.</p>
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
             * <p>The datasource config for database SQL templates. This parameter takes effect only for database SQL templates.</p>
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
             * <p>The folder of the template.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>/Data development/Templates</p>
             */
            public Builder directory(String directory) {
                this.directory = directory;
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

            /**
             * <p>The ID of the template.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            public UpdateCommand build() {
                return new UpdateCommand(this);
            } 

        } 

    }
}
