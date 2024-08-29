// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNetworkRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNetworkRulesResponseBody</p>
 */
public class DescribeNetworkRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NetworkRules")
    private java.util.List < NetworkRules> networkRules;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * The details of a port forwarding rule.
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
        @com.aliyun.core.annotation.NameInMap("BackendPort")
        private Integer backendPort;

        @com.aliyun.core.annotation.NameInMap("FrontendPort")
        private Integer frontendPort;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("IsAutoCreate")
        private Boolean isAutoCreate;

        @com.aliyun.core.annotation.NameInMap("PayloadRuleEnable")
        private Long payloadRuleEnable;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("ProxyEnable")
        private Long proxyEnable;

        @com.aliyun.core.annotation.NameInMap("ProxyStatus")
        private String proxyStatus;

        @com.aliyun.core.annotation.NameInMap("RealServers")
        private java.util.List < String > realServers;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        private NetworkRules(Builder builder) {
            this.backendPort = builder.backendPort;
            this.frontendPort = builder.frontendPort;
            this.instanceId = builder.instanceId;
            this.isAutoCreate = builder.isAutoCreate;
            this.payloadRuleEnable = builder.payloadRuleEnable;
            this.protocol = builder.protocol;
            this.proxyEnable = builder.proxyEnable;
            this.proxyStatus = builder.proxyStatus;
            this.realServers = builder.realServers;
            this.remark = builder.remark;
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
         * @return payloadRuleEnable
         */
        public Long getPayloadRuleEnable() {
            return this.payloadRuleEnable;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return proxyEnable
         */
        public Long getProxyEnable() {
            return this.proxyEnable;
        }

        /**
         * @return proxyStatus
         */
        public String getProxyStatus() {
            return this.proxyStatus;
        }

        /**
         * @return realServers
         */
        public java.util.List < String > getRealServers() {
            return this.realServers;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        public static final class Builder {
            private Integer backendPort; 
            private Integer frontendPort; 
            private String instanceId; 
            private Boolean isAutoCreate; 
            private Long payloadRuleEnable; 
            private String protocol; 
            private Long proxyEnable; 
            private String proxyStatus; 
            private java.util.List < String > realServers; 
            private String remark; 

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
             * *   **true**
             * *   **false**
             */
            public Builder isAutoCreate(Boolean isAutoCreate) {
                this.isAutoCreate = isAutoCreate;
                return this;
            }

            /**
             * PayloadRuleEnable.
             */
            public Builder payloadRuleEnable(Long payloadRuleEnable) {
                this.payloadRuleEnable = payloadRuleEnable;
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
             * ProxyEnable.
             */
            public Builder proxyEnable(Long proxyEnable) {
                this.proxyEnable = proxyEnable;
                return this;
            }

            /**
             * ProxyStatus.
             */
            public Builder proxyStatus(String proxyStatus) {
                this.proxyStatus = proxyStatus;
                return this;
            }

            /**
             * The IP addresses of origin servers.
             */
            public Builder realServers(java.util.List < String > realServers) {
                this.realServers = realServers;
                return this;
            }

            /**
             * The remarks of the port forwarding rule.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            public NetworkRules build() {
                return new NetworkRules(this);
            } 

        } 

    }
}
