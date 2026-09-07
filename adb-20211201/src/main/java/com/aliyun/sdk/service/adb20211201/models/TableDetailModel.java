// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link TableDetailModel} extends {@link TeaModel}
 *
 * <p>TableDetailModel</p>
 */
public class TableDetailModel extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Catalog")
    private String catalog;

    @com.aliyun.core.annotation.NameInMap("Columns")
    private java.util.List<ColDetailModel> columns;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("CreatedBySource")
    private String createdBySource;

    @com.aliyun.core.annotation.NameInMap("CreatedByUser")
    private String createdByUser;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Location")
    private String location;

    @com.aliyun.core.annotation.NameInMap("Owner")
    private String owner;

    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.Map<String, String> parameters;

    @com.aliyun.core.annotation.NameInMap("SchemaName")
    private String schemaName;

    @com.aliyun.core.annotation.NameInMap("TableName")
    private String tableName;

    @com.aliyun.core.annotation.NameInMap("TableType")
    private String tableType;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    private TableDetailModel(Builder builder) {
        this.catalog = builder.catalog;
        this.columns = builder.columns;
        this.createTime = builder.createTime;
        this.createdBySource = builder.createdBySource;
        this.createdByUser = builder.createdByUser;
        this.description = builder.description;
        this.location = builder.location;
        this.owner = builder.owner;
        this.parameters = builder.parameters;
        this.schemaName = builder.schemaName;
        this.tableName = builder.tableName;
        this.tableType = builder.tableType;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TableDetailModel create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalog
     */
    public String getCatalog() {
        return this.catalog;
    }

    /**
     * @return columns
     */
    public java.util.List<ColDetailModel> getColumns() {
        return this.columns;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return createdBySource
     */
    public String getCreatedBySource() {
        return this.createdBySource;
    }

    /**
     * @return createdByUser
     */
    public String getCreatedByUser() {
        return this.createdByUser;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
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
     * @return schemaName
     */
    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return tableType
     */
    public String getTableType() {
        return this.tableType;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String catalog; 
        private java.util.List<ColDetailModel> columns; 
        private String createTime; 
        private String createdBySource; 
        private String createdByUser; 
        private String description; 
        private String location; 
        private String owner; 
        private java.util.Map<String, String> parameters; 
        private String schemaName; 
        private String tableName; 
        private String tableType; 
        private String updateTime; 

        private Builder() {
        } 

        private Builder(TableDetailModel model) {
            this.catalog = model.catalog;
            this.columns = model.columns;
            this.createTime = model.createTime;
            this.createdBySource = model.createdBySource;
            this.createdByUser = model.createdByUser;
            this.description = model.description;
            this.location = model.location;
            this.owner = model.owner;
            this.parameters = model.parameters;
            this.schemaName = model.schemaName;
            this.tableName = model.tableName;
            this.tableType = model.tableType;
            this.updateTime = model.updateTime;
        } 

        /**
         * <p>External data source.</p>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
        public Builder catalog(String catalog) {
            this.catalog = catalog;
            return this;
        }

        /**
         * <p>Column information.</p>
         */
        public Builder columns(java.util.List<ColDetailModel> columns) {
            this.columns = columns;
            return this;
        }

        /**
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-05 13:17:55</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * CreatedBySource.
         */
        public Builder createdBySource(String createdBySource) {
            this.createdBySource = createdBySource;
            return this;
        }

        /**
         * CreatedByUser.
         */
        public Builder createdByUser(String createdByUser) {
            this.createdByUser = createdByUser;
            return this;
        }

        /**
         * <p>Description.</p>
         * 
         * <strong>example:</strong>
         * <p>Description</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Location.
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * <p>Owner.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder owner(String owner) {
            this.owner = owner;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>Logical database name.</p>
         * 
         * <strong>example:</strong>
         * <p>schemaName</p>
         */
        public Builder schemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }

        /**
         * <p>Logical table name.</p>
         * 
         * <strong>example:</strong>
         * <p>tableName</p>
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        /**
         * <p>Table type.</p>
         * 
         * <strong>example:</strong>
         * <p>PHYSICAL_SCHEMA_NAME</p>
         */
        public Builder tableType(String tableType) {
            this.tableType = tableType;
            return this;
        }

        /**
         * <p>Update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-05 13:17:55</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public TableDetailModel build() {
            return new TableDetailModel(this);
        } 

    } 

}
