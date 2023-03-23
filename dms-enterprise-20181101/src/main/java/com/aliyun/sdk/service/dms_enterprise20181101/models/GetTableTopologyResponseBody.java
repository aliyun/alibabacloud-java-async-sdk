// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTableTopologyResponseBody} extends {@link TeaModel}
 *
 * <p>GetTableTopologyResponseBody</p>
 */
public class GetTableTopologyResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TableTopology")
    private TableTopology tableTopology;

    private GetTableTopologyResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.tableTopology = builder.tableTopology;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTableTopologyResponseBody create() {
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
     * @return tableTopology
     */
    public TableTopology getTableTopology() {
        return this.tableTopology;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private TableTopology tableTopology; 

        /**
         * The error code.
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The topology information.
         */
        public Builder tableTopology(TableTopology tableTopology) {
            this.tableTopology = tableTopology;
            return this;
        }

        public GetTableTopologyResponseBody build() {
            return new GetTableTopologyResponseBody(this);
        } 

    } 

    public static class TableTopologyInfoList extends TeaModel {
        @NameInMap("DbId")
        private Long dbId;

        @NameInMap("DbName")
        private String dbName;

        @NameInMap("DbSearchName")
        private String dbSearchName;

        @NameInMap("DbType")
        private String dbType;

        @NameInMap("InstanceId")
        private Long instanceId;

        @NameInMap("InstanceResourceId")
        private String instanceResourceId;

        @NameInMap("InstanceSource")
        private String instanceSource;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("TableCount")
        private Long tableCount;

        @NameInMap("TableNameExpr")
        private String tableNameExpr;

        @NameInMap("TableNameList")
        private String tableNameList;

        private TableTopologyInfoList(Builder builder) {
            this.dbId = builder.dbId;
            this.dbName = builder.dbName;
            this.dbSearchName = builder.dbSearchName;
            this.dbType = builder.dbType;
            this.instanceId = builder.instanceId;
            this.instanceResourceId = builder.instanceResourceId;
            this.instanceSource = builder.instanceSource;
            this.regionId = builder.regionId;
            this.tableCount = builder.tableCount;
            this.tableNameExpr = builder.tableNameExpr;
            this.tableNameList = builder.tableNameList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableTopologyInfoList create() {
            return builder().build();
        }

        /**
         * @return dbId
         */
        public Long getDbId() {
            return this.dbId;
        }

        /**
         * @return dbName
         */
        public String getDbName() {
            return this.dbName;
        }

        /**
         * @return dbSearchName
         */
        public String getDbSearchName() {
            return this.dbSearchName;
        }

        /**
         * @return dbType
         */
        public String getDbType() {
            return this.dbType;
        }

        /**
         * @return instanceId
         */
        public Long getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceResourceId
         */
        public String getInstanceResourceId() {
            return this.instanceResourceId;
        }

        /**
         * @return instanceSource
         */
        public String getInstanceSource() {
            return this.instanceSource;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return tableCount
         */
        public Long getTableCount() {
            return this.tableCount;
        }

        /**
         * @return tableNameExpr
         */
        public String getTableNameExpr() {
            return this.tableNameExpr;
        }

        /**
         * @return tableNameList
         */
        public String getTableNameList() {
            return this.tableNameList;
        }

        public static final class Builder {
            private Long dbId; 
            private String dbName; 
            private String dbSearchName; 
            private String dbType; 
            private Long instanceId; 
            private String instanceResourceId; 
            private String instanceSource; 
            private String regionId; 
            private Long tableCount; 
            private String tableNameExpr; 
            private String tableNameList; 

            /**
             * The ID of the physical database.
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * The name of the database.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * The name that is used to search for the database.
             */
            public Builder dbSearchName(String dbSearchName) {
                this.dbSearchName = dbSearchName;
                return this;
            }

            /**
             * The database engine.
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * The ID of the instance to which the physical database belongs.
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The ID of the resource related to the instance. The resource corresponds with the database instance type returned in the InstanceSource parameter.
             * <p>
             * 
             * *   **RDS**:The ID of the ApsaraDB RDS instance.
             * *   **ECS_OWN**: The ID of the Elastic Compute Service (ECS) instance.
             * *   **PUBLIC_OWN**: This parameter is left empty for self-managed database instances that are connected over the Internet.
             * *   **VPC_ID**:The ID of the virtual private cloud (VPC).
             * *   **GATEWAY**: The ID of the database gateway.
             */
            public Builder instanceResourceId(String instanceResourceId) {
                this.instanceResourceId = instanceResourceId;
                return this;
            }

            /**
             * The type of the database instance. Valid values:
             * <p>
             * 
             * *   **RDS**: an ApsaraDB RDS instance.
             * *   **ECS_OWN**: a self-managed database that is deployed on an ECS instance
             * *   **PUBLIC_OWN**: a self-managed database instance that is connected over the Internet.
             * *   **VPC_ID**: a self-managed database instance in a VPC that is connected over Express Connect circuits.
             * *   **GATEWAY**: a database instance connected by using a database gateway.
             */
            public Builder instanceSource(String instanceSource) {
                this.instanceSource = instanceSource;
                return this;
            }

            /**
             * The region ID of the instance.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The number of tables.
             */
            public Builder tableCount(Long tableCount) {
                this.tableCount = tableCount;
                return this;
            }

            /**
             * The expression of the names of logical tables.
             * <p>
             * 
             * **
             * 
             * **Description**This parameter is not returned for physical tables.
             */
            public Builder tableNameExpr(String tableNameExpr) {
                this.tableNameExpr = tableNameExpr;
                return this;
            }

            /**
             * The names of tables.
             * <p>
             * 
             * > The table names are separated by commas (,).
             */
            public Builder tableNameList(String tableNameList) {
                this.tableNameList = tableNameList;
                return this;
            }

            public TableTopologyInfoList build() {
                return new TableTopologyInfoList(this);
            } 

        } 

    }
    public static class TableTopology extends TeaModel {
        @NameInMap("Logic")
        private Boolean logic;

        @NameInMap("TableGuid")
        private String tableGuid;

        @NameInMap("TableName")
        private String tableName;

        @NameInMap("TableTopologyInfoList")
        private java.util.List < TableTopologyInfoList> tableTopologyInfoList;

        private TableTopology(Builder builder) {
            this.logic = builder.logic;
            this.tableGuid = builder.tableGuid;
            this.tableName = builder.tableName;
            this.tableTopologyInfoList = builder.tableTopologyInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableTopology create() {
            return builder().build();
        }

        /**
         * @return logic
         */
        public Boolean getLogic() {
            return this.logic;
        }

        /**
         * @return tableGuid
         */
        public String getTableGuid() {
            return this.tableGuid;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return tableTopologyInfoList
         */
        public java.util.List < TableTopologyInfoList> getTableTopologyInfoList() {
            return this.tableTopologyInfoList;
        }

        public static final class Builder {
            private Boolean logic; 
            private String tableGuid; 
            private String tableName; 
            private java.util.List < TableTopologyInfoList> tableTopologyInfoList; 

            /**
             * Indicates whether the table is a logical table. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * The GUID of the table in DMS.
             */
            public Builder tableGuid(String tableGuid) {
                this.tableGuid = tableGuid;
                return this;
            }

            /**
             * The name of the table.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * Information of the topology of the table.
             */
            public Builder tableTopologyInfoList(java.util.List < TableTopologyInfoList> tableTopologyInfoList) {
                this.tableTopologyInfoList = tableTopologyInfoList;
                return this;
            }

            public TableTopology build() {
                return new TableTopology(this);
            } 

        } 

    }
}
