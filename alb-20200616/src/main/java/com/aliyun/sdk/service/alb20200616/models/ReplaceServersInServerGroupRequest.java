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
    @com.aliyun.core.annotation.Body
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
         * <p>The list of backend servers to add. You can specify up to 200 servers in a single request.</p>
         * <p>This parameter is required.</p>
         */
        public Builder addedServers(java.util.List<AddedServers> addedServers) {
            this.putBodyParameter("AddedServers", addedServers);
            this.addedServers = addedServers;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>Generate a parameter value from your client to ensure uniqueness across different requests. ClientToken supports only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may differ for each API request.</p>
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
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs a dry run without replacing backend servers in the server group. The system checks the required parameters, request syntax, and business limitations. If the check fails, the corresponding error is returned. If the check succeeds, the error code <code>DryRunOperation</code> is returned.</li>
         * <li><strong>false</strong> (default): performs a dry run and sends the request. If the check succeeds, an <code>HTTP 2xx</code> status code is returned and the operation is performed.</li>
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
         * <p>The backend servers to remove.</p>
         * <p>This parameter is required.</p>
         */
        public Builder removedServers(java.util.List<RemovedServers> removedServers) {
            this.putQueryParameter("RemovedServers", removedServers);
            this.removedServers = removedServers;
            return this;
        }

        /**
         * <p>The server group ID.</p>
         * <blockquote>
         * <p>Server groups of the Function Compute type do not support replacing backend servers.</p>
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

            private Builder() {
            } 

            private Builder(AddedServers model) {
                this.description = model.description;
                this.port = model.port;
                this.serverId = model.serverId;
                this.serverIp = model.serverIp;
                this.serverType = model.serverType;
                this.weight = model.weight;
            } 

            /**
             * <p>The description of the backend server. The description must be 2 to 256 characters in length and cannot start with http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The port used by the backend server group. Valid values: <strong>1</strong> to <strong>65535</strong>. You can specify up to 200 servers in a single request.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The backend server ID. You can specify up to 200 servers in a single request.</p>
             * <ul>
             * <li><p>If the server group type is <strong>Instance</strong>, set this parameter to the ID of an <strong>Ecs</strong>, <strong>Eni</strong>, or <strong>Eci</strong> resource.</p>
             * </li>
             * <li><p>If the server group type is <strong>Ip</strong>, set this parameter to an IP address.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>Server groups of the Function Compute type do not support replacing backend servers. You can call <a href="https://help.aliyun.com/document_detail/213627.html">ListServerGroups</a> to query the server group type.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ecs-123</p>
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * <p>The IP address.</p>
             * <p>If <strong>ServerType</strong> is set to <strong>Eni</strong>, you can specify the primary private IP address or a secondary private IP address of the ENI.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.1</p>
             */
            public Builder serverIp(String serverIp) {
                this.serverIp = serverIp;
                return this;
            }

            /**
             * <p>The backend server type. You can specify up to 200 servers in a single call. Valid values:</p>
             * <ul>
             * <li><strong>Ecs</strong>: ECS instance.</li>
             * <li><strong>Eni</strong>: ENI network interface controller (NIC) instance.</li>
             * <li><strong>Eci</strong>: ECI elastic container.</li>
             * <li><strong>Ip</strong>: IP address.</li>
             * <li><strong>Fc</strong>: Function Compute.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder serverType(String serverType) {
                this.serverType = serverType;
                return this;
            }

            /**
             * <p>The weight of the backend server. You can specify up to 200 servers in a single request.</p>
             * <p>Valid values: <strong>0</strong> to <strong>100</strong>. Default value: <strong>100</strong>. If the weight is set to <strong>0</strong>, no requests are forwarded to the backend server.</p>
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

            private Builder() {
            } 

            private Builder(RemovedServers model) {
                this.port = model.port;
                this.serverId = model.serverId;
                this.serverIp = model.serverIp;
                this.serverType = model.serverType;
            } 

            /**
             * <p>The port used by the backend server. Valid values: <strong>1</strong> to <strong>65535</strong>. You can specify up to 200 servers in a single request.</p>
             * 
             * <strong>example:</strong>
             * <p>81</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The backend server ID. You can specify up to 200 servers in a single request.</p>
             * <ul>
             * <li><p>If the server group type is <strong>Instance</strong>, set this parameter to the ID of an <strong>Ecs</strong>, <strong>Eni</strong>, or <strong>Eci</strong> resource.</p>
             * </li>
             * <li><p>If the server group type is <strong>Ip</strong>, set this parameter to an IP address.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>Server groups of the Function Compute type do not support replacing backend servers. You can call <a href="https://help.aliyun.com/document_detail/213627.html">ListServerGroups</a> to query the server group type.</p>
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
             * <p>The IP address.</p>
             * <p>If <strong>ServerType</strong> is set to <strong>Eni</strong>, you can specify the primary private IP address or a secondary private IP address of the ENI.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.12</p>
             */
            public Builder serverIp(String serverIp) {
                this.serverIp = serverIp;
                return this;
            }

            /**
             * <p>The backend server type. You can specify up to 200 servers in a single call. Valid values:</p>
             * <ul>
             * <li><strong>Ecs</strong>: ECS instance.</li>
             * <li><strong>Eni</strong>: ENI network interface controller (NIC) instance.</li>
             * <li><strong>Eci</strong>: ECI elastic container.</li>
             * <li><strong>Ip</strong>: IP address.</li>
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
