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
         * BandwidthLimit.
         */
        public Builder bandwidthLimit(String bandwidthLimit) {
            this.bandwidthLimit = bandwidthLimit;
            return this;
        }

        /**
         * Edition.
         */
        public Builder edition(String edition) {
            this.edition = edition;
            return this;
        }

        /**
         * Enable.
         */
        public Builder enable(String enable) {
            this.enable = enable;
            return this;
        }

        /**
         * IsSpecialPort.
         */
        public Builder isSpecialPort(String isSpecialPort) {
            this.isSpecialPort = isSpecialPort;
            return this;
        }

        /**
         * ProtectedArea.
         */
        public Builder protectedArea(String protectedArea) {
            this.protectedArea = protectedArea;
            return this;
        }

        /**
         * QpsLimit.
         */
        public Builder qpsLimit(String qpsLimit) {
            this.qpsLimit = qpsLimit;
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
         * SpecInfos.
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
             * Config.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * Expr.
             */
            public Builder expr(String expr) {
                this.expr = expr;
                return this;
            }

            /**
             * Value.
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
             * Configs.
             */
            public Builder configs(java.util.List < Configs> configs) {
                this.configs = configs;
                return this;
            }

            /**
             * Rule.
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
