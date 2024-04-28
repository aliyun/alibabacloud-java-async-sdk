// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMediaProducingJobsRequest} extends {@link RequestModel}
 *
 * <p>ListMediaProducingJobsRequest</p>
 */
public class ListMediaProducingJobsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("JobType")
    private String jobType;

    @Query
    @NameInMap("Keyword")
    private String keyword;

    @Query
    @NameInMap("MasterJobId")
    private String masterJobId;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("SortBy")
    private String sortBy;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("Status")
    private String status;

    private ListMediaProducingJobsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.endTime = builder.endTime;
        this.jobType = builder.jobType;
        this.keyword = builder.keyword;
        this.masterJobId = builder.masterJobId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.sortBy = builder.sortBy;
        this.startTime = builder.startTime;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMediaProducingJobsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return masterJobId
     */
    public String getMasterJobId() {
        return this.masterJobId;
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
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListMediaProducingJobsRequest, Builder> {
        private String regionId; 
        private String endTime; 
        private String jobType; 
        private String keyword; 
        private String masterJobId; 
        private Integer maxResults; 
        private String nextToken; 
        private String sortBy; 
        private String startTime; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListMediaProducingJobsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.endTime = request.endTime;
            this.jobType = request.jobType;
            this.keyword = request.keyword;
            this.masterJobId = request.masterJobId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.sortBy = request.sortBy;
            this.startTime = request.startTime;
            this.status = request.status;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
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
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * MasterJobId.
         */
        public Builder masterJobId(String masterJobId) {
            this.putQueryParameter("MasterJobId", masterJobId);
            this.masterJobId = masterJobId;
            return this;
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
         * SortBy.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListMediaProducingJobsRequest build() {
            return new ListMediaProducingJobsRequest(this);
        } 

    } 

}
