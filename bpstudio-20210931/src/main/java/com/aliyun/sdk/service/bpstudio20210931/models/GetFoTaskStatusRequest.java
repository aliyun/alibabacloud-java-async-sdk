// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFoTaskStatusRequest} extends {@link RequestModel}
 *
 * <p>GetFoTaskStatusRequest</p>
 */
public class GetFoTaskStatusRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private Integer taskId;

    private GetFoTaskStatusRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFoTaskStatusRequest create() {
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

    public static final class Builder extends Request.Builder<GetFoTaskStatusRequest, Builder> {
        private Integer taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetFoTaskStatusRequest request) {
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
        public GetFoTaskStatusRequest build() {
            return new GetFoTaskStatusRequest(this);
        } 

    } 

}
