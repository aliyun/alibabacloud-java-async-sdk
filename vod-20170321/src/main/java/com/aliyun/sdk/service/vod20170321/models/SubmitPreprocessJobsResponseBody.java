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
 * {@link SubmitPreprocessJobsResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitPreprocessJobsResponseBody</p>
 */
public class SubmitPreprocessJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PreprocessJobs")
    private PreprocessJobs preprocessJobs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(SubmitPreprocessJobsResponseBody model) {
            this.preprocessJobs = model.preprocessJobs;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the job.</p>
         */
        public Builder preprocessJobs(PreprocessJobs preprocessJobs) {
            this.preprocessJobs = preprocessJobs;
            return this;
        }

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

        public SubmitPreprocessJobsResponseBody build() {
            return new SubmitPreprocessJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SubmitPreprocessJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitPreprocessJobsResponseBody</p>
     */
    public static class PreprocessJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JobId")
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

            private Builder() {
            } 

            private Builder(PreprocessJob model) {
                this.jobId = model.jobId;
            } 

            /**
             * <p>The ID of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>bb396607fd11fee9effbb99c4****</p>
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
    /**
     * 
     * {@link SubmitPreprocessJobsResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitPreprocessJobsResponseBody</p>
     */
    public static class PreprocessJobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PreprocessJob")
        private java.util.List<PreprocessJob> preprocessJob;

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
        public java.util.List<PreprocessJob> getPreprocessJob() {
            return this.preprocessJob;
        }

        public static final class Builder {
            private java.util.List<PreprocessJob> preprocessJob; 

            private Builder() {
            } 

            private Builder(PreprocessJobs model) {
                this.preprocessJob = model.preprocessJob;
            } 

            /**
             * PreprocessJob.
             */
            public Builder preprocessJob(java.util.List<PreprocessJob> preprocessJob) {
                this.preprocessJob = preprocessJob;
                return this;
            }

            public PreprocessJobs build() {
                return new PreprocessJobs(this);
            } 

        } 

    }
}
