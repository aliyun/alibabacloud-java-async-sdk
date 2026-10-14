// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribeL7GlobalRuleResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeL7GlobalRuleResponseBody</p>
 */
public class DescribeL7GlobalRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GlobalRules")
    private java.util.List<GlobalRules> globalRules;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeL7GlobalRuleResponseBody(Builder builder) {
        this.globalRules = builder.globalRules;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeL7GlobalRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return globalRules
     */
    public java.util.List<GlobalRules> getGlobalRules() {
        return this.globalRules;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<GlobalRules> globalRules; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeL7GlobalRuleResponseBody model) {
            this.globalRules = model.globalRules;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The global template rule information.</p>
         */
        public Builder globalRules(java.util.List<GlobalRules> globalRules) {
            this.globalRules = globalRules;
            return this;
        }

        /**
         * <p>The ID of the request. The ID is a unique identifier that Alibaba Cloud generates for the request. You can use the ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>CF33B4C3-196E-4015-AADD-5CAD00057B80</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeL7GlobalRuleResponseBody build() {
            return new DescribeL7GlobalRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeL7GlobalRuleResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeL7GlobalRuleResponseBody</p>
     */
    public static class GlobalRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("ActionDefault")
        private String actionDefault;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Long enabled;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        private GlobalRules(Builder builder) {
            this.action = builder.action;
            this.actionDefault = builder.actionDefault;
            this.description = builder.description;
            this.enabled = builder.enabled;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GlobalRules create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return actionDefault
         */
        public String getActionDefault() {
            return this.actionDefault;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return enabled
         */
        public Long getEnabled() {
            return this.enabled;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        public static final class Builder {
            private String action; 
            private String actionDefault; 
            private String description; 
            private Long enabled; 
            private String ruleId; 
            private String ruleName; 

            private Builder() {
            } 

            private Builder(GlobalRules model) {
                this.action = model.action;
                this.actionDefault = model.actionDefault;
                this.description = model.description;
                this.enabled = model.enabled;
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
            } 

            /**
             * <p>The action that the rule performs. Valid values:</p>
             * <ul>
             * <li><strong>watch</strong>: Monitor.</li>
             * <li><strong>block</strong>: Block.</li>
             * <li><strong>challenge</strong>: JavaScript Challenge.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>watch</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The default action of the rule. Valid values:</p>
             * <ul>
             * <li><strong>watch</strong>: Monitor.</li>
             * <li><strong>block</strong>: Block.</li>
             * <li><strong>challenge</strong>: JavaScript Challenge.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>watch</p>
             */
            public Builder actionDefault(String actionDefault) {
                this.actionDefault = actionDefault;
                return this;
            }

            /**
             * <p>The rule description.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP请求疑似模拟浏览器，校验浏览器Header等组合特征#4</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether the rule is enabled. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Enabled.</li>
             * <li><strong>0</strong>: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder enabled(Long enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>global_1</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>模拟浏览器请求</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            public GlobalRules build() {
                return new GlobalRules(this);
            } 

        } 

    }
}
