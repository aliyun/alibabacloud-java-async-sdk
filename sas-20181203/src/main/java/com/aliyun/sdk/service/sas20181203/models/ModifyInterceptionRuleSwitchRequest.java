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
         * The ID of the cluster.
         * <p>
         * 
         * > You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the IDs of clusters.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The IDs of the rules whose status you want to change. Separate multiple IDs with commas (,).
         * <p>
         * 
         * > You can call the [ListInterceptionRulePage](~~182997~~) operation to query the IDs of rules.
         */
        public Builder ruleIds(String ruleIds) {
            this.putQueryParameter("RuleIds", ruleIds);
            this.ruleIds = ruleIds;
            return this;
        }

        /**
         * Specifies whether the rule is enabled. Valid values:
         * <p>
         * 
         * *   **1**: enabled
         * *   **0**: disabled
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
