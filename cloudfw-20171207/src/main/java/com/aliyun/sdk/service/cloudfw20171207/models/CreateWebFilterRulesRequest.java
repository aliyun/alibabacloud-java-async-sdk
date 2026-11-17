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
 * {@link CreateWebFilterRulesRequest} extends {@link RequestModel}
 *
 * <p>CreateWebFilterRulesRequest</p>
 */
public class CreateWebFilterRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rules")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Rules> rules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WebFilterTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String webFilterTemplateId;

    private CreateWebFilterRulesRequest(Builder builder) {
        super(builder);
        this.rules = builder.rules;
        this.webFilterTemplateId = builder.webFilterTemplateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWebFilterRulesRequest create() {
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

    /**
     * @return webFilterTemplateId
     */
    public String getWebFilterTemplateId() {
        return this.webFilterTemplateId;
    }

    public static final class Builder extends Request.Builder<CreateWebFilterRulesRequest, Builder> {
        private java.util.List<Rules> rules; 
        private String webFilterTemplateId; 

        private Builder() {
            super();
        } 

        private Builder(CreateWebFilterRulesRequest request) {
            super(request);
            this.rules = request.rules;
            this.webFilterTemplateId = request.webFilterTemplateId;
        } 

        /**
         * <p>The list of web filtering rules. You can specify a maximum of 100 rules at a time, and the total number of rules in the template after creation must not exceed 100.</p>
         * <p>This parameter is required.</p>
         */
        public Builder rules(java.util.List<Rules> rules) {
            String rulesShrink = shrink(rules, "Rules", "json");
            this.putQueryParameter("Rules", rulesShrink);
            this.rules = rules;
            return this;
        }

        /**
         * <p>The ID of the web filtering template to which the web filtering rules belong. The template must exist within the current Alibaba Cloud account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>wft-3f2a9c1d4b5e6f70</p>
         */
        public Builder webFilterTemplateId(String webFilterTemplateId) {
            this.putQueryParameter("WebFilterTemplateId", webFilterTemplateId);
            this.webFilterTemplateId = webFilterTemplateId;
            return this;
        }

        @Override
        public CreateWebFilterRulesRequest build() {
            return new CreateWebFilterRulesRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateWebFilterRulesRequest} extends {@link TeaModel}
     *
     * <p>CreateWebFilterRulesRequest</p>
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
             * <p>The type of the matching condition. Only <strong>URL</strong> is supported, which indicates matching by URL.</p>
             * 
             * <strong>example:</strong>
             * <p>URL</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The URL to match. It cannot be empty and must not exceed 240 bytes in length (each Chinese character counts as 3 bytes). It must contain at least one forward slash (/), and the first segment must contain letters, digits, or Chinese characters. It cannot contain a protocol header, query parameters, or fragment identifiers. A single asterisk (<em>) indicates matching all URLs. When a wildcard is used, a maximum of one wildcard is allowed and it must end with /</em>. URLs within the same template cannot be duplicated.</p>
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
     * {@link CreateWebFilterRulesRequest} extends {@link TeaModel}
     *
     * <p>CreateWebFilterRulesRequest</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Conditions")
        private java.util.List<Conditions> conditions;

        @com.aliyun.core.annotation.NameInMap("RuleAction")
        private String ruleAction;

        private Rules(Builder builder) {
            this.conditions = builder.conditions;
            this.ruleAction = builder.ruleAction;
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

        public static final class Builder {
            private java.util.List<Conditions> conditions; 
            private String ruleAction; 

            private Builder() {
            } 

            private Builder(Rules model) {
                this.conditions = model.conditions;
                this.ruleAction = model.ruleAction;
            } 

            /**
             * <p>The list of matching conditions for the rule. The list must contain exactly one condition.</p>
             */
            public Builder conditions(java.util.List<Conditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * <p>The action to perform when a rule is matched. Valid values:</p>
             * <ul>
             * <li><strong>Allow</strong>: allows the request.</li>
             * <li><strong>Alert</strong>: monitors the request.</li>
             * <li><strong>Deny</strong>: blocks the request.</li>
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
