// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetJobStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetJobStatusResponseBody</p>
 */
public class GetJobStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobStatus")
    private JobStatus jobStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetJobStatusResponseBody(Builder builder) {
        this.jobStatus = builder.jobStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return jobStatus
     */
    public JobStatus getJobStatus() {
        return this.jobStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private JobStatus jobStatus; 
        private String requestId; 

        /**
         * <p>The real-time status information of the asynchronous task.</p>
         */
        public Builder jobStatus(JobStatus jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5E2BFE96-C0E0-5A98-85C8-633EC803198D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetJobStatusResponseBody build() {
            return new GetJobStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetJobStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobStatusResponseBody</p>
     */
    public static class JobStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Completed")
        private String completed;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Error")
        private String error;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("JobType")
        private String jobType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private JobStatus(Builder builder) {
            this.completed = builder.completed;
            this.createTime = builder.createTime;
            this.error = builder.error;
            this.jobId = builder.jobId;
            this.jobType = builder.jobType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobStatus create() {
            return builder().build();
        }

        /**
         * @return completed
         */
        public String getCompleted() {
            return this.completed;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return error
         */
        public String getError() {
            return this.error;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return jobType
         */
        public String getJobType() {
            return this.jobType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String completed; 
            private String createTime; 
            private String error; 
            private String jobId; 
            private String jobType; 
            private String status; 

            /**
             * <p>Indicates whether the asynchronous task is complete. Valid values: True False</p>
             * 
             * <strong>example:</strong>
             * <p>False</p>
             */
            public Builder completed(String completed) {
                this.completed = completed;
                return this;
            }

            /**
             * <p>The time when the asynchronous task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1729063449802</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The error message returned if the asynchronous task fails.</p>
             * 
             * <strong>example:</strong>
             * <p>Not Found</p>
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            /**
             * <p>The ID of the asynchronous task.</p>
             * 
             * <strong>example:</strong>
             * <p>C664CDE3-9C0B-5792-B17F-6C543783BBBC</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The type of the asynchronous task. Valid values:</p>
             * <ul>
             * <li><strong>Create</strong>: The asynchronous task is used to create an object.</li>
             * <li><strong>Update</strong>: The asynchronous task is used to update an object.</li>
             * <li><strong>Cancel</strong>: The asynchronous task is used to cancel an operation.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Create</p>
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * <p>The status of the asynchronous task. Valid values:</p>
             * <ul>
             * <li><strong>Success</strong></li>
             * <li><strong>Fail</strong></li>
             * <li><strong>Cancel</strong></li>
             * <li><strong>Running</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public JobStatus build() {
                return new JobStatus(this);
            } 

        } 

    }
}
