// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcontrol20220830.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTaskRequest} extends {@link RequestModel}
 *
 * <p>GetTaskRequest</p>
 */
public class GetTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("taskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private GetTaskRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTaskRequest create() {
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

    public static final class Builder extends Request.Builder<GetTaskRequest, Builder> {
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetTaskRequest request) {
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
        public GetTaskRequest build() {
            return new GetTaskRequest(this);
        } 

    } 

}
