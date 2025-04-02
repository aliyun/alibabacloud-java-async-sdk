// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link ListJobsRequest} extends {@link RequestModel}
 *
 * <p>ListJobsRequest</p>
 */
public class ListJobsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessUserId")
    private String businessUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Caller")
    private String caller;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    @com.aliyun.core.annotation.Validation(maxLength = 1024)
    private String displayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FromAllWorkspaces")
    private Boolean fromAllWorkspaces;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobType")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private String jobType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OversoldInfo")
    private String oversoldInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PaymentType")
    private String paymentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PipelineId")
    private String pipelineId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceQuotaName")
    private String resourceQuotaName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowOwn")
    private Boolean showOwn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.Map<String, String> tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserIdForFilter")
    private String userIdForFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Username")
    private String username;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private ListJobsRequest(Builder builder) {
        super(builder);
        this.accessibility = builder.accessibility;
        this.businessUserId = builder.businessUserId;
        this.caller = builder.caller;
        this.displayName = builder.displayName;
        this.endTime = builder.endTime;
        this.fromAllWorkspaces = builder.fromAllWorkspaces;
        this.jobId = builder.jobId;
        this.jobType = builder.jobType;
        this.order = builder.order;
        this.oversoldInfo = builder.oversoldInfo;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.paymentType = builder.paymentType;
        this.pipelineId = builder.pipelineId;
        this.resourceId = builder.resourceId;
        this.resourceQuotaName = builder.resourceQuotaName;
        this.showOwn = builder.showOwn;
        this.sortBy = builder.sortBy;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.tags = builder.tags;
        this.userIdForFilter = builder.userIdForFilter;
        this.username = builder.username;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
    }

    /**
     * @return businessUserId
     */
    public String getBusinessUserId() {
        return this.businessUserId;
    }

    /**
     * @return caller
     */
    public String getCaller() {
        return this.caller;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return fromAllWorkspaces
     */
    public Boolean getFromAllWorkspaces() {
        return this.fromAllWorkspaces;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return oversoldInfo
     */
    public String getOversoldInfo() {
        return this.oversoldInfo;
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
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
    }

    /**
     * @return pipelineId
     */
    public String getPipelineId() {
        return this.pipelineId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceQuotaName
     */
    public String getResourceQuotaName() {
        return this.resourceQuotaName;
    }

    /**
     * @return showOwn
     */
    public Boolean getShowOwn() {
        return this.showOwn;
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

    /**
     * @return tags
     */
    public java.util.Map<String, String> getTags() {
        return this.tags;
    }

    /**
     * @return userIdForFilter
     */
    public String getUserIdForFilter() {
        return this.userIdForFilter;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListJobsRequest, Builder> {
        private String accessibility; 
        private String businessUserId; 
        private String caller; 
        private String displayName; 
        private String endTime; 
        private Boolean fromAllWorkspaces; 
        private String jobId; 
        private String jobType; 
        private String order; 
        private String oversoldInfo; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String paymentType; 
        private String pipelineId; 
        private String resourceId; 
        private String resourceQuotaName; 
        private Boolean showOwn; 
        private String sortBy; 
        private String startTime; 
        private String status; 
        private java.util.Map<String, String> tags; 
        private String userIdForFilter; 
        private String username; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListJobsRequest request) {
            super(request);
            this.accessibility = request.accessibility;
            this.businessUserId = request.businessUserId;
            this.caller = request.caller;
            this.displayName = request.displayName;
            this.endTime = request.endTime;
            this.fromAllWorkspaces = request.fromAllWorkspaces;
            this.jobId = request.jobId;
            this.jobType = request.jobType;
            this.order = request.order;
            this.oversoldInfo = request.oversoldInfo;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.paymentType = request.paymentType;
            this.pipelineId = request.pipelineId;
            this.resourceId = request.resourceId;
            this.resourceQuotaName = request.resourceQuotaName;
            this.showOwn = request.showOwn;
            this.sortBy = request.sortBy;
            this.startTime = request.startTime;
            this.status = request.status;
            this.tags = request.tags;
            this.userIdForFilter = request.userIdForFilter;
            this.username = request.username;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The job visibility. Valid values:</p>
         * <ul>
         * <li>PUBLIC: The job is visible to all members in the workspace.</li>
         * <li>PRIVATE: The job is visible only to you and the administrator of the workspace.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        public Builder accessibility(String accessibility) {
            this.putQueryParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * <p>The ID of the user associated with the job.</p>
         * 
         * <strong>example:</strong>
         * <p>16****</p>
         */
        public Builder businessUserId(String businessUserId) {
            this.putQueryParameter("BusinessUserId", businessUserId);
            this.businessUserId = businessUserId;
            return this;
        }

        /**
         * <p>The caller.</p>
         * 
         * <strong>example:</strong>
         * <p>local</p>
         */
        public Builder caller(String caller) {
            this.putQueryParameter("Caller", caller);
            this.caller = caller;
            return this;
        }

        /**
         * <p>The job name. Fuzzy query is supported. The name is case-insensitive. Wildcards are not supported. For example, if you enter test, test-job1, job-test, job-test2, or job-test can be matched, and job-t1 cannot be matched. The default value null indicates any job name.</p>
         * 
         * <strong>example:</strong>
         * <p>tf-mnist-test</p>
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The end time of the query. Use the job creation time to filter data. The default value is the current time.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-09T14:45:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Specifies whether to query a list of jobs across workspaces. This parameter must be used together with <code>ShowOwn=true</code>. You can use this parameter to query a list of jobs recently submitted by the current user.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder fromAllWorkspaces(Boolean fromAllWorkspaces) {
            this.putQueryParameter("FromAllWorkspaces", fromAllWorkspaces);
            this.fromAllWorkspaces = fromAllWorkspaces;
            return this;
        }

        /**
         * <p>The job ID. Fuzzy query is supported. The name is case-insensitive. Wildcards are not supported. The default value null indicates any job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dlc********</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The job type. You can query any job type. The default value null indicates any job type. Valid values:</p>
         * <ul>
         * <li>TFJob</li>
         * <li>PyTorchJob</li>
         * <li>XGBoostJob</li>
         * <li>OneFlowJob</li>
         * <li>ElasticBatchJob</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TFJob</p>
         */
        public Builder jobType(String jobType) {
            this.putQueryParameter("JobType", jobType);
            this.jobType = jobType;
            return this;
        }

        /**
         * <p>The sorting order. Valid values:</p>
         * <ul>
         * <li>desc (default)</li>
         * <li>asc</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The Idle resource information. Valid values:</p>
         * <ul>
         * <li>ForbiddenQuotaOverSold</li>
         * <li>ForceQuotaOverSold</li>
         * <li>AcceptQuotaOverSold-true (true indicates that the job uses idle resources.)</li>
         * <li>AcceptQuotaOverSold-false (false indicates that the job uses guaranteed resources.)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ForbiddenQuotaOverSold</p>
         */
        public Builder oversoldInfo(String oversoldInfo) {
            this.putQueryParameter("OversoldInfo", oversoldInfo);
            this.oversoldInfo = oversoldInfo;
            return this;
        }

        /**
         * <p>The number of the page to return for the current query. Minimum value: 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PaymentType.
         */
        public Builder paymentType(String paymentType) {
            this.putQueryParameter("PaymentType", paymentType);
            this.paymentType = paymentType;
            return this;
        }

        /**
         * <p>The specific pipeline ID used to filter jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>flow-*******</p>
         */
        public Builder pipelineId(String pipelineId) {
            this.putQueryParameter("PipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * <p>The resource group ID. For information about how to obtain the ID of a dedicated resource group, see <a href="https://help.aliyun.com/document_detail/2651299.html">Manage resource quota</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>r*****</p>
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The resource quota name used to filter jobs. Fuzzy search is supported. Wildcards are not supported. The default value null indicates that jobs are not filtered by resource quota name.</p>
         * 
         * <strong>example:</strong>
         * <p>quota***</p>
         */
        public Builder resourceQuotaName(String resourceQuotaName) {
            this.putQueryParameter("ResourceQuotaName", resourceQuotaName);
            this.resourceQuotaName = resourceQuotaName;
            return this;
        }

        /**
         * <p>Specifies whether to query only the jobs submitted by the current user.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder showOwn(Boolean showOwn) {
            this.putQueryParameter("ShowOwn", showOwn);
            this.showOwn = showOwn;
            return this;
        }

        /**
         * <p>The sorting field in the returned job list. Valid values:</p>
         * <ul>
         * <li>DisplayName</li>
         * <li>JobType</li>
         * <li>Status</li>
         * <li>GmtCreateTime</li>
         * <li>GmtFinishTime</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GmtCreateTime</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The start time of the query. Use the job creation time to filter data. The default value is the current time minus seven days. In other words, if you do not configure the StartTime and EndTime parameters, the system queries the job list in the last seven days.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-08T16:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The job status. Valid values:</p>
         * <ul>
         * <li>Creating</li>
         * <li>Queuing</li>
         * <li>Bidding (only available for spot jobs that use Lingjun resources)</li>
         * <li>EnvPreparing</li>
         * <li>SanityChecking</li>
         * <li>Running</li>
         * <li>Restarting</li>
         * <li>Stopping</li>
         * <li>SucceededReserving</li>
         * <li>FailedReserving</li>
         * <li>Succeeded</li>
         * <li>Failed</li>
         * <li>Stopped</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tags(java.util.Map<String, String> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The user ID used to filter jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>20**************</p>
         */
        public Builder userIdForFilter(String userIdForFilter) {
            this.putQueryParameter("UserIdForFilter", userIdForFilter);
            this.userIdForFilter = userIdForFilter;
            return this;
        }

        /**
         * <p>The username used to filter jobs. Fuzzy search is supported. Wildcards are not supported. The default value null indicates that jobs are not filtered by username.</p>
         * 
         * <strong>example:</strong>
         * <p>test***</p>
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1****</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListJobsRequest build() {
            return new ListJobsRequest(this);
        } 

    } 

}
