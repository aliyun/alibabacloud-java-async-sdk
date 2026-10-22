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
 * {@link Column} extends {@link TeaModel}
 *
 * <p>Column</p>
 */
public class Column extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BusinessMetadata")
    private BusinessMetadata businessMetadata;

    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("ForeignKey")
    private Boolean foreignKey;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("PartitionKey")
    private Boolean partitionKey;

    @com.aliyun.core.annotation.NameInMap("Position")
    private Integer position;

    @com.aliyun.core.annotation.NameInMap("PrimaryKey")
    private Boolean primaryKey;

    @com.aliyun.core.annotation.NameInMap("StatisticsInfos")
    private java.util.Map<String, String> statisticsInfos;

    @com.aliyun.core.annotation.NameInMap("TableId")
    private String tableId;

    @com.aliyun.core.annotation.NameInMap("TechnicalMetadata")
    private TechnicalMetadata technicalMetadata;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private Column(Builder builder) {
        this.businessMetadata = builder.businessMetadata;
        this.comment = builder.comment;
        this.foreignKey = builder.foreignKey;
        this.id = builder.id;
        this.name = builder.name;
        this.partitionKey = builder.partitionKey;
        this.position = builder.position;
        this.primaryKey = builder.primaryKey;
        this.statisticsInfos = builder.statisticsInfos;
        this.tableId = builder.tableId;
        this.technicalMetadata = builder.technicalMetadata;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Column create() {
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
     * @return foreignKey
     */
    public Boolean getForeignKey() {
        return this.foreignKey;
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
     * @return partitionKey
     */
    public Boolean getPartitionKey() {
        return this.partitionKey;
    }

    /**
     * @return position
     */
    public Integer getPosition() {
        return this.position;
    }

    /**
     * @return primaryKey
     */
    public Boolean getPrimaryKey() {
        return this.primaryKey;
    }

    /**
     * @return statisticsInfos
     */
    public java.util.Map<String, String> getStatisticsInfos() {
        return this.statisticsInfos;
    }

    /**
     * @return tableId
     */
    public String getTableId() {
        return this.tableId;
    }

    /**
     * @return technicalMetadata
     */
    public TechnicalMetadata getTechnicalMetadata() {
        return this.technicalMetadata;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private BusinessMetadata businessMetadata; 
        private String comment; 
        private Boolean foreignKey; 
        private String id; 
        private String name; 
        private Boolean partitionKey; 
        private Integer position; 
        private Boolean primaryKey; 
        private java.util.Map<String, String> statisticsInfos; 
        private String tableId; 
        private TechnicalMetadata technicalMetadata; 
        private String type; 

        private Builder() {
        } 

        private Builder(Column model) {
            this.businessMetadata = model.businessMetadata;
            this.comment = model.comment;
            this.foreignKey = model.foreignKey;
            this.id = model.id;
            this.name = model.name;
            this.partitionKey = model.partitionKey;
            this.position = model.position;
            this.primaryKey = model.primaryKey;
            this.statisticsInfos = model.statisticsInfos;
            this.tableId = model.tableId;
            this.technicalMetadata = model.technicalMetadata;
            this.type = model.type;
        } 

        /**
         * <p>The business metadata.</p>
         */
        public Builder businessMetadata(BusinessMetadata businessMetadata) {
            this.businessMetadata = businessMetadata;
            return this;
        }

        /**
         * <p>The comment.</p>
         * 
         * <strong>example:</strong>
         * <p>Column 1</p>
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * <p>Specifies whether the column is a foreign key. Currently, only the MaxCompute type is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder foreignKey(Boolean foreignKey) {
            this.foreignKey = foreignKey;
            return this;
        }

        /**
         * <p>The ID. For more information, see <a href="https://help.aliyun.com/document_detail/2880092.html">Metadata entity concepts</a>.</p>
         * <p>The format is <code>${EntityType}:${Instance ID or URL-encoded URL}:${Catalog ID}:${Database name}:${Schema name}:${Table name}:${Column name}</code>. Use an empty string as a placeholder for non-existent levels.</p>
         * <blockquote>
         * <p>For MaxCompute and DLF types, use an empty string as a placeholder for the instance ID. For the MaxCompute type, the database name is the MaxCompute project name. Projects with the three-tier model enabled require the schema name. For projects without the three-tier model enabled, use an empty string as a placeholder for the schema name.</p>
         * </blockquote>
         * <blockquote>
         * <p>For the StarRocks type, the catalog ID is the catalog name. For the DLF type, the catalog ID is the catalog ID. Other types do not support the catalog level, and an empty string can be used as a placeholder.</p>
         * </blockquote>
         * <p>The following are the ID formats for several common types:</p>
         * <p><code>maxcompute-column:::project_name:[schema_name]:table_name:column_name</code></p>
         * <p><code>dlf-column::catalog_id:database_name::table_name:column_name</code></p>
         * <p><code>hms-column:instance_id::database_name::table_name:column_name</code></p>
         * <p><code>holo-column:instance_id::database_name:schema_name:table_name:column_name</code></p>
         * <p><code>mysql-column:(instance_id|encoded_jdbc_url)::database_name::table_name:column_name</code></p>
         * <blockquote>
         * <p>Where:<br><code>instance_id</code>: The instance ID, which is required when the data source is registered in instance mode.<br><code>encoded_jdbc_url</code>: The URL-encoded JDBC connection string, which is required when the data source is registered in connection string mode.<br><code>catalog_id</code>: The DLF catalog ID.<br><code>project_name</code>: The MaxCompute project name.<br><code>database_name</code>: The database name.<br><code>schema_name</code>: The schema name. For the MaxCompute type, this is required only if the three-tier model is enabled for the project. If it is not enabled, use an empty string as a placeholder.<br><code>table_name</code>: The table name.<br><code>column_name</code>: The column name.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>maxcompute-column:::project_name:[schema_name]:table_name:column_name</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>column_name</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>Specifies whether the column is a partition key.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder partitionKey(Boolean partitionKey) {
            this.partitionKey = partitionKey;
            return this;
        }

        /**
         * <p>The position.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder position(Integer position) {
            this.position = position;
            return this;
        }

        /**
         * <p>Specifies whether the column is a primary key. Currently, only the MaxCompute type is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder primaryKey(Boolean primaryKey) {
            this.primaryKey = primaryKey;
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
         * <p>The ID of the table. Refer to the Table object.</p>
         * 
         * <strong>example:</strong>
         * <p>maxcompute-table:::project_name:[schema_name]:table_name</p>
         */
        public Builder tableId(String tableId) {
            this.tableId = tableId;
            return this;
        }

        /**
         * <p>The technical metadata.</p>
         */
        public Builder technicalMetadata(TechnicalMetadata technicalMetadata) {
            this.technicalMetadata = technicalMetadata;
            return this;
        }

        /**
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>bigint</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Column build() {
            return new Column(this);
        } 

    } 

    /**
     * 
     * {@link Column} extends {@link TeaModel}
     *
     * <p>Column</p>
     */
    public static class BusinessMetadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomAttributes")
        private java.util.Map<String, java.util.List<String>> customAttributes;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        private BusinessMetadata(Builder builder) {
            this.customAttributes = builder.customAttributes;
            this.description = builder.description;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BusinessMetadata create() {
            return builder().build();
        }

        /**
         * @return customAttributes
         */
        public java.util.Map<String, java.util.List<String>> getCustomAttributes() {
            return this.customAttributes;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        public static final class Builder {
            private java.util.Map<String, java.util.List<String>> customAttributes; 
            private String description; 

            private Builder() {
            } 

            private Builder(BusinessMetadata model) {
                this.customAttributes = model.customAttributes;
                this.description = model.description;
            } 

            /**
             * <p>The custom attribute values, where the key is the custom attribute identifier and the value is a list of attribute values.</p>
             */
            public Builder customAttributes(java.util.Map<String, java.util.List<String>> customAttributes) {
                this.customAttributes = customAttributes;
                return this;
            }

            /**
             * <p>The business description of the column. Currently, only MaxCompute, HMS (EMR cluster), and DLF types are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>Business description of Column 1</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            public BusinessMetadata build() {
                return new BusinessMetadata(this);
            } 

        } 

    }
    /**
     * 
     * {@link Column} extends {@link TeaModel}
     *
     * <p>Column</p>
     */
    public static class TechnicalMetadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Parameters")
        private java.util.Map<String, String> parameters;

        private TechnicalMetadata(Builder builder) {
            this.parameters = builder.parameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TechnicalMetadata create() {
            return builder().build();
        }

        /**
         * @return parameters
         */
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public static final class Builder {
            private java.util.Map<String, String> parameters; 

            private Builder() {
            } 

            private Builder(TechnicalMetadata model) {
                this.parameters = model.parameters;
            } 

            /**
             * <p>The technical parameters of the column, where the key is the parameter name and the value is a string. Objects or arrays are represented as JSON strings.</p>
             */
            public Builder parameters(java.util.Map<String, String> parameters) {
                this.parameters = parameters;
                return this;
            }

            public TechnicalMetadata build() {
                return new TechnicalMetadata(this);
            } 

        } 

    }
}
