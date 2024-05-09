// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLayer4RulePolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLayer4RulePolicyResponseBody</p>
 */
public class DescribeLayer4RulePolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackendPort")
    private Integer backendPort;

    @com.aliyun.core.annotation.NameInMap("BakMode")
    private String bakMode;

    @com.aliyun.core.annotation.NameInMap("CurrentIndex")
    private Integer currentIndex;

    @com.aliyun.core.annotation.NameInMap("ForwardProtocol")
    private String forwardProtocol;

    @com.aliyun.core.annotation.NameInMap("FrontendPort")
    private Integer frontendPort;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("PriRealServers")
    private java.util.List < PriRealServers> priRealServers;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecRealServers")
    private java.util.List < SecRealServers> secRealServers;

    private DescribeLayer4RulePolicyResponseBody(Builder builder) {
        this.backendPort = builder.backendPort;
        this.bakMode = builder.bakMode;
        this.currentIndex = builder.currentIndex;
        this.forwardProtocol = builder.forwardProtocol;
        this.frontendPort = builder.frontendPort;
        this.instanceId = builder.instanceId;
        this.priRealServers = builder.priRealServers;
        this.requestId = builder.requestId;
        this.secRealServers = builder.secRealServers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLayer4RulePolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return backendPort
     */
    public Integer getBackendPort() {
        return this.backendPort;
    }

    /**
     * @return bakMode
     */
    public String getBakMode() {
        return this.bakMode;
    }

    /**
     * @return currentIndex
     */
    public Integer getCurrentIndex() {
        return this.currentIndex;
    }

    /**
     * @return forwardProtocol
     */
    public String getForwardProtocol() {
        return this.forwardProtocol;
    }

    /**
     * @return frontendPort
     */
    public Integer getFrontendPort() {
        return this.frontendPort;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return priRealServers
     */
    public java.util.List < PriRealServers> getPriRealServers() {
        return this.priRealServers;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return secRealServers
     */
    public java.util.List < SecRealServers> getSecRealServers() {
        return this.secRealServers;
    }

    public static final class Builder {
        private Integer backendPort; 
        private String bakMode; 
        private Integer currentIndex; 
        private String forwardProtocol; 
        private Integer frontendPort; 
        private String instanceId; 
        private java.util.List < PriRealServers> priRealServers; 
        private String requestId; 
        private java.util.List < SecRealServers> secRealServers; 

        /**
         * The port of the origin server.
         */
        public Builder backendPort(Integer backendPort) {
            this.backendPort = backendPort;
            return this;
        }

        /**
         * The mode that is used to forward service traffic. Valid values:
         * <p>
         * 
         * *   0: the default mode. In this mode, Anti-DDoS Pro or Anti-DDoS Premium forwards service traffic to the origin IP address that you specified when you created the port forwarding rule. You can call the [CreateNetworkRules](~~157482~~) operation to create a port forwarding rule.
         * *   1: the origin redundancy mode. In this mode, Anti-DDoS Pro or Anti-DDoS Premium forwards service traffic to the IP addresses of the primary or secondary origin servers. You can call the [ConfigLayer4RulePolicy](~~312684~~) operation to configure IP addresses.
         */
        public Builder bakMode(String bakMode) {
            this.bakMode = bakMode;
            return this;
        }

        /**
         * The origin server that is used to receive service traffic. Valid values:
         * <p>
         * 
         * *   **1**: the primary origin server, which indicates that Anti-DDoS Pro or Anti-DDoS Premium forwards service traffic to the IP addresses of the primary origin server.
         * *   **2**: the secondary origin server, which indicates that Anti-DDoS Pro or Anti-DDoS Premium forwards service traffic to the IP addresses of the secondary origin server.
         */
        public Builder currentIndex(Integer currentIndex) {
            this.currentIndex = currentIndex;
            return this;
        }

        /**
         * The type of the protocol.
         */
        public Builder forwardProtocol(String forwardProtocol) {
            this.forwardProtocol = forwardProtocol;
            return this;
        }

        /**
         * The forwarding port.
         */
        public Builder frontendPort(Integer frontendPort) {
            this.frontendPort = frontendPort;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * An array that consists of the information about the primary origin server, including the IP addresses, forwarding protocol, and forwarding port.
         */
        public Builder priRealServers(java.util.List < PriRealServers> priRealServers) {
            this.priRealServers = priRealServers;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * An array that consists of the information about the secondary origin server, including the IP addresses, forwarding protocol, and forwarding port.
         */
        public Builder secRealServers(java.util.List < SecRealServers> secRealServers) {
            this.secRealServers = secRealServers;
            return this;
        }

        public DescribeLayer4RulePolicyResponseBody build() {
            return new DescribeLayer4RulePolicyResponseBody(this);
        } 

    } 

    public static class PriRealServers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentIndex")
        private Integer currentIndex;

        @com.aliyun.core.annotation.NameInMap("Eip")
        private String eip;

        @com.aliyun.core.annotation.NameInMap("FrontendPort")
        private Integer frontendPort;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("RealServer")
        private String realServer;

        private PriRealServers(Builder builder) {
            this.currentIndex = builder.currentIndex;
            this.eip = builder.eip;
            this.frontendPort = builder.frontendPort;
            this.instanceId = builder.instanceId;
            this.protocol = builder.protocol;
            this.realServer = builder.realServer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PriRealServers create() {
            return builder().build();
        }

        /**
         * @return currentIndex
         */
        public Integer getCurrentIndex() {
            return this.currentIndex;
        }

        /**
         * @return eip
         */
        public String getEip() {
            return this.eip;
        }

        /**
         * @return frontendPort
         */
        public Integer getFrontendPort() {
            return this.frontendPort;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return realServer
         */
        public String getRealServer() {
            return this.realServer;
        }

        public static final class Builder {
            private Integer currentIndex; 
            private String eip; 
            private Integer frontendPort; 
            private String instanceId; 
            private String protocol; 
            private String realServer; 

            /**
             * The origin server that is used to receive service traffic. Valid values:
             * <p>
             * 
             * *   **1**: the primary origin server, which indicates that Anti-DDoS Pro or Anti-DDoS Premium forwards service traffic to the IP addresses of the primary origin server.
             * *   **2**: the secondary origin server, which indicates that Anti-DDoS Pro or Anti-DDoS Premium forwards service traffic to the IP addresses of the secondary origin server.
             */
            public Builder currentIndex(Integer currentIndex) {
                this.currentIndex = currentIndex;
                return this;
            }

            /**
             * The IP address of the instance.
             */
            public Builder eip(String eip) {
                this.eip = eip;
                return this;
            }

            /**
             * The forwarding port.
             */
            public Builder frontendPort(Integer frontendPort) {
                this.frontendPort = frontendPort;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The type of the protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * The IP address of the primary origin server.
             */
            public Builder realServer(String realServer) {
                this.realServer = realServer;
                return this;
            }

            public PriRealServers build() {
                return new PriRealServers(this);
            } 

        } 

    }
    public static class SecRealServers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentIndex")
        private Integer currentIndex;

        @com.aliyun.core.annotation.NameInMap("Eip")
        private String eip;

        @com.aliyun.core.annotation.NameInMap("FrontendPort")
        private Integer frontendPort;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("RealServer")
        private String realServer;

        private SecRealServers(Builder builder) {
            this.currentIndex = builder.currentIndex;
            this.eip = builder.eip;
            this.frontendPort = builder.frontendPort;
            this.instanceId = builder.instanceId;
            this.protocol = builder.protocol;
            this.realServer = builder.realServer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecRealServers create() {
            return builder().build();
        }

        /**
         * @return currentIndex
         */
        public Integer getCurrentIndex() {
            return this.currentIndex;
        }

        /**
         * @return eip
         */
        public String getEip() {
            return this.eip;
        }

        /**
         * @return frontendPort
         */
        public Integer getFrontendPort() {
            return this.frontendPort;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return realServer
         */
        public String getRealServer() {
            return this.realServer;
        }

        public static final class Builder {
            private Integer currentIndex; 
            private String eip; 
            private Integer frontendPort; 
            private String instanceId; 
            private String protocol; 
            private String realServer; 

            /**
             * The origin server that is used to receive service traffic. Valid values:
             * <p>
             * 
             * *   **1**: the primary origin server, which indicates that Anti-DDoS Pro or Anti-DDoS Premium forwards service traffic to the IP addresses of the primary origin server.
             * *   **2**: the secondary origin server, which indicates that Anti-DDoS Pro or Anti-DDoS Premium forwards service traffic to the IP addresses of the secondary origin server.
             */
            public Builder currentIndex(Integer currentIndex) {
                this.currentIndex = currentIndex;
                return this;
            }

            /**
             * The IP address of the instance.
             */
            public Builder eip(String eip) {
                this.eip = eip;
                return this;
            }

            /**
             * The forwarding port.
             */
            public Builder frontendPort(Integer frontendPort) {
                this.frontendPort = frontendPort;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The type of the protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * The IP address of the secondary origin server.
             */
            public Builder realServer(String realServer) {
                this.realServer = realServer;
                return this;
            }

            public SecRealServers build() {
                return new SecRealServers(this);
            } 

        } 

    }
}
