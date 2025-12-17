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
 * {@link DescribeGlobalTimerBatchesRequest} extends {@link RequestModel}
 *
 * <p>DescribeGlobalTimerBatchesRequest</p>
 */
public class DescribeGlobalTimerBatchesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private String maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchRegionId")
    private String searchRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimerType")
    private String timerType;

    private DescribeGlobalTimerBatchesRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.searchRegionId = builder.searchRegionId;
        this.timerType = builder.timerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGlobalTimerBatchesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return maxResults
     */
    public String getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return searchRegionId
     */
    public String getSearchRegionId() {
        return this.searchRegionId;
    }

    /**
     * @return timerType
     */
    public String getTimerType() {
        return this.timerType;
    }

    public static final class Builder extends Request.Builder<DescribeGlobalTimerBatchesRequest, Builder> {
        private String groupId; 
        private String maxResults; 
        private String nextToken; 
        private String regionId; 
        private String searchRegionId; 
        private String timerType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGlobalTimerBatchesRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.searchRegionId = request.searchRegionId;
            this.timerType = request.timerType;
        } 

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(String maxResults) {
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SearchRegionId.
         */
        public Builder searchRegionId(String searchRegionId) {
            this.putQueryParameter("SearchRegionId", searchRegionId);
            this.searchRegionId = searchRegionId;
            return this;
        }

        /**
         * TimerType.
         */
        public Builder timerType(String timerType) {
            this.putQueryParameter("TimerType", timerType);
            this.timerType = timerType;
            return this;
        }

        @Override
        public DescribeGlobalTimerBatchesRequest build() {
            return new DescribeGlobalTimerBatchesRequest(this);
        } 

    } 

}
