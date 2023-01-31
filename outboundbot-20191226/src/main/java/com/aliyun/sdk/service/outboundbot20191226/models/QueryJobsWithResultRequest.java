// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryJobsWithResultRequest} extends {@link RequestModel}
 *
 * <p>QueryJobsWithResultRequest</p>
 */
public class QueryJobsWithResultRequest extends Request {
    @Query
    @NameInMap("HasAnsweredFilter")
    private Boolean hasAnsweredFilter;

    @Query
    @NameInMap("HasHangUpByRejectionFilter")
    private Boolean hasHangUpByRejectionFilter;

    @Query
    @NameInMap("HasReachedEndOfFlowFilter")
    private Boolean hasReachedEndOfFlowFilter;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("JobGroupId")
    @Validation(required = true)
    private String jobGroupId;

    @Query
    @NameInMap("JobStatusFilter")
    private String jobStatusFilter;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("QueryText")
    private String queryText;

    @Query
    @NameInMap("TaskStatusFilter")
    private String taskStatusFilter;

    private QueryJobsWithResultRequest(Builder builder) {
        super(builder);
        this.hasAnsweredFilter = builder.hasAnsweredFilter;
        this.hasHangUpByRejectionFilter = builder.hasHangUpByRejectionFilter;
        this.hasReachedEndOfFlowFilter = builder.hasReachedEndOfFlowFilter;
        this.instanceId = builder.instanceId;
        this.jobGroupId = builder.jobGroupId;
        this.jobStatusFilter = builder.jobStatusFilter;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.queryText = builder.queryText;
        this.taskStatusFilter = builder.taskStatusFilter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryJobsWithResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hasAnsweredFilter
     */
    public Boolean getHasAnsweredFilter() {
        return this.hasAnsweredFilter;
    }

    /**
     * @return hasHangUpByRejectionFilter
     */
    public Boolean getHasHangUpByRejectionFilter() {
        return this.hasHangUpByRejectionFilter;
    }

    /**
     * @return hasReachedEndOfFlowFilter
     */
    public Boolean getHasReachedEndOfFlowFilter() {
        return this.hasReachedEndOfFlowFilter;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return jobGroupId
     */
    public String getJobGroupId() {
        return this.jobGroupId;
    }

    /**
     * @return jobStatusFilter
     */
    public String getJobStatusFilter() {
        return this.jobStatusFilter;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return queryText
     */
    public String getQueryText() {
        return this.queryText;
    }

    /**
     * @return taskStatusFilter
     */
    public String getTaskStatusFilter() {
        return this.taskStatusFilter;
    }

    public static final class Builder extends Request.Builder<QueryJobsWithResultRequest, Builder> {
        private Boolean hasAnsweredFilter; 
        private Boolean hasHangUpByRejectionFilter; 
        private Boolean hasReachedEndOfFlowFilter; 
        private String instanceId; 
        private String jobGroupId; 
        private String jobStatusFilter; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String queryText; 
        private String taskStatusFilter; 

        private Builder() {
            super();
        } 

        private Builder(QueryJobsWithResultRequest request) {
            super(request);
            this.hasAnsweredFilter = request.hasAnsweredFilter;
            this.hasHangUpByRejectionFilter = request.hasHangUpByRejectionFilter;
            this.hasReachedEndOfFlowFilter = request.hasReachedEndOfFlowFilter;
            this.instanceId = request.instanceId;
            this.jobGroupId = request.jobGroupId;
            this.jobStatusFilter = request.jobStatusFilter;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.queryText = request.queryText;
            this.taskStatusFilter = request.taskStatusFilter;
        } 

        /**
         * HasAnsweredFilter.
         */
        public Builder hasAnsweredFilter(Boolean hasAnsweredFilter) {
            this.putQueryParameter("HasAnsweredFilter", hasAnsweredFilter);
            this.hasAnsweredFilter = hasAnsweredFilter;
            return this;
        }

        /**
         * HasHangUpByRejectionFilter.
         */
        public Builder hasHangUpByRejectionFilter(Boolean hasHangUpByRejectionFilter) {
            this.putQueryParameter("HasHangUpByRejectionFilter", hasHangUpByRejectionFilter);
            this.hasHangUpByRejectionFilter = hasHangUpByRejectionFilter;
            return this;
        }

        /**
         * HasReachedEndOfFlowFilter.
         */
        public Builder hasReachedEndOfFlowFilter(Boolean hasReachedEndOfFlowFilter) {
            this.putQueryParameter("HasReachedEndOfFlowFilter", hasReachedEndOfFlowFilter);
            this.hasReachedEndOfFlowFilter = hasReachedEndOfFlowFilter;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * JobGroupId.
         */
        public Builder jobGroupId(String jobGroupId) {
            this.putQueryParameter("JobGroupId", jobGroupId);
            this.jobGroupId = jobGroupId;
            return this;
        }

        /**
         * JobStatusFilter.
         */
        public Builder jobStatusFilter(String jobStatusFilter) {
            this.putQueryParameter("JobStatusFilter", jobStatusFilter);
            this.jobStatusFilter = jobStatusFilter;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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
         * QueryText.
         */
        public Builder queryText(String queryText) {
            this.putQueryParameter("QueryText", queryText);
            this.queryText = queryText;
            return this;
        }

        /**
         * TaskStatusFilter.
         */
        public Builder taskStatusFilter(String taskStatusFilter) {
            this.putQueryParameter("TaskStatusFilter", taskStatusFilter);
            this.taskStatusFilter = taskStatusFilter;
            return this;
        }

        @Override
        public QueryJobsWithResultRequest build() {
            return new QueryJobsWithResultRequest(this);
        } 

    } 

}
