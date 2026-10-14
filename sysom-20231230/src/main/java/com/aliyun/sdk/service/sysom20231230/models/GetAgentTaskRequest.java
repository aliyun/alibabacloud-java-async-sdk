// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link GetAgentTaskRequest} extends {@link RequestModel}
 *
 * <p>GetAgentTaskRequest</p>
 */
public class GetAgentTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("task_id")
    private String taskId;

    private GetAgentTaskRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<GetAgentTaskRequest, Builder> {
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetAgentTaskRequest request) {
            super(request);
            this.taskId = request.taskId;
        } 

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>42172120177e4b3abd6fabb3a6b5e2dd</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("task_id", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetAgentTaskRequest build() {
            return new GetAgentTaskRequest(this);
        } 

    } 

}
