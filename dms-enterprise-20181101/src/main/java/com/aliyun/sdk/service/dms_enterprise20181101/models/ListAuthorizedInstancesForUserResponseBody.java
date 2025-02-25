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
 * {@link ListAuthorizedInstancesForUserResponseBody} extends {@link TeaModel}
 *
 * <p>ListAuthorizedInstancesForUserResponseBody</p>
 */
public class ListAuthorizedInstancesForUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instances")
    private java.util.List<Instances> instances;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAuthorizedInstancesForUserResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuthorizedInstancesForUserResponseBody create() {
        return builder().build();
    }

    /**
     * @return instances
     */
    public java.util.List<Instances> getInstances() {
        return this.instances;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Instances> instances; 
        private String requestId; 

        /**
         * Instances.
         */
        public Builder instances(java.util.List<Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAuthorizedInstancesForUserResponseBody build() {
            return new ListAuthorizedInstancesForUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAuthorizedInstancesForUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListAuthorizedInstancesForUserResponseBody</p>
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
     * {@link ListAuthorizedInstancesForUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListAuthorizedInstancesForUserResponseBody</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbType")
        private String dbType;

        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("InstanceAlias")
        private String instanceAlias;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("PermissionDetail")
        private PermissionDetail permissionDetail;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private Instances(Builder builder) {
            this.dbType = builder.dbType;
            this.envType = builder.envType;
            this.host = builder.host;
            this.instanceAlias = builder.instanceAlias;
            this.instanceId = builder.instanceId;
            this.permissionDetail = builder.permissionDetail;
            this.port = builder.port;
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
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
         * @return instanceAlias
         */
        public String getInstanceAlias() {
            return this.instanceAlias;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return permissionDetail
         */
        public PermissionDetail getPermissionDetail() {
            return this.permissionDetail;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String dbType; 
            private String envType; 
            private String host; 
            private String instanceAlias; 
            private String instanceId; 
            private PermissionDetail permissionDetail; 
            private String port; 
            private String userId; 
            private String userName; 

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
             * Host.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * InstanceAlias.
             */
            public Builder instanceAlias(String instanceAlias) {
                this.instanceAlias = instanceAlias;
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
             * PermissionDetail.
             */
            public Builder permissionDetail(PermissionDetail permissionDetail) {
                this.permissionDetail = permissionDetail;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
