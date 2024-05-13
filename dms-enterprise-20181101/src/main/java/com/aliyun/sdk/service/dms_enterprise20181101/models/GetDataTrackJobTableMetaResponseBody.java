// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataTrackJobTableMetaResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataTrackJobTableMetaResponseBody</p>
 */
public class GetDataTrackJobTableMetaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TableMetaList")
    private java.util.List < TableMetaList> tableMetaList;

    private GetDataTrackJobTableMetaResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.tableMetaList = builder.tableMetaList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataTrackJobTableMetaResponseBody create() {
        return builder().build();
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

    /**
     * @return tableMetaList
     */
    public java.util.List < TableMetaList> getTableMetaList() {
        return this.tableMetaList;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private java.util.List < TableMetaList> tableMetaList; 

        /**
         * The error code returned if the request failed.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned if the request failed.
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
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**: The request was successful.
         * *   **false**: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The metadata of tables.
         */
        public Builder tableMetaList(java.util.List < TableMetaList> tableMetaList) {
            this.tableMetaList = tableMetaList;
            return this;
        }

        public GetDataTrackJobTableMetaResponseBody build() {
            return new GetDataTrackJobTableMetaResponseBody(this);
        } 

    } 

    public static class Columns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Charset")
        private String charset;

        @com.aliyun.core.annotation.NameInMap("ColumnName")
        private String columnName;

        @com.aliyun.core.annotation.NameInMap("ColumnPosition")
        private Integer columnPosition;

        @com.aliyun.core.annotation.NameInMap("ColumnType")
        private String columnType;

        @com.aliyun.core.annotation.NameInMap("Fictive")
        private Boolean fictive;

        private Columns(Builder builder) {
            this.charset = builder.charset;
            this.columnName = builder.columnName;
            this.columnPosition = builder.columnPosition;
            this.columnType = builder.columnType;
            this.fictive = builder.fictive;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Columns create() {
            return builder().build();
        }

        /**
         * @return charset
         */
        public String getCharset() {
            return this.charset;
        }

        /**
         * @return columnName
         */
        public String getColumnName() {
            return this.columnName;
        }

        /**
         * @return columnPosition
         */
        public Integer getColumnPosition() {
            return this.columnPosition;
        }

        /**
         * @return columnType
         */
        public String getColumnType() {
            return this.columnType;
        }

        /**
         * @return fictive
         */
        public Boolean getFictive() {
            return this.fictive;
        }

        public static final class Builder {
            private String charset; 
            private String columnName; 
            private Integer columnPosition; 
            private String columnType; 
            private Boolean fictive; 

            /**
             * The name of the character set.
             */
            public Builder charset(String charset) {
                this.charset = charset;
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
             * The position of the column.
             */
            public Builder columnPosition(Integer columnPosition) {
                this.columnPosition = columnPosition;
                return this;
            }

            /**
             * The data type of the column. Examples: BIGINT, INT, and VARCHAR.
             */
            public Builder columnType(String columnType) {
                this.columnType = columnType;
                return this;
            }

            /**
             * Indicates whether the column is a virtual column. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder fictive(Boolean fictive) {
                this.fictive = fictive;
                return this;
            }

            public Columns build() {
                return new Columns(this);
            } 

        } 

    }
    public static class TableMetaList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Columns")
        private java.util.List < Columns> columns;

        @com.aliyun.core.annotation.NameInMap("SchemaName")
        private String schemaName;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private TableMetaList(Builder builder) {
            this.columns = builder.columns;
            this.schemaName = builder.schemaName;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableMetaList create() {
            return builder().build();
        }

        /**
         * @return columns
         */
        public java.util.List < Columns> getColumns() {
            return this.columns;
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

        public static final class Builder {
            private java.util.List < Columns> columns; 
            private String schemaName; 
            private String tableName; 

            /**
             * The information about columns.
             */
            public Builder columns(java.util.List < Columns> columns) {
                this.columns = columns;
                return this;
            }

            /**
             * The name of the database.
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * The name of the table.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public TableMetaList build() {
                return new TableMetaList(this);
            } 

        } 

    }
}
