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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E7F333E0-7B70-54DA-A307-4B2B49DEE923</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the task. Valid values:</p>
         * <p>finish: The task finished. You can query the task to obtain the download link of the file.</p>
         * <p>start: The task start.</p>
         * <p>error: An error occurred.</p>
         * <p>expire: The task file is invalid and cannot be downloaded.</p>
         * 
         * <strong>example:</strong>
         * <p>start</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The unique ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>132</p>
         */
        public Builder taskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The name of the file download task.</p>
         * 
         * <strong>example:</strong>
         * <p>Internet Boundary Firewall Assets - IPv4</p>
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
