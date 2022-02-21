// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitPreprocessJobsResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitPreprocessJobsResponseBody</p>
 */
public class SubmitPreprocessJobsResponseBody extends TeaModel {
    @NameInMap("PreprocessJobs")
    private PreprocessJobs preprocessJobs;

    @NameInMap("RequestId")
    private String requestId;

    private SubmitPreprocessJobsResponseBody(Builder builder) {
        this.preprocessJobs = builder.preprocessJobs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitPreprocessJobsResponseBody create() {
        return builder().build();
    }

    /**
     * @return preprocessJobs
     */
    public PreprocessJobs getPreprocessJobs() {
        return this.preprocessJobs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PreprocessJobs preprocessJobs; 
        private String requestId; 

        /**
         * PreprocessJobs.
         */
        public Builder preprocessJobs(PreprocessJobs preprocessJobs) {
            this.preprocessJobs = preprocessJobs;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SubmitPreprocessJobsResponseBody build() {
            return new SubmitPreprocessJobsResponseBody(this);
        } 

    } 

    public static class PreprocessJob extends TeaModel {
        @NameInMap("JobId")
        private String jobId;

        private PreprocessJob(Builder builder) {
            this.jobId = builder.jobId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PreprocessJob create() {
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
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            public PreprocessJob build() {
                return new PreprocessJob(this);
            } 

        } 

    }
    public static class PreprocessJobs extends TeaModel {
        @NameInMap("PreprocessJob")
        private java.util.List < PreprocessJob> preprocessJob;

        private PreprocessJobs(Builder builder) {
            this.preprocessJob = builder.preprocessJob;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PreprocessJobs create() {
            return builder().build();
        }

        /**
         * @return preprocessJob
         */
        public java.util.List < PreprocessJob> getPreprocessJob() {
            return this.preprocessJob;
        }

        public static final class Builder {
            private java.util.List < PreprocessJob> preprocessJob; 

            /**
             * PreprocessJob.
             */
            public Builder preprocessJob(java.util.List < PreprocessJob> preprocessJob) {
                this.preprocessJob = preprocessJob;
                return this;
            }

            public PreprocessJobs build() {
                return new PreprocessJobs(this);
            } 

        } 

    }
}
