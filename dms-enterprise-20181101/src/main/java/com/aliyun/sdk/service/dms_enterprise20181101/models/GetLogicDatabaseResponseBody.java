// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The details of the logical database.</p>
         */
        public Builder logicDatabase(LogicDatabase logicDatabase) {
            this.logicDatabase = logicDatabase;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>90260530-565C-42B9-A6E8-893481FE6AB6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true: The request was successful.</li>
         * <li>false: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetLogicDatabaseResponseBody build() {
            return new GetLogicDatabaseResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLogicDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetLogicDatabaseResponseBody</p>
     */
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
    /**
     * 
     * {@link GetLogicDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetLogicDatabaseResponseBody</p>
     */
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
    /**
     * 
     * {@link GetLogicDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetLogicDatabaseResponseBody</p>
     */
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
    /**
     * 
     * {@link GetLogicDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetLogicDatabaseResponseBody</p>
     */
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
             * <p>The alias of the logical database.</p>
             * 
             * <strong>example:</strong>
             * <p>test_logic_alias</p>
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * <p>The ID of the logical database.</p>
             * 
             * <strong>example:</strong>
             * <p>1***</p>
             */
            public Builder databaseId(String databaseId) {
                this.databaseId = databaseId;
                return this;
            }

            /**
             * <p>The IDs of database shards of the logical database.</p>
             */
            public Builder databaseIds(DatabaseIds databaseIds) {
                this.databaseIds = databaseIds;
                return this;
            }

            /**
             * <p>The database engine. For more information about the valid values of the DbType parameter, see <a href="https://help.aliyun.com/document_detail/198106.html">DbType parameter</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>POLARDB</p>
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * <p>The type of the environment to which the database belongs. Valid values:</p>
             * <ul>
             * <li>product: production environment</li>
             * <li>dev: development environment</li>
             * <li>pre: pre-release environment</li>
             * <li>test: test environment</li>
             * <li>sit: system integration testing (SIT) environment</li>
             * <li>uat: user acceptance testing (UAT) environment</li>
             * <li>pet: stress testing environment</li>
             * <li>stag: staging environment</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>dev</p>
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * <p>Indicates whether the database is a logical database. The return value is true.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * <p>The IDs of the owners of the logical database.</p>
             */
            public Builder ownerIdList(OwnerIdList ownerIdList) {
                this.ownerIdList = ownerIdList;
                return this;
            }

            /**
             * <p>The names of the owners of the logical database.</p>
             */
            public Builder ownerNameList(OwnerNameList ownerNameList) {
                this.ownerNameList = ownerNameList;
                return this;
            }

            /**
             * <p>The name of the logical database.</p>
             * 
             * <strong>example:</strong>
             * <p>test_logic_db</p>
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * <p>The name that is used to search for the logical database.</p>
             * 
             * <strong>example:</strong>
             * <p>test_logic_db[test_logic_alias]</p>
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
