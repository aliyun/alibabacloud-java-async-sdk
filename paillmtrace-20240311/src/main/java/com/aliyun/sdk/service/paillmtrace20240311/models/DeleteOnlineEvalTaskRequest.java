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
 * {@link DeleteOnlineEvalTaskRequest} extends {@link RequestModel}
 *
 * <p>DeleteOnlineEvalTaskRequest</p>
 */
public class DeleteOnlineEvalTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private DeleteOnlineEvalTaskRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteOnlineEvalTaskRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteOnlineEvalTaskRequest, Builder> {
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteOnlineEvalTaskRequest request) {
            super(request);
            this.taskId = request.taskId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1d3f2shp3cfjum4l74odz5gkkh</p>
         */
        public Builder taskId(String taskId) {
            this.putPathParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public DeleteOnlineEvalTaskRequest build() {
            return new DeleteOnlineEvalTaskRequest(this);
        } 

    } 

}
