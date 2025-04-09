// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link QueryJobsWithResultRequest} extends {@link RequestModel}
 *
 * <p>QueryJobsWithResultRequest</p>
 */
public class QueryJobsWithResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndActualTimeFilter")
    private Long endActualTimeFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HasAnsweredFilter")
    private Boolean hasAnsweredFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HasHangUpByRejectionFilter")
    private Boolean hasHangUpByRejectionFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HasReachedEndOfFlowFilter")
    private Boolean hasReachedEndOfFlowFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobFailureReasonsFilter")
    private String jobFailureReasonsFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobStatusFilter")
    private String jobStatusFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryText")
    private String queryText;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartActualTimeFilter")
    private Long startActualTimeFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskStatusFilter")
    private String taskStatusFilter;

    private QueryJobsWithResultRequest(Builder builder) {
        super(builder);
        this.endActualTimeFilter = builder.endActualTimeFilter;
        this.hasAnsweredFilter = builder.hasAnsweredFilter;
        this.hasHangUpByRejectionFilter = builder.hasHangUpByRejectionFilter;
        this.hasReachedEndOfFlowFilter = builder.hasReachedEndOfFlowFilter;
        this.instanceId = builder.instanceId;
        this.jobFailureReasonsFilter = builder.jobFailureReasonsFilter;
        this.jobGroupId = builder.jobGroupId;
        this.jobStatusFilter = builder.jobStatusFilter;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.queryText = builder.queryText;
        this.startActualTimeFilter = builder.startActualTimeFilter;
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
     * @return endActualTimeFilter
     */
    public Long getEndActualTimeFilter() {
        return this.endActualTimeFilter;
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
     * @return jobFailureReasonsFilter
     */
    public String getJobFailureReasonsFilter() {
        return this.jobFailureReasonsFilter;
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
     * @return startActualTimeFilter
     */
    public Long getStartActualTimeFilter() {
        return this.startActualTimeFilter;
    }

    /**
     * @return taskStatusFilter
     */
    public String getTaskStatusFilter() {
        return this.taskStatusFilter;
    }

    public static final class Builder extends Request.Builder<QueryJobsWithResultRequest, Builder> {
        private Long endActualTimeFilter; 
        private Boolean hasAnsweredFilter; 
        private Boolean hasHangUpByRejectionFilter; 
        private Boolean hasReachedEndOfFlowFilter; 
        private String instanceId; 
        private String jobFailureReasonsFilter; 
        private String jobGroupId; 
        private String jobStatusFilter; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String queryText; 
        private Long startActualTimeFilter; 
        private String taskStatusFilter; 

        private Builder() {
            super();
        } 

        private Builder(QueryJobsWithResultRequest request) {
            super(request);
            this.endActualTimeFilter = request.endActualTimeFilter;
            this.hasAnsweredFilter = request.hasAnsweredFilter;
            this.hasHangUpByRejectionFilter = request.hasHangUpByRejectionFilter;
            this.hasReachedEndOfFlowFilter = request.hasReachedEndOfFlowFilter;
            this.instanceId = request.instanceId;
            this.jobFailureReasonsFilter = request.jobFailureReasonsFilter;
            this.jobGroupId = request.jobGroupId;
            this.jobStatusFilter = request.jobStatusFilter;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.queryText = request.queryText;
            this.startActualTimeFilter = request.startActualTimeFilter;
            this.taskStatusFilter = request.taskStatusFilter;
        } 

        /**
         * EndActualTimeFilter.
         */
        public Builder endActualTimeFilter(Long endActualTimeFilter) {
            this.putQueryParameter("EndActualTimeFilter", endActualTimeFilter);
            this.endActualTimeFilter = endActualTimeFilter;
            return this;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9d53cd72-4050-4419-8c17-acc0bf158147</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * JobFailureReasonsFilter.
         */
        public Builder jobFailureReasonsFilter(String jobFailureReasonsFilter) {
            this.putQueryParameter("JobFailureReasonsFilter", jobFailureReasonsFilter);
            this.jobFailureReasonsFilter = jobFailureReasonsFilter;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ad16fc35-d824-4102-a606-2be51c1aa6dd</p>
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
         * StartActualTimeFilter.
         */
        public Builder startActualTimeFilter(Long startActualTimeFilter) {
            this.putQueryParameter("StartActualTimeFilter", startActualTimeFilter);
            this.startActualTimeFilter = startActualTimeFilter;
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
