// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_dg20230914.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDatabaseResponseBody} extends {@link TeaModel}
 *
 * <p>AddDatabaseResponseBody</p>
 */
public class AddDatabaseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DbInstance")
    private DbInstance dbInstance;

    @com.aliyun.core.annotation.NameInMap("ErrorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private AddDatabaseResponseBody(Builder builder) {
        this.code = builder.code;
        this.dbInstance = builder.dbInstance;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDatabaseResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return dbInstance
     */
    public DbInstance getDbInstance() {
        return this.dbInstance;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
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
        private String code; 
        private DbInstance dbInstance; 
        private String errorMsg; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * DbInstance.
         */
        public Builder dbInstance(DbInstance dbInstance) {
            this.dbInstance = dbInstance;
            return this;
        }

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
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

        public AddDatabaseResponseBody build() {
            return new AddDatabaseResponseBody(this);
        } 

    } 

    public static class DbInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectHost")
        private String connectHost;

        @com.aliyun.core.annotation.NameInMap("ConnectPort")
        private Integer connectPort;

        @com.aliyun.core.annotation.NameInMap("DbDescription")
        private String dbDescription;

        @com.aliyun.core.annotation.NameInMap("DbType")
        private String dbType;

        @com.aliyun.core.annotation.NameInMap("GatewayId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String gatewayId;

        @com.aliyun.core.annotation.NameInMap("GatewayName")
        private String gatewayName;

        @com.aliyun.core.annotation.NameInMap("Host")
        @com.aliyun.core.annotation.Validation(required = true)
        private String host;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceStatus")
        private String instanceStatus;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private String parentId;

        @com.aliyun.core.annotation.NameInMap("Port")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ServiceType")
        private String serviceType;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcInstanceId")
        private String vpcInstanceId;

        private DbInstance(Builder builder) {
            this.connectHost = builder.connectHost;
            this.connectPort = builder.connectPort;
            this.dbDescription = builder.dbDescription;
            this.dbType = builder.dbType;
            this.gatewayId = builder.gatewayId;
            this.gatewayName = builder.gatewayName;
            this.host = builder.host;
            this.instanceId = builder.instanceId;
            this.instanceStatus = builder.instanceStatus;
            this.networkType = builder.networkType;
            this.nodeId = builder.nodeId;
            this.parentId = builder.parentId;
            this.port = builder.port;
            this.regionId = builder.regionId;
            this.serviceType = builder.serviceType;
            this.userId = builder.userId;
            this.vpcId = builder.vpcId;
            this.vpcInstanceId = builder.vpcInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DbInstance create() {
            return builder().build();
        }

        /**
         * @return connectHost
         */
        public String getConnectHost() {
            return this.connectHost;
        }

        /**
         * @return connectPort
         */
        public Integer getConnectPort() {
            return this.connectPort;
        }

        /**
         * @return dbDescription
         */
        public String getDbDescription() {
            return this.dbDescription;
        }

        /**
         * @return dbType
         */
        public String getDbType() {
            return this.dbType;
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return gatewayName
         */
        public String getGatewayName() {
            return this.gatewayName;
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
         * @return instanceStatus
         */
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return parentId
         */
        public String getParentId() {
            return this.parentId;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return serviceType
         */
        public String getServiceType() {
            return this.serviceType;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcInstanceId
         */
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

        public static final class Builder {
            private String connectHost; 
            private Integer connectPort; 
            private String dbDescription; 
            private String dbType; 
            private String gatewayId; 
            private String gatewayName; 
            private String host; 
            private String instanceId; 
            private String instanceStatus; 
            private String networkType; 
            private String nodeId; 
            private String parentId; 
            private Integer port; 
            private String regionId; 
            private String serviceType; 
            private String userId; 
            private String vpcId; 
            private String vpcInstanceId; 

            /**
             * 连接使用的主机
             */
            public Builder connectHost(String connectHost) {
                this.connectHost = connectHost;
                return this;
            }

            /**
             * ConnectPort.
             */
            public Builder connectPort(Integer connectPort) {
                this.connectPort = connectPort;
                return this;
            }

            /**
             * 备注信息
             */
            public Builder dbDescription(String dbDescription) {
                this.dbDescription = dbDescription;
                return this;
            }

            /**
             * 数据库类型。
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * 数据库所在网关ID。
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * 网关名称
             */
            public Builder gatewayName(String gatewayName) {
                this.gatewayName = gatewayName;
                return this;
            }

            /**
             * 通过网关所在宿主机去访问数据库的地址。
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * 数据库实例ID
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * 当前实例的状态
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * 网络类型
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * 节点的ID
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * 归属主账号ID
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * 通过网关所在宿主机去访问数据库的端口。
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * 所在的地域编号
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * 服务类型
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * 用户ID
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * VpcId
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * VpcInstanceId
             */
            public Builder vpcInstanceId(String vpcInstanceId) {
                this.vpcInstanceId = vpcInstanceId;
                return this;
            }

            public DbInstance build() {
                return new DbInstance(this);
            } 

        } 

    }
}
