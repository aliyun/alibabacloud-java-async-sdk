// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyDcdnWafRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyDcdnWafRuleRequest</p>
 */
public class ModifyDcdnWafRuleRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuleConfig")
    private String ruleConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long ruleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuleStatus")
    private String ruleStatus;

    private ModifyDcdnWafRuleRequest(Builder builder) {
        super(builder);
        this.ruleConfig = builder.ruleConfig;
        this.ruleId = builder.ruleId;
        this.ruleName = builder.ruleName;
        this.ruleStatus = builder.ruleStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDcdnWafRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ruleConfig
     */
    public String getRuleConfig() {
        return this.ruleConfig;
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
     * @return ruleStatus
     */
    public String getRuleStatus() {
        return this.ruleStatus;
    }

    public static final class Builder extends Request.Builder<ModifyDcdnWafRuleRequest, Builder> {
        private String ruleConfig; 
        private Long ruleId; 
        private String ruleName; 
        private String ruleStatus; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDcdnWafRuleRequest request) {
            super(request);
            this.ruleConfig = request.ruleConfig;
            this.ruleId = request.ruleId;
            this.ruleName = request.ruleName;
            this.ruleStatus = request.ruleStatus;
        } 

        /**
         * <p>The new configurations of the protection rule.</p>
         * <blockquote>
         * <p>After you modify the configurations of the protection rule, the previous configurations are overwritten.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;origin&quot;:&quot;custom&quot;,&quot;conditions&quot;:[{&quot;opValue&quot;:&quot;eq&quot;,&quot;key&quot;:&quot;URL&quot;,&quot;values&quot;:&quot;/example&quot;},{&quot;opValue&quot;:&quot;eq&quot;,&quot;key&quot;:&quot;Header&quot;,&quot;values&quot;:&quot;3333&quot;,&quot;subKey&quot;:&quot;trt&quot;}],&quot;actionExternal&quot;:{},&quot;action&quot;:&quot;monitor&quot;,&quot;ccStatus&quot;:1,&quot;ratelimit&quot;:{&quot;target&quot;:&quot;remote_addr&quot;,&quot;interval&quot;:&quot;5&quot;,&quot;threshold&quot;:&quot;2&quot;,&quot;effect&quot;:&quot;rule&quot;,&quot;status&quot;:{&quot;code&quot;:&quot;404&quot;,&quot;count&quot;:&quot;2&quot;},&quot;ttl&quot;:&quot;1800&quot;}}&quot;</p>
         */
        public Builder ruleConfig(String ruleConfig) {
            this.putBodyParameter("RuleConfig", ruleConfig);
            this.ruleConfig = ruleConfig;
            return this;
        }

        /**
         * <p>The ID of the protection rule. You can specify only one ID in each request.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>200001</p>
         */
        public Builder ruleId(Long ruleId) {
            this.putBodyParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>The new name of the protection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder ruleName(String ruleName) {
            this.putBodyParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>The new status of the protection rule. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder ruleStatus(String ruleStatus) {
            this.putBodyParameter("RuleStatus", ruleStatus);
            this.ruleStatus = ruleStatus;
            return this;
        }

        @Override
        public ModifyDcdnWafRuleRequest build() {
            return new ModifyDcdnWafRuleRequest(this);
        } 

    } 

}
