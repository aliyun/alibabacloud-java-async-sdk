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
         * Accessibility.
         */
        public Builder accessibility(String accessibility) {
            this.putQueryParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * BusinessUserId.
         */
        public Builder businessUserId(String businessUserId) {
            this.putQueryParameter("BusinessUserId", businessUserId);
            this.businessUserId = businessUserId;
            return this;
        }

        /**
         * Caller.
         */
        public Builder caller(String caller) {
            this.putQueryParameter("Caller", caller);
            this.caller = caller;
            return this;
        }

        /**
         * DisplayName.
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
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
         * FromAllWorkspaces.
         */
        public Builder fromAllWorkspaces(Boolean fromAllWorkspaces) {
            this.putQueryParameter("FromAllWorkspaces", fromAllWorkspaces);
            this.fromAllWorkspaces = fromAllWorkspaces;
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
         * JobType.
         */
        public Builder jobType(String jobType) {
            this.putQueryParameter("JobType", jobType);
            this.jobType = jobType;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * OversoldInfo.
         */
        public Builder oversoldInfo(String oversoldInfo) {
            this.putQueryParameter("OversoldInfo", oversoldInfo);
            this.oversoldInfo = oversoldInfo;
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
         * PipelineId.
         */
        public Builder pipelineId(String pipelineId) {
            this.putQueryParameter("PipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * ResourceQuotaName.
         */
        public Builder resourceQuotaName(String resourceQuotaName) {
            this.putQueryParameter("ResourceQuotaName", resourceQuotaName);
            this.resourceQuotaName = resourceQuotaName;
            return this;
        }

        /**
         * ShowOwn.
         */
        public Builder showOwn(Boolean showOwn) {
            this.putQueryParameter("ShowOwn", showOwn);
            this.showOwn = showOwn;
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

        /**
         * Tags.
         */
        public Builder tags(java.util.Map<String, String> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * UserIdForFilter.
         */
        public Builder userIdForFilter(String userIdForFilter) {
            this.putQueryParameter("UserIdForFilter", userIdForFilter);
            this.userIdForFilter = userIdForFilter;
            return this;
        }

        /**
         * Username.
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        /**
         * WorkspaceId.
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
