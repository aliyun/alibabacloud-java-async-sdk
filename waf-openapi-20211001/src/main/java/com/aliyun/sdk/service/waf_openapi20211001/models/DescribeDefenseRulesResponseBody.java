// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDefenseRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDefenseRulesResponseBody</p>
 */
public class DescribeDefenseRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Rules")
    private java.util.List < Rules> rules;

    @NameInMap("TotalCount")
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Rules.
         */
        public Builder rules(java.util.List < Rules> rules) {
            this.rules = rules;
            return this;
        }

        /**
         * TotalCount.
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

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
}
