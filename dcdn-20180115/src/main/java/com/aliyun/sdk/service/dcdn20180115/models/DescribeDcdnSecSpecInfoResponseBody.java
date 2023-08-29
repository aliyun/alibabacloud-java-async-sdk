// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnSecSpecInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnSecSpecInfoResponseBody</p>
 */
public class DescribeDcdnSecSpecInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SpecInfos")
    private java.util.List < SpecInfos> specInfos;

    @NameInMap("Version")
    private String version;

    private DescribeDcdnSecSpecInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.specInfos = builder.specInfos;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnSecSpecInfoResponseBody create() {
        return builder().build();
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

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < SpecInfos> specInfos; 
        private String version; 

        /**
         * The request ID.
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

        /**
         * The version of secure DCDN.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public DescribeDcdnSecSpecInfoResponseBody build() {
            return new DescribeDcdnSecSpecInfoResponseBody(this);
        } 

    } 

    public static class RuleConfigs extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Expr")
        private String expr;

        @NameInMap("Value")
        private String value;

        private RuleConfigs(Builder builder) {
            this.code = builder.code;
            this.expr = builder.expr;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleConfigs create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
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
            private String code; 
            private String expr; 
            private String value; 

            /**
             * The configuration code of the security rule.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The configuration expression of the security rule.
             */
            public Builder expr(String expr) {
                this.expr = expr;
                return this;
            }

            /**
             * The value of the configuration expression of the security rule.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public RuleConfigs build() {
                return new RuleConfigs(this);
            } 

        } 

    }
    public static class SpecInfos extends TeaModel {
        @NameInMap("RuleCode")
        private String ruleCode;

        @NameInMap("RuleConfigs")
        private java.util.List < RuleConfigs> ruleConfigs;

        private SpecInfos(Builder builder) {
            this.ruleCode = builder.ruleCode;
            this.ruleConfigs = builder.ruleConfigs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpecInfos create() {
            return builder().build();
        }

        /**
         * @return ruleCode
         */
        public String getRuleCode() {
            return this.ruleCode;
        }

        /**
         * @return ruleConfigs
         */
        public java.util.List < RuleConfigs> getRuleConfigs() {
            return this.ruleConfigs;
        }

        public static final class Builder {
            private String ruleCode; 
            private java.util.List < RuleConfigs> ruleConfigs; 

            /**
             * The code of the security rule.
             */
            public Builder ruleCode(String ruleCode) {
                this.ruleCode = ruleCode;
                return this;
            }

            /**
             * The configurations of the security rule.
             */
            public Builder ruleConfigs(java.util.List < RuleConfigs> ruleConfigs) {
                this.ruleConfigs = ruleConfigs;
                return this;
            }

            public SpecInfos build() {
                return new SpecInfos(this);
            } 

        } 

    }
}
