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
 * {@link AddServersToServerGroupRequest} extends {@link RequestModel}
 *
 * <p>AddServersToServerGroupRequest</p>
 */
public class AddServersToServerGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serverGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Servers")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Servers> servers;

    private AddServersToServerGroupRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.serverGroupId = builder.serverGroupId;
        this.servers = builder.servers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddServersToServerGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return serverGroupId
     */
    public String getServerGroupId() {
        return this.serverGroupId;
    }

    /**
     * @return servers
     */
    public java.util.List<Servers> getServers() {
        return this.servers;
    }

    public static final class Builder extends Request.Builder<AddServersToServerGroupRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String serverGroupId; 
        private java.util.List<Servers> servers; 

        private Builder() {
            super();
        } 

        private Builder(AddServersToServerGroupRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.serverGroupId = request.serverGroupId;
            this.servers = request.servers;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is unique.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>593B0448-D13E-4C56-AC0D-FDF0******</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to only precheck the request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: sends a check request and does not add the backend servers to the server group. The system checks whether the required parameters are specified, the request format, and the service limits. If the request fails the check, the corresponding error is returned. If the request passes the check, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): sends a normal request. After the request passes the check, an HTTP 2xx status code is returned and the operation is performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The ID of the server group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sgp-atstuj3rtop****</p>
         */
        public Builder serverGroupId(String serverGroupId) {
            this.putQueryParameter("ServerGroupId", serverGroupId);
            this.serverGroupId = serverGroupId;
            return this;
        }

        /**
         * <p>The list of backend servers. You can add up to 200 servers in a single call.</p>
         * <p>This parameter is required.</p>
         */
        public Builder servers(java.util.List<Servers> servers) {
            this.putBodyParameter("Servers", servers);
            this.servers = servers;
            return this;
        }

        @Override
        public AddServersToServerGroupRequest build() {
            return new AddServersToServerGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddServersToServerGroupRequest} extends {@link TeaModel}
     *
     * <p>AddServersToServerGroupRequest</p>
     */
    public static class Servers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("RemoteIpEnabled")
        private Boolean remoteIpEnabled;

        @com.aliyun.core.annotation.NameInMap("ServerId")
        private String serverId;

        @com.aliyun.core.annotation.NameInMap("ServerIp")
        private String serverIp;

        @com.aliyun.core.annotation.NameInMap("ServerType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String serverType;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        private Servers(Builder builder) {
            this.description = builder.description;
            this.port = builder.port;
            this.remoteIpEnabled = builder.remoteIpEnabled;
            this.serverId = builder.serverId;
            this.serverIp = builder.serverIp;
            this.serverType = builder.serverType;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Servers create() {
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
         * @return remoteIpEnabled
         */
        public Boolean getRemoteIpEnabled() {
            return this.remoteIpEnabled;
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
            private Boolean remoteIpEnabled; 
            private String serverId; 
            private String serverIp; 
            private String serverType; 
            private Integer weight; 

            private Builder() {
            } 

            private Builder(Servers model) {
                this.description = model.description;
                this.port = model.port;
                this.remoteIpEnabled = model.remoteIpEnabled;
                this.serverId = model.serverId;
                this.serverIp = model.serverIp;
                this.serverType = model.serverType;
                this.weight = model.weight;
            } 

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
             * <p>The port used by the backend server. Valid values: <strong>1</strong> to <strong>65535</strong>. You can add up to 200 servers in a single call.</p>
             * <blockquote>
             * <p>This parameter is required when <strong>ServerType</strong> is set to <strong>Ecs</strong>, <strong>Eni</strong>, <strong>Eci</strong>, or <strong>Ip</strong>. This parameter is not required when <strong>ServerType</strong> is set to <strong>Fc</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>Specifies whether to enable the remote IP address feature. You can add up to 200 servers in a single call. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: enables the feature.</p>
             * </li>
             * <li><p><strong>false</strong>: disables the feature.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>This parameter takes effect only when <strong>ServerType</strong> is set to <strong>Ip</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder remoteIpEnabled(Boolean remoteIpEnabled) {
                this.remoteIpEnabled = remoteIpEnabled;
                return this;
            }

            /**
             * <p>The ID of the backend server. You can add up to 200 servers in a single call.</p>
             * <ul>
             * <li><p>If the server group is of the <strong>Instance</strong> type, this parameter specifies the ID of an <strong>Ecs</strong>, <strong>Eni</strong>, or <strong>Eci</strong> resource.</p>
             * </li>
             * <li><p>If the server group is of the <strong>Ip</strong> type, this parameter specifies an IP address.</p>
             * </li>
             * <li><p>If the server group is of the <strong>Fc</strong> type, this parameter specifies the ARN of the Function Compute resource.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>i-uf616vu8me******</p>
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * <p>The specified IP address. You can add up to 200 servers in a single call.</p>
             * <p>If <strong>ServerType</strong> is set to <strong>Eni</strong>, you can specify the primary or secondary private IP address of the ENI.</p>
             * <blockquote>
             * <p>This parameter is not required when <strong>ServerType</strong> is set to <strong>Fc</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.1</p>
             */
            public Builder serverIp(String serverIp) {
                this.serverIp = serverIp;
                return this;
            }

            /**
             * <p>The backend server type. You can add up to 200 servers each time you invoke the operation. Valid values:</p>
             * <ul>
             * <li><strong>Ecs</strong>: ECS instance.</li>
             * <li><strong>Eni</strong>: elastic network interfaces (ENIs) or network interface controller (NIC).</li>
             * <li><strong>Eci</strong>: Elastic Container Instance (ECI).</li>
             * <li><strong>Ip</strong>: IP address.</li>
             * <li><strong>Fc</strong>: Function Compute.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Ecs</p>
             */
            public Builder serverType(String serverType) {
                this.serverType = serverType;
                return this;
            }

            /**
             * <p>The weight of the backend server. Valid values: <strong>0</strong> to <strong>100</strong>. Default value: <strong>100</strong>. If the weight is set to <strong>0</strong>, no requests are forwarded to the backend server. You can add up to 200 servers in a single call.</p>
             * <blockquote>
             * <p>This parameter is not required when <strong>ServerType</strong> is set to <strong>Fc</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public Servers build() {
                return new Servers(this);
            } 

        } 

    }
}
