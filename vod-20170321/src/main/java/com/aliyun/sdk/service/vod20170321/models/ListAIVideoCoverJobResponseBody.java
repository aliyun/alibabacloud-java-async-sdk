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
 * {@link ListAIVideoCoverJobResponseBody} extends {@link TeaModel}
 *
 * <p>ListAIVideoCoverJobResponseBody</p>
 */
public class ListAIVideoCoverJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AIVideoCoverJobList")
    private AIVideoCoverJobList AIVideoCoverJobList;

    @com.aliyun.core.annotation.NameInMap("NonExistAIVideoCoverJobIds")
    private NonExistAIVideoCoverJobIds nonExistAIVideoCoverJobIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAIVideoCoverJobResponseBody(Builder builder) {
        this.AIVideoCoverJobList = builder.AIVideoCoverJobList;
        this.nonExistAIVideoCoverJobIds = builder.nonExistAIVideoCoverJobIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAIVideoCoverJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AIVideoCoverJobList
     */
    public AIVideoCoverJobList getAIVideoCoverJobList() {
        return this.AIVideoCoverJobList;
    }

    /**
     * @return nonExistAIVideoCoverJobIds
     */
    public NonExistAIVideoCoverJobIds getNonExistAIVideoCoverJobIds() {
        return this.nonExistAIVideoCoverJobIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AIVideoCoverJobList AIVideoCoverJobList; 
        private NonExistAIVideoCoverJobIds nonExistAIVideoCoverJobIds; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListAIVideoCoverJobResponseBody model) {
            this.AIVideoCoverJobList = model.AIVideoCoverJobList;
            this.nonExistAIVideoCoverJobIds = model.nonExistAIVideoCoverJobIds;
            this.requestId = model.requestId;
        } 

        /**
         * AIVideoCoverJobList.
         */
        public Builder AIVideoCoverJobList(AIVideoCoverJobList AIVideoCoverJobList) {
            this.AIVideoCoverJobList = AIVideoCoverJobList;
            return this;
        }

        /**
         * NonExistAIVideoCoverJobIds.
         */
        public Builder nonExistAIVideoCoverJobIds(NonExistAIVideoCoverJobIds nonExistAIVideoCoverJobIds) {
            this.nonExistAIVideoCoverJobIds = nonExistAIVideoCoverJobIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAIVideoCoverJobResponseBody build() {
            return new ListAIVideoCoverJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAIVideoCoverJobResponseBody} extends {@link TeaModel}
     *
     * <p>ListAIVideoCoverJobResponseBody</p>
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
    /**
     * 
     * {@link ListAIVideoCoverJobResponseBody} extends {@link TeaModel}
     *
     * <p>ListAIVideoCoverJobResponseBody</p>
     */
    public static class AIVideoCoverJobList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AIVideoCoverJob")
        private java.util.List<AIVideoCoverJob> AIVideoCoverJob;

        private AIVideoCoverJobList(Builder builder) {
            this.AIVideoCoverJob = builder.AIVideoCoverJob;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AIVideoCoverJobList create() {
            return builder().build();
        }

        /**
         * @return AIVideoCoverJob
         */
        public java.util.List<AIVideoCoverJob> getAIVideoCoverJob() {
            return this.AIVideoCoverJob;
        }

        public static final class Builder {
            private java.util.List<AIVideoCoverJob> AIVideoCoverJob; 

            private Builder() {
            } 

            private Builder(AIVideoCoverJobList model) {
                this.AIVideoCoverJob = model.AIVideoCoverJob;
            } 

            /**
             * AIVideoCoverJob.
             */
            public Builder AIVideoCoverJob(java.util.List<AIVideoCoverJob> AIVideoCoverJob) {
                this.AIVideoCoverJob = AIVideoCoverJob;
                return this;
            }

            public AIVideoCoverJobList build() {
                return new AIVideoCoverJobList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAIVideoCoverJobResponseBody} extends {@link TeaModel}
     *
     * <p>ListAIVideoCoverJobResponseBody</p>
     */
    public static class NonExistAIVideoCoverJobIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("String")
        private java.util.List<String> string;

        private NonExistAIVideoCoverJobIds(Builder builder) {
            this.string = builder.string;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NonExistAIVideoCoverJobIds create() {
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

            private Builder(NonExistAIVideoCoverJobIds model) {
                this.string = model.string;
            } 

            /**
             * String.
             */
            public Builder string(java.util.List<String> string) {
                this.string = string;
                return this;
            }

            public NonExistAIVideoCoverJobIds build() {
                return new NonExistAIVideoCoverJobIds(this);
            } 

        } 

    }
}
