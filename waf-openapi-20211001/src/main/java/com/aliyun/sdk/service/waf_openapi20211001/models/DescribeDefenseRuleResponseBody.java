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
     * @return rule
     */
    public Rule getRule() {
        return this.rule;
    }

    public static final class Builder {
        private String requestId; 
        private Rule rule; 

        private Builder() {
        } 

        private Builder(DescribeDefenseRuleResponseBody model) {
            this.requestId = model.requestId;
            this.rule = model.rule;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D7861F61-5B61-46CE-A47C-6B19160D5EB0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The rule configuration, which is a string converted from a JSON object constructed with a series of parameters.</p>
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

        @com.aliyun.core.annotation.NameInMap("DefenseType")
        private String defenseType;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("Resource")
        private String resource;

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
            this.defenseType = builder.defenseType;
            this.gmtModified = builder.gmtModified;
            this.resource = builder.resource;
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
         * @return defenseType
         */
        public String getDefenseType() {
            return this.defenseType;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return resource
         */
        public String getResource() {
            return this.resource;
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
            private String defenseType; 
            private Long gmtModified; 
            private String resource; 
            private Long ruleId; 
            private String ruleName; 
            private Integer status; 
            private Long templateId; 

            private Builder() {
            } 

            private Builder(Rule model) {
                this.config = model.config;
                this.defenseOrigin = model.defenseOrigin;
                this.defenseScene = model.defenseScene;
                this.defenseType = model.defenseType;
                this.gmtModified = model.gmtModified;
                this.resource = model.resource;
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
                this.status = model.status;
                this.templateId = model.templateId;
            } 

            /**
             * <p>The details of the protection rule, which is a string converted from a JSON object constructed with a series of parameters. For more information, refer to the <strong>protection rule parameter description</strong> in <a href="https://help.aliyun.com/document_detail/461421.html">CreateDefenseRule</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;status\&quot;:1,\&quot;policyId\&quot;:1012,\&quot;action\&quot;:\&quot;block\&quot;}</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The origin of the protection rule. Valid values:</p>
             * <ul>
             * <li><p><strong>custom</strong>: user-defined.</p>
             * </li>
             * <li><p><strong>system</strong>: automatically generated by the system.</p>
             * </li>
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
             * <p>The protection scenario.</p>
             * <p>When the <strong>DefenseType</strong> parameter is set to <strong>template</strong>, valid values:</p>
             * <ul>
             * <li><strong>waf_group</strong>: regex rules for basic protection.</li>
             * <li><strong>waf_base</strong>: new Web core protection.</li>
             * <li><strong>waf_base_compliance</strong>: protocol compliance rules for basic protection.</li>
             * <li><strong>waf_base_sema</strong>: semantic rules for basic protection.</li>
             * <li><strong>cc</strong>: HTTP flood protection.</li>
             * <li><strong>antiscan_dirscan</strong>: directory traversal blocking in scan protection.</li>
             * <li><strong>antiscan_highfreq</strong>: high-frequency scan blocking in scan protection.</li>
             * <li><strong>antiscan_scantools</strong>: scan tool blocking in scan protection.</li>
             * <li><strong>ip_blacklist</strong>: IP blacklist.</li>
             * <li><strong>custom_acl</strong>: custom rules.</li>
             * <li><strong>region_block</strong>: location blacklist.</li>
             * <li><strong>tamperproof</strong>: web tamper proofing.</li>
             * <li><strong>dlp</strong>: information leak prevention.</li>
             * <li><strong>custom_response_block</strong>: custom response.</li>
             * <li><strong>spike_throttle</strong>: peak traffic throttling.</li>
             * </ul>
             * <p>When the <strong>DefenseType</strong> parameter is set to <strong>resource</strong>, valid values:</p>
             * <ul>
             * <li><strong>account_identifier</strong>: account extraction.</li>
             * <li><strong>custom_response</strong>: new custom response.</li>
             * <li><strong>waf_codec</strong>: decoding.</li>
             * </ul>
             * <p>When the <strong>DefenseType</strong> parameter is set to <strong>global</strong>, valid values:</p>
             * <ul>
             * <li><strong>regular_custom</strong>: custom regex.</li>
             * <li><strong>address_book</strong>: address book.</li>
             * <li><strong>custom_response</strong>: new custom response.</li>
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
             * <p>The type of the protection rule. Valid values:</p>
             * <ul>
             * <li><p><strong>template</strong> (default): template protection rule.</p>
             * </li>
             * <li><p><strong>resource</strong>: protection object-level rule.</p>
             * </li>
             * <li><p><strong>global</strong>: global-level rule.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>template</p>
             */
            public Builder defenseType(String defenseType) {
                this.defenseType = defenseType;
                return this;
            }

            /**
             * <p>The time when the protection rule was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1665196746000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The protected object to which the rule belongs.</p>
             * <blockquote>
             * <p>This parameter is returned only when <strong>DefenseType</strong> is set to <strong>resource</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>rencs***-waf</p>
             */
            public Builder resource(String resource) {
                this.resource = resource;
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
             * <li><p><strong>0</strong>: Disabled.</p>
             * </li>
             * <li><p><strong>1</strong>: Enabled.</p>
             * </li>
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
             * <blockquote>
             * <p>This parameter is returned only when <strong>DefenseType</strong> is set to <strong>template</strong>.</p>
             * </blockquote>
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
