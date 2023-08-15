// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcontrol20220830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelTaskRequest} extends {@link RequestModel}
 *
 * <p>CancelTaskRequest</p>
 */
public class CancelTaskRequest extends Request {
    @Path
    @NameInMap("taskId")
    @Validation(required = true)
    private String taskId;

    private CancelTaskRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelTaskRequest create() {
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

    public static final class Builder extends Request.Builder<CancelTaskRequest, Builder> {
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(CancelTaskRequest request) {
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
        public CancelTaskRequest build() {
            return new CancelTaskRequest(this);
        } 

    } 

}
