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
         * <p>协作群组 ID（如 cg_101）；传入时按群维度返回（调用者需为有效群成员），未传时为个人维度（排除群任务）</p>
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
         * <p>按发起人筛选（平台用户 ID）；口径 = 记录的执行人（手动执行 = 触发人，自动执行 = 任务创建人）；只看自己发起的传当前用户 ID</p>
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
         * <p>页码，从1开始</p>
         * 
         * <strong>example:</strong>
         * <p>exampleCollaborationGroupId</p>
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>每页任务数（1~100）</p>
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
         * <p>执行状态筛选（小写）：pending(排队中)/running(执行中)/success(成功)/failed(失败)/timeout(超时)/cancelled(已终止)；不传表示不筛；传入时不再生成未来计划项</p>
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
         * <p>按单个任务预筛选；不传时返回全部可见任务的执行记录</p>
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
         * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
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
