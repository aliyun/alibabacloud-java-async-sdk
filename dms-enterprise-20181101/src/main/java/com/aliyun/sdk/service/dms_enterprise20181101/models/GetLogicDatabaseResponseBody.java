// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLogicDatabaseResponseBody} extends {@link TeaModel}
 *
 * <p>GetLogicDatabaseResponseBody</p>
 */
public class GetLogicDatabaseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("LogicDatabase")
    private LogicDatabase logicDatabase;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetLogicDatabaseResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.logicDatabase = builder.logicDatabase;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLogicDatabaseResponseBody create() {
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
     * @return logicDatabase
     */
    public LogicDatabase getLogicDatabase() {
        return this.logicDatabase;
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
        private String errorCode; 
        private String errorMessage; 
        private LogicDatabase logicDatabase; 
        private String requestId; 
        private Boolean success; 

        /**
         * The status code.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The details of the logical database.
         */
        public Builder logicDatabase(LogicDatabase logicDatabase) {
            this.logicDatabase = logicDatabase;
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
         * *   true: The request was successful.
         * *   false: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetLogicDatabaseResponseBody build() {
            return new GetLogicDatabaseResponseBody(this);
        } 

    } 

    public static class DatabaseIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatabaseIds")
        private java.util.List < Long > databaseIds;

        private DatabaseIds(Builder builder) {
            this.databaseIds = builder.databaseIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabaseIds create() {
            return builder().build();
        }

        /**
         * @return databaseIds
         */
        public java.util.List < Long > getDatabaseIds() {
            return this.databaseIds;
        }

        public static final class Builder {
            private java.util.List < Long > databaseIds; 

            /**
             * DatabaseIds.
             */
            public Builder databaseIds(java.util.List < Long > databaseIds) {
                this.databaseIds = databaseIds;
                return this;
            }

            public DatabaseIds build() {
                return new DatabaseIds(this);
            } 

        } 

    }
    public static class OwnerIdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OwnerIds")
        private java.util.List < String > ownerIds;

        private OwnerIdList(Builder builder) {
            this.ownerIds = builder.ownerIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OwnerIdList create() {
            return builder().build();
        }

        /**
         * @return ownerIds
         */
        public java.util.List < String > getOwnerIds() {
            return this.ownerIds;
        }

        public static final class Builder {
            private java.util.List < String > ownerIds; 

            /**
             * OwnerIds.
             */
            public Builder ownerIds(java.util.List < String > ownerIds) {
                this.ownerIds = ownerIds;
                return this;
            }

            public OwnerIdList build() {
                return new OwnerIdList(this);
            } 

        } 

    }
    public static class OwnerNameList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OwnerNames")
        private java.util.List < String > ownerNames;

        private OwnerNameList(Builder builder) {
            this.ownerNames = builder.ownerNames;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OwnerNameList create() {
            return builder().build();
        }

        /**
         * @return ownerNames
         */
        public java.util.List < String > getOwnerNames() {
            return this.ownerNames;
        }

        public static final class Builder {
            private java.util.List < String > ownerNames; 

            /**
             * OwnerNames.
             */
            public Builder ownerNames(java.util.List < String > ownerNames) {
                this.ownerNames = ownerNames;
                return this;
            }

            public OwnerNameList build() {
                return new OwnerNameList(this);
            } 

        } 

    }
    public static class LogicDatabase extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("DatabaseId")
        private String databaseId;

        @com.aliyun.core.annotation.NameInMap("DatabaseIds")
        private DatabaseIds databaseIds;

        @com.aliyun.core.annotation.NameInMap("DbType")
        private String dbType;

        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("Logic")
        private Boolean logic;

        @com.aliyun.core.annotation.NameInMap("OwnerIdList")
        private OwnerIdList ownerIdList;

        @com.aliyun.core.annotation.NameInMap("OwnerNameList")
        private OwnerNameList ownerNameList;

        @com.aliyun.core.annotation.NameInMap("SchemaName")
        private String schemaName;

        @com.aliyun.core.annotation.NameInMap("SearchName")
        private String searchName;

        private LogicDatabase(Builder builder) {
            this.alias = builder.alias;
            this.databaseId = builder.databaseId;
            this.databaseIds = builder.databaseIds;
            this.dbType = builder.dbType;
            this.envType = builder.envType;
            this.logic = builder.logic;
            this.ownerIdList = builder.ownerIdList;
            this.ownerNameList = builder.ownerNameList;
            this.schemaName = builder.schemaName;
            this.searchName = builder.searchName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogicDatabase create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return databaseId
         */
        public String getDatabaseId() {
            return this.databaseId;
        }

        /**
         * @return databaseIds
         */
        public DatabaseIds getDatabaseIds() {
            return this.databaseIds;
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
         * @return ownerIdList
         */
        public OwnerIdList getOwnerIdList() {
            return this.ownerIdList;
        }

        /**
         * @return ownerNameList
         */
        public OwnerNameList getOwnerNameList() {
            return this.ownerNameList;
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

        public static final class Builder {
            private String alias; 
            private String databaseId; 
            private DatabaseIds databaseIds; 
            private String dbType; 
            private String envType; 
            private Boolean logic; 
            private OwnerIdList ownerIdList; 
            private OwnerNameList ownerNameList; 
            private String schemaName; 
            private String searchName; 

            /**
             * The alias of the logical database.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * The ID of the logical database.
             */
            public Builder databaseId(String databaseId) {
                this.databaseId = databaseId;
                return this;
            }

            /**
             * The IDs of database shards of the logical database.
             */
            public Builder databaseIds(DatabaseIds databaseIds) {
                this.databaseIds = databaseIds;
                return this;
            }

            /**
             * The database engine. For more information about the valid values of the DbType parameter, see [DbType parameter](~~198106~~).
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * The type of the environment to which the database belongs. Valid values:
             * <p>
             * 
             * *   product: production environment
             * *   dev: development environment
             * *   pre: pre-release environment
             * *   test: test environment
             * *   sit: system integration testing (SIT) environment
             * *   uat: user acceptance testing (UAT) environment
             * *   pet: stress testing environment
             * *   stag: staging environment
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * Indicates whether the database is a logical database. The return value is true.
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * The IDs of the owners of the logical database.
             */
            public Builder ownerIdList(OwnerIdList ownerIdList) {
                this.ownerIdList = ownerIdList;
                return this;
            }

            /**
             * The names of the owners of the logical database.
             */
            public Builder ownerNameList(OwnerNameList ownerNameList) {
                this.ownerNameList = ownerNameList;
                return this;
            }

            /**
             * The name of the logical database.
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * The name that is used to search for the logical database.
             */
            public Builder searchName(String searchName) {
                this.searchName = searchName;
                return this;
            }

            public LogicDatabase build() {
                return new LogicDatabase(this);
            } 

        } 

    }
}
