// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

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
 * {@link SetBackendServersResponseBody} extends {@link TeaModel}
 *
 * <p>SetBackendServersResponseBody</p>
 */
public class SetBackendServersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackendServers")
    private BackendServers backendServers;

    @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
    private String loadBalancerId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SetBackendServersResponseBody(Builder builder) {
        this.backendServers = builder.backendServers;
        this.loadBalancerId = builder.loadBalancerId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetBackendServersResponseBody create() {
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
         * <p>The backend servers.</p>
         */
        public Builder backendServers(BackendServers backendServers) {
            this.backendServers = backendServers;
            return this;
        }

        /**
         * <p>The ID of the CLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-bp1qjwo61pqz3a******</p>
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>365F4154-92F6-4AE4-92F8-7FF34B540710</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SetBackendServersResponseBody build() {
            return new SetBackendServersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SetBackendServersResponseBody} extends {@link TeaModel}
     *
     * <p>SetBackendServersResponseBody</p>
     */
    public static class BackendServer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ServerId")
        private String serverId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Weight")
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
             * <p>The description of the backend server.</p>
             * 
             * <strong>example:</strong>
             * <p>backend server</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the server group.</p>
             * 
             * <strong>example:</strong>
             * <p>eni-hhshhs****</p>
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * <p>The type of backend server. Valid values:</p>
             * <ul>
             * <li><strong>ecs</strong> (default): ECS instance</li>
             * <li><strong>eni</strong>: ENI</li>
             * <li><strong>eci</strong>: elastic container instance</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>eni</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The weight of the backend server.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
    /**
     * 
     * {@link SetBackendServersResponseBody} extends {@link TeaModel}
     *
     * <p>SetBackendServersResponseBody</p>
     */
    public static class BackendServers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackendServer")
        private java.util.List<BackendServer> backendServer;

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
        public java.util.List<BackendServer> getBackendServer() {
            return this.backendServer;
        }

        public static final class Builder {
            private java.util.List<BackendServer> backendServer; 

            /**
             * BackendServer.
             */
            public Builder backendServer(java.util.List<BackendServer> backendServer) {
                this.backendServer = backendServer;
                return this;
            }

            public BackendServers build() {
                return new BackendServers(this);
            } 

        } 

    }
}
