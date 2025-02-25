// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProjectModifyRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProjectModifyRecordsResponseBody</p>
 */
public class ListProjectModifyRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Advice")
    private String advice;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Cost")
    private String cost;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrorDetail")
    private ErrorDetail errorDetail;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListProjectModifyRecordsResponseBody(Builder builder) {
        this.advice = builder.advice;
        this.code = builder.code;
        this.cost = builder.cost;
        this.data = builder.data;
        this.errorDetail = builder.errorDetail;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectModifyRecordsResponseBody create() {
        return builder().build();
    }

    /**
     * @return advice
     */
    public String getAdvice() {
        return this.advice;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return cost
     */
    public String getCost() {
        return this.cost;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return errorDetail
     */
    public ErrorDetail getErrorDetail() {
        return this.errorDetail;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String advice; 
        private String code; 
        private String cost; 
        private java.util.List < Data> data; 
        private ErrorDetail errorDetail; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * Advice.
         */
        public Builder advice(String advice) {
            this.advice = advice;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Cost.
         */
        public Builder cost(String cost) {
            this.cost = cost;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorDetail.
         */
        public Builder errorDetail(ErrorDetail errorDetail) {
            this.errorDetail = errorDetail;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListProjectModifyRecordsResponseBody build() {
            return new ListProjectModifyRecordsResponseBody(this);
        } 

    } 

    public static class AdbTableSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DistributedKeys")
        private java.util.List < String > distributedKeys;

        @com.aliyun.core.annotation.NameInMap("PartitionLifeCycle")
        private Integer partitionLifeCycle;

        @com.aliyun.core.annotation.NameInMap("PartitionStatement")
        private String partitionStatement;

        @com.aliyun.core.annotation.NameInMap("PrimaryKeys")
        private java.util.List < String > primaryKeys;

        private AdbTableSchema(Builder builder) {
            this.distributedKeys = builder.distributedKeys;
            this.partitionLifeCycle = builder.partitionLifeCycle;
            this.partitionStatement = builder.partitionStatement;
            this.primaryKeys = builder.primaryKeys;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdbTableSchema create() {
            return builder().build();
        }

        /**
         * @return distributedKeys
         */
        public java.util.List < String > getDistributedKeys() {
            return this.distributedKeys;
        }

        /**
         * @return partitionLifeCycle
         */
        public Integer getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        /**
         * @return partitionStatement
         */
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        /**
         * @return primaryKeys
         */
        public java.util.List < String > getPrimaryKeys() {
            return this.primaryKeys;
        }

        public static final class Builder {
            private java.util.List < String > distributedKeys; 
            private Integer partitionLifeCycle; 
            private String partitionStatement; 
            private java.util.List < String > primaryKeys; 

            /**
             * DistributedKeys.
             */
            public Builder distributedKeys(java.util.List < String > distributedKeys) {
                this.distributedKeys = distributedKeys;
                return this;
            }

            /**
             * PartitionLifeCycle.
             */
            public Builder partitionLifeCycle(Integer partitionLifeCycle) {
                this.partitionLifeCycle = partitionLifeCycle;
                return this;
            }

            /**
             * PartitionStatement.
             */
            public Builder partitionStatement(String partitionStatement) {
                this.partitionStatement = partitionStatement;
                return this;
            }

            /**
             * PrimaryKeys.
             */
            public Builder primaryKeys(java.util.List < String > primaryKeys) {
                this.primaryKeys = primaryKeys;
                return this;
            }

            public AdbTableSchema build() {
                return new AdbTableSchema(this);
            } 

        } 

    }
    public static class Columns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnComment")
        private String columnComment;

        @com.aliyun.core.annotation.NameInMap("ColumnKey")
        private String columnKey;

        @com.aliyun.core.annotation.NameInMap("ColumnName")
        private String columnName;

        @com.aliyun.core.annotation.NameInMap("ColumnType")
        private String columnType;

        @com.aliyun.core.annotation.NameInMap("DataLength")
        private Long dataLength;

        @com.aliyun.core.annotation.NameInMap("DataPrecision")
        private Integer dataPrecision;

        @com.aliyun.core.annotation.NameInMap("DataScale")
        private Integer dataScale;

        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("Encoding")
        private String encoding;

        @com.aliyun.core.annotation.NameInMap("IsGenerateField")
        private Boolean isGenerateField;

        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Nullable")
        private Boolean nullable;

        @com.aliyun.core.annotation.NameInMap("Position")
        private Integer position;

        @com.aliyun.core.annotation.NameInMap("RawColumnType")
        private String rawColumnType;

        @com.aliyun.core.annotation.NameInMap("RecordFieldType")
        private String recordFieldType;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Columns(Builder builder) {
            this.columnComment = builder.columnComment;
            this.columnKey = builder.columnKey;
            this.columnName = builder.columnName;
            this.columnType = builder.columnType;
            this.dataLength = builder.dataLength;
            this.dataPrecision = builder.dataPrecision;
            this.dataScale = builder.dataScale;
            this.defaultValue = builder.defaultValue;
            this.encoding = builder.encoding;
            this.isGenerateField = builder.isGenerateField;
            this.mappedName = builder.mappedName;
            this.nullable = builder.nullable;
            this.position = builder.position;
            this.rawColumnType = builder.rawColumnType;
            this.recordFieldType = builder.recordFieldType;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Columns create() {
            return builder().build();
        }

        /**
         * @return columnComment
         */
        public String getColumnComment() {
            return this.columnComment;
        }

        /**
         * @return columnKey
         */
        public String getColumnKey() {
            return this.columnKey;
        }

        /**
         * @return columnName
         */
        public String getColumnName() {
            return this.columnName;
        }

        /**
         * @return columnType
         */
        public String getColumnType() {
            return this.columnType;
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
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return encoding
         */
        public String getEncoding() {
            return this.encoding;
        }

        /**
         * @return isGenerateField
         */
        public Boolean getIsGenerateField() {
            return this.isGenerateField;
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return nullable
         */
        public Boolean getNullable() {
            return this.nullable;
        }

        /**
         * @return position
         */
        public Integer getPosition() {
            return this.position;
        }

        /**
         * @return rawColumnType
         */
        public String getRawColumnType() {
            return this.rawColumnType;
        }

        /**
         * @return recordFieldType
         */
        public String getRecordFieldType() {
            return this.recordFieldType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String columnComment; 
            private String columnKey; 
            private String columnName; 
            private String columnType; 
            private Long dataLength; 
            private Integer dataPrecision; 
            private Integer dataScale; 
            private String defaultValue; 
            private String encoding; 
            private Boolean isGenerateField; 
            private String mappedName; 
            private Boolean nullable; 
            private Integer position; 
            private String rawColumnType; 
            private String recordFieldType; 
            private String type; 

            /**
             * ColumnComment.
             */
            public Builder columnComment(String columnComment) {
                this.columnComment = columnComment;
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
             * ColumnName.
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
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
             * DefaultValue.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
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
             * IsGenerateField.
             */
            public Builder isGenerateField(Boolean isGenerateField) {
                this.isGenerateField = isGenerateField;
                return this;
            }

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
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
             * Position.
             */
            public Builder position(Integer position) {
                this.position = position;
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
             * RecordFieldType.
             */
            public Builder recordFieldType(String recordFieldType) {
                this.recordFieldType = recordFieldType;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Columns build() {
                return new Columns(this);
            } 

        } 

    }
    public static class SpecificTables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdbTableSchema")
        private AdbTableSchema adbTableSchema;

        @com.aliyun.core.annotation.NameInMap("Columns")
        private java.util.List < Columns> columns;

        @com.aliyun.core.annotation.NameInMap("FilterColumns")
        private java.util.List < String > filterColumns;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ShardColumns")
        private java.util.List < String > shardColumns;

        @com.aliyun.core.annotation.NameInMap("WhereClause")
        private String whereClause;

        private SpecificTables(Builder builder) {
            this.adbTableSchema = builder.adbTableSchema;
            this.columns = builder.columns;
            this.filterColumns = builder.filterColumns;
            this.id = builder.id;
            this.mappedName = builder.mappedName;
            this.name = builder.name;
            this.shardColumns = builder.shardColumns;
            this.whereClause = builder.whereClause;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpecificTables create() {
            return builder().build();
        }

        /**
         * @return adbTableSchema
         */
        public AdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        /**
         * @return columns
         */
        public java.util.List < Columns> getColumns() {
            return this.columns;
        }

        /**
         * @return filterColumns
         */
        public java.util.List < String > getFilterColumns() {
            return this.filterColumns;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return shardColumns
         */
        public java.util.List < String > getShardColumns() {
            return this.shardColumns;
        }

        /**
         * @return whereClause
         */
        public String getWhereClause() {
            return this.whereClause;
        }

        public static final class Builder {
            private AdbTableSchema adbTableSchema; 
            private java.util.List < Columns> columns; 
            private java.util.List < String > filterColumns; 
            private String id; 
            private String mappedName; 
            private String name; 
            private java.util.List < String > shardColumns; 
            private String whereClause; 

            /**
             * AdbTableSchema.
             */
            public Builder adbTableSchema(AdbTableSchema adbTableSchema) {
                this.adbTableSchema = adbTableSchema;
                return this;
            }

            /**
             * Columns.
             */
            public Builder columns(java.util.List < Columns> columns) {
                this.columns = columns;
                return this;
            }

            /**
             * FilterColumns.
             */
            public Builder filterColumns(java.util.List < String > filterColumns) {
                this.filterColumns = filterColumns;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ShardColumns.
             */
            public Builder shardColumns(java.util.List < String > shardColumns) {
                this.shardColumns = shardColumns;
                return this;
            }

            /**
             * WhereClause.
             */
            public Builder whereClause(String whereClause) {
                this.whereClause = whereClause;
                return this;
            }

            public SpecificTables build() {
                return new SpecificTables(this);
            } 

        } 

    }
    public static class SpecificViewsAdbTableSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DistributedKeys")
        private java.util.List < String > distributedKeys;

        @com.aliyun.core.annotation.NameInMap("PartitionLifeCycle")
        private Integer partitionLifeCycle;

        @com.aliyun.core.annotation.NameInMap("PartitionStatement")
        private String partitionStatement;

        @com.aliyun.core.annotation.NameInMap("PrimaryKeys")
        private java.util.List < String > primaryKeys;

        private SpecificViewsAdbTableSchema(Builder builder) {
            this.distributedKeys = builder.distributedKeys;
            this.partitionLifeCycle = builder.partitionLifeCycle;
            this.partitionStatement = builder.partitionStatement;
            this.primaryKeys = builder.primaryKeys;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpecificViewsAdbTableSchema create() {
            return builder().build();
        }

        /**
         * @return distributedKeys
         */
        public java.util.List < String > getDistributedKeys() {
            return this.distributedKeys;
        }

        /**
         * @return partitionLifeCycle
         */
        public Integer getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        /**
         * @return partitionStatement
         */
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        /**
         * @return primaryKeys
         */
        public java.util.List < String > getPrimaryKeys() {
            return this.primaryKeys;
        }

        public static final class Builder {
            private java.util.List < String > distributedKeys; 
            private Integer partitionLifeCycle; 
            private String partitionStatement; 
            private java.util.List < String > primaryKeys; 

            /**
             * DistributedKeys.
             */
            public Builder distributedKeys(java.util.List < String > distributedKeys) {
                this.distributedKeys = distributedKeys;
                return this;
            }

            /**
             * PartitionLifeCycle.
             */
            public Builder partitionLifeCycle(Integer partitionLifeCycle) {
                this.partitionLifeCycle = partitionLifeCycle;
                return this;
            }

            /**
             * PartitionStatement.
             */
            public Builder partitionStatement(String partitionStatement) {
                this.partitionStatement = partitionStatement;
                return this;
            }

            /**
             * PrimaryKeys.
             */
            public Builder primaryKeys(java.util.List < String > primaryKeys) {
                this.primaryKeys = primaryKeys;
                return this;
            }

            public SpecificViewsAdbTableSchema build() {
                return new SpecificViewsAdbTableSchema(this);
            } 

        } 

    }
    public static class SpecificViewsColumns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnComment")
        private String columnComment;

        @com.aliyun.core.annotation.NameInMap("ColumnKey")
        private String columnKey;

        @com.aliyun.core.annotation.NameInMap("ColumnName")
        private String columnName;

        @com.aliyun.core.annotation.NameInMap("ColumnType")
        private String columnType;

        @com.aliyun.core.annotation.NameInMap("DataLength")
        private Long dataLength;

        @com.aliyun.core.annotation.NameInMap("DataPrecision")
        private Integer dataPrecision;

        @com.aliyun.core.annotation.NameInMap("DataScale")
        private Integer dataScale;

        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("Encoding")
        private String encoding;

        @com.aliyun.core.annotation.NameInMap("IsGenerateField")
        private Boolean isGenerateField;

        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Nullable")
        private Boolean nullable;

        @com.aliyun.core.annotation.NameInMap("Position")
        private Integer position;

        @com.aliyun.core.annotation.NameInMap("RawColumnType")
        private String rawColumnType;

        @com.aliyun.core.annotation.NameInMap("RecordFieldType")
        private String recordFieldType;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private SpecificViewsColumns(Builder builder) {
            this.columnComment = builder.columnComment;
            this.columnKey = builder.columnKey;
            this.columnName = builder.columnName;
            this.columnType = builder.columnType;
            this.dataLength = builder.dataLength;
            this.dataPrecision = builder.dataPrecision;
            this.dataScale = builder.dataScale;
            this.defaultValue = builder.defaultValue;
            this.encoding = builder.encoding;
            this.isGenerateField = builder.isGenerateField;
            this.mappedName = builder.mappedName;
            this.nullable = builder.nullable;
            this.position = builder.position;
            this.rawColumnType = builder.rawColumnType;
            this.recordFieldType = builder.recordFieldType;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpecificViewsColumns create() {
            return builder().build();
        }

        /**
         * @return columnComment
         */
        public String getColumnComment() {
            return this.columnComment;
        }

        /**
         * @return columnKey
         */
        public String getColumnKey() {
            return this.columnKey;
        }

        /**
         * @return columnName
         */
        public String getColumnName() {
            return this.columnName;
        }

        /**
         * @return columnType
         */
        public String getColumnType() {
            return this.columnType;
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
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return encoding
         */
        public String getEncoding() {
            return this.encoding;
        }

        /**
         * @return isGenerateField
         */
        public Boolean getIsGenerateField() {
            return this.isGenerateField;
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return nullable
         */
        public Boolean getNullable() {
            return this.nullable;
        }

        /**
         * @return position
         */
        public Integer getPosition() {
            return this.position;
        }

        /**
         * @return rawColumnType
         */
        public String getRawColumnType() {
            return this.rawColumnType;
        }

        /**
         * @return recordFieldType
         */
        public String getRecordFieldType() {
            return this.recordFieldType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String columnComment; 
            private String columnKey; 
            private String columnName; 
            private String columnType; 
            private Long dataLength; 
            private Integer dataPrecision; 
            private Integer dataScale; 
            private String defaultValue; 
            private String encoding; 
            private Boolean isGenerateField; 
            private String mappedName; 
            private Boolean nullable; 
            private Integer position; 
            private String rawColumnType; 
            private String recordFieldType; 
            private String type; 

            /**
             * ColumnComment.
             */
            public Builder columnComment(String columnComment) {
                this.columnComment = columnComment;
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
             * ColumnName.
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
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
             * DefaultValue.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
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
             * IsGenerateField.
             */
            public Builder isGenerateField(Boolean isGenerateField) {
                this.isGenerateField = isGenerateField;
                return this;
            }

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
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
             * Position.
             */
            public Builder position(Integer position) {
                this.position = position;
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
             * RecordFieldType.
             */
            public Builder recordFieldType(String recordFieldType) {
                this.recordFieldType = recordFieldType;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public SpecificViewsColumns build() {
                return new SpecificViewsColumns(this);
            } 

        } 

    }
    public static class SpecificViews extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdbTableSchema")
        private SpecificViewsAdbTableSchema adbTableSchema;

        @com.aliyun.core.annotation.NameInMap("Columns")
        private java.util.List < SpecificViewsColumns> columns;

        @com.aliyun.core.annotation.NameInMap("FilterColumns")
        private java.util.List < String > filterColumns;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ShardColumns")
        private java.util.List < String > shardColumns;

        @com.aliyun.core.annotation.NameInMap("WhereClause")
        private String whereClause;

        private SpecificViews(Builder builder) {
            this.adbTableSchema = builder.adbTableSchema;
            this.columns = builder.columns;
            this.filterColumns = builder.filterColumns;
            this.id = builder.id;
            this.mappedName = builder.mappedName;
            this.name = builder.name;
            this.shardColumns = builder.shardColumns;
            this.whereClause = builder.whereClause;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpecificViews create() {
            return builder().build();
        }

        /**
         * @return adbTableSchema
         */
        public SpecificViewsAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        /**
         * @return columns
         */
        public java.util.List < SpecificViewsColumns> getColumns() {
            return this.columns;
        }

        /**
         * @return filterColumns
         */
        public java.util.List < String > getFilterColumns() {
            return this.filterColumns;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return shardColumns
         */
        public java.util.List < String > getShardColumns() {
            return this.shardColumns;
        }

        /**
         * @return whereClause
         */
        public String getWhereClause() {
            return this.whereClause;
        }

        public static final class Builder {
            private SpecificViewsAdbTableSchema adbTableSchema; 
            private java.util.List < SpecificViewsColumns> columns; 
            private java.util.List < String > filterColumns; 
            private String id; 
            private String mappedName; 
            private String name; 
            private java.util.List < String > shardColumns; 
            private String whereClause; 

            /**
             * AdbTableSchema.
             */
            public Builder adbTableSchema(SpecificViewsAdbTableSchema adbTableSchema) {
                this.adbTableSchema = adbTableSchema;
                return this;
            }

            /**
             * Columns.
             */
            public Builder columns(java.util.List < SpecificViewsColumns> columns) {
                this.columns = columns;
                return this;
            }

            /**
             * FilterColumns.
             */
            public Builder filterColumns(java.util.List < String > filterColumns) {
                this.filterColumns = filterColumns;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ShardColumns.
             */
            public Builder shardColumns(java.util.List < String > shardColumns) {
                this.shardColumns = shardColumns;
                return this;
            }

            /**
             * WhereClause.
             */
            public Builder whereClause(String whereClause) {
                this.whereClause = whereClause;
                return this;
            }

            public SpecificViews build() {
                return new SpecificViews(this);
            } 

        } 

    }
    public static class TablesAdbTableSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DistributedKeys")
        private java.util.List < String > distributedKeys;

        @com.aliyun.core.annotation.NameInMap("PartitionLifeCycle")
        private Integer partitionLifeCycle;

        @com.aliyun.core.annotation.NameInMap("PartitionStatement")
        private String partitionStatement;

        @com.aliyun.core.annotation.NameInMap("PrimaryKeys")
        private java.util.List < String > primaryKeys;

        private TablesAdbTableSchema(Builder builder) {
            this.distributedKeys = builder.distributedKeys;
            this.partitionLifeCycle = builder.partitionLifeCycle;
            this.partitionStatement = builder.partitionStatement;
            this.primaryKeys = builder.primaryKeys;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TablesAdbTableSchema create() {
            return builder().build();
        }

        /**
         * @return distributedKeys
         */
        public java.util.List < String > getDistributedKeys() {
            return this.distributedKeys;
        }

        /**
         * @return partitionLifeCycle
         */
        public Integer getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        /**
         * @return partitionStatement
         */
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        /**
         * @return primaryKeys
         */
        public java.util.List < String > getPrimaryKeys() {
            return this.primaryKeys;
        }

        public static final class Builder {
            private java.util.List < String > distributedKeys; 
            private Integer partitionLifeCycle; 
            private String partitionStatement; 
            private java.util.List < String > primaryKeys; 

            /**
             * DistributedKeys.
             */
            public Builder distributedKeys(java.util.List < String > distributedKeys) {
                this.distributedKeys = distributedKeys;
                return this;
            }

            /**
             * PartitionLifeCycle.
             */
            public Builder partitionLifeCycle(Integer partitionLifeCycle) {
                this.partitionLifeCycle = partitionLifeCycle;
                return this;
            }

            /**
             * PartitionStatement.
             */
            public Builder partitionStatement(String partitionStatement) {
                this.partitionStatement = partitionStatement;
                return this;
            }

            /**
             * PrimaryKeys.
             */
            public Builder primaryKeys(java.util.List < String > primaryKeys) {
                this.primaryKeys = primaryKeys;
                return this;
            }

            public TablesAdbTableSchema build() {
                return new TablesAdbTableSchema(this);
            } 

        } 

    }
    public static class TablesColumns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnComment")
        private String columnComment;

        @com.aliyun.core.annotation.NameInMap("ColumnKey")
        private String columnKey;

        @com.aliyun.core.annotation.NameInMap("ColumnName")
        private String columnName;

        @com.aliyun.core.annotation.NameInMap("ColumnType")
        private String columnType;

        @com.aliyun.core.annotation.NameInMap("DataLength")
        private Long dataLength;

        @com.aliyun.core.annotation.NameInMap("DataPrecision")
        private Integer dataPrecision;

        @com.aliyun.core.annotation.NameInMap("DataScale")
        private Integer dataScale;

        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("Encoding")
        private String encoding;

        @com.aliyun.core.annotation.NameInMap("IsGenerateField")
        private Boolean isGenerateField;

        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Nullable")
        private Boolean nullable;

        @com.aliyun.core.annotation.NameInMap("Position")
        private Integer position;

        @com.aliyun.core.annotation.NameInMap("RawColumnType")
        private String rawColumnType;

        @com.aliyun.core.annotation.NameInMap("RecordFieldType")
        private String recordFieldType;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private TablesColumns(Builder builder) {
            this.columnComment = builder.columnComment;
            this.columnKey = builder.columnKey;
            this.columnName = builder.columnName;
            this.columnType = builder.columnType;
            this.dataLength = builder.dataLength;
            this.dataPrecision = builder.dataPrecision;
            this.dataScale = builder.dataScale;
            this.defaultValue = builder.defaultValue;
            this.encoding = builder.encoding;
            this.isGenerateField = builder.isGenerateField;
            this.mappedName = builder.mappedName;
            this.nullable = builder.nullable;
            this.position = builder.position;
            this.rawColumnType = builder.rawColumnType;
            this.recordFieldType = builder.recordFieldType;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TablesColumns create() {
            return builder().build();
        }

        /**
         * @return columnComment
         */
        public String getColumnComment() {
            return this.columnComment;
        }

        /**
         * @return columnKey
         */
        public String getColumnKey() {
            return this.columnKey;
        }

        /**
         * @return columnName
         */
        public String getColumnName() {
            return this.columnName;
        }

        /**
         * @return columnType
         */
        public String getColumnType() {
            return this.columnType;
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
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return encoding
         */
        public String getEncoding() {
            return this.encoding;
        }

        /**
         * @return isGenerateField
         */
        public Boolean getIsGenerateField() {
            return this.isGenerateField;
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return nullable
         */
        public Boolean getNullable() {
            return this.nullable;
        }

        /**
         * @return position
         */
        public Integer getPosition() {
            return this.position;
        }

        /**
         * @return rawColumnType
         */
        public String getRawColumnType() {
            return this.rawColumnType;
        }

        /**
         * @return recordFieldType
         */
        public String getRecordFieldType() {
            return this.recordFieldType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String columnComment; 
            private String columnKey; 
            private String columnName; 
            private String columnType; 
            private Long dataLength; 
            private Integer dataPrecision; 
            private Integer dataScale; 
            private String defaultValue; 
            private String encoding; 
            private Boolean isGenerateField; 
            private String mappedName; 
            private Boolean nullable; 
            private Integer position; 
            private String rawColumnType; 
            private String recordFieldType; 
            private String type; 

            /**
             * ColumnComment.
             */
            public Builder columnComment(String columnComment) {
                this.columnComment = columnComment;
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
             * ColumnName.
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
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
             * DefaultValue.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
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
             * IsGenerateField.
             */
            public Builder isGenerateField(Boolean isGenerateField) {
                this.isGenerateField = isGenerateField;
                return this;
            }

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
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
             * Position.
             */
            public Builder position(Integer position) {
                this.position = position;
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
             * RecordFieldType.
             */
            public Builder recordFieldType(String recordFieldType) {
                this.recordFieldType = recordFieldType;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public TablesColumns build() {
                return new TablesColumns(this);
            } 

        } 

    }
    public static class Tables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdbTableSchema")
        private TablesAdbTableSchema adbTableSchema;

        @com.aliyun.core.annotation.NameInMap("Columns")
        private java.util.List < TablesColumns> columns;

        @com.aliyun.core.annotation.NameInMap("FilterColumns")
        private java.util.List < String > filterColumns;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ShardColumns")
        private java.util.List < String > shardColumns;

        @com.aliyun.core.annotation.NameInMap("WhereClause")
        private String whereClause;

        private Tables(Builder builder) {
            this.adbTableSchema = builder.adbTableSchema;
            this.columns = builder.columns;
            this.filterColumns = builder.filterColumns;
            this.id = builder.id;
            this.mappedName = builder.mappedName;
            this.name = builder.name;
            this.shardColumns = builder.shardColumns;
            this.whereClause = builder.whereClause;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tables create() {
            return builder().build();
        }

        /**
         * @return adbTableSchema
         */
        public TablesAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        /**
         * @return columns
         */
        public java.util.List < TablesColumns> getColumns() {
            return this.columns;
        }

        /**
         * @return filterColumns
         */
        public java.util.List < String > getFilterColumns() {
            return this.filterColumns;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return shardColumns
         */
        public java.util.List < String > getShardColumns() {
            return this.shardColumns;
        }

        /**
         * @return whereClause
         */
        public String getWhereClause() {
            return this.whereClause;
        }

        public static final class Builder {
            private TablesAdbTableSchema adbTableSchema; 
            private java.util.List < TablesColumns> columns; 
            private java.util.List < String > filterColumns; 
            private String id; 
            private String mappedName; 
            private String name; 
            private java.util.List < String > shardColumns; 
            private String whereClause; 

            /**
             * AdbTableSchema.
             */
            public Builder adbTableSchema(TablesAdbTableSchema adbTableSchema) {
                this.adbTableSchema = adbTableSchema;
                return this;
            }

            /**
             * Columns.
             */
            public Builder columns(java.util.List < TablesColumns> columns) {
                this.columns = columns;
                return this;
            }

            /**
             * FilterColumns.
             */
            public Builder filterColumns(java.util.List < String > filterColumns) {
                this.filterColumns = filterColumns;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ShardColumns.
             */
            public Builder shardColumns(java.util.List < String > shardColumns) {
                this.shardColumns = shardColumns;
                return this;
            }

            /**
             * WhereClause.
             */
            public Builder whereClause(String whereClause) {
                this.whereClause = whereClause;
                return this;
            }

            public Tables build() {
                return new Tables(this);
            } 

        } 

    }
    public static class ViewsAdbTableSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DistributedKeys")
        private java.util.List < String > distributedKeys;

        @com.aliyun.core.annotation.NameInMap("PartitionLifeCycle")
        private Integer partitionLifeCycle;

        @com.aliyun.core.annotation.NameInMap("PartitionStatement")
        private String partitionStatement;

        @com.aliyun.core.annotation.NameInMap("PrimaryKeys")
        private java.util.List < String > primaryKeys;

        private ViewsAdbTableSchema(Builder builder) {
            this.distributedKeys = builder.distributedKeys;
            this.partitionLifeCycle = builder.partitionLifeCycle;
            this.partitionStatement = builder.partitionStatement;
            this.primaryKeys = builder.primaryKeys;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ViewsAdbTableSchema create() {
            return builder().build();
        }

        /**
         * @return distributedKeys
         */
        public java.util.List < String > getDistributedKeys() {
            return this.distributedKeys;
        }

        /**
         * @return partitionLifeCycle
         */
        public Integer getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        /**
         * @return partitionStatement
         */
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        /**
         * @return primaryKeys
         */
        public java.util.List < String > getPrimaryKeys() {
            return this.primaryKeys;
        }

        public static final class Builder {
            private java.util.List < String > distributedKeys; 
            private Integer partitionLifeCycle; 
            private String partitionStatement; 
            private java.util.List < String > primaryKeys; 

            /**
             * DistributedKeys.
             */
            public Builder distributedKeys(java.util.List < String > distributedKeys) {
                this.distributedKeys = distributedKeys;
                return this;
            }

            /**
             * PartitionLifeCycle.
             */
            public Builder partitionLifeCycle(Integer partitionLifeCycle) {
                this.partitionLifeCycle = partitionLifeCycle;
                return this;
            }

            /**
             * PartitionStatement.
             */
            public Builder partitionStatement(String partitionStatement) {
                this.partitionStatement = partitionStatement;
                return this;
            }

            /**
             * PrimaryKeys.
             */
            public Builder primaryKeys(java.util.List < String > primaryKeys) {
                this.primaryKeys = primaryKeys;
                return this;
            }

            public ViewsAdbTableSchema build() {
                return new ViewsAdbTableSchema(this);
            } 

        } 

    }
    public static class ViewsColumns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnComment")
        private String columnComment;

        @com.aliyun.core.annotation.NameInMap("ColumnKey")
        private String columnKey;

        @com.aliyun.core.annotation.NameInMap("ColumnName")
        private String columnName;

        @com.aliyun.core.annotation.NameInMap("ColumnType")
        private String columnType;

        @com.aliyun.core.annotation.NameInMap("DataLength")
        private Long dataLength;

        @com.aliyun.core.annotation.NameInMap("DataPrecision")
        private Integer dataPrecision;

        @com.aliyun.core.annotation.NameInMap("DataScale")
        private Integer dataScale;

        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("Encoding")
        private String encoding;

        @com.aliyun.core.annotation.NameInMap("IsGenerateField")
        private Boolean isGenerateField;

        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Nullable")
        private Boolean nullable;

        @com.aliyun.core.annotation.NameInMap("Position")
        private Integer position;

        @com.aliyun.core.annotation.NameInMap("RawColumnType")
        private String rawColumnType;

        @com.aliyun.core.annotation.NameInMap("RecordFieldType")
        private String recordFieldType;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ViewsColumns(Builder builder) {
            this.columnComment = builder.columnComment;
            this.columnKey = builder.columnKey;
            this.columnName = builder.columnName;
            this.columnType = builder.columnType;
            this.dataLength = builder.dataLength;
            this.dataPrecision = builder.dataPrecision;
            this.dataScale = builder.dataScale;
            this.defaultValue = builder.defaultValue;
            this.encoding = builder.encoding;
            this.isGenerateField = builder.isGenerateField;
            this.mappedName = builder.mappedName;
            this.nullable = builder.nullable;
            this.position = builder.position;
            this.rawColumnType = builder.rawColumnType;
            this.recordFieldType = builder.recordFieldType;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ViewsColumns create() {
            return builder().build();
        }

        /**
         * @return columnComment
         */
        public String getColumnComment() {
            return this.columnComment;
        }

        /**
         * @return columnKey
         */
        public String getColumnKey() {
            return this.columnKey;
        }

        /**
         * @return columnName
         */
        public String getColumnName() {
            return this.columnName;
        }

        /**
         * @return columnType
         */
        public String getColumnType() {
            return this.columnType;
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
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return encoding
         */
        public String getEncoding() {
            return this.encoding;
        }

        /**
         * @return isGenerateField
         */
        public Boolean getIsGenerateField() {
            return this.isGenerateField;
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return nullable
         */
        public Boolean getNullable() {
            return this.nullable;
        }

        /**
         * @return position
         */
        public Integer getPosition() {
            return this.position;
        }

        /**
         * @return rawColumnType
         */
        public String getRawColumnType() {
            return this.rawColumnType;
        }

        /**
         * @return recordFieldType
         */
        public String getRecordFieldType() {
            return this.recordFieldType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String columnComment; 
            private String columnKey; 
            private String columnName; 
            private String columnType; 
            private Long dataLength; 
            private Integer dataPrecision; 
            private Integer dataScale; 
            private String defaultValue; 
            private String encoding; 
            private Boolean isGenerateField; 
            private String mappedName; 
            private Boolean nullable; 
            private Integer position; 
            private String rawColumnType; 
            private String recordFieldType; 
            private String type; 

            /**
             * ColumnComment.
             */
            public Builder columnComment(String columnComment) {
                this.columnComment = columnComment;
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
             * ColumnName.
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
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
             * DefaultValue.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
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
             * IsGenerateField.
             */
            public Builder isGenerateField(Boolean isGenerateField) {
                this.isGenerateField = isGenerateField;
                return this;
            }

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
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
             * Position.
             */
            public Builder position(Integer position) {
                this.position = position;
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
             * RecordFieldType.
             */
            public Builder recordFieldType(String recordFieldType) {
                this.recordFieldType = recordFieldType;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ViewsColumns build() {
                return new ViewsColumns(this);
            } 

        } 

    }
    public static class Views extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdbTableSchema")
        private ViewsAdbTableSchema adbTableSchema;

        @com.aliyun.core.annotation.NameInMap("Columns")
        private java.util.List < ViewsColumns> columns;

        @com.aliyun.core.annotation.NameInMap("FilterColumns")
        private java.util.List < String > filterColumns;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ShardColumns")
        private java.util.List < String > shardColumns;

        @com.aliyun.core.annotation.NameInMap("WhereClause")
        private String whereClause;

        private Views(Builder builder) {
            this.adbTableSchema = builder.adbTableSchema;
            this.columns = builder.columns;
            this.filterColumns = builder.filterColumns;
            this.id = builder.id;
            this.mappedName = builder.mappedName;
            this.name = builder.name;
            this.shardColumns = builder.shardColumns;
            this.whereClause = builder.whereClause;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Views create() {
            return builder().build();
        }

        /**
         * @return adbTableSchema
         */
        public ViewsAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        /**
         * @return columns
         */
        public java.util.List < ViewsColumns> getColumns() {
            return this.columns;
        }

        /**
         * @return filterColumns
         */
        public java.util.List < String > getFilterColumns() {
            return this.filterColumns;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return shardColumns
         */
        public java.util.List < String > getShardColumns() {
            return this.shardColumns;
        }

        /**
         * @return whereClause
         */
        public String getWhereClause() {
            return this.whereClause;
        }

        public static final class Builder {
            private ViewsAdbTableSchema adbTableSchema; 
            private java.util.List < ViewsColumns> columns; 
            private java.util.List < String > filterColumns; 
            private String id; 
            private String mappedName; 
            private String name; 
            private java.util.List < String > shardColumns; 
            private String whereClause; 

            /**
             * AdbTableSchema.
             */
            public Builder adbTableSchema(ViewsAdbTableSchema adbTableSchema) {
                this.adbTableSchema = adbTableSchema;
                return this;
            }

            /**
             * Columns.
             */
            public Builder columns(java.util.List < ViewsColumns> columns) {
                this.columns = columns;
                return this;
            }

            /**
             * FilterColumns.
             */
            public Builder filterColumns(java.util.List < String > filterColumns) {
                this.filterColumns = filterColumns;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ShardColumns.
             */
            public Builder shardColumns(java.util.List < String > shardColumns) {
                this.shardColumns = shardColumns;
                return this;
            }

            /**
             * WhereClause.
             */
            public Builder whereClause(String whereClause) {
                this.whereClause = whereClause;
                return this;
            }

            public Views build() {
                return new Views(this);
            } 

        } 

    }
    public static class Databases extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SpecificTables")
        private java.util.List < SpecificTables> specificTables;

        @com.aliyun.core.annotation.NameInMap("SpecificViews")
        private java.util.List < SpecificViews> specificViews;

        @com.aliyun.core.annotation.NameInMap("Tables")
        private java.util.List < Tables> tables;

        @com.aliyun.core.annotation.NameInMap("Views")
        private java.util.List < Views> views;

        private Databases(Builder builder) {
            this.id = builder.id;
            this.mappedName = builder.mappedName;
            this.name = builder.name;
            this.specificTables = builder.specificTables;
            this.specificViews = builder.specificViews;
            this.tables = builder.tables;
            this.views = builder.views;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Databases create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return specificTables
         */
        public java.util.List < SpecificTables> getSpecificTables() {
            return this.specificTables;
        }

        /**
         * @return specificViews
         */
        public java.util.List < SpecificViews> getSpecificViews() {
            return this.specificViews;
        }

        /**
         * @return tables
         */
        public java.util.List < Tables> getTables() {
            return this.tables;
        }

        /**
         * @return views
         */
        public java.util.List < Views> getViews() {
            return this.views;
        }

        public static final class Builder {
            private String id; 
            private String mappedName; 
            private String name; 
            private java.util.List < SpecificTables> specificTables; 
            private java.util.List < SpecificViews> specificViews; 
            private java.util.List < Tables> tables; 
            private java.util.List < Views> views; 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * SpecificTables.
             */
            public Builder specificTables(java.util.List < SpecificTables> specificTables) {
                this.specificTables = specificTables;
                return this;
            }

            /**
             * SpecificViews.
             */
            public Builder specificViews(java.util.List < SpecificViews> specificViews) {
                this.specificViews = specificViews;
                return this;
            }

            /**
             * Tables.
             */
            public Builder tables(java.util.List < Tables> tables) {
                this.tables = tables;
                return this;
            }

            /**
             * Views.
             */
            public Builder views(java.util.List < Views> views) {
                this.views = views;
                return this;
            }

            public Databases build() {
                return new Databases(this);
            } 

        } 

    }
    public static class DataErrorDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("ExtraContext")
        private java.util.Map < String, ? > extraContext;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("MessageMcmsContext")
        private java.util.Map < String, String > messageMcmsContext;

        @com.aliyun.core.annotation.NameInMap("MessageMcmsKey")
        private String messageMcmsKey;

        @com.aliyun.core.annotation.NameInMap("Proposal")
        private String proposal;

        @com.aliyun.core.annotation.NameInMap("ProposalMcmsContext")
        private java.util.Map < String, String > proposalMcmsContext;

        @com.aliyun.core.annotation.NameInMap("ProposalMcmsKey")
        private String proposalMcmsKey;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("ReasonMcmsContext")
        private java.util.Map < String, String > reasonMcmsContext;

        @com.aliyun.core.annotation.NameInMap("ReasonMcmsKey")
        private String reasonMcmsKey;

        @com.aliyun.core.annotation.NameInMap("UpstreamErrorDetail")
        private Object upstreamErrorDetail;

        private DataErrorDetail(Builder builder) {
            this.code = builder.code;
            this.extraContext = builder.extraContext;
            this.level = builder.level;
            this.message = builder.message;
            this.messageMcmsContext = builder.messageMcmsContext;
            this.messageMcmsKey = builder.messageMcmsKey;
            this.proposal = builder.proposal;
            this.proposalMcmsContext = builder.proposalMcmsContext;
            this.proposalMcmsKey = builder.proposalMcmsKey;
            this.reason = builder.reason;
            this.reasonMcmsContext = builder.reasonMcmsContext;
            this.reasonMcmsKey = builder.reasonMcmsKey;
            this.upstreamErrorDetail = builder.upstreamErrorDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataErrorDetail create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return extraContext
         */
        public java.util.Map < String, ? > getExtraContext() {
            return this.extraContext;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return messageMcmsContext
         */
        public java.util.Map < String, String > getMessageMcmsContext() {
            return this.messageMcmsContext;
        }

        /**
         * @return messageMcmsKey
         */
        public String getMessageMcmsKey() {
            return this.messageMcmsKey;
        }

        /**
         * @return proposal
         */
        public String getProposal() {
            return this.proposal;
        }

        /**
         * @return proposalMcmsContext
         */
        public java.util.Map < String, String > getProposalMcmsContext() {
            return this.proposalMcmsContext;
        }

        /**
         * @return proposalMcmsKey
         */
        public String getProposalMcmsKey() {
            return this.proposalMcmsKey;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return reasonMcmsContext
         */
        public java.util.Map < String, String > getReasonMcmsContext() {
            return this.reasonMcmsContext;
        }

        /**
         * @return reasonMcmsKey
         */
        public String getReasonMcmsKey() {
            return this.reasonMcmsKey;
        }

        /**
         * @return upstreamErrorDetail
         */
        public Object getUpstreamErrorDetail() {
            return this.upstreamErrorDetail;
        }

        public static final class Builder {
            private String code; 
            private java.util.Map < String, ? > extraContext; 
            private String level; 
            private String message; 
            private java.util.Map < String, String > messageMcmsContext; 
            private String messageMcmsKey; 
            private String proposal; 
            private java.util.Map < String, String > proposalMcmsContext; 
            private String proposalMcmsKey; 
            private String reason; 
            private java.util.Map < String, String > reasonMcmsContext; 
            private String reasonMcmsKey; 
            private Object upstreamErrorDetail; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * ExtraContext.
             */
            public Builder extraContext(java.util.Map < String, ? > extraContext) {
                this.extraContext = extraContext;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * MessageMcmsContext.
             */
            public Builder messageMcmsContext(java.util.Map < String, String > messageMcmsContext) {
                this.messageMcmsContext = messageMcmsContext;
                return this;
            }

            /**
             * MessageMcmsKey.
             */
            public Builder messageMcmsKey(String messageMcmsKey) {
                this.messageMcmsKey = messageMcmsKey;
                return this;
            }

            /**
             * Proposal.
             */
            public Builder proposal(String proposal) {
                this.proposal = proposal;
                return this;
            }

            /**
             * ProposalMcmsContext.
             */
            public Builder proposalMcmsContext(java.util.Map < String, String > proposalMcmsContext) {
                this.proposalMcmsContext = proposalMcmsContext;
                return this;
            }

            /**
             * ProposalMcmsKey.
             */
            public Builder proposalMcmsKey(String proposalMcmsKey) {
                this.proposalMcmsKey = proposalMcmsKey;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * ReasonMcmsContext.
             */
            public Builder reasonMcmsContext(java.util.Map < String, String > reasonMcmsContext) {
                this.reasonMcmsContext = reasonMcmsContext;
                return this;
            }

            /**
             * ReasonMcmsKey.
             */
            public Builder reasonMcmsKey(String reasonMcmsKey) {
                this.reasonMcmsKey = reasonMcmsKey;
                return this;
            }

            /**
             * UpstreamErrorDetail.
             */
            public Builder upstreamErrorDetail(Object upstreamErrorDetail) {
                this.upstreamErrorDetail = upstreamErrorDetail;
                return this;
            }

            public DataErrorDetail build() {
                return new DataErrorDetail(this);
            } 

        } 

    }
    public static class MigrationObjectsInfoTables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Schema")
        private String schema;

        private MigrationObjectsInfoTables(Builder builder) {
            this.name = builder.name;
            this.schema = builder.schema;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MigrationObjectsInfoTables create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return schema
         */
        public String getSchema() {
            return this.schema;
        }

        public static final class Builder {
            private String name; 
            private String schema; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Schema.
             */
            public Builder schema(String schema) {
                this.schema = schema;
                return this;
            }

            public MigrationObjectsInfoTables build() {
                return new MigrationObjectsInfoTables(this);
            } 

        } 

    }
    public static class TablesBlack extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Schema")
        private String schema;

        private TablesBlack(Builder builder) {
            this.name = builder.name;
            this.schema = builder.schema;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TablesBlack create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return schema
         */
        public String getSchema() {
            return this.schema;
        }

        public static final class Builder {
            private String name; 
            private String schema; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Schema.
             */
            public Builder schema(String schema) {
                this.schema = schema;
                return this;
            }

            public TablesBlack build() {
                return new TablesBlack(this);
            } 

        } 

    }
    public static class MigrationObjectsInfoViews extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Schema")
        private String schema;

        private MigrationObjectsInfoViews(Builder builder) {
            this.name = builder.name;
            this.schema = builder.schema;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MigrationObjectsInfoViews create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return schema
         */
        public String getSchema() {
            return this.schema;
        }

        public static final class Builder {
            private String name; 
            private String schema; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Schema.
             */
            public Builder schema(String schema) {
                this.schema = schema;
                return this;
            }

            public MigrationObjectsInfoViews build() {
                return new MigrationObjectsInfoViews(this);
            } 

        } 

    }
    public static class ViewsBlack extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Schema")
        private String schema;

        private ViewsBlack(Builder builder) {
            this.name = builder.name;
            this.schema = builder.schema;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ViewsBlack create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return schema
         */
        public String getSchema() {
            return this.schema;
        }

        public static final class Builder {
            private String name; 
            private String schema; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Schema.
             */
            public Builder schema(String schema) {
                this.schema = schema;
                return this;
            }

            public ViewsBlack build() {
                return new ViewsBlack(this);
            } 

        } 

    }
    public static class MigrationObjectsInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tables")
        private java.util.List < MigrationObjectsInfoTables> tables;

        @com.aliyun.core.annotation.NameInMap("TablesBlack")
        private java.util.List < TablesBlack> tablesBlack;

        @com.aliyun.core.annotation.NameInMap("Views")
        private java.util.List < MigrationObjectsInfoViews> views;

        @com.aliyun.core.annotation.NameInMap("ViewsBlack")
        private java.util.List < ViewsBlack> viewsBlack;

        @com.aliyun.core.annotation.NameInMap("WildcardMode")
        private Boolean wildcardMode;

        private MigrationObjectsInfo(Builder builder) {
            this.tables = builder.tables;
            this.tablesBlack = builder.tablesBlack;
            this.views = builder.views;
            this.viewsBlack = builder.viewsBlack;
            this.wildcardMode = builder.wildcardMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MigrationObjectsInfo create() {
            return builder().build();
        }

        /**
         * @return tables
         */
        public java.util.List < MigrationObjectsInfoTables> getTables() {
            return this.tables;
        }

        /**
         * @return tablesBlack
         */
        public java.util.List < TablesBlack> getTablesBlack() {
            return this.tablesBlack;
        }

        /**
         * @return views
         */
        public java.util.List < MigrationObjectsInfoViews> getViews() {
            return this.views;
        }

        /**
         * @return viewsBlack
         */
        public java.util.List < ViewsBlack> getViewsBlack() {
            return this.viewsBlack;
        }

        /**
         * @return wildcardMode
         */
        public Boolean getWildcardMode() {
            return this.wildcardMode;
        }

        public static final class Builder {
            private java.util.List < MigrationObjectsInfoTables> tables; 
            private java.util.List < TablesBlack> tablesBlack; 
            private java.util.List < MigrationObjectsInfoViews> views; 
            private java.util.List < ViewsBlack> viewsBlack; 
            private Boolean wildcardMode; 

            /**
             * Tables.
             */
            public Builder tables(java.util.List < MigrationObjectsInfoTables> tables) {
                this.tables = tables;
                return this;
            }

            /**
             * TablesBlack.
             */
            public Builder tablesBlack(java.util.List < TablesBlack> tablesBlack) {
                this.tablesBlack = tablesBlack;
                return this;
            }

            /**
             * Views.
             */
            public Builder views(java.util.List < MigrationObjectsInfoViews> views) {
                this.views = views;
                return this;
            }

            /**
             * ViewsBlack.
             */
            public Builder viewsBlack(java.util.List < ViewsBlack> viewsBlack) {
                this.viewsBlack = viewsBlack;
                return this;
            }

            /**
             * WildcardMode.
             */
            public Builder wildcardMode(Boolean wildcardMode) {
                this.wildcardMode = wildcardMode;
                return this;
            }

            public MigrationObjectsInfo build() {
                return new MigrationObjectsInfo(this);
            } 

        } 

    }
    public static class ColumnMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestName")
        private String destName;

        @com.aliyun.core.annotation.NameInMap("SourceName")
        private String sourceName;

        @com.aliyun.core.annotation.NameInMap("SourceSchema")
        private String sourceSchema;

        @com.aliyun.core.annotation.NameInMap("SourceTable")
        private String sourceTable;

        private ColumnMappings(Builder builder) {
            this.destName = builder.destName;
            this.sourceName = builder.sourceName;
            this.sourceSchema = builder.sourceSchema;
            this.sourceTable = builder.sourceTable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ColumnMappings create() {
            return builder().build();
        }

        /**
         * @return destName
         */
        public String getDestName() {
            return this.destName;
        }

        /**
         * @return sourceName
         */
        public String getSourceName() {
            return this.sourceName;
        }

        /**
         * @return sourceSchema
         */
        public String getSourceSchema() {
            return this.sourceSchema;
        }

        /**
         * @return sourceTable
         */
        public String getSourceTable() {
            return this.sourceTable;
        }

        public static final class Builder {
            private String destName; 
            private String sourceName; 
            private String sourceSchema; 
            private String sourceTable; 

            /**
             * DestName.
             */
            public Builder destName(String destName) {
                this.destName = destName;
                return this;
            }

            /**
             * SourceName.
             */
            public Builder sourceName(String sourceName) {
                this.sourceName = sourceName;
                return this;
            }

            /**
             * SourceSchema.
             */
            public Builder sourceSchema(String sourceSchema) {
                this.sourceSchema = sourceSchema;
                return this;
            }

            /**
             * SourceTable.
             */
            public Builder sourceTable(String sourceTable) {
                this.sourceTable = sourceTable;
                return this;
            }

            public ColumnMappings build() {
                return new ColumnMappings(this);
            } 

        } 

    }
    public static class SchemaMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestName")
        private String destName;

        @com.aliyun.core.annotation.NameInMap("SourceName")
        private String sourceName;

        private SchemaMappings(Builder builder) {
            this.destName = builder.destName;
            this.sourceName = builder.sourceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchemaMappings create() {
            return builder().build();
        }

        /**
         * @return destName
         */
        public String getDestName() {
            return this.destName;
        }

        /**
         * @return sourceName
         */
        public String getSourceName() {
            return this.sourceName;
        }

        public static final class Builder {
            private String destName; 
            private String sourceName; 

            /**
             * DestName.
             */
            public Builder destName(String destName) {
                this.destName = destName;
                return this;
            }

            /**
             * SourceName.
             */
            public Builder sourceName(String sourceName) {
                this.sourceName = sourceName;
                return this;
            }

            public SchemaMappings build() {
                return new SchemaMappings(this);
            } 

        } 

    }
    public static class TableMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestName")
        private String destName;

        @com.aliyun.core.annotation.NameInMap("SourceName")
        private String sourceName;

        @com.aliyun.core.annotation.NameInMap("SourceSchema")
        private String sourceSchema;

        private TableMappings(Builder builder) {
            this.destName = builder.destName;
            this.sourceName = builder.sourceName;
            this.sourceSchema = builder.sourceSchema;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableMappings create() {
            return builder().build();
        }

        /**
         * @return destName
         */
        public String getDestName() {
            return this.destName;
        }

        /**
         * @return sourceName
         */
        public String getSourceName() {
            return this.sourceName;
        }

        /**
         * @return sourceSchema
         */
        public String getSourceSchema() {
            return this.sourceSchema;
        }

        public static final class Builder {
            private String destName; 
            private String sourceName; 
            private String sourceSchema; 

            /**
             * DestName.
             */
            public Builder destName(String destName) {
                this.destName = destName;
                return this;
            }

            /**
             * SourceName.
             */
            public Builder sourceName(String sourceName) {
                this.sourceName = sourceName;
                return this;
            }

            /**
             * SourceSchema.
             */
            public Builder sourceSchema(String sourceSchema) {
                this.sourceSchema = sourceSchema;
                return this;
            }

            public TableMappings build() {
                return new TableMappings(this);
            } 

        } 

    }
    public static class ViewMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestName")
        private String destName;

        @com.aliyun.core.annotation.NameInMap("SourceName")
        private String sourceName;

        @com.aliyun.core.annotation.NameInMap("SourceSchema")
        private String sourceSchema;

        private ViewMappings(Builder builder) {
            this.destName = builder.destName;
            this.sourceName = builder.sourceName;
            this.sourceSchema = builder.sourceSchema;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ViewMappings create() {
            return builder().build();
        }

        /**
         * @return destName
         */
        public String getDestName() {
            return this.destName;
        }

        /**
         * @return sourceName
         */
        public String getSourceName() {
            return this.sourceName;
        }

        /**
         * @return sourceSchema
         */
        public String getSourceSchema() {
            return this.sourceSchema;
        }

        public static final class Builder {
            private String destName; 
            private String sourceName; 
            private String sourceSchema; 

            /**
             * DestName.
             */
            public Builder destName(String destName) {
                this.destName = destName;
                return this;
            }

            /**
             * SourceName.
             */
            public Builder sourceName(String sourceName) {
                this.sourceName = sourceName;
                return this;
            }

            /**
             * SourceSchema.
             */
            public Builder sourceSchema(String sourceSchema) {
                this.sourceSchema = sourceSchema;
                return this;
            }

            public ViewMappings build() {
                return new ViewMappings(this);
            } 

        } 

    }
    public static class OmsProjectMappingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnMappings")
        private java.util.List < ColumnMappings> columnMappings;

        @com.aliyun.core.annotation.NameInMap("SchemaMappings")
        private java.util.List < SchemaMappings> schemaMappings;

        @com.aliyun.core.annotation.NameInMap("TableMappings")
        private java.util.List < TableMappings> tableMappings;

        @com.aliyun.core.annotation.NameInMap("ViewMappings")
        private java.util.List < ViewMappings> viewMappings;

        private OmsProjectMappingInfo(Builder builder) {
            this.columnMappings = builder.columnMappings;
            this.schemaMappings = builder.schemaMappings;
            this.tableMappings = builder.tableMappings;
            this.viewMappings = builder.viewMappings;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OmsProjectMappingInfo create() {
            return builder().build();
        }

        /**
         * @return columnMappings
         */
        public java.util.List < ColumnMappings> getColumnMappings() {
            return this.columnMappings;
        }

        /**
         * @return schemaMappings
         */
        public java.util.List < SchemaMappings> getSchemaMappings() {
            return this.schemaMappings;
        }

        /**
         * @return tableMappings
         */
        public java.util.List < TableMappings> getTableMappings() {
            return this.tableMappings;
        }

        /**
         * @return viewMappings
         */
        public java.util.List < ViewMappings> getViewMappings() {
            return this.viewMappings;
        }

        public static final class Builder {
            private java.util.List < ColumnMappings> columnMappings; 
            private java.util.List < SchemaMappings> schemaMappings; 
            private java.util.List < TableMappings> tableMappings; 
            private java.util.List < ViewMappings> viewMappings; 

            /**
             * ColumnMappings.
             */
            public Builder columnMappings(java.util.List < ColumnMappings> columnMappings) {
                this.columnMappings = columnMappings;
                return this;
            }

            /**
             * SchemaMappings.
             */
            public Builder schemaMappings(java.util.List < SchemaMappings> schemaMappings) {
                this.schemaMappings = schemaMappings;
                return this;
            }

            /**
             * TableMappings.
             */
            public Builder tableMappings(java.util.List < TableMappings> tableMappings) {
                this.tableMappings = tableMappings;
                return this;
            }

            /**
             * ViewMappings.
             */
            public Builder viewMappings(java.util.List < ViewMappings> viewMappings) {
                this.viewMappings = viewMappings;
                return this;
            }

            public OmsProjectMappingInfo build() {
                return new OmsProjectMappingInfo(this);
            } 

        } 

    }
    public static class TableEtlList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Database")
        private String database;

        @com.aliyun.core.annotation.NameInMap("DestDatabase")
        private String destDatabase;

        @com.aliyun.core.annotation.NameInMap("DestName")
        private String destName;

        @com.aliyun.core.annotation.NameInMap("FilterColumns")
        private java.util.List < String > filterColumns;

        @com.aliyun.core.annotation.NameInMap("LogicTableId")
        private String logicTableId;

        @com.aliyun.core.annotation.NameInMap("ShardColumns")
        private java.util.List < String > shardColumns;

        @com.aliyun.core.annotation.NameInMap("SourceEndpointId")
        private String sourceEndpointId;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("TenantName")
        private String tenantName;

        @com.aliyun.core.annotation.NameInMap("WhereClause")
        private String whereClause;

        private TableEtlList(Builder builder) {
            this.database = builder.database;
            this.destDatabase = builder.destDatabase;
            this.destName = builder.destName;
            this.filterColumns = builder.filterColumns;
            this.logicTableId = builder.logicTableId;
            this.shardColumns = builder.shardColumns;
            this.sourceEndpointId = builder.sourceEndpointId;
            this.tableName = builder.tableName;
            this.tenantName = builder.tenantName;
            this.whereClause = builder.whereClause;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableEtlList create() {
            return builder().build();
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
         * @return destName
         */
        public String getDestName() {
            return this.destName;
        }

        /**
         * @return filterColumns
         */
        public java.util.List < String > getFilterColumns() {
            return this.filterColumns;
        }

        /**
         * @return logicTableId
         */
        public String getLogicTableId() {
            return this.logicTableId;
        }

        /**
         * @return shardColumns
         */
        public java.util.List < String > getShardColumns() {
            return this.shardColumns;
        }

        /**
         * @return sourceEndpointId
         */
        public String getSourceEndpointId() {
            return this.sourceEndpointId;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return tenantName
         */
        public String getTenantName() {
            return this.tenantName;
        }

        /**
         * @return whereClause
         */
        public String getWhereClause() {
            return this.whereClause;
        }

        public static final class Builder {
            private String database; 
            private String destDatabase; 
            private String destName; 
            private java.util.List < String > filterColumns; 
            private String logicTableId; 
            private java.util.List < String > shardColumns; 
            private String sourceEndpointId; 
            private String tableName; 
            private String tenantName; 
            private String whereClause; 

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
             * DestName.
             */
            public Builder destName(String destName) {
                this.destName = destName;
                return this;
            }

            /**
             * FilterColumns.
             */
            public Builder filterColumns(java.util.List < String > filterColumns) {
                this.filterColumns = filterColumns;
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
             * ShardColumns.
             */
            public Builder shardColumns(java.util.List < String > shardColumns) {
                this.shardColumns = shardColumns;
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
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
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
             * WhereClause.
             */
            public Builder whereClause(String whereClause) {
                this.whereClause = whereClause;
                return this;
            }

            public TableEtlList build() {
                return new TableEtlList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Databases")
        private java.util.List < Databases> databases;

        @com.aliyun.core.annotation.NameInMap("ErrorDetail")
        private DataErrorDetail errorDetail;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("MergeRequestId")
        private Long mergeRequestId;

        @com.aliyun.core.annotation.NameInMap("MigrationObjectsInfo")
        private MigrationObjectsInfo migrationObjectsInfo;

        @com.aliyun.core.annotation.NameInMap("OmsProjectMappingInfo")
        private OmsProjectMappingInfo omsProjectMappingInfo;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubProjectId")
        private String subProjectId;

        @com.aliyun.core.annotation.NameInMap("TableEtlList")
        private java.util.List < TableEtlList> tableEtlList;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UpdateRequestId")
        private Long updateRequestId;

        private Data(Builder builder) {
            this.databases = builder.databases;
            this.errorDetail = builder.errorDetail;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.mergeRequestId = builder.mergeRequestId;
            this.migrationObjectsInfo = builder.migrationObjectsInfo;
            this.omsProjectMappingInfo = builder.omsProjectMappingInfo;
            this.status = builder.status;
            this.subProjectId = builder.subProjectId;
            this.tableEtlList = builder.tableEtlList;
            this.type = builder.type;
            this.updateRequestId = builder.updateRequestId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return databases
         */
        public java.util.List < Databases> getDatabases() {
            return this.databases;
        }

        /**
         * @return errorDetail
         */
        public DataErrorDetail getErrorDetail() {
            return this.errorDetail;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return mergeRequestId
         */
        public Long getMergeRequestId() {
            return this.mergeRequestId;
        }

        /**
         * @return migrationObjectsInfo
         */
        public MigrationObjectsInfo getMigrationObjectsInfo() {
            return this.migrationObjectsInfo;
        }

        /**
         * @return omsProjectMappingInfo
         */
        public OmsProjectMappingInfo getOmsProjectMappingInfo() {
            return this.omsProjectMappingInfo;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subProjectId
         */
        public String getSubProjectId() {
            return this.subProjectId;
        }

        /**
         * @return tableEtlList
         */
        public java.util.List < TableEtlList> getTableEtlList() {
            return this.tableEtlList;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return updateRequestId
         */
        public Long getUpdateRequestId() {
            return this.updateRequestId;
        }

        public static final class Builder {
            private java.util.List < Databases> databases; 
            private DataErrorDetail errorDetail; 
            private String gmtModified; 
            private Long id; 
            private Long mergeRequestId; 
            private MigrationObjectsInfo migrationObjectsInfo; 
            private OmsProjectMappingInfo omsProjectMappingInfo; 
            private String status; 
            private String subProjectId; 
            private java.util.List < TableEtlList> tableEtlList; 
            private String type; 
            private Long updateRequestId; 

            /**
             * Databases.
             */
            public Builder databases(java.util.List < Databases> databases) {
                this.databases = databases;
                return this;
            }

            /**
             * ErrorDetail.
             */
            public Builder errorDetail(DataErrorDetail errorDetail) {
                this.errorDetail = errorDetail;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * MergeRequestId.
             */
            public Builder mergeRequestId(Long mergeRequestId) {
                this.mergeRequestId = mergeRequestId;
                return this;
            }

            /**
             * MigrationObjectsInfo.
             */
            public Builder migrationObjectsInfo(MigrationObjectsInfo migrationObjectsInfo) {
                this.migrationObjectsInfo = migrationObjectsInfo;
                return this;
            }

            /**
             * OmsProjectMappingInfo.
             */
            public Builder omsProjectMappingInfo(OmsProjectMappingInfo omsProjectMappingInfo) {
                this.omsProjectMappingInfo = omsProjectMappingInfo;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * SubProjectId.
             */
            public Builder subProjectId(String subProjectId) {
                this.subProjectId = subProjectId;
                return this;
            }

            /**
             * TableEtlList.
             */
            public Builder tableEtlList(java.util.List < TableEtlList> tableEtlList) {
                this.tableEtlList = tableEtlList;
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
             * UpdateRequestId.
             */
            public Builder updateRequestId(Long updateRequestId) {
                this.updateRequestId = updateRequestId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    public static class ErrorDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("ExtraContext")
        private java.util.Map < String, ? > extraContext;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("MessageMcmsContext")
        private java.util.Map < String, String > messageMcmsContext;

        @com.aliyun.core.annotation.NameInMap("MessageMcmsKey")
        private String messageMcmsKey;

        @com.aliyun.core.annotation.NameInMap("Proposal")
        private String proposal;

        @com.aliyun.core.annotation.NameInMap("ProposalMcmsContext")
        private java.util.Map < String, String > proposalMcmsContext;

        @com.aliyun.core.annotation.NameInMap("ProposalMcmsKey")
        private String proposalMcmsKey;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("ReasonMcmsContext")
        private java.util.Map < String, String > reasonMcmsContext;

        @com.aliyun.core.annotation.NameInMap("ReasonMcmsKey")
        private String reasonMcmsKey;

        @com.aliyun.core.annotation.NameInMap("UpstreamErrorDetail")
        private Object upstreamErrorDetail;

        private ErrorDetail(Builder builder) {
            this.code = builder.code;
            this.extraContext = builder.extraContext;
            this.level = builder.level;
            this.message = builder.message;
            this.messageMcmsContext = builder.messageMcmsContext;
            this.messageMcmsKey = builder.messageMcmsKey;
            this.proposal = builder.proposal;
            this.proposalMcmsContext = builder.proposalMcmsContext;
            this.proposalMcmsKey = builder.proposalMcmsKey;
            this.reason = builder.reason;
            this.reasonMcmsContext = builder.reasonMcmsContext;
            this.reasonMcmsKey = builder.reasonMcmsKey;
            this.upstreamErrorDetail = builder.upstreamErrorDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorDetail create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return extraContext
         */
        public java.util.Map < String, ? > getExtraContext() {
            return this.extraContext;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return messageMcmsContext
         */
        public java.util.Map < String, String > getMessageMcmsContext() {
            return this.messageMcmsContext;
        }

        /**
         * @return messageMcmsKey
         */
        public String getMessageMcmsKey() {
            return this.messageMcmsKey;
        }

        /**
         * @return proposal
         */
        public String getProposal() {
            return this.proposal;
        }

        /**
         * @return proposalMcmsContext
         */
        public java.util.Map < String, String > getProposalMcmsContext() {
            return this.proposalMcmsContext;
        }

        /**
         * @return proposalMcmsKey
         */
        public String getProposalMcmsKey() {
            return this.proposalMcmsKey;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return reasonMcmsContext
         */
        public java.util.Map < String, String > getReasonMcmsContext() {
            return this.reasonMcmsContext;
        }

        /**
         * @return reasonMcmsKey
         */
        public String getReasonMcmsKey() {
            return this.reasonMcmsKey;
        }

        /**
         * @return upstreamErrorDetail
         */
        public Object getUpstreamErrorDetail() {
            return this.upstreamErrorDetail;
        }

        public static final class Builder {
            private String code; 
            private java.util.Map < String, ? > extraContext; 
            private String level; 
            private String message; 
            private java.util.Map < String, String > messageMcmsContext; 
            private String messageMcmsKey; 
            private String proposal; 
            private java.util.Map < String, String > proposalMcmsContext; 
            private String proposalMcmsKey; 
            private String reason; 
            private java.util.Map < String, String > reasonMcmsContext; 
            private String reasonMcmsKey; 
            private Object upstreamErrorDetail; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * ExtraContext.
             */
            public Builder extraContext(java.util.Map < String, ? > extraContext) {
                this.extraContext = extraContext;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * MessageMcmsContext.
             */
            public Builder messageMcmsContext(java.util.Map < String, String > messageMcmsContext) {
                this.messageMcmsContext = messageMcmsContext;
                return this;
            }

            /**
             * MessageMcmsKey.
             */
            public Builder messageMcmsKey(String messageMcmsKey) {
                this.messageMcmsKey = messageMcmsKey;
                return this;
            }

            /**
             * Proposal.
             */
            public Builder proposal(String proposal) {
                this.proposal = proposal;
                return this;
            }

            /**
             * ProposalMcmsContext.
             */
            public Builder proposalMcmsContext(java.util.Map < String, String > proposalMcmsContext) {
                this.proposalMcmsContext = proposalMcmsContext;
                return this;
            }

            /**
             * ProposalMcmsKey.
             */
            public Builder proposalMcmsKey(String proposalMcmsKey) {
                this.proposalMcmsKey = proposalMcmsKey;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * ReasonMcmsContext.
             */
            public Builder reasonMcmsContext(java.util.Map < String, String > reasonMcmsContext) {
                this.reasonMcmsContext = reasonMcmsContext;
                return this;
            }

            /**
             * ReasonMcmsKey.
             */
            public Builder reasonMcmsKey(String reasonMcmsKey) {
                this.reasonMcmsKey = reasonMcmsKey;
                return this;
            }

            /**
             * UpstreamErrorDetail.
             */
            public Builder upstreamErrorDetail(Object upstreamErrorDetail) {
                this.upstreamErrorDetail = upstreamErrorDetail;
                return this;
            }

            public ErrorDetail build() {
                return new ErrorDetail(this);
            } 

        } 

    }
}
