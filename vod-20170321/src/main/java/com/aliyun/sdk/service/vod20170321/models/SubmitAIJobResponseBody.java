// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitAIJobResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitAIJobResponseBody</p>
 */
public class SubmitAIJobResponseBody extends TeaModel {
    @NameInMap("AIJobList")
    private AIJobList AIJobList;

    @NameInMap("RequestId")
    private String requestId;

    private SubmitAIJobResponseBody(Builder builder) {
        this.AIJobList = builder.AIJobList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitAIJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return AIJobList
     */
    public AIJobList getAIJobList() {
        return this.AIJobList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AIJobList AIJobList; 
        private String requestId; 

        /**
         * The ID of the video.
         */
        public Builder AIJobList(AIJobList AIJobList) {
            this.AIJobList = AIJobList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SubmitAIJobResponseBody build() {
            return new SubmitAIJobResponseBody(this);
        } 

    } 

    public static class AIJob extends TeaModel {
        @NameInMap("JobId")
        private String jobId;

        @NameInMap("MediaId")
        private String mediaId;

        @NameInMap("Type")
        private String type;

        private AIJob(Builder builder) {
            this.jobId = builder.jobId;
            this.mediaId = builder.mediaId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AIJob create() {
            return builder().build();
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String jobId; 
            private String mediaId; 
            private String type; 

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * MediaId.
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * SubmitAIJob
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public AIJob build() {
                return new AIJob(this);
            } 

        } 

    }
    public static class AIJobList extends TeaModel {
        @NameInMap("AIJob")
        private java.util.List < AIJob> AIJob;

        private AIJobList(Builder builder) {
            this.AIJob = builder.AIJob;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AIJobList create() {
            return builder().build();
        }

        /**
         * @return AIJob
         */
        public java.util.List < AIJob> getAIJob() {
            return this.AIJob;
        }

        public static final class Builder {
            private java.util.List < AIJob> AIJob; 

            /**
             * AIJob.
             */
            public Builder AIJob(java.util.List < AIJob> AIJob) {
                this.AIJob = AIJob;
                return this;
            }

            public AIJobList build() {
                return new AIJobList(this);
            } 

        } 

    }
}
