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
 * {@link GetMetaTableColumnResponseBody} extends {@link TeaModel}
 *
 * <p>GetMetaTableColumnResponseBody</p>
 */
public class GetMetaTableColumnResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ColumnList")
    private java.util.List<ColumnList> columnList;

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
    public java.util.List<ColumnList> getColumnList() {
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
        private java.util.List<ColumnList> columnList; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The details about fields in the table.</p>
         */
        public Builder columnList(java.util.List<ColumnList> columnList) {
            this.columnList = columnList;
            return this;
        }

        /**
         * <p>The error code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>MissingTableGuid</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>TableGuid is mandatory for this action.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>087DFBA1-378B-5D25-B13B-31F6409F****</p>
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

        public GetMetaTableColumnResponseBody build() {
            return new GetMetaTableColumnResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMetaTableColumnResponseBody} extends {@link TeaModel}
     *
     * <p>GetMetaTableColumnResponseBody</p>
     */
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
             * <p>Indicates whether the column is an auto-increment column. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The column is an auto-increment column.</li>
             * <li><strong>false</strong>: The column is not an auto-increment column.</li>
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
             * <p>63513****</p>
             */
            public Builder columnId(String columnId) {
                this.columnId = columnId;
                return this;
            }

            /**
             * <p>The name of the column.</p>
             * 
             * <strong>example:</strong>
             * <p>has_promotion</p>
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * <p>The data type of the column.</p>
             * <blockquote>
             * <p>The return value of a column is not unique, such as <strong>bigint</strong> or <strong>int</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>bigint(1)</p>
             */
            public Builder columnType(String columnType) {
                this.columnType = columnType;
                return this;
            }

            /**
             * <p>The length of the field.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dataLength(Long dataLength) {
                this.dataLength = dataLength;
                return this;
            }

            /**
             * <p>The precision of the field.</p>
             * 
             * <strong>example:</strong>
             * <p>19</p>
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
             * <p>The description of the column.</p>
             * 
             * <strong>example:</strong>
             * <p>Whether discounts are provided</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether the field can be empty. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The field can be empty.</li>
             * <li><strong>false</strong>: The field cannot be empty.</li>
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
             * <p>The position of the field in the table.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder position(Integer position) {
                this.position = position;
                return this;
            }

            /**
             * <p>Indicates whether the field is the primary key. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The field is the primary key.</li>
             * <li><strong>false</strong>: The field is not the primary key.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder primaryKey(String primaryKey) {
                this.primaryKey = primaryKey;
                return this;
            }

            /**
             * <p>The sensitivity level of the column. Valid values:</p>
             * <ul>
             * <li><strong>INNER</strong>: The column is not sensitive.</li>
             * <li><strong>SENSITIVE</strong>: The column is sensitive.</li>
             * <li><strong>CONFIDENTIAL</strong>: The column is confidential.</li>
             * </ul>
             * <blockquote>
             * <p>For more information, see <a href="https://help.aliyun.com/document_detail/66091.html">Sensitivity levels of columns</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>INNER</p>
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
