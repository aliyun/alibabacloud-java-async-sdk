// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddBackendServersResponseBody} extends {@link TeaModel}
 *
 * <p>AddBackendServersResponseBody</p>
 */
public class AddBackendServersResponseBody extends TeaModel {
    @NameInMap("BackendServers")
    private BackendServers backendServers;

    @NameInMap("LoadBalancerId")
    private String loadBalancerId;

    @NameInMap("RequestId")
    private String requestId;

    private AddBackendServersResponseBody(Builder builder) {
        this.backendServers = builder.backendServers;
        this.loadBalancerId = builder.loadBalancerId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddBackendServersResponseBody create() {
        return builder().build();
    }

    /**
     * @return backendServers
     */
    public BackendServers getBackendServers() {
        return this.backendServers;
    }

    /**
     * @return loadBalancerId
     */
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private BackendServers backendServers; 
        private String loadBalancerId; 
        private String requestId; 

        /**
         * The list of backend servers.
         */
        public Builder backendServers(BackendServers backendServers) {
            this.backendServers = backendServers;
            return this;
        }

        /**
         * The ID of the CLB instance.
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddBackendServersResponseBody build() {
            return new AddBackendServersResponseBody(this);
        } 

    } 

    public static class BackendServer extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("ServerId")
        private String serverId;

        @NameInMap("Type")
        private String type;

        @NameInMap("Weight")
        private String weight;

        private BackendServer(Builder builder) {
            this.description = builder.description;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
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
        public String getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String description; 
            private String serverId; 
            private String type; 
            private String weight; 

            /**
             * The description of the backend server.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the ECS instance, ENI, or elastic container instance.
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * The type of the backend server. Valid values:
             * <p>
             * 
             * *   **ecs** (default): an ECS instance
             * *   **eni**: an ENI
             * *   **eci**: an elastic container instance
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The weight of the backend server.
             * <p>
             * 
             * Valid values: **0 to 100**. Default value: **100**.
             * 
             * If the value is set to **0**, no requests are forwarded to the backend server.
             */
            public Builder weight(String weight) {
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
