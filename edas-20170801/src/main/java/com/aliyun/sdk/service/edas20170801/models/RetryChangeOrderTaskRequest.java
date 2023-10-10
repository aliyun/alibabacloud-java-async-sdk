// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RetryChangeOrderTaskRequest} extends {@link RequestModel}
 *
 * <p>RetryChangeOrderTaskRequest</p>
 */
public class RetryChangeOrderTaskRequest extends Request {
    @Query
    @NameInMap("RetryStatus")
    private Boolean retryStatus;

    @Query
    @NameInMap("TaskId")
    @Validation(required = true)
    private String taskId;

    private RetryChangeOrderTaskRequest(Builder builder) {
        super(builder);
        this.retryStatus = builder.retryStatus;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RetryChangeOrderTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return retryStatus
     */
    public Boolean getRetryStatus() {
        return this.retryStatus;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<RetryChangeOrderTaskRequest, Builder> {
        private Boolean retryStatus; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(RetryChangeOrderTaskRequest request) {
            super(request);
            this.retryStatus = request.retryStatus;
            this.taskId = request.taskId;
        } 

        /**
         * The retry status.
         */
        public Builder retryStatus(Boolean retryStatus) {
            this.putQueryParameter("RetryStatus", retryStatus);
            this.retryStatus = retryStatus;
            return this;
        }

        /**
         * The ID of the process.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public RetryChangeOrderTaskRequest build() {
            return new RetryChangeOrderTaskRequest(this);
        } 

    } 

}
