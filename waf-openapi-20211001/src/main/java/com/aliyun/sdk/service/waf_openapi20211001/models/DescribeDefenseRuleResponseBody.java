// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDefenseRuleResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDefenseRuleResponseBody</p>
 */
public class DescribeDefenseRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rule")
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D7861F61-5B61-46CE-A47C-6B19160D5EB0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The configurations of the protection rule. The value is a JSON string that contains multiple parameters.</p>
         */
        public Builder rule(Rule rule) {
            this.rule = rule;
            return this;
        }

        public DescribeDefenseRuleResponseBody build() {
            return new DescribeDefenseRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDefenseRuleResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDefenseRuleResponseBody</p>
     */
    public static class Rule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("DefenseOrigin")
        private String defenseOrigin;

        @com.aliyun.core.annotation.NameInMap("DefenseScene")
        private String defenseScene;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
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
             * <p>The details of the protection rule. The value is a JSON string that contains multiple parameters. For more information, see the &quot;<strong>Protection rule parameters</strong>&quot; section of the <a href="~~CreateDefenseRule~~">CreateDefenseRule</a> topic.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;status&quot;:1,&quot;policyId&quot;:1012,&quot;action&quot;:&quot;block&quot;}</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The origin of the protection rule. Valid values:</p>
             * <ul>
             * <li><strong>custom:</strong> The protection rule is created by the user.</li>
             * <li><strong>system:</strong> The protection rule is automatically generated by the system.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>custom</p>
             */
            public Builder defenseOrigin(String defenseOrigin) {
                this.defenseOrigin = defenseOrigin;
                return this;
            }

            /**
             * <p>The scenario in which the protection rule is used. For more information, see the description of <strong>DefenseScene</strong> in the <a href="~~CreateDefenseRule~~">CreateDefenseRule</a> topic.</p>
             * 
             * <strong>example:</strong>
             * <p>waf_group</p>
             */
            public Builder defenseScene(String defenseScene) {
                this.defenseScene = defenseScene;
                return this;
            }

            /**
             * <p>The most recent time when the protection rule was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1665196746000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the protection rule.</p>
             * 
             * <strong>example:</strong>
             * <p>2732975</p>
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The name of the protection rule.</p>
             * 
             * <strong>example:</strong>
             * <p>test1</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The status of the protection rule. Valid values:</p>
             * <ul>
             * <li><strong>0:</strong> disabled.</li>
             * <li><strong>1:</strong> enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the protection rule template.</p>
             * 
             * <strong>example:</strong>
             * <p>9114</p>
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
