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
 * {@link ColDetailModel} extends {@link TeaModel}
 *
 * <p>ColDetailModel</p>
 */
public class ColDetailModel extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ColumnName")
    private String columnName;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("DistributeKey")
    private Boolean distributeKey;

    @com.aliyun.core.annotation.NameInMap("Nullable")
    private Boolean nullable;

    @com.aliyun.core.annotation.NameInMap("PartitionKey")
    private Boolean partitionKey;

    @com.aliyun.core.annotation.NameInMap("PrimaryKey")
    private Boolean primaryKey;

    @com.aliyun.core.annotation.NameInMap("SchemaName")
    private String schemaName;

    @com.aliyun.core.annotation.NameInMap("TableName")
    private String tableName;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ColDetailModel model) {
            this.columnName = model.columnName;
            this.createTime = model.createTime;
            this.description = model.description;
            this.distributeKey = model.distributeKey;
            this.nullable = model.nullable;
            this.partitionKey = model.partitionKey;
            this.primaryKey = model.primaryKey;
            this.schemaName = model.schemaName;
            this.tableName = model.tableName;
            this.type = model.type;
            this.updateTime = model.updateTime;
        } 

        /**
         * <p>The logical name of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder columnName(String columnName) {
            this.columnName = columnName;
            return this;
        }

        /**
         * <p>The time when the column was created. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-05\&quot;T\&quot;13:17:55\&quot;Z\&quot;</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The description of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>description</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>Indicates whether the column is the distribution key.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder distributeKey(Boolean distributeKey) {
            this.distributeKey = distributeKey;
            return this;
        }

        /**
         * <p>Indicates whether the column can be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder nullable(Boolean nullable) {
            this.nullable = nullable;
            return this;
        }

        /**
         * <p>Indicates whether the column is the partition key.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder partitionKey(Boolean partitionKey) {
            this.partitionKey = partitionKey;
            return this;
        }

        /**
         * <p>Indicates whether the column is the primary key.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder primaryKey(Boolean primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }

        /**
         * <p>The logical name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>schemaName</p>
         */
        public Builder schemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }

        /**
         * <p>The logical name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>tableName</p>
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        /**
         * <p>The data type of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The time when the column was updated. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-05\&quot;T\&quot;13:17:55\&quot;Z\&quot;</p>
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
