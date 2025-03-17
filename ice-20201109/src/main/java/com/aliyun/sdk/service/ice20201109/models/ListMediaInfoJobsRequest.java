// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link ListMediaInfoJobsRequest} extends {@link RequestModel}
 *
 * <p>ListMediaInfoJobsRequest</p>
 */
public class ListMediaInfoJobsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndOfCreateTime")
    private String endOfCreateTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextPageToken")
    private String nextPageToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartOfCreateTime")
    private String startOfCreateTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ListMediaInfoJobsRequest(Builder builder) {
        super(builder);
        this.endOfCreateTime = builder.endOfCreateTime;
        this.jobId = builder.jobId;
        this.nextPageToken = builder.nextPageToken;
        this.orderBy = builder.orderBy;
        this.pageSize = builder.pageSize;
        this.startOfCreateTime = builder.startOfCreateTime;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMediaInfoJobsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endOfCreateTime
     */
    public String getEndOfCreateTime() {
        return this.endOfCreateTime;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return nextPageToken
     */
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startOfCreateTime
     */
    public String getStartOfCreateTime() {
        return this.startOfCreateTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListMediaInfoJobsRequest, Builder> {
        private String endOfCreateTime; 
        private String jobId; 
        private String nextPageToken; 
        private String orderBy; 
        private Integer pageSize; 
        private String startOfCreateTime; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListMediaInfoJobsRequest request) {
            super(request);
            this.endOfCreateTime = request.endOfCreateTime;
            this.jobId = request.jobId;
            this.nextPageToken = request.nextPageToken;
            this.orderBy = request.orderBy;
            this.pageSize = request.pageSize;
            this.startOfCreateTime = request.startOfCreateTime;
            this.status = request.status;
        } 

        /**
         * <p>The end of the time range during which the jobs to be queried were created. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-15T00:00:00Z</p>
         */
        public Builder endOfCreateTime(String endOfCreateTime) {
            this.putQueryParameter("EndOfCreateTime", endOfCreateTime);
            this.endOfCreateTime = endOfCreateTime;
            return this;
        }

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7b38a5d86f1e47838927b6e7ccb11cbe</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request.</p>
         * 
         * <strong>example:</strong>
         * <p>ab4802364a2e49208c99efab82dfa8e8</p>
         */
        public Builder nextPageToken(String nextPageToken) {
            this.putQueryParameter("NextPageToken", nextPageToken);
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * <p>The order that you use to sort the query results. Valid values:</p>
         * <ul>
         * <li>CreateTimeDesc: sorts the query results by creation time in descending order.</li>
         * <li>CreateTimeAsc: sorts the query results by creation time in ascending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CreateTimeDesc</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The beginning of the time range during which the jobs to be queried were created. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-01T00:00:00Z</p>
         */
        public Builder startOfCreateTime(String startOfCreateTime) {
            this.putQueryParameter("StartOfCreateTime", startOfCreateTime);
            this.startOfCreateTime = startOfCreateTime;
            return this;
        }

        /**
         * <p>The state of the job. Valid values:</p>
         * <ul>
         * <li>Init: The job is submitted.</li>
         * <li>Success: The job is successful.</li>
         * <li>Fail: The job failed.</li>
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
        public ListMediaInfoJobsRequest build() {
            return new ListMediaInfoJobsRequest(this);
        } 

    } 

}
