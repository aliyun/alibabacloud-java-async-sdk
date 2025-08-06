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
 * {@link ListAIVideoFaceRecogJobResponseBody} extends {@link TeaModel}
 *
 * <p>ListAIVideoFaceRecogJobResponseBody</p>
 */
public class ListAIVideoFaceRecogJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AIVideoFaceRecogJobList")
    private AIVideoFaceRecogJobList AIVideoFaceRecogJobList;

    @com.aliyun.core.annotation.NameInMap("NonExistAIVideoFaceRecogJobIds")
    private NonExistAIVideoFaceRecogJobIds nonExistAIVideoFaceRecogJobIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAIVideoFaceRecogJobResponseBody(Builder builder) {
        this.AIVideoFaceRecogJobList = builder.AIVideoFaceRecogJobList;
        this.nonExistAIVideoFaceRecogJobIds = builder.nonExistAIVideoFaceRecogJobIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAIVideoFaceRecogJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AIVideoFaceRecogJobList
     */
    public AIVideoFaceRecogJobList getAIVideoFaceRecogJobList() {
        return this.AIVideoFaceRecogJobList;
    }

    /**
     * @return nonExistAIVideoFaceRecogJobIds
     */
    public NonExistAIVideoFaceRecogJobIds getNonExistAIVideoFaceRecogJobIds() {
        return this.nonExistAIVideoFaceRecogJobIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AIVideoFaceRecogJobList AIVideoFaceRecogJobList; 
        private NonExistAIVideoFaceRecogJobIds nonExistAIVideoFaceRecogJobIds; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListAIVideoFaceRecogJobResponseBody model) {
            this.AIVideoFaceRecogJobList = model.AIVideoFaceRecogJobList;
            this.nonExistAIVideoFaceRecogJobIds = model.nonExistAIVideoFaceRecogJobIds;
            this.requestId = model.requestId;
        } 

        /**
         * AIVideoFaceRecogJobList.
         */
        public Builder AIVideoFaceRecogJobList(AIVideoFaceRecogJobList AIVideoFaceRecogJobList) {
            this.AIVideoFaceRecogJobList = AIVideoFaceRecogJobList;
            return this;
        }

        /**
         * NonExistAIVideoFaceRecogJobIds.
         */
        public Builder nonExistAIVideoFaceRecogJobIds(NonExistAIVideoFaceRecogJobIds nonExistAIVideoFaceRecogJobIds) {
            this.nonExistAIVideoFaceRecogJobIds = nonExistAIVideoFaceRecogJobIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAIVideoFaceRecogJobResponseBody build() {
            return new ListAIVideoFaceRecogJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAIVideoFaceRecogJobResponseBody} extends {@link TeaModel}
     *
     * <p>ListAIVideoFaceRecogJobResponseBody</p>
     */
    public static class AIVideoFaceRecogJob extends TeaModel {
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

        private AIVideoFaceRecogJob(Builder builder) {
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

        public static AIVideoFaceRecogJob create() {
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

            private Builder(AIVideoFaceRecogJob model) {
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

            public AIVideoFaceRecogJob build() {
                return new AIVideoFaceRecogJob(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAIVideoFaceRecogJobResponseBody} extends {@link TeaModel}
     *
     * <p>ListAIVideoFaceRecogJobResponseBody</p>
     */
    public static class AIVideoFaceRecogJobList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AIVideoFaceRecogJob")
        private java.util.List<AIVideoFaceRecogJob> AIVideoFaceRecogJob;

        private AIVideoFaceRecogJobList(Builder builder) {
            this.AIVideoFaceRecogJob = builder.AIVideoFaceRecogJob;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AIVideoFaceRecogJobList create() {
            return builder().build();
        }

        /**
         * @return AIVideoFaceRecogJob
         */
        public java.util.List<AIVideoFaceRecogJob> getAIVideoFaceRecogJob() {
            return this.AIVideoFaceRecogJob;
        }

        public static final class Builder {
            private java.util.List<AIVideoFaceRecogJob> AIVideoFaceRecogJob; 

            private Builder() {
            } 

            private Builder(AIVideoFaceRecogJobList model) {
                this.AIVideoFaceRecogJob = model.AIVideoFaceRecogJob;
            } 

            /**
             * AIVideoFaceRecogJob.
             */
            public Builder AIVideoFaceRecogJob(java.util.List<AIVideoFaceRecogJob> AIVideoFaceRecogJob) {
                this.AIVideoFaceRecogJob = AIVideoFaceRecogJob;
                return this;
            }

            public AIVideoFaceRecogJobList build() {
                return new AIVideoFaceRecogJobList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAIVideoFaceRecogJobResponseBody} extends {@link TeaModel}
     *
     * <p>ListAIVideoFaceRecogJobResponseBody</p>
     */
    public static class NonExistAIVideoFaceRecogJobIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("String")
        private java.util.List<String> string;

        private NonExistAIVideoFaceRecogJobIds(Builder builder) {
            this.string = builder.string;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NonExistAIVideoFaceRecogJobIds create() {
            return builder().build();
        }

        /**
         * @return string
         */
        public java.util.List<String> getString() {
            return this.string;
        }

        public static final class Builder {
            private java.util.List<String> string; 

            private Builder() {
            } 

            private Builder(NonExistAIVideoFaceRecogJobIds model) {
                this.string = model.string;
            } 

            /**
             * String.
             */
            public Builder string(java.util.List<String> string) {
                this.string = string;
                return this;
            }

            public NonExistAIVideoFaceRecogJobIds build() {
                return new NonExistAIVideoFaceRecogJobIds(this);
            } 

        } 

    }
}
