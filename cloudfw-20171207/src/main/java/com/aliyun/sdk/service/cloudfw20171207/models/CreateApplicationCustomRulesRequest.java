// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link CreateApplicationCustomRulesRequest} extends {@link RequestModel}
 *
 * <p>CreateApplicationCustomRulesRequest</p>
 */
public class CreateApplicationCustomRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rules")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Rules> rules;

    private CreateApplicationCustomRulesRequest(Builder builder) {
        super(builder);
        this.applicationTemplateId = builder.applicationTemplateId;
        this.rules = builder.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApplicationCustomRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationTemplateId
     */
    public String getApplicationTemplateId() {
        return this.applicationTemplateId;
    }

    /**
     * @return rules
     */
    public java.util.List<Rules> getRules() {
        return this.rules;
    }

    public static final class Builder extends Request.Builder<CreateApplicationCustomRulesRequest, Builder> {
        private String applicationTemplateId; 
        private java.util.List<Rules> rules; 

        private Builder() {
            super();
        } 

        private Builder(CreateApplicationCustomRulesRequest request) {
            super(request);
            this.applicationTemplateId = request.applicationTemplateId;
            this.rules = request.rules;
        } 

        /**
         * <p>The ID of the application template to which the custom rules belong. The template must exist within the current Alibaba Cloud account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ati-4f0691c56b8d4f06</p>
         */
        public Builder applicationTemplateId(String applicationTemplateId) {
            this.putQueryParameter("ApplicationTemplateId", applicationTemplateId);
            this.applicationTemplateId = applicationTemplateId;
            return this;
        }

        /**
         * <p>The list of custom rules for the application. You can specify up to 100 rules at a time, and the total number of rules in the template after creation must not exceed 100.</p>
         * <p>This parameter is required.</p>
         */
        public Builder rules(java.util.List<Rules> rules) {
            String rulesShrink = shrink(rules, "Rules", "json");
            this.putQueryParameter("Rules", rulesShrink);
            this.rules = rules;
            return this;
        }

        @Override
        public CreateApplicationCustomRulesRequest build() {
            return new CreateApplicationCustomRulesRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateApplicationCustomRulesRequest} extends {@link TeaModel}
     *
     * <p>CreateApplicationCustomRulesRequest</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationCustomRuleName")
        private String applicationCustomRuleName;

        @com.aliyun.core.annotation.NameInMap("ApplicationIds")
        private java.util.List<Long> applicationIds;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Long priority;

        @com.aliyun.core.annotation.NameInMap("RuleAction")
        private String ruleAction;

        private Rules(Builder builder) {
            this.applicationCustomRuleName = builder.applicationCustomRuleName;
            this.applicationIds = builder.applicationIds;
            this.priority = builder.priority;
            this.ruleAction = builder.ruleAction;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return applicationCustomRuleName
         */
        public String getApplicationCustomRuleName() {
            return this.applicationCustomRuleName;
        }

        /**
         * @return applicationIds
         */
        public java.util.List<Long> getApplicationIds() {
            return this.applicationIds;
        }

        /**
         * @return priority
         */
        public Long getPriority() {
            return this.priority;
        }

        /**
         * @return ruleAction
         */
        public String getRuleAction() {
            return this.ruleAction;
        }

        public static final class Builder {
            private String applicationCustomRuleName; 
            private java.util.List<Long> applicationIds; 
            private Long priority; 
            private String ruleAction; 

            private Builder() {
            } 

            private Builder(Rules model) {
                this.applicationCustomRuleName = model.applicationCustomRuleName;
                this.applicationIds = model.applicationIds;
                this.priority = model.priority;
                this.ruleAction = model.ruleAction;
            } 

            /**
             * <p>The name of the custom rule. The name cannot be empty and can be up to 64 characters in length. It can contain Chinese characters, English letters, digits, hyphens (-), underscores (_), and periods (.).</p>
             * 
             * <strong>example:</strong>
             * <p>CustomRule01</p>
             */
            public Builder applicationCustomRuleName(String applicationCustomRuleName) {
                this.applicationCustomRuleName = applicationCustomRuleName;
                return this;
            }

            /**
             * <p>The list of application IDs associated with the rule. A single rule can be associated with 1 to 200 applications. The IDs cannot be 0, must be unique, and must exist in the built-in application signature library. You can call the ListApplications operation to query the IDs.</p>
             */
            public Builder applicationIds(java.util.List<Long> applicationIds) {
                this.applicationIds = applicationIds;
                return this;
            }

            /**
             * <p>The priority of the rule. Valid values: integers from 1 to 200. A smaller value indicates a higher priority. Priorities must be unique within the same batch and the same template.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Long priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The action to perform when the rule is matched. Valid values:</p>
             * <ul>
             * <li><strong>Allow</strong>: allows the traffic.</li>
             * <li><strong>Alert</strong>: monitors the traffic.</li>
             * <li><strong>Deny</strong>: blocks the traffic.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Deny</p>
             */
            public Builder ruleAction(String ruleAction) {
                this.ruleAction = ruleAction;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
}
