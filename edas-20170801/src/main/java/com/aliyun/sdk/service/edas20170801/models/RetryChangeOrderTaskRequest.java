// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link RetryChangeOrderTaskRequest} extends {@link RequestModel}
 *
 * <p>RetryChangeOrderTaskRequest</p>
 */
public class RetryChangeOrderTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetryStatus")
    private Boolean retryStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The retry status.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder retryStatus(Boolean retryStatus) {
            this.putQueryParameter("RetryStatus", retryStatus);
            this.retryStatus = retryStatus;
            return this;
        }

        /**
         * <p>The ID of the process.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>823-bhjf-23u4-eiuf*</p>
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
