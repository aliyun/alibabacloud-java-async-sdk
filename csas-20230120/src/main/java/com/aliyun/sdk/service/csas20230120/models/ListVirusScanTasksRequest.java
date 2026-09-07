// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListVirusScanTasksRequest} extends {@link RequestModel}
 *
 * <p>ListVirusScanTasksRequest</p>
 */
public class ListVirusScanTasksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PerformanceModes")
    private java.util.List<String> performanceModes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanModes")
    private java.util.List<String> scanModes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskIds")
    private java.util.List<String> taskIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserGroupId")
    private String userGroupId;

    private ListVirusScanTasksRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.endTime = builder.endTime;
        this.pageSize = builder.pageSize;
        this.performanceModes = builder.performanceModes;
        this.scanModes = builder.scanModes;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.taskIds = builder.taskIds;
        this.userGroupId = builder.userGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVirusScanTasksRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return performanceModes
     */
    public java.util.List<String> getPerformanceModes() {
        return this.performanceModes;
    }

    /**
     * @return scanModes
     */
    public java.util.List<String> getScanModes() {
        return this.scanModes;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return taskIds
     */
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

    /**
     * @return userGroupId
     */
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public static final class Builder extends Request.Builder<ListVirusScanTasksRequest, Builder> {
        private Long currentPage; 
        private Long endTime; 
        private Long pageSize; 
        private java.util.List<String> performanceModes; 
        private java.util.List<String> scanModes; 
        private Long startTime; 
        private Integer status; 
        private java.util.List<String> taskIds; 
        private String userGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ListVirusScanTasksRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.endTime = request.endTime;
            this.pageSize = request.pageSize;
            this.performanceModes = request.performanceModes;
            this.scanModes = request.scanModes;
            this.startTime = request.startTime;
            this.status = request.status;
            this.taskIds = request.taskIds;
            this.userGroupId = request.userGroupId;
        } 

        /**
         * <p>The page number of the current page in paging. Valid values: 1 to 10000.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Long currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The end point for filtering by task expiration time. The value is a UNIX timestamp in seconds. The value must be greater than StartTime.</p>
         * 
         * <strong>example:</strong>
         * <p>1762135466</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The number of entries per page in paging. Valid values: 1 to 1000.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The collection of scan performance modes. Duplicate values are not allowed.</p>
         */
        public Builder performanceModes(java.util.List<String> performanceModes) {
            this.putQueryParameter("PerformanceModes", performanceModes);
            this.performanceModes = performanceModes;
            return this;
        }

        /**
         * <p>The collection of scan path scopes. Duplicate values are not allowed.</p>
         */
        public Builder scanModes(java.util.List<String> scanModes) {
            this.putQueryParameter("ScanModes", scanModes);
            this.scanModes = scanModes;
            return this;
        }

        /**
         * <p>The start point for filtering by task expiration time. The value is a UNIX timestamp in seconds. This parameter must be specified together with EndTime. Specifying this parameter alone does not take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>1754150421</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Not canceled. This is the default value.</li>
         * <li><strong>1</strong>: Canceled.</li>
         * <li><strong>-1</strong>: No status filter. All tasks are returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The collection of virus scan task IDs. Duplicate values are not allowed.</p>
         */
        public Builder taskIds(java.util.List<String> taskIds) {
            this.putQueryParameter("TaskIds", taskIds);
            this.taskIds = taskIds;
            return this;
        }

        /**
         * <p>The user group ID, used to filter tasks whose effective scope includes the specified user group. You can obtain the value from:</p>
         * <ul>
         * <li><a href="~~ListUserGroups~~">ListUserGroups</a>: Lists user groups.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>usergroup-9d4f2a7b3c1e****</p>
         */
        public Builder userGroupId(String userGroupId) {
            this.putQueryParameter("UserGroupId", userGroupId);
            this.userGroupId = userGroupId;
            return this;
        }

        @Override
        public ListVirusScanTasksRequest build() {
            return new ListVirusScanTasksRequest(this);
        } 

    } 

}
