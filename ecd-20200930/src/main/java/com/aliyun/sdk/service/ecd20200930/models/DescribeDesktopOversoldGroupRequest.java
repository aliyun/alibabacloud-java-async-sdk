// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDesktopOversoldGroupRequest} extends {@link RequestModel}
 *
 * <p>DescribeDesktopOversoldGroupRequest</p>
 */
public class DescribeDesktopOversoldGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OversoldGroupIds")
    private java.util.List < String > oversoldGroupIds;

    private DescribeDesktopOversoldGroupRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.oversoldGroupIds = builder.oversoldGroupIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDesktopOversoldGroupRequest create() {
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
     * @return oversoldGroupIds
     */
    public java.util.List < String > getOversoldGroupIds() {
        return this.oversoldGroupIds;
    }

    public static final class Builder extends Request.Builder<DescribeDesktopOversoldGroupRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List < String > oversoldGroupIds; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDesktopOversoldGroupRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.oversoldGroupIds = request.oversoldGroupIds;
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
         * OversoldGroupIds.
         */
        public Builder oversoldGroupIds(java.util.List < String > oversoldGroupIds) {
            this.putQueryParameter("OversoldGroupIds", oversoldGroupIds);
            this.oversoldGroupIds = oversoldGroupIds;
            return this;
        }

        @Override
        public DescribeDesktopOversoldGroupRequest build() {
            return new DescribeDesktopOversoldGroupRequest(this);
        } 

    } 

}
