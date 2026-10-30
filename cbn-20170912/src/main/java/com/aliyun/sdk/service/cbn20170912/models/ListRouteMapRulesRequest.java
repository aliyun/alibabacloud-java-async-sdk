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
 * {@link ListRouteMapRulesRequest} extends {@link RequestModel}
 *
 * <p>ListRouteMapRulesRequest</p>
 */
public class ListRouteMapRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filter")
    private java.util.List<Filter> filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteMapId")
    private String routeMapId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteMapRuleIds")
    private java.util.List<String> routeMapRuleIds;

    private ListRouteMapRulesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.filter = builder.filter;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.routeMapId = builder.routeMapId;
        this.routeMapRuleIds = builder.routeMapRuleIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRouteMapRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
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
     * @return routeMapId
     */
    public String getRouteMapId() {
        return this.routeMapId;
    }

    /**
     * @return routeMapRuleIds
     */
    public java.util.List<String> getRouteMapRuleIds() {
        return this.routeMapRuleIds;
    }

    public static final class Builder extends Request.Builder<ListRouteMapRulesRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private java.util.List<Filter> filter; 
        private Integer maxResults; 
        private String nextToken; 
        private String routeMapId; 
        private java.util.List<String> routeMapRuleIds; 

        private Builder() {
            super();
        } 

        private Builder(ListRouteMapRulesRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.filter = request.filter;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.routeMapId = request.routeMapId;
            this.routeMapRuleIds = request.routeMapRuleIds;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can generate a parameter value on your client to ensure that the value is unique across different requests. The ClientToken parameter supports only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request may be different.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>02fb3da4-130e-11e9-8e44-001****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to only precheck the request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: sends a check request and does not query the route map rules. Check items include whether required parameters are specified, request format, and service limits. If the check fails, the corresponding error is returned. If the check succeeds, the error code DryRunOperation is returned.</li>
         * <li><strong>false</strong> (default): sends a normal request and directly queries the route map rules after the check succeeds.</li>
         * </ul>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The information about the filter conditions.</p>
         * <p>You can specify up to 5 filter conditions at a time.</p>
         */
        public Builder filter(java.util.List<Filter> filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * <p>The number of entries to return on each page in a paginated query.</p>
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
         * <li>You do not need to specify this parameter for the first query or when no next query is available.</li>
         * <li>If a next query is available, set this parameter to the <strong>NextToken</strong> value returned by the previous API call.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dd20****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the route map to query.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-0a1b2c3d4e5f6a7b8</p>
         */
        public Builder routeMapId(String routeMapId) {
            this.putQueryParameter("RouteMapId", routeMapId);
            this.routeMapId = routeMapId;
            return this;
        }

        /**
         * <p>The list of route map rule IDs to query. This parameter and filter conditions can be used together for matching, and they have an AND relationship.</p>
         */
        public Builder routeMapRuleIds(java.util.List<String> routeMapRuleIds) {
            this.putQueryParameter("RouteMapRuleIds", routeMapRuleIds);
            this.routeMapRuleIds = routeMapRuleIds;
            return this;
        }

        @Override
        public ListRouteMapRulesRequest build() {
            return new ListRouteMapRulesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListRouteMapRulesRequest} extends {@link TeaModel}
     *
     * <p>ListRouteMapRulesRequest</p>
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
             * <li><strong>Name</strong>: the name of the route map rule.</li>
             * <li><strong>Priority</strong>: the priority of the route map rule.</li>
             * </ul>
             * <p>By default, multiple filter conditions have an AND relationship. A match succeeds only when all filter conditions are met.</p>
             * <p>You can specify up to 5 filter conditions at a time.</p>
             * 
             * <strong>example:</strong>
             * <p>Name</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the filter condition.</p>
             * <p>Specify the filter value based on the Key parameter. You can specify multiple filter values for a single key. Multiple filter values have an OR relationship. A match succeeds if any of the filter values is met.</p>
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
