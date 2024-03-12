// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInterveneImportTaskInfoRequest} extends {@link RequestModel}
 *
 * <p>GetInterveneImportTaskInfoRequest</p>
 */
public class GetInterveneImportTaskInfoRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    @Validation(required = true)
    private String agentKey;

    @Body
    @NameInMap("TaskId")
    private String taskId;

    private GetInterveneImportTaskInfoRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInterveneImportTaskInfoRequest create() {
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

    public static final class Builder extends Request.Builder<GetInterveneImportTaskInfoRequest, Builder> {
        private String agentKey; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetInterveneImportTaskInfoRequest request) {
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
        public GetInterveneImportTaskInfoRequest build() {
            return new GetInterveneImportTaskInfoRequest(this);
        } 

    } 

}
