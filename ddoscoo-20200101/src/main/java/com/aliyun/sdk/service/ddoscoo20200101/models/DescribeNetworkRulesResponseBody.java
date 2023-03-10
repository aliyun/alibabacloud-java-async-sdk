// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNetworkRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNetworkRulesResponseBody</p>
 */
public class DescribeNetworkRulesResponseBody extends TeaModel {
    @NameInMap("NetworkRules")
    private java.util.List < NetworkRules> networkRules;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private DescribeNetworkRulesResponseBody(Builder builder) {
        this.networkRules = builder.networkRules;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNetworkRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return networkRules
     */
    public java.util.List < NetworkRules> getNetworkRules() {
        return this.networkRules;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < NetworkRules> networkRules; 
        private String requestId; 
        private Long totalCount; 

        /**
         * An array that consists of the details of a port forwarding rule.
         */
        public Builder networkRules(java.util.List < NetworkRules> networkRules) {
            this.networkRules = networkRules;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of returned port forwarding rules.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeNetworkRulesResponseBody build() {
            return new DescribeNetworkRulesResponseBody(this);
        } 

    } 

    public static class NetworkRules extends TeaModel {
        @NameInMap("BackendPort")
        private Integer backendPort;

        @NameInMap("FrontendPort")
        private Integer frontendPort;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("IsAutoCreate")
        private Boolean isAutoCreate;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("RealServers")
        private java.util.List < String > realServers;

        private NetworkRules(Builder builder) {
            this.backendPort = builder.backendPort;
            this.frontendPort = builder.frontendPort;
            this.instanceId = builder.instanceId;
            this.isAutoCreate = builder.isAutoCreate;
            this.protocol = builder.protocol;
            this.realServers = builder.realServers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkRules create() {
            return builder().build();
        }

        /**
         * @return backendPort
         */
        public Integer getBackendPort() {
            return this.backendPort;
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
         * @return isAutoCreate
         */
        public Boolean getIsAutoCreate() {
            return this.isAutoCreate;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return realServers
         */
        public java.util.List < String > getRealServers() {
            return this.realServers;
        }

        public static final class Builder {
            private Integer backendPort; 
            private Integer frontendPort; 
            private String instanceId; 
            private Boolean isAutoCreate; 
            private String protocol; 
            private java.util.List < String > realServers; 

            /**
             * The port of the origin server.
             */
            public Builder backendPort(Integer backendPort) {
                this.backendPort = backendPort;
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
             * Indicates whether the port forwarding rule is automatically created. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder isAutoCreate(Boolean isAutoCreate) {
                this.isAutoCreate = isAutoCreate;
                return this;
            }

            /**
             * The forwarding protocol. Valid values:
             * <p>
             * 
             * *   **tcp**
             * *   **udp**
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * An array that consists of IP addresses of origin servers.
             */
            public Builder realServers(java.util.List < String > realServers) {
                this.realServers = realServers;
                return this;
            }

            public NetworkRules build() {
                return new NetworkRules(this);
            } 

        } 

    }
}
