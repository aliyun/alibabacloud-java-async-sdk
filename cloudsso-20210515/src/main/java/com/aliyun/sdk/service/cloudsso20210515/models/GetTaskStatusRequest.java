// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTaskStatusRequest} extends {@link RequestModel}
 *
 * <p>GetTaskStatusRequest</p>
 */
public class GetTaskStatusRequest extends Request {
    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("TaskId")
    private String taskId;

    private GetTaskStatusRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTaskStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<GetTaskStatusRequest, Builder> {
        private String directoryId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetTaskStatusRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.taskId = request.taskId;
        } 

        /**
         * The ID of the directory.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * The ID of the task.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetTaskStatusRequest build() {
            return new GetTaskStatusRequest(this);
        } 

    } 

}
