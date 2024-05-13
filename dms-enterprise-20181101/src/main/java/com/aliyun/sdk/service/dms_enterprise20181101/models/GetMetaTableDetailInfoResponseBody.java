// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetaTableDetailInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetMetaTableDetailInfoResponseBody</p>
 */
public class GetMetaTableDetailInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DetailInfo")
    private DetailInfo detailInfo;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetMetaTableDetailInfoResponseBody(Builder builder) {
        this.detailInfo = builder.detailInfo;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetaTableDetailInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return detailInfo
     */
    public DetailInfo getDetailInfo() {
        return this.detailInfo;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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

    public static final class Builder {
        private DetailInfo detailInfo; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * The details of the table.
         */
        public Builder detailInfo(DetailInfo detailInfo) {
            this.detailInfo = detailInfo;
            return this;
        }

        /**
         * The error code returned.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetMetaTableDetailInfoResponseBody build() {
            return new GetMetaTableDetailInfoResponseBody(this);
        } 

    } 

    public static class ColumnList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoIncrement")
        private Boolean autoIncrement;

        @com.aliyun.core.annotation.NameInMap("ColumnId")
        private String columnId;

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

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Nullable")
        private Boolean nullable;

        @com.aliyun.core.annotation.NameInMap("Position")
        private String position;

        private ColumnList(Builder builder) {
            this.autoIncrement = builder.autoIncrement;
            this.columnId = builder.columnId;
            this.columnName = builder.columnName;
            this.columnType = builder.columnType;
            this.dataLength = builder.dataLength;
            this.dataPrecision = builder.dataPrecision;
            this.dataScale = builder.dataScale;
            this.description = builder.description;
            this.nullable = builder.nullable;
            this.position = builder.position;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ColumnList create() {
            return builder().build();
        }

        /**
         * @return autoIncrement
         */
        public Boolean getAutoIncrement() {
            return this.autoIncrement;
        }

        /**
         * @return columnId
         */
        public String getColumnId() {
            return this.columnId;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
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
        public String getPosition() {
            return this.position;
        }

        public static final class Builder {
            private Boolean autoIncrement; 
            private String columnId; 
            private String columnName; 
            private String columnType; 
            private Long dataLength; 
            private Integer dataPrecision; 
            private Integer dataScale; 
            private String description; 
            private Boolean nullable; 
            private String position; 

            /**
             * Indicates whether the column is an auto-increment column. Valid values:
             * <p>
             * 
             * *   true: The column is an auto-increment column.
             * *   false: The column is not an auto-increment column.
             */
            public Builder autoIncrement(Boolean autoIncrement) {
                this.autoIncrement = autoIncrement;
                return this;
            }

            /**
             * The ID of the column.
             */
            public Builder columnId(String columnId) {
                this.columnId = columnId;
                return this;
            }

            /**
             * The name of the column.
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * The data type of the column. Examples: Bigint, Int, and Varchar.
             */
            public Builder columnType(String columnType) {
                this.columnType = columnType;
                return this;
            }

            /**
             * The length of the field.
             */
            public Builder dataLength(Long dataLength) {
                this.dataLength = dataLength;
                return this;
            }

            /**
             * The precision of the field.
             */
            public Builder dataPrecision(Integer dataPrecision) {
                this.dataPrecision = dataPrecision;
                return this;
            }

            /**
             * The scale of the column.
             */
            public Builder dataScale(Integer dataScale) {
                this.dataScale = dataScale;
                return this;
            }

            /**
             * The description of the column.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Indicates whether the column is nullable. Valid values:
             * <p>
             * 
             * *   true: The column is nullable.
             * *   false: The column is not nullable.
             */
            public Builder nullable(Boolean nullable) {
                this.nullable = nullable;
                return this;
            }

            /**
             * The position of the field in the table.
             */
            public Builder position(String position) {
                this.position = position;
                return this;
            }

            public ColumnList build() {
                return new ColumnList(this);
            } 

        } 

    }
    public static class IndexList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IndexColumns")
        private java.util.List < String > indexColumns;

        @com.aliyun.core.annotation.NameInMap("IndexId")
        private String indexId;

        @com.aliyun.core.annotation.NameInMap("IndexName")
        private String indexName;

        @com.aliyun.core.annotation.NameInMap("IndexType")
        private String indexType;

        @com.aliyun.core.annotation.NameInMap("Unique")
        private Boolean unique;

        private IndexList(Builder builder) {
            this.indexColumns = builder.indexColumns;
            this.indexId = builder.indexId;
            this.indexName = builder.indexName;
            this.indexType = builder.indexType;
            this.unique = builder.unique;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IndexList create() {
            return builder().build();
        }

        /**
         * @return indexColumns
         */
        public java.util.List < String > getIndexColumns() {
            return this.indexColumns;
        }

        /**
         * @return indexId
         */
        public String getIndexId() {
            return this.indexId;
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
         * @return unique
         */
        public Boolean getUnique() {
            return this.unique;
        }

        public static final class Builder {
            private java.util.List < String > indexColumns; 
            private String indexId; 
            private String indexName; 
            private String indexType; 
            private Boolean unique; 

            /**
             * The index column.
             */
            public Builder indexColumns(java.util.List < String > indexColumns) {
                this.indexColumns = indexColumns;
                return this;
            }

            /**
             * The ID of the index.
             */
            public Builder indexId(String indexId) {
                this.indexId = indexId;
                return this;
            }

            /**
             * The name of the index.
             */
            public Builder indexName(String indexName) {
                this.indexName = indexName;
                return this;
            }

            /**
             * The type of the index. Examples: Primary, Unique, and Normal.
             */
            public Builder indexType(String indexType) {
                this.indexType = indexType;
                return this;
            }

            /**
             * Indicates whether the index is unique. Valid values:
             * <p>
             * 
             * *   true: The index is unique.
             * *   false: The index is not unique.
             */
            public Builder unique(Boolean unique) {
                this.unique = unique;
                return this;
            }

            public IndexList build() {
                return new IndexList(this);
            } 

        } 

    }
    public static class DetailInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnList")
        private java.util.List < ColumnList> columnList;

        @com.aliyun.core.annotation.NameInMap("IndexList")
        private java.util.List < IndexList> indexList;

        private DetailInfo(Builder builder) {
            this.columnList = builder.columnList;
            this.indexList = builder.indexList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetailInfo create() {
            return builder().build();
        }

        /**
         * @return columnList
         */
        public java.util.List < ColumnList> getColumnList() {
            return this.columnList;
        }

        /**
         * @return indexList
         */
        public java.util.List < IndexList> getIndexList() {
            return this.indexList;
        }

        public static final class Builder {
            private java.util.List < ColumnList> columnList; 
            private java.util.List < IndexList> indexList; 

            /**
             * The columns in the table.
             */
            public Builder columnList(java.util.List < ColumnList> columnList) {
                this.columnList = columnList;
                return this;
            }

            /**
             * The list of indexes.
             */
            public Builder indexList(java.util.List < IndexList> indexList) {
                this.indexList = indexList;
                return this;
            }

            public DetailInfo build() {
                return new DetailInfo(this);
            } 

        } 

    }
}
