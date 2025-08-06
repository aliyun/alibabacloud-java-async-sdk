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
 * {@link SubmitPreprocessJobsConsoleResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitPreprocessJobsConsoleResponseBody</p>
 */
public class SubmitPreprocessJobsConsoleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TranscodeJobs")
    private TranscodeJobs transcodeJobs;

    private SubmitPreprocessJobsConsoleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.transcodeJobs = builder.transcodeJobs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitPreprocessJobsConsoleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder {
        private String requestId; 
        private TranscodeJobs transcodeJobs; 

        private Builder() {
        } 

        private Builder(SubmitPreprocessJobsConsoleResponseBody model) {
            this.requestId = model.requestId;
            this.transcodeJobs = model.transcodeJobs;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TranscodeJobs.
         */
        public Builder transcodeJobs(TranscodeJobs transcodeJobs) {
            this.transcodeJobs = transcodeJobs;
            return this;
        }

        public SubmitPreprocessJobsConsoleResponseBody build() {
            return new SubmitPreprocessJobsConsoleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SubmitPreprocessJobsConsoleResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitPreprocessJobsConsoleResponseBody</p>
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

            private Builder() {
            } 

            private Builder(TranscodeJob model) {
                this.jobId = model.jobId;
            } 

            /**
             * JobId.
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
     * {@link SubmitPreprocessJobsConsoleResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitPreprocessJobsConsoleResponseBody</p>
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

            private Builder() {
            } 

            private Builder(TranscodeJobs model) {
                this.transcodeJob = model.transcodeJob;
            } 

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
