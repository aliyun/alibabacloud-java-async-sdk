// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDBTopologyResponseBody} extends {@link TeaModel}
 *
 * <p>GetDBTopologyResponseBody</p>
 */
public class GetDBTopologyResponseBody extends TeaModel {
    @NameInMap("DBTopology")
    private DBTopology DBTopology;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * DBTopology.
         */
        public Builder DBTopology(DBTopology DBTopology) {
            this.DBTopology = DBTopology;
            return this;
        }

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
         * Id of the request
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

        public GetDBTopologyResponseBody build() {
            return new GetDBTopologyResponseBody(this);
        } 

    } 

    public static class DBTopologyInfoList extends TeaModel {
        @NameInMap("CatalogName")
        private String catalogName;

        @NameInMap("DbId")
        private Long dbId;

        @NameInMap("DbType")
        private String dbType;

        @NameInMap("EnvType")
        private String envType;

        @NameInMap("InstanceId")
        private Long instanceId;

        @NameInMap("InstanceResourceId")
        private String instanceResourceId;

        @NameInMap("InstanceSource")
        private String instanceSource;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SchemaName")
        private String schemaName;

        @NameInMap("SearchName")
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
             * CatalogName.
             */
            public Builder catalogName(String catalogName) {
                this.catalogName = catalogName;
                return this;
            }

            /**
             * DbId.
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
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
             * InstanceId.
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceResourceId.
             */
            public Builder instanceResourceId(String instanceResourceId) {
                this.instanceResourceId = instanceResourceId;
                return this;
            }

            /**
             * InstanceSource.
             */
            public Builder instanceSource(String instanceSource) {
                this.instanceSource = instanceSource;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
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

            public DBTopologyInfoList build() {
                return new DBTopologyInfoList(this);
            } 

        } 

    }
    public static class DBTopology extends TeaModel {
        @NameInMap("Alias")
        private String alias;

        @NameInMap("DBTopologyInfoList")
        private java.util.List < DBTopologyInfoList> DBTopologyInfoList;

        @NameInMap("DbType")
        private String dbType;

        @NameInMap("EnvType")
        private String envType;

        @NameInMap("LogicDbId")
        private Long logicDbId;

        @NameInMap("LogicDbName")
        private String logicDbName;

        @NameInMap("SearchName")
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
        public java.util.List < DBTopologyInfoList> getDBTopologyInfoList() {
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
            private java.util.List < DBTopologyInfoList> DBTopologyInfoList; 
            private String dbType; 
            private String envType; 
            private Long logicDbId; 
            private String logicDbName; 
            private String searchName; 

            /**
             * Alias.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * DBTopologyInfoList.
             */
            public Builder DBTopologyInfoList(java.util.List < DBTopologyInfoList> DBTopologyInfoList) {
                this.DBTopologyInfoList = DBTopologyInfoList;
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
             * LogicDbId.
             */
            public Builder logicDbId(Long logicDbId) {
                this.logicDbId = logicDbId;
                return this;
            }

            /**
             * LogicDbName.
             */
            public Builder logicDbName(String logicDbName) {
                this.logicDbName = logicDbName;
                return this;
            }

            /**
             * SearchName.
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
