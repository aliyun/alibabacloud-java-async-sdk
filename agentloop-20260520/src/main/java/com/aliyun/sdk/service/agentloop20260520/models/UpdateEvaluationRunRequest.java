// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link UpdateEvaluationRunRequest} extends {@link RequestModel}
 *
 * <p>UpdateEvaluationRunRequest</p>
 */
public class UpdateEvaluationRunRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    private String agentSpace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("runId")
    private String runId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private UpdateEvaluationRunRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.taskId = builder.taskId;
        this.runId = builder.runId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEvaluationRunRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentSpace
     */
    public String getAgentSpace() {
        return this.agentSpace;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return runId
     */
    public String getRunId() {
        return this.runId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<UpdateEvaluationRunRequest, Builder> {
        private String agentSpace; 
        private String taskId; 
        private String runId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEvaluationRunRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.taskId = request.taskId;
            this.runId = request.runId;
            this.status = request.status;
        } 

        /**
         * <p>The AgentSpace name.</p>
         * 
         * <strong>example:</strong>
         * <p>prod-agentspace</p>
         */
        public Builder agentSpace(String agentSpace) {
            this.putPathParameter("agentSpace", agentSpace);
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * <p>The evaluation task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>eval-task-8b36f2e2b1f94f9c91ce7a4b0f6d9c25</p>
         */
        public Builder taskId(String taskId) {
            this.putPathParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The evaluation run ID.</p>
         * 
         * <strong>example:</strong>
         * <p>eval-run-4fd47f3d7e684e15b1d3d178c6a5b81a</p>
         */
        public Builder runId(String runId) {
            this.putPathParameter("runId", runId);
            this.runId = runId;
            return this;
        }

        /**
         * <p>The target status. Currently, only stop-related statuses are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Terminated</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdateEvaluationRunRequest build() {
            return new UpdateEvaluationRunRequest(this);
        } 

    } 

}
