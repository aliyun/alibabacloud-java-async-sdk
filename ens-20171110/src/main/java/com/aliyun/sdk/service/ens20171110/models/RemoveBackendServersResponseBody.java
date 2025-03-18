// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link RemoveBackendServersResponseBody} extends {@link TeaModel}
 *
 * <p>RemoveBackendServersResponseBody</p>
 */
public class RemoveBackendServersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackendServers")
    private BackendServers backendServers;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(RemoveBackendServersResponseBody model) {
            this.backendServers = model.backendServers;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of backend servers that you want to add to the SLB instance.</p>
         */
        public Builder backendServers(BackendServers backendServers) {
            this.backendServers = backendServers;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RemoveBackendServersResponseBody build() {
            return new RemoveBackendServersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RemoveBackendServersResponseBody} extends {@link TeaModel}
     *
     * <p>RemoveBackendServersResponseBody</p>
     */
    public static class BackendServer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("ServerId")
        private String serverId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Weight")
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

            private Builder() {
            } 

            private Builder(BackendServer model) {
                this.ip = model.ip;
                this.port = model.port;
                this.serverId = model.serverId;
                this.type = model.type;
                this.weight = model.weight;
            } 

            /**
             * <p>The IP address of the backend server.</p>
             * 
             * <strong>example:</strong>
             * <p>192.1XX.X.X</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The backend port that is used by the ELB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The instance ID of the backend server.</p>
             * 
             * <strong>example:</strong>
             * <p>i-5vb5h5njxiuhn48a****</p>
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * <p>The type of the backend server. Valid values:</p>
             * <ul>
             * <li><strong>ens</strong>: an ENS instance.</li>
             * <li><strong>eni</strong>: an ENI.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ens</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The weight of the backend server.</p>
             * <blockquote>
             * <p> The value 0 indicates that requests are not forwarded to the backend server.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>50</p>
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
     * {@link RemoveBackendServersResponseBody} extends {@link TeaModel}
     *
     * <p>RemoveBackendServersResponseBody</p>
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

            private Builder() {
            } 

            private Builder(BackendServers model) {
                this.backendServer = model.backendServer;
            } 

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
