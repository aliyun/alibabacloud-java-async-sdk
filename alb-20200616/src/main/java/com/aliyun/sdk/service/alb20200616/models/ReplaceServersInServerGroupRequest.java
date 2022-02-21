// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReplaceServersInServerGroupRequest} extends {@link RequestModel}
 *
 * <p>ReplaceServersInServerGroupRequest</p>
 */
public class ReplaceServersInServerGroupRequest extends Request {
    @Query
    @NameInMap("AddedServers")
    @Validation(required = true)
    private java.util.List < AddedServers> addedServers;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("RemovedServers")
    @Validation(required = true)
    private java.util.List < RemovedServers> removedServers;

    @Query
    @NameInMap("ServerGroupId")
    @Validation(required = true)
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
    public java.util.List < AddedServers> getAddedServers() {
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
    public java.util.List < RemovedServers> getRemovedServers() {
        return this.removedServers;
    }

    /**
     * @return serverGroupId
     */
    public String getServerGroupId() {
        return this.serverGroupId;
    }

    public static final class Builder extends Request.Builder<ReplaceServersInServerGroupRequest, Builder> {
        private java.util.List < AddedServers> addedServers; 
        private String clientToken; 
        private Boolean dryRun; 
        private java.util.List < RemovedServers> removedServers; 
        private String serverGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ReplaceServersInServerGroupRequest response) {
            super(response);
            this.addedServers = response.addedServers;
            this.clientToken = response.clientToken;
            this.dryRun = response.dryRun;
            this.removedServers = response.removedServers;
            this.serverGroupId = response.serverGroupId;
        } 

        /**
         * 待添加后端服务器
         */
        public Builder addedServers(java.util.List < AddedServers> addedServers) {
            this.putQueryParameter("AddedServers", addedServers);
            this.addedServers = addedServers;
            return this;
        }

        /**
         * 幂等Token
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * dryRun
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * 待删除后端服务器
         */
        public Builder removedServers(java.util.List < RemovedServers> removedServers) {
            this.putQueryParameter("RemovedServers", removedServers);
            this.removedServers = removedServers;
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

        @Override
        public ReplaceServersInServerGroupRequest build() {
            return new ReplaceServersInServerGroupRequest(this);
        } 

    } 

    public static class AddedServers extends TeaModel {
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
        private String serverType;

        @NameInMap("Weight")
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
             * 描述信息
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

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

            /**
             * 后端服务器权重
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
    public static class RemovedServers extends TeaModel {
        @NameInMap("Port")
        private Integer port;

        @NameInMap("ServerId")
        @Validation(required = true)
        private String serverId;

        @NameInMap("ServerIp")
        private String serverIp;

        @NameInMap("ServerType")
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
             * 端口
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

            public RemovedServers build() {
                return new RemovedServers(this);
            } 

        } 

    }
}
