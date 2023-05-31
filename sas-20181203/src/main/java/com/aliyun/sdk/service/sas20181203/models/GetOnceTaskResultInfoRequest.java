// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOnceTaskResultInfoRequest} extends {@link RequestModel}
 *
 * <p>GetOnceTaskResultInfoRequest</p>
 */
public class GetOnceTaskResultInfoRequest extends Request {
    @Query
    @NameInMap("TaskId")
    @Validation(required = true)
    private String taskId;

    @Query
    @NameInMap("TaskName")
    @Validation(required = true)
    private String taskName;

    @Query
    @NameInMap("TaskType")
    @Validation(required = true)
    private String taskType;

    private GetOnceTaskResultInfoRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
        this.taskName = builder.taskName;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOnceTaskResultInfoRequest create() {
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

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<GetOnceTaskResultInfoRequest, Builder> {
        private String taskId; 
        private String taskName; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(GetOnceTaskResultInfoRequest request) {
            super(request);
            this.taskId = request.taskId;
            this.taskName = request.taskName;
            this.taskType = request.taskType;
        } 

        /**
         * The ID of the scan task.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * The name of the task. Valid values:
         * <p>
         * 
         * *   **CLIENT\_PROBLEM_CHECK**: a task of the Security Center agent
         * *   **CLIENT\_DEV_OPS**: an O\&M task of Cloud Assistant
         * *   **ASSET\_SECURITY_CHECK**: a task of asset information collection
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * The type of the task. Valid values:
         * <p>
         * 
         * *   **CLIENT\_PROBLEM_CHECK**: a task of the Security Center agent
         * *   **CLIENT\_DEV_OPS**: an O\&M task of Cloud Assistant
         * *   **ASSET\_SECURITY_CHECK**: a task of asset information collection
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public GetOnceTaskResultInfoRequest build() {
            return new GetOnceTaskResultInfoRequest(this);
        } 

    } 

}
