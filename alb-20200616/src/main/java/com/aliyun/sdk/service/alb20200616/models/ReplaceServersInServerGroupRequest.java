// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReplaceServersInServerGroupRequest} extends {@link RequestModel}
 *
 * <p>ReplaceServersInServerGroupRequest</p>
 */
public class ReplaceServersInServerGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddedServers")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < AddedServers> addedServers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemovedServers")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < RemovedServers> removedServers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serverGroupId;

    private ReplaceServersInServerGroupRequest(Builder builder) {
        super(builder);
        this.addedServers = builder.addedServers;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.removedServers = builder.removedServers;
        this.serverGroupId = builder.serverGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReplaceServersInServerGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addedServers
     */
    public java.util.List < AddedServers> getAddedServers() {
        return this.addedServers;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return removedServers
     */
    public java.util.List < RemovedServers> getRemovedServers() {
        return this.removedServers;
    }

    /**
     * @return serverGroupId
     */
    public String getServerGroupId() {
        return this.serverGroupId;
    }

    public static final class Builder extends Request.Builder<ReplaceServersInServerGroupRequest, Builder> {
        private java.util.List < AddedServers> addedServers; 
        private String clientToken; 
        private Boolean dryRun; 
        private java.util.List < RemovedServers> removedServers; 
        private String serverGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ReplaceServersInServerGroupRequest request) {
            super(request);
            this.addedServers = request.addedServers;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.removedServers = request.removedServers;
            this.serverGroupId = request.serverGroupId;
        } 

        /**
         * The backend servers that you want to add to the server group. You can specify up to 40 backend servers in each call.
         */
        public Builder addedServers(java.util.List < AddedServers> addedServers) {
            this.putQueryParameter("AddedServers", addedServers);
            this.addedServers = addedServers;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.
         * 
         * > If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to perform only a dry run, without performing the actual request. Valid values:
         * <p>
         * 
         * *   **true**: performs a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.
         * *   **false** (default): performs a dry run and performs the actual request. If the request passes the dry run, a `2xx` HTTP status code is returned and the operation is performed.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The backend servers that you want to remove.
         */
        public Builder removedServers(java.util.List < RemovedServers> removedServers) {
            this.putQueryParameter("RemovedServers", removedServers);
            this.removedServers = removedServers;
            return this;
        }

        /**
         * The ID of the server group.
         * <p>
         * 
         * > You cannot perform this operation on a server group of the Function type.
         */
        public Builder serverGroupId(String serverGroupId) {
            this.putQueryParameter("ServerGroupId", serverGroupId);
            this.serverGroupId = serverGroupId;
            return this;
        }

        @Override
        public ReplaceServersInServerGroupRequest build() {
            return new ReplaceServersInServerGroupRequest(this);
        } 

    } 

    public static class AddedServers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("ServerId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String serverId;

        @com.aliyun.core.annotation.NameInMap("ServerIp")
        private String serverIp;

        @com.aliyun.core.annotation.NameInMap("ServerType")
        private String serverType;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        private AddedServers(Builder builder) {
            this.description = builder.description;
            this.port = builder.port;
            this.serverId = builder.serverId;
            this.serverIp = builder.serverIp;
            this.serverType = builder.serverType;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddedServers create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return serverId
         */
        public String getServerId() {
            return this.serverId;
        }

        /**
         * @return serverIp
         */
        public String getServerIp() {
            return this.serverIp;
        }

        /**
         * @return serverType
         */
        public String getServerType() {
            return this.serverType;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String description; 
            private Integer port; 
            private String serverId; 
            private String serverIp; 
            private String serverType; 
            private Integer weight; 

            /**
             * The description of the backend server. The description must be 2 to 256 characters in length, and can contain letters, digits, periods (.), underscores (\_), hyphens (-), commas (,), semicolons (;), forward slashes (/), and at signs (@). You can specify at most 40 servers in each call.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The port used by the server group. Valid values: **1** to **65535**. You can specify at most 40 servers in each call.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The ID of the backend server. You can specify up to 40 server IDs in each call.
             * <p>
             * 
             * *   If the server group type is **Instance**, set the ServerId parameter to the ID of an ECS instance, an ENI, or an elastic container instance. These backend servers are specified by **Ecs**, **Eni**, or **Eci**.
             * *   If the server group type is **Ip**, set the ServerId parameter to an IP address specified in the server group.
             * 
             * > You cannot perform this operation on a server group of the Function type. You can call the [ListServerGroups](~~213627~~) operation to query information about the server group type so that you can set ServerId to a proper value.
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * The IP address in inclusive ENI mode. You can specify at most 40 servers in each call.
             */
            public Builder serverIp(String serverIp) {
                this.serverIp = serverIp;
                return this;
            }

            /**
             * The type of the backend server that you want to remove from the server group. You can specify up to 40 backend servers in each call. Valid values:
             * <p>
             * 
             * *   **Ecs**
             * *   **Eni**
             * *   **Eci**
             */
            public Builder serverType(String serverType) {
                this.serverType = serverType;
                return this;
            }

            /**
             * The weight of the backend server that you want to add to the server group. You can specify up to 40 backend servers in each call.
             * <p>
             * 
             * Valid values: **0** to **100**. Default value: **100**. If the weight of a backend server is set to **0**, no requests are forwarded to the backend server.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public AddedServers build() {
                return new AddedServers(this);
            } 

        } 

    }
    public static class RemovedServers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("ServerId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String serverId;

        @com.aliyun.core.annotation.NameInMap("ServerIp")
        private String serverIp;

        @com.aliyun.core.annotation.NameInMap("ServerType")
        private String serverType;

        private RemovedServers(Builder builder) {
            this.port = builder.port;
            this.serverId = builder.serverId;
            this.serverIp = builder.serverIp;
            this.serverType = builder.serverType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemovedServers create() {
            return builder().build();
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return serverId
         */
        public String getServerId() {
            return this.serverId;
        }

        /**
         * @return serverIp
         */
        public String getServerIp() {
            return this.serverIp;
        }

        /**
         * @return serverType
         */
        public String getServerType() {
            return this.serverType;
        }

        public static final class Builder {
            private Integer port; 
            private String serverId; 
            private String serverIp; 
            private String serverType; 

            /**
             * The port that is used by the backend server. Valid values: **1** to **65535**. You can specify at most 40 servers in each call.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The ID of the backend server. You can specify up to 40 server IDs in each call.
             * <p>
             * 
             * *   If the server group type is **Instance**, set the ServerId parameter to the ID of an ECS instance, an ENI, or an elastic container instance. These backend servers are specified by **Ecs**, **Eni**, or **Eci**.
             * *   If the server group type is **Ip**, set the ServerId parameter to an IP address specified in the server group.
             * 
             * > You cannot perform this operation on a server group of the Function type. You can call the [ListServerGroups](~~213627~~) operation to query information about the server group type so that you can set ServerId to a proper value.
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * The IP address in inclusive ENI mode. You can specify at most 40 servers in each call.
             */
            public Builder serverIp(String serverIp) {
                this.serverIp = serverIp;
                return this;
            }

            /**
             * The type of the backend server that you want to remove from the server group. You can specify up to 40 backend servers in each call. Valid values:
             * <p>
             * 
             * *   **Ecs**
             * *   **Eni**
             * *   **Eci**
             */
            public Builder serverType(String serverType) {
                this.serverType = serverType;
                return this;
            }

            public RemovedServers build() {
                return new RemovedServers(this);
            } 

        } 

    }
}
