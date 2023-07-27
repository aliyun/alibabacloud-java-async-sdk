// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ColDetailModel} extends {@link TeaModel}
 *
 * <p>ColDetailModel</p>
 */
public class ColDetailModel extends TeaModel {
    @NameInMap("ColumnName")
    private String columnName;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("Description")
    private String description;

    @NameInMap("DistributeKey")
    private Boolean distributeKey;

    @NameInMap("Nullable")
    private Boolean nullable;

    @NameInMap("PartitionKey")
    private Boolean partitionKey;

    @NameInMap("PrimaryKey")
    private Boolean primaryKey;

    @NameInMap("SchemaName")
    private String schemaName;

    @NameInMap("TableName")
    private String tableName;

    @NameInMap("Type")
    private String type;

    @NameInMap("UpdateTime")
    private String updateTime;

    private ColDetailModel(Builder builder) {
        this.columnName = builder.columnName;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.distributeKey = builder.distributeKey;
        this.nullable = builder.nullable;
        this.partitionKey = builder.partitionKey;
        this.primaryKey = builder.primaryKey;
        this.schemaName = builder.schemaName;
        this.tableName = builder.tableName;
        this.type = builder.type;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ColDetailModel create() {
        return builder().build();
    }

    /**
     * @return columnName
     */
    public String getColumnName() {
        return this.columnName;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return distributeKey
     */
    public Boolean getDistributeKey() {
        return this.distributeKey;
    }

    /**
     * @return nullable
     */
    public Boolean getNullable() {
        return this.nullable;
    }

    /**
     * @return partitionKey
     */
    public Boolean getPartitionKey() {
        return this.partitionKey;
    }

    /**
     * @return primaryKey
     */
    public Boolean getPrimaryKey() {
        return this.primaryKey;
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String columnName; 
        private String createTime; 
        private String description; 
        private Boolean distributeKey; 
        private Boolean nullable; 
        private Boolean partitionKey; 
        private Boolean primaryKey; 
        private String schemaName; 
        private String tableName; 
        private String type; 
        private String updateTime; 

        /**
         * ColumnName.
         */
        public Builder columnName(String columnName) {
            this.columnName = columnName;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
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
         * DistributeKey.
         */
        public Builder distributeKey(Boolean distributeKey) {
            this.distributeKey = distributeKey;
            return this;
        }

        /**
         * Nullable.
         */
        public Builder nullable(Boolean nullable) {
            this.nullable = nullable;
            return this;
        }

        /**
         * PartitionKey.
         */
        public Builder partitionKey(Boolean partitionKey) {
            this.partitionKey = partitionKey;
            return this;
        }

        /**
         * PrimaryKey.
         */
        public Builder primaryKey(Boolean primaryKey) {
            this.primaryKey = primaryKey;
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
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public ColDetailModel build() {
            return new ColDetailModel(this);
        } 

    } 

}
