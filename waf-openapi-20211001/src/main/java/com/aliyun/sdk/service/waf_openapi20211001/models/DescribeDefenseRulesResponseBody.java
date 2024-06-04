// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDefenseRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDefenseRulesResponseBody</p>
 */
public class DescribeDefenseRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rules")
    private java.util.List < Rules> rules;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeDefenseRulesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.rules = builder.rules;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDefenseRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rules
     */
    public java.util.List < Rules> getRules() {
        return this.rules;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Rules> rules; 
        private Long totalCount; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * An array of protection rules.
         */
        public Builder rules(java.util.List < Rules> rules) {
            this.rules = rules;
            return this;
        }

        /**
         * The total number of returned entries.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDefenseRulesResponseBody build() {
            return new DescribeDefenseRulesResponseBody(this);
        } 

    } 

    public static class Rules extends TeaModel {
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

        private Rules(Builder builder) {
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

        public static Rules create() {
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
             * The details of the protection rule. The value is a string that contains multiple parameters in the JSON format. For more information, see the "**Rule parameters**" section in the [CreateDefenseRule](~~CreateDefenseRule~~) topic.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * The origin of the protection rule. Valid values:
             * <p>
             * 
             * *   **custom:** The protection rule is created by the user.
             * *   **system:** The protection rule is automatically generated by the system.
             */
            public Builder defenseOrigin(String defenseOrigin) {
                this.defenseOrigin = defenseOrigin;
                return this;
            }

            /**
             * The scenario in which the protection rule is used. For more information, see the description of the **DefenseScene** parameter in the [CreateDefenseRule](~~CreateDefenseRule~~) topic.
             */
            public Builder defenseScene(String defenseScene) {
                this.defenseScene = defenseScene;
                return this;
            }

            /**
             * The most recent time when the protection rule was modified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The ID of the protection rule.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * The name of the protection rule.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * The status of the protection rule. Valid values:
             * <p>
             * 
             * *   **0:** disabled.
             * *   **1:** enabled.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the protection rule template.
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
}
