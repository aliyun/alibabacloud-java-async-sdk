// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataTrackJobTableMetaResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataTrackJobTableMetaResponseBody</p>
 */
public class GetDataTrackJobTableMetaResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TableMetaList")
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
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * Id of the request
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
         * TableMetaList.
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
        @NameInMap("Charset")
        private String charset;

        @NameInMap("ColumnName")
        private String columnName;

        @NameInMap("ColumnPosition")
        private Integer columnPosition;

        @NameInMap("ColumnType")
        private String columnType;

        @NameInMap("Fictive")
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
             * Charset.
             */
            public Builder charset(String charset) {
                this.charset = charset;
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
             * ColumnPosition.
             */
            public Builder columnPosition(Integer columnPosition) {
                this.columnPosition = columnPosition;
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
             * Fictive.
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
        @NameInMap("Columns")
        private java.util.List < Columns> columns;

        @NameInMap("SchemaName")
        private String schemaName;

        @NameInMap("TableName")
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
             * Columns.
             */
            public Builder columns(java.util.List < Columns> columns) {
                this.columns = columns;
                return this;
            }

            /**
             * SchemaName.
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * TableName.
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
