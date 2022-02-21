// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveServersFromServerGroupRequest} extends {@link RequestModel}
 *
 * <p>RemoveServersFromServerGroupRequest</p>
 */
public class RemoveServersFromServerGroupRequest extends Request {
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

        private Builder(RemoveServersFromServerGroupRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.dryRun = response.dryRun;
            this.serverGroupId = response.serverGroupId;
            this.servers = response.servers;
        } 

        /**
         * 幂等标识
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         *  是否只预检此次请求
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * 后端服务器Id
         */
        public Builder serverGroupId(String serverGroupId) {
            this.putQueryParameter("ServerGroupId", serverGroupId);
            this.serverGroupId = serverGroupId;
            return this;
        }

        /**
         * 后端服务器
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

    public static class Servers extends TeaModel {
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
             * 后端端口号
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * 后端服务器id
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * 后端服务器ip
             */
            public Builder serverIp(String serverIp) {
                this.serverIp = serverIp;
                return this;
            }

            /**
             * 后端服务器类型
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
