// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeMaskingRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMaskingRulesResponseBody</p>
 */
public class DescribeMaskingRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeMaskingRulesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMaskingRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMaskingRulesResponseBody build() {
            return new DescribeMaskingRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMaskingRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMaskingRulesResponseBody</p>
     */
    public static class RuleConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Columns")
        private java.util.List<String> columns;

        @com.aliyun.core.annotation.NameInMap("Databases")
        private java.util.List<String> databases;

        @com.aliyun.core.annotation.NameInMap("Tables")
        private java.util.List<String> tables;

        private RuleConfig(Builder builder) {
            this.columns = builder.columns;
            this.databases = builder.databases;
            this.tables = builder.tables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleConfig create() {
            return builder().build();
        }

        /**
         * @return columns
         */
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        /**
         * @return databases
         */
        public java.util.List<String> getDatabases() {
            return this.databases;
        }

        /**
         * @return tables
         */
        public java.util.List<String> getTables() {
            return this.tables;
        }

        public static final class Builder {
            private java.util.List<String> columns; 
            private java.util.List<String> databases; 
            private java.util.List<String> tables; 

            /**
             * Columns.
             */
            public Builder columns(java.util.List<String> columns) {
                this.columns = columns;
                return this;
            }

            /**
             * Databases.
             */
            public Builder databases(java.util.List<String> databases) {
                this.databases = databases;
                return this;
            }

            /**
             * Tables.
             */
            public Builder tables(java.util.List<String> tables) {
                this.tables = tables;
                return this;
            }

            public RuleConfig build() {
                return new RuleConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMaskingRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMaskingRulesResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultAlgo")
        private String defaultAlgo;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private String enabled;

        @com.aliyun.core.annotation.NameInMap("MaskingAlgo")
        private String maskingAlgo;

        @com.aliyun.core.annotation.NameInMap("RuleConfig")
        private RuleConfig ruleConfig;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        private Rules(Builder builder) {
            this.defaultAlgo = builder.defaultAlgo;
            this.enabled = builder.enabled;
            this.maskingAlgo = builder.maskingAlgo;
            this.ruleConfig = builder.ruleConfig;
            this.ruleName = builder.ruleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return defaultAlgo
         */
        public String getDefaultAlgo() {
            return this.defaultAlgo;
        }

        /**
         * @return enabled
         */
        public String getEnabled() {
            return this.enabled;
        }

        /**
         * @return maskingAlgo
         */
        public String getMaskingAlgo() {
            return this.maskingAlgo;
        }

        /**
         * @return ruleConfig
         */
        public RuleConfig getRuleConfig() {
            return this.ruleConfig;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        public static final class Builder {
            private String defaultAlgo; 
            private String enabled; 
            private String maskingAlgo; 
            private RuleConfig ruleConfig; 
            private String ruleName; 

            /**
             * DefaultAlgo.
             */
            public Builder defaultAlgo(String defaultAlgo) {
                this.defaultAlgo = defaultAlgo;
                return this;
            }

            /**
             * Enabled.
             */
            public Builder enabled(String enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * MaskingAlgo.
             */
            public Builder maskingAlgo(String maskingAlgo) {
                this.maskingAlgo = maskingAlgo;
                return this;
            }

            /**
             * RuleConfig.
             */
            public Builder ruleConfig(RuleConfig ruleConfig) {
                this.ruleConfig = ruleConfig;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMaskingRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMaskingRulesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List<Rules> rules;

        private Data(Builder builder) {
            this.rules = builder.rules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return rules
         */
        public java.util.List<Rules> getRules() {
            return this.rules;
        }

        public static final class Builder {
            private java.util.List<Rules> rules; 

            /**
             * Rules.
             */
            public Builder rules(java.util.List<Rules> rules) {
                this.rules = rules;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
