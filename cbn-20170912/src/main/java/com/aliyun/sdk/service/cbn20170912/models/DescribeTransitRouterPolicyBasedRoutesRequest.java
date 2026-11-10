// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link DescribeTransitRouterPolicyBasedRoutesRequest} extends {@link RequestModel}
 *
 * <p>DescribeTransitRouterPolicyBasedRoutesRequest</p>
 */
public class DescribeTransitRouterPolicyBasedRoutesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filter")
    private java.util.List<Filter> filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyTableId")
    private String policyTableId;

    private DescribeTransitRouterPolicyBasedRoutesRequest(Builder builder) {
        super(builder);
        this.filter = builder.filter;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.policyTableId = builder.policyTableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTransitRouterPolicyBasedRoutesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filter
     */
    public java.util.List<Filter> getFilter() {
        return this.filter;
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
     * @return policyTableId
     */
    public String getPolicyTableId() {
        return this.policyTableId;
    }

    public static final class Builder extends Request.Builder<DescribeTransitRouterPolicyBasedRoutesRequest, Builder> {
        private java.util.List<Filter> filter; 
        private Integer maxResults; 
        private String nextToken; 
        private String policyTableId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTransitRouterPolicyBasedRoutesRequest request) {
            super(request);
            this.filter = request.filter;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.policyTableId = request.policyTableId;
        } 

        /**
         * <p>The filter conditions.</p>
         * <p>You can specify up to 5 filter conditions at a time.</p>
         */
        public Builder filter(java.util.List<Filter> filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Valid values: 1 to 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token for the next query. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next query is available.</li>
         * <li>If <strong>NextToken</strong> returns a value, the value is the token used to start the next query.</li>
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
         * <p>The instance ID of the policy-based routing table.</p>
         * 
         * <strong>example:</strong>
         * <p>ptbl-abc123xyz</p>
         */
        public Builder policyTableId(String policyTableId) {
            this.putQueryParameter("PolicyTableId", policyTableId);
            this.policyTableId = policyTableId;
            return this;
        }

        @Override
        public DescribeTransitRouterPolicyBasedRoutesRequest build() {
            return new DescribeTransitRouterPolicyBasedRoutesRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTransitRouterPolicyBasedRoutesRequest} extends {@link TeaModel}
     *
     * <p>DescribeTransitRouterPolicyBasedRoutesRequest</p>
     */
    public static class Filter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private java.util.List<String> value;

        private Filter(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filter create() {
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
        public java.util.List<String> getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private java.util.List<String> value; 

            private Builder() {
            } 

            private Builder(Filter model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The filter condition. Valid values:</p>
             * <ul>
             * <li><strong>PolicyBasedRouteId</strong>: the instance ID of the policy-based routing rule.</li>
             * </ul>
             * <p>By default, multiple filter conditions are evaluated by using the <strong>AND</strong> operator. A resource is considered a match only if it meets all the filter conditions.</p>
             * <p>You can specify up to 5 filter conditions at a time.</p>
             * 
             * <strong>example:</strong>
             * <p>PolicyBasedRouteId</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the filter condition.</p>
             * <p>Specify the filter value based on <strong>Key</strong>. You can specify multiple filter values for a single <strong>Key</strong>. Multiple filter values are evaluated by using the <strong>OR</strong> operator. A resource is considered a match if it meets any of the filter values.</p>
             * <p>You can specify up to 5 filter values for a single filter condition.</p>
             */
            public Builder value(java.util.List<String> value) {
                this.value = value;
                return this;
            }

            public Filter build() {
                return new Filter(this);
            } 

        } 

    }
}
