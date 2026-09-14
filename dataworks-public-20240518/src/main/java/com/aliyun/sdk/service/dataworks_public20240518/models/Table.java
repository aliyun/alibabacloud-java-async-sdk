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
 * {@link Table} extends {@link TeaModel}
 *
 * <p>Table</p>
 */
public class Table extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BusinessMetadata")
    private BusinessMetadata businessMetadata;

    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("ModifyTime")
    private Long modifyTime;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("ParentMetaEntityId")
    private String parentMetaEntityId;

    @com.aliyun.core.annotation.NameInMap("PartitionKeys")
    private java.util.List<String> partitionKeys;

    @com.aliyun.core.annotation.NameInMap("StatisticsInfos")
    private java.util.Map<String, String> statisticsInfos;

    @com.aliyun.core.annotation.NameInMap("TableType")
    private String tableType;

    @com.aliyun.core.annotation.NameInMap("TechnicalMetadata")
    private TechnicalMetadata technicalMetadata;

    private Table(Builder builder) {
        this.businessMetadata = builder.businessMetadata;
        this.comment = builder.comment;
        this.createTime = builder.createTime;
        this.id = builder.id;
        this.modifyTime = builder.modifyTime;
        this.name = builder.name;
        this.parentMetaEntityId = builder.parentMetaEntityId;
        this.partitionKeys = builder.partitionKeys;
        this.statisticsInfos = builder.statisticsInfos;
        this.tableType = builder.tableType;
        this.technicalMetadata = builder.technicalMetadata;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Table create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessMetadata
     */
    public BusinessMetadata getBusinessMetadata() {
        return this.businessMetadata;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return modifyTime
     */
    public Long getModifyTime() {
        return this.modifyTime;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parentMetaEntityId
     */
    public String getParentMetaEntityId() {
        return this.parentMetaEntityId;
    }

    /**
     * @return partitionKeys
     */
    public java.util.List<String> getPartitionKeys() {
        return this.partitionKeys;
    }

    /**
     * @return statisticsInfos
     */
    public java.util.Map<String, String> getStatisticsInfos() {
        return this.statisticsInfos;
    }

    /**
     * @return tableType
     */
    public String getTableType() {
        return this.tableType;
    }

    /**
     * @return technicalMetadata
     */
    public TechnicalMetadata getTechnicalMetadata() {
        return this.technicalMetadata;
    }

    public static final class Builder {
        private BusinessMetadata businessMetadata; 
        private String comment; 
        private Long createTime; 
        private String id; 
        private Long modifyTime; 
        private String name; 
        private String parentMetaEntityId; 
        private java.util.List<String> partitionKeys; 
        private java.util.Map<String, String> statisticsInfos; 
        private String tableType; 
        private TechnicalMetadata technicalMetadata; 

        private Builder() {
        } 

        private Builder(Table model) {
            this.businessMetadata = model.businessMetadata;
            this.comment = model.comment;
            this.createTime = model.createTime;
            this.id = model.id;
            this.modifyTime = model.modifyTime;
            this.name = model.name;
            this.parentMetaEntityId = model.parentMetaEntityId;
            this.partitionKeys = model.partitionKeys;
            this.statisticsInfos = model.statisticsInfos;
            this.tableType = model.tableType;
            this.technicalMetadata = model.technicalMetadata;
        } 

        /**
         * <p>The business metadata related to DataWorks, including usage instructions, tags, categories, upstream production nodes, and extended information.</p>
         */
        public Builder businessMetadata(BusinessMetadata businessMetadata) {
            this.businessMetadata = businessMetadata;
            return this;
        }

        /**
         * <p>The comment.</p>
         * 
         * <strong>example:</strong>
         * <p>测试表</p>
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * <p>The creation time, in millisecond-level timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1736852168000</p>
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The ID. For more information, see <a href="https://help.aliyun.com/document_detail/2880092.html">Metadata entity concepts</a>.</p>
         * <p>The format is <code>${EntityType}:${instance ID or encoded URL}:${DataFolderIdentity}:${DatabaseName}:${PatternName}:${TableName}</code>. Use an empty character as a placeholder for levels that do not exist.</p>
         * <blockquote>
         * <p>For maxcompute and dlf types, use an empty string as a placeholder for the instance ID. For the maxcompute type, the database name is the MaxCompute project name. Projects with the three-layer model enabled require a schema name. For projects without the three-layer model enabled, use an empty string as a placeholder for the schema name.</p>
         * </blockquote>
         * <blockquote>
         * <p>For the starrocks type, the data catalog identifier is the catalog name. For the dlf type, the data catalog identifier is the catalog ID. Other types do not support the catalog level. Use an empty string as a placeholder.</p>
         * </blockquote>
         * <p>The following examples show the ID formats for common types:</p>
         * <p><code>maxcompute-table:::project_name:[schema_name]:table_name</code></p>
         * <p><code>dlf-table::catalog_id:database_name::table_name</code></p>
         * <p><code>hms-table:instance_id::database_name::table_name</code></p>
         * <p><code>holo-table:instance_id::database_name:schema_name:table_name</code></p>
         * <p><code>mysql-table:(instance_id|encoded_jdbc_url)::database_name::table_name</code></p>
         * <blockquote>
         * <p>Where<br><code>instance_id</code>: The instance ID. This is required when the data source is registered in instance mode.<br><code>encoded_jdbc_url</code>: The URL-encoded JDBC connection string. This is required when the data source is registered by using a connection string.<br><code>catalog_id</code>: The DLF catalog ID.<br><code>project_name</code>: The MaxCompute project name.<br><code>database_name</code>: The database name.<br><code>schema_name</code>: The schema name. For the maxcompute type, this is required only when the three-layer model is enabled for the project. If the three-layer model is not enabled, use an empty string as a placeholder.<br><code>table_name</code>: The table name.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>maxcompute-table:123456XXX::test_project::test_tbl
         * dlf-table:123456XXX:test_catalog:test_db::test_tbl
         * hms-table:c-abc123xxx::test_db::test_tbl
         * holo-table:h-abc123xxx::test_db:test_schema:test_tbl</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The modification time, in millisecond-level timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1736852168000</p>
         */
        public Builder modifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>test_tbl</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The parent-level metadata entity ID. For more information, see <a href="https://help.aliyun.com/document_detail/2880092.html">Metadata entity concepts</a>.</p>
         * <ul>
         * <li><p>For types that support schemas (<code>maxcompute/holo/postgresql/sqlserver/hybriddb_for_postgresql/oracle, where the maxcompute type requires the Layer 3 model to be enabled for the project</code>), ParentMetaEntityId is the database pattern to which the table belongs. The format is <code>${EntityType}:${instance ID or encoded URL}:${DataFolderIdentity}:${DatabaseName}:${PatternName}</code>. Use an empty character as a placeholder for levels that do not exist.</p>
         * </li>
         * <li><p>For other types, ParentMetaEntityId is the database to which the table belongs. The format is <code>${EntityType}:${instance ID or encoded URL}:${DataFolderIdentity}:${DatabaseName}</code>. Use an empty character as a placeholder for levels that do not exist.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>For maxcompute and dlf types, use an empty string as a placeholder for the instance ID. For the maxcompute type, the database name is the MaxCompute project name.</p>
         * </blockquote>
         * <blockquote>
         * <p>For the starrocks type, the data catalog identifier is the catalog name. For the dlf type, the data catalog identifier is the catalog ID. Other types do not support the catalog level. Use an empty string as a placeholder.</p>
         * </blockquote>
         * <p>The following examples show the ParentMetaEntityId formats for common types:</p>
         * <p><code>maxcompute-project:::project_name</code></p>
         * <p><code>maxcompute-schema:::project_name:schema_name</code> (only when the three-layer model is enabled for the project)</p>
         * <p><code>dlf-database::catalog_id:database_name</code></p>
         * <p><code>hms-database:instance_id::database_name</code></p>
         * <p><code>holo-schema:instance_id::database_name:schema_name</code></p>
         * <p><code>mysql-database:(instance_id|encoded_jdbc_url)::database_name</code></p>
         * <blockquote>
         * <p>Where<br><code>instance_id</code>: The instance ID. This is required when the data source is registered in instance mode.<br><code>encoded_jdbc_url</code>: The URL-encoded JDBC connection string. This is required when the data source is registered by using a connection string.<br><code>catalog_id</code>: The DLF catalog ID.<br><code>project_name</code>: The MaxCompute project name.<br><code>database_name</code>: The database name.<br><code>schema_name</code>: The schema name.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>maxcompute-schema:123456XXX::test_project_with_schema:default
         * maxcompute-project:123456XXX::test_project_without_schema
         * dlf-database:123456XXX:test_catalog:test_db
         * hms-database:c-abc123xxx::test_db
         * holo-schema:h-abc123xxx::test_db:test_schema</p>
         */
        public Builder parentMetaEntityId(String parentMetaEntityId) {
            this.parentMetaEntityId = parentMetaEntityId;
            return this;
        }

        /**
         * <p>The list of partition keys. This is empty for non-partitioned tables.</p>
         */
        public Builder partitionKeys(java.util.List<String> partitionKeys) {
            this.partitionKeys = partitionKeys;
            return this;
        }

        /**
         * StatisticsInfos.
         */
        public Builder statisticsInfos(java.util.Map<String, String> statisticsInfos) {
            this.statisticsInfos = statisticsInfos;
            return this;
        }

        /**
         * <p>The table type. The valid values depend on the metadata collector type.</p>
         * 
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        public Builder tableType(String tableType) {
            this.tableType = tableType;
            return this;
        }

        /**
         * <p>The technical metadata.</p>
         */
        public Builder technicalMetadata(TechnicalMetadata technicalMetadata) {
            this.technicalMetadata = technicalMetadata;
            return this;
        }

        public Table build() {
            return new Table(this);
        } 

    } 

    /**
     * 
     * {@link Table} extends {@link TeaModel}
     *
     * <p>Table</p>
     */
    public static class Categories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private String parentId;

        private Categories(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.parentId = builder.parentId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Categories create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parentId
         */
        public String getParentId() {
            return this.parentId;
        }

        public static final class Builder {
            private String id; 
            private String name; 
            private String parentId; 

            private Builder() {
            } 

            private Builder(Categories model) {
                this.id = model.id;
                this.name = model.name;
                this.parentId = model.parentId;
            } 

            /**
             * <p>The category ID.</p>
             * 
             * <strong>example:</strong>
             * <p>CATEGORY.456</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>测试类目</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The parent category ID. This parameter can be empty.</p>
             * 
             * <strong>example:</strong>
             * <p>CATEGORY.123</p>
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            public Categories build() {
                return new Categories(this);
            } 

        } 

    }
    /**
     * 
     * {@link Table} extends {@link TeaModel}
     *
     * <p>Table</p>
     */
    public static class Extension extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("FavorCount")
        private Long favorCount;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("ReadCount")
        private Long readCount;

        @com.aliyun.core.annotation.NameInMap("ViewCount")
        private Long viewCount;

        private Extension(Builder builder) {
            this.envType = builder.envType;
            this.favorCount = builder.favorCount;
            this.projectId = builder.projectId;
            this.readCount = builder.readCount;
            this.viewCount = builder.viewCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Extension create() {
            return builder().build();
        }

        /**
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
        }

        /**
         * @return favorCount
         */
        public Long getFavorCount() {
            return this.favorCount;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return readCount
         */
        public Long getReadCount() {
            return this.readCount;
        }

        /**
         * @return viewCount
         */
        public Long getViewCount() {
            return this.viewCount;
        }

        public static final class Builder {
            private String envType; 
            private Long favorCount; 
            private Long projectId; 
            private Long readCount; 
            private Long viewCount; 

            private Builder() {
            } 

            private Builder(Extension model) {
                this.envType = model.envType;
                this.favorCount = model.favorCount;
                this.projectId = model.projectId;
                this.readCount = model.readCount;
                this.viewCount = model.viewCount;
            } 

            /**
             * <p>The environment type. Valid values:</p>
             * <ul>
             * <li>Prod: Production environment.</li>
             * <li>Dev: Development environment.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Dev</p>
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * <p>The favorite count.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder favorCount(Long favorCount) {
                this.favorCount = favorCount;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>234</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The read count.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder readCount(Long readCount) {
                this.readCount = readCount;
                return this;
            }

            /**
             * <p>The view count.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder viewCount(Long viewCount) {
                this.viewCount = viewCount;
                return this;
            }

            public Extension build() {
                return new Extension(this);
            } 

        } 

    }
    /**
     * 
     * {@link Table} extends {@link TeaModel}
     *
     * <p>Table</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
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
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key. This parameter cannot be empty.</p>
             * 
             * <strong>example:</strong>
             * <p>tag_key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. This parameter can be empty.</p>
             * 
             * <strong>example:</strong>
             * <p>tag_value</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link Table} extends {@link TeaModel}
     *
     * <p>Table</p>
     */
    public static class UpstreamTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private UpstreamTasks(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpstreamTasks create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Long id; 
            private String name; 

            private Builder() {
            } 

            private Builder(UpstreamTasks model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The node name.</p>
             * 
             * <strong>example:</strong>
             * <p>test_task</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public UpstreamTasks build() {
                return new UpstreamTasks(this);
            } 

        } 

    }
    /**
     * 
     * {@link Table} extends {@link TeaModel}
     *
     * <p>Table</p>
     */
    public static class BusinessMetadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Categories")
        private java.util.List<java.util.List<Categories>> categories;

        @com.aliyun.core.annotation.NameInMap("CustomAttributes")
        private java.util.Map<String, java.util.List<String>> customAttributes;

        @com.aliyun.core.annotation.NameInMap("Extension")
        private Extension extension;

        @com.aliyun.core.annotation.NameInMap("Readme")
        private String readme;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("UpstreamTasks")
        private java.util.List<UpstreamTasks> upstreamTasks;

        private BusinessMetadata(Builder builder) {
            this.categories = builder.categories;
            this.customAttributes = builder.customAttributes;
            this.extension = builder.extension;
            this.readme = builder.readme;
            this.tags = builder.tags;
            this.upstreamTasks = builder.upstreamTasks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BusinessMetadata create() {
            return builder().build();
        }

        /**
         * @return categories
         */
        public java.util.List<java.util.List<Categories>> getCategories() {
            return this.categories;
        }

        /**
         * @return customAttributes
         */
        public java.util.Map<String, java.util.List<String>> getCustomAttributes() {
            return this.customAttributes;
        }

        /**
         * @return extension
         */
        public Extension getExtension() {
            return this.extension;
        }

        /**
         * @return readme
         */
        public String getReadme() {
            return this.readme;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return upstreamTasks
         */
        public java.util.List<UpstreamTasks> getUpstreamTasks() {
            return this.upstreamTasks;
        }

        public static final class Builder {
            private java.util.List<java.util.List<Categories>> categories; 
            private java.util.Map<String, java.util.List<String>> customAttributes; 
            private Extension extension; 
            private String readme; 
            private java.util.List<Tags> tags; 
            private java.util.List<UpstreamTasks> upstreamTasks; 

            private Builder() {
            } 

            private Builder(BusinessMetadata model) {
                this.categories = model.categories;
                this.customAttributes = model.customAttributes;
                this.extension = model.extension;
                this.readme = model.readme;
                this.tags = model.tags;
                this.upstreamTasks = model.upstreamTasks;
            } 

            /**
             * <p>The list of categories.</p>
             */
            public Builder categories(java.util.List<java.util.List<Categories>> categories) {
                this.categories = categories;
                return this;
            }

            /**
             * <p>The custom attribute values, where key is the custom attribute identifier and value is the list of attribute values.</p>
             */
            public Builder customAttributes(java.util.Map<String, java.util.List<String>> customAttributes) {
                this.customAttributes = customAttributes;
                return this;
            }

            /**
             * <p>The extension information. Currently only supported for MaxCompute type.</p>
             */
            public Builder extension(Extension extension) {
                this.extension = extension;
                return this;
            }

            /**
             * <p>The usage instructions.</p>
             * 
             * <strong>example:</strong>
             * <h2>使用说明</h2>
             */
            public Builder readme(String readme) {
                this.readme = readme;
                return this;
            }

            /**
             * <p>The list of tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The list of upstream nodes.</p>
             */
            public Builder upstreamTasks(java.util.List<UpstreamTasks> upstreamTasks) {
                this.upstreamTasks = upstreamTasks;
                return this;
            }

            public BusinessMetadata build() {
                return new BusinessMetadata(this);
            } 

        } 

    }
    /**
     * 
     * {@link Table} extends {@link TeaModel}
     *
     * <p>Table</p>
     */
    public static class TechnicalMetadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Compressed")
        private Boolean compressed;

        @com.aliyun.core.annotation.NameInMap("InputFormat")
        private String inputFormat;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("OutputFormat")
        private String outputFormat;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("Parameters")
        private java.util.Map<String, String> parameters;

        @com.aliyun.core.annotation.NameInMap("SerializationLibrary")
        private String serializationLibrary;

        private TechnicalMetadata(Builder builder) {
            this.compressed = builder.compressed;
            this.inputFormat = builder.inputFormat;
            this.location = builder.location;
            this.outputFormat = builder.outputFormat;
            this.owner = builder.owner;
            this.parameters = builder.parameters;
            this.serializationLibrary = builder.serializationLibrary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TechnicalMetadata create() {
            return builder().build();
        }

        /**
         * @return compressed
         */
        public Boolean getCompressed() {
            return this.compressed;
        }

        /**
         * @return inputFormat
         */
        public String getInputFormat() {
            return this.inputFormat;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return outputFormat
         */
        public String getOutputFormat() {
            return this.outputFormat;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return parameters
         */
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        /**
         * @return serializationLibrary
         */
        public String getSerializationLibrary() {
            return this.serializationLibrary;
        }

        public static final class Builder {
            private Boolean compressed; 
            private String inputFormat; 
            private String location; 
            private String outputFormat; 
            private String owner; 
            private java.util.Map<String, String> parameters; 
            private String serializationLibrary; 

            private Builder() {
            } 

            private Builder(TechnicalMetadata model) {
                this.compressed = model.compressed;
                this.inputFormat = model.inputFormat;
                this.location = model.location;
                this.outputFormat = model.outputFormat;
                this.owner = model.owner;
                this.parameters = model.parameters;
                this.serializationLibrary = model.serializationLibrary;
            } 

            /**
             * <p>Indicates whether the table is compressed.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder compressed(Boolean compressed) {
                this.compressed = compressed;
                return this;
            }

            /**
             * <p>The input format.</p>
             * 
             * <strong>example:</strong>
             * <p>org.apache.hadoop.hive.ql.io.parquet.MapredParquetInputFormat</p>
             */
            public Builder inputFormat(String inputFormat) {
                this.inputFormat = inputFormat;
                return this;
            }

            /**
             * <p>The storage location.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://test-bucket/test_tbl</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The output format.</p>
             * 
             * <strong>example:</strong>
             * <p>org.apache.hadoop.hive.ql.io.parquet.MapredParquetOutputFormat</p>
             */
            public Builder outputFormat(String outputFormat) {
                this.outputFormat = outputFormat;
                return this;
            }

            /**
             * <p>The owner.</p>
             * 
             * <strong>example:</strong>
             * <p>test_user</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The parameter information.</p>
             */
            public Builder parameters(java.util.Map<String, String> parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>The class used by SerDe.</p>
             * 
             * <strong>example:</strong>
             * <p>org.apache.hadoop.hive.ql.io.parquet.serde.ParquetHiveSerDe</p>
             */
            public Builder serializationLibrary(String serializationLibrary) {
                this.serializationLibrary = serializationLibrary;
                return this;
            }

            public TechnicalMetadata build() {
                return new TechnicalMetadata(this);
            } 

        } 

    }
}
