// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateServerGroupServersAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateServerGroupServersAttributeRequest</p>
 */
public class UpdateServerGroupServersAttributeRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("ServerGroupId")
    @Validation(required = true)
    private String serverGroupId;

    @Query
    @NameInMap("Servers")
    @Validation(required = true)
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
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.
         * 
         * > If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The value of **RequestId** for each API request is different.
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
         * *   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.
         * *   **false** (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The server group ID.
         */
        public Builder serverGroupId(String serverGroupId) {
            this.putQueryParameter("ServerGroupId", serverGroupId);
            this.serverGroupId = serverGroupId;
            return this;
        }

        /**
         * The backend servers that you want to add to the server group. You can specify up to 40 servers in each call.
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

    public static class Servers extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("ServerId")
        @Validation(required = true)
        private String serverId;

        @NameInMap("ServerIp")
        private String serverIp;

        @NameInMap("ServerType")
        @Validation(required = true)
        private String serverType;

        @NameInMap("Weight")
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
             * The description of the backend server. The description must be 2 to 256 characters in length and can contain letters, digits, periods (.), underscores (\_), hyphens (-), commas (,), semicolons (;), forward slashes (/), and at signs (@). You can specify at most 40 servers in each call.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The port used by the backend server. Valid values: **1** to **65535**. You can specify at most 40 servers in each call.
             * <p>
             * 
             * > You do not need to set this parameter if **ServerType** is set to **Fc**.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The ID of the backend server. You can specify up to 40 server IDs in each call.
             * <p>
             * 
             * *   If **ServerType** is set to **Ecs**, **Eni**, or **Eci**, set the ServerId parameter to the ID of an Elastic Compute Service (ECS) instance, an elastic network interface (ENI), or an elastic container instance.
             * *   If **ServerType** is set to **Ip**, set the ServerId parameter to an IP address.
             * *   If **ServerType** is set to **Fc**, set the ServerId parameter to the Alibaba Cloud Resource Name (ARN) of a function.
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
             * The type of the backend server. You can specify at most 40 servers in each call. Valid values:
             * <p>
             * 
             * *   **Ecs**
             * *   **Eni**
             * *   **Eci**
             * *   **Ip**
             * *   **Fc**
             */
            public Builder serverType(String serverType) {
                this.serverType = serverType;
                return this;
            }

            /**
             * The weight of the backend server. Valid values: **0** to **100**. Default value: **100**. If the weight of a backend server is set to **0**, no requests are forwarded to the backend server. You can specify at most 40 servers in each call.
             * <p>
             * 
             * > You do not need to set this parameter if **ServerType** is set to **Fc**.
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
