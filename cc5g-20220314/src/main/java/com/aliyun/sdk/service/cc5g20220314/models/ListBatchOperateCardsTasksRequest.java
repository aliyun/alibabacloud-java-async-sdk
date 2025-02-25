// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBatchOperateCardsTasksRequest} extends {@link RequestModel}
 *
 * <p>ListBatchOperateCardsTasksRequest</p>
 */
public class ListBatchOperateCardsTasksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BatchOperateCardsTaskIds")
    private java.util.List < String > batchOperateCardsTaskIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Names")
    private java.util.List < String > names;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Statuses")
    private java.util.List < String > statuses;

    private ListBatchOperateCardsTasksRequest(Builder builder) {
        super(builder);
        this.batchOperateCardsTaskIds = builder.batchOperateCardsTaskIds;
        this.maxResults = builder.maxResults;
        this.names = builder.names;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.statuses = builder.statuses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBatchOperateCardsTasksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchOperateCardsTaskIds
     */
    public java.util.List < String > getBatchOperateCardsTaskIds() {
        return this.batchOperateCardsTaskIds;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return names
     */
    public java.util.List < String > getNames() {
        return this.names;
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
     * @return statuses
     */
    public java.util.List < String > getStatuses() {
        return this.statuses;
    }

    public static final class Builder extends Request.Builder<ListBatchOperateCardsTasksRequest, Builder> {
        private java.util.List < String > batchOperateCardsTaskIds; 
        private Long maxResults; 
        private java.util.List < String > names; 
        private String nextToken; 
        private String regionId; 
        private java.util.List < String > statuses; 

        private Builder() {
            super();
        } 

        private Builder(ListBatchOperateCardsTasksRequest request) {
            super(request);
            this.batchOperateCardsTaskIds = request.batchOperateCardsTaskIds;
            this.maxResults = request.maxResults;
            this.names = request.names;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.statuses = request.statuses;
        } 

        /**
         * BatchOperateCardsTaskIds.
         */
        public Builder batchOperateCardsTaskIds(java.util.List < String > batchOperateCardsTaskIds) {
            this.putQueryParameter("BatchOperateCardsTaskIds", batchOperateCardsTaskIds);
            this.batchOperateCardsTaskIds = batchOperateCardsTaskIds;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * Names.
         */
        public Builder names(java.util.List < String > names) {
            this.putQueryParameter("Names", names);
            this.names = names;
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
         * Statuses.
         */
        public Builder statuses(java.util.List < String > statuses) {
            this.putQueryParameter("Statuses", statuses);
            this.statuses = statuses;
            return this;
        }

        @Override
        public ListBatchOperateCardsTasksRequest build() {
            return new ListBatchOperateCardsTasksRequest(this);
        } 

    } 

}
