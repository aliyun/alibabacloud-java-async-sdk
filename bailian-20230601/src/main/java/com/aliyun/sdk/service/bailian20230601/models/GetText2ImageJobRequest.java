// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetText2ImageJobRequest} extends {@link RequestModel}
 *
 * <p>GetText2ImageJobRequest</p>
 */
public class GetText2ImageJobRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    @Validation(required = true)
    private String agentKey;

    @Query
    @NameInMap("TaskId")
    @Validation(required = true)
    private String taskId;

    private GetText2ImageJobRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetText2ImageJobRequest create() {
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

    public static final class Builder extends Request.Builder<GetText2ImageJobRequest, Builder> {
        private String agentKey; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetText2ImageJobRequest request) {
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
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetText2ImageJobRequest build() {
            return new GetText2ImageJobRequest(this);
        } 

    } 

}
