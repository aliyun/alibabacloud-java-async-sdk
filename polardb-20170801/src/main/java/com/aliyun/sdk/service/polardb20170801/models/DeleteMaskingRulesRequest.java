// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMaskingRulesRequest} extends {@link RequestModel}
 *
 * <p>DeleteMaskingRulesRequest</p>
 */
public class DeleteMaskingRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleNameList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleNameList;

    private DeleteMaskingRulesRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.ruleNameList = builder.ruleNameList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMaskingRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return ruleNameList
     */
    public String getRuleNameList() {
        return this.ruleNameList;
    }

    public static final class Builder extends Request.Builder<DeleteMaskingRulesRequest, Builder> {
        private String DBClusterId; 
        private String ruleNameList; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMaskingRulesRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.ruleNameList = request.ruleNameList;
        } 

        /**
         * The ID of the cluster.
         * <p>
         * 
         * > You can call the [DescribeDBClusters](~~98094~~) operation to query the details of the clusters that belong to your Alibaba Cloud account, such as cluster IDs.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The name of the masking rule. You can specify multiple masking rules at a time. Separate the masking rules with commas (,).
         * <p>
         * 
         * > You can call the [DescribeMaskingRules](~~212573~~) operation to query details of all the masking rules for a specified cluster, such as the names of the masking rules.
         */
        public Builder ruleNameList(String ruleNameList) {
            this.putQueryParameter("RuleNameList", ruleNameList);
            this.ruleNameList = ruleNameList;
            return this;
        }

        @Override
        public DeleteMaskingRulesRequest build() {
            return new DeleteMaskingRulesRequest(this);
        } 

    } 

}
