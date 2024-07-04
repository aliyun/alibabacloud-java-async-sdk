// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSceneTestingTaskRequest} extends {@link RequestModel}
 *
 * <p>DeleteSceneTestingTaskRequest</p>
 */
public class DeleteSceneTestingTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    private DeleteSceneTestingTaskRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSceneTestingTaskRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteSceneTestingTaskRequest, Builder> {
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSceneTestingTaskRequest request) {
            super(request);
            this.taskId = request.taskId;
        } 

        /**
         * taskId.
         */
        public Builder taskId(String taskId) {
            this.putPathParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public DeleteSceneTestingTaskRequest build() {
            return new DeleteSceneTestingTaskRequest(this);
        } 

    } 

}
