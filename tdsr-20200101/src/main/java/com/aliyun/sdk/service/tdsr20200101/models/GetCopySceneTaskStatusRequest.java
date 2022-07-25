// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCopySceneTaskStatusRequest} extends {@link RequestModel}
 *
 * <p>GetCopySceneTaskStatusRequest</p>
 */
public class GetCopySceneTaskStatusRequest extends Request {
    @Query
    @NameInMap("TaskId")
    @Validation(required = true)
    private String taskId;

    private GetCopySceneTaskStatusRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCopySceneTaskStatusRequest create() {
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

    public static final class Builder extends Request.Builder<GetCopySceneTaskStatusRequest, Builder> {
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetCopySceneTaskStatusRequest request) {
            super(request);
            this.taskId = request.taskId;
        } 

        /**
         * 任务ID
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetCopySceneTaskStatusRequest build() {
            return new GetCopySceneTaskStatusRequest(this);
        } 

    } 

}
