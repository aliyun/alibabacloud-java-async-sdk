// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

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
 * {@link ReplaceServersInServerGroupRequest} extends {@link RequestModel}
 *
 * <p>ReplaceServersInServerGroupRequest</p>
 */
public class ReplaceServersInServerGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddedServers")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<AddedServers> addedServers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemovedServers")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<RemovedServers> removedServers;

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
    public java.util.List<AddedServers> getAddedServers() {
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
    public java.util.List<RemovedServers> getRemovedServers() {
        return this.removedServers;
    }

    /**
     * @return serverGroupId
     */
    public String getServerGroupId() {
        return this.serverGroupId;
    }

    public static final class Builder extends Request.Builder<ReplaceServersInServerGroupRequest, Builder> {
        private java.util.List<AddedServers> addedServers; 
        private String clientToken; 
        private Boolean dryRun; 
        private java.util.List<RemovedServers> removedServers; 
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
         * <p>The backend servers. You can specify at most 200 servers in each call.</p>
         * <p>This parameter is required.</p>
         */
        public Builder addedServers(java.util.List<AddedServers> addedServers) {
            this.putQueryParameter("AddedServers", addedServers);
            this.addedServers = addedServers;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>593B0448-D13E-4C56-AC0D-FDF0FDE0E9A3</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a <code>2xx</code> HTTP status code is returned and the operation is performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The backend servers that you want to remove.</p>
         * <p>This parameter is required.</p>
         */
        public Builder removedServers(java.util.List<RemovedServers> removedServers) {
            this.putQueryParameter("RemovedServers", removedServers);
            this.removedServers = removedServers;
            return this;
        }

        /**
         * <p>The ID of the server group.</p>
         * <blockquote>
         * <p>You cannot perform this operation on a server group of the Function type.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sgp-5114d593o96qxy****</p>
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

    /**
     * 
     * {@link ReplaceServersInServerGroupRequest} extends {@link TeaModel}
     *
     * <p>ReplaceServersInServerGroupRequest</p>
     */
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
             * <p>The description of the backend server. The description must be 2 to 256 characters in length, and cannot start with http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The port used by the backend server in the server group. Valid values: <strong>1</strong> to <strong>65535</strong>. You can specify at most 200 servers in each call.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ID of the backend server. You can specify at most 200 servers in each call.</p>
             * <ul>
             * <li>If the server group is of the <strong>Instance</strong> type, set ServerId to the ID of a resource of the <strong>Ecs</strong>, <strong>Eni</strong>, or <strong>Eci</strong> type.</li>
             * <li>If the server group is of the <strong>Ip</strong> type, set ServerId to IP addresses.</li>
             * </ul>
             * <blockquote>
             * <p> You cannot perform this operation on a server group of the Function Compute type. You can call the <a href="https://help.aliyun.com/document_detail/213627.html">ListServerGroups</a> operation to query the type of server groups.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp1f9kdprbgy9uiu****</p>
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * <p>The IP address of the elastic network interface (ENI) in exclusive mode.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.1</p>
             */
            public Builder serverIp(String serverIp) {
                this.serverIp = serverIp;
                return this;
            }

            /**
             * <p>The type of backend server. You can specify at most 200 servers in each call. Valid values:</p>
             * <ul>
             * <li><strong>Ecs</strong>: Elastic Compute Service (ECS) instance</li>
             * <li><strong>Eni</strong>: ENI</li>
             * <li><strong>Eci</strong>: elastic container instance</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Ecs</p>
             */
            public Builder serverType(String serverType) {
                this.serverType = serverType;
                return this;
            }

            /**
             * <p>The weight of the backend server. You can specify at most 200 servers in each call.</p>
             * <p>Valid values: <strong>0</strong> to <strong>100</strong>. Default value: <strong>100</strong>. If the value is set to <strong>0</strong>, no requests are forwarded to the server.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
    /**
     * 
     * {@link ReplaceServersInServerGroupRequest} extends {@link TeaModel}
     *
     * <p>ReplaceServersInServerGroupRequest</p>
     */
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
             * <p>The port that is used by the backend server. Valid values: <strong>1</strong> to <strong>65535</strong>. You can specify at most 200 servers in each call.</p>
             * 
             * <strong>example:</strong>
             * <p>81</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ID of the backend server. You can specify at most 200 servers in each call.</p>
             * <ul>
             * <li>If the server group is of the <strong>Instance</strong> type, set ServerId to the ID of a resource of the <strong>Ecs</strong>, <strong>Eni</strong>, or <strong>Eci</strong> type.</li>
             * <li>If the server group is of the <strong>Ip</strong> type, set ServerId to IP addresses.</li>
             * </ul>
             * <blockquote>
             * <p> You cannot perform this operation on a server group of the Function Compute type. You can call the <a href="https://help.aliyun.com/document_detail/213627.html">ListServerGroups</a> operation to query the type of server groups.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs-bp1ac9uozods2uc****</p>
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * <p>The IP address of the ENI in exclusive mode.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.12</p>
             */
            public Builder serverIp(String serverIp) {
                this.serverIp = serverIp;
                return this;
            }

            /**
             * <p>The type of backend server. You can specify at most 200 servers in each call. Valid values:</p>
             * <ul>
             * <li><strong>Ecs</strong>: ECS instance</li>
             * <li><strong>Eni</strong>: ENI</li>
             * <li><strong>Eci</strong>: elastic container instance</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
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
