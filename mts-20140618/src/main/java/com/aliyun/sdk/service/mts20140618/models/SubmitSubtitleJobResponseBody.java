// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitSubtitleJobResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitSubtitleJobResponseBody</p>
 */
public class SubmitSubtitleJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SubtitleJob")
    private SubtitleJob subtitleJob;

    private SubmitSubtitleJobResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.subtitleJob = builder.subtitleJob;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitSubtitleJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subtitleJob
     */
    public SubtitleJob getSubtitleJob() {
        return this.subtitleJob;
    }

    public static final class Builder {
        private String requestId; 
        private SubtitleJob subtitleJob; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SubtitleJob.
         */
        public Builder subtitleJob(SubtitleJob subtitleJob) {
            this.subtitleJob = subtitleJob;
            return this;
        }

        public SubmitSubtitleJobResponseBody build() {
            return new SubmitSubtitleJobResponseBody(this);
        } 

    } 

    public static class SubtitleJob extends TeaModel {
        @NameInMap("InputConfig")
        private String inputConfig;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("OutputConfig")
        private String outputConfig;

        @NameInMap("State")
        private String state;

        @NameInMap("UserData")
        private String userData;

        private SubtitleJob(Builder builder) {
            this.inputConfig = builder.inputConfig;
            this.jobId = builder.jobId;
            this.outputConfig = builder.outputConfig;
            this.state = builder.state;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubtitleJob create() {
            return builder().build();
        }

        /**
         * @return inputConfig
         */
        public String getInputConfig() {
            return this.inputConfig;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return outputConfig
         */
        public String getOutputConfig() {
            return this.outputConfig;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        public static final class Builder {
            private String inputConfig; 
            private String jobId; 
            private String outputConfig; 
            private String state; 
            private String userData; 

            /**
             * InputConfig.
             */
            public Builder inputConfig(String inputConfig) {
                this.inputConfig = inputConfig;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * OutputConfig.
             */
            public Builder outputConfig(String outputConfig) {
                this.outputConfig = outputConfig;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * UserData.
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            public SubtitleJob build() {
                return new SubtitleJob(this);
            } 

        } 

    }
}
