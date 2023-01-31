// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTaskByUuidRequest} extends {@link RequestModel}
 *
 * <p>GetTaskByUuidRequest</p>
 */
public class GetTaskByUuidRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("TaskId")
    @Validation(required = true)
    private String taskId;

    @Query
    @NameInMap("WithConversations")
    private Boolean withConversations;

    private GetTaskByUuidRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.taskId = builder.taskId;
        this.withConversations = builder.withConversations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTaskByUuidRequest create() {
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
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return withConversations
     */
    public Boolean getWithConversations() {
        return this.withConversations;
    }

    public static final class Builder extends Request.Builder<GetTaskByUuidRequest, Builder> {
        private String instanceId; 
        private String taskId; 
        private Boolean withConversations; 

        private Builder() {
            super();
        } 

        private Builder(GetTaskByUuidRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.taskId = request.taskId;
            this.withConversations = request.withConversations;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * WithConversations.
         */
        public Builder withConversations(Boolean withConversations) {
            this.putQueryParameter("WithConversations", withConversations);
            this.withConversations = withConversations;
            return this;
        }

        @Override
        public GetTaskByUuidRequest build() {
            return new GetTaskByUuidRequest(this);
        } 

    } 

}
