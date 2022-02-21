// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLogicDatabasesResponseBody} extends {@link TeaModel}
 *
 * <p>ListLogicDatabasesResponseBody</p>
 */
public class ListLogicDatabasesResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("LogicDatabaseList")
    private LogicDatabaseList logicDatabaseList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListLogicDatabasesResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.logicDatabaseList = builder.logicDatabaseList;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLogicDatabasesResponseBody create() {
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
     * @return logicDatabaseList
     */
    public LogicDatabaseList getLogicDatabaseList() {
        return this.logicDatabaseList;
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
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private LogicDatabaseList logicDatabaseList; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

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
         * LogicDatabaseList.
         */
        public Builder logicDatabaseList(LogicDatabaseList logicDatabaseList) {
            this.logicDatabaseList = logicDatabaseList;
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

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListLogicDatabasesResponseBody build() {
            return new ListLogicDatabasesResponseBody(this);
        } 

    } 

    public static class OwnerIdList extends TeaModel {
        @NameInMap("OwnerIds")
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
        @NameInMap("OwnerNames")
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
        @NameInMap("Alias")
        private String alias;

        @NameInMap("DatabaseId")
        private String databaseId;

        @NameInMap("DbType")
        private String dbType;

        @NameInMap("EnvType")
        private String envType;

        @NameInMap("Logic")
        private Boolean logic;

        @NameInMap("OwnerIdList")
        private OwnerIdList ownerIdList;

        @NameInMap("OwnerNameList")
        private OwnerNameList ownerNameList;

        @NameInMap("SchemaName")
        private String schemaName;

        @NameInMap("SearchName")
        private String searchName;

        private LogicDatabase(Builder builder) {
            this.alias = builder.alias;
            this.databaseId = builder.databaseId;
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
            private String dbType; 
            private String envType; 
            private Boolean logic; 
            private OwnerIdList ownerIdList; 
            private OwnerNameList ownerNameList; 
            private String schemaName; 
            private String searchName; 

            /**
             * Alias.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * DatabaseId.
             */
            public Builder databaseId(String databaseId) {
                this.databaseId = databaseId;
                return this;
            }

            /**
             * DbType.
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * EnvType.
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * Logic.
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * OwnerIdList.
             */
            public Builder ownerIdList(OwnerIdList ownerIdList) {
                this.ownerIdList = ownerIdList;
                return this;
            }

            /**
             * OwnerNameList.
             */
            public Builder ownerNameList(OwnerNameList ownerNameList) {
                this.ownerNameList = ownerNameList;
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
             * SearchName.
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
    public static class LogicDatabaseList extends TeaModel {
        @NameInMap("LogicDatabase")
        private java.util.List < LogicDatabase> logicDatabase;

        private LogicDatabaseList(Builder builder) {
            this.logicDatabase = builder.logicDatabase;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogicDatabaseList create() {
            return builder().build();
        }

        /**
         * @return logicDatabase
         */
        public java.util.List < LogicDatabase> getLogicDatabase() {
            return this.logicDatabase;
        }

        public static final class Builder {
            private java.util.List < LogicDatabase> logicDatabase; 

            /**
             * LogicDatabase.
             */
            public Builder logicDatabase(java.util.List < LogicDatabase> logicDatabase) {
                this.logicDatabase = logicDatabase;
                return this;
            }

            public LogicDatabaseList build() {
                return new LogicDatabaseList(this);
            } 

        } 

    }
}
