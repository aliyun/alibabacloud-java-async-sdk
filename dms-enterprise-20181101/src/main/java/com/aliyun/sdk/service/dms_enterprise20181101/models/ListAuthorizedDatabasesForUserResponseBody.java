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

        /**
         * Databases.
         */
        public Builder databases(java.util.List<Databases> databases) {
            this.databases = databases;
            return this;
        }

        /**
         * RequestId.
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

            /**
             * DsType.
             */
            public Builder dsType(String dsType) {
                this.dsType = dsType;
                return this;
            }

            /**
             * ExpireDate.
             */
            public Builder expireDate(String expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * PermType.
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

            /**
             * DbId.
             */
            public Builder dbId(String dbId) {
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
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
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
             * PermissionDetail.
             */
            public Builder permissionDetail(PermissionDetail permissionDetail) {
                this.permissionDetail = permissionDetail;
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

            /**
             * UserId.
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
