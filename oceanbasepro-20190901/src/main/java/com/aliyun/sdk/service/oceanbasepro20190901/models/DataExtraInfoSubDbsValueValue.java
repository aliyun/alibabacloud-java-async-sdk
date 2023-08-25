// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DataExtraInfoSubDbsValueValue} extends {@link TeaModel}
 *
 * <p>DataExtraInfoSubDbsValueValue</p>
 */
public class DataExtraInfoSubDbsValueValue extends TeaModel {
    @NameInMap("TableId")
    private String tableId;

    @NameInMap("Database")
    private String database;

    @NameInMap("TableName")
    private String tableName;

    @NameInMap("MappingTableName")
    private String mappingTableName;

    @NameInMap("Instance")
    private String instance;

    @NameInMap("Columns")
    private java.util.List < Columns> columns;

    private DataExtraInfoSubDbsValueValue(Builder builder) {
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

    public static DataExtraInfoSubDbsValueValue create() {
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
    public java.util.List < Columns> getColumns() {
        return this.columns;
    }

    public static final class Builder {
        private String tableId; 
        private String database; 
        private String tableName; 
        private String mappingTableName; 
        private String instance; 
        private java.util.List < Columns> columns; 

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
        public Builder columns(java.util.List < Columns> columns) {
            this.columns = columns;
            return this;
        }

        public DataExtraInfoSubDbsValueValue build() {
            return new DataExtraInfoSubDbsValueValue(this);
        } 

    } 

    public static class Columns extends TeaModel {
        @NameInMap("ColumnName")
        private String columnName;

        @NameInMap("Position")
        private Integer position;

        @NameInMap("ColumnType")
        private String columnType;

        @NameInMap("RecordFieldType")
        private String recordFieldType;

        @NameInMap("RawColumnType")
        private String rawColumnType;

        @NameInMap("ColumnKey")
        private String columnKey;

        @NameInMap("Nullable")
        private Boolean nullable;

        @NameInMap("DefaultValue")
        private String defaultValue;

        @NameInMap("DataLength")
        private Long dataLength;

        @NameInMap("DataPrecision")
        private Integer dataPrecision;

        @NameInMap("DataScale")
        private Integer dataScale;

        @NameInMap("Encoding")
        private String encoding;

        @NameInMap("ColumnComment")
        private String columnComment;

        @NameInMap("IsGenerateField")
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
}
