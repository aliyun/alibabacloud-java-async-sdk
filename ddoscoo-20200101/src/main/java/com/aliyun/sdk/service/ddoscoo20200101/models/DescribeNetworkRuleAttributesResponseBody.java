// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNetworkRuleAttributesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNetworkRuleAttributesResponseBody</p>
 */
public class DescribeNetworkRuleAttributesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NetworkRuleAttributes")
    private java.util.List < NetworkRuleAttributes> networkRuleAttributes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeNetworkRuleAttributesResponseBody(Builder builder) {
        this.networkRuleAttributes = builder.networkRuleAttributes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNetworkRuleAttributesResponseBody create() {
        return builder().build();
    }

    /**
     * @return networkRuleAttributes
     */
    public java.util.List < NetworkRuleAttributes> getNetworkRuleAttributes() {
        return this.networkRuleAttributes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < NetworkRuleAttributes> networkRuleAttributes; 
        private String requestId; 

        /**
         * An array that consists of the mitigation settings of the port forwarding rule for a non-website service. The mitigation settings include session persistence and DDoS mitigation policies.
         */
        public Builder networkRuleAttributes(java.util.List < NetworkRuleAttributes> networkRuleAttributes) {
            this.networkRuleAttributes = networkRuleAttributes;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeNetworkRuleAttributesResponseBody build() {
            return new DescribeNetworkRuleAttributesResponseBody(this);
        } 

    } 

    public static class Sblack extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cnt")
        private Integer cnt;

        @com.aliyun.core.annotation.NameInMap("During")
        private Integer during;

        @com.aliyun.core.annotation.NameInMap("Expires")
        private Integer expires;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        private Sblack(Builder builder) {
            this.cnt = builder.cnt;
            this.during = builder.during;
            this.expires = builder.expires;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sblack create() {
            return builder().build();
        }

        /**
         * @return cnt
         */
        public Integer getCnt() {
            return this.cnt;
        }

        /**
         * @return during
         */
        public Integer getDuring() {
            return this.during;
        }

        /**
         * @return expires
         */
        public Integer getExpires() {
            return this.expires;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer cnt; 
            private Integer during; 
            private Integer expires; 
            private Integer type; 

            /**
             * The threshold that the number of connections initiated from a source IP address can exceed the limit. Set the value to **5**. If the number of connections initiated from a source IP address exceeds the limit five times during the check, the source IP address is added to the blacklist.
             */
            public Builder cnt(Integer cnt) {
                this.cnt = cnt;
                return this;
            }

            /**
             * The interval at which checks are performed. Set the value to **60**. Unit: seconds.
             */
            public Builder during(Integer during) {
                this.during = during;
                return this;
            }

            /**
             * The validity period of the IP address in the blacklist. Valid values: **60** to **604800**. Unit: seconds.
             */
            public Builder expires(Integer expires) {
                this.expires = expires;
                return this;
            }

            /**
             * The type of the limit that causes a source IP address to be added to the blacklist. Valid values:
             * <p>
             * 
             * *   **1**: Source New Connection Rate Limit
             * *   **2**: Source Concurrent Connection Rate Limit
             * *   **3**: PPS Limit for Source
             * *   **4**: Bandwidth Limit for Source
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public Sblack build() {
                return new Sblack(this);
            } 

        } 

    }
    public static class Cc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Sblack")
        private java.util.List < Sblack> sblack;

        private Cc(Builder builder) {
            this.sblack = builder.sblack;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cc create() {
            return builder().build();
        }

        /**
         * @return sblack
         */
        public java.util.List < Sblack> getSblack() {
            return this.sblack;
        }

        public static final class Builder {
            private java.util.List < Sblack> sblack; 

            /**
             * The protection policy that a source IP address is added to the blacklist when the number of connections initiated from the IP address frequently exceeds the limit.
             */
            public Builder sblack(java.util.List < Sblack> sblack) {
                this.sblack = sblack;
                return this;
            }

            public Cc build() {
                return new Cc(this);
            } 

        } 

    }
    public static class PayloadLen extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Max")
        private Integer max;

        @com.aliyun.core.annotation.NameInMap("Min")
        private Integer min;

        private PayloadLen(Builder builder) {
            this.max = builder.max;
            this.min = builder.min;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PayloadLen create() {
            return builder().build();
        }

        /**
         * @return max
         */
        public Integer getMax() {
            return this.max;
        }

        /**
         * @return min
         */
        public Integer getMin() {
            return this.min;
        }

        public static final class Builder {
            private Integer max; 
            private Integer min; 

            /**
             * The maximum length of a packet. Valid values: **0** to **6000**. Unit: bytes.
             */
            public Builder max(Integer max) {
                this.max = max;
                return this;
            }

            /**
             * The minimum length of a packet. Valid values: **0** to **6000**. Unit: bytes.
             */
            public Builder min(Integer min) {
                this.min = min;
                return this;
            }

            public PayloadLen build() {
                return new PayloadLen(this);
            } 

        } 

    }
    public static class Sla extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cps")
        private Integer cps;

        @com.aliyun.core.annotation.NameInMap("CpsEnable")
        private Integer cpsEnable;

        @com.aliyun.core.annotation.NameInMap("Maxconn")
        private Integer maxconn;

        @com.aliyun.core.annotation.NameInMap("MaxconnEnable")
        private Integer maxconnEnable;

        private Sla(Builder builder) {
            this.cps = builder.cps;
            this.cpsEnable = builder.cpsEnable;
            this.maxconn = builder.maxconn;
            this.maxconnEnable = builder.maxconnEnable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sla create() {
            return builder().build();
        }

        /**
         * @return cps
         */
        public Integer getCps() {
            return this.cps;
        }

        /**
         * @return cpsEnable
         */
        public Integer getCpsEnable() {
            return this.cpsEnable;
        }

        /**
         * @return maxconn
         */
        public Integer getMaxconn() {
            return this.maxconn;
        }

        /**
         * @return maxconnEnable
         */
        public Integer getMaxconnEnable() {
            return this.maxconnEnable;
        }

        public static final class Builder {
            private Integer cps; 
            private Integer cpsEnable; 
            private Integer maxconn; 
            private Integer maxconnEnable; 

            /**
             * The maximum number of new connections per second that can be established over the port of the destination instance. Valid values: **100** to **100000**.
             */
            public Builder cps(Integer cps) {
                this.cps = cps;
                return this;
            }

            /**
             * The status of the Destination New Connection Rate Limit switch. Valid values:
             * <p>
             * 
             * *   **0**: The switch is turned off.
             * *   **1**: The switch is turned on.
             */
            public Builder cpsEnable(Integer cpsEnable) {
                this.cpsEnable = cpsEnable;
                return this;
            }

            /**
             * The maximum number of concurrent connections that can be established over the port of the destination instance. Valid values: **1000** to **1000000**.
             */
            public Builder maxconn(Integer maxconn) {
                this.maxconn = maxconn;
                return this;
            }

            /**
             * The status of the Destination Concurrent Connection Rate Limit switch. Valid values:
             * <p>
             * 
             * *   **0**: The switch is turned off.
             * *   **1**: The switch is turned on.
             */
            public Builder maxconnEnable(Integer maxconnEnable) {
                this.maxconnEnable = maxconnEnable;
                return this;
            }

            public Sla build() {
                return new Sla(this);
            } 

        } 

    }
    public static class Slimit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bps")
        private Long bps;

        @com.aliyun.core.annotation.NameInMap("Cps")
        private Integer cps;

        @com.aliyun.core.annotation.NameInMap("CpsEnable")
        private Integer cpsEnable;

        @com.aliyun.core.annotation.NameInMap("CpsMode")
        private Integer cpsMode;

        @com.aliyun.core.annotation.NameInMap("Maxconn")
        private Integer maxconn;

        @com.aliyun.core.annotation.NameInMap("MaxconnEnable")
        private Integer maxconnEnable;

        @com.aliyun.core.annotation.NameInMap("Pps")
        private Long pps;

        private Slimit(Builder builder) {
            this.bps = builder.bps;
            this.cps = builder.cps;
            this.cpsEnable = builder.cpsEnable;
            this.cpsMode = builder.cpsMode;
            this.maxconn = builder.maxconn;
            this.maxconnEnable = builder.maxconnEnable;
            this.pps = builder.pps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Slimit create() {
            return builder().build();
        }

        /**
         * @return bps
         */
        public Long getBps() {
            return this.bps;
        }

        /**
         * @return cps
         */
        public Integer getCps() {
            return this.cps;
        }

        /**
         * @return cpsEnable
         */
        public Integer getCpsEnable() {
            return this.cpsEnable;
        }

        /**
         * @return cpsMode
         */
        public Integer getCpsMode() {
            return this.cpsMode;
        }

        /**
         * @return maxconn
         */
        public Integer getMaxconn() {
            return this.maxconn;
        }

        /**
         * @return maxconnEnable
         */
        public Integer getMaxconnEnable() {
            return this.maxconnEnable;
        }

        /**
         * @return pps
         */
        public Long getPps() {
            return this.pps;
        }

        public static final class Builder {
            private Long bps; 
            private Integer cps; 
            private Integer cpsEnable; 
            private Integer cpsMode; 
            private Integer maxconn; 
            private Integer maxconnEnable; 
            private Long pps; 

            /**
             * The bandwidth limit for a source IP address. Valid values: **1024** to **268435456**. Unit: bytes/s. Default value: **0**, which indicates that the bandwidth for a source IP address is unlimited.
             */
            public Builder bps(Long bps) {
                this.bps = bps;
                return this;
            }

            /**
             * The maximum number of new connections per second that can be initiated from a source IP address. Valid values: **1** to **500000**.
             */
            public Builder cps(Integer cps) {
                this.cps = cps;
                return this;
            }

            /**
             * The status of the Source New Connection Rate Limit switch. Valid values:
             * <p>
             * 
             * *   **0**: The switch is turned off.
             * *   **1**: The switch is turned on.
             */
            public Builder cpsEnable(Integer cpsEnable) {
                this.cpsEnable = cpsEnable;
                return this;
            }

            /**
             * The mode of the Source New Connection Rate Limit switch. Valid values:
             * <p>
             * 
             * *   **1**: the manual mode
             * *   **2**: the automatic mode
             */
            public Builder cpsMode(Integer cpsMode) {
                this.cpsMode = cpsMode;
                return this;
            }

            /**
             * The maximum number of concurrent connections initiated from a source IP address. Valid values: **1** to **500000**.
             */
            public Builder maxconn(Integer maxconn) {
                this.maxconn = maxconn;
                return this;
            }

            /**
             * The status of the Source Concurrent Connection Rate Limit switch. Valid values:
             * <p>
             * 
             * *   **0**: The switch is turned off.
             * *   **1**: The switch is turned on.
             */
            public Builder maxconnEnable(Integer maxconnEnable) {
                this.maxconnEnable = maxconnEnable;
                return this;
            }

            /**
             * The packets per second (pps) limit for a source IP address. Valid values: **1** to **100000**. Unit: packets/s. Default value: **0**, which indicates that the pps for a source IP address is unlimited.
             */
            public Builder pps(Long pps) {
                this.pps = pps;
                return this;
            }

            public Slimit build() {
                return new Slimit(this);
            } 

        } 

    }
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cc")
        private Cc cc;

        @com.aliyun.core.annotation.NameInMap("NodataConn")
        private String nodataConn;

        @com.aliyun.core.annotation.NameInMap("PayloadLen")
        private PayloadLen payloadLen;

        @com.aliyun.core.annotation.NameInMap("PersistenceTimeout")
        private Integer persistenceTimeout;

        @com.aliyun.core.annotation.NameInMap("Sla")
        private Sla sla;

        @com.aliyun.core.annotation.NameInMap("Slimit")
        private Slimit slimit;

        @com.aliyun.core.annotation.NameInMap("Synproxy")
        private String synproxy;

        private Config(Builder builder) {
            this.cc = builder.cc;
            this.nodataConn = builder.nodataConn;
            this.payloadLen = builder.payloadLen;
            this.persistenceTimeout = builder.persistenceTimeout;
            this.sla = builder.sla;
            this.slimit = builder.slimit;
            this.synproxy = builder.synproxy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return cc
         */
        public Cc getCc() {
            return this.cc;
        }

        /**
         * @return nodataConn
         */
        public String getNodataConn() {
            return this.nodataConn;
        }

        /**
         * @return payloadLen
         */
        public PayloadLen getPayloadLen() {
            return this.payloadLen;
        }

        /**
         * @return persistenceTimeout
         */
        public Integer getPersistenceTimeout() {
            return this.persistenceTimeout;
        }

        /**
         * @return sla
         */
        public Sla getSla() {
            return this.sla;
        }

        /**
         * @return slimit
         */
        public Slimit getSlimit() {
            return this.slimit;
        }

        /**
         * @return synproxy
         */
        public String getSynproxy() {
            return this.synproxy;
        }

        public static final class Builder {
            private Cc cc; 
            private String nodataConn; 
            private PayloadLen payloadLen; 
            private Integer persistenceTimeout; 
            private Sla sla; 
            private Slimit slimit; 
            private String synproxy; 

            /**
             * The protection policy applied when the number of connections initiated from a source IP address frequently exceeds the limit.
             */
            public Builder cc(Cc cc) {
                this.cc = cc;
                return this;
            }

            /**
             * The status of the Empty Connection switch. Valid values:
             * <p>
             * 
             * *   **on**: The switch is turned on.
             * *   **off**: The switch is turned off.
             */
            public Builder nodataConn(String nodataConn) {
                this.nodataConn = nodataConn;
                return this;
            }

            /**
             * The settings of the Packet Length Limit policy.
             */
            public Builder payloadLen(PayloadLen payloadLen) {
                this.payloadLen = payloadLen;
                return this;
            }

            /**
             * The timeout period of session persistence. Valid values: **30** to **3600**. Unit: seconds. Default value: **0**, which indicates that session persistence is disabled.
             */
            public Builder persistenceTimeout(Integer persistenceTimeout) {
                this.persistenceTimeout = persistenceTimeout;
                return this;
            }

            /**
             * The settings of the Speed Limit for Destination policy.
             */
            public Builder sla(Sla sla) {
                this.sla = sla;
                return this;
            }

            /**
             * The settings of the Speed Limit for Source policy.
             */
            public Builder slimit(Slimit slimit) {
                this.slimit = slimit;
                return this;
            }

            /**
             * The status of the False Source switch. Valid values:
             * <p>
             * 
             * *   **on**: The switch is turned on.
             * *   **off**: The switch is turned off.
             */
            public Builder synproxy(String synproxy) {
                this.synproxy = synproxy;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    public static class NetworkRuleAttributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private Config config;

        @com.aliyun.core.annotation.NameInMap("FrontendPort")
        private Integer frontendPort;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        private NetworkRuleAttributes(Builder builder) {
            this.config = builder.config;
            this.frontendPort = builder.frontendPort;
            this.instanceId = builder.instanceId;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkRuleAttributes create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public Config getConfig() {
            return this.config;
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

        public static final class Builder {
            private Config config; 
            private Integer frontendPort; 
            private String instanceId; 
            private String protocol; 

            /**
             * The mitigation settings of the port forwarding rule.
             */
            public Builder config(Config config) {
                this.config = config;
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

            public NetworkRuleAttributes build() {
                return new NetworkRuleAttributes(this);
            } 

        } 

    }
}
