// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bdrc20230808.models;

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
 * {@link ListProtectionPoliciesRequest} extends {@link RequestModel}
 *
 * <p>ListProtectionPoliciesRequest</p>
 */
public class ListProtectionPoliciesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProtectionPolicyId")
    private String protectionPolicyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProtectionPolicyRegionId")
    private String protectionPolicyRegionId;

    private ListProtectionPoliciesRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.protectionPolicyId = builder.protectionPolicyId;
        this.protectionPolicyRegionId = builder.protectionPolicyRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProtectionPoliciesRequest create() {
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
     * @return protectionPolicyId
     */
    public String getProtectionPolicyId() {
        return this.protectionPolicyId;
    }

    /**
     * @return protectionPolicyRegionId
     */
    public String getProtectionPolicyRegionId() {
        return this.protectionPolicyRegionId;
    }

    public static final class Builder extends Request.Builder<ListProtectionPoliciesRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private String protectionPolicyId; 
        private String protectionPolicyRegionId; 

        private Builder() {
            super();
        } 

        private Builder(ListProtectionPoliciesRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.protectionPolicyId = request.protectionPolicyId;
            this.protectionPolicyRegionId = request.protectionPolicyRegionId;
        } 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * ProtectionPolicyId.
         */
        public Builder protectionPolicyId(String protectionPolicyId) {
            this.putQueryParameter("ProtectionPolicyId", protectionPolicyId);
            this.protectionPolicyId = protectionPolicyId;
            return this;
        }

        /**
         * ProtectionPolicyRegionId.
         */
        public Builder protectionPolicyRegionId(String protectionPolicyRegionId) {
            this.putQueryParameter("ProtectionPolicyRegionId", protectionPolicyRegionId);
            this.protectionPolicyRegionId = protectionPolicyRegionId;
            return this;
        }

        @Override
        public ListProtectionPoliciesRequest build() {
            return new ListProtectionPoliciesRequest(this);
        } 

    } 

}
