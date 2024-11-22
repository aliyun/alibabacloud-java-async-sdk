// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateUserDeliveryTaskStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserDeliveryTaskStatusRequest</p>
 */
public class UpdateUserDeliveryTaskStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Method")
    @com.aliyun.core.annotation.Validation(required = true)
    private String method;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskName;

    private UpdateUserDeliveryTaskStatusRequest(Builder builder) {
        super(builder);
        this.method = builder.method;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserDeliveryTaskStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return method
     */
    public String getMethod() {
        return this.method;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<UpdateUserDeliveryTaskStatusRequest, Builder> {
        private String method; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserDeliveryTaskStatusRequest request) {
            super(request);
            this.method = request.method;
            this.taskName = request.taskName;
        } 

        /**
         * <p>Enables or disables the delivery task. Valid values: online and offline.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        public Builder method(String method) {
            this.putQueryParameter("Method", method);
            this.method = method;
            return this;
        }

        /**
         * <p>The name of the delivery task.</p>
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
        public UpdateUserDeliveryTaskStatusRequest build() {
            return new UpdateUserDeliveryTaskStatusRequest(this);
        } 

    } 

}
