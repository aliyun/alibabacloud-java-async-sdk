// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link QueryHistoryUsageDurationRankRequest} extends {@link RequestModel}
 *
 * <p>QueryHistoryUsageDurationRankRequest</p>
 */
public class QueryHistoryUsageDurationRankRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    private Integer bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Integer limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    private QueryHistoryUsageDurationRankRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.endDate = builder.endDate;
        this.limit = builder.limit;
        this.nextToken = builder.nextToken;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryHistoryUsageDurationRankRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizType
     */
    public Integer getBizType() {
        return this.bizType;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<QueryHistoryUsageDurationRankRequest, Builder> {
        private Integer bizType; 
        private String endDate; 
        private Integer limit; 
        private String nextToken; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(QueryHistoryUsageDurationRankRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.endDate = request.endDate;
            this.limit = request.limit;
            this.nextToken = request.nextToken;
            this.startDate = request.startDate;
        } 

        /**
         * <p>The business type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder bizType(Integer bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>The end date of the query. Format: YYYY-MM-DD. Supports querying data within a maximum of 90 days.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-19</p>
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>The number of results to return. Default value: 5. Maximum value: 200.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>The paging token for the next query. Obtained from the previous response.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The start date of the query. Format: YYYY-MM-DD. Supports querying data within a maximum of 90 days.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-07</p>
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public QueryHistoryUsageDurationRankRequest build() {
            return new QueryHistoryUsageDurationRankRequest(this);
        } 

    } 

}
