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
        this.nodeName = builder.nodeName;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.showOwn = builder.showOwn;
        this.sortBy = builder.sortBy;
        this.status = builder.status;
        this.subQuotaIds = builder.subQuotaIds;
        this.userIds = builder.userIds;
        this.withHistoricalData = builder.withHistoricalData;
        this.workloadCreatedTimeRange = builder.workloadCreatedTimeRange;
        this.workloadIds = builder.workloadIds;
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
        private String nodeName; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Boolean showOwn; 
        private String sortBy; 
        private String status; 
        private String subQuotaIds; 
        private String userIds; 
        private Boolean withHistoricalData; 
        private TimeRangeFilter workloadCreatedTimeRange; 
        private String workloadIds; 
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
            this.nodeName = request.nodeName;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.showOwn = request.showOwn;
            this.sortBy = request.sortBy;
            this.status = request.status;
            this.subQuotaIds = request.subQuotaIds;
            this.userIds = request.userIds;
            this.withHistoricalData = request.withHistoricalData;
            this.workloadCreatedTimeRange = request.workloadCreatedTimeRange;
            this.workloadIds = request.workloadIds;
            this.workloadStatuses = request.workloadStatuses;
            this.workloadType = request.workloadType;
            this.workspaceIds = request.workspaceIds;
        } 

        /**
         * <p>Quota ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>quota1y9qarqj2i7</p>
         */
        public Builder quotaId(String quotaId) {
            this.putPathParameter("QuotaId", quotaId);
            this.quotaId = quotaId;
            return this;
        }

        /**
         * BeforeWorkloadId.
         */
        public Builder beforeWorkloadId(String beforeWorkloadId) {
            this.putQueryParameter("BeforeWorkloadId", beforeWorkloadId);
            this.beforeWorkloadId = beforeWorkloadId;
            return this;
        }

        /**
         * GmtDequeuedTimeRange.
         */
        public Builder gmtDequeuedTimeRange(TimeRangeFilter gmtDequeuedTimeRange) {
            this.putQueryParameter("GmtDequeuedTimeRange", gmtDequeuedTimeRange);
            this.gmtDequeuedTimeRange = gmtDequeuedTimeRange;
            return this;
        }

        /**
         * GmtEnqueuedTimeRange.
         */
        public Builder gmtEnqueuedTimeRange(TimeRangeFilter gmtEnqueuedTimeRange) {
            this.putQueryParameter("GmtEnqueuedTimeRange", gmtEnqueuedTimeRange);
            this.gmtEnqueuedTimeRange = gmtEnqueuedTimeRange;
            return this;
        }

        /**
         * GmtPositionModifiedTimeRange.
         */
        public Builder gmtPositionModifiedTimeRange(TimeRangeFilter gmtPositionModifiedTimeRange) {
            this.putQueryParameter("GmtPositionModifiedTimeRange", gmtPositionModifiedTimeRange);
            this.gmtPositionModifiedTimeRange = gmtPositionModifiedTimeRange;
            return this;
        }

        /**
         * NodeName.
         */
        public Builder nodeName(String nodeName) {
            this.putQueryParameter("NodeName", nodeName);
            this.nodeName = nodeName;
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
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * SubQuotaIds.
         */
        public Builder subQuotaIds(String subQuotaIds) {
            this.putQueryParameter("SubQuotaIds", subQuotaIds);
            this.subQuotaIds = subQuotaIds;
            return this;
        }

        /**
         * UserIds.
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
         * WorkloadCreatedTimeRange.
         */
        public Builder workloadCreatedTimeRange(TimeRangeFilter workloadCreatedTimeRange) {
            this.putQueryParameter("WorkloadCreatedTimeRange", workloadCreatedTimeRange);
            this.workloadCreatedTimeRange = workloadCreatedTimeRange;
            return this;
        }

        /**
         * WorkloadIds.
         */
        public Builder workloadIds(String workloadIds) {
            this.putQueryParameter("WorkloadIds", workloadIds);
            this.workloadIds = workloadIds;
            return this;
        }

        /**
         * WorkloadStatuses.
         */
        public Builder workloadStatuses(String workloadStatuses) {
            this.putQueryParameter("WorkloadStatuses", workloadStatuses);
            this.workloadStatuses = workloadStatuses;
            return this;
        }

        /**
         * WorkloadType.
         */
        public Builder workloadType(String workloadType) {
            this.putQueryParameter("WorkloadType", workloadType);
            this.workloadType = workloadType;
            return this;
        }

        /**
         * WorkspaceIds.
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
