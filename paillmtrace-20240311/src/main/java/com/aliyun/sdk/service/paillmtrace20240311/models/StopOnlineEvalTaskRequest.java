// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paillmtrace20240311.models;

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
 * {@link StopOnlineEvalTaskRequest} extends {@link RequestModel}
 *
 * <p>StopOnlineEvalTaskRequest</p>
 */
public class StopOnlineEvalTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private StopOnlineEvalTaskRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopOnlineEvalTaskRequest create() {
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

    public static final class Builder extends Request.Builder<StopOnlineEvalTaskRequest, Builder> {
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(StopOnlineEvalTaskRequest request) {
            super(request);
            this.taskId = request.taskId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>518b1d2f3cfca4ad3836ace4db69ba59c</p>
         */
        public Builder taskId(String taskId) {
            this.putPathParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public StopOnlineEvalTaskRequest build() {
            return new StopOnlineEvalTaskRequest(this);
        } 

    } 

}
