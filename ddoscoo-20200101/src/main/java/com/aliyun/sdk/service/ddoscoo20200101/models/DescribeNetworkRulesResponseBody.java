// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribeNetworkRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNetworkRulesResponseBody</p>
 */
public class DescribeNetworkRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NetworkRules")
    private java.util.List<NetworkRules> networkRules;

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
    public java.util.List<NetworkRules> getNetworkRules() {
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
        private java.util.List<NetworkRules> networkRules; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>The details of the port forwarding rule.</p>
         */
        public Builder networkRules(java.util.List<NetworkRules> networkRules) {
            this.networkRules = networkRules;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>8597F235-FA5E-4FC7-BAD9-E4C0B01BC771</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned port forwarding rules.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeNetworkRulesResponseBody build() {
            return new DescribeNetworkRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNetworkRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkRulesResponseBody</p>
     */
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
        private java.util.List<String> realServers;

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
        public java.util.List<String> getRealServers() {
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
            private java.util.List<String> realServers; 
            private String remark; 

            /**
             * <p>The port of the origin server.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder backendPort(Integer backendPort) {
                this.backendPort = backendPort;
                return this;
            }

            /**
             * <p>The forwarding port.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder frontendPort(Integer frontendPort) {
                this.frontendPort = frontendPort;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ddoscoo-cn-mp91j1ao****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Indicates whether the port forwarding rule is automatically created. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
             * <p>The forwarding protocol. Valid values:</p>
             * <ul>
             * <li><strong>tcp</strong></li>
             * <li><strong>udp</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>tcp</p>
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
             * <p>The IP addresses of origin servers.</p>
             */
            public Builder realServers(java.util.List<String> realServers) {
                this.realServers = realServers;
                return this;
            }

            /**
             * <p>The remarks of the port forwarding rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
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
