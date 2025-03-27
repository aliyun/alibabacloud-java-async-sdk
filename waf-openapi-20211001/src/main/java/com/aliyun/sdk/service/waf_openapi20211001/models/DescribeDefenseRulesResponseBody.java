// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeDefenseRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDefenseRulesResponseBody</p>
 */
public class DescribeDefenseRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rules")
    private java.util.List<Rules> rules;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Rules> getRules() {
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
        private java.util.List<Rules> rules; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeDefenseRulesResponseBody model) {
            this.requestId = model.requestId;
            this.rules = model.rules;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>80736FA5-FA87-55F6-AA69-C5477C6FE6D0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The protection rules.</p>
         */
        public Builder rules(java.util.List<Rules> rules) {
            this.rules = rules;
            return this;
        }

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDefenseRulesResponseBody build() {
            return new DescribeDefenseRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDefenseRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDefenseRulesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Rules model) {
                this.config = model.config;
                this.defenseOrigin = model.defenseOrigin;
                this.defenseScene = model.defenseScene;
                this.gmtModified = model.gmtModified;
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
                this.status = model.status;
                this.templateId = model.templateId;
            } 

            /**
             * <p>The details of the protection rule. The value is a string that contains multiple parameters in the JSON format. For more information, see the &quot;<strong>Rule parameters</strong>&quot; section in the <a href="~~CreateDefenseRule~~">CreateDefenseRule</a> topic.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;policyId&quot;:1012,&quot;action&quot;:&quot;block&quot;}</p>
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
             * <p>The protection module for which the protection rule is created. Valid values:</p>
             * <ul>
             * <li><strong>waf_group</strong>: the basic protection rule module.</li>
             * <li><strong>waf_base_compliance</strong>: the protocol compliance feature of the basic protection rule module.</li>
             * <li><strong>waf_base_sema</strong>: the semantic analysis feature of the basic protection rule module.</li>
             * <li><strong>cc</strong>: the HTTP flood protection module.</li>
             * <li><strong>antiscan_dirscan</strong>: the directory traversal blocking feature of the scan protection module.</li>
             * <li><strong>antiscan_highfreq</strong>: the high-frequency scanning blocking feature of the scan protection module.</li>
             * <li><strong>antiscan_scantools</strong>: the scanner blocking feature of the scan protection module.</li>
             * <li><strong>ip_blacklist</strong>: the IP address blacklist module.</li>
             * <li><strong>custom_acl</strong>: the custom rule module.</li>
             * <li><strong>region_block</strong>: the region blacklist module.</li>
             * <li><strong>tamperproof</strong>: the website tamper-proofing module.</li>
             * <li><strong>dlp</strong>: the data leakage prevention module.</li>
             * <li><strong>custom_response_block</strong>: the custom response module.</li>
             * </ul>
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
             * <p>1665460629000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the protection rule.</p>
             * 
             * <strong>example:</strong>
             * <p>42755</p>
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The name of the protection rule.</p>
             * 
             * <strong>example:</strong>
             * <p>rules_41</p>
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
             * <p>5673</p>
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
