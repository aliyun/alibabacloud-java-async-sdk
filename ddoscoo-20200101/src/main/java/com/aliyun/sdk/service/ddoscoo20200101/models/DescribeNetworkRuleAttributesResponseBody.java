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
 * {@link DescribeNetworkRuleAttributesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNetworkRuleAttributesResponseBody</p>
 */
public class DescribeNetworkRuleAttributesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NetworkRuleAttributes")
    private java.util.List<NetworkRuleAttributes> networkRuleAttributes;

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
    public java.util.List<NetworkRuleAttributes> getNetworkRuleAttributes() {
        return this.networkRuleAttributes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<NetworkRuleAttributes> networkRuleAttributes; 
        private String requestId; 

        /**
         * <p>An array that consists of the mitigation settings of the port forwarding rule for a non-website service. The mitigation settings include session persistence and DDoS mitigation policies.</p>
         */
        public Builder networkRuleAttributes(java.util.List<NetworkRuleAttributes> networkRuleAttributes) {
            this.networkRuleAttributes = networkRuleAttributes;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F9F2F77D-307C-4F15-8D02-AB5957EEBF97</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeNetworkRuleAttributesResponseBody build() {
            return new DescribeNetworkRuleAttributesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNetworkRuleAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkRuleAttributesResponseBody</p>
     */
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
             * <p>The threshold that the number of connections initiated from a source IP address can exceed the limit. Set the value to <strong>5</strong>. If the number of connections initiated from a source IP address exceeds the limit five times during the check, the source IP address is added to the blacklist.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder cnt(Integer cnt) {
                this.cnt = cnt;
                return this;
            }

            /**
             * <p>The interval at which checks are performed. Set the value to <strong>60</strong>. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder during(Integer during) {
                this.during = during;
                return this;
            }

            /**
             * <p>The validity period of the IP address in the blacklist. Valid values: <strong>60</strong> to <strong>604800</strong>. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder expires(Integer expires) {
                this.expires = expires;
                return this;
            }

            /**
             * <p>The type of the limit that causes a source IP address to be added to the blacklist. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Source New Connection Rate Limit</li>
             * <li><strong>2</strong>: Source Concurrent Connection Rate Limit</li>
             * <li><strong>3</strong>: PPS Limit for Source</li>
             * <li><strong>4</strong>: Bandwidth Limit for Source</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link DescribeNetworkRuleAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkRuleAttributesResponseBody</p>
     */
    public static class Cc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Sblack")
        private java.util.List<Sblack> sblack;

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
        public java.util.List<Sblack> getSblack() {
            return this.sblack;
        }

        public static final class Builder {
            private java.util.List<Sblack> sblack; 

            /**
             * <p>The protection policy that a source IP address is added to the blacklist when the number of connections initiated from the IP address frequently exceeds the limit.</p>
             */
            public Builder sblack(java.util.List<Sblack> sblack) {
                this.sblack = sblack;
                return this;
            }

            public Cc build() {
                return new Cc(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNetworkRuleAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkRuleAttributesResponseBody</p>
     */
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
             * <p>The maximum length of a packet. Valid values: <strong>0</strong> to <strong>6000</strong>. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>6000</p>
             */
            public Builder max(Integer max) {
                this.max = max;
                return this;
            }

            /**
             * <p>The minimum length of a packet. Valid values: <strong>0</strong> to <strong>6000</strong>. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link DescribeNetworkRuleAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkRuleAttributesResponseBody</p>
     */
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
             * <p>The maximum number of new connections per second that can be established over the port of the destination instance. Valid values: <strong>100</strong> to <strong>100000</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>100000</p>
             */
            public Builder cps(Integer cps) {
                this.cps = cps;
                return this;
            }

            /**
             * <p>The status of the Destination New Connection Rate Limit switch. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The switch is turned off.</li>
             * <li><strong>1</strong>: The switch is turned on.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cpsEnable(Integer cpsEnable) {
                this.cpsEnable = cpsEnable;
                return this;
            }

            /**
             * <p>The maximum number of concurrent connections that can be established over the port of the destination instance. Valid values: <strong>1000</strong> to <strong>1000000</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>1000000</p>
             */
            public Builder maxconn(Integer maxconn) {
                this.maxconn = maxconn;
                return this;
            }

            /**
             * <p>The status of the Destination Concurrent Connection Rate Limit switch. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The switch is turned off.</li>
             * <li><strong>1</strong>: The switch is turned on.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link DescribeNetworkRuleAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkRuleAttributesResponseBody</p>
     */
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
             * <p>The bandwidth limit for a source IP address. Valid values: <strong>1024</strong> to <strong>268435456</strong>. Unit: bytes/s. Default value: <strong>0</strong>, which indicates that the bandwidth for a source IP address is unlimited.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder bps(Long bps) {
                this.bps = bps;
                return this;
            }

            /**
             * <p>The maximum number of new connections per second that can be initiated from a source IP address. Valid values: <strong>1</strong> to <strong>500000</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder cps(Integer cps) {
                this.cps = cps;
                return this;
            }

            /**
             * <p>The status of the Source New Connection Rate Limit switch. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The switch is turned off.</li>
             * <li><strong>1</strong>: The switch is turned on.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder cpsEnable(Integer cpsEnable) {
                this.cpsEnable = cpsEnable;
                return this;
            }

            /**
             * <p>The mode of the Source New Connection Rate Limit switch. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: the manual mode</li>
             * <li><strong>2</strong>: the automatic mode</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cpsMode(Integer cpsMode) {
                this.cpsMode = cpsMode;
                return this;
            }

            /**
             * <p>The maximum number of concurrent connections initiated from a source IP address. Valid values: <strong>1</strong> to <strong>500000</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxconn(Integer maxconn) {
                this.maxconn = maxconn;
                return this;
            }

            /**
             * <p>The status of the Source Concurrent Connection Rate Limit switch. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The switch is turned off.</li>
             * <li><strong>1</strong>: The switch is turned on.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxconnEnable(Integer maxconnEnable) {
                this.maxconnEnable = maxconnEnable;
                return this;
            }

            /**
             * <p>The packets per second (pps) limit for a source IP address. Valid values: <strong>1</strong> to <strong>100000</strong>. Unit: packets/s. Default value: <strong>0</strong>, which indicates that the pps for a source IP address is unlimited.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link DescribeNetworkRuleAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkRuleAttributesResponseBody</p>
     */
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
             * <p>The protection policy applied when the number of connections initiated from a source IP address frequently exceeds the limit.</p>
             */
            public Builder cc(Cc cc) {
                this.cc = cc;
                return this;
            }

            /**
             * <p>The status of the Empty Connection switch. Valid values:</p>
             * <ul>
             * <li><strong>on</strong>: The switch is turned on.</li>
             * <li><strong>off</strong>: The switch is turned off.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder nodataConn(String nodataConn) {
                this.nodataConn = nodataConn;
                return this;
            }

            /**
             * <p>The settings of the Packet Length Limit policy.</p>
             */
            public Builder payloadLen(PayloadLen payloadLen) {
                this.payloadLen = payloadLen;
                return this;
            }

            /**
             * <p>The timeout period of session persistence. Valid values: <strong>30</strong> to <strong>3600</strong>. Unit: seconds. Default value: <strong>0</strong>, which indicates that session persistence is disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder persistenceTimeout(Integer persistenceTimeout) {
                this.persistenceTimeout = persistenceTimeout;
                return this;
            }

            /**
             * <p>The settings of the Speed Limit for Destination policy.</p>
             */
            public Builder sla(Sla sla) {
                this.sla = sla;
                return this;
            }

            /**
             * <p>The settings of the Speed Limit for Source policy.</p>
             */
            public Builder slimit(Slimit slimit) {
                this.slimit = slimit;
                return this;
            }

            /**
             * <p>The status of the False Source switch. Valid values:</p>
             * <ul>
             * <li><strong>on</strong>: The switch is turned on.</li>
             * <li><strong>off</strong>: The switch is turned off.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
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
    /**
     * 
     * {@link DescribeNetworkRuleAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkRuleAttributesResponseBody</p>
     */
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
             * <p>The mitigation settings of the port forwarding rule.</p>
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The forwarding port.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
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

            public NetworkRuleAttributes build() {
                return new NetworkRuleAttributes(this);
            } 

        } 

    }
}
