// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link ListPolicyGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListPolicyGroupsRequest</p>
 */
public class ListPolicyGroupsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyGroupIds")
    private java.util.List<String> policyGroupIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyGroupName")
    private String policyGroupName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyType")
    private String policyType;

    private ListPolicyGroupsRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.policyGroupIds = builder.policyGroupIds;
        this.policyGroupName = builder.policyGroupName;
        this.policyType = builder.policyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPolicyGroupsRequest create() {
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
     * @return policyGroupIds
     */
    public java.util.List<String> getPolicyGroupIds() {
        return this.policyGroupIds;
    }

    /**
     * @return policyGroupName
     */
    public String getPolicyGroupName() {
        return this.policyGroupName;
    }

    /**
     * @return policyType
     */
    public String getPolicyType() {
        return this.policyType;
    }

    public static final class Builder extends Request.Builder<ListPolicyGroupsRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<String> policyGroupIds; 
        private String policyGroupName; 
        private String policyType; 

        private Builder() {
            super();
        } 

        private Builder(ListPolicyGroupsRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.policyGroupIds = request.policyGroupIds;
            this.policyGroupName = request.policyGroupName;
            this.policyType = request.policyType;
        } 

        /**
         * <p>The maximum number of entries per page. Value range: 1 to 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the request to retrieve a new page of results. If the parameter is left empty, the data is queried from the first entry.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kU+SQXzm0H9mu/FiSc****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The IDs of the policies.</p>
         */
        public Builder policyGroupIds(java.util.List<String> policyGroupIds) {
            this.putBodyParameter("PolicyGroupIds", policyGroupIds);
            this.policyGroupIds = policyGroupIds;
            return this;
        }

        /**
         * <p>The name of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>defaultPolicyGroup</p>
         */
        public Builder policyGroupName(String policyGroupName) {
            this.putBodyParameter("PolicyGroupName", policyGroupName);
            this.policyGroupName = policyGroupName;
            return this;
        }

        /**
         * PolicyType.
         */
        public Builder policyType(String policyType) {
            this.putBodyParameter("PolicyType", policyType);
            this.policyType = policyType;
            return this;
        }

        @Override
        public ListPolicyGroupsRequest build() {
            return new ListPolicyGroupsRequest(this);
        } 

    } 

}
