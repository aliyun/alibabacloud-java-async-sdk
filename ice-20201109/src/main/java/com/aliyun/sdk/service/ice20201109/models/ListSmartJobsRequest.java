// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSmartJobsRequest} extends {@link RequestModel}
 *
 * <p>ListSmartJobsRequest</p>
 */
public class ListSmartJobsRequest extends Request {
    @Query
    @NameInMap("JobState")
    private String jobState;

    @Query
    @NameInMap("JobType")
    private String jobType;

    @Query
    @NameInMap("MaxResults")
    private Long maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("PageNo")
    private Long pageNo;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    @Query
    @NameInMap("SortBy")
    private String sortBy;

    private ListSmartJobsRequest(Builder builder) {
        super(builder);
        this.jobState = builder.jobState;
        this.jobType = builder.jobType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.sortBy = builder.sortBy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSmartJobsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobState
     */
    public String getJobState() {
        return this.jobState;
    }

    /**
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    public static final class Builder extends Request.Builder<ListSmartJobsRequest, Builder> {
        private String jobState; 
        private String jobType; 
        private Long maxResults; 
        private String nextToken; 
        private Long pageNo; 
        private Long pageSize; 
        private String sortBy; 

        private Builder() {
            super();
        } 

        private Builder(ListSmartJobsRequest request) {
            super(request);
            this.jobState = request.jobState;
            this.jobType = request.jobType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.sortBy = request.sortBy;
        } 

        /**
         * JobState.
         */
        public Builder jobState(String jobState) {
            this.putQueryParameter("JobState", jobState);
            this.jobState = jobState;
            return this;
        }

        /**
         * JobType.
         */
        public Builder jobType(String jobType) {
            this.putQueryParameter("JobType", jobType);
            this.jobType = jobType;
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
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SortBy.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        @Override
        public ListSmartJobsRequest build() {
            return new ListSmartJobsRequest(this);
        } 

    } 

}
