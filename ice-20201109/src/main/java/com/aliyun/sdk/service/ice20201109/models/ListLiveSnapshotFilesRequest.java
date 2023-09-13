// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLiveSnapshotFilesRequest} extends {@link RequestModel}
 *
 * <p>ListLiveSnapshotFilesRequest</p>
 */
public class ListLiveSnapshotFilesRequest extends Request {
    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("JobId")
    @Validation(required = true)
    private String jobId;

    @Query
    @NameInMap("Limit")
    private Integer limit;

    @Query
    @NameInMap("SortBy")
    private String sortBy;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    private ListLiveSnapshotFilesRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.jobId = builder.jobId;
        this.limit = builder.limit;
        this.sortBy = builder.sortBy;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLiveSnapshotFilesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
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

    public static final class Builder extends Request.Builder<ListLiveSnapshotFilesRequest, Builder> {
        private String endTime; 
        private String jobId; 
        private Integer limit; 
        private String sortBy; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListLiveSnapshotFilesRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.jobId = request.jobId;
            this.limit = request.limit;
            this.sortBy = request.sortBy;
            this.startTime = request.startTime;
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
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * Limit.
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
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

        @Override
        public ListLiveSnapshotFilesRequest build() {
            return new ListLiveSnapshotFilesRequest(this);
        } 

    } 

}
