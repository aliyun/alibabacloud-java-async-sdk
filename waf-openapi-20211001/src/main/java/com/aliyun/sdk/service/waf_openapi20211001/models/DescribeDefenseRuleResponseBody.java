// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDefenseRuleResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDefenseRuleResponseBody</p>
 */
public class DescribeDefenseRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Rule")
    private Rule rule;

    private DescribeDefenseRuleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.rule = builder.rule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDefenseRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rule
     */
    public Rule getRule() {
        return this.rule;
    }

    public static final class Builder {
        private String requestId; 
        private Rule rule; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Rule.
         */
        public Builder rule(Rule rule) {
            this.rule = rule;
            return this;
        }

        public DescribeDefenseRuleResponseBody build() {
            return new DescribeDefenseRuleResponseBody(this);
        } 

    } 

    public static class Rule extends TeaModel {
        @NameInMap("Config")
        private String config;

        @NameInMap("DefenseOrigin")
        private String defenseOrigin;

        @NameInMap("DefenseScene")
        private String defenseScene;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("RuleId")
        private Long ruleId;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("TemplateId")
        private Long templateId;

        private Rule(Builder builder) {
            this.config = builder.config;
            this.defenseOrigin = builder.defenseOrigin;
            this.defenseScene = builder.defenseScene;
            this.gmtModified = builder.gmtModified;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.status = builder.status;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rule create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return defenseOrigin
         */
        public String getDefenseOrigin() {
            return this.defenseOrigin;
        }

        /**
         * @return defenseScene
         */
        public String getDefenseScene() {
            return this.defenseScene;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return templateId
         */
        public Long getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private String config; 
            private String defenseOrigin; 
            private String defenseScene; 
            private Long gmtModified; 
            private Long ruleId; 
            private String ruleName; 
            private Integer status; 
            private Long templateId; 

            /**
             * Config.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * DefenseOrigin.
             */
            public Builder defenseOrigin(String defenseOrigin) {
                this.defenseOrigin = defenseOrigin;
                return this;
            }

            /**
             * DefenseScene.
             */
            public Builder defenseScene(String defenseScene) {
                this.defenseScene = defenseScene;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            public Rule build() {
                return new Rule(this);
            } 

        } 

    }
}
