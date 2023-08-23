// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUserUsageDataExportTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateUserUsageDataExportTaskResponseBody</p>
 */
public class CreateUserUsageDataExportTaskResponseBody extends TeaModel {
    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private String startTime;

    @NameInMap("TaskId")
    private String taskId;

    private CreateUserUsageDataExportTaskResponseBody(Builder builder) {
        this.endTime = builder.endTime;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserUsageDataExportTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String endTime; 
        private String requestId; 
        private String startTime; 
        private String taskId; 

        /**
         * The end of the time range during which data was queried.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The start of the time range during which data was queried.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * The ID of the task.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public CreateUserUsageDataExportTaskResponseBody build() {
            return new CreateUserUsageDataExportTaskResponseBody(this);
        } 

    } 

}
