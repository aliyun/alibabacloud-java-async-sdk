// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListColumnsResponseBody} extends {@link TeaModel}
 *
 * <p>ListColumnsResponseBody</p>
 */
public class ListColumnsResponseBody extends TeaModel {
    @NameInMap("ColumnList")
    private ColumnList columnList;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListColumnsResponseBody(Builder builder) {
        this.columnList = builder.columnList;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListColumnsResponseBody create() {
        return builder().build();
    }

    /**
     * @return columnList
     */
    public ColumnList getColumnList() {
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
        private ColumnList columnList; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * ColumnList.
         */
        public Builder columnList(ColumnList columnList) {
            this.columnList = columnList;
            return this;
        }

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

        public ListColumnsResponseBody build() {
            return new ListColumnsResponseBody(this);
        } 

    } 

    public static class Column extends TeaModel {
        @NameInMap("AutoIncrement")
        private Boolean autoIncrement;

        @NameInMap("ColumnId")
        private String columnId;

        @NameInMap("ColumnName")
        private String columnName;

        @NameInMap("ColumnType")
        private String columnType;

        @NameInMap("DataLength")
        private Long dataLength;

        @NameInMap("DataPrecision")
        private Integer dataPrecision;

        @NameInMap("DataScale")
        private Integer dataScale;

        @NameInMap("DefaultValue")
        private String defaultValue;

        @NameInMap("Description")
        private String description;

        @NameInMap("FunctionType")
        private String functionType;

        @NameInMap("Nullable")
        private Boolean nullable;

        @NameInMap("SecurityLevel")
        private String securityLevel;

        @NameInMap("Sensitive")
        private Boolean sensitive;

        private Column(Builder builder) {
            this.autoIncrement = builder.autoIncrement;
            this.columnId = builder.columnId;
            this.columnName = builder.columnName;
            this.columnType = builder.columnType;
            this.dataLength = builder.dataLength;
            this.dataPrecision = builder.dataPrecision;
            this.dataScale = builder.dataScale;
            this.defaultValue = builder.defaultValue;
            this.description = builder.description;
            this.functionType = builder.functionType;
            this.nullable = builder.nullable;
            this.securityLevel = builder.securityLevel;
            this.sensitive = builder.sensitive;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Column create() {
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
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return functionType
         */
        public String getFunctionType() {
            return this.functionType;
        }

        /**
         * @return nullable
         */
        public Boolean getNullable() {
            return this.nullable;
        }

        /**
         * @return securityLevel
         */
        public String getSecurityLevel() {
            return this.securityLevel;
        }

        /**
         * @return sensitive
         */
        public Boolean getSensitive() {
            return this.sensitive;
        }

        public static final class Builder {
            private Boolean autoIncrement; 
            private String columnId; 
            private String columnName; 
            private String columnType; 
            private Long dataLength; 
            private Integer dataPrecision; 
            private Integer dataScale; 
            private String defaultValue; 
            private String description; 
            private String functionType; 
            private Boolean nullable; 
            private String securityLevel; 
            private Boolean sensitive; 

            /**
             * AutoIncrement.
             */
            public Builder autoIncrement(Boolean autoIncrement) {
                this.autoIncrement = autoIncrement;
                return this;
            }

            /**
             * ColumnId.
             */
            public Builder columnId(String columnId) {
                this.columnId = columnId;
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * FunctionType.
             */
            public Builder functionType(String functionType) {
                this.functionType = functionType;
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
             * SecurityLevel.
             */
            public Builder securityLevel(String securityLevel) {
                this.securityLevel = securityLevel;
                return this;
            }

            /**
             * Sensitive.
             */
            public Builder sensitive(Boolean sensitive) {
                this.sensitive = sensitive;
                return this;
            }

            public Column build() {
                return new Column(this);
            } 

        } 

    }
    public static class ColumnList extends TeaModel {
        @NameInMap("Column")
        private java.util.List < Column> column;

        private ColumnList(Builder builder) {
            this.column = builder.column;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ColumnList create() {
            return builder().build();
        }

        /**
         * @return column
         */
        public java.util.List < Column> getColumn() {
            return this.column;
        }

        public static final class Builder {
            private java.util.List < Column> column; 

            /**
             * Column.
             */
            public Builder column(java.util.List < Column> column) {
                this.column = column;
                return this;
            }

            public ColumnList build() {
                return new ColumnList(this);
            } 

        } 

    }
}
