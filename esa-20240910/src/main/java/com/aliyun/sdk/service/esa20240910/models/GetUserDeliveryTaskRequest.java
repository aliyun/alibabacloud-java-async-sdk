// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetUserDeliveryTaskRequest} extends {@link RequestModel}
 *
 * <p>GetUserDeliveryTaskRequest</p>
 */
public class GetUserDeliveryTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskName;

    private GetUserDeliveryTaskRequest(Builder builder) {
        super(builder);
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserDeliveryTaskRequest create() {
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

    public static final class Builder extends Request.Builder<GetUserDeliveryTaskRequest, Builder> {
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(GetUserDeliveryTaskRequest request) {
            super(request);
            this.taskName = request.taskName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_project</p>
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public GetUserDeliveryTaskRequest build() {
            return new GetUserDeliveryTaskRequest(this);
        } 

    } 

}
