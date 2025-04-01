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
 * {@link DataExtraInfoSubDbsValue} extends {@link TeaModel}
 *
 * <p>DataExtraInfoSubDbsValue</p>
 */
public class DataExtraInfoSubDbsValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterName")
    private String clusterName;

    @com.aliyun.core.annotation.NameInMap("TenantName")
    private String tenantName;

    @com.aliyun.core.annotation.NameInMap("DatabaseId")
    private String databaseId;

    @com.aliyun.core.annotation.NameInMap("DatabaseName")
    private String databaseName;

    @com.aliyun.core.annotation.NameInMap("MappingDatabaseName")
    private String mappingDatabaseName;

    @com.aliyun.core.annotation.NameInMap("SourceClientId")
    private String sourceClientId;

    @com.aliyun.core.annotation.NameInMap("Tables")
    private java.util.List<Tables> tables;

    private DataExtraInfoSubDbsValue(Builder builder) {
        this.clusterName = builder.clusterName;
        this.tenantName = builder.tenantName;
        this.databaseId = builder.databaseId;
        this.databaseName = builder.databaseName;
        this.mappingDatabaseName = builder.mappingDatabaseName;
        this.sourceClientId = builder.sourceClientId;
        this.tables = builder.tables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataExtraInfoSubDbsValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return tenantName
     */
    public String getTenantName() {
        return this.tenantName;
    }

    /**
     * @return databaseId
     */
    public String getDatabaseId() {
        return this.databaseId;
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return mappingDatabaseName
     */
    public String getMappingDatabaseName() {
        return this.mappingDatabaseName;
    }

    /**
     * @return sourceClientId
     */
    public String getSourceClientId() {
        return this.sourceClientId;
    }

    /**
     * @return tables
     */
    public java.util.List<Tables> getTables() {
        return this.tables;
    }

    public static final class Builder {
        private String clusterName; 
        private String tenantName; 
        private String databaseId; 
        private String databaseName; 
        private String mappingDatabaseName; 
        private String sourceClientId; 
        private java.util.List<Tables> tables; 

        private Builder() {
        } 

        private Builder(DataExtraInfoSubDbsValue model) {
            this.clusterName = model.clusterName;
            this.tenantName = model.tenantName;
            this.databaseId = model.databaseId;
            this.databaseName = model.databaseName;
            this.mappingDatabaseName = model.mappingDatabaseName;
            this.sourceClientId = model.sourceClientId;
            this.tables = model.tables;
        } 

        /**
         * ClusterName.
         */
        public Builder clusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        /**
         * TenantName.
         */
        public Builder tenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }

        /**
         * DatabaseId.
         */
        public Builder databaseId(String databaseId) {
            this.databaseId = databaseId;
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
         * MappingDatabaseName.
         */
        public Builder mappingDatabaseName(String mappingDatabaseName) {
            this.mappingDatabaseName = mappingDatabaseName;
            return this;
        }

        /**
         * SourceClientId.
         */
        public Builder sourceClientId(String sourceClientId) {
            this.sourceClientId = sourceClientId;
            return this;
        }

        /**
         * Tables.
         */
        public Builder tables(java.util.List<Tables> tables) {
            this.tables = tables;
            return this;
        }

        public DataExtraInfoSubDbsValue build() {
            return new DataExtraInfoSubDbsValue(this);
        } 

    } 

    /**
     * 
     * {@link DataExtraInfoSubDbsValue} extends {@link TeaModel}
     *
     * <p>DataExtraInfoSubDbsValue</p>
     */
    public static class Columns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnName")
        private String columnName;

        @com.aliyun.core.annotation.NameInMap("Position")
        private Integer position;

        @com.aliyun.core.annotation.NameInMap("ColumnType")
        private String columnType;

        @com.aliyun.core.annotation.NameInMap("RecordFieldType")
        private String recordFieldType;

        @com.aliyun.core.annotation.NameInMap("RawColumnType")
        private String rawColumnType;

        @com.aliyun.core.annotation.NameInMap("ColumnKey")
        private String columnKey;

        @com.aliyun.core.annotation.NameInMap("Nullable")
        private Boolean nullable;

        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("DataLength")
        private Long dataLength;

        @com.aliyun.core.annotation.NameInMap("DataPrecision")
        private Integer dataPrecision;

        @com.aliyun.core.annotation.NameInMap("DataScale")
        private Integer dataScale;

        @com.aliyun.core.annotation.NameInMap("Encoding")
        private String encoding;

        @com.aliyun.core.annotation.NameInMap("ColumnComment")
        private String columnComment;

        @com.aliyun.core.annotation.NameInMap("IsGenerateField")
        private Boolean isGenerateField;

        private Columns(Builder builder) {
            this.columnName = builder.columnName;
            this.position = builder.position;
            this.columnType = builder.columnType;
            this.recordFieldType = builder.recordFieldType;
            this.rawColumnType = builder.rawColumnType;
            this.columnKey = builder.columnKey;
            this.nullable = builder.nullable;
            this.defaultValue = builder.defaultValue;
            this.dataLength = builder.dataLength;
            this.dataPrecision = builder.dataPrecision;
            this.dataScale = builder.dataScale;
            this.encoding = builder.encoding;
            this.columnComment = builder.columnComment;
            this.isGenerateField = builder.isGenerateField;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Columns create() {
            return builder().build();
        }

        /**
         * @return columnName
         */
        public String getColumnName() {
            return this.columnName;
        }

        /**
         * @return position
         */
        public Integer getPosition() {
            return this.position;
        }

        /**
         * @return columnType
         */
        public String getColumnType() {
            return this.columnType;
        }

        /**
         * @return recordFieldType
         */
        public String getRecordFieldType() {
            return this.recordFieldType;
        }

        /**
         * @return rawColumnType
         */
        public String getRawColumnType() {
            return this.rawColumnType;
        }

        /**
         * @return columnKey
         */
        public String getColumnKey() {
            return this.columnKey;
        }

        /**
         * @return nullable
         */
        public Boolean getNullable() {
            return this.nullable;
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return dataLength
         */
        public Long getDataLength() {
            return this.dataLength;
        }

        /**
         * @return dataPrecision
         */
        public Integer getDataPrecision() {
            return this.dataPrecision;
        }

        /**
         * @return dataScale
         */
        public Integer getDataScale() {
            return this.dataScale;
        }

        /**
         * @return encoding
         */
        public String getEncoding() {
            return this.encoding;
        }

        /**
         * @return columnComment
         */
        public String getColumnComment() {
            return this.columnComment;
        }

        /**
         * @return isGenerateField
         */
        public Boolean getIsGenerateField() {
            return this.isGenerateField;
        }

        public static final class Builder {
            private String columnName; 
            private Integer position; 
            private String columnType; 
            private String recordFieldType; 
            private String rawColumnType; 
            private String columnKey; 
            private Boolean nullable; 
            private String defaultValue; 
            private Long dataLength; 
            private Integer dataPrecision; 
            private Integer dataScale; 
            private String encoding; 
            private String columnComment; 
            private Boolean isGenerateField; 

            private Builder() {
            } 

            private Builder(Columns model) {
                this.columnName = model.columnName;
                this.position = model.position;
                this.columnType = model.columnType;
                this.recordFieldType = model.recordFieldType;
                this.rawColumnType = model.rawColumnType;
                this.columnKey = model.columnKey;
                this.nullable = model.nullable;
                this.defaultValue = model.defaultValue;
                this.dataLength = model.dataLength;
                this.dataPrecision = model.dataPrecision;
                this.dataScale = model.dataScale;
                this.encoding = model.encoding;
                this.columnComment = model.columnComment;
                this.isGenerateField = model.isGenerateField;
            } 

            /**
             * ColumnName.
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * Position.
             */
            public Builder position(Integer position) {
                this.position = position;
                return this;
            }

            /**
             * ColumnType.
             */
            public Builder columnType(String columnType) {
                this.columnType = columnType;
                return this;
            }

            /**
             * RecordFieldType.
             */
            public Builder recordFieldType(String recordFieldType) {
                this.recordFieldType = recordFieldType;
                return this;
            }

            /**
             * RawColumnType.
             */
            public Builder rawColumnType(String rawColumnType) {
                this.rawColumnType = rawColumnType;
                return this;
            }

            /**
             * ColumnKey.
             */
            public Builder columnKey(String columnKey) {
                this.columnKey = columnKey;
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
             * DefaultValue.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * DataLength.
             */
            public Builder dataLength(Long dataLength) {
                this.dataLength = dataLength;
                return this;
            }

            /**
             * DataPrecision.
             */
            public Builder dataPrecision(Integer dataPrecision) {
                this.dataPrecision = dataPrecision;
                return this;
            }

            /**
             * DataScale.
             */
            public Builder dataScale(Integer dataScale) {
                this.dataScale = dataScale;
                return this;
            }

            /**
             * Encoding.
             */
            public Builder encoding(String encoding) {
                this.encoding = encoding;
                return this;
            }

            /**
             * ColumnComment.
             */
            public Builder columnComment(String columnComment) {
                this.columnComment = columnComment;
                return this;
            }

            /**
             * IsGenerateField.
             */
            public Builder isGenerateField(Boolean isGenerateField) {
                this.isGenerateField = isGenerateField;
                return this;
            }

            public Columns build() {
                return new Columns(this);
            } 

        } 

    }
    /**
     * 
     * {@link DataExtraInfoSubDbsValue} extends {@link TeaModel}
     *
     * <p>DataExtraInfoSubDbsValue</p>
     */
    public static class Tables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TableId")
        private String tableId;

        @com.aliyun.core.annotation.NameInMap("Database")
        private String database;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("MappingTableName")
        private String mappingTableName;

        @com.aliyun.core.annotation.NameInMap("Instance")
        private String instance;

        @com.aliyun.core.annotation.NameInMap("Columns")
        private java.util.List<Columns> columns;

        private Tables(Builder builder) {
            this.tableId = builder.tableId;
            this.database = builder.database;
            this.tableName = builder.tableName;
            this.mappingTableName = builder.mappingTableName;
            this.instance = builder.instance;
            this.columns = builder.columns;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tables create() {
            return builder().build();
        }

        /**
         * @return tableId
         */
        public String getTableId() {
            return this.tableId;
        }

        /**
         * @return database
         */
        public String getDatabase() {
            return this.database;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return mappingTableName
         */
        public String getMappingTableName() {
            return this.mappingTableName;
        }

        /**
         * @return instance
         */
        public String getInstance() {
            return this.instance;
        }

        /**
         * @return columns
         */
        public java.util.List<Columns> getColumns() {
            return this.columns;
        }

        public static final class Builder {
            private String tableId; 
            private String database; 
            private String tableName; 
            private String mappingTableName; 
            private String instance; 
            private java.util.List<Columns> columns; 

            private Builder() {
            } 

            private Builder(Tables model) {
                this.tableId = model.tableId;
                this.database = model.database;
                this.tableName = model.tableName;
                this.mappingTableName = model.mappingTableName;
                this.instance = model.instance;
                this.columns = model.columns;
            } 

            /**
             * TableId.
             */
            public Builder tableId(String tableId) {
                this.tableId = tableId;
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
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * MappingTableName.
             */
            public Builder mappingTableName(String mappingTableName) {
                this.mappingTableName = mappingTableName;
                return this;
            }

            /**
             * Instance.
             */
            public Builder instance(String instance) {
                this.instance = instance;
                return this;
            }

            /**
             * Columns.
             */
            public Builder columns(java.util.List<Columns> columns) {
                this.columns = columns;
                return this;
            }

            public Tables build() {
                return new Tables(this);
            } 

        } 

    }
}
