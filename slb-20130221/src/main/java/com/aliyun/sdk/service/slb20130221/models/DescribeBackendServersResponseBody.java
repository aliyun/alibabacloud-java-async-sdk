// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20130221.models;

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
 * {@link DescribeBackendServersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackendServersResponseBody</p>
 */
public class DescribeBackendServersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Listeners")
    private Listeners listeners;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeBackendServersResponseBody(Builder builder) {
        this.listeners = builder.listeners;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackendServersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return listeners
     */
    public Listeners getListeners() {
        return this.listeners;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Listeners listeners; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeBackendServersResponseBody model) {
            this.listeners = model.listeners;
            this.requestId = model.requestId;
        } 

        /**
         * Listeners.
         */
        public Builder listeners(Listeners listeners) {
            this.listeners = listeners;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBackendServersResponseBody build() {
            return new DescribeBackendServersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBackendServersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackendServersResponseBody</p>
     */
    public static class BackendServer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ServerHealthStatus")
        private String serverHealthStatus;

        @com.aliyun.core.annotation.NameInMap("ServerId")
        private String serverId;

        private BackendServer(Builder builder) {
            this.serverHealthStatus = builder.serverHealthStatus;
            this.serverId = builder.serverId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackendServer create() {
            return builder().build();
        }

        /**
         * @return serverHealthStatus
         */
        public String getServerHealthStatus() {
            return this.serverHealthStatus;
        }

        /**
         * @return serverId
         */
        public String getServerId() {
            return this.serverId;
        }

        public static final class Builder {
            private String serverHealthStatus; 
            private String serverId; 

            private Builder() {
            } 

            private Builder(BackendServer model) {
                this.serverHealthStatus = model.serverHealthStatus;
                this.serverId = model.serverId;
            } 

            /**
             * ServerHealthStatus.
             */
            public Builder serverHealthStatus(String serverHealthStatus) {
                this.serverHealthStatus = serverHealthStatus;
                return this;
            }

            /**
             * ServerId.
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            public BackendServer build() {
                return new BackendServer(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBackendServersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackendServersResponseBody</p>
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
    /**
     * 
     * {@link DescribeBackendServersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackendServersResponseBody</p>
     */
    public static class Listener extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackendServers")
        private BackendServers backendServers;

        @com.aliyun.core.annotation.NameInMap("ListenerPort")
        private Integer listenerPort;

        private Listener(Builder builder) {
            this.backendServers = builder.backendServers;
            this.listenerPort = builder.listenerPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Listener create() {
            return builder().build();
        }

        /**
         * @return backendServers
         */
        public BackendServers getBackendServers() {
            return this.backendServers;
        }

        /**
         * @return listenerPort
         */
        public Integer getListenerPort() {
            return this.listenerPort;
        }

        public static final class Builder {
            private BackendServers backendServers; 
            private Integer listenerPort; 

            private Builder() {
            } 

            private Builder(Listener model) {
                this.backendServers = model.backendServers;
                this.listenerPort = model.listenerPort;
            } 

            /**
             * BackendServers.
             */
            public Builder backendServers(BackendServers backendServers) {
                this.backendServers = backendServers;
                return this;
            }

            /**
             * ListenerPort.
             */
            public Builder listenerPort(Integer listenerPort) {
                this.listenerPort = listenerPort;
                return this;
            }

            public Listener build() {
                return new Listener(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBackendServersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackendServersResponseBody</p>
     */
    public static class Listeners extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Listener")
        private java.util.List<Listener> listener;

        private Listeners(Builder builder) {
            this.listener = builder.listener;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Listeners create() {
            return builder().build();
        }

        /**
         * @return listener
         */
        public java.util.List<Listener> getListener() {
            return this.listener;
        }

        public static final class Builder {
            private java.util.List<Listener> listener; 

            private Builder() {
            } 

            private Builder(Listeners model) {
                this.listener = model.listener;
            } 

            /**
             * Listener.
             */
            public Builder listener(java.util.List<Listener> listener) {
                this.listener = listener;
                return this;
            }

            public Listeners build() {
                return new Listeners(this);
            } 

        } 

    }
}
