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
 * {@link UpdateUserWafRulesetRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserWafRulesetRequest</p>
 */
public class UpdateUserWafRulesetRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Expression")
    private String expression;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Position")
    private Long position;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Rules")
    private java.util.List<WafRuleConfig> rules;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Shared")
    private WafBatchRuleShared shared;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private UpdateUserWafRulesetRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.expression = builder.expression;
        this.id = builder.id;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.position = builder.position;
        this.rules = builder.rules;
        this.shared = builder.shared;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserWafRulesetRequest create() {
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
     * @return id
     */
    public Long getId() {
        return this.id;
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
     * @return position
     */
    public Long getPosition() {
        return this.position;
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

    public static final class Builder extends Request.Builder<UpdateUserWafRulesetRequest, Builder> {
        private String description; 
        private String expression; 
        private Long id; 
        private String instanceId; 
        private String name; 
        private Long position; 
        private java.util.List<WafRuleConfig> rules; 
        private WafBatchRuleShared shared; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserWafRulesetRequest request) {
            super(request);
            this.description = request.description;
            this.expression = request.expression;
            this.id = request.id;
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.position = request.position;
            this.rules = request.rules;
            this.shared = request.shared;
            this.status = request.status;
        } 

        /**
         * <p>The description of the WAF ruleset.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The expression of the WAF ruleset.</p>
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
         * <p>The WAF ruleset ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10000001</p>
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>esa-xxxxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the WAF ruleset.</p>
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
         * <p>The position of the WAF ruleset.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder position(Long position) {
            this.putBodyParameter("Position", position);
            this.position = position;
            return this;
        }

        /**
         * <p>A list of rule configurations in the WAF ruleset.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *   {
         *     &quot;Id&quot;: 20000001,
         *     &quot;Name&quot;: &quot;rule1&quot;,
         *     &quot;Expression&quot;: &quot;ip.src eq 1.1.1.1&quot;,
         *     &quot;Action&quot;: &quot;deny&quot;
         *   }</p>
         */
        public Builder rules(java.util.List<WafRuleConfig> rules) {
            String rulesShrink = shrink(rules, "Rules", "json");
            this.putBodyParameter("Rules", rulesShrink);
            this.rules = rules;
            return this;
        }

        /**
         * <p>The shared configuration of the WAF ruleset.</p>
         */
        public Builder shared(WafBatchRuleShared shared) {
            String sharedShrink = shrink(shared, "Shared", "json");
            this.putBodyParameter("Shared", sharedShrink);
            this.shared = shared;
            return this;
        }

        /**
         * <p>The status of the WAF ruleset.</p>
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
        public UpdateUserWafRulesetRequest build() {
            return new UpdateUserWafRulesetRequest(this);
        } 

    } 

}
