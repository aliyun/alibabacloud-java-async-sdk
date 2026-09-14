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
 * {@link CreateEvaluationTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEvaluationTaskResponseBody</p>
 */
public class CreateEvaluationTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    private CreateEvaluationTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEvaluationTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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

    public static final class Builder {
        private String requestId; 
        private String status; 
        private String taskId; 

        private Builder() {
        } 

        private Builder(CreateEvaluationTaskResponseBody model) {
            this.requestId = model.requestId;
            this.status = model.status;
            this.taskId = model.taskId;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3FE4CD1E-FF41-56BE-B590-7A021D9C1524</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The evaluation task status. After creation, the status is typically <code>Pending</code>. After asynchronous orchestration, the status may change to <code>Running</code> or <code>Scheduling</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The evaluation task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>eval-task-8b36f2e2b1f94f9c91ce7a4b0f6d9c25</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public CreateEvaluationTaskResponseBody build() {
            return new CreateEvaluationTaskResponseBody(this);
        } 

    } 

}
