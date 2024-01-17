// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelAsyncTaskRequest} extends {@link RequestModel}
 *
 * <p>CancelAsyncTaskRequest</p>
 */
public class CancelAsyncTaskRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    @Validation(required = true)
    private String agentKey;

    @Body
    @NameInMap("TaskId")
    private String taskId;

    private CancelAsyncTaskRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelAsyncTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<CancelAsyncTaskRequest, Builder> {
        private String agentKey; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(CancelAsyncTaskRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.taskId = request.taskId;
        } 

        /**
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public CancelAsyncTaskRequest build() {
            return new CancelAsyncTaskRequest(this);
        } 

    } 

}
