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
 * {@link DescribeHealthStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHealthStatusResponseBody</p>
 */
public class DescribeHealthStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackendServers")
    private BackendServers backendServers;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeHealthStatusResponseBody(Builder builder) {
        this.backendServers = builder.backendServers;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHealthStatusResponseBody create() {
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
         * <p>365F4154-92F6-4AE4-92F8-7FF34B540710</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeHealthStatusResponseBody build() {
            return new DescribeHealthStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHealthStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHealthStatusResponseBody</p>
     */
    public static class BackendServer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ListenerPort")
        private Integer listenerPort;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("ServerHealthStatus")
        private String serverHealthStatus;

        @com.aliyun.core.annotation.NameInMap("ServerId")
        private String serverId;

        @com.aliyun.core.annotation.NameInMap("ServerIp")
        private String serverIp;

        private BackendServer(Builder builder) {
            this.listenerPort = builder.listenerPort;
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.serverHealthStatus = builder.serverHealthStatus;
            this.serverId = builder.serverId;
            this.serverIp = builder.serverIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackendServer create() {
            return builder().build();
        }

        /**
         * @return listenerPort
         */
        public Integer getListenerPort() {
            return this.listenerPort;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
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

        /**
         * @return serverIp
         */
        public String getServerIp() {
            return this.serverIp;
        }

        public static final class Builder {
            private Integer listenerPort; 
            private Integer port; 
            private String protocol; 
            private String serverHealthStatus; 
            private String serverId; 
            private String serverIp; 

            /**
             * <p>The frontend port that is used by the SLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder listenerPort(Integer listenerPort) {
                this.listenerPort = listenerPort;
                return this;
            }

            /**
             * <p>The backend port that is used by the SLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>70</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The frontend protocol that is used by the SLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>https</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The health status of the backend server. Valid values:</p>
             * <ul>
             * <li>normal: The backend server is healthy.</li>
             * <li>abnormal: The backend server is unhealthy.</li>
             * <li>unavailable: The health check is not completed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>abnormal</p>
             */
            public Builder serverHealthStatus(String serverHealthStatus) {
                this.serverHealthStatus = serverHealthStatus;
                return this;
            }

            /**
             * <p>The ID of the backend server.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp1h5u3fv54ytf***</p>
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * <p>The IP address of the backend server.</p>
             * 
             * <strong>example:</strong>
             * <p>192.XX.XX.11</p>
             */
            public Builder serverIp(String serverIp) {
                this.serverIp = serverIp;
                return this;
            }

            public BackendServer build() {
                return new BackendServer(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeHealthStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHealthStatusResponseBody</p>
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
