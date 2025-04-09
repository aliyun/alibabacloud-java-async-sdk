// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430.models;

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
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
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
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private String regionId; 
        private String serverGroupId; 
        private java.util.List<Servers> servers; 

        private Builder() {
            super();
        } 

        private Builder(AddServersToServerGroupRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.regionId = request.regionId;
            this.serverGroupId = request.serverGroupId;
            this.servers = request.servers;
        } 

        /**
         * <p>The client token used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token. Ensure that the token is unique among different requests. Only ASCII characters are allowed.</p>
         * <blockquote>
         * <p> If you do not set this parameter, the value of <strong>RequestId</strong> is used.**** The value of <strong>RequestId</strong> is different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: validates the request without performing the operation. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the validation, the corresponding error message is returned. If the request passes the validation, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): validates the request and performs the operation. If the request passes the validation, a 2xx HTTP status code is returned and the operation is performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The ID of the region where the NLB instance is deployed.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/443657.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The server group ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sgp-atstuj3rtoptyui****</p>
         */
        public Builder serverGroupId(String serverGroupId) {
            this.putBodyParameter("ServerGroupId", serverGroupId);
            this.serverGroupId = serverGroupId;
            return this;
        }

        /**
         * <p>The backend servers that you want to add.</p>
         * <blockquote>
         * <p> You can add up to 200 backend servers in each call.</p>
         * </blockquote>
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

            private Builder() {
            } 

            private Builder(Servers model) {
                this.description = model.description;
                this.port = model.port;
                this.serverId = model.serverId;
                this.serverIp = model.serverIp;
                this.serverType = model.serverType;
                this.weight = model.weight;
            } 

            /**
             * <p>The description of the backend server.</p>
             * <p>The description must be 2 to 256 characters in length, and can contain letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at sings (@), underscores (_), and hyphens (-).</p>
             * 
             * <strong>example:</strong>
             * <p>ECS</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The port that is used by the backend server to provide services. Valid values: <strong>0 to 65535</strong>. If you do not set this parameter, the default value <strong>0</strong> is used.</p>
             * <p>If multi-port forwarding is enabled, you do not need to set this parameter. The default value 0 is used. NLB forwards requests to the requested ports. To determine whether multi-port forwarding is enabled, call the <a href="https://help.aliyun.com/document_detail/445895.html">ListServerGroups</a> operation and check the value of the <strong>AnyPortEnabled</strong> parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>443</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The backend server ID.</p>
             * <ul>
             * <li>If the server group is of the <strong>Instance</strong> type, set this parameter to the IDs of <strong>Elastic Compute Service (ECS) instances</strong>, <strong>elastic network interfaces (ENIs)</strong>, or <strong>elastic container instances</strong>.</li>
             * <li>If the server group is of the <strong>Ip</strong> type, set ServerId to IP addresses.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp67acfmxazb4p****</p>
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * <p>The IP address of the backend server. If the server group type is <strong>Ip</strong>, set the ServerId parameter to IP addresses.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.6.6</p>
             */
            public Builder serverIp(String serverIp) {
                this.serverIp = serverIp;
                return this;
            }

            /**
             * <p>The type of the backend server. Valid values:</p>
             * <ul>
             * <li><strong>Ecs</strong>: the ECS instance</li>
             * <li><strong>Eni</strong>: the ENI</li>
             * <li><strong>Eci</strong>: the elastic container instance</li>
             * <li><strong>Ip</strong>: the IP address</li>
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
             * <p>The weight of the backend server. Valid values: <strong>0</strong> to <strong>100</strong>. Default value: <strong>100</strong>. If this parameter is set to <strong>0</strong>, no requests are forwarded to the server.</p>
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
