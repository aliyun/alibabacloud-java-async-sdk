// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ModifyContainerDefenseRuleSwitchRequest} extends {@link RequestModel}
 *
 * <p>ModifyContainerDefenseRuleSwitchRequest</p>
 */
public class ModifyContainerDefenseRuleSwitchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleIds")
    private java.util.List<Long> ruleIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleSwitch")
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
    public java.util.List<Long> getRuleIds() {
        return this.ruleIds;
    }

    /**
     * @return ruleSwitch
     */
    public Integer getRuleSwitch() {
        return this.ruleSwitch;
    }

    public static final class Builder extends Request.Builder<ModifyContainerDefenseRuleSwitchRequest, Builder> {
        private java.util.List<Long> ruleIds; 
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
         * <p>The IDs of the rules.</p>
         */
        public Builder ruleIds(java.util.List<Long> ruleIds) {
            this.putQueryParameter("RuleIds", ruleIds);
            this.ruleIds = ruleIds;
            return this;
        }

        /**
         * <p>The status of the rule. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: enabled</li>
         * <li><strong>0</strong>: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
