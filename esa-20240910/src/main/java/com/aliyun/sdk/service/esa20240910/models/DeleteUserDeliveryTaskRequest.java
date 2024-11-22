// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteUserDeliveryTaskRequest} extends {@link RequestModel}
 *
 * <p>DeleteUserDeliveryTaskRequest</p>
 */
public class DeleteUserDeliveryTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskName;

    private DeleteUserDeliveryTaskRequest(Builder builder) {
        super(builder);
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUserDeliveryTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<DeleteUserDeliveryTaskRequest, Builder> {
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUserDeliveryTaskRequest request) {
            super(request);
            this.taskName = request.taskName;
        } 

        /**
         * <p>The name of the delivery task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-project</p>
         */
        public Builder taskName(String taskName) {
            this.putBodyParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public DeleteUserDeliveryTaskRequest build() {
            return new DeleteUserDeliveryTaskRequest(this);
        } 

    } 

}
