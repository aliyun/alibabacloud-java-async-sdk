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
 * {@link SubmitAIVideoTerrorismRecogJobResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitAIVideoTerrorismRecogJobResponseBody</p>
 */
public class SubmitAIVideoTerrorismRecogJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AIVideoTerrorismRecogJob")
    private AIVideoTerrorismRecogJob AIVideoTerrorismRecogJob;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SubmitAIVideoTerrorismRecogJobResponseBody(Builder builder) {
        this.AIVideoTerrorismRecogJob = builder.AIVideoTerrorismRecogJob;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitAIVideoTerrorismRecogJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AIVideoTerrorismRecogJob
     */
    public AIVideoTerrorismRecogJob getAIVideoTerrorismRecogJob() {
        return this.AIVideoTerrorismRecogJob;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AIVideoTerrorismRecogJob AIVideoTerrorismRecogJob; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(SubmitAIVideoTerrorismRecogJobResponseBody model) {
            this.AIVideoTerrorismRecogJob = model.AIVideoTerrorismRecogJob;
            this.requestId = model.requestId;
        } 

        /**
         * AIVideoTerrorismRecogJob.
         */
        public Builder AIVideoTerrorismRecogJob(AIVideoTerrorismRecogJob AIVideoTerrorismRecogJob) {
            this.AIVideoTerrorismRecogJob = AIVideoTerrorismRecogJob;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SubmitAIVideoTerrorismRecogJobResponseBody build() {
            return new SubmitAIVideoTerrorismRecogJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SubmitAIVideoTerrorismRecogJobResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitAIVideoTerrorismRecogJobResponseBody</p>
     */
    public static class AIVideoTerrorismRecogJob extends TeaModel {
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

        private AIVideoTerrorismRecogJob(Builder builder) {
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

        public static AIVideoTerrorismRecogJob create() {
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

            private Builder(AIVideoTerrorismRecogJob model) {
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

            public AIVideoTerrorismRecogJob build() {
                return new AIVideoTerrorismRecogJob(this);
            } 

        } 

    }
}
