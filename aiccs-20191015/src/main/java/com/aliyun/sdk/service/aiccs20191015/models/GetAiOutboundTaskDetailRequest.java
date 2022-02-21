// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAiOutboundTaskDetailRequest} extends {@link RequestModel}
 *
 * <p>GetAiOutboundTaskDetailRequest</p>
 */
public class GetAiOutboundTaskDetailRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("TaskId")
    @Validation(required = true)
    private Long taskId;

    private GetAiOutboundTaskDetailRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAiOutboundTaskDetailRequest create() {
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

    public static final class Builder extends Request.Builder<GetAiOutboundTaskDetailRequest, Builder> {
        private String instanceId; 
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetAiOutboundTaskDetailRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.taskId = response.taskId;
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
        public GetAiOutboundTaskDetailRequest build() {
            return new GetAiOutboundTaskDetailRequest(this);
        } 

    } 

}
