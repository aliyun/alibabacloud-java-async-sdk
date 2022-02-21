// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyRuleRequest</p>
 */
public class ModifyRuleRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("RuleId")
    @Validation(required = true)
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

        private Builder(ModifyRuleRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.ruleId = response.ruleId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RuleId.
         */
        public Builder ruleId(String ruleId) {
            this.putPathParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public ModifyRuleRequest build() {
            return new ModifyRuleRequest(this);
        } 

    } 

}
