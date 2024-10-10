// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteInterceptionRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteInterceptionRuleRequest</p>
 */
public class DeleteInterceptionRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleIds")
    private java.util.List < Long > ruleIds;

    private DeleteInterceptionRuleRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.ruleIds = builder.ruleIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteInterceptionRuleRequest create() {
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
    public java.util.List < Long > getRuleIds() {
        return this.ruleIds;
    }

    public static final class Builder extends Request.Builder<DeleteInterceptionRuleRequest, Builder> {
        private String clusterId; 
        private java.util.List < Long > ruleIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteInterceptionRuleRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.ruleIds = request.ruleIds;
        } 

        /**
         * <p>The ID of the cluster that you want to query.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to query the IDs of clusters.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cdf629147cc3747d292a3f587xxxxxxxx</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The IDs of the rules that you want to delete.</p>
         */
        public Builder ruleIds(java.util.List < Long > ruleIds) {
            this.putQueryParameter("RuleIds", ruleIds);
            this.ruleIds = ruleIds;
            return this;
        }

        @Override
        public DeleteInterceptionRuleRequest build() {
            return new DeleteInterceptionRuleRequest(this);
        } 

    } 

}
