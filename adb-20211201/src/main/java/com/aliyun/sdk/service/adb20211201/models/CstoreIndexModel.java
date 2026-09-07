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
 * {@link CstoreIndexModel} extends {@link TeaModel}
 *
 * <p>CstoreIndexModel</p>
 */
public class CstoreIndexModel extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ColumnOrds")
    private java.util.List<String> columnOrds;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("DatabaseName")
    private String databaseName;

    @com.aliyun.core.annotation.NameInMap("IndexColumns")
    private java.util.List<FieldSchemaModel> indexColumns;

    @com.aliyun.core.annotation.NameInMap("IndexName")
    private String indexName;

    @com.aliyun.core.annotation.NameInMap("IndexType")
    private String indexType;

    @com.aliyun.core.annotation.NameInMap("Options")
    private java.util.Map<String, String> options;

    @com.aliyun.core.annotation.NameInMap("PhysicalTableName")
    private String physicalTableName;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    private CstoreIndexModel(Builder builder) {
        this.columnOrds = builder.columnOrds;
        this.createTime = builder.createTime;
        this.databaseName = builder.databaseName;
        this.indexColumns = builder.indexColumns;
        this.indexName = builder.indexName;
        this.indexType = builder.indexType;
        this.options = builder.options;
        this.physicalTableName = builder.physicalTableName;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CstoreIndexModel create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return columnOrds
     */
    public java.util.List<String> getColumnOrds() {
        return this.columnOrds;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return indexColumns
     */
    public java.util.List<FieldSchemaModel> getIndexColumns() {
        return this.indexColumns;
    }

    /**
     * @return indexName
     */
    public String getIndexName() {
        return this.indexName;
    }

    /**
     * @return indexType
     */
    public String getIndexType() {
        return this.indexType;
    }

    /**
     * @return options
     */
    public java.util.Map<String, String> getOptions() {
        return this.options;
    }

    /**
     * @return physicalTableName
     */
    public String getPhysicalTableName() {
        return this.physicalTableName;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private java.util.List<String> columnOrds; 
        private String createTime; 
        private String databaseName; 
        private java.util.List<FieldSchemaModel> indexColumns; 
        private String indexName; 
        private String indexType; 
        private java.util.Map<String, String> options; 
        private String physicalTableName; 
        private String updateTime; 

        private Builder() {
        } 

        private Builder(CstoreIndexModel model) {
            this.columnOrds = model.columnOrds;
            this.createTime = model.createTime;
            this.databaseName = model.databaseName;
            this.indexColumns = model.indexColumns;
            this.indexName = model.indexName;
            this.indexType = model.indexType;
            this.options = model.options;
            this.physicalTableName = model.physicalTableName;
            this.updateTime = model.updateTime;
        } 

        /**
         * <p>The order of index columns.</p>
         */
        public Builder columnOrds(java.util.List<String> columnOrds) {
            this.columnOrds = columnOrds;
            return this;
        }

        /**
         * <p>The time when the index was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-05 13:17:55</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The logical name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleDatabase</p>
         */
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        /**
         * <p>The index columns.</p>
         */
        public Builder indexColumns(java.util.List<FieldSchemaModel> indexColumns) {
            this.indexColumns = indexColumns;
            return this;
        }

        /**
         * <p>The name of the index.</p>
         * 
         * <strong>example:</strong>
         * <p>indexName</p>
         */
        public Builder indexName(String indexName) {
            this.indexName = indexName;
            return this;
        }

        /**
         * <p>The type of the index.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder indexType(String indexType) {
            this.indexType = indexType;
            return this;
        }

        /**
         * <p>The properties.</p>
         */
        public Builder options(java.util.Map<String, String> options) {
            this.options = options;
            return this;
        }

        /**
         * <p>The physical name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>physicalDatabase</p>
         */
        public Builder physicalTableName(String physicalTableName) {
            this.physicalTableName = physicalTableName;
            return this;
        }

        /**
         * <p>The time when the index was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-05 13:17:55</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public CstoreIndexModel build() {
            return new CstoreIndexModel(this);
        } 

    } 

}
