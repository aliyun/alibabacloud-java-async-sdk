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
 * {@link GetDBTopologyResponseBody} extends {@link TeaModel}
 *
 * <p>GetDBTopologyResponseBody</p>
 */
public class GetDBTopologyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBTopology")
    private DBTopology DBTopology;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetDBTopologyResponseBody(Builder builder) {
        this.DBTopology = builder.DBTopology;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDBTopologyResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBTopology
     */
    public DBTopology getDBTopology() {
        return this.DBTopology;
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
        private DBTopology DBTopology; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The topology of the data table.</p>
         */
        public Builder DBTopology(DBTopology DBTopology) {
            this.DBTopology = DBTopology;
            return this;
        }

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
         * <p>The error message returned if the request failed.</p>
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
         * <p>C5B8E84B-42B6-4374-AD5A-6264E1753378</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request is successful.</li>
         * <li><strong>false</strong>: The request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDBTopologyResponseBody build() {
            return new GetDBTopologyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDBTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>GetDBTopologyResponseBody</p>
     */
    public static class DBTopologyInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CatalogName")
        private String catalogName;

        @com.aliyun.core.annotation.NameInMap("DbId")
        private Long dbId;

        @com.aliyun.core.annotation.NameInMap("DbType")
        private String dbType;

        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private Long instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceResourceId")
        private String instanceResourceId;

        @com.aliyun.core.annotation.NameInMap("InstanceSource")
        private String instanceSource;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SchemaName")
        private String schemaName;

        @com.aliyun.core.annotation.NameInMap("SearchName")
        private String searchName;

        private DBTopologyInfoList(Builder builder) {
            this.catalogName = builder.catalogName;
            this.dbId = builder.dbId;
            this.dbType = builder.dbType;
            this.envType = builder.envType;
            this.instanceId = builder.instanceId;
            this.instanceResourceId = builder.instanceResourceId;
            this.instanceSource = builder.instanceSource;
            this.regionId = builder.regionId;
            this.schemaName = builder.schemaName;
            this.searchName = builder.searchName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBTopologyInfoList create() {
            return builder().build();
        }

        /**
         * @return catalogName
         */
        public String getCatalogName() {
            return this.catalogName;
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
            private String catalogName; 
            private Long dbId; 
            private String dbType; 
            private String envType; 
            private Long instanceId; 
            private String instanceResourceId; 
            private String instanceSource; 
            private String regionId; 
            private String schemaName; 
            private String searchName; 

            /**
             * <p>The name of the catalog to which the database belongs.</p>
             * <blockquote>
             * <p>If the database is a PostgreSQL database, the value of this parameter is the name of the database.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>def</p>
             */
            public Builder catalogName(String catalogName) {
                this.catalogName = catalogName;
                return this;
            }

            /**
             * <p>The ID of the database for which the schema design is executed.</p>
             * 
             * <strong>example:</strong>
             * <p>423532</p>
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * <p>The type of the database engine.</p>
             * 
             * <strong>example:</strong>
             * <p>polardb</p>
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
             * <li>pre: staging environment</li>
             * <li>test: test environment</li>
             * <li>sit: SIT environment</li>
             * <li>uat: user acceptance testing (UAT) environment</li>
             * <li>pet: stress testing environment</li>
             * <li>stag: STAG environment</li>
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
             * <p>The ID of the instance. The valid value is returned if you call the ListInstances operation. The instance ID is not the ID of the RDS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>4325325</p>
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Instance resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-xxx</p>
             */
            public Builder instanceResourceId(String instanceResourceId) {
                this.instanceResourceId = instanceResourceId;
                return this;
            }

            /**
             * <p>The source of the database instance. Valid values:</p>
             * <ul>
             * <li><strong>PUBLIC_OWN:</strong> a self-managed database instance that is deployed on the Internet</li>
             * <li><strong>RDS:</strong> an ApsaraDB RDS instance</li>
             * <li><strong>ECS_OWN:</strong> a self-managed database that is deployed on an Elastic Compute Service (ECS) instance</li>
             * <li><strong>VPC_IDC:</strong> a self-managed database instance that is deployed in a data center connected over a virtual private cloud (VPC)</li>
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
             * <p>The ID of the region in which the instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The name of the logical database.</p>
             * <blockquote>
             * <p>If the database is a PostgreSQL database, the value of this parameter is the name of the database schema.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>db_test@rm-xxx:3306</p>
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * <p>The name of the saved search.</p>
             * 
             * <strong>example:</strong>
             * <p>db_test</p>
             */
            public Builder searchName(String searchName) {
                this.searchName = searchName;
                return this;
            }

            public DBTopologyInfoList build() {
                return new DBTopologyInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDBTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>GetDBTopologyResponseBody</p>
     */
    public static class DBTopology extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("DBTopologyInfoList")
        private java.util.List<DBTopologyInfoList> DBTopologyInfoList;

        @com.aliyun.core.annotation.NameInMap("DbType")
        private String dbType;

        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("LogicDbId")
        private Long logicDbId;

        @com.aliyun.core.annotation.NameInMap("LogicDbName")
        private String logicDbName;

        @com.aliyun.core.annotation.NameInMap("SearchName")
        private String searchName;

        private DBTopology(Builder builder) {
            this.alias = builder.alias;
            this.DBTopologyInfoList = builder.DBTopologyInfoList;
            this.dbType = builder.dbType;
            this.envType = builder.envType;
            this.logicDbId = builder.logicDbId;
            this.logicDbName = builder.logicDbName;
            this.searchName = builder.searchName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBTopology create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return DBTopologyInfoList
         */
        public java.util.List<DBTopologyInfoList> getDBTopologyInfoList() {
            return this.DBTopologyInfoList;
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
         * @return logicDbId
         */
        public Long getLogicDbId() {
            return this.logicDbId;
        }

        /**
         * @return logicDbName
         */
        public String getLogicDbName() {
            return this.logicDbName;
        }

        /**
         * @return searchName
         */
        public String getSearchName() {
            return this.searchName;
        }

        public static final class Builder {
            private String alias; 
            private java.util.List<DBTopologyInfoList> DBTopologyInfoList; 
            private String dbType; 
            private String envType; 
            private Long logicDbId; 
            private String logicDbName; 
            private String searchName; 

            /**
             * <p>The alias of the access point.</p>
             * 
             * <strong>example:</strong>
             * <p>logic_db_test</p>
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * <p>The list of database splitting topology information.</p>
             */
            public Builder DBTopologyInfoList(java.util.List<DBTopologyInfoList> DBTopologyInfoList) {
                this.DBTopologyInfoList = DBTopologyInfoList;
                return this;
            }

            /**
             * <p>The type of the database engine.</p>
             * 
             * <strong>example:</strong>
             * <p>polardb</p>
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * <p>The type of the environment in which the database instance is deployed. Valid values:</p>
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
             * <p>The ID of the logical database.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder logicDbId(Long logicDbId) {
                this.logicDbId = logicDbId;
                return this;
            }

            /**
             * <p>Logical database name.</p>
             * 
             * <strong>example:</strong>
             * <p>logic_db_test</p>
             */
            public Builder logicDbName(String logicDbName) {
                this.logicDbName = logicDbName;
                return this;
            }

            /**
             * <p>The name of the saved search.</p>
             * 
             * <strong>example:</strong>
             * <p>logic_db_test</p>
             */
            public Builder searchName(String searchName) {
                this.searchName = searchName;
                return this;
            }

            public DBTopology build() {
                return new DBTopology(this);
            } 

        } 

    }
}
