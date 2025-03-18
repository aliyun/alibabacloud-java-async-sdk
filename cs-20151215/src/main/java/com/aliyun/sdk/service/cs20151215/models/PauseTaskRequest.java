// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link PauseTaskRequest} extends {@link RequestModel}
 *
 * <p>PauseTaskRequest</p>
 */
public class PauseTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("task_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private PauseTaskRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PauseTaskRequest create() {
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

    public static final class Builder extends Request.Builder<PauseTaskRequest, Builder> {
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(PauseTaskRequest request) {
            super(request);
            this.taskId = request.taskId;
        } 

        /**
         * <p>The task ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>T-62a944794ee141074400****</p>
         */
        public Builder taskId(String taskId) {
            this.putPathParameter("task_id", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public PauseTaskRequest build() {
            return new PauseTaskRequest(this);
        } 

    } 

}
