// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link DataExtraInfoSubCondsValue} extends {@link TeaModel}
 *
 * <p>DataExtraInfoSubCondsValue</p>
 */
public class DataExtraInfoSubCondsValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("TenantName")
    private String tenantName;

    @com.aliyun.core.annotation.NameInMap("Database")
    private String database;

    @com.aliyun.core.annotation.NameInMap("DestDatabase")
    private String destDatabase;

    @com.aliyun.core.annotation.NameInMap("TableName")
    private String tableName;

    @com.aliyun.core.annotation.NameInMap("DestName")
    private String destName;

    @com.aliyun.core.annotation.NameInMap("WhereClause")
    private String whereClause;

    @com.aliyun.core.annotation.NameInMap("FilterColumns")
    private java.util.List<String> filterColumns;

    @com.aliyun.core.annotation.NameInMap("ShardColumns")
    private java.util.List<String> shardColumns;

    @com.aliyun.core.annotation.NameInMap("LogicTableId")
    private String logicTableId;

    @com.aliyun.core.annotation.NameInMap("SourceEndpointId")
    private String sourceEndpointId;

    @com.aliyun.core.annotation.NameInMap("SourceClientId")
    private String sourceClientId;

    private DataExtraInfoSubCondsValue(Builder builder) {
        this.tenantName = builder.tenantName;
        this.database = builder.database;
        this.destDatabase = builder.destDatabase;
        this.tableName = builder.tableName;
        this.destName = builder.destName;
        this.whereClause = builder.whereClause;
        this.filterColumns = builder.filterColumns;
        this.shardColumns = builder.shardColumns;
        this.logicTableId = builder.logicTableId;
        this.sourceEndpointId = builder.sourceEndpointId;
        this.sourceClientId = builder.sourceClientId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataExtraInfoSubCondsValue create() {
        return builder().build();
    }

    /**
     * @return tenantName
     */
    public String getTenantName() {
        return this.tenantName;
    }

    /**
     * @return database
     */
    public String getDatabase() {
        return this.database;
    }

    /**
     * @return destDatabase
     */
    public String getDestDatabase() {
        return this.destDatabase;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return destName
     */
    public String getDestName() {
        return this.destName;
    }

    /**
     * @return whereClause
     */
    public String getWhereClause() {
        return this.whereClause;
    }

    /**
     * @return filterColumns
     */
    public java.util.List<String> getFilterColumns() {
        return this.filterColumns;
    }

    /**
     * @return shardColumns
     */
    public java.util.List<String> getShardColumns() {
        return this.shardColumns;
    }

    /**
     * @return logicTableId
     */
    public String getLogicTableId() {
        return this.logicTableId;
    }

    /**
     * @return sourceEndpointId
     */
    public String getSourceEndpointId() {
        return this.sourceEndpointId;
    }

    /**
     * @return sourceClientId
     */
    public String getSourceClientId() {
        return this.sourceClientId;
    }

    public static final class Builder {
        private String tenantName; 
        private String database; 
        private String destDatabase; 
        private String tableName; 
        private String destName; 
        private String whereClause; 
        private java.util.List<String> filterColumns; 
        private java.util.List<String> shardColumns; 
        private String logicTableId; 
        private String sourceEndpointId; 
        private String sourceClientId; 

        /**
         * TenantName.
         */
        public Builder tenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }

        /**
         * Database.
         */
        public Builder database(String database) {
            this.database = database;
            return this;
        }

        /**
         * DestDatabase.
         */
        public Builder destDatabase(String destDatabase) {
            this.destDatabase = destDatabase;
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
         * DestName.
         */
        public Builder destName(String destName) {
            this.destName = destName;
            return this;
        }

        /**
         * WhereClause.
         */
        public Builder whereClause(String whereClause) {
            this.whereClause = whereClause;
            return this;
        }

        /**
         * FilterColumns.
         */
        public Builder filterColumns(java.util.List<String> filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }

        /**
         * ShardColumns.
         */
        public Builder shardColumns(java.util.List<String> shardColumns) {
            this.shardColumns = shardColumns;
            return this;
        }

        /**
         * LogicTableId.
         */
        public Builder logicTableId(String logicTableId) {
            this.logicTableId = logicTableId;
            return this;
        }

        /**
         * SourceEndpointId.
         */
        public Builder sourceEndpointId(String sourceEndpointId) {
            this.sourceEndpointId = sourceEndpointId;
            return this;
        }

        /**
         * SourceClientId.
         */
        public Builder sourceClientId(String sourceClientId) {
            this.sourceClientId = sourceClientId;
            return this;
        }

        public DataExtraInfoSubCondsValue build() {
            return new DataExtraInfoSubCondsValue(this);
        } 

    } 

}
