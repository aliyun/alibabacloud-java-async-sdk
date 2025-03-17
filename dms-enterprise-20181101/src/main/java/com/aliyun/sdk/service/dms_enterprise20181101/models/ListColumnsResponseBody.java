// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link ListColumnsResponseBody} extends {@link TeaModel}
 *
 * <p>ListColumnsResponseBody</p>
 */
public class ListColumnsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ColumnList")
    private ColumnList columnList;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListColumnsResponseBody model) {
            this.columnList = model.columnList;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The details about columns.</p>
         */
        public Builder columnList(ColumnList columnList) {
            this.columnList = columnList;
            return this;
        }

        /**
         * <p>The error code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0AD9AC55-5873-474A-9F33-4285806A3619</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListColumnsResponseBody build() {
            return new ListColumnsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListColumnsResponseBody} extends {@link TeaModel}
     *
     * <p>ListColumnsResponseBody</p>
     */
    public static class Column extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FunctionType")
        private String functionType;

        @com.aliyun.core.annotation.NameInMap("Nullable")
        private Boolean nullable;

        @com.aliyun.core.annotation.NameInMap("SecurityLevel")
        private String securityLevel;

        @com.aliyun.core.annotation.NameInMap("Sensitive")
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

            private Builder() {
            } 

            private Builder(Column model) {
                this.autoIncrement = model.autoIncrement;
                this.columnId = model.columnId;
                this.columnName = model.columnName;
                this.columnType = model.columnType;
                this.dataLength = model.dataLength;
                this.dataPrecision = model.dataPrecision;
                this.dataScale = model.dataScale;
                this.defaultValue = model.defaultValue;
                this.description = model.description;
                this.functionType = model.functionType;
                this.nullable = model.nullable;
                this.securityLevel = model.securityLevel;
                this.sensitive = model.sensitive;
            } 

            /**
             * <p>Indicates whether the column is an auto-increment column. Valid values:</p>
             * <ul>
             * <li>true: The column is an auto-increment column.</li>
             * <li>false: The column is not an auto-increment column.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder autoIncrement(Boolean autoIncrement) {
                this.autoIncrement = autoIncrement;
                return this;
            }

            /**
             * <p>The ID of the column.</p>
             * 
             * <strong>example:</strong>
             * <p>62589****</p>
             */
            public Builder columnId(String columnId) {
                this.columnId = columnId;
                return this;
            }

            /**
             * <p>The name of the column.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * <p>The data type of the column.</p>
             * 
             * <strong>example:</strong>
             * <p>varchar</p>
             */
            public Builder columnType(String columnType) {
                this.columnType = columnType;
                return this;
            }

            /**
             * <p>The length of the field.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder dataLength(Long dataLength) {
                this.dataLength = dataLength;
                return this;
            }

            /**
             * <p>The number of valid digits for the field.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dataPrecision(Integer dataPrecision) {
                this.dataPrecision = dataPrecision;
                return this;
            }

            /**
             * <p>The number of decimal places for the field.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dataScale(Integer dataScale) {
                this.dataScale = dataScale;
                return this;
            }

            /**
             * <p>The default value of the column.</p>
             * 
             * <strong>example:</strong>
             * <p>def_value</p>
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * <p>The description of the column.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The type of the masking algorithm that is used for the field. Valid values:</p>
             * <ul>
             * <li>null: No masking algorithm is used.</li>
             * <li>DEFAULT: A full masking algorithm is used.</li>
             * <li>FIX_POS: The fixed position is masked.</li>
             * <li>FIX_CHAR: The fixed characters are replaced.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DEFAULT</p>
             */
            public Builder functionType(String functionType) {
                this.functionType = functionType;
                return this;
            }

            /**
             * <p>Indicates whether the column can be empty. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The column can be empty.</li>
             * <li><strong>false</strong>: The column cannot be empty.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder nullable(Boolean nullable) {
                this.nullable = nullable;
                return this;
            }

            /**
             * <p>The security level of the column. Valid values:</p>
             * <ul>
             * <li>INNER: The column is an internal column but not sensitive.</li>
             * <li>SENSITIVE: The column is a sensitive column.</li>
             * <li>CONFIDENTIAL: The column is a confidential column.</li>
             * </ul>
             * <blockquote>
             * <p>For more information, see <a href="https://help.aliyun.com/document_detail/66091.html">Sensitivity levels of fields</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>INNER</p>
             */
            public Builder securityLevel(String securityLevel) {
                this.securityLevel = securityLevel;
                return this;
            }

            /**
             * <p>Indicates whether the column is a sensitive column. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The column is a sensitive column.</li>
             * <li><strong>false</strong>: The column is not a sensitive column.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
    /**
     * 
     * {@link ListColumnsResponseBody} extends {@link TeaModel}
     *
     * <p>ListColumnsResponseBody</p>
     */
    public static class ColumnList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Column")
        private java.util.List<Column> column;

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
        public java.util.List<Column> getColumn() {
            return this.column;
        }

        public static final class Builder {
            private java.util.List<Column> column; 

            private Builder() {
            } 

            private Builder(ColumnList model) {
                this.column = model.column;
            } 

            /**
             * Column.
             */
            public Builder column(java.util.List<Column> column) {
                this.column = column;
                return this;
            }

            public ColumnList build() {
                return new ColumnList(this);
            } 

        } 

    }
}
