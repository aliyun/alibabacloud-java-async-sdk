// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateDownloadTaskResponseBody model) {
            this.requestId = model.requestId;
            this.status = model.status;
            this.taskId = model.taskId;
            this.taskName = model.taskName;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E7F333E0-7B70-54DA-A307-4B2B49DEE923</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li><p>finish: The task is completed. You can call a task query operation to obtain the download URL of the task file.</p>
         * </li>
         * <li><p>start: The task has started.</p>
         * </li>
         * <li><p>error: The task failed.</p>
         * </li>
         * <li><p>expire: The task has expired. The task file is no longer valid and cannot be downloaded.</p>
         * </li>
         * </ul>
         * <p>This field is returned only under specific conditions, such as when the task is completed synchronously. In regular responses, only RequestId is returned. Use a task query operation to obtain the real-time status.</p>
         * 
         * <strong>example:</strong>
         * <p>start</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The task ID, which uniquely identifies the task. This field is returned only under specific conditions, such as when the task is completed synchronously. In regular responses, only RequestId is returned. Use a task query operation to obtain the task status and download URL.</p>
         * 
         * <strong>example:</strong>
         * <p>132</p>
         */
        public Builder taskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The name of the file download task. This field is returned only under specific conditions, such as when the task is completed synchronously. In regular responses, only RequestId is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>test-IPv4</p>
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
