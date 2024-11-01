// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateServerGroupServersAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateServerGroupServersAttributeRequest</p>
 */
public class UpdateServerGroupServersAttributeRequest extends Request {
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

    private UpdateServerGroupServersAttributeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.serverGroupId = builder.serverGroupId;
        this.servers = builder.servers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateServerGroupServersAttributeRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateServerGroupServersAttributeRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String serverGroupId; 
        private java.util.List < Servers> servers; 

        private Builder() {
            super();
        } 

        private Builder(UpdateServerGroupServersAttributeRequest request) {
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
         * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
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
         * <p>The server groups. You can specify at most 40 server groups in each call.</p>
         * <p>This parameter is required.</p>
         */
        public Builder servers(java.util.List < Servers> servers) {
            this.putQueryParameter("Servers", servers);
            this.servers = servers;
            return this;
        }

        @Override
        public UpdateServerGroupServersAttributeRequest build() {
            return new UpdateServerGroupServersAttributeRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateServerGroupServersAttributeRequest} extends {@link TeaModel}
     *
     * <p>UpdateServerGroupServersAttributeRequest</p>
     */
    public static class Servers extends TeaModel {
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
        @com.aliyun.core.annotation.Validation(required = true)
        private String serverType;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        private Servers(Builder builder) {
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
             * <p>The port that is used by the backend server. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
             * <blockquote>
             * <p>You do not need to set this parameter if <strong>ServerType</strong> is set to <strong>Fc</strong>.</p>
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
             * <p>The ID of the backend server.</p>
             * <ul>
             * <li>Specify the ID of an Elastic Compute Service (ECS) instance, an elastic network interface (ENI), or an elastic container instance if you set <strong>ServerType</strong> to <strong>Ecs</strong>, <strong>Eni</strong>, or <strong>Eci</strong>.</li>
             * <li>Specify an IP address if you set <strong>ServerType</strong> to <strong>Ip</strong>.</li>
             * <li>Specify the Alibaba Cloud Resource Name (ARN) of a Function Compute function if you set <strong>ServerType</strong> to <strong>Fc</strong>.</li>
             * </ul>
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
             * <p>The IP address of the backend server.</p>
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

            /**
             * <p>The weight of the backend server. Valid values: <strong>0</strong> to <strong>100</strong>. Default value: <strong>100</strong>. If the value is set to <strong>0</strong>, no requests are forwarded to the server. You can specify up to 40 servers in each call.</p>
             * <blockquote>
             * <p>You do not need to set this parameter if <strong>ServerType</strong> is set to <strong>Fc</strong>.</p>
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
