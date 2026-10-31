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
 * {@link GetBatchTemplateVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>GetBatchTemplateVersionsResponseBody</p>
 */
public class GetBatchTemplateVersionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetBatchTemplateVersionsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBatchTemplateVersionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetBatchTemplateVersionsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The backend response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The details of the backend exception.</p>
         * 
         * <strong>example:</strong>
         * <p>internal error</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetBatchTemplateVersionsResponseBody build() {
            return new GetBatchTemplateVersionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetBatchTemplateVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchTemplateVersionsResponseBody</p>
     */
    public static class DataSourceConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Catalog")
        private String catalog;

        @com.aliyun.core.annotation.NameInMap("DsId")
        private String dsId;

        @com.aliyun.core.annotation.NameInMap("Schema")
        private String schema;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * <p>The data source type of the database SQL template. Valid values: MYSQL, ORACLE, ADB_FOR_PG, OUSHUDB, PRESTO, POSTGRE_SQL, STARROCKS, CLICKHOUSE, ANALYTICDB, ADB_FOR_MYSQL_V3, GAUSSDB, SELECTDB, DORIS, SQL_SERVER, HOLOGRES, OPENGAUSS, DAMENG, OCEANBASE, TRINO, POLARDB_X2, LINDORM, EMR_SPARK_SERVERLESS, TDSQL_FOR_PG, TDSQL_FOR_MYSQL, GBASE_8A, and TDENGINE.</p>
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
     * {@link GetBatchTemplateVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchTemplateVersionsResponseBody</p>
     */
    public static class Params extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EncryptEnabled")
        private Boolean encryptEnabled;

        @com.aliyun.core.annotation.NameInMap("Key")
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
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether encryption is enabled for the parameter.</p>
             */
            public Builder encryptEnabled(Boolean encryptEnabled) {
                this.encryptEnabled = encryptEnabled;
                return this;
            }

            /**
             * <p>The key of the parameter.</p>
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
     * {@link GetBatchTemplateVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchTemplateVersionsResponseBody</p>
     */
    public static class PythonModuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InstallTime")
        private String installTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PythonVersion")
        private String pythonVersion;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private PythonModuleList(Builder builder) {
            this.id = builder.id;
            this.installTime = builder.installTime;
            this.name = builder.name;
            this.pythonVersion = builder.pythonVersion;
            this.status = builder.status;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PythonModuleList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return installTime
         */
        public String getInstallTime() {
            return this.installTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pythonVersion
         */
        public String getPythonVersion() {
            return this.pythonVersion;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Long id; 
            private String installTime; 
            private String name; 
            private String pythonVersion; 
            private String status; 
            private String version; 

            private Builder() {
            } 

            private Builder(PythonModuleList model) {
                this.id = model.id;
                this.installTime = model.installTime;
                this.name = model.name;
                this.pythonVersion = model.pythonVersion;
                this.status = model.status;
                this.version = model.version;
            } 

            /**
             * <p>The ID of the Python third-party package.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The installation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-01 10:00:00</p>
             */
            public Builder installTime(String installTime) {
                this.installTime = installTime;
                return this;
            }

            /**
             * <p>The name of the Python third-party package.</p>
             * 
             * <strong>example:</strong>
             * <p>numpy</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The Python version. Valid values: PYTHON_2_7, PYTHON_3_7, and PYTHON_3_11.</p>
             * 
             * <strong>example:</strong>
             * <p>PYTHON_2_7</p>
             */
            public Builder pythonVersion(String pythonVersion) {
                this.pythonVersion = pythonVersion;
                return this;
            }

            /**
             * <p>The status of the third-party package. Valid values: INSTALL_SUCCESS (installed), INSTALL_FAILED (installation failed), INSTALLING (installing), UPGRADE_SUCCESS (upgraded), UPGRADE_FAILED (upgrade failed), and UPGRADING (upgrading).</p>
             * 
             * <strong>example:</strong>
             * <p>INSTALL_SUCCESS</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The version of the third-party package.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.1</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public PythonModuleList build() {
                return new PythonModuleList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBatchTemplateVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchTemplateVersionsResponseBody</p>
     */
    public static class TemplateVersionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("DataSourceConfig")
        private DataSourceConfig dataSourceConfig;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DevResourceGroupId")
        private String devResourceGroupId;

        @com.aliyun.core.annotation.NameInMap("DevResourceGroupName")
        private String devResourceGroupName;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Modifier")
        private String modifier;

        @com.aliyun.core.annotation.NameInMap("ModifierId")
        private String modifierId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OperatorType")
        private Integer operatorType;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private String ownerId;

        @com.aliyun.core.annotation.NameInMap("Params")
        private java.util.List<Params> params;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("PythonModuleList")
        private java.util.List<PythonModuleList> pythonModuleList;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
        private String resourceGroupName;

        @com.aliyun.core.annotation.NameInMap("ShareRuntimeResource")
        private Boolean shareRuntimeResource;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Long version;

        private TemplateVersionList(Builder builder) {
            this.comment = builder.comment;
            this.content = builder.content;
            this.dataSourceConfig = builder.dataSourceConfig;
            this.description = builder.description;
            this.devResourceGroupId = builder.devResourceGroupId;
            this.devResourceGroupName = builder.devResourceGroupName;
            this.engine = builder.engine;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.modifier = builder.modifier;
            this.modifierId = builder.modifierId;
            this.name = builder.name;
            this.operatorType = builder.operatorType;
            this.owner = builder.owner;
            this.ownerId = builder.ownerId;
            this.params = builder.params;
            this.projectId = builder.projectId;
            this.pythonModuleList = builder.pythonModuleList;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceGroupName = builder.resourceGroupName;
            this.shareRuntimeResource = builder.shareRuntimeResource;
            this.status = builder.status;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateVersionList create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
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
         * @return devResourceGroupName
         */
        public String getDevResourceGroupName() {
            return this.devResourceGroupName;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return modifier
         */
        public String getModifier() {
            return this.modifier;
        }

        /**
         * @return modifierId
         */
        public String getModifierId() {
            return this.modifierId;
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
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return params
         */
        public java.util.List<Params> getParams() {
            return this.params;
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
        public java.util.List<PythonModuleList> getPythonModuleList() {
            return this.pythonModuleList;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return resourceGroupName
         */
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        /**
         * @return shareRuntimeResource
         */
        public Boolean getShareRuntimeResource() {
            return this.shareRuntimeResource;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return version
         */
        public Long getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String comment; 
            private String content; 
            private DataSourceConfig dataSourceConfig; 
            private String description; 
            private String devResourceGroupId; 
            private String devResourceGroupName; 
            private String engine; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String modifier; 
            private String modifierId; 
            private String name; 
            private Integer operatorType; 
            private String owner; 
            private String ownerId; 
            private java.util.List<Params> params; 
            private Long projectId; 
            private java.util.List<PythonModuleList> pythonModuleList; 
            private String resourceGroupId; 
            private String resourceGroupName; 
            private Boolean shareRuntimeResource; 
            private String status; 
            private Long version; 

            private Builder() {
            } 

            private Builder(TemplateVersionList model) {
                this.comment = model.comment;
                this.content = model.content;
                this.dataSourceConfig = model.dataSourceConfig;
                this.description = model.description;
                this.devResourceGroupId = model.devResourceGroupId;
                this.devResourceGroupName = model.devResourceGroupName;
                this.engine = model.engine;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.modifier = model.modifier;
                this.modifierId = model.modifierId;
                this.name = model.name;
                this.operatorType = model.operatorType;
                this.owner = model.owner;
                this.ownerId = model.ownerId;
                this.params = model.params;
                this.projectId = model.projectId;
                this.pythonModuleList = model.pythonModuleList;
                this.resourceGroupId = model.resourceGroupId;
                this.resourceGroupName = model.resourceGroupName;
                this.shareRuntimeResource = model.shareRuntimeResource;
                this.status = model.status;
                this.version = model.version;
            } 

            /**
             * <p>The template submission comment.</p>
             * 
             * <strong>example:</strong>
             * <p>Initial submission</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The template content.</p>
             * 
             * <strong>example:</strong>
             * <p>#!/bin/bash
             * echo \&quot;hello world\&quot;</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The data source configuration of the database SQL template.</p>
             */
            public Builder dataSourceConfig(DataSourceConfig dataSourceConfig) {
                this.dataSourceConfig = dataSourceConfig;
                return this;
            }

            /**
             * <p>The template description.</p>
             * 
             * <strong>example:</strong>
             * <p>Shell template for data processing</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the resource group in the development environment.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder devResourceGroupId(String devResourceGroupId) {
                this.devResourceGroupId = devResourceGroupId;
                return this;
            }

            /**
             * <p>The name of the resource group in the development environment.</p>
             * 
             * <strong>example:</strong>
             * <p>Default resource group for the project</p>
             */
            public Builder devResourceGroupName(String devResourceGroupName) {
                this.devResourceGroupName = devResourceGroupName;
                return this;
            }

            /**
             * <p>The version of the compute engine. Valid values: Python 2.7 and Python 3.7.</p>
             * 
             * <strong>example:</strong>
             * <p>Python 3.7</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The time when the template was created. Format: yyyy-MM-dd HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-01 10:00:00</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the template was updated. Format: yyyy-MM-dd HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-05-28 15:30:00</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the template, which is the same as the menu tree node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The last user who updated the template.</p>
             * 
             * <strong>example:</strong>
             * <p>Li Si</p>
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * <p>The ID of the last user who updated the template.</p>
             * 
             * <strong>example:</strong>
             * <p>100002</p>
             */
            public Builder modifierId(String modifierId) {
                this.modifierId = modifierId;
                return this;
            }

            /**
             * <p>The name of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>Data processing template</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The node type. Valid values: 10 (Shell) and 21 (Python).</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder operatorType(Integer operatorType) {
                this.operatorType = operatorType;
                return this;
            }

            /**
             * <p>The owner of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhang San</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The ID of the template owner.</p>
             * 
             * <strong>example:</strong>
             * <p>100001</p>
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
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
             * <p>The ID of the project.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The list of dependent Python third-party packages.</p>
             */
            public Builder pythonModuleList(java.util.List<PythonModuleList> pythonModuleList) {
                this.pythonModuleList = pythonModuleList;
                return this;
            }

            /**
             * <p>The ID of the resource group in the production environment.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The name of the resource group in the production environment.</p>
             * 
             * <strong>example:</strong>
             * <p>Default resource group for the project</p>
             */
            public Builder resourceGroupName(String resourceGroupName) {
                this.resourceGroupName = resourceGroupName;
                return this;
            }

            /**
             * <p>Indicates whether runtime resources are shared.</p>
             */
            public Builder shareRuntimeResource(Boolean shareRuntimeResource) {
                this.shareRuntimeResource = shareRuntimeResource;
                return this;
            }

            /**
             * <p>The status of the template. Valid values: 0 (draft), 2 (submitted), and 100 (in development).</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            public TemplateVersionList build() {
                return new TemplateVersionList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBatchTemplateVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchTemplateVersionsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TemplateVersionList")
        private java.util.List<TemplateVersionList> templateVersionList;

        private Data(Builder builder) {
            this.templateVersionList = builder.templateVersionList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return templateVersionList
         */
        public java.util.List<TemplateVersionList> getTemplateVersionList() {
            return this.templateVersionList;
        }

        public static final class Builder {
            private java.util.List<TemplateVersionList> templateVersionList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.templateVersionList = model.templateVersionList;
            } 

            /**
             * <p>The template version list.</p>
             */
            public Builder templateVersionList(java.util.List<TemplateVersionList> templateVersionList) {
                this.templateVersionList = templateVersionList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
