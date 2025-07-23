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
 * {@link ResetInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ResetInstanceResponseBody</p>
 */
public class ResetInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Job")
    private Job job;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ResetInstanceResponseBody(Builder builder) {
        this.job = builder.job;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetInstanceResponseBody create() {
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

        private Builder(ResetInstanceResponseBody model) {
            this.job = model.job;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the task.</p>
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

        public ResetInstanceResponseBody build() {
            return new ResetInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ResetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>ResetInstanceResponseBody</p>
     */
    public static class Job extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Completed")
        private Boolean completed;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Error")
        private String error;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Integer progress;

        @com.aliyun.core.annotation.NameInMap("Response")
        private String response;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Job(Builder builder) {
            this.completed = builder.completed;
            this.createTime = builder.createTime;
            this.error = builder.error;
            this.jobId = builder.jobId;
            this.progress = builder.progress;
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
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
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
            private String createTime; 
            private String error; 
            private String jobId; 
            private Integer progress; 
            private String response; 
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(Job model) {
                this.completed = model.completed;
                this.createTime = model.createTime;
                this.error = model.error;
                this.jobId = model.jobId;
                this.progress = model.progress;
                this.response = model.response;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * <p>Indicates whether the task is complete.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder completed(Boolean completed) {
                this.completed = completed;
                return this;
            }

            /**
             * <p>The time when the task is created. The value is accurate to the millisecond. The value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1653274407000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The error message returned if the task fails.</p>
             * 
             * <strong>example:</strong>
             * <p>OperationTimeout</p>
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            /**
             * <p>The ID of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>job-0007bl8oev0u3jqyfu6a</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The progress of the task. Unit: percent (%).</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The response returned after the task succeeds.</p>
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
             * <li>success</li>
             * <li>running</li>
             * <li>cancel</li>
             * <li>fail</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The operation type. Valid values:</p>
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
