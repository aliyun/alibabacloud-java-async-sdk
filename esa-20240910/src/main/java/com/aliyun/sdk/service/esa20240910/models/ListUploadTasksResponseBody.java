// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListUploadTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListUploadTasksResponseBody</p>
 */
public class ListUploadTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tasks")
    private java.util.List < Tasks> tasks;

    private ListUploadTasksResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tasks = builder.tasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUploadTasksResponseBody create() {
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
    public java.util.List < Tasks> getTasks() {
        return this.tasks;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Tasks> tasks; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CB1A380B-09F0-41BB-A198-72F8FD6D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The file upload tasks.</p>
         */
        public Builder tasks(java.util.List < Tasks> tasks) {
            this.tasks = tasks;
            return this;
        }

        public ListUploadTasksResponseBody build() {
            return new ListUploadTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUploadTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListUploadTasksResponseBody</p>
     */
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UploadId")
        private String uploadId;

        @com.aliyun.core.annotation.NameInMap("UploadTaskName")
        private String uploadTaskName;

        private Tasks(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.errorCode = builder.errorCode;
            this.status = builder.status;
            this.type = builder.type;
            this.uploadId = builder.uploadId;
            this.uploadTaskName = builder.uploadTaskName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return uploadId
         */
        public String getUploadId() {
            return this.uploadId;
        }

        /**
         * @return uploadTaskName
         */
        public String getUploadTaskName() {
            return this.uploadTaskName;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String errorCode; 
            private String status; 
            private String type; 
            private String uploadId; 
            private String uploadTaskName; 

            /**
             * <p>The time when the task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-07-26T01:56:15Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The error message returned when the file upload task failed.</p>
             * 
             * <strong>example:</strong>
             * <p>invalid url</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The error code. Multiple error codes are separated by commas (,).</p>
             * <ul>
             * <li><strong>InvalidUrl</strong>: The URL format is incorrect.</li>
             * <li><strong>InvalidDomain</strong>: The domain ownership fails to be verified.</li>
             * <li><strong>QuotaExcess</strong>: The quota limit has been reached.</li>
             * <li><strong>OtherErrors</strong>: Other errors.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>InvalidUrl,InvalidDomain</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The task status.</p>
             * <ul>
             * <li><strong>Complete</strong>: The task is complete.</li>
             * <li><strong>Refreshing</strong>: The task is in progress.</li>
             * <li><strong>Failed</strong>: The task failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Complete</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The task type. Valid values:</p>
             * <ul>
             * <li><strong>file</strong>: purges the cache by file URL.</li>
             * <li><strong>preload</strong>: prefetches files.</li>
             * <li><strong>directory</strong>: purges the cache by directory.</li>
             * <li><strong>ignoreparams</strong>: purges the cache by URL with specified parameters ignored.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>file</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The ID of the file upload task.</p>
             * 
             * <strong>example:</strong>
             * <p>159253299357****</p>
             */
            public Builder uploadId(String uploadId) {
                this.uploadId = uploadId;
                return this;
            }

            /**
             * <p>The name of the file upload task.</p>
             * 
             * <strong>example:</strong>
             * <p>purge_file_task</p>
             */
            public Builder uploadTaskName(String uploadTaskName) {
                this.uploadTaskName = uploadTaskName;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
}
