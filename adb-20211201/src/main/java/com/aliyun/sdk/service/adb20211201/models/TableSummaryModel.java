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
 * {@link TableSummaryModel} extends {@link TeaModel}
 *
 * <p>TableSummaryModel</p>
 */
public class TableSummaryModel extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("CreatedBySource")
    private String createdBySource;

    @com.aliyun.core.annotation.NameInMap("CreatedByUser")
    private String createdByUser;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("MvDetailModel")
    private OpenStructMvDetailModel mvDetailModel;

    @com.aliyun.core.annotation.NameInMap("Owner")
    private String owner;

    @com.aliyun.core.annotation.NameInMap("SQL")
    private String SQL;

    @com.aliyun.core.annotation.NameInMap("SchemaName")
    private String schemaName;

    @com.aliyun.core.annotation.NameInMap("TableName")
    private String tableName;

    @com.aliyun.core.annotation.NameInMap("TableSize")
    private Long tableSize;

    @com.aliyun.core.annotation.NameInMap("TableType")
    private String tableType;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    private TableSummaryModel(Builder builder) {
        this.createTime = builder.createTime;
        this.createdBySource = builder.createdBySource;
        this.createdByUser = builder.createdByUser;
        this.description = builder.description;
        this.mvDetailModel = builder.mvDetailModel;
        this.owner = builder.owner;
        this.SQL = builder.SQL;
        this.schemaName = builder.schemaName;
        this.tableName = builder.tableName;
        this.tableSize = builder.tableSize;
        this.tableType = builder.tableType;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TableSummaryModel create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return mvDetailModel
     */
    public OpenStructMvDetailModel getMvDetailModel() {
        return this.mvDetailModel;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return SQL
     */
    public String getSQL() {
        return this.SQL;
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
     * @return tableSize
     */
    public Long getTableSize() {
        return this.tableSize;
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
        private String createTime; 
        private String createdBySource; 
        private String createdByUser; 
        private String description; 
        private OpenStructMvDetailModel mvDetailModel; 
        private String owner; 
        private String SQL; 
        private String schemaName; 
        private String tableName; 
        private Long tableSize; 
        private String tableType; 
        private String updateTime; 

        private Builder() {
        } 

        private Builder(TableSummaryModel model) {
            this.createTime = model.createTime;
            this.createdBySource = model.createdBySource;
            this.createdByUser = model.createdByUser;
            this.description = model.description;
            this.mvDetailModel = model.mvDetailModel;
            this.owner = model.owner;
            this.SQL = model.SQL;
            this.schemaName = model.schemaName;
            this.tableName = model.tableName;
            this.tableSize = model.tableSize;
            this.tableType = model.tableType;
            this.updateTime = model.updateTime;
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
         * <p>descrtiption</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * MvDetailModel.
         */
        public Builder mvDetailModel(OpenStructMvDetailModel mvDetailModel) {
            this.mvDetailModel = mvDetailModel;
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
         * <p>SQL for creating the table or view.</p>
         * 
         * <strong>example:</strong>
         * <p>create table(a varchar)</p>
         */
        public Builder SQL(String SQL) {
            this.SQL = SQL;
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
         * <p>Logical table name or logical view name.</p>
         * 
         * <strong>example:</strong>
         * <p>tableName</p>
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        /**
         * <p>Table size in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder tableSize(Long tableSize) {
            this.tableSize = tableSize;
            return this;
        }

        /**
         * <p>Table or view type.</p>
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

        public TableSummaryModel build() {
            return new TableSummaryModel(this);
        } 

    } 

}
