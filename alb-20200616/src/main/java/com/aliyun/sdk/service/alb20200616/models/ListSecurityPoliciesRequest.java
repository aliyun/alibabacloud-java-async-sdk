// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

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
 * {@link ListSecurityPoliciesRequest} extends {@link RequestModel}
 *
 * <p>ListSecurityPoliciesRequest</p>
 */
public class ListSecurityPoliciesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityPolicyIds")
    private java.util.List<String> securityPolicyIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityPolicyNames")
    private java.util.List<String> securityPolicyNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private ListSecurityPoliciesRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.resourceGroupId = builder.resourceGroupId;
        this.securityPolicyIds = builder.securityPolicyIds;
        this.securityPolicyNames = builder.securityPolicyNames;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSecurityPoliciesRequest create() {
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return securityPolicyIds
     */
    public java.util.List<String> getSecurityPolicyIds() {
        return this.securityPolicyIds;
    }

    /**
     * @return securityPolicyNames
     */
    public java.util.List<String> getSecurityPolicyNames() {
        return this.securityPolicyNames;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<ListSecurityPoliciesRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private String resourceGroupId; 
        private java.util.List<String> securityPolicyIds; 
        private java.util.List<String> securityPolicyNames; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(ListSecurityPoliciesRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.resourceGroupId = request.resourceGroupId;
            this.securityPolicyIds = request.securityPolicyIds;
            this.securityPolicyNames = request.securityPolicyNames;
            this.tag = request.tag;
        } 

        /**
         * <p>The number of entries per page. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>You do not need to specify this parameter for the first request.</li>
         * <li>You must specify the token that is obtained from the previous query as the value of <strong>NextToken</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-atstuj3rtop****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The security policy IDs. You can specify at most 20 security policies.</p>
         */
        public Builder securityPolicyIds(java.util.List<String> securityPolicyIds) {
            this.putQueryParameter("SecurityPolicyIds", securityPolicyIds);
            this.securityPolicyIds = securityPolicyIds;
            return this;
        }

        /**
         * <p>The names of the security policies. You can specify up to 10 names.</p>
         */
        public Builder securityPolicyNames(java.util.List<String> securityPolicyNames) {
            this.putQueryParameter("SecurityPolicyNames", securityPolicyNames);
            this.securityPolicyNames = securityPolicyNames;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public ListSecurityPoliciesRequest build() {
            return new ListSecurityPoliciesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListSecurityPoliciesRequest} extends {@link TeaModel}
     *
     * <p>ListSecurityPoliciesRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The tag key. The tag key can be up to 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>env</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. The tag value can be up to 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>product</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
