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
 * {@link UpdateWebFilterRulesRequest} extends {@link RequestModel}
 *
 * <p>UpdateWebFilterRulesRequest</p>
 */
public class UpdateWebFilterRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rules")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Rules> rules;

    private UpdateWebFilterRulesRequest(Builder builder) {
        super(builder);
        this.rules = builder.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWebFilterRulesRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateWebFilterRulesRequest, Builder> {
        private java.util.List<Rules> rules; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWebFilterRulesRequest request) {
            super(request);
            this.rules = request.rules;
        } 

        /**
         * <p>The list of web filtering rules to be updated. You can specify up to 20 rules at a time. The rule IDs in the list must be unique.</p>
         * <p>This parameter is required.</p>
         */
        public Builder rules(java.util.List<Rules> rules) {
            String rulesShrink = shrink(rules, "Rules", "json");
            this.putQueryParameter("Rules", rulesShrink);
            this.rules = rules;
            return this;
        }

        @Override
        public UpdateWebFilterRulesRequest build() {
            return new UpdateWebFilterRulesRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateWebFilterRulesRequest} extends {@link TeaModel}
     *
     * <p>UpdateWebFilterRulesRequest</p>
     */
    public static class Conditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Values")
        private String values;

        private Conditions(Builder builder) {
            this.key = builder.key;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conditions create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return values
         */
        public String getValues() {
            return this.values;
        }

        public static final class Builder {
            private String key; 
            private String values; 

            private Builder() {
            } 

            private Builder(Conditions model) {
                this.key = model.key;
                this.values = model.values;
            } 

            /**
             * <p>The type of the match condition. Only <strong>URL</strong> is supported, which indicates matching by URL.</p>
             * 
             * <strong>example:</strong>
             * <p>URL</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The URL to match. The value cannot be empty and must not exceed 240 bytes in length. Each Chinese character is counted as 3 bytes. The URL must contain at least one forward slash (/), and the first segment must contain letters, digits, or Chinese characters. The URL cannot contain a protocol header, query parameters, or fragment identifiers. A single asterisk (<em>) matches all URLs. If a wildcard is used, only one wildcard is allowed and it must end with /</em>. URLs within the same template must be unique.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com/login">www.example.com/login</a></p>
             */
            public Builder values(String values) {
                this.values = values;
                return this;
            }

            public Conditions build() {
                return new Conditions(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateWebFilterRulesRequest} extends {@link TeaModel}
     *
     * <p>UpdateWebFilterRulesRequest</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Conditions")
        private java.util.List<Conditions> conditions;

        @com.aliyun.core.annotation.NameInMap("RuleAction")
        private String ruleAction;

        @com.aliyun.core.annotation.NameInMap("WebFilterRuleId")
        private String webFilterRuleId;

        private Rules(Builder builder) {
            this.conditions = builder.conditions;
            this.ruleAction = builder.ruleAction;
            this.webFilterRuleId = builder.webFilterRuleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return conditions
         */
        public java.util.List<Conditions> getConditions() {
            return this.conditions;
        }

        /**
         * @return ruleAction
         */
        public String getRuleAction() {
            return this.ruleAction;
        }

        /**
         * @return webFilterRuleId
         */
        public String getWebFilterRuleId() {
            return this.webFilterRuleId;
        }

        public static final class Builder {
            private java.util.List<Conditions> conditions; 
            private String ruleAction; 
            private String webFilterRuleId; 

            private Builder() {
            } 

            private Builder(Rules model) {
                this.conditions = model.conditions;
                this.ruleAction = model.ruleAction;
                this.webFilterRuleId = model.webFilterRuleId;
            } 

            /**
             * <p>The list of match conditions for the rule. The list must contain exactly one condition. After the update, URLs within the same template must be unique.</p>
             */
            public Builder conditions(java.util.List<Conditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * <p>The action to perform when the rule is matched. Valid values:</p>
             * <ul>
             * <li><strong>Allow</strong>: allows the request.</li>
             * <li><strong>Alert</strong>: monitors the request.</li>
             * <li><strong>Deny</strong>: blocks the request.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Alert</p>
             */
            public Builder ruleAction(String ruleAction) {
                this.ruleAction = ruleAction;
                return this;
            }

            /**
             * <p>The ID of the web filtering rule to be updated. The rule must exist within the current Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>wfr-8c1d2e3f4a5b6c7d</p>
             */
            public Builder webFilterRuleId(String webFilterRuleId) {
                this.webFilterRuleId = webFilterRuleId;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
}
