// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDynamicImageJobsRequest} extends {@link RequestModel}
 *
 * <p>ListDynamicImageJobsRequest</p>
 */
public class ListDynamicImageJobsRequest extends Request {
    @Query
    @NameInMap("EndOfCreateTime")
    private String endOfCreateTime;

    @Query
    @NameInMap("JobId")
    private String jobId;

    @Query
    @NameInMap("NextPageToken")
    private String nextPageToken;

    @Query
    @NameInMap("OrderBy")
    private String orderBy;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("StartOfCreateTime")
    private String startOfCreateTime;

    @Query
    @NameInMap("Status")
    private String status;

    private ListDynamicImageJobsRequest(Builder builder) {
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

    public static ListDynamicImageJobsRequest create() {
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

    public static final class Builder extends Request.Builder<ListDynamicImageJobsRequest, Builder> {
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

        private Builder(ListDynamicImageJobsRequest request) {
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
         * EndOfCreateTime.
         */
        public Builder endOfCreateTime(String endOfCreateTime) {
            this.putQueryParameter("EndOfCreateTime", endOfCreateTime);
            this.endOfCreateTime = endOfCreateTime;
            return this;
        }

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * NextPageToken.
         */
        public Builder nextPageToken(String nextPageToken) {
            this.putQueryParameter("NextPageToken", nextPageToken);
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * OrderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * StartOfCreateTime.
         */
        public Builder startOfCreateTime(String startOfCreateTime) {
            this.putQueryParameter("StartOfCreateTime", startOfCreateTime);
            this.startOfCreateTime = startOfCreateTime;
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
        public ListDynamicImageJobsRequest build() {
            return new ListDynamicImageJobsRequest(this);
        } 

    } 

}
