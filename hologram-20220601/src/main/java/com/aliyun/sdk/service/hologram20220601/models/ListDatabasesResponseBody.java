// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

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
 * {@link ListDatabasesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDatabasesResponseBody</p>
 */
public class ListDatabasesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DatabaseList")
    private java.util.List<DatabaseList> databaseList;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private ListDatabasesResponseBody(Builder builder) {
        this.databaseList = builder.databaseList;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDatabasesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return databaseList
     */
    public java.util.List<DatabaseList> getDatabaseList() {
        return this.databaseList;
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
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private java.util.List<DatabaseList> databaseList; 
        private String errorCode; 
        private String errorMessage; 
        private String httpStatusCode; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(ListDatabasesResponseBody model) {
            this.databaseList = model.databaseList;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * DatabaseList.
         */
        public Builder databaseList(java.util.List<DatabaseList> databaseList) {
            this.databaseList = databaseList;
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>0C4935F5-6217-569A-902F-931B2F3E28BA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public ListDatabasesResponseBody build() {
            return new ListDatabasesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDatabasesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDatabasesResponseBody</p>
     */
    public static class DatabaseList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("External")
        private Boolean external;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PermissionModel")
        private String permissionModel;

        @com.aliyun.core.annotation.NameInMap("Privilege")
        private String privilege;

        private DatabaseList(Builder builder) {
            this.external = builder.external;
            this.name = builder.name;
            this.permissionModel = builder.permissionModel;
            this.privilege = builder.privilege;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabaseList create() {
            return builder().build();
        }

        /**
         * @return external
         */
        public Boolean getExternal() {
            return this.external;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return permissionModel
         */
        public String getPermissionModel() {
            return this.permissionModel;
        }

        /**
         * @return privilege
         */
        public String getPrivilege() {
            return this.privilege;
        }

        public static final class Builder {
            private Boolean external; 
            private String name; 
            private String permissionModel; 
            private String privilege; 

            private Builder() {
            } 

            private Builder(DatabaseList model) {
                this.external = model.external;
                this.name = model.name;
                this.permissionModel = model.permissionModel;
                this.privilege = model.privilege;
            } 

            /**
             * External.
             */
            public Builder external(Boolean external) {
                this.external = external;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PermissionModel.
             */
            public Builder permissionModel(String permissionModel) {
                this.permissionModel = permissionModel;
                return this;
            }

            /**
             * Privilege.
             */
            public Builder privilege(String privilege) {
                this.privilege = privilege;
                return this;
            }

            public DatabaseList build() {
                return new DatabaseList(this);
            } 

        } 

    }
}
