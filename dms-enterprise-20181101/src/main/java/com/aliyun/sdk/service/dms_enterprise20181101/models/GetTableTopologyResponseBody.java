// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetTableTopologyResponseBody} extends {@link TeaModel}
 *
 * <p>GetTableTopologyResponseBody</p>
 */
public class GetTableTopologyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TableTopology")
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
         * <p>The error code.</p>
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F5ED6A40-F344-4C7D-A8F0-5685CA584CA7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The topology information.</p>
         */
        public Builder tableTopology(TableTopology tableTopology) {
            this.tableTopology = tableTopology;
            return this;
        }

        public GetTableTopologyResponseBody build() {
            return new GetTableTopologyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTableTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>GetTableTopologyResponseBody</p>
     */
    public static class TableTopologyInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbId")
        private Long dbId;

        @com.aliyun.core.annotation.NameInMap("DbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("DbSearchName")
        private String dbSearchName;

        @com.aliyun.core.annotation.NameInMap("DbType")
        private String dbType;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private Long instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceResourceId")
        private String instanceResourceId;

        @com.aliyun.core.annotation.NameInMap("InstanceSource")
        private String instanceSource;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("TableCount")
        private Long tableCount;

        @com.aliyun.core.annotation.NameInMap("TableNameExpr")
        private String tableNameExpr;

        @com.aliyun.core.annotation.NameInMap("TableNameList")
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
             * <p>The ID of the physical database.</p>
             * 
             * <strong>example:</strong>
             * <p>43215</p>
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>yuyang_test</p>
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * <p>The name that is used to search for the database.</p>
             * <blockquote>
             * <p>We recommend that you do not use this parameter for business development. The format of the parameter value may be modified in later versions.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>yuyang_test@localhost:3306
             * [yuyang_test_dev]</p>
             */
            public Builder dbSearchName(String dbSearchName) {
                this.dbSearchName = dbSearchName;
                return this;
            }

            /**
             * <p>The database engine.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql</p>
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * <p>The ID of the instance to which the physical database belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>4325325</p>
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The ID of the resource related to the instance. The resource corresponds with the database instance type returned in the InstanceSource parameter.</p>
             * <ul>
             * <li><strong>RDS</strong>:The ID of the ApsaraDB RDS instance.</li>
             * <li><strong>ECS_OWN</strong>: The ID of the Elastic Compute Service (ECS) instance.</li>
             * <li><strong>PUBLIC_OWN</strong>: This parameter is left empty for self-managed database instances that are connected over the Internet.</li>
             * <li><strong>VPC_ID</strong>:The ID of the virtual private cloud (VPC).</li>
             * <li><strong>GATEWAY</strong>: The ID of the database gateway.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>rm-xxx</p>
             */
            public Builder instanceResourceId(String instanceResourceId) {
                this.instanceResourceId = instanceResourceId;
                return this;
            }

            /**
             * <p>The type of the database instance. Valid values:</p>
             * <ul>
             * <li><strong>RDS</strong>: an ApsaraDB RDS instance.</li>
             * <li><strong>ECS_OWN</strong>: a self-managed database that is deployed on an ECS instance</li>
             * <li><strong>PUBLIC_OWN</strong>: a self-managed database instance that is connected over the Internet.</li>
             * <li><strong>VPC_ID</strong>: a self-managed database instance in a VPC that is connected over Express Connect circuits.</li>
             * <li><strong>GATEWAY</strong>: a database instance connected by using a database gateway.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder instanceSource(String instanceSource) {
                this.instanceSource = instanceSource;
                return this;
            }

            /**
             * <p>The region ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The number of tables.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder tableCount(Long tableCount) {
                this.tableCount = tableCount;
                return this;
            }

            /**
             * <p>The expression of the names of logical tables.</p>
             * <p>**</p>
             * <p><strong>Description</strong> This parameter is not returned for physical tables.</p>
             * 
             * <strong>example:</strong>
             * <p>test_ch_[0000-0005]</p>
             */
            public Builder tableNameExpr(String tableNameExpr) {
                this.tableNameExpr = tableNameExpr;
                return this;
            }

            /**
             * <p>The names of tables.</p>
             * <blockquote>
             * <p>The table names are separated by commas (,).</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>test_ch_0000,test_ch_0001,test_ch_0002,test_ch_0003,test_ch_0004,test_ch_0005</p>
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
    /**
     * 
     * {@link GetTableTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>GetTableTopologyResponseBody</p>
     */
    public static class TableTopology extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Logic")
        private Boolean logic;

        @com.aliyun.core.annotation.NameInMap("TableGuid")
        private String tableGuid;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("TableTopologyInfoList")
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
             * <p>Indicates whether the table is a logical table. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * <p>The GUID of the table in DMS.</p>
             * 
             * <strong>example:</strong>
             * <p>IDB_L_308302.yuyang_test.test_ch</p>
             */
            public Builder tableGuid(String tableGuid) {
                this.tableGuid = tableGuid;
                return this;
            }

            /**
             * <p>The name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>test_ch</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * <p>Information of the topology of the table.</p>
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
