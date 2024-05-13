// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetaTableColumnResponseBody} extends {@link TeaModel}
 *
 * <p>GetMetaTableColumnResponseBody</p>
 */
public class GetMetaTableColumnResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ColumnList")
    private java.util.List < ColumnList> columnList;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetMetaTableColumnResponseBody(Builder builder) {
        this.columnList = builder.columnList;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetaTableColumnResponseBody create() {
        return builder().build();
    }

    /**
     * @return columnList
     */
    public java.util.List < ColumnList> getColumnList() {
        return this.columnList;
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
        private java.util.List < ColumnList> columnList; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * The details about fields in the table.
         */
        public Builder columnList(java.util.List < ColumnList> columnList) {
            this.columnList = columnList;
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

        public GetMetaTableColumnResponseBody build() {
            return new GetMetaTableColumnResponseBody(this);
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
        private Integer position;

        @com.aliyun.core.annotation.NameInMap("PrimaryKey")
        private String primaryKey;

        @com.aliyun.core.annotation.NameInMap("SecurityLevel")
        private String securityLevel;

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
            this.primaryKey = builder.primaryKey;
            this.securityLevel = builder.securityLevel;
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
        public Integer getPosition() {
            return this.position;
        }

        /**
         * @return primaryKey
         */
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        /**
         * @return securityLevel
         */
        public String getSecurityLevel() {
            return this.securityLevel;
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
            private Integer position; 
            private String primaryKey; 
            private String securityLevel; 

            /**
             * Indicates whether the column is an auto-increment column. Valid values:
             * <p>
             * 
             * *   **true**: The column is an auto-increment column.
             * *   **false**: The column is not an auto-increment column.
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
             * The data type of the column.
             * <p>
             * 
             * > The return value of a column is not unique, such as **bigint** or **int**.
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
             * The number of decimal places for the field.
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
             * Indicates whether the field can be empty. Valid values:
             * <p>
             * 
             * *   **true**: The field can be empty.
             * *   **false**: The field cannot be empty.
             */
            public Builder nullable(Boolean nullable) {
                this.nullable = nullable;
                return this;
            }

            /**
             * The position of the field in the table.
             */
            public Builder position(Integer position) {
                this.position = position;
                return this;
            }

            /**
             * Indicates whether the field is the primary key. Valid values:
             * <p>
             * 
             * *   **true**: The field is the primary key.
             * *   **false**: The field is not the primary key.
             */
            public Builder primaryKey(String primaryKey) {
                this.primaryKey = primaryKey;
                return this;
            }

            /**
             * The sensitivity level of the column. Valid values:
             * <p>
             * 
             * *   **INNER**: The column is not sensitive.
             * *   **SENSITIVE**: The column is sensitive.
             * *   **CONFIDENTIAL**: The column is confidential.
             * 
             * > For more information, see [Sensitivity levels of columns](~~66091~~).
             */
            public Builder securityLevel(String securityLevel) {
                this.securityLevel = securityLevel;
                return this;
            }

            public ColumnList build() {
                return new ColumnList(this);
            } 

        } 

    }
}
