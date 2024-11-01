// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RemoveServersFromServerGroupRequest} extends {@link RequestModel}
 *
 * <p>RemoveServersFromServerGroupRequest</p>
 */
public class RemoveServersFromServerGroupRequest extends Request {
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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Servers")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Servers> servers;

    private RemoveServersFromServerGroupRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.serverGroupId = builder.serverGroupId;
        this.servers = builder.servers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveServersFromServerGroupRequest create() {
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
    public java.util.List < Servers> getServers() {
        return this.servers;
    }

    public static final class Builder extends Request.Builder<RemoveServersFromServerGroupRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String serverGroupId; 
        private java.util.List < Servers> servers; 

        private Builder() {
            super();
        } 

        private Builder(RemoveServersFromServerGroupRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.serverGroupId = request.serverGroupId;
            this.servers = request.servers;
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
         * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
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
         * <p>The server group ID.</p>
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
         * <p>The server group. You can add at most 200 backend servers to the server group.</p>
         * <p>This parameter is required.</p>
         */
        public Builder servers(java.util.List < Servers> servers) {
            this.putQueryParameter("Servers", servers);
            this.servers = servers;
            return this;
        }

        @Override
        public RemoveServersFromServerGroupRequest build() {
            return new RemoveServersFromServerGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link RemoveServersFromServerGroupRequest} extends {@link TeaModel}
     *
     * <p>RemoveServersFromServerGroupRequest</p>
     */
    public static class Servers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("ServerId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String serverId;

        @com.aliyun.core.annotation.NameInMap("ServerIp")
        private String serverIp;

        @com.aliyun.core.annotation.NameInMap("ServerType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String serverType;

        private Servers(Builder builder) {
            this.port = builder.port;
            this.serverId = builder.serverId;
            this.serverIp = builder.serverIp;
            this.serverType = builder.serverType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Servers create() {
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
             * <p>The port that is used by the backend server. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
             * <blockquote>
             * <p> This parameter is required when you set <strong>ServerType</strong> to <strong>Ecs</strong>, <strong>Eni</strong>, <strong>Eci</strong>, or <strong>Ip</strong>.</p>
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
             * <p>The ID of the server group.</p>
             * <ul>
             * <li>If the server group is of the <strong>Instance</strong> type, set ServerId to the ID of a resource of the <strong>Ecs</strong>, <strong>Eni</strong>, or <strong>Eci</strong> type.</li>
             * <li>If the server group is of the <strong>Ip</strong> type, set ServerId to IP addresses.</li>
             * <li>If the server group is of the <strong>Fc</strong>, set ServerId to the Alibaba Cloud Resource Name (ARN) of a function.</li>
             * </ul>
             * <blockquote>
             * <p> You can call the ListServerGroups operation to query information about the server group type so that you can set ServerId to a proper value.<a href="~~213627~~"></a></p>
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
             * <p>The type of the backend server. Valid values:</p>
             * <ul>
             * <li><strong>Ecs</strong>: ECS instance</li>
             * <li><strong>Eni</strong>: ENI</li>
             * <li><strong>Eci</strong>: elastic container instance</li>
             * <li><strong>Ip</strong>: IP address</li>
             * <li><strong>Fc</strong>: Function Compute</li>
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

            public Servers build() {
                return new Servers(this);
            } 

        } 

    }
}
