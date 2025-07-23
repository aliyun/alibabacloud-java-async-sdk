// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hsm20231113.models;

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
 * {@link ExportImageResponseBody} extends {@link TeaModel}
 *
 * <p>ExportImageResponseBody</p>
 */
public class ExportImageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Job")
    private Job job;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ExportImageResponseBody(Builder builder) {
        this.job = builder.job;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportImageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return job
     */
    public Job getJob() {
        return this.job;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Job job; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ExportImageResponseBody model) {
            this.job = model.job;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the asynchronous task returned.</p>
         */
        public Builder job(Job job) {
            this.job = job;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4C467B38-3910-447D-87BC-AC049166F216</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ExportImageResponseBody build() {
            return new ExportImageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ExportImageResponseBody} extends {@link TeaModel}
     *
     * <p>ExportImageResponseBody</p>
     */
    public static class Job extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Completed")
        private Boolean completed;

        @com.aliyun.core.annotation.NameInMap("Error")
        private String error;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("Process")
        private Integer process;

        @com.aliyun.core.annotation.NameInMap("Response")
        private String response;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Job(Builder builder) {
            this.completed = builder.completed;
            this.error = builder.error;
            this.jobId = builder.jobId;
            this.process = builder.process;
            this.response = builder.response;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Job create() {
            return builder().build();
        }

        /**
         * @return completed
         */
        public Boolean getCompleted() {
            return this.completed;
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
         * @return process
         */
        public Integer getProcess() {
            return this.process;
        }

        /**
         * @return response
         */
        public String getResponse() {
            return this.response;
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

        public static final class Builder {
            private Boolean completed; 
            private String error; 
            private String jobId; 
            private Integer process; 
            private String response; 
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(Job model) {
                this.completed = model.completed;
                this.error = model.error;
                this.jobId = model.jobId;
                this.process = model.process;
                this.response = model.response;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * <p>Indicates whether the task is complete. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder completed(Boolean completed) {
                this.completed = completed;
                return this;
            }

            /**
             * <p>The error message returned if the operation is abnormal or fails.</p>
             * 
             * <strong>example:</strong>
             * <p>Job.Canceled</p>
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            /**
             * <p>The ID of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>b1748ca6-6b55-49f4-a6d4-2d694a9f3693</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The progress of the task. Unit: percent (%).</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder process(Integer process) {
                this.process = process;
                return this;
            }

            /**
             * <p>The response returned after the operation succeeds.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder response(String response) {
                this.response = response;
                return this;
            }

            /**
             * <p>The task status. Valid values:</p>
             * <ul>
             * <li>running</li>
             * <li>cancel</li>
             * <li>fail</li>
             * <li>success</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the task operation. Valid values:</p>
             * <ul>
             * <li>create</li>
             * <li>cancel</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>create</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Job build() {
                return new Job(this);
            } 

        } 

    }
}
