// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link SubmitTranscodeJobsResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitTranscodeJobsResponseBody</p>
 */
public class SubmitTranscodeJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TranscodeJobs")
    private TranscodeJobs transcodeJobs;

    @com.aliyun.core.annotation.NameInMap("TranscodeTaskId")
    private String transcodeTaskId;

    private SubmitTranscodeJobsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.transcodeJobs = builder.transcodeJobs;
        this.transcodeTaskId = builder.transcodeTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitTranscodeJobsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return transcodeJobs
     */
    public TranscodeJobs getTranscodeJobs() {
        return this.transcodeJobs;
    }

    /**
     * @return transcodeTaskId
     */
    public String getTranscodeTaskId() {
        return this.transcodeTaskId;
    }

    public static final class Builder {
        private String requestId; 
        private TranscodeJobs transcodeJobs; 
        private String transcodeTaskId; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E4EBD2BF-5EB0-4476-8829-9D94E1B1****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the transcoding job.</p>
         * <blockquote>
         * <p> This parameter is not returned for HLS packaging tasks. You must asynchronously receive the transcoding result.</p>
         * </blockquote>
         */
        public Builder transcodeJobs(TranscodeJobs transcodeJobs) {
            this.transcodeJobs = transcodeJobs;
            return this;
        }

        /**
         * <p>The ID of the transcoding task that was submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>9f4a0df7da2c8a81c8c0408c84****</p>
         */
        public Builder transcodeTaskId(String transcodeTaskId) {
            this.transcodeTaskId = transcodeTaskId;
            return this;
        }

        public SubmitTranscodeJobsResponseBody build() {
            return new SubmitTranscodeJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SubmitTranscodeJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitTranscodeJobsResponseBody</p>
     */
    public static class TranscodeJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        private TranscodeJob(Builder builder) {
            this.jobId = builder.jobId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscodeJob create() {
            return builder().build();
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        public static final class Builder {
            private String jobId; 

            /**
             * <p>The ID of the transcoding job.</p>
             * <blockquote>
             * <p> This parameter is not returned for HLS packaging tasks. You must asynchronously receive the transcoding result.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>d8921ce8505716cfe86fb112c4****</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            public TranscodeJob build() {
                return new TranscodeJob(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitTranscodeJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitTranscodeJobsResponseBody</p>
     */
    public static class TranscodeJobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TranscodeJob")
        private java.util.List<TranscodeJob> transcodeJob;

        private TranscodeJobs(Builder builder) {
            this.transcodeJob = builder.transcodeJob;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscodeJobs create() {
            return builder().build();
        }

        /**
         * @return transcodeJob
         */
        public java.util.List<TranscodeJob> getTranscodeJob() {
            return this.transcodeJob;
        }

        public static final class Builder {
            private java.util.List<TranscodeJob> transcodeJob; 

            /**
             * TranscodeJob.
             */
            public Builder transcodeJob(java.util.List<TranscodeJob> transcodeJob) {
                this.transcodeJob = transcodeJob;
                return this;
            }

            public TranscodeJobs build() {
                return new TranscodeJobs(this);
            } 

        } 

    }
}
