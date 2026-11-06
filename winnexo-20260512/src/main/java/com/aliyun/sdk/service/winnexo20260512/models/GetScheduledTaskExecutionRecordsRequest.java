// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link GetScheduledTaskExecutionRecordsRequest} extends {@link RequestModel}
 *
 * <p>GetScheduledTaskExecutionRecordsRequest</p>
 */
public class GetScheduledTaskExecutionRecordsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("collaborationGroupId")
    private String collaborationGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("initiatorUserId")
    private String initiatorUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page")
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private GetScheduledTaskExecutionRecordsRequest(Builder builder) {
        super(builder);
        this.collaborationGroupId = builder.collaborationGroupId;
        this.initiatorUserId = builder.initiatorUserId;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
        this.taskId = builder.taskId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScheduledTaskExecutionRecordsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return collaborationGroupId
     */
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    /**
     * @return initiatorUserId
     */
    public String getInitiatorUserId() {
        return this.initiatorUserId;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<GetScheduledTaskExecutionRecordsRequest, Builder> {
        private String collaborationGroupId; 
        private String initiatorUserId; 
        private Integer page; 
        private Integer pageSize; 
        private String status; 
        private String taskId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(GetScheduledTaskExecutionRecordsRequest request) {
            super(request);
            this.collaborationGroupId = request.collaborationGroupId;
            this.initiatorUserId = request.initiatorUserId;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.status = request.status;
            this.taskId = request.taskId;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The ID of the collaboration group to which the task belongs, such as cg_101. If you specify this parameter, a group space task is created, and the caller must be a valid group member. If you leave this parameter empty, a personal task is created.</p>
         * 
         * <strong>example:</strong>
         * <p>1112</p>
         */
        public Builder collaborationGroupId(String collaborationGroupId) {
            this.putQueryParameter("collaborationGroupId", collaborationGroupId);
            this.collaborationGroupId = collaborationGroupId;
            return this;
        }

        /**
         * <p>The business status code. A value of 200 indicates success. A failure is indicated by a backend error code, such as ERR.* or InvalidParameter.*.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder initiatorUserId(String initiatorUserId) {
            this.putQueryParameter("initiatorUserId", initiatorUserId);
            this.initiatorUserId = initiatorUserId;
            return this;
        }

        /**
         * <p>The page number. Default value: 1. Minimum value: 1. Maximum value: 200.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>The number of records per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The initiator filter based on the platform user ID. The scope is the executor of the record. For manual execution, it is the user who triggers the task. For automatic execution, it is the task creator. To view only the tasks that you initiated, specify the current user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>failed</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The execution status filter in lowercase. Valid values: pending (queued), running (running), success (successful), failed (failed), timeout (timed out), and cancelled (cancelled). If you do not specify this parameter, no filtering is applied. If you specify this parameter, no future plan items are generated.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleTaskId</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The ID of the active tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public GetScheduledTaskExecutionRecordsRequest build() {
            return new GetScheduledTaskExecutionRecordsRequest(this);
        } 

    } 

}
