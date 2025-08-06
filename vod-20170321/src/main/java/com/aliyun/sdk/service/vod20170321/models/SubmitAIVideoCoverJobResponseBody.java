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
 * {@link SubmitAIVideoCoverJobResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitAIVideoCoverJobResponseBody</p>
 */
public class SubmitAIVideoCoverJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AIVideoCoverJob")
    private AIVideoCoverJob AIVideoCoverJob;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SubmitAIVideoCoverJobResponseBody(Builder builder) {
        this.AIVideoCoverJob = builder.AIVideoCoverJob;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitAIVideoCoverJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AIVideoCoverJob
     */
    public AIVideoCoverJob getAIVideoCoverJob() {
        return this.AIVideoCoverJob;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AIVideoCoverJob AIVideoCoverJob; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(SubmitAIVideoCoverJobResponseBody model) {
            this.AIVideoCoverJob = model.AIVideoCoverJob;
            this.requestId = model.requestId;
        } 

        /**
         * AIVideoCoverJob.
         */
        public Builder AIVideoCoverJob(AIVideoCoverJob AIVideoCoverJob) {
            this.AIVideoCoverJob = AIVideoCoverJob;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SubmitAIVideoCoverJobResponseBody build() {
            return new SubmitAIVideoCoverJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SubmitAIVideoCoverJobResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitAIVideoCoverJobResponseBody</p>
     */
    public static class AIVideoCoverJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Data")
        private String data;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private AIVideoCoverJob(Builder builder) {
            this.code = builder.code;
            this.creationTime = builder.creationTime;
            this.data = builder.data;
            this.jobId = builder.jobId;
            this.mediaId = builder.mediaId;
            this.message = builder.message;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AIVideoCoverJob create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return data
         */
        public String getData() {
            return this.data;
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
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String code; 
            private String creationTime; 
            private String data; 
            private String jobId; 
            private String mediaId; 
            private String message; 
            private String status; 

            private Builder() {
            } 

            private Builder(AIVideoCoverJob model) {
                this.code = model.code;
                this.creationTime = model.creationTime;
                this.data = model.data;
                this.jobId = model.jobId;
                this.mediaId = model.mediaId;
                this.message = model.message;
                this.status = model.status;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Data.
             */
            public Builder data(String data) {
                this.data = data;
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
             * MediaId.
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public AIVideoCoverJob build() {
                return new AIVideoCoverJob(this);
            } 

        } 

    }
}
