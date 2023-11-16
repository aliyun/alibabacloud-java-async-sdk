// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyContainerDefenseRuleSwitchRequest} extends {@link RequestModel}
 *
 * <p>ModifyContainerDefenseRuleSwitchRequest</p>
 */
public class ModifyContainerDefenseRuleSwitchRequest extends Request {
    @Query
    @NameInMap("RuleIds")
    private java.util.List < Long > ruleIds;

    @Query
    @NameInMap("RuleSwitch")
    private Integer ruleSwitch;

    private ModifyContainerDefenseRuleSwitchRequest(Builder builder) {
        super(builder);
        this.ruleIds = builder.ruleIds;
        this.ruleSwitch = builder.ruleSwitch;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyContainerDefenseRuleSwitchRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ruleIds
     */
    public java.util.List < Long > getRuleIds() {
        return this.ruleIds;
    }

    /**
     * @return ruleSwitch
     */
    public Integer getRuleSwitch() {
        return this.ruleSwitch;
    }

    public static final class Builder extends Request.Builder<ModifyContainerDefenseRuleSwitchRequest, Builder> {
        private java.util.List < Long > ruleIds; 
        private Integer ruleSwitch; 

        private Builder() {
            super();
        } 

        private Builder(ModifyContainerDefenseRuleSwitchRequest request) {
            super(request);
            this.ruleIds = request.ruleIds;
            this.ruleSwitch = request.ruleSwitch;
        } 

        /**
         * RuleIds.
         */
        public Builder ruleIds(java.util.List < Long > ruleIds) {
            this.putQueryParameter("RuleIds", ruleIds);
            this.ruleIds = ruleIds;
            return this;
        }

        /**
         * RuleSwitch.
         */
        public Builder ruleSwitch(Integer ruleSwitch) {
            this.putQueryParameter("RuleSwitch", ruleSwitch);
            this.ruleSwitch = ruleSwitch;
            return this;
        }

        @Override
        public ModifyContainerDefenseRuleSwitchRequest build() {
            return new ModifyContainerDefenseRuleSwitchRequest(this);
        } 

    } 

}
