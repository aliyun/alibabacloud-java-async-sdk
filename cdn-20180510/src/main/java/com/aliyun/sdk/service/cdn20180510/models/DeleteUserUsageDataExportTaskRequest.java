// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteUserUsageDataExportTaskRequest} extends {@link RequestModel}
 *
 * <p>DeleteUserUsageDataExportTaskRequest</p>
 */
public class DeleteUserUsageDataExportTaskRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("TaskId")
    @Validation(required = true)
    private String taskId;

    private DeleteUserUsageDataExportTaskRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUserUsageDataExportTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<DeleteUserUsageDataExportTaskRequest, Builder> {
        private Long ownerId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUserUsageDataExportTaskRequest response) {
            super(response);
            this.ownerId = response.ownerId;
            this.taskId = response.taskId;
        } 

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public DeleteUserUsageDataExportTaskRequest build() {
            return new DeleteUserUsageDataExportTaskRequest(this);
        } 

    } 

}
