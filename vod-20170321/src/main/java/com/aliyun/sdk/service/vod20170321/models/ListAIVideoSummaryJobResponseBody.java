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
 * {@link ListAIVideoSummaryJobResponseBody} extends {@link TeaModel}
 *
 * <p>ListAIVideoSummaryJobResponseBody</p>
 */
public class ListAIVideoSummaryJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AIVideoSummaryJobList")
    private AIVideoSummaryJobList AIVideoSummaryJobList;

    @com.aliyun.core.annotation.NameInMap("NonExistAIVideoSummaryJobIds")
    private NonExistAIVideoSummaryJobIds nonExistAIVideoSummaryJobIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAIVideoSummaryJobResponseBody(Builder builder) {
        this.AIVideoSummaryJobList = builder.AIVideoSummaryJobList;
        this.nonExistAIVideoSummaryJobIds = builder.nonExistAIVideoSummaryJobIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAIVideoSummaryJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AIVideoSummaryJobList
     */
    public AIVideoSummaryJobList getAIVideoSummaryJobList() {
        return this.AIVideoSummaryJobList;
    }

    /**
     * @return nonExistAIVideoSummaryJobIds
     */
    public NonExistAIVideoSummaryJobIds getNonExistAIVideoSummaryJobIds() {
        return this.nonExistAIVideoSummaryJobIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AIVideoSummaryJobList AIVideoSummaryJobList; 
        private NonExistAIVideoSummaryJobIds nonExistAIVideoSummaryJobIds; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListAIVideoSummaryJobResponseBody model) {
            this.AIVideoSummaryJobList = model.AIVideoSummaryJobList;
            this.nonExistAIVideoSummaryJobIds = model.nonExistAIVideoSummaryJobIds;
            this.requestId = model.requestId;
        } 

        /**
         * AIVideoSummaryJobList.
         */
        public Builder AIVideoSummaryJobList(AIVideoSummaryJobList AIVideoSummaryJobList) {
            this.AIVideoSummaryJobList = AIVideoSummaryJobList;
            return this;
        }

        /**
         * NonExistAIVideoSummaryJobIds.
         */
        public Builder nonExistAIVideoSummaryJobIds(NonExistAIVideoSummaryJobIds nonExistAIVideoSummaryJobIds) {
            this.nonExistAIVideoSummaryJobIds = nonExistAIVideoSummaryJobIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAIVideoSummaryJobResponseBody build() {
            return new ListAIVideoSummaryJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAIVideoSummaryJobResponseBody} extends {@link TeaModel}
     *
     * <p>ListAIVideoSummaryJobResponseBody</p>
     */
    public static class AIVideoSummaryJob extends TeaModel {
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

        private AIVideoSummaryJob(Builder builder) {
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

        public static AIVideoSummaryJob create() {
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

            private Builder(AIVideoSummaryJob model) {
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

            public AIVideoSummaryJob build() {
                return new AIVideoSummaryJob(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAIVideoSummaryJobResponseBody} extends {@link TeaModel}
     *
     * <p>ListAIVideoSummaryJobResponseBody</p>
     */
    public static class AIVideoSummaryJobList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AIVideoSummaryJob")
        private java.util.List<AIVideoSummaryJob> AIVideoSummaryJob;

        private AIVideoSummaryJobList(Builder builder) {
            this.AIVideoSummaryJob = builder.AIVideoSummaryJob;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AIVideoSummaryJobList create() {
            return builder().build();
        }

        /**
         * @return AIVideoSummaryJob
         */
        public java.util.List<AIVideoSummaryJob> getAIVideoSummaryJob() {
            return this.AIVideoSummaryJob;
        }

        public static final class Builder {
            private java.util.List<AIVideoSummaryJob> AIVideoSummaryJob; 

            private Builder() {
            } 

            private Builder(AIVideoSummaryJobList model) {
                this.AIVideoSummaryJob = model.AIVideoSummaryJob;
            } 

            /**
             * AIVideoSummaryJob.
             */
            public Builder AIVideoSummaryJob(java.util.List<AIVideoSummaryJob> AIVideoSummaryJob) {
                this.AIVideoSummaryJob = AIVideoSummaryJob;
                return this;
            }

            public AIVideoSummaryJobList build() {
                return new AIVideoSummaryJobList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAIVideoSummaryJobResponseBody} extends {@link TeaModel}
     *
     * <p>ListAIVideoSummaryJobResponseBody</p>
     */
    public static class NonExistAIVideoSummaryJobIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("String")
        private java.util.List<String> string;

        private NonExistAIVideoSummaryJobIds(Builder builder) {
            this.string = builder.string;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NonExistAIVideoSummaryJobIds create() {
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

            private Builder(NonExistAIVideoSummaryJobIds model) {
                this.string = model.string;
            } 

            /**
             * String.
             */
            public Builder string(java.util.List<String> string) {
                this.string = string;
                return this;
            }

            public NonExistAIVideoSummaryJobIds build() {
                return new NonExistAIVideoSummaryJobIds(this);
            } 

        } 

    }
}
