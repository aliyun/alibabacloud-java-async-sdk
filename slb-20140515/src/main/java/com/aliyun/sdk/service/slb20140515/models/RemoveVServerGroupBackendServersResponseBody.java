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
 * {@link RemoveVServerGroupBackendServersResponseBody} extends {@link TeaModel}
 *
 * <p>RemoveVServerGroupBackendServersResponseBody</p>
 */
public class RemoveVServerGroupBackendServersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackendServers")
    private BackendServers backendServers;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VServerGroupId")
    private String vServerGroupId;

    private RemoveVServerGroupBackendServersResponseBody(Builder builder) {
        this.backendServers = builder.backendServers;
        this.requestId = builder.requestId;
        this.vServerGroupId = builder.vServerGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveVServerGroupBackendServersResponseBody create() {
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

    /**
     * @return vServerGroupId
     */
    public String getVServerGroupId() {
        return this.vServerGroupId;
    }

    public static final class Builder {
        private BackendServers backendServers; 
        private String requestId; 
        private String vServerGroupId; 

        /**
         * <p>The backend servers.</p>
         */
        public Builder backendServers(BackendServers backendServers) {
            this.backendServers = backendServers;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9DEC9C28-AB05-4DDF-9A78-6B08EC9CE18C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the vServer group.</p>
         * 
         * <strong>example:</strong>
         * <p>rsp-cige6j****</p>
         */
        public Builder vServerGroupId(String vServerGroupId) {
            this.vServerGroupId = vServerGroupId;
            return this;
        }

        public RemoveVServerGroupBackendServersResponseBody build() {
            return new RemoveVServerGroupBackendServersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RemoveVServerGroupBackendServersResponseBody} extends {@link TeaModel}
     *
     * <p>RemoveVServerGroupBackendServersResponseBody</p>
     */
    public static class BackendServer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("ServerId")
        private String serverId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        private BackendServer(Builder builder) {
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
            private Integer port; 
            private String serverId; 
            private String type; 
            private Integer weight; 

            /**
             * <p>The port that is used by the backend server.</p>
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
             * 
             * <strong>example:</strong>
             * <p>vm-230</p>
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * <p>The type of the backend server. Valid values:</p>
             * <ul>
             * <li><strong>ecs</strong> (default): ECS instance</li>
             * <li><strong>eni</strong>: ENI</li>
             * <li><strong>eci</strong>: elastic container instance</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
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
            public Builder weight(Integer weight) {
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
     * {@link RemoveVServerGroupBackendServersResponseBody} extends {@link TeaModel}
     *
     * <p>RemoveVServerGroupBackendServersResponseBody</p>
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
