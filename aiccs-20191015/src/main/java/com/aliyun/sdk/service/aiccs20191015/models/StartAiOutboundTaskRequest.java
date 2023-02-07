// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartAiOutboundTaskRequest} extends {@link RequestModel}
 *
 * <p>StartAiOutboundTaskRequest</p>
 */
public class StartAiOutboundTaskRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("TaskId")
    @Validation(required = true)
    private Long taskId;

    private StartAiOutboundTaskRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartAiOutboundTaskRequest create() {
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
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<StartAiOutboundTaskRequest, Builder> {
        private String instanceId; 
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(StartAiOutboundTaskRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.taskId = request.taskId;
        } 

        /**
         * 实例ID
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 任务id
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public StartAiOutboundTaskRequest build() {
            return new StartAiOutboundTaskRequest(this);
        } 

    } 

}
