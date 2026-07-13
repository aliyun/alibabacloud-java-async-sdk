// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentteams20260605.models;

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
 * {@link UpdateInstanceAsyncTaskRequest} extends {@link RequestModel}
 *
 * <p>UpdateInstanceAsyncTaskRequest</p>
 */
public class UpdateInstanceAsyncTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsResume")
    private Boolean isResume;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private UpdateInstanceAsyncTaskRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.isResume = builder.isResume;
        this.taskCode = builder.taskCode;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInstanceAsyncTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return isResume
     */
    public Boolean getIsResume() {
        return this.isResume;
    }

    /**
     * @return taskCode
     */
    public String getTaskCode() {
        return this.taskCode;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<UpdateInstanceAsyncTaskRequest, Builder> {
        private String instanceId; 
        private Boolean isResume; 
        private String taskCode; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInstanceAsyncTaskRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.isResume = request.isResume;
            this.taskCode = request.taskCode;
            this.taskId = request.taskId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>at-xxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IsResume.
         */
        public Builder isResume(Boolean isResume) {
            this.putQueryParameter("IsResume", isResume);
            this.isResume = isResume;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agentteams:pay-order:create</p>
         */
        public Builder taskCode(String taskCode) {
            this.putQueryParameter("TaskCode", taskCode);
            this.taskCode = taskCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>task-xxx</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public UpdateInstanceAsyncTaskRequest build() {
            return new UpdateInstanceAsyncTaskRequest(this);
        } 

    } 

}
