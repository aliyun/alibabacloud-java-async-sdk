// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240401.models;

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
 * {@link GetRagEvaluatorTaskRequest} extends {@link RequestModel}
 *
 * <p>GetRagEvaluatorTaskRequest</p>
 */
public class GetRagEvaluatorTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceName")
    private String workspaceName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("task_id")
    private String taskId;

    private GetRagEvaluatorTaskRequest(Builder builder) {
        super(builder);
        this.workspaceName = builder.workspaceName;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRagEvaluatorTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<GetRagEvaluatorTaskRequest, Builder> {
        private String workspaceName; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetRagEvaluatorTaskRequest request) {
            super(request);
            this.workspaceName = request.workspaceName;
            this.taskId = request.taskId;
        } 

        /**
         * workspaceName.
         */
        public Builder workspaceName(String workspaceName) {
            this.putPathParameter("workspaceName", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        /**
         * task_id.
         */
        public Builder taskId(String taskId) {
            this.putPathParameter("task_id", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetRagEvaluatorTaskRequest build() {
            return new GetRagEvaluatorTaskRequest(this);
        } 

    } 

}
