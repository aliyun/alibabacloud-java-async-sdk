// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GatewaySLBValue} extends {@link TeaModel}
 *
 * <p>GatewaySLBValue</p>
 */
public class GatewaySLBValue extends TeaModel {
    @NameInMap("SLBAddress")
    private String SLBAddress;

    @NameInMap("LoadBalancerId")
    private String loadBalancerId;

    @NameInMap("BackendServers")
    private BackendServers backendServers;

    @NameInMap("SLBHealthCheckState")
    private String SLBHealthCheckState;

    private GatewaySLBValue(Builder builder) {
        this.SLBAddress = builder.SLBAddress;
        this.loadBalancerId = builder.loadBalancerId;
        this.backendServers = builder.backendServers;
        this.SLBHealthCheckState = builder.SLBHealthCheckState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GatewaySLBValue create() {
        return builder().build();
    }

    /**
     * @return SLBAddress
     */
    public String getSLBAddress() {
        return this.SLBAddress;
    }

    /**
     * @return loadBalancerId
     */
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    /**
     * @return backendServers
     */
    public BackendServers getBackendServers() {
        return this.backendServers;
    }

    /**
     * @return SLBHealthCheckState
     */
    public String getSLBHealthCheckState() {
        return this.SLBHealthCheckState;
    }

    public static final class Builder {
        private String SLBAddress; 
        private String loadBalancerId; 
        private BackendServers backendServers; 
        private String SLBHealthCheckState; 

        /**
         * SLBAddress.
         */
        public Builder SLBAddress(String SLBAddress) {
            this.SLBAddress = SLBAddress;
            return this;
        }

        /**
         * LoadBalancerId.
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * BackendServers.
         */
        public Builder backendServers(BackendServers backendServers) {
            this.backendServers = backendServers;
            return this;
        }

        /**
         * SLBHealthCheckState.
         */
        public Builder SLBHealthCheckState(String SLBHealthCheckState) {
            this.SLBHealthCheckState = SLBHealthCheckState;
            return this;
        }

        public GatewaySLBValue build() {
            return new GatewaySLBValue(this);
        } 

    } 

    public static class BackendServers extends TeaModel {
        @NameInMap("Port")
        private Long port;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("ServerIp")
        private String serverIp;

        @NameInMap("ServerHealthStatus")
        private String serverHealthStatus;

        @NameInMap("ServerId")
        private String serverId;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("ListenerPort")
        private Long listenerPort;

        @NameInMap("Weight")
        private String weight;

        @NameInMap("Description")
        private String description;

        @NameInMap("EniHost")
        private String eniHost;

        @NameInMap("Type")
        private String type;

        private BackendServers(Builder builder) {
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.serverIp = builder.serverIp;
            this.serverHealthStatus = builder.serverHealthStatus;
            this.serverId = builder.serverId;
            this.vpcId = builder.vpcId;
            this.listenerPort = builder.listenerPort;
            this.weight = builder.weight;
            this.description = builder.description;
            this.eniHost = builder.eniHost;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackendServers create() {
            return builder().build();
        }

        /**
         * @return port
         */
        public Long getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return serverIp
         */
        public String getServerIp() {
            return this.serverIp;
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
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return listenerPort
         */
        public Long getListenerPort() {
            return this.listenerPort;
        }

        /**
         * @return weight
         */
        public String getWeight() {
            return this.weight;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return eniHost
         */
        public String getEniHost() {
            return this.eniHost;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long port; 
            private String protocol; 
            private String serverIp; 
            private String serverHealthStatus; 
            private String serverId; 
            private String vpcId; 
            private Long listenerPort; 
            private String weight; 
            private String description; 
            private String eniHost; 
            private String type; 

            /**
             * Port.
             */
            public Builder port(Long port) {
                this.port = port;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * ServerIp.
             */
            public Builder serverIp(String serverIp) {
                this.serverIp = serverIp;
                return this;
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

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * ListenerPort.
             */
            public Builder listenerPort(Long listenerPort) {
                this.listenerPort = listenerPort;
                return this;
            }

            /**
             * Weight.
             */
            public Builder weight(String weight) {
                this.weight = weight;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EniHost.
             */
            public Builder eniHost(String eniHost) {
                this.eniHost = eniHost;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public BackendServers build() {
                return new BackendServers(this);
            } 

        } 

    }
}
