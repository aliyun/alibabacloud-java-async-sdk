// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveBackendServersResponseBody} extends {@link TeaModel}
 *
 * <p>RemoveBackendServersResponseBody</p>
 */
public class RemoveBackendServersResponseBody extends TeaModel {
    @NameInMap("BackendServers")
    private BackendServers backendServers;

    @NameInMap("RequestId")
    private String requestId;

    private RemoveBackendServersResponseBody(Builder builder) {
        this.backendServers = builder.backendServers;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveBackendServersResponseBody create() {
        return builder().build();
    }

    /**
     * @return backendServers
     */
    public BackendServers getBackendServers() {
        return this.backendServers;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private BackendServers backendServers; 
        private String requestId; 

        /**
         * The list of backend servers that you want to add. You can add at most 20 backend servers.
         * <p>
         * 
         * >  Only ENS instances that are in the running state can be attached to the ELB instance as backend servers.
         */
        public Builder backendServers(BackendServers backendServers) {
            this.backendServers = backendServers;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RemoveBackendServersResponseBody build() {
            return new RemoveBackendServersResponseBody(this);
        } 

    } 

    public static class BackendServer extends TeaModel {
        @NameInMap("Ip")
        private String ip;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("ServerId")
        private String serverId;

        @NameInMap("Type")
        private String type;

        @NameInMap("Weight")
        private Integer weight;

        private BackendServer(Builder builder) {
            this.ip = builder.ip;
            this.port = builder.port;
            this.serverId = builder.serverId;
            this.type = builder.type;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackendServer create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
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
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String ip; 
            private Integer port; 
            private String serverId; 
            private String type; 
            private Integer weight; 

            /**
             * The IP address of the backend server.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The backend port that is used by the ELB instance.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The ID of the instance that is used as the backend server.
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * The type of the backend server. Valid values:
             * <p>
             * 
             * *   **ens**: ENS instance.
             * *   **eni**: ENI.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The weight of the backend server. Default value: 100. Valid values: **0** to **100**.
             * <p>
             * 
             * >  The value 0 indicates that requests are not forwarded to the backend server.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public BackendServer build() {
                return new BackendServer(this);
            } 

        } 

    }
    public static class BackendServers extends TeaModel {
        @NameInMap("BackendServer")
        private java.util.List < BackendServer> backendServer;

        private BackendServers(Builder builder) {
            this.backendServer = builder.backendServer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackendServers create() {
            return builder().build();
        }

        /**
         * @return backendServer
         */
        public java.util.List < BackendServer> getBackendServer() {
            return this.backendServer;
        }

        public static final class Builder {
            private java.util.List < BackendServer> backendServer; 

            /**
             * BackendServer.
             */
            public Builder backendServer(java.util.List < BackendServer> backendServer) {
                this.backendServer = backendServer;
                return this;
            }

            public BackendServers build() {
                return new BackendServers(this);
            } 

        } 

    }
}
