// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListSmartJobsRequest} extends {@link RequestModel}
 *
 * <p>ListSmartJobsRequest</p>
 */
public class ListSmartJobsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobState")
    private String jobState;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobType")
    private String jobType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
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
         * <p>The job state.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Finished: The job is complete.</li>
         * <li>Failed: The job failed.</li>
         * <li>Executing: The job is in progress.</li>
         * <li>Created: The job is created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        public Builder jobState(String jobState) {
            this.putQueryParameter("JobState", jobState);
            this.jobState = jobState;
            return this;
        }

        /**
         * <p>The job type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>ASR: automatic speech recognition(job) job.</li>
         * <li>DynamicChart: dynamic chart job.</li>
         * <li>VideoTranslation: video translation job.</li>
         * <li>TextToSpeech: intelligent audio production job.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ASR</p>
         */
        public Builder jobType(String jobType) {
            this.putQueryParameter("JobType", jobType);
            this.jobType = jobType;
            return this;
        }

        /**
         * <p>The maximum number of entries to return.</p>
         * <p>Default value: 10. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>73f33c91-d59383e8280b</strong></strong></p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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

        @Override
        public ListSmartJobsRequest build() {
            return new ListSmartJobsRequest(this);
        } 

    } 

}
