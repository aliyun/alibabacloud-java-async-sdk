// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
 * {@link DescribePoliciesV2Request} extends {@link RequestModel}
 *
 * <p>DescribePoliciesV2Request</p>
 */
public class DescribePoliciesV2Request extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    private String policyId;

    private DescribePoliciesV2Request(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.policyId = builder.policyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePoliciesV2Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    public static final class Builder extends Request.Builder<DescribePoliciesV2Request, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private String policyId; 

        private Builder() {
            super();
        } 

        private Builder(DescribePoliciesV2Request request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.policyId = request.policyId;
        } 

        /**
         * <p>The number of results for each query.</p>
         * <p>Valid values: 10 to 100. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that is used to obtain the next page of backup policies.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the backup policy.</p>
         * 
         * <strong>example:</strong>
         * <p>po-000************2l6</p>
         */
        public Builder policyId(String policyId) {
            this.putBodyParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        @Override
        public DescribePoliciesV2Request build() {
            return new DescribePoliciesV2Request(this);
        } 

    } 

}
