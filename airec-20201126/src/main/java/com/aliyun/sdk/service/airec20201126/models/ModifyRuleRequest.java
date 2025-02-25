// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyRuleRequest</p>
 */
public class ModifyRuleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ruleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleId;

    private ModifyRuleRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    public static final class Builder extends Request.Builder<ModifyRuleRequest, Builder> {
        private String instanceId; 
        private String ruleId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyRuleRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.ruleId = request.ruleId;
        } 

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>airec-cn-o400whm78004</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder ruleId(String ruleId) {
            this.putPathParameter("ruleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public ModifyRuleRequest build() {
            return new ModifyRuleRequest(this);
        } 

    } 

}
