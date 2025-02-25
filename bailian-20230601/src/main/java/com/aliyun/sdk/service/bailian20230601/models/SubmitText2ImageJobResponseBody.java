// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitText2ImageJobResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitText2ImageJobResponseBody</p>
 */
public class SubmitText2ImageJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskId")
    private String taskId;

    @NameInMap("TaskStatus")
    private String taskStatus;

    private SubmitText2ImageJobResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
        this.taskStatus = builder.taskStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitText2ImageJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskStatus
     */
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public static final class Builder {
        private String requestId; 
        private String taskId; 
        private String taskStatus; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * TaskStatus.
         */
        public Builder taskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }

        public SubmitText2ImageJobResponseBody build() {
            return new SubmitText2ImageJobResponseBody(this);
        } 

    } 

}
