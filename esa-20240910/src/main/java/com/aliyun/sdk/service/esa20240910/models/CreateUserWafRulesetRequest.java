// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link CreateUserWafRulesetRequest} extends {@link RequestModel}
 *
 * <p>CreateUserWafRulesetRequest</p>
 */
public class CreateUserWafRulesetRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Expression")
    @com.aliyun.core.annotation.Validation(required = true)
    private String expression;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Phase")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phase;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Rules")
    private java.util.List<WafRuleConfig> rules;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Shared")
    private WafBatchRuleShared shared;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    private CreateUserWafRulesetRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.expression = builder.expression;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.phase = builder.phase;
        this.rules = builder.rules;
        this.shared = builder.shared;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserWafRulesetRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return expression
     */
    public String getExpression() {
        return this.expression;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return phase
     */
    public String getPhase() {
        return this.phase;
    }

    /**
     * @return rules
     */
    public java.util.List<WafRuleConfig> getRules() {
        return this.rules;
    }

    /**
     * @return shared
     */
    public WafBatchRuleShared getShared() {
        return this.shared;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<CreateUserWafRulesetRequest, Builder> {
        private String description; 
        private String expression; 
        private String instanceId; 
        private String name; 
        private String phase; 
        private java.util.List<WafRuleConfig> rules; 
        private WafBatchRuleShared shared; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(CreateUserWafRulesetRequest request) {
            super(request);
            this.description = request.description;
            this.expression = request.expression;
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.phase = request.phase;
            this.rules = request.rules;
            this.shared = request.shared;
            this.status = request.status;
        } 

        /**
         * <p>The description of the WAF ruleset.</p>
         * 
         * <strong>example:</strong>
         * <p>this is a test ruleset.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The match expression of the WAF ruleset. Rules in this ruleset are evaluated only when a request matches this expression.</p>
         * <p>Examples:</p>
         * <ul>
         * <li><code>http.host eq &quot;example.com&quot;</code> — Only requests with the host example.com enter this ruleset.</li>
         * <li><code>starts_with(http.uri.path, &quot;/api/&quot;)</code> — Only requests with the /api/ prefix enter this ruleset.</li>
         * </ul>
         * <blockquote>
         * <p>The complete expression syntax and available field set are subject to the server-side wirefilter dialect.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ip.src == 1.1.1.1</p>
         */
        public Builder expression(String expression) {
            this.putBodyParameter("Expression", expression);
            this.expression = expression;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>esa-site-ads11w</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the WAF ruleset.</p>
         * <p><strong>Naming suggestion</strong>: Use a combination of letters, digits, and underscores for easy reference. The specific character set, maximum length, and uniqueness constraints are subject to the WAF ruleset service naming conventions.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The phase to which the WAF ruleset belongs. Valid values:</p>
         * <ul>
         * <li>http_whitelist: whitelist rules</li>
         * <li>http_custom: custom rules</li>
         * <li>http_managed: managed rules</li>
         * <li>http_anti_scan: scan protection rules</li>
         * <li>http_ratelimit: rate limiting rules</li>
         * </ul>
         * <blockquote>
         * <p>Note: The supported fields (Expression match fields, Action values, and others) vary by phase. For more information, refer to the rule configuration documentation for the corresponding phase.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>http_custom</p>
         */
        public Builder phase(String phase) {
            this.putBodyParameter("Phase", phase);
            this.phase = phase;
            return this;
        }

        /**
         * <p>The list of rule configurations in the WAF ruleset. Each element corresponds to a rule.</p>
         * <ul>
         * <li>The field structure of each rule is subject to the <code>WafRuleConfig</code> data structure, which includes Expression, Action, Name, and other fields.</li>
         * </ul>
         */
        public Builder rules(java.util.List<WafRuleConfig> rules) {
            String rulesShrink = shrink(rules, "Rules", "json");
            this.putBodyParameter("Rules", rulesShrink);
            this.rules = rules;
            return this;
        }

        /**
         * <p>The shared fields across multiple rules in this ruleset, such as a unified Action or Name prefix.</p>
         * <blockquote>
         * <p>The field structure is subject to the <code>WafBatchRuleShared</code> data structure. If you do not need to share properties, you can leave this parameter empty.</p>
         * </blockquote>
         */
        public Builder shared(WafBatchRuleShared shared) {
            String sharedShrink = shrink(shared, "Shared", "json");
            this.putBodyParameter("Shared", sharedShrink);
            this.shared = shared;
            return this;
        }

        /**
         * <p>The status of the WAF ruleset. Valid values:</p>
         * <ul>
         * <li>on: Enabled. The rules in the ruleset participate in matching and blocking.</li>
         * <li>off: Disabled. The ruleset is retained but does not participate in matching.</li>
         * </ul>
         * <blockquote>
         * <p>The complete set of valid values is subject to the server-side enum.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public CreateUserWafRulesetRequest build() {
            return new CreateUserWafRulesetRequest(this);
        } 

    } 

}
