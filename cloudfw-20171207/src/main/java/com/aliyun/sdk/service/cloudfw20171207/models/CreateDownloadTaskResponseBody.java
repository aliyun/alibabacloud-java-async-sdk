// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDownloadTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDownloadTaskResponseBody</p>
 */
public class CreateDownloadTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private Long taskId;

    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    private CreateDownloadTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.taskId = builder.taskId;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDownloadTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder {
        private String requestId; 
        private String status; 
        private Long taskId; 
        private String taskName; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The status of the task. Valid values:
         * <p>
         * 
         * finish: The task finished. You can query the task to obtain the download link of the file.
         * 
         * start: The task start.
         * 
         * error: An error occurred.
         * 
         * expire: The task file is invalid and cannot be downloaded.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * The unique ID of the task.
         */
        public Builder taskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * The name of the file download task.
         */
        public Builder taskName(String taskName) {
            this.taskName = taskName;
            return this;
        }

        public CreateDownloadTaskResponseBody build() {
            return new CreateDownloadTaskResponseBody(this);
        } 

    } 

}
