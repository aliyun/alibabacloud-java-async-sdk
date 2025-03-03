// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link CreateScreenshotResponseBody} extends {@link TeaModel}
 *
 * <p>CreateScreenshotResponseBody</p>
 */
public class CreateScreenshotResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tasks")
    private java.util.List<Tasks> tasks;

    private CreateScreenshotResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tasks = builder.tasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScreenshotResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tasks
     */
    public java.util.List<Tasks> getTasks() {
        return this.tasks;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Tasks> tasks; 

        /**
         * <p>The ID of the request. If the request fails, share this ID with technical support to help diagnose the issue.</p>
         * 
         * <strong>example:</strong>
         * <p>3AF82CE1-2801-52CE-BF64-B491DD7C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The tasks.</p>
         */
        public Builder tasks(java.util.List<Tasks> tasks) {
            this.tasks = tasks;
            return this;
        }

        public CreateScreenshotResponseBody build() {
            return new CreateScreenshotResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateScreenshotResponseBody} extends {@link TeaModel}
     *
     * <p>CreateScreenshotResponseBody</p>
     */
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AndroidInstanceId")
        private String androidInstanceId;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private Tasks(Builder builder) {
            this.androidInstanceId = builder.androidInstanceId;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return androidInstanceId
         */
        public String getAndroidInstanceId() {
            return this.androidInstanceId;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String androidInstanceId; 
            private String taskId; 

            /**
             * <p>The ID of the cloud phone instance.</p>
             * 
             * <strong>example:</strong>
             * <p>acp-bwhtebzah2fse****</p>
             */
            public Builder androidInstanceId(String androidInstanceId) {
                this.androidInstanceId = androidInstanceId;
                return this;
            }

            /**
             * <p>The ID of the task. You can use the task ID with the DescribeTasks operation to get the download link for the screenshot.</p>
             * 
             * <strong>example:</strong>
             * <p>t-imr0fufqd7cle****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
}
