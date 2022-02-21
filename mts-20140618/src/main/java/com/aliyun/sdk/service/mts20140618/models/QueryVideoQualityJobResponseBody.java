// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryVideoQualityJobResponseBody} extends {@link TeaModel}
 *
 * <p>QueryVideoQualityJobResponseBody</p>
 */
public class QueryVideoQualityJobResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Job")
    private Job job;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private QueryVideoQualityJobResponseBody(Builder builder) {
        this.code = builder.code;
        this.job = builder.job;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryVideoQualityJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return job
     */
    public Job getJob() {
        return this.job;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Job job; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Job.
         */
        public Builder job(Job job) {
            this.job = job;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryVideoQualityJobResponseBody build() {
            return new QueryVideoQualityJobResponseBody(this);
        } 

    } 

    public static class Job extends TeaModel {
        @NameInMap("JobId")
        private String jobId;

        @NameInMap("Message")
        private String message;

        @NameInMap("Output")
        private String output;

        @NameInMap("Status")
        private String status;

        @NameInMap("UserId")
        private Long userId;

        @NameInMap("VideoQualityResults")
        private String videoQualityResults;

        private Job(Builder builder) {
            this.jobId = builder.jobId;
            this.message = builder.message;
            this.output = builder.output;
            this.status = builder.status;
            this.userId = builder.userId;
            this.videoQualityResults = builder.videoQualityResults;
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
         * @return message
         */
        public String getMessage() {
            return this.message;
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

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        /**
         * @return videoQualityResults
         */
        public String getVideoQualityResults() {
            return this.videoQualityResults;
        }

        public static final class Builder {
            private String jobId; 
            private String message; 
            private String output; 
            private String status; 
            private Long userId; 
            private String videoQualityResults; 

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * Output.
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * VideoQualityResults.
             */
            public Builder videoQualityResults(String videoQualityResults) {
                this.videoQualityResults = videoQualityResults;
                return this;
            }

            public Job build() {
                return new Job(this);
            } 

        } 

    }
}
