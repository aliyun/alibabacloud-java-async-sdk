// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListJobsRequest} extends {@link RequestModel}
 *
 * <p>ListJobsRequest</p>
 */
public class ListJobsRequest extends Request {
    @Query
    @NameInMap("BusinessUserId")
    private String businessUserId;

    @Query
    @NameInMap("Caller")
    private String caller;

    @Query
    @NameInMap("DisplayName")
    @Validation(maxLength = 1024)
    private String displayName;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("FromAllWorkspaces")
    private Boolean fromAllWorkspaces;

    @Query
    @NameInMap("JobId")
    private String jobId;

    @Query
    @NameInMap("JobType")
    @Validation(maxLength = 32)
    private String jobType;

    @Query
    @NameInMap("Order")
    private String order;

    @Query
    @NameInMap("PageNumber")
    @Validation(maximum = 1000, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("PipelineId")
    private String pipelineId;

    @Query
    @NameInMap("ResourceId")
    private String resourceId;

    @Query
    @NameInMap("ShowOwn")
    private Boolean showOwn;

    @Query
    @NameInMap("SortBy")
    private String sortBy;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("Status")
    @Validation(maxLength = 32)
    private String status;

    @Query
    @NameInMap("Tags")
    private java.util.Map < String, String > tags;

    @Query
    @NameInMap("UserIdForFilter")
    private String userIdForFilter;

    @Query
    @NameInMap("WorkspaceId")
    private String workspaceId;

    private ListJobsRequest(Builder builder) {
        super(builder);
        this.businessUserId = builder.businessUserId;
        this.caller = builder.caller;
        this.displayName = builder.displayName;
        this.endTime = builder.endTime;
        this.fromAllWorkspaces = builder.fromAllWorkspaces;
        this.jobId = builder.jobId;
        this.jobType = builder.jobType;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.pipelineId = builder.pipelineId;
        this.resourceId = builder.resourceId;
        this.showOwn = builder.showOwn;
        this.sortBy = builder.sortBy;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.tags = builder.tags;
        this.userIdForFilter = builder.userIdForFilter;
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
    public java.util.Map < String, String > getTags() {
        return this.tags;
    }

    /**
     * @return userIdForFilter
     */
    public String getUserIdForFilter() {
        return this.userIdForFilter;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListJobsRequest, Builder> {
        private String businessUserId; 
        private String caller; 
        private String displayName; 
        private String endTime; 
        private Boolean fromAllWorkspaces; 
        private String jobId; 
        private String jobType; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String pipelineId; 
        private String resourceId; 
        private Boolean showOwn; 
        private String sortBy; 
        private String startTime; 
        private String status; 
        private java.util.Map < String, String > tags; 
        private String userIdForFilter; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListJobsRequest request) {
            super(request);
            this.businessUserId = request.businessUserId;
            this.caller = request.caller;
            this.displayName = request.displayName;
            this.endTime = request.endTime;
            this.fromAllWorkspaces = request.fromAllWorkspaces;
            this.jobId = request.jobId;
            this.jobType = request.jobType;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.pipelineId = request.pipelineId;
            this.resourceId = request.resourceId;
            this.showOwn = request.showOwn;
            this.sortBy = request.sortBy;
            this.startTime = request.startTime;
            this.status = request.status;
            this.tags = request.tags;
            this.userIdForFilter = request.userIdForFilter;
            this.workspaceId = request.workspaceId;
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
        public Builder tags(java.util.Map < String, String > tags) {
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
