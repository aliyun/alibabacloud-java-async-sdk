// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTensorboardsRequest} extends {@link RequestModel}
 *
 * <p>ListTensorboardsRequest</p>
 */
public class ListTensorboardsRequest extends Request {
    @Query
    @NameInMap("DisplayName")
    private String displayName;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("JobId")
    private String jobId;

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
    @NameInMap("ShowOwn")
    private Boolean showOwn;

    @Query
    @NameInMap("SortBy")
    private String sortBy;

    @Query
    @NameInMap("SourceId")
    private String sourceId;

    @Query
    @NameInMap("SourceType")
    private String sourceType;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("TensorboardId")
    private String tensorboardId;

    @Query
    @NameInMap("Verbose")
    private Boolean verbose;

    @Query
    @NameInMap("WorkspaceId")
    private String workspaceId;

    private ListTensorboardsRequest(Builder builder) {
        super(builder);
        this.displayName = builder.displayName;
        this.endTime = builder.endTime;
        this.jobId = builder.jobId;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.showOwn = builder.showOwn;
        this.sortBy = builder.sortBy;
        this.sourceId = builder.sourceId;
        this.sourceType = builder.sourceType;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.tensorboardId = builder.tensorboardId;
        this.verbose = builder.verbose;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTensorboardsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
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
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
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
     * @return tensorboardId
     */
    public String getTensorboardId() {
        return this.tensorboardId;
    }

    /**
     * @return verbose
     */
    public Boolean getVerbose() {
        return this.verbose;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListTensorboardsRequest, Builder> {
        private String displayName; 
        private String endTime; 
        private String jobId; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Boolean showOwn; 
        private String sortBy; 
        private String sourceId; 
        private String sourceType; 
        private String startTime; 
        private String status; 
        private String tensorboardId; 
        private Boolean verbose; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListTensorboardsRequest request) {
            super(request);
            this.displayName = request.displayName;
            this.endTime = request.endTime;
            this.jobId = request.jobId;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.showOwn = request.showOwn;
            this.sortBy = request.sortBy;
            this.sourceId = request.sourceId;
            this.sourceType = request.sourceType;
            this.startTime = request.startTime;
            this.status = request.status;
            this.tensorboardId = request.tensorboardId;
            this.verbose = request.verbose;
            this.workspaceId = request.workspaceId;
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
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
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
         * SourceId.
         */
        public Builder sourceId(String sourceId) {
            this.putQueryParameter("SourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
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
         * TensorboardId.
         */
        public Builder tensorboardId(String tensorboardId) {
            this.putQueryParameter("TensorboardId", tensorboardId);
            this.tensorboardId = tensorboardId;
            return this;
        }

        /**
         * Verbose.
         */
        public Builder verbose(Boolean verbose) {
            this.putQueryParameter("Verbose", verbose);
            this.verbose = verbose;
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
        public ListTensorboardsRequest build() {
            return new ListTensorboardsRequest(this);
        } 

    } 

}
