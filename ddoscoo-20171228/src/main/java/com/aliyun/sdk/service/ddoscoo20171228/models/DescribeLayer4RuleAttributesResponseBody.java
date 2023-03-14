// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLayer4RuleAttributesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLayer4RuleAttributesResponseBody</p>
 */
public class DescribeLayer4RuleAttributesResponseBody extends TeaModel {
    @NameInMap("Listeners")
    private java.util.List < Listeners> listeners;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeLayer4RuleAttributesResponseBody(Builder builder) {
        this.listeners = builder.listeners;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLayer4RuleAttributesResponseBody create() {
        return builder().build();
    }

    /**
     * @return listeners
     */
    public java.util.List < Listeners> getListeners() {
        return this.listeners;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Listeners> listeners; 
        private String requestId; 

        /**
         * Listeners.
         */
        public Builder listeners(java.util.List < Listeners> listeners) {
            this.listeners = listeners;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLayer4RuleAttributesResponseBody build() {
            return new DescribeLayer4RuleAttributesResponseBody(this);
        } 

    } 

    public static class Sblack extends TeaModel {
        @NameInMap("Cnt")
        private Integer cnt;

        @NameInMap("During")
        private Integer during;

        @NameInMap("Expires")
        private Integer expires;

        @NameInMap("Type")
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
             * Cnt.
             */
            public Builder cnt(Integer cnt) {
                this.cnt = cnt;
                return this;
            }

            /**
             * During.
             */
            public Builder during(Integer during) {
                this.during = during;
                return this;
            }

            /**
             * Expires.
             */
            public Builder expires(Integer expires) {
                this.expires = expires;
                return this;
            }

            /**
             * Type.
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
        @NameInMap("Sblack")
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
             * Sblack.
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
        @NameInMap("Max")
        private Integer max;

        @NameInMap("Min")
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
             * Max.
             */
            public Builder max(Integer max) {
                this.max = max;
                return this;
            }

            /**
             * Min.
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
        @NameInMap("Cps")
        private Integer cps;

        @NameInMap("CpsEnable")
        private Integer cpsEnable;

        @NameInMap("Maxconn")
        private Integer maxconn;

        @NameInMap("MaxconnEnable")
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
             * Cps.
             */
            public Builder cps(Integer cps) {
                this.cps = cps;
                return this;
            }

            /**
             * CpsEnable.
             */
            public Builder cpsEnable(Integer cpsEnable) {
                this.cpsEnable = cpsEnable;
                return this;
            }

            /**
             * Maxconn.
             */
            public Builder maxconn(Integer maxconn) {
                this.maxconn = maxconn;
                return this;
            }

            /**
             * MaxconnEnable.
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
        @NameInMap("Bps")
        private Long bps;

        @NameInMap("Cps")
        private Integer cps;

        @NameInMap("CpsEnable")
        private Integer cpsEnable;

        @NameInMap("CpsMode")
        private Integer cpsMode;

        @NameInMap("Maxconn")
        private Integer maxconn;

        @NameInMap("MaxconnEnable")
        private Integer maxconnEnable;

        @NameInMap("Pps")
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
             * Bps.
             */
            public Builder bps(Long bps) {
                this.bps = bps;
                return this;
            }

            /**
             * Cps.
             */
            public Builder cps(Integer cps) {
                this.cps = cps;
                return this;
            }

            /**
             * CpsEnable.
             */
            public Builder cpsEnable(Integer cpsEnable) {
                this.cpsEnable = cpsEnable;
                return this;
            }

            /**
             * CpsMode.
             */
            public Builder cpsMode(Integer cpsMode) {
                this.cpsMode = cpsMode;
                return this;
            }

            /**
             * Maxconn.
             */
            public Builder maxconn(Integer maxconn) {
                this.maxconn = maxconn;
                return this;
            }

            /**
             * MaxconnEnable.
             */
            public Builder maxconnEnable(Integer maxconnEnable) {
                this.maxconnEnable = maxconnEnable;
                return this;
            }

            /**
             * Pps.
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
        @NameInMap("Cc")
        private Cc cc;

        @NameInMap("NodataConn")
        private String nodataConn;

        @NameInMap("PayloadLen")
        private PayloadLen payloadLen;

        @NameInMap("PersistenceTimeout")
        private Integer persistenceTimeout;

        @NameInMap("Sla")
        private Sla sla;

        @NameInMap("Slimit")
        private Slimit slimit;

        @NameInMap("Synproxy")
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
             * Cc.
             */
            public Builder cc(Cc cc) {
                this.cc = cc;
                return this;
            }

            /**
             * NodataConn.
             */
            public Builder nodataConn(String nodataConn) {
                this.nodataConn = nodataConn;
                return this;
            }

            /**
             * PayloadLen.
             */
            public Builder payloadLen(PayloadLen payloadLen) {
                this.payloadLen = payloadLen;
                return this;
            }

            /**
             * PersistenceTimeout.
             */
            public Builder persistenceTimeout(Integer persistenceTimeout) {
                this.persistenceTimeout = persistenceTimeout;
                return this;
            }

            /**
             * Sla.
             */
            public Builder sla(Sla sla) {
                this.sla = sla;
                return this;
            }

            /**
             * Slimit.
             */
            public Builder slimit(Slimit slimit) {
                this.slimit = slimit;
                return this;
            }

            /**
             * Synproxy.
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
    public static class Listeners extends TeaModel {
        @NameInMap("Config")
        private Config config;

        @NameInMap("FrontendPort")
        private Integer frontendPort;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Protocol")
        private String protocol;

        private Listeners(Builder builder) {
            this.config = builder.config;
            this.frontendPort = builder.frontendPort;
            this.instanceId = builder.instanceId;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Listeners create() {
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
             * Config.
             */
            public Builder config(Config config) {
                this.config = config;
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

            public Listeners build() {
                return new Listeners(this);
            } 

        } 

    }
}
