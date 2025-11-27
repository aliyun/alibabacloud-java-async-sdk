// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpcinstant20230701.models;

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
 * {@link ListActionPlansRequest} extends {@link RequestModel}
 *
 * <p>ListActionPlansRequest</p>
 */
public class ListActionPlansRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionPlanIds")
    private java.util.List<String> actionPlanIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    private ListActionPlansRequest(Builder builder) {
        super(builder);
        this.actionPlanIds = builder.actionPlanIds;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListActionPlansRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionPlanIds
     */
    public java.util.List<String> getActionPlanIds() {
        return this.actionPlanIds;
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

    public static final class Builder extends Request.Builder<ListActionPlansRequest, Builder> {
        private java.util.List<String> actionPlanIds; 
        private Integer maxResults; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListActionPlansRequest request) {
            super(request);
            this.actionPlanIds = request.actionPlanIds;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
        } 

        /**
         * <p>The IDs of the execution plans to be queried.</p>
         */
        public Builder actionPlanIds(java.util.List<String> actionPlanIds) {
            String actionPlanIdsShrink = shrink(actionPlanIds, "ActionPlanIds", "json");
            this.putQueryParameter("ActionPlanIds", actionPlanIdsShrink);
            this.actionPlanIds = actionPlanIds;
            return this;
        }

        /**
         * <p>The maximum number of entries per page.</p>
         * <p>Valid values: 1 to 100.</p>
         * <p>Default value: 20.</p>
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
         * <p>A pagination token.</p>
         * 
         * <strong>example:</strong>
         * <p>1d2db86scXXXXXXXXXX</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public ListActionPlansRequest build() {
            return new ListActionPlansRequest(this);
        } 

    } 

}
