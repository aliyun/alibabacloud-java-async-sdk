// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
 * {@link GetAgentJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetAgentJobResponseBody</p>
 */
public class GetAgentJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Job")
    private Job job;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAgentJobResponseBody(Builder builder) {
        this.job = builder.job;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentJobResponseBody create() {
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

        private Builder(GetAgentJobResponseBody model) {
            this.job = model.job;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The task information.</p>
         */
        public Builder job(Job job) {
            this.job = job;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAgentJobResponseBody build() {
            return new GetAgentJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAgentJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentJobResponseBody</p>
     */
    public static class Job extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("Output")
        private String output;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Job(Builder builder) {
            this.jobId = builder.jobId;
            this.output = builder.output;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Job create() {
            return builder().build();
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return output
         */
        public String getOutput() {
            return this.output;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String jobId; 
            private String output; 
            private String status; 

            private Builder() {
            } 

            private Builder(Job model) {
                this.jobId = model.jobId;
                this.output = model.output;
                this.status = model.status;
            } 

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>bc30a1080b21434f961a0d9a391b30b9</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The task output JSON string. Different tasks return different structures, which are defined by the business side.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;OssUri\&quot;:\&quot;oss://ice-ai-saas/ice-ai-saas-prd/1123668546389636/210606863/generate/ag_3a506706a33f44008aec6274d2e38d58/\&quot;}</p>
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            /**
             * <p>The task status. Valid values:</p>
             * <ul>
             * <li>Created</li>
             * <li>Queuing</li>
             * <li>Executing</li>
             * <li>Finished</li>
             * <li>Failed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Job build() {
                return new Job(this);
            } 

        } 

    }
}
