// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitAsyncTaskRequest} extends {@link RequestModel}
 *
 * <p>SubmitAsyncTaskRequest</p>
 */
public class SubmitAsyncTaskRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    @Validation(required = true)
    private String agentKey;

    @Body
    @NameInMap("TaskCode")
    @Validation(required = true)
    private String taskCode;

    @Body
    @NameInMap("TaskExecuteTime")
    private String taskExecuteTime;

    @Body
    @NameInMap("TaskName")
    private String taskName;

    @Body
    @NameInMap("TaskParam")
    private String taskParam;

    private SubmitAsyncTaskRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.taskCode = builder.taskCode;
        this.taskExecuteTime = builder.taskExecuteTime;
        this.taskName = builder.taskName;
        this.taskParam = builder.taskParam;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitAsyncTaskRequest create() {
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
     * @return taskCode
     */
    public String getTaskCode() {
        return this.taskCode;
    }

    /**
     * @return taskExecuteTime
     */
    public String getTaskExecuteTime() {
        return this.taskExecuteTime;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return taskParam
     */
    public String getTaskParam() {
        return this.taskParam;
    }

    public static final class Builder extends Request.Builder<SubmitAsyncTaskRequest, Builder> {
        private String agentKey; 
        private String taskCode; 
        private String taskExecuteTime; 
        private String taskName; 
        private String taskParam; 

        private Builder() {
            super();
        } 

        private Builder(SubmitAsyncTaskRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.taskCode = request.taskCode;
            this.taskExecuteTime = request.taskExecuteTime;
            this.taskName = request.taskName;
            this.taskParam = request.taskParam;
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
         * TaskCode.
         */
        public Builder taskCode(String taskCode) {
            this.putBodyParameter("TaskCode", taskCode);
            this.taskCode = taskCode;
            return this;
        }

        /**
         * TaskExecuteTime.
         */
        public Builder taskExecuteTime(String taskExecuteTime) {
            this.putBodyParameter("TaskExecuteTime", taskExecuteTime);
            this.taskExecuteTime = taskExecuteTime;
            return this;
        }

        /**
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.putBodyParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * TaskParam.
         */
        public Builder taskParam(String taskParam) {
            this.putBodyParameter("TaskParam", taskParam);
            this.taskParam = taskParam;
            return this;
        }

        @Override
        public SubmitAsyncTaskRequest build() {
            return new SubmitAsyncTaskRequest(this);
        } 

    } 

}
