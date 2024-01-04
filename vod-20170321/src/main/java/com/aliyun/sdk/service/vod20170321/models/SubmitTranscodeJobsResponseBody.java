// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitTranscodeJobsResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitTranscodeJobsResponseBody</p>
 */
public class SubmitTranscodeJobsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TranscodeJobs")
    private TranscodeJobs transcodeJobs;

    @NameInMap("TranscodeTaskId")
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the transcoding job.
         * <p>
         * 
         * >  This parameter is not returned for HLS packaging tasks. You must asynchronously receive the transcoding result.
         */
        public Builder transcodeJobs(TranscodeJobs transcodeJobs) {
            this.transcodeJobs = transcodeJobs;
            return this;
        }

        /**
         * The ID of the transcoding task that was submitted.
         */
        public Builder transcodeTaskId(String transcodeTaskId) {
            this.transcodeTaskId = transcodeTaskId;
            return this;
        }

        public SubmitTranscodeJobsResponseBody build() {
            return new SubmitTranscodeJobsResponseBody(this);
        } 

    } 

    public static class TranscodeJob extends TeaModel {
        @NameInMap("JobId")
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
             * The ID of the transcoding job.
             * <p>
             * 
             * >  This parameter is not returned for HLS packaging tasks. You must asynchronously receive the transcoding result.
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
    public static class TranscodeJobs extends TeaModel {
        @NameInMap("TranscodeJob")
        private java.util.List < TranscodeJob> transcodeJob;

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
        public java.util.List < TranscodeJob> getTranscodeJob() {
            return this.transcodeJob;
        }

        public static final class Builder {
            private java.util.List < TranscodeJob> transcodeJob; 

            /**
             * TranscodeJob.
             */
            public Builder transcodeJob(java.util.List < TranscodeJob> transcodeJob) {
                this.transcodeJob = transcodeJob;
                return this;
            }

            public TranscodeJobs build() {
                return new TranscodeJobs(this);
            } 

        } 

    }
}
