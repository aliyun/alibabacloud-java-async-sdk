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
 * {@link ListUserOwnedResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserOwnedResourcesResponseBody</p>
 */
public class ListUserOwnedResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListUserOwnedResourcesResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserOwnedResourcesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListUserOwnedResourcesResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message that is returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The request ID. You can use the request ID to locate logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>8E88933E-E3D4-5BA8-8CBF-0A1CAE666690</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of entries returned. By default, this parameter is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListUserOwnedResourcesResponseBody build() {
            return new ListUserOwnedResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUserOwnedResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserOwnedResourcesResponseBody</p>
     */
    public static class ResourceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("DbId")
        private String dbId;

        @com.aliyun.core.annotation.NameInMap("DbInstanceId")
        private String dbInstanceId;

        @com.aliyun.core.annotation.NameInMap("DbType")
        private String dbType;

        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Logic")
        private Boolean logic;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Long port;

        @com.aliyun.core.annotation.NameInMap("SchemaName")
        private String schemaName;

        @com.aliyun.core.annotation.NameInMap("SearchName")
        private String searchName;

        @com.aliyun.core.annotation.NameInMap("TableId")
        private String tableId;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private ResourceList(Builder builder) {
            this.alias = builder.alias;
            this.dbId = builder.dbId;
            this.dbInstanceId = builder.dbInstanceId;
            this.dbType = builder.dbType;
            this.envType = builder.envType;
            this.host = builder.host;
            this.instanceId = builder.instanceId;
            this.logic = builder.logic;
            this.port = builder.port;
            this.schemaName = builder.schemaName;
            this.searchName = builder.searchName;
            this.tableId = builder.tableId;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceList create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return dbId
         */
        public String getDbId() {
            return this.dbId;
        }

        /**
         * @return dbInstanceId
         */
        public String getDbInstanceId() {
            return this.dbInstanceId;
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
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return logic
         */
        public Boolean getLogic() {
            return this.logic;
        }

        /**
         * @return port
         */
        public Long getPort() {
            return this.port;
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
         * @return tableId
         */
        public String getTableId() {
            return this.tableId;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private String alias; 
            private String dbId; 
            private String dbInstanceId; 
            private String dbType; 
            private String envType; 
            private String host; 
            private String instanceId; 
            private Boolean logic; 
            private Long port; 
            private String schemaName; 
            private String searchName; 
            private String tableId; 
            private String tableName; 

            private Builder() {
            } 

            private Builder(ResourceList model) {
                this.alias = model.alias;
                this.dbId = model.dbId;
                this.dbInstanceId = model.dbInstanceId;
                this.dbType = model.dbType;
                this.envType = model.envType;
                this.host = model.host;
                this.instanceId = model.instanceId;
                this.logic = model.logic;
                this.port = model.port;
                this.schemaName = model.schemaName;
                this.searchName = model.searchName;
                this.tableId = model.tableId;
                this.tableName = model.tableName;
            } 

            /**
             * <p>The alias of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>DMS_GYX_TESTupdata</p>
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * <p>The ID of the database in DMS.</p>
             * 
             * <strong>example:</strong>
             * <p>29697059</p>
             */
            public Builder dbId(String dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * <p>The ID of the instance to which the database belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>876XXX</p>
             */
            public Builder dbInstanceId(String dbInstanceId) {
                this.dbInstanceId = dbInstanceId;
                return this;
            }

            /**
             * <p>The database engine type. For more information about the valid values of the DbType parameter, see <a href="https://help.aliyun.com/document_detail/198106.html">DbType parameter</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * <p>The type of the environment to which the database instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>product</p>
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * <p>The endpoint of the instance to which the database belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-wz98bw60x1i1303c5.mysql.rds.aliyuncs.com</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>291594</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Indicates whether the database is a logical database. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The database is a logical database</li>
             * <li><strong>false</strong>: The database is a physical database.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * <p>The connection port of the instance to which the database belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>6379</p>
             */
            public Builder port(Long port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>as_task_engine</p>
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * <p>The query name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstest [dtstest_dms]</p>
             */
            public Builder searchName(String searchName) {
                this.searchName = searchName;
                return this;
            }

            /**
             * <p>The table ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1760934555</p>
             */
            public Builder tableId(String tableId) {
                this.tableId = tableId;
                return this;
            }

            /**
             * <p>The table name.</p>
             * 
             * <strong>example:</strong>
             * <p>addepmap</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public ResourceList build() {
                return new ResourceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListUserOwnedResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserOwnedResourcesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("resourceList")
        private java.util.List<ResourceList> resourceList;

        private Data(Builder builder) {
            this.resourceList = builder.resourceList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return resourceList
         */
        public java.util.List<ResourceList> getResourceList() {
            return this.resourceList;
        }

        public static final class Builder {
            private java.util.List<ResourceList> resourceList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.resourceList = model.resourceList;
            } 

            /**
             * resourceList.
             */
            public Builder resourceList(java.util.List<ResourceList> resourceList) {
                this.resourceList = resourceList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
