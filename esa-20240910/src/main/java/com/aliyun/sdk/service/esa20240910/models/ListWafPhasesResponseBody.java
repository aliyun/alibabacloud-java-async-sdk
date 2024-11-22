// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListWafPhasesResponseBody} extends {@link TeaModel}
 *
 * <p>ListWafPhasesResponseBody</p>
 */
public class ListWafPhasesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Phases")
    private java.util.List < Phases> phases;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListWafPhasesResponseBody(Builder builder) {
        this.phases = builder.phases;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWafPhasesResponseBody create() {
        return builder().build();
    }

    /**
     * @return phases
     */
    public java.util.List < Phases> getPhases() {
        return this.phases;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Phases> phases; 
        private String requestId; 

        /**
         * <p>The WAF rule categories.</p>
         */
        public Builder phases(java.util.List < Phases> phases) {
            this.phases = phases;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListWafPhasesResponseBody build() {
            return new ListWafPhasesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWafPhasesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWafPhasesResponseBody</p>
     */
    public static class Rulesets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List < WafRuleConfig > rules;

        @com.aliyun.core.annotation.NameInMap("Shared")
        private WafBatchRuleShared shared;

        private Rulesets(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.rules = builder.rules;
            this.shared = builder.shared;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rulesets create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return rules
         */
        public java.util.List < WafRuleConfig > getRules() {
            return this.rules;
        }

        /**
         * @return shared
         */
        public WafBatchRuleShared getShared() {
            return this.shared;
        }

        public static final class Builder {
            private Long id; 
            private String name; 
            private java.util.List < WafRuleConfig > rules; 
            private WafBatchRuleShared shared; 

            /**
             * <p>The ID of the WAF ruleset.<a href="~~2850233~~"></a></p>
             * 
             * <strong>example:</strong>
             * <p>10000001</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the WAF ruleset.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The rule configurations in the WAF ruleset.</p>
             */
            public Builder rules(java.util.List < WafRuleConfig > rules) {
                this.rules = rules;
                return this;
            }

            /**
             * <p>The configurations shared by the rules in the WAF ruleset.</p>
             */
            public Builder shared(WafBatchRuleShared shared) {
                this.shared = shared;
                return this;
            }

            public Rulesets build() {
                return new Rulesets(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWafPhasesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWafPhasesResponseBody</p>
     */
    public static class Phases extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Phase")
        private String phase;

        @com.aliyun.core.annotation.NameInMap("Rulesets")
        private java.util.List < Rulesets> rulesets;

        private Phases(Builder builder) {
            this.phase = builder.phase;
            this.rulesets = builder.rulesets;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Phases create() {
            return builder().build();
        }

        /**
         * @return phase
         */
        public String getPhase() {
            return this.phase;
        }

        /**
         * @return rulesets
         */
        public java.util.List < Rulesets> getRulesets() {
            return this.rulesets;
        }

        public static final class Builder {
            private String phase; 
            private java.util.List < Rulesets> rulesets; 

            /**
             * <p>The name of the WAF rule category.</p>
             * 
             * <strong>example:</strong>
             * <p>http_custom</p>
             */
            public Builder phase(String phase) {
                this.phase = phase;
                return this;
            }

            /**
             * <p>The WAF rulesets.</p>
             */
            public Builder rulesets(java.util.List < Rulesets> rulesets) {
                this.rulesets = rulesets;
                return this;
            }

            public Phases build() {
                return new Phases(this);
            } 

        } 

    }
}
