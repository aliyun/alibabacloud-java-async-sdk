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
 * {@link SetVServerGroupAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>SetVServerGroupAttributeResponseBody</p>
 */
public class SetVServerGroupAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackendServers")
    private BackendServers backendServers;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VServerGroupId")
    private String vServerGroupId;

    @com.aliyun.core.annotation.NameInMap("VServerGroupName")
    private String vServerGroupName;

    private SetVServerGroupAttributeResponseBody(Builder builder) {
        this.backendServers = builder.backendServers;
        this.requestId = builder.requestId;
        this.vServerGroupId = builder.vServerGroupId;
        this.vServerGroupName = builder.vServerGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetVServerGroupAttributeResponseBody create() {
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

    /**
     * @return vServerGroupName
     */
    public String getVServerGroupName() {
        return this.vServerGroupName;
    }

    public static final class Builder {
        private BackendServers backendServers; 
        private String requestId; 
        private String vServerGroupId; 
        private String vServerGroupName; 

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
         * <p>The server group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rsp-cige6****</p>
         */
        public Builder vServerGroupId(String vServerGroupId) {
            this.vServerGroupId = vServerGroupId;
            return this;
        }

        /**
         * <p>The name of the vServer group.</p>
         * 
         * <strong>example:</strong>
         * <p>Group1</p>
         */
        public Builder vServerGroupName(String vServerGroupName) {
            this.vServerGroupName = vServerGroupName;
            return this;
        }

        public SetVServerGroupAttributeResponseBody build() {
            return new SetVServerGroupAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SetVServerGroupAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>SetVServerGroupAttributeResponseBody</p>
     */
    public static class BackendServer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("ServerId")
        private String serverId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        private BackendServer(Builder builder) {
            this.description = builder.description;
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
            private String description; 
            private Integer port; 
            private String serverId; 
            private String type; 
            private Integer weight; 

            /**
             * <p>The description of the server group.</p>
             * 
             * <strong>example:</strong>
             * <p>Backend server group description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The port that is used by the backend server.</p>
             * 
             * <strong>example:</strong>
             * <p>70</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ID of the backend server.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp1ek6yd7jvkx****</p>
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
     * {@link SetVServerGroupAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>SetVServerGroupAttributeResponseBody</p>
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
