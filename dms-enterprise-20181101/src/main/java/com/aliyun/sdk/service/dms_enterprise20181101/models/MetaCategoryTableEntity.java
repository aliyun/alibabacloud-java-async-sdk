// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link MetaCategoryTableEntity} extends {@link TeaModel}
 *
 * <p>MetaCategoryTableEntity</p>
 */
public class MetaCategoryTableEntity extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CatalogName")
    private String catalogName;

    @com.aliyun.core.annotation.NameInMap("CategoryId")
    private Long categoryId;

    @com.aliyun.core.annotation.NameInMap("DatabaseSearchName")
    private String databaseSearchName;

    @com.aliyun.core.annotation.NameInMap("DbId")
    private Integer dbId;

    @com.aliyun.core.annotation.NameInMap("DbType")
    private String dbType;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private Integer instanceId;

    @com.aliyun.core.annotation.NameInMap("SchemaName")
    private String schemaName;

    @com.aliyun.core.annotation.NameInMap("TableName")
    private String tableName;

    @com.aliyun.core.annotation.NameInMap("TableSchemaName")
    private String tableSchemaName;

    private MetaCategoryTableEntity(Builder builder) {
        this.catalogName = builder.catalogName;
        this.categoryId = builder.categoryId;
        this.databaseSearchName = builder.databaseSearchName;
        this.dbId = builder.dbId;
        this.dbType = builder.dbType;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.schemaName = builder.schemaName;
        this.tableName = builder.tableName;
        this.tableSchemaName = builder.tableSchemaName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MetaCategoryTableEntity create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalogName
     */
    public String getCatalogName() {
        return this.catalogName;
    }

    /**
     * @return categoryId
     */
    public Long getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return databaseSearchName
     */
    public String getDatabaseSearchName() {
        return this.databaseSearchName;
    }

    /**
     * @return dbId
     */
    public Integer getDbId() {
        return this.dbId;
    }

    /**
     * @return dbType
     */
    public String getDbType() {
        return this.dbType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceId
     */
    public Integer getInstanceId() {
        return this.instanceId;
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
     * @return tableSchemaName
     */
    public String getTableSchemaName() {
        return this.tableSchemaName;
    }

    public static final class Builder {
        private String catalogName; 
        private Long categoryId; 
        private String databaseSearchName; 
        private Integer dbId; 
        private String dbType; 
        private String description; 
        private Integer instanceId; 
        private String schemaName; 
        private String tableName; 
        private String tableSchemaName; 

        private Builder() {
        } 

        private Builder(MetaCategoryTableEntity model) {
            this.catalogName = model.catalogName;
            this.categoryId = model.categoryId;
            this.databaseSearchName = model.databaseSearchName;
            this.dbId = model.dbId;
            this.dbType = model.dbType;
            this.description = model.description;
            this.instanceId = model.instanceId;
            this.schemaName = model.schemaName;
            this.tableName = model.tableName;
            this.tableSchemaName = model.tableSchemaName;
        } 

        /**
         * CatalogName.
         */
        public Builder catalogName(String catalogName) {
            this.catalogName = catalogName;
            return this;
        }

        /**
         * CategoryId.
         */
        public Builder categoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        /**
         * DatabaseSearchName.
         */
        public Builder databaseSearchName(String databaseSearchName) {
            this.databaseSearchName = databaseSearchName;
            return this;
        }

        /**
         * DbId.
         */
        public Builder dbId(Integer dbId) {
            this.dbId = dbId;
            return this;
        }

        /**
         * DbType.
         */
        public Builder dbType(String dbType) {
            this.dbType = dbType;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(Integer instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * SchemaName.
         */
        public Builder schemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }

        /**
         * TableName.
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        /**
         * TableSchemaName.
         */
        public Builder tableSchemaName(String tableSchemaName) {
            this.tableSchemaName = tableSchemaName;
            return this;
        }

        public MetaCategoryTableEntity build() {
            return new MetaCategoryTableEntity(this);
        } 

    } 

}
