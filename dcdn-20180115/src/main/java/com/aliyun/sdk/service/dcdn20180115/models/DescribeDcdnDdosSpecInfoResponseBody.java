// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnDdosSpecInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnDdosSpecInfoResponseBody</p>
 */
public class DescribeDcdnDdosSpecInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BandwidthLimit")
    private String bandwidthLimit;

    @com.aliyun.core.annotation.NameInMap("Edition")
    private String edition;

    @com.aliyun.core.annotation.NameInMap("Enable")
    private String enable;

    @com.aliyun.core.annotation.NameInMap("IsSpecialPort")
    private String isSpecialPort;

    @com.aliyun.core.annotation.NameInMap("ProtectedArea")
    private String protectedArea;

    @com.aliyun.core.annotation.NameInMap("QpsLimit")
    private String qpsLimit;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SpecInfos")
    private java.util.List < SpecInfos> specInfos;

    private DescribeDcdnDdosSpecInfoResponseBody(Builder builder) {
        this.bandwidthLimit = builder.bandwidthLimit;
        this.edition = builder.edition;
        this.enable = builder.enable;
        this.isSpecialPort = builder.isSpecialPort;
        this.protectedArea = builder.protectedArea;
        this.qpsLimit = builder.qpsLimit;
        this.requestId = builder.requestId;
        this.specInfos = builder.specInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnDdosSpecInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return bandwidthLimit
     */
    public String getBandwidthLimit() {
        return this.bandwidthLimit;
    }

    /**
     * @return edition
     */
    public String getEdition() {
        return this.edition;
    }

    /**
     * @return enable
     */
    public String getEnable() {
        return this.enable;
    }

    /**
     * @return isSpecialPort
     */
    public String getIsSpecialPort() {
        return this.isSpecialPort;
    }

    /**
     * @return protectedArea
     */
    public String getProtectedArea() {
        return this.protectedArea;
    }

    /**
     * @return qpsLimit
     */
    public String getQpsLimit() {
        return this.qpsLimit;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return specInfos
     */
    public java.util.List < SpecInfos> getSpecInfos() {
        return this.specInfos;
    }

    public static final class Builder {
        private String bandwidthLimit; 
        private String edition; 
        private String enable; 
        private String isSpecialPort; 
        private String protectedArea; 
        private String qpsLimit; 
        private String requestId; 
        private java.util.List < SpecInfos> specInfos; 

        /**
         * <p>The bandwidth limit of a single instance.</p>
         * 
         * <strong>example:</strong>
         * <p>40Gbps</p>
         */
        public Builder bandwidthLimit(String bandwidthLimit) {
            this.bandwidthLimit = bandwidthLimit;
            return this;
        }

        /**
         * <p>The version. Valid values:</p>
         * <ul>
         * <li><strong>poc</strong>: POC Edition</li>
         * <li><strong>basic</strong>: Basic Edition</li>
         * <li><strong>insurance</strong>: Insurance Edition</li>
         * <li><strong>unlimited</strong>: Unlimited Edition</li>
         * <li><strong>port_enhancement</strong>: Special Port Enhanced Edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>insurance</p>
         */
        public Builder edition(String edition) {
            this.edition = edition;
            return this;
        }

        /**
         * <p>Specifies whether to enable DDoS mitigation. Valid values:</p>
         * <ul>
         * <li><strong>on:</strong></li>
         * <li><strong>off</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder enable(String enable) {
            this.enable = enable;
            return this;
        }

        /**
         * <p>Specifies whether custom ports are supported. Valid values:</p>
         * <ul>
         * <li><strong>yes</strong></li>
         * <li><strong>no</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>no</p>
         */
        public Builder isSpecialPort(String isSpecialPort) {
            this.isSpecialPort = isSpecialPort;
            return this;
        }

        /**
         * <p>Protected region. Valid values:</p>
         * <ul>
         * <li><strong>global</strong>: global</li>
         * <li><strong>chinese_mainland</strong>: Chinese mainland</li>
         * <li><strong>global_excluding_the_chinese_mainland</strong>: outside the Chinese mainland</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        public Builder protectedArea(String protectedArea) {
            this.protectedArea = protectedArea;
            return this;
        }

        /**
         * <p>The QPS limit.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder qpsLimit(String qpsLimit) {
            this.qpsLimit = qpsLimit;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>DEA8E7BE-33C6-56F5-AC56-74D50547CF34</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The code and configurations of the security rules.</p>
         */
        public Builder specInfos(java.util.List < SpecInfos> specInfos) {
            this.specInfos = specInfos;
            return this;
        }

        public DescribeDcdnDdosSpecInfoResponseBody build() {
            return new DescribeDcdnDdosSpecInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnDdosSpecInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDdosSpecInfoResponseBody</p>
     */
    public static class Configs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("Expr")
        private String expr;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Configs(Builder builder) {
            this.config = builder.config;
            this.expr = builder.expr;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configs create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return expr
         */
        public String getExpr() {
            return this.expr;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String config; 
            private String expr; 
            private String value; 

            /**
             * <p>The configuration code of the version rule. Valid values:</p>
             * <ul>
             * <li><strong>total_defense_num</strong>: the total number of mitigation sessions of the version.</li>
             * <li><strong>consume_defense_num</strong>: the number of used mitigation sessions of the version.</li>
             * <li><strong>max_domain_num</strong>: the limit on the number of added domain names.</li>
             * <li><strong>emain_domain_num</strong>: the number of added domain names.</li>
             * <li><strong>defence_package_num</strong>: the total number of purchased additional mitigation sessions.</li>
             * <li><strong>consume_defence_package_num</strong>: the number of used additional mitigation sessions.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>total_defense_num</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The configuration expression of the version rule.</p>
             * 
             * <strong>example:</strong>
             * <p>equal</p>
             */
            public Builder expr(String expr) {
                this.expr = expr;
                return this;
            }

            /**
             * <p>The value of the configuration expression of the version rule.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Configs build() {
                return new Configs(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDcdnDdosSpecInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDdosSpecInfoResponseBody</p>
     */
    public static class SpecInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Configs")
        private java.util.List < Configs> configs;

        @com.aliyun.core.annotation.NameInMap("Rule")
        private String rule;

        private SpecInfos(Builder builder) {
            this.configs = builder.configs;
            this.rule = builder.rule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpecInfos create() {
            return builder().build();
        }

        /**
         * @return configs
         */
        public java.util.List < Configs> getConfigs() {
            return this.configs;
        }

        /**
         * @return rule
         */
        public String getRule() {
            return this.rule;
        }

        public static final class Builder {
            private java.util.List < Configs> configs; 
            private String rule; 

            /**
             * <p>The configurations of the version rule.</p>
             */
            public Builder configs(java.util.List < Configs> configs) {
                this.configs = configs;
                return this;
            }

            /**
             * <p>The version rule. Valid values:</p>
             * <ul>
             * <li><strong>version_defense_num</strong>: the rule for the number of version mitigation sessions</li>
             * <li><strong>domain_num</strong>: the rule for the limit on the number of domain names</li>
             * <li><strong>defence_package_num</strong>: the rule for extra mitigation session plans</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>version_defense_num</p>
             */
            public Builder rule(String rule) {
                this.rule = rule;
                return this;
            }

            public SpecInfos build() {
                return new SpecInfos(this);
            } 

        } 

    }
}
