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
 * {@link ListVulScanTasksRequest} extends {@link RequestModel}
 *
 * <p>ListVulScanTasksRequest</p>
 */
public class ListVulScanTasksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatchMode")
    private String matchMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduledStrategyId")
    private String scheduledStrategyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskIds")
    private java.util.List<String> taskIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    private String taskType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserGroupId")
    private String userGroupId;

    private ListVulScanTasksRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.matchMode = builder.matchMode;
        this.pageSize = builder.pageSize;
        this.scheduledStrategyId = builder.scheduledStrategyId;
        this.status = builder.status;
        this.taskIds = builder.taskIds;
        this.taskName = builder.taskName;
        this.taskType = builder.taskType;
        this.userGroupId = builder.userGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVulScanTasksRequest create() {
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
     * @return matchMode
     */
    public String getMatchMode() {
        return this.matchMode;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return scheduledStrategyId
     */
    public String getScheduledStrategyId() {
        return this.scheduledStrategyId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return taskIds
     */
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    /**
     * @return userGroupId
     */
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public static final class Builder extends Request.Builder<ListVulScanTasksRequest, Builder> {
        private Long currentPage; 
        private String matchMode; 
        private Long pageSize; 
        private String scheduledStrategyId; 
        private String status; 
        private java.util.List<String> taskIds; 
        private String taskName; 
        private String taskType; 
        private String userGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ListVulScanTasksRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.matchMode = request.matchMode;
            this.pageSize = request.pageSize;
            this.scheduledStrategyId = request.scheduledStrategyId;
            this.status = request.status;
            this.taskIds = request.taskIds;
            this.taskName = request.taskName;
            this.taskType = request.taskType;
            this.userGroupId = request.userGroupId;
        } 

        /**
         * <p>The page number of the current page in a paged query. Valid values: 1 to 10000.</p>
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
         * <p>Filters by the matching mode of the effective scope. Valid values:</p>
         * <ul>
         * <li><strong>UserGroupAll</strong>: applies to all users under the current Alibaba Cloud account.</li>
         * <li><strong>UserGroupNormal</strong>: applies only to users within specified user groups.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UserGroupNormal</p>
         */
        public Builder matchMode(String matchMode) {
            this.putQueryParameter("MatchMode", matchMode);
            this.matchMode = matchMode;
            return this;
        }

        /**
         * <p>The number of entries per page in a paged query. Valid values: 1 to 1000.</p>
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
         * <p>The ID of the vulnerability scheduled scan policy. This parameter is used to filter tasks triggered by the specified policy. Valid values are obtained from:</p>
         * <ul>
         * <li><a href="~~ListVulScanScheduledStrategies~~">ListVulScanScheduledStrategies</a>: lists vulnerability scheduled scan policies.</li>
         * <li><a href="~~CreateVulScanScheduledStrategy~~">CreateVulScanScheduledStrategy</a>: creates a vulnerability scheduled scan policy.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vul-scan-scheduled-strategy-8a3f6c2e91b7****</p>
         */
        public Builder scheduledStrategyId(String scheduledStrategyId) {
            this.putQueryParameter("ScheduledStrategyId", scheduledStrategyId);
            this.scheduledStrategyId = scheduledStrategyId;
            return this;
        }

        /**
         * <p>Filters by task status. Valid values:</p>
         * <ul>
         * <li><strong>Running</strong>: the task is in progress and still within the validity period.</li>
         * <li><strong>Expired</strong>: the task has expired and exceeded the validity period.</li>
         * <li><strong>Canceled</strong>: the task has been canceled.</li>
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
         * <p>The vulnerability scanning task IDs used for filtering. A maximum of 100 IDs can be specified. Duplicate IDs are not allowed.</p>
         */
        public Builder taskIds(java.util.List<String> taskIds) {
            this.putQueryParameter("TaskIds", taskIds);
            this.taskIds = taskIds;
            return this;
        }

        /**
         * <p>The task name. Fuzzy match is supported. The name can be up to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>R&amp;D department vulnerability scanning</p>
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * <p>Filters by task type. Valid values:</p>
         * <ul>
         * <li><strong>Instant</strong>: an instant task created by CreateVulScanTask.</li>
         * <li><strong>Scheduled</strong>: a scheduled task automatically created by a vulnerability scheduled scan policy on a periodic basis.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Instant</p>
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        /**
         * <p>The user group ID. This parameter is used to filter records whose effective scope includes the specified user group. Valid values are obtained from:</p>
         * <ul>
         * <li><a href="~~ListUserGroups~~">ListUserGroups</a>: lists user groups.</li>
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
        public ListVulScanTasksRequest build() {
            return new ListVulScanTasksRequest(this);
        } 

    } 

}
