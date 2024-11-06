// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnSecSpecInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnSecSpecInfoResponseBody</p>
 */
public class DescribeDcdnSecSpecInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SpecInfos")
    private java.util.List < SpecInfos> specInfos;

    @com.aliyun.core.annotation.NameInMap("Version")
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>32f6cbb7-13e5-403a-9941-4d4e978dd227</p>
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

        /**
         * <p>The version of secure DCDN.</p>
         * 
         * <strong>example:</strong>
         * <p>enterprise</p>
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public DescribeDcdnSecSpecInfoResponseBody build() {
            return new DescribeDcdnSecSpecInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnSecSpecInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnSecSpecInfoResponseBody</p>
     */
    public static class RuleConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Expr")
        private String expr;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The configuration code of the security rule.</p>
             * 
             * <strong>example:</strong>
             * <p>custom_****_number</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The configuration expression of the security rule.</p>
             * 
             * <strong>example:</strong>
             * <p>equal</p>
             */
            public Builder expr(String expr) {
                this.expr = expr;
                return this;
            }

            /**
             * <p>The value of the configuration expression of the security rule.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
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
    /**
     * 
     * {@link DescribeDcdnSecSpecInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnSecSpecInfoResponseBody</p>
     */
    public static class SpecInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleCode")
        private String ruleCode;

        @com.aliyun.core.annotation.NameInMap("RuleConfigs")
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
             * <p>The code of the security rule.</p>
             * 
             * <strong>example:</strong>
             * <p>accurate_***</p>
             */
            public Builder ruleCode(String ruleCode) {
                this.ruleCode = ruleCode;
                return this;
            }

            /**
             * <p>The configurations of the security rule.</p>
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
