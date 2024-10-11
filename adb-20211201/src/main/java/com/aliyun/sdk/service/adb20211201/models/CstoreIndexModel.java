// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
    private java.util.List < String > columnOrds;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("DatabaseName")
    private String databaseName;

    @com.aliyun.core.annotation.NameInMap("IndexColumns")
    private java.util.List < FieldSchemaModel > indexColumns;

    @com.aliyun.core.annotation.NameInMap("IndexName")
    private String indexName;

    @com.aliyun.core.annotation.NameInMap("IndexType")
    private String indexType;

    @com.aliyun.core.annotation.NameInMap("Options")
    private java.util.Map < String, String > options;

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

    /**
     * @return columnOrds
     */
    public java.util.List < String > getColumnOrds() {
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
    public java.util.List < FieldSchemaModel > getIndexColumns() {
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
    public java.util.Map < String, String > getOptions() {
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
        private java.util.List < String > columnOrds; 
        private String createTime; 
        private String databaseName; 
        private java.util.List < FieldSchemaModel > indexColumns; 
        private String indexName; 
        private String indexType; 
        private java.util.Map < String, String > options; 
        private String physicalTableName; 
        private String updateTime; 

        /**
         * ColumnOrds.
         */
        public Builder columnOrds(java.util.List < String > columnOrds) {
            this.columnOrds = columnOrds;
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
         * DatabaseName.
         */
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        /**
         * IndexColumns.
         */
        public Builder indexColumns(java.util.List < FieldSchemaModel > indexColumns) {
            this.indexColumns = indexColumns;
            return this;
        }

        /**
         * IndexName.
         */
        public Builder indexName(String indexName) {
            this.indexName = indexName;
            return this;
        }

        /**
         * IndexType.
         */
        public Builder indexType(String indexType) {
            this.indexType = indexType;
            return this;
        }

        /**
         * Options.
         */
        public Builder options(java.util.Map < String, String > options) {
            this.options = options;
            return this;
        }

        /**
         * PhysicalTableName.
         */
        public Builder physicalTableName(String physicalTableName) {
            this.physicalTableName = physicalTableName;
            return this;
        }

        /**
         * UpdateTime.
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
