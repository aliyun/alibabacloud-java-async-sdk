// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLayer4RulePolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLayer4RulePolicyResponseBody</p>
 */
public class DescribeLayer4RulePolicyResponseBody extends TeaModel {
    @NameInMap("BackendPort")
    private Integer backendPort;

    @NameInMap("BakMode")
    private String bakMode;

    @NameInMap("CurrentIndex")
    private Integer currentIndex;

    @NameInMap("ForwardProtocol")
    private String forwardProtocol;

    @NameInMap("FrontendPort")
    private Integer frontendPort;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("PriRealServers")
    private java.util.List < PriRealServers> priRealServers;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecRealServers")
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
         * BackendPort.
         */
        public Builder backendPort(Integer backendPort) {
            this.backendPort = backendPort;
            return this;
        }

        /**
         * BakMode.
         */
        public Builder bakMode(String bakMode) {
            this.bakMode = bakMode;
            return this;
        }

        /**
         * CurrentIndex.
         */
        public Builder currentIndex(Integer currentIndex) {
            this.currentIndex = currentIndex;
            return this;
        }

        /**
         * ForwardProtocol.
         */
        public Builder forwardProtocol(String forwardProtocol) {
            this.forwardProtocol = forwardProtocol;
            return this;
        }

        /**
         * FrontendPort.
         */
        public Builder frontendPort(Integer frontendPort) {
            this.frontendPort = frontendPort;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PriRealServers.
         */
        public Builder priRealServers(java.util.List < PriRealServers> priRealServers) {
            this.priRealServers = priRealServers;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SecRealServers.
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
        @NameInMap("CurrentIndex")
        private Integer currentIndex;

        @NameInMap("Eip")
        private String eip;

        @NameInMap("FrontendPort")
        private Integer frontendPort;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("RealServer")
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
             * CurrentIndex.
             */
            public Builder currentIndex(Integer currentIndex) {
                this.currentIndex = currentIndex;
                return this;
            }

            /**
             * Eip.
             */
            public Builder eip(String eip) {
                this.eip = eip;
                return this;
            }

            /**
             * FrontendPort.
             */
            public Builder frontendPort(Integer frontendPort) {
                this.frontendPort = frontendPort;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
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
             * RealServer.
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
        @NameInMap("CurrentIndex")
        private Integer currentIndex;

        @NameInMap("Eip")
        private String eip;

        @NameInMap("FrontendPort")
        private Integer frontendPort;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("RealServer")
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
             * CurrentIndex.
             */
            public Builder currentIndex(Integer currentIndex) {
                this.currentIndex = currentIndex;
                return this;
            }

            /**
             * Eip.
             */
            public Builder eip(String eip) {
                this.eip = eip;
                return this;
            }

            /**
             * FrontendPort.
             */
            public Builder frontendPort(Integer frontendPort) {
                this.frontendPort = frontendPort;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
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
             * RealServer.
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
