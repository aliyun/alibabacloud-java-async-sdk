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
 * {@link RemoveServersFromServerGroupRequest} extends {@link RequestModel}
 *
 * <p>RemoveServersFromServerGroupRequest</p>
 */
public class RemoveServersFromServerGroupRequest extends Request {
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

    private RemoveServersFromServerGroupRequest(Builder builder) {
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

    public static final class Builder extends Request.Builder<RemoveServersFromServerGroupRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String regionId; 
        private String serverGroupId; 
        private java.util.List<Servers> servers; 

        private Builder() {
            super();
        } 

        private Builder(RemoveServersFromServerGroupRequest request) {
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
         * <p>The backend servers. You can specify up to 200 backend servers in each call.</p>
         * <p>This parameter is required.</p>
         */
        public Builder servers(java.util.List<Servers> servers) {
            this.putBodyParameter("Servers", servers);
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

            private Builder() {
            } 

            private Builder(Servers model) {
                this.port = model.port;
                this.serverId = model.serverId;
                this.serverIp = model.serverIp;
                this.serverType = model.serverType;
            } 

            /**
             * <p>The port that is used by the backend server. Valid values: <strong>0</strong> to <strong>65535</strong>. If you do not set this parameter, the default value <strong>0</strong> is used.</p>
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
             * <li>If the server group is of the <strong>Instance</strong> type, set this parameter to the IDs of servers of the <strong>Ecs</strong>, <strong>Eni</strong>, or <strong>Eci</strong> type.</li>
             * <li>If the server group is of the <strong>Ip</strong> type, set ServerId to IP addresses.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs-bp67acfmxazb4p****</p>
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * <p>The IP addresses of the server. If the server group type is <strong>Ip</strong>, set the ServerId parameter to IP addresses.</p>
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
             * <li><strong>Ecs</strong>: the Elastic Compute Service (ECS) instance</li>
             * <li><strong>Eni</strong>: the elastic network interface (ENI)</li>
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

            public Servers build() {
                return new Servers(this);
            } 

        } 

    }
}
