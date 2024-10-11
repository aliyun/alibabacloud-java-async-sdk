// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SubmitAIJobResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitAIJobResponseBody</p>
 */
public class SubmitAIJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AIJobList")
    private AIJobList AIJobList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The information about the AI jobs.</p>
         */
        public Builder AIJobList(AIJobList AIJobList) {
            this.AIJobList = AIJobList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4A13-BEF6-D73936****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SubmitAIJobResponseBody build() {
            return new SubmitAIJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SubmitAIJobResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitAIJobResponseBody</p>
     */
    public static class AIJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * <p>The ID of the AI job.</p>
             * 
             * <strong>example:</strong>
             * <p>9e82640c85114bf5af23edfaf****</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The ID of the video.</p>
             * 
             * <strong>example:</strong>
             * <p>3D3D12340d92c641401fab46a0b847****</p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * <p>The type of the AI job. Valid values:</p>
             * <ul>
             * <li><strong>AIMediaDNA</strong>: The media fingerprinting job.</li>
             * <li><strong>AIVideoTag</strong>: The smart tagging job.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AIVideoTag</p>
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
    /**
     * 
     * {@link SubmitAIJobResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitAIJobResponseBody</p>
     */
    public static class AIJobList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AIJob")
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
