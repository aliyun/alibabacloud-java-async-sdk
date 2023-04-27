// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSensitiveColumnsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSensitiveColumnsResponseBody</p>
 */
public class ListSensitiveColumnsResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SensitiveColumnList")
    private SensitiveColumnList sensitiveColumnList;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListSensitiveColumnsResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.sensitiveColumnList = builder.sensitiveColumnList;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSensitiveColumnsResponseBody create() {
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
     * @return sensitiveColumnList
     */
    public SensitiveColumnList getSensitiveColumnList() {
        return this.sensitiveColumnList;
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
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private SensitiveColumnList sensitiveColumnList; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * The sensitivity level of the field. Valid values:
         * <p>
         * 
         * *   SENSITIVE
         * *   CONFIDENTIAL
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The sensitive fields.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The number of sensitive fields.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The type of the de-identification algorithm. Valid values:
         * <p>
         * 
         * *   DEFAULT: All characters are masked. This is the default value.
         * *   FIX_POS: The characters at specific positions are masked.
         * *   FIX_CHAR: Specific characters are masked.
         */
        public Builder sensitiveColumnList(SensitiveColumnList sensitiveColumnList) {
            this.sensitiveColumnList = sensitiveColumnList;
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
         * The ID of the tenant.
         * <p>
         * 
         * >  To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see the "View information about the current tenant" section of the [Manage DMS tenants](~~181330~~) topic.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSensitiveColumnsResponseBody build() {
            return new ListSensitiveColumnsResponseBody(this);
        } 

    } 

    public static class SensitiveColumn extends TeaModel {
        @NameInMap("ColumnCount")
        private Long columnCount;

        @NameInMap("ColumnName")
        private String columnName;

        @NameInMap("FunctionType")
        private String functionType;

        @NameInMap("SchemaName")
        private String schemaName;

        @NameInMap("SecurityLevel")
        private String securityLevel;

        @NameInMap("TableName")
        private String tableName;

        private SensitiveColumn(Builder builder) {
            this.columnCount = builder.columnCount;
            this.columnName = builder.columnName;
            this.functionType = builder.functionType;
            this.schemaName = builder.schemaName;
            this.securityLevel = builder.securityLevel;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SensitiveColumn create() {
            return builder().build();
        }

        /**
         * @return columnCount
         */
        public Long getColumnCount() {
            return this.columnCount;
        }

        /**
         * @return columnName
         */
        public String getColumnName() {
            return this.columnName;
        }

        /**
         * @return functionType
         */
        public String getFunctionType() {
            return this.functionType;
        }

        /**
         * @return schemaName
         */
        public String getSchemaName() {
            return this.schemaName;
        }

        /**
         * @return securityLevel
         */
        public String getSecurityLevel() {
            return this.securityLevel;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private Long columnCount; 
            private String columnName; 
            private String functionType; 
            private String schemaName; 
            private String securityLevel; 
            private String tableName; 

            /**
             * Queries sensitive fields in a table of a database.
             */
            public Builder columnCount(Long columnCount) {
                this.columnCount = columnCount;
                return this;
            }

            /**
             * The name of the field. You can call the [ListColumns](~~141870~~) operation to query the name of the field.
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
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
             * SchemaName.
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * The ID of the request.
             */
            public Builder securityLevel(String securityLevel) {
                this.securityLevel = securityLevel;
                return this;
            }

            /**
             * The name of the field.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public SensitiveColumn build() {
                return new SensitiveColumn(this);
            } 

        } 

    }
    public static class SensitiveColumnList extends TeaModel {
        @NameInMap("SensitiveColumn")
        private java.util.List < SensitiveColumn> sensitiveColumn;

        private SensitiveColumnList(Builder builder) {
            this.sensitiveColumn = builder.sensitiveColumn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SensitiveColumnList create() {
            return builder().build();
        }

        /**
         * @return sensitiveColumn
         */
        public java.util.List < SensitiveColumn> getSensitiveColumn() {
            return this.sensitiveColumn;
        }

        public static final class Builder {
            private java.util.List < SensitiveColumn> sensitiveColumn; 

            /**
             * SensitiveColumn.
             */
            public Builder sensitiveColumn(java.util.List < SensitiveColumn> sensitiveColumn) {
                this.sensitiveColumn = sensitiveColumn;
                return this;
            }

            public SensitiveColumnList build() {
                return new SensitiveColumnList(this);
            } 

        } 

    }
}
