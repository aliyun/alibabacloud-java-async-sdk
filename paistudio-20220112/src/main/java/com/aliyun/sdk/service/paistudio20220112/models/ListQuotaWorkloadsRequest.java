// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link ListQuotaWorkloadsRequest} extends {@link RequestModel}
 *
 * <p>ListQuotaWorkloadsRequest</p>
 */
public class ListQuotaWorkloadsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("QuotaId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String quotaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeforeWorkloadId")
    private String beforeWorkloadId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GmtDequeuedTimeRange")
    private TimeRangeFilter gmtDequeuedTimeRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GmtEnqueuedTimeRange")
    private TimeRangeFilter gmtEnqueuedTimeRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GmtPositionModifiedTimeRange")
    private TimeRangeFilter gmtPositionModifiedTimeRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeName")
    private String nodeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Position")
    private Integer position;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowOwn")
    private Boolean showOwn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubQuotaIds")
    private String subQuotaIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseOversoldResource")
    private Boolean useOversoldResource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserIds")
    private String userIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WithHistoricalData")
    private Boolean withHistoricalData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkloadCreatedTimeRange")
    private TimeRangeFilter workloadCreatedTimeRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkloadIds")
    private String workloadIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkloadNames")
    private String workloadNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkloadStatuses")
    private String workloadStatuses;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkloadType")
    private String workloadType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceIds")
    private String workspaceIds;

    private ListQuotaWorkloadsRequest(Builder builder) {
        super(builder);
        this.quotaId = builder.quotaId;
        this.beforeWorkloadId = builder.beforeWorkloadId;
        this.gmtDequeuedTimeRange = builder.gmtDequeuedTimeRange;
        this.gmtEnqueuedTimeRange = builder.gmtEnqueuedTimeRange;
        this.gmtPositionModifiedTimeRange = builder.gmtPositionModifiedTimeRange;
        this.instanceId = builder.instanceId;
        this.nodeName = builder.nodeName;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.position = builder.position;
        this.priority = builder.priority;
        this.showOwn = builder.showOwn;
        this.sortBy = builder.sortBy;
        this.status = builder.status;
        this.subQuotaIds = builder.subQuotaIds;
        this.useOversoldResource = builder.useOversoldResource;
        this.userIds = builder.userIds;
        this.withHistoricalData = builder.withHistoricalData;
        this.workloadCreatedTimeRange = builder.workloadCreatedTimeRange;
        this.workloadIds = builder.workloadIds;
        this.workloadNames = builder.workloadNames;
        this.workloadStatuses = builder.workloadStatuses;
        this.workloadType = builder.workloadType;
        this.workspaceIds = builder.workspaceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQuotaWorkloadsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return quotaId
     */
    public String getQuotaId() {
        return this.quotaId;
    }

    /**
     * @return beforeWorkloadId
     */
    public String getBeforeWorkloadId() {
        return this.beforeWorkloadId;
    }

    /**
     * @return gmtDequeuedTimeRange
     */
    public TimeRangeFilter getGmtDequeuedTimeRange() {
        return this.gmtDequeuedTimeRange;
    }

    /**
     * @return gmtEnqueuedTimeRange
     */
    public TimeRangeFilter getGmtEnqueuedTimeRange() {
        return this.gmtEnqueuedTimeRange;
    }

    /**
     * @return gmtPositionModifiedTimeRange
     */
    public TimeRangeFilter getGmtPositionModifiedTimeRange() {
        return this.gmtPositionModifiedTimeRange;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return nodeName
     */
    public String getNodeName() {
        return this.nodeName;
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
     * @return position
     */
    public Integer getPosition() {
        return this.position;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return subQuotaIds
     */
    public String getSubQuotaIds() {
        return this.subQuotaIds;
    }

    /**
     * @return useOversoldResource
     */
    public Boolean getUseOversoldResource() {
        return this.useOversoldResource;
    }

    /**
     * @return userIds
     */
    public String getUserIds() {
        return this.userIds;
    }

    /**
     * @return withHistoricalData
     */
    public Boolean getWithHistoricalData() {
        return this.withHistoricalData;
    }

    /**
     * @return workloadCreatedTimeRange
     */
    public TimeRangeFilter getWorkloadCreatedTimeRange() {
        return this.workloadCreatedTimeRange;
    }

    /**
     * @return workloadIds
     */
    public String getWorkloadIds() {
        return this.workloadIds;
    }

    /**
     * @return workloadNames
     */
    public String getWorkloadNames() {
        return this.workloadNames;
    }

    /**
     * @return workloadStatuses
     */
    public String getWorkloadStatuses() {
        return this.workloadStatuses;
    }

    /**
     * @return workloadType
     */
    public String getWorkloadType() {
        return this.workloadType;
    }

    /**
     * @return workspaceIds
     */
    public String getWorkspaceIds() {
        return this.workspaceIds;
    }

    public static final class Builder extends Request.Builder<ListQuotaWorkloadsRequest, Builder> {
        private String quotaId; 
        private String beforeWorkloadId; 
        private TimeRangeFilter gmtDequeuedTimeRange; 
        private TimeRangeFilter gmtEnqueuedTimeRange; 
        private TimeRangeFilter gmtPositionModifiedTimeRange; 
        private String instanceId; 
        private String nodeName; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Integer position; 
        private Integer priority; 
        private Boolean showOwn; 
        private String sortBy; 
        private String status; 
        private String subQuotaIds; 
        private Boolean useOversoldResource; 
        private String userIds; 
        private Boolean withHistoricalData; 
        private TimeRangeFilter workloadCreatedTimeRange; 
        private String workloadIds; 
        private String workloadNames; 
        private String workloadStatuses; 
        private String workloadType; 
        private String workspaceIds; 

        private Builder() {
            super();
        } 

        private Builder(ListQuotaWorkloadsRequest request) {
            super(request);
            this.quotaId = request.quotaId;
            this.beforeWorkloadId = request.beforeWorkloadId;
            this.gmtDequeuedTimeRange = request.gmtDequeuedTimeRange;
            this.gmtEnqueuedTimeRange = request.gmtEnqueuedTimeRange;
            this.gmtPositionModifiedTimeRange = request.gmtPositionModifiedTimeRange;
            this.instanceId = request.instanceId;
            this.nodeName = request.nodeName;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.position = request.position;
            this.priority = request.priority;
            this.showOwn = request.showOwn;
            this.sortBy = request.sortBy;
            this.status = request.status;
            this.subQuotaIds = request.subQuotaIds;
            this.useOversoldResource = request.useOversoldResource;
            this.userIds = request.userIds;
            this.withHistoricalData = request.withHistoricalData;
            this.workloadCreatedTimeRange = request.workloadCreatedTimeRange;
            this.workloadIds = request.workloadIds;
            this.workloadNames = request.workloadNames;
            this.workloadStatuses = request.workloadStatuses;
            this.workloadType = request.workloadType;
            this.workspaceIds = request.workspaceIds;
        } 

        /**
         * <p>Quota ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>quota1y9qarq****</p>
         */
        public Builder quotaId(String quotaId) {
            this.putPathParameter("QuotaId", quotaId);
            this.quotaId = quotaId;
            return this;
        }

        /**
         * <p>Queries the queuing information for instances before a specified workload ID in the queue.</p>
         * 
         * <strong>example:</strong>
         * <p>dsw654433**</p>
         */
        public Builder beforeWorkloadId(String beforeWorkloadId) {
            this.putQueryParameter("BeforeWorkloadId", beforeWorkloadId);
            this.beforeWorkloadId = beforeWorkloadId;
            return this;
        }

        /**
         * <p>The range search for workload dequeue time.</p>
         */
        public Builder gmtDequeuedTimeRange(TimeRangeFilter gmtDequeuedTimeRange) {
            this.putQueryParameter("GmtDequeuedTimeRange", gmtDequeuedTimeRange);
            this.gmtDequeuedTimeRange = gmtDequeuedTimeRange;
            return this;
        }

        /**
         * <p>The range search for workload enqueue time.</p>
         */
        public Builder gmtEnqueuedTimeRange(TimeRangeFilter gmtEnqueuedTimeRange) {
            this.putQueryParameter("GmtEnqueuedTimeRange", gmtEnqueuedTimeRange);
            this.gmtEnqueuedTimeRange = gmtEnqueuedTimeRange;
            return this;
        }

        /**
         * <p>The range search for workload queue position change time.</p>
         */
        public Builder gmtPositionModifiedTimeRange(TimeRangeFilter gmtPositionModifiedTimeRange) {
            this.putQueryParameter("GmtPositionModifiedTimeRange", gmtPositionModifiedTimeRange);
            this.gmtPositionModifiedTimeRange = gmtPositionModifiedTimeRange;
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
         * <p>Searches only for nodes on the specified node.</p>
         * 
         * <strong>example:</strong>
         * <p>lrn482781276**</p>
         */
        public Builder nodeName(String nodeName) {
            this.putQueryParameter("NodeName", nodeName);
            this.nodeName = nodeName;
            return this;
        }

        /**
         * <p>The sort order.</p>
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
         * <p>The page number of the query.</p>
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
         * <p>The number of entries per page in a paged query.</p>
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
         * Position.
         */
        public Builder position(Integer position) {
            this.putQueryParameter("Position", position);
            this.position = position;
            return this;
        }

        /**
         * Priority.
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>Specifies whether to display only the workloads associated with the current resource quota.</p>
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
         * <p>The field by which to sort the returned results.</p>
         * 
         * <strong>example:</strong>
         * <p>GmtCreatedTime</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The status in the queue.</p>
         * 
         * <strong>example:</strong>
         * <p>Enqueued</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The list of sub-resource quota IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>quota123446**,quota644322**</p>
         */
        public Builder subQuotaIds(String subQuotaIds) {
            this.putQueryParameter("SubQuotaIds", subQuotaIds);
            this.subQuotaIds = subQuotaIds;
            return this;
        }

        /**
         * UseOversoldResource.
         */
        public Builder useOversoldResource(Boolean useOversoldResource) {
            this.putQueryParameter("UseOversoldResource", useOversoldResource);
            this.useOversoldResource = useOversoldResource;
            return this;
        }

        /**
         * <p>The list of user IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>290438938**,238290930**</p>
         */
        public Builder userIds(String userIds) {
            this.putQueryParameter("UserIds", userIds);
            this.userIds = userIds;
            return this;
        }

        /**
         * WithHistoricalData.
         */
        public Builder withHistoricalData(Boolean withHistoricalData) {
            this.putQueryParameter("WithHistoricalData", withHistoricalData);
            this.withHistoricalData = withHistoricalData;
            return this;
        }

        /**
         * <p>The range search for workload creation time.</p>
         */
        public Builder workloadCreatedTimeRange(TimeRangeFilter workloadCreatedTimeRange) {
            this.putQueryParameter("WorkloadCreatedTimeRange", workloadCreatedTimeRange);
            this.workloadCreatedTimeRange = workloadCreatedTimeRange;
            return this;
        }

        /**
         * <p>Queries the queuing information for specified workload IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>dlc123445**</p>
         */
        public Builder workloadIds(String workloadIds) {
            this.putQueryParameter("WorkloadIds", workloadIds);
            this.workloadIds = workloadIds;
            return this;
        }

        /**
         * WorkloadNames.
         */
        public Builder workloadNames(String workloadNames) {
            this.putQueryParameter("WorkloadNames", workloadNames);
            this.workloadNames = workloadNames;
            return this;
        }

        /**
         * <p>Filters by workload status.</p>
         * 
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        public Builder workloadStatuses(String workloadStatuses) {
            this.putQueryParameter("WorkloadStatuses", workloadStatuses);
            this.workloadStatuses = workloadStatuses;
            return this;
        }

        /**
         * <p>Queries the queuing information for instances of a specified sub-product.</p>
         * 
         * <strong>example:</strong>
         * <p>dlc</p>
         */
        public Builder workloadType(String workloadType) {
            this.putQueryParameter("WorkloadType", workloadType);
            this.workloadType = workloadType;
            return this;
        }

        /**
         * <p>Queries the queuing information for workloads in a specified workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>1866**</p>
         */
        public Builder workspaceIds(String workspaceIds) {
            this.putQueryParameter("WorkspaceIds", workspaceIds);
            this.workspaceIds = workspaceIds;
            return this;
        }

        @Override
        public ListQuotaWorkloadsRequest build() {
            return new ListQuotaWorkloadsRequest(this);
        } 

    } 

}
