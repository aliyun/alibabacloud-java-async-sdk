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
 * {@link ModifyInterceptionRuleSwitchRequest} extends {@link RequestModel}
 *
 * <p>ModifyInterceptionRuleSwitchRequest</p>
 */
public class ModifyInterceptionRuleSwitchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleIds")
    private String ruleIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleSwitch")
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
         * <p>The ID of the cluster.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to query the IDs of clusters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ce5c29aba99694ade9ba85dc620b4****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The IDs of the rules whose status you want to change. Separate multiple IDs with commas (,).</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/182997.html">ListInterceptionRulePage</a> operation to query the IDs of rules.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>403287</p>
         */
        public Builder ruleIds(String ruleIds) {
            this.putQueryParameter("RuleIds", ruleIds);
            this.ruleIds = ruleIds;
            return this;
        }

        /**
         * <p>Specifies whether the rule is enabled. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: enabled</li>
         * <li><strong>0</strong>: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
