// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSensitiveColumnsDetailResponseBody} extends {@link TeaModel}
 *
 * <p>ListSensitiveColumnsDetailResponseBody</p>
 */
public class ListSensitiveColumnsDetailResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SensitiveColumnsDetailList")
    private SensitiveColumnsDetailList sensitiveColumnsDetailList;

    @NameInMap("Success")
    private Boolean success;

    private ListSensitiveColumnsDetailResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.sensitiveColumnsDetailList = builder.sensitiveColumnsDetailList;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSensitiveColumnsDetailResponseBody create() {
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
     * @return sensitiveColumnsDetailList
     */
    public SensitiveColumnsDetailList getSensitiveColumnsDetailList() {
        return this.sensitiveColumnsDetailList;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private SensitiveColumnsDetailList sensitiveColumnsDetailList; 
        private Boolean success; 

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
         * The details of the sensitive field.
         */
        public Builder sensitiveColumnsDetailList(SensitiveColumnsDetailList sensitiveColumnsDetailList) {
            this.sensitiveColumnsDetailList = sensitiveColumnsDetailList;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * - **true**: The request was successful.
         * - **false**: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListSensitiveColumnsDetailResponseBody build() {
            return new ListSensitiveColumnsDetailResponseBody(this);
        } 

    } 

    public static class SensitiveColumnsDetail extends TeaModel {
        @NameInMap("ColumnDescription")
        private String columnDescription;

        @NameInMap("ColumnName")
        private String columnName;

        @NameInMap("ColumnType")
        private String columnType;

        @NameInMap("DbId")
        private Long dbId;

        @NameInMap("DbType")
        private String dbType;

        @NameInMap("EnvType")
        private String envType;

        @NameInMap("Logic")
        private Boolean logic;

        @NameInMap("SchemaName")
        private String schemaName;

        @NameInMap("SearchName")
        private String searchName;

        @NameInMap("TableName")
        private String tableName;

        private SensitiveColumnsDetail(Builder builder) {
            this.columnDescription = builder.columnDescription;
            this.columnName = builder.columnName;
            this.columnType = builder.columnType;
            this.dbId = builder.dbId;
            this.dbType = builder.dbType;
            this.envType = builder.envType;
            this.logic = builder.logic;
            this.schemaName = builder.schemaName;
            this.searchName = builder.searchName;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SensitiveColumnsDetail create() {
            return builder().build();
        }

        /**
         * @return columnDescription
         */
        public String getColumnDescription() {
            return this.columnDescription;
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
         * @return dbId
         */
        public Long getDbId() {
            return this.dbId;
        }

        /**
         * @return dbType
         */
        public String getDbType() {
            return this.dbType;
        }

        /**
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
        }

        /**
         * @return logic
         */
        public Boolean getLogic() {
            return this.logic;
        }

        /**
         * @return schemaName
         */
        public String getSchemaName() {
            return this.schemaName;
        }

        /**
         * @return searchName
         */
        public String getSearchName() {
            return this.searchName;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private String columnDescription; 
            private String columnName; 
            private String columnType; 
            private Long dbId; 
            private String dbType; 
            private String envType; 
            private Boolean logic; 
            private String schemaName; 
            private String searchName; 
            private String tableName; 

            /**
             * The description of the field.
             */
            public Builder columnDescription(String columnDescription) {
                this.columnDescription = columnDescription;
                return this;
            }

            /**
             * The name of the field.
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * The data type of the field.
             */
            public Builder columnType(String columnType) {
                this.columnType = columnType;
                return this;
            }

            /**
             * The ID of the database.
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * The type of the database.
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * The type of the environment to which the database belongs.
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * Indicates whether the database is a logical database. Valid values:
             * <p>
             * 
             * *   **true**: The database is a logical database.
             * *   **false**: The database is not a logical database.
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
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
             * The name that is used to search for the database.
             */
            public Builder searchName(String searchName) {
                this.searchName = searchName;
                return this;
            }

            /**
             * The name of the table.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public SensitiveColumnsDetail build() {
                return new SensitiveColumnsDetail(this);
            } 

        } 

    }
    public static class SensitiveColumnsDetailList extends TeaModel {
        @NameInMap("SensitiveColumnsDetail")
        private java.util.List < SensitiveColumnsDetail> sensitiveColumnsDetail;

        private SensitiveColumnsDetailList(Builder builder) {
            this.sensitiveColumnsDetail = builder.sensitiveColumnsDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SensitiveColumnsDetailList create() {
            return builder().build();
        }

        /**
         * @return sensitiveColumnsDetail
         */
        public java.util.List < SensitiveColumnsDetail> getSensitiveColumnsDetail() {
            return this.sensitiveColumnsDetail;
        }

        public static final class Builder {
            private java.util.List < SensitiveColumnsDetail> sensitiveColumnsDetail; 

            /**
             * SensitiveColumnsDetail.
             */
            public Builder sensitiveColumnsDetail(java.util.List < SensitiveColumnsDetail> sensitiveColumnsDetail) {
                this.sensitiveColumnsDetail = sensitiveColumnsDetail;
                return this;
            }

            public SensitiveColumnsDetailList build() {
                return new SensitiveColumnsDetailList(this);
            } 

        } 

    }
}
