// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListMediaProducingJobsRequest} extends {@link RequestModel}
 *
 * <p>ListMediaProducingJobsRequest</p>
 */
public class ListMediaProducingJobsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobType")
    private String jobType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterJobId")
    private String masterJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
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
        this.projectId = builder.projectId;
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
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
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
        private String projectId; 
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
            this.projectId = request.projectId;
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
         * <p>The end of the time range to query. The maximum time range between EndTime and StartTime cannot exceed 30 days. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-02T23:59:59Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The job type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>LiveEditingJob: live editing job.</li>
         * <li>EditingJob: regular template-based editing job</li>
         * <li>VETemplateJob: advanced template-based editing job.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EditingJob</p>
         */
        public Builder jobType(String jobType) {
            this.putQueryParameter("JobType", jobType);
            this.jobType = jobType;
            return this;
        }

        /**
         * <p>The search keyword. For example, you can use a job ID as the keyword to search for jobs.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The ID of the quick video production job. If this parameter is specified, the subjobs of the quick video production job are queried.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>8750b54e3c976a47da6f</strong></strong></strong></p>
         */
        public Builder masterJobId(String masterJobId) {
            this.putQueryParameter("MasterJobId", masterJobId);
            this.masterJobId = masterJobId;
            return this;
        }

        /**
         * <p>The maximum number of entries to return.</p>
         * <p>Default value: 10. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>8EqYpQbZ6Eh7+Zz8DxVYoQ==</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the online editing project.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>927cfb53d05b96c1bfe1</strong></strong></strong></p>
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The sorting parameter. By default, the query results are sorted by creation time in descending order.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>CreationTime:Asc: sorted by creation time in ascending order.</li>
         * <li>CreationTime:Desc: sorted by creation time in descending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CreationTime:Desc</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-01-11T12:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The job state.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Init: The job is initialized.</li>
         * <li>Failed: The job failed.</li>
         * <li>Success: The job is successful.</li>
         * <li>Processing: The job is in progress.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
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
