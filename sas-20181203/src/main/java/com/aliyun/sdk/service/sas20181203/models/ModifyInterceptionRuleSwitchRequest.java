// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInterceptionRuleSwitchRequest} extends {@link RequestModel}
 *
 * <p>ModifyInterceptionRuleSwitchRequest</p>
 */
public class ModifyInterceptionRuleSwitchRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("RuleIds")
    private String ruleIds;

    @Query
    @NameInMap("RuleSwitch")
    private Integer ruleSwitch;

    private ModifyInterceptionRuleSwitchRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.ruleIds = builder.ruleIds;
        this.ruleSwitch = builder.ruleSwitch;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInterceptionRuleSwitchRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return ruleIds
     */
    public String getRuleIds() {
        return this.ruleIds;
    }

    /**
     * @return ruleSwitch
     */
    public Integer getRuleSwitch() {
        return this.ruleSwitch;
    }

    public static final class Builder extends Request.Builder<ModifyInterceptionRuleSwitchRequest, Builder> {
        private String clusterId; 
        private String ruleIds; 
        private Integer ruleSwitch; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInterceptionRuleSwitchRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.ruleIds = request.ruleIds;
            this.ruleSwitch = request.ruleSwitch;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * RuleIds.
         */
        public Builder ruleIds(String ruleIds) {
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
        public ModifyInterceptionRuleSwitchRequest build() {
            return new ModifyInterceptionRuleSwitchRequest(this);
        } 

    } 

}
