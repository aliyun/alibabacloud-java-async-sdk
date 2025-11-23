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
 * {@link ListAuthorizedDatabasesForUserResponseBody} extends {@link TeaModel}
 *
 * <p>ListAuthorizedDatabasesForUserResponseBody</p>
 */
public class ListAuthorizedDatabasesForUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Databases")
    private java.util.List<Databases> databases;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAuthorizedDatabasesForUserResponseBody(Builder builder) {
        this.databases = builder.databases;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuthorizedDatabasesForUserResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return databases
     */
    public java.util.List<Databases> getDatabases() {
        return this.databases;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Databases> databases; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListAuthorizedDatabasesForUserResponseBody model) {
            this.databases = model.databases;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The names of the databases on which the user has permissions.</p>
         */
        public Builder databases(java.util.List<Databases> databases) {
            this.databases = databases;
            return this;
        }

        /**
         * <p>The request ID. You can use the ID to query logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>012AE0B5-4B52-532F-BD7C-1EE9F182089B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAuthorizedDatabasesForUserResponseBody build() {
            return new ListAuthorizedDatabasesForUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAuthorizedDatabasesForUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListAuthorizedDatabasesForUserResponseBody</p>
     */
    public static class PermissionDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DsType")
        private String dsType;

        @com.aliyun.core.annotation.NameInMap("ExpireDate")
        private String expireDate;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("PermType")
        private String permType;

        private PermissionDetail(Builder builder) {
            this.dsType = builder.dsType;
            this.expireDate = builder.expireDate;
            this.message = builder.message;
            this.permType = builder.permType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PermissionDetail create() {
            return builder().build();
        }

        /**
         * @return dsType
         */
        public String getDsType() {
            return this.dsType;
        }

        /**
         * @return expireDate
         */
        public String getExpireDate() {
            return this.expireDate;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return permType
         */
        public String getPermType() {
            return this.permType;
        }

        public static final class Builder {
            private String dsType; 
            private String expireDate; 
            private String message; 
            private String permType; 

            private Builder() {
            } 

            private Builder(PermissionDetail model) {
                this.dsType = model.dsType;
                this.expireDate = model.expireDate;
                this.message = model.message;
                this.permType = model.permType;
            } 

            /**
             * <p>The type of object on which the operation is performed.</p>
             * 
             * <strong>example:</strong>
             * <p>DATABASE</p>
             */
            public Builder dsType(String dsType) {
                this.dsType = dsType;
                return this;
            }

            /**
             * <p>The time when the permissions expire.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-12-06 10:00:00</p>
             */
            public Builder expireDate(String expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * <p>If the permission source is a permission policy, the value of this parameter includes the policy name and the operations that are allowed for the user.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The type of the permission. Valid values:</p>
             * <ul>
             * <li><strong>QUERY</strong>: the query permission</li>
             * <li><strong>EXPORT</strong>: the data export permission</li>
             * <li><strong>CORRECT</strong>: the data change permission</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CORRECT</p>
             */
            public Builder permType(String permType) {
                this.permType = permType;
                return this;
            }

            public PermissionDetail build() {
                return new PermissionDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAuthorizedDatabasesForUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListAuthorizedDatabasesForUserResponseBody</p>
     */
    public static class Databases extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbId")
        private String dbId;

        @com.aliyun.core.annotation.NameInMap("DbType")
        private String dbType;

        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Logic")
        private Boolean logic;

        @com.aliyun.core.annotation.NameInMap("PermissionDetail")
        private PermissionDetail permissionDetail;

        @com.aliyun.core.annotation.NameInMap("SchemaName")
        private String schemaName;

        @com.aliyun.core.annotation.NameInMap("SearchName")
        private String searchName;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Databases(Builder builder) {
            this.dbId = builder.dbId;
            this.dbType = builder.dbType;
            this.envType = builder.envType;
            this.instanceId = builder.instanceId;
            this.logic = builder.logic;
            this.permissionDetail = builder.permissionDetail;
            this.schemaName = builder.schemaName;
            this.searchName = builder.searchName;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Databases create() {
            return builder().build();
        }

        /**
         * @return dbId
         */
        public String getDbId() {
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
         * @return permissionDetail
         */
        public PermissionDetail getPermissionDetail() {
            return this.permissionDetail;
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
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String dbId; 
            private String dbType; 
            private String envType; 
            private String instanceId; 
            private Boolean logic; 
            private PermissionDetail permissionDetail; 
            private String schemaName; 
            private String searchName; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Databases model) {
                this.dbId = model.dbId;
                this.dbType = model.dbType;
                this.envType = model.envType;
                this.instanceId = model.instanceId;
                this.logic = model.logic;
                this.permissionDetail = model.permissionDetail;
                this.schemaName = model.schemaName;
                this.searchName = model.searchName;
                this.userId = model.userId;
            } 

            /**
             * <p>The database ID.</p>
             * 
             * <strong>example:</strong>
             * <p>254****</p>
             */
            public Builder dbId(String dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * <p>The engine of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>MYSQL</p>
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * <p>The type of the environment in which the database instance is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>product</p>
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>235****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Indicates whether the database is a logical database. Valid values:</p>
             * <ul>
             * <li><strong>true.</strong>: The database is a logical database</li>
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
             * <p>The details of permissions. The format of the permission details varies with the permission source. For example, if the permission source is a normal permission, the following parameters are returned.</p>
             */
            public Builder permissionDetail(PermissionDetail permissionDetail) {
                this.permissionDetail = permissionDetail;
                return this;
            }

            /**
             * <p>The database name.</p>
             * 
             * <strong>example:</strong>
             * <p>poc_testdb</p>
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * <p>The name that is used to search for the database.</p>
             * 
             * <strong>example:</strong>
             * <p>poc</p>
             */
            public Builder searchName(String searchName) {
                this.searchName = searchName;
                return this;
            }

            /**
             * <p>The user IDs.</p>
             * 
             * <strong>example:</strong>
             * <p>51****</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Databases build() {
                return new Databases(this);
            } 

        } 

    }
}
