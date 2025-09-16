// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

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
 * {@link ExecuteTaskRequest} extends {@link RequestModel}
 *
 * <p>ExecuteTaskRequest</p>
 */
public class ExecuteTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private Integer taskId;

    private ExecuteTaskRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return taskId
     */
    public Integer getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<ExecuteTaskRequest, Builder> {
        private Integer taskId; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteTaskRequest request) {
            super(request);
            this.taskId = request.taskId;
        } 

        /**
         * TaskId.
         */
        public Builder taskId(Integer taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public ExecuteTaskRequest build() {
            return new ExecuteTaskRequest(this);
        } 

    } 

}
