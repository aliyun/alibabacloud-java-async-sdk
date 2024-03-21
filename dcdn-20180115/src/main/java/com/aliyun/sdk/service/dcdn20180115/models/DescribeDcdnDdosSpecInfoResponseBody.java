// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnDdosSpecInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnDdosSpecInfoResponseBody</p>
 */
public class DescribeDcdnDdosSpecInfoResponseBody extends TeaModel {
    @NameInMap("BandwidthLimit")
    private String bandwidthLimit;

    @NameInMap("Edition")
    private String edition;

    @NameInMap("Enable")
    private String enable;

    @NameInMap("IsSpecialPort")
    private String isSpecialPort;

    @NameInMap("ProtectedArea")
    private String protectedArea;

    @NameInMap("QpsLimit")
    private String qpsLimit;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SpecInfos")
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
         * The bandwidth limit of a single instance.
         */
        public Builder bandwidthLimit(String bandwidthLimit) {
            this.bandwidthLimit = bandwidthLimit;
            return this;
        }

        /**
         * The version. Valid values:
         * <p>
         * 
         * * **poc**: POC Edition
         * * **basic**: Basic Edition
         * * **insurance**: Insurance Edition
         * * **unlimited**: Unlimited Edition
         * * **port_enhancement**: Special Port Enhanced Edition
         */
        public Builder edition(String edition) {
            this.edition = edition;
            return this;
        }

        /**
         * Specifies whether to enable DDoS mitigation. Valid values:
         * <p>
         * 
         * *   **on:**
         * *   **off**.
         */
        public Builder enable(String enable) {
            this.enable = enable;
            return this;
        }

        /**
         * Specifies whether custom ports are supported. Valid values:
         * <p>
         * 
         * *   **yes**
         * *   **no**
         */
        public Builder isSpecialPort(String isSpecialPort) {
            this.isSpecialPort = isSpecialPort;
            return this;
        }

        /**
         * Protected region. Valid values:
         * <p>
         * 
         * * **global**: global
         * * **chinese_mainland**: Chinese mainland
         * * **global_excluding_the_chinese_mainland**: outside the Chinese mainland
         */
        public Builder protectedArea(String protectedArea) {
            this.protectedArea = protectedArea;
            return this;
        }

        /**
         * The QPS limit.
         */
        public Builder qpsLimit(String qpsLimit) {
            this.qpsLimit = qpsLimit;
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
         * The code and configurations of the security rules.
         */
        public Builder specInfos(java.util.List < SpecInfos> specInfos) {
            this.specInfos = specInfos;
            return this;
        }

        public DescribeDcdnDdosSpecInfoResponseBody build() {
            return new DescribeDcdnDdosSpecInfoResponseBody(this);
        } 

    } 

    public static class Configs extends TeaModel {
        @NameInMap("Config")
        private String config;

        @NameInMap("Expr")
        private String expr;

        @NameInMap("Value")
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
             * The configuration code of the version rule. Valid values:
             * <p>
             * 
             * *   **total_defense_num**: the total number of mitigation sessions of the version.
             * *   **consume_defense_num**: the number of used mitigation sessions of the version.
             * *   **max_domain_num**: the limit on the number of added domain names.
             * *   **emain_domain_num**: the number of added domain names.
             * *   **defence_package_num**: the total number of purchased additional mitigation sessions.
             * *   **consume_defence_package_num**: the number of used additional mitigation sessions.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * The configuration expression of the version rule.
             */
            public Builder expr(String expr) {
                this.expr = expr;
                return this;
            }

            /**
             * The value of the configuration expression of the version rule.
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
    public static class SpecInfos extends TeaModel {
        @NameInMap("Configs")
        private java.util.List < Configs> configs;

        @NameInMap("Rule")
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
             * The configurations of the version rule.
             */
            public Builder configs(java.util.List < Configs> configs) {
                this.configs = configs;
                return this;
            }

            /**
             * The version rule. Valid values:
             * <p>
             * 
             * *   **version_defense_num**: the rule for the number of version mitigation sessions
             * *   **domain_num**: the rule for the limit on the number of domain names
             * *   **defence_package_num**: the rule for extra mitigation session plans
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
