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
 * {@link ListAIVideoTagJobResponseBody} extends {@link TeaModel}
 *
 * <p>ListAIVideoTagJobResponseBody</p>
 */
public class ListAIVideoTagJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AIVideoTagJobList")
    private AIVideoTagJobList AIVideoTagJobList;

    @com.aliyun.core.annotation.NameInMap("NonExistAIVideoTagJobIds")
    private NonExistAIVideoTagJobIds nonExistAIVideoTagJobIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAIVideoTagJobResponseBody(Builder builder) {
        this.AIVideoTagJobList = builder.AIVideoTagJobList;
        this.nonExistAIVideoTagJobIds = builder.nonExistAIVideoTagJobIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAIVideoTagJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AIVideoTagJobList
     */
    public AIVideoTagJobList getAIVideoTagJobList() {
        return this.AIVideoTagJobList;
    }

    /**
     * @return nonExistAIVideoTagJobIds
     */
    public NonExistAIVideoTagJobIds getNonExistAIVideoTagJobIds() {
        return this.nonExistAIVideoTagJobIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AIVideoTagJobList AIVideoTagJobList; 
        private NonExistAIVideoTagJobIds nonExistAIVideoTagJobIds; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListAIVideoTagJobResponseBody model) {
            this.AIVideoTagJobList = model.AIVideoTagJobList;
            this.nonExistAIVideoTagJobIds = model.nonExistAIVideoTagJobIds;
            this.requestId = model.requestId;
        } 

        /**
         * AIVideoTagJobList.
         */
        public Builder AIVideoTagJobList(AIVideoTagJobList AIVideoTagJobList) {
            this.AIVideoTagJobList = AIVideoTagJobList;
            return this;
        }

        /**
         * NonExistAIVideoTagJobIds.
         */
        public Builder nonExistAIVideoTagJobIds(NonExistAIVideoTagJobIds nonExistAIVideoTagJobIds) {
            this.nonExistAIVideoTagJobIds = nonExistAIVideoTagJobIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAIVideoTagJobResponseBody build() {
            return new ListAIVideoTagJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAIVideoTagJobResponseBody} extends {@link TeaModel}
     *
     * <p>ListAIVideoTagJobResponseBody</p>
     */
    public static class AIVideoTagJob extends TeaModel {
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

        private AIVideoTagJob(Builder builder) {
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

        public static AIVideoTagJob create() {
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

            private Builder(AIVideoTagJob model) {
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

            public AIVideoTagJob build() {
                return new AIVideoTagJob(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAIVideoTagJobResponseBody} extends {@link TeaModel}
     *
     * <p>ListAIVideoTagJobResponseBody</p>
     */
    public static class AIVideoTagJobList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AIVideoTagJob")
        private java.util.List<AIVideoTagJob> AIVideoTagJob;

        private AIVideoTagJobList(Builder builder) {
            this.AIVideoTagJob = builder.AIVideoTagJob;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AIVideoTagJobList create() {
            return builder().build();
        }

        /**
         * @return AIVideoTagJob
         */
        public java.util.List<AIVideoTagJob> getAIVideoTagJob() {
            return this.AIVideoTagJob;
        }

        public static final class Builder {
            private java.util.List<AIVideoTagJob> AIVideoTagJob; 

            private Builder() {
            } 

            private Builder(AIVideoTagJobList model) {
                this.AIVideoTagJob = model.AIVideoTagJob;
            } 

            /**
             * AIVideoTagJob.
             */
            public Builder AIVideoTagJob(java.util.List<AIVideoTagJob> AIVideoTagJob) {
                this.AIVideoTagJob = AIVideoTagJob;
                return this;
            }

            public AIVideoTagJobList build() {
                return new AIVideoTagJobList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAIVideoTagJobResponseBody} extends {@link TeaModel}
     *
     * <p>ListAIVideoTagJobResponseBody</p>
     */
    public static class NonExistAIVideoTagJobIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("String")
        private java.util.List<String> string;

        private NonExistAIVideoTagJobIds(Builder builder) {
            this.string = builder.string;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NonExistAIVideoTagJobIds create() {
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

            private Builder(NonExistAIVideoTagJobIds model) {
                this.string = model.string;
            } 

            /**
             * String.
             */
            public Builder string(java.util.List<String> string) {
                this.string = string;
                return this;
            }

            public NonExistAIVideoTagJobIds build() {
                return new NonExistAIVideoTagJobIds(this);
            } 

        } 

    }
}
