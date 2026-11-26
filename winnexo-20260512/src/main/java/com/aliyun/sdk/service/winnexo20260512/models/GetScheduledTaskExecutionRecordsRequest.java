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
    @com.aliyun.core.annotation.NameInMap("appToken")
    private String appToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("collaborationGroupId")
    private String collaborationGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("initiatorUserId")
    private String initiatorUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("opsUserCode")
    private String opsUserCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("opsUserId")
    private String opsUserId;

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
        this.appToken = builder.appToken;
        this.collaborationGroupId = builder.collaborationGroupId;
        this.initiatorUserId = builder.initiatorUserId;
        this.opsUserCode = builder.opsUserCode;
        this.opsUserId = builder.opsUserId;
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
     * @return appToken
     */
    public String getAppToken() {
        return this.appToken;
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
     * @return opsUserCode
     */
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    /**
     * @return opsUserId
     */
    public String getOpsUserId() {
        return this.opsUserId;
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
        private String appToken; 
        private String collaborationGroupId; 
        private String initiatorUserId; 
        private String opsUserCode; 
        private String opsUserId; 
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
            this.appToken = request.appToken;
            this.collaborationGroupId = request.collaborationGroupId;
            this.initiatorUserId = request.initiatorUserId;
            this.opsUserCode = request.opsUserCode;
            this.opsUserId = request.opsUserId;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.status = request.status;
            this.taskId = request.taskId;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The platform application token issued by the console. If this parameter is passed, the operation is executed as the user specified by opsUserId or opsUserCode.</p>
         * 
         * <strong>example:</strong>
         * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
         */
        public Builder appToken(String appToken) {
            this.putQueryParameter("appToken", appToken);
            this.appToken = appToken;
            return this;
        }

        /**
         * <p>The ID of the collaboration group to which the task belongs, such as cg_101. If this parameter is passed, a group space task is created, and the caller must be a valid group member. If this parameter is left empty, a personal task is created.</p>
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
         * <p>The business status code. A value of 200 indicates success. A failure is indicated by a backend error code such as ERR.* or InvalidParameter.*.</p>
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
         * <p>The proxy user code, which is unique within the tenant. This parameter is used only when the application credential is configured as source_uid.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        public Builder opsUserCode(String opsUserCode) {
            this.putQueryParameter("opsUserCode", opsUserCode);
            this.opsUserCode = opsUserCode;
            return this;
        }

        /**
         * <p>The proxy user ID, which is the WINNEXO platform user ID. This parameter is used only when the application credential is configured as winnexo_uid.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder opsUserId(String opsUserId) {
            this.putQueryParameter("opsUserId", opsUserId);
            this.opsUserId = opsUserId;
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
         * <p>Filters records by the initiator platform user ID. The scope is the executor of the record. For manual execution, the executor is the trigger user. For automatic execution, the executor is the task creator. To view only the tasks that you initiated, pass the current user ID.</p>
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
         * <p>The execution status filter in lowercase. Valid values: pending (queued), running (executing), success (succeeded), failed (failed), timeout (timed out), and cancelled (cancelled). If this parameter is not passed, no filtering is applied. If this parameter is passed, future plan items are not generated.</p>
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
         * <p>The ID of the effective tenant.</p>
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
