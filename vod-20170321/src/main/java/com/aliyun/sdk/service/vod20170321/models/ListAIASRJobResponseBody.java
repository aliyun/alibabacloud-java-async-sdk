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
 * {@link ListAIASRJobResponseBody} extends {@link TeaModel}
 *
 * <p>ListAIASRJobResponseBody</p>
 */
public class ListAIASRJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AIASRJobList")
    private AIASRJobList AIASRJobList;

    @com.aliyun.core.annotation.NameInMap("NonExistAIASRJobIds")
    private NonExistAIASRJobIds nonExistAIASRJobIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAIASRJobResponseBody(Builder builder) {
        this.AIASRJobList = builder.AIASRJobList;
        this.nonExistAIASRJobIds = builder.nonExistAIASRJobIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAIASRJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AIASRJobList
     */
    public AIASRJobList getAIASRJobList() {
        return this.AIASRJobList;
    }

    /**
     * @return nonExistAIASRJobIds
     */
    public NonExistAIASRJobIds getNonExistAIASRJobIds() {
        return this.nonExistAIASRJobIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AIASRJobList AIASRJobList; 
        private NonExistAIASRJobIds nonExistAIASRJobIds; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListAIASRJobResponseBody model) {
            this.AIASRJobList = model.AIASRJobList;
            this.nonExistAIASRJobIds = model.nonExistAIASRJobIds;
            this.requestId = model.requestId;
        } 

        /**
         * AIASRJobList.
         */
        public Builder AIASRJobList(AIASRJobList AIASRJobList) {
            this.AIASRJobList = AIASRJobList;
            return this;
        }

        /**
         * NonExistAIASRJobIds.
         */
        public Builder nonExistAIASRJobIds(NonExistAIASRJobIds nonExistAIASRJobIds) {
            this.nonExistAIASRJobIds = nonExistAIASRJobIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAIASRJobResponseBody build() {
            return new ListAIASRJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAIASRJobResponseBody} extends {@link TeaModel}
     *
     * <p>ListAIASRJobResponseBody</p>
     */
    public static class AIASRJob extends TeaModel {
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

        private AIASRJob(Builder builder) {
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

        public static AIASRJob create() {
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

            private Builder(AIASRJob model) {
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

            public AIASRJob build() {
                return new AIASRJob(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAIASRJobResponseBody} extends {@link TeaModel}
     *
     * <p>ListAIASRJobResponseBody</p>
     */
    public static class AIASRJobList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AIASRJob")
        private java.util.List<AIASRJob> AIASRJob;

        private AIASRJobList(Builder builder) {
            this.AIASRJob = builder.AIASRJob;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AIASRJobList create() {
            return builder().build();
        }

        /**
         * @return AIASRJob
         */
        public java.util.List<AIASRJob> getAIASRJob() {
            return this.AIASRJob;
        }

        public static final class Builder {
            private java.util.List<AIASRJob> AIASRJob; 

            private Builder() {
            } 

            private Builder(AIASRJobList model) {
                this.AIASRJob = model.AIASRJob;
            } 

            /**
             * AIASRJob.
             */
            public Builder AIASRJob(java.util.List<AIASRJob> AIASRJob) {
                this.AIASRJob = AIASRJob;
                return this;
            }

            public AIASRJobList build() {
                return new AIASRJobList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAIASRJobResponseBody} extends {@link TeaModel}
     *
     * <p>ListAIASRJobResponseBody</p>
     */
    public static class NonExistAIASRJobIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("String")
        private java.util.List<String> string;

        private NonExistAIASRJobIds(Builder builder) {
            this.string = builder.string;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NonExistAIASRJobIds create() {
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

            private Builder(NonExistAIASRJobIds model) {
                this.string = model.string;
            } 

            /**
             * String.
             */
            public Builder string(java.util.List<String> string) {
                this.string = string;
                return this;
            }

            public NonExistAIASRJobIds build() {
                return new NonExistAIASRJobIds(this);
            } 

        } 

    }
}
