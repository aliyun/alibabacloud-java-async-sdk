// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeMaskingRulesRequest} extends {@link RequestModel}
 *
 * <p>DescribeMaskingRulesRequest</p>
 */
public class DescribeMaskingRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleNameList")
    private String ruleNameList;

    private DescribeMaskingRulesRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.ruleNameList = builder.ruleNameList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMaskingRulesRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeMaskingRulesRequest, Builder> {
        private String DBClusterId; 
        private String ruleNameList; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMaskingRulesRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.ruleNameList = request.ruleNameList;
        } 

        /**
         * <p>The ID of the cluster.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query the details of the clusters that belong to your Alibaba Cloud account, such as cluster IDs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-*****************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The name of the masking rule.</p>
         * 
         * <strong>example:</strong>
         * <p>testrule</p>
         */
        public Builder ruleNameList(String ruleNameList) {
            this.putQueryParameter("RuleNameList", ruleNameList);
            this.ruleNameList = ruleNameList;
            return this;
        }

        @Override
        public DescribeMaskingRulesRequest build() {
            return new DescribeMaskingRulesRequest(this);
        } 

    } 

}
