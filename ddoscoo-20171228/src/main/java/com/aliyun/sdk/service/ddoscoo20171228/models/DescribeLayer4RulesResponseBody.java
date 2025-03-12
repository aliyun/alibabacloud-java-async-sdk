// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

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
 * {@link DescribeLayer4RulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLayer4RulesResponseBody</p>
 */
public class DescribeLayer4RulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Listeners")
    private java.util.List<Listeners> listeners;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private DescribeLayer4RulesResponseBody(Builder builder) {
        this.listeners = builder.listeners;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLayer4RulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return listeners
     */
    public java.util.List<Listeners> getListeners() {
        return this.listeners;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<Listeners> listeners; 
        private String requestId; 
        private Long total; 

        /**
         * <p>Detailed configuration of port forwarding rules, including the forwarding port, forwarding protocol, and origin server addresses, etc.</p>
         */
        public Builder listeners(java.util.List<Listeners> listeners) {
            this.listeners = listeners;
            return this;
        }

        /**
         * <p>The ID of the current request.</p>
         * 
         * <strong>example:</strong>
         * <p>949919A2-6636-1444-9213-AB27DD88AAA8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of returned results.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public DescribeLayer4RulesResponseBody build() {
            return new DescribeLayer4RulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLayer4RulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLayer4RulesResponseBody</p>
     */
    public static class Listeners extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackendPort")
        private Integer backendPort;

        @com.aliyun.core.annotation.NameInMap("BakMode")
        private Integer bakMode;

        @com.aliyun.core.annotation.NameInMap("CurrentIndex")
        private Integer currentIndex;

        @com.aliyun.core.annotation.NameInMap("Eip")
        private String eip;

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
        private Integer proxyEnable;

        @com.aliyun.core.annotation.NameInMap("ProxyStatus")
        private String proxyStatus;

        @com.aliyun.core.annotation.NameInMap("RealServers")
        private java.util.List<String> realServers;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        private Listeners(Builder builder) {
            this.backendPort = builder.backendPort;
            this.bakMode = builder.bakMode;
            this.currentIndex = builder.currentIndex;
            this.eip = builder.eip;
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

        public static Listeners create() {
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
        public Integer getBakMode() {
            return this.bakMode;
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
        public Integer getProxyEnable() {
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
            private Integer bakMode; 
            private Integer currentIndex; 
            private String eip; 
            private Integer frontendPort; 
            private String instanceId; 
            private Boolean isAutoCreate; 
            private Long payloadRuleEnable; 
            private String protocol; 
            private Integer proxyEnable; 
            private String proxyStatus; 
            private java.util.List<String> realServers; 
            private String remark; 

            /**
             * <p>The origin server port.</p>
             * 
             * <strong>example:</strong>
             * <p>233</p>
             */
            public Builder backendPort(Integer backendPort) {
                this.backendPort = backendPort;
                return this;
            }

            /**
             * <p>The origin mode. Values:</p>
             * <ul>
             * <li><strong>0</strong>: Indicates the default origin mode.</li>
             * <li><strong>1</strong>: Indicates the primary/backup origin mode.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder bakMode(Integer bakMode) {
                this.bakMode = bakMode;
                return this;
            }

            /**
             * <p>The currently effective origin server type. Values:</p>
             * <ul>
             * <li><strong>1</strong>: Indicates that the primary origin server settings are in effect (DDoS protection forwards business traffic to the primary origin server IP address).</li>
             * <li><strong>2</strong>: Indicates that the backup origin server settings are in effect (DDoS protection forwards business traffic to the backup origin server IP address).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentIndex(Integer currentIndex) {
                this.currentIndex = currentIndex;
                return this;
            }

            /**
             * <p>The IP address of the DDoS protection instance.</p>
             * 
             * <strong>example:</strong>
             * <p>203.107.XX.XX</p>
             */
            public Builder eip(String eip) {
                this.eip = eip;
                return this;
            }

            /**
             * <p>The forwarding port.</p>
             * 
             * <strong>example:</strong>
             * <p>233</p>
             */
            public Builder frontendPort(Integer frontendPort) {
                this.frontendPort = frontendPort;
                return this;
            }

            /**
             * <p>The ID of the DDoS protection instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ddoscoo-cn-zvp2ay9b****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Indicates whether the rule was automatically created. Values:</p>
             * <ul>
             * <li><strong>true</strong>: Indicates that the rule was automatically created by DDoS protection.</li>
             * <li><strong>false</strong>: Indicates that the rule was manually created by you.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isAutoCreate(Boolean isAutoCreate) {
                this.isAutoCreate = isAutoCreate;
                return this;
            }

            /**
             * <p>Payload rule module switch. Values:</p>
             * <ul>
             * <li>1: Enabled</li>
             * <li>0: Disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder payloadRuleEnable(Long payloadRuleEnable) {
                this.payloadRuleEnable = payloadRuleEnable;
                return this;
            }

            /**
             * <p>The type of forwarding protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>tcp</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>Traffic diversion switch. Values:</p>
             * <ul>
             * <li><strong>0</strong> Off.</li>
             * <li><strong>1</strong> On.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder proxyEnable(Integer proxyEnable) {
                this.proxyEnable = proxyEnable;
                return this;
            }

            /**
             * <p>Traffic diversion status. Values:</p>
             * <ul>
             * <li>on: Diversion is effective</li>
             * <li>off: Diversion is ineffective</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder proxyStatus(String proxyStatus) {
                this.proxyStatus = proxyStatus;
                return this;
            }

            /**
             * <p>The list of origin server IP addresses.</p>
             */
            public Builder realServers(java.util.List<String> realServers) {
                this.realServers = realServers;
                return this;
            }

            /**
             * <p>The remarks for the port forwarding rule.</p>
             * 
             * <strong>example:</strong>
             * <p>test-remark</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            public Listeners build() {
                return new Listeners(this);
            } 

        } 

    }
}
