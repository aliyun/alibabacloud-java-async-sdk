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
 * {@link UpdateApplicationCustomRulesRequest} extends {@link RequestModel}
 *
 * <p>UpdateApplicationCustomRulesRequest</p>
 */
public class UpdateApplicationCustomRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rules")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Rules> rules;

    private UpdateApplicationCustomRulesRequest(Builder builder) {
        super(builder);
        this.rules = builder.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApplicationCustomRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return rules
     */
    public java.util.List<Rules> getRules() {
        return this.rules;
    }

    public static final class Builder extends Request.Builder<UpdateApplicationCustomRulesRequest, Builder> {
        private java.util.List<Rules> rules; 

        private Builder() {
            super();
        } 

        private Builder(UpdateApplicationCustomRulesRequest request) {
            super(request);
            this.rules = request.rules;
        } 

        /**
         * <p>The list of custom application rules to be modified. You can specify up to 20 rules at a time. Rule IDs in the list must be unique.</p>
         * <p>This parameter is required.</p>
         */
        public Builder rules(java.util.List<Rules> rules) {
            String rulesShrink = shrink(rules, "Rules", "json");
            this.putQueryParameter("Rules", rulesShrink);
            this.rules = rules;
            return this;
        }

        @Override
        public UpdateApplicationCustomRulesRequest build() {
            return new UpdateApplicationCustomRulesRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateApplicationCustomRulesRequest} extends {@link TeaModel}
     *
     * <p>UpdateApplicationCustomRulesRequest</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddApplicationIds")
        private java.util.List<Long> addApplicationIds;

        @com.aliyun.core.annotation.NameInMap("ApplicationCustomRuleId")
        private String applicationCustomRuleId;

        @com.aliyun.core.annotation.NameInMap("ApplicationCustomRuleName")
        private String applicationCustomRuleName;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Long priority;

        @com.aliyun.core.annotation.NameInMap("RemoveApplicationIds")
        private java.util.List<Long> removeApplicationIds;

        @com.aliyun.core.annotation.NameInMap("RuleAction")
        private String ruleAction;

        private Rules(Builder builder) {
            this.addApplicationIds = builder.addApplicationIds;
            this.applicationCustomRuleId = builder.applicationCustomRuleId;
            this.applicationCustomRuleName = builder.applicationCustomRuleName;
            this.priority = builder.priority;
            this.removeApplicationIds = builder.removeApplicationIds;
            this.ruleAction = builder.ruleAction;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return addApplicationIds
         */
        public java.util.List<Long> getAddApplicationIds() {
            return this.addApplicationIds;
        }

        /**
         * @return applicationCustomRuleId
         */
        public String getApplicationCustomRuleId() {
            return this.applicationCustomRuleId;
        }

        /**
         * @return applicationCustomRuleName
         */
        public String getApplicationCustomRuleName() {
            return this.applicationCustomRuleName;
        }

        /**
         * @return priority
         */
        public Long getPriority() {
            return this.priority;
        }

        /**
         * @return removeApplicationIds
         */
        public java.util.List<Long> getRemoveApplicationIds() {
            return this.removeApplicationIds;
        }

        /**
         * @return ruleAction
         */
        public String getRuleAction() {
            return this.ruleAction;
        }

        public static final class Builder {
            private java.util.List<Long> addApplicationIds; 
            private String applicationCustomRuleId; 
            private String applicationCustomRuleName; 
            private Long priority; 
            private java.util.List<Long> removeApplicationIds; 
            private String ruleAction; 

            private Builder() {
            } 

            private Builder(Rules model) {
                this.addApplicationIds = model.addApplicationIds;
                this.applicationCustomRuleId = model.applicationCustomRuleId;
                this.applicationCustomRuleName = model.applicationCustomRuleName;
                this.priority = model.priority;
                this.removeApplicationIds = model.removeApplicationIds;
                this.ruleAction = model.ruleAction;
            } 

            /**
             * <p>The list of application IDs to be associated. You can specify up to 200 IDs. The IDs cannot be 0 and must exist in the built-in application signature library. The IDs must not overlap with those in RemoveApplicationIds. The combined list cannot be empty and can contain up to 200 IDs.</p>
             */
            public Builder addApplicationIds(java.util.List<Long> addApplicationIds) {
                this.addApplicationIds = addApplicationIds;
                return this;
            }

            /**
             * <p>The ID of the custom application rule to be modified. The rule must exist within the current Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>acr-7d2e4f6a8b0c1d3e</p>
             */
            public Builder applicationCustomRuleId(String applicationCustomRuleId) {
                this.applicationCustomRuleId = applicationCustomRuleId;
                return this;
            }

            /**
             * <p>The name of the custom rule. The name can be up to 64 characters in length and can contain Chinese characters, letters, digits, hyphens (-), underscores (_), and periods (.). If this parameter is not specified or is left empty, the original value is retained.</p>
             * 
             * <strong>example:</strong>
             * <p>CustomRule02</p>
             */
            public Builder applicationCustomRuleName(String applicationCustomRuleName) {
                this.applicationCustomRuleName = applicationCustomRuleName;
                return this;
            }

            /**
             * <p>The priority of the rule. This parameter is required. Valid values: integers from 1 to 200. A smaller value indicates a higher priority. Priorities must be unique within the same template. You can swap priorities by deleting and then re-inserting rules.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder priority(Long priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The list of application IDs to be disassociated. You can specify up to 200 IDs. The IDs must not overlap with those in AddApplicationIds. The combined list cannot be empty and can contain up to 200 IDs.</p>
             */
            public Builder removeApplicationIds(java.util.List<Long> removeApplicationIds) {
                this.removeApplicationIds = removeApplicationIds;
                return this;
            }

            /**
             * <p>The action to perform when the rule is matched. This parameter is required. Valid values:</p>
             * <ul>
             * <li><strong>Allow</strong>: allows the traffic.</li>
             * <li><strong>Alert</strong>: monitors the traffic.</li>
             * <li><strong>Deny</strong>: blocks the traffic.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Alert</p>
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
