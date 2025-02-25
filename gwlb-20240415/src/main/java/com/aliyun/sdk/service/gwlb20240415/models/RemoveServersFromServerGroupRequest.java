// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gwlb20240415.models;

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
    @com.aliyun.core.annotation.NameInMap("ServerGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serverGroupId;

    @com.aliyun.core.annotation.Body
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
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
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
         * <p>This parameter is required.</p>
         */
        public Builder servers(java.util.List < Servers> servers) {
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

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
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
             * ServerIp.
             */
            public Builder serverIp(String serverIp) {
                this.serverIp = serverIp;
                return this;
            }

            /**
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
