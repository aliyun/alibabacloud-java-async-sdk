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
 * {@link SetBackendServersResponseBody} extends {@link TeaModel}
 *
 * <p>SetBackendServersResponseBody</p>
 */
public class SetBackendServersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackendServers")
    private BackendServers backendServers;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SetBackendServersResponseBody(Builder builder) {
        this.backendServers = builder.backendServers;
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
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
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

            /**
             * <p>The IP address of the backend server.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.1</p>
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
             * <p>The ID of the instance that you want to use as the backend server.</p>
             * 
             * <strong>example:</strong>
             * <p>i-5uf6hj58zvml4ali8****</p>
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * <p>The type of the backend server. Valid values:</p>
             * <ul>
             * <li><strong>ens</strong>: ENS instance.</li>
             * <li><strong>eni</strong>: ENI instance.</li>
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
             * <p>The weight of the backend server. Default value: 100. Valid values: <strong>0</strong> to <strong>100</strong>.</p>
             * <blockquote>
             * <p> The value 0 indicates that requests are not forwarded to the backend server.</p>
             * </blockquote>
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
