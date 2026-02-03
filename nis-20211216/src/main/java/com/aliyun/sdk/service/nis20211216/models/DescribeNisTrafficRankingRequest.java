// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

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
 * {@link DescribeNisTrafficRankingRequest} extends {@link RequestModel}
 *
 * <p>DescribeNisTrafficRankingRequest</p>
 */
public class DescribeNisTrafficRankingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 20)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NisTrafficRankingId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nisTrafficRankingId;

    private DescribeNisTrafficRankingRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.nisTrafficRankingId = builder.nisTrafficRankingId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNisTrafficRankingRequest create() {
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
     * @return nisTrafficRankingId
     */
    public String getNisTrafficRankingId() {
        return this.nisTrafficRankingId;
    }

    public static final class Builder extends Request.Builder<DescribeNisTrafficRankingRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private String nisTrafficRankingId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNisTrafficRankingRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.nisTrafficRankingId = request.nisTrafficRankingId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>task-6462a7b4c4a54b****</p>
         */
        public Builder nisTrafficRankingId(String nisTrafficRankingId) {
            this.putQueryParameter("NisTrafficRankingId", nisTrafficRankingId);
            this.nisTrafficRankingId = nisTrafficRankingId;
            return this;
        }

        @Override
        public DescribeNisTrafficRankingRequest build() {
            return new DescribeNisTrafficRankingRequest(this);
        } 

    } 

}
