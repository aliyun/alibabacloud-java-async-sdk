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
 * {@link ListAIVideoCategoryJobResponseBody} extends {@link TeaModel}
 *
 * <p>ListAIVideoCategoryJobResponseBody</p>
 */
public class ListAIVideoCategoryJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AIVideoCategoryJobList")
    private AIVideoCategoryJobList AIVideoCategoryJobList;

    @com.aliyun.core.annotation.NameInMap("NonExistAIVideoCategoryJobIds")
    private NonExistAIVideoCategoryJobIds nonExistAIVideoCategoryJobIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAIVideoCategoryJobResponseBody(Builder builder) {
        this.AIVideoCategoryJobList = builder.AIVideoCategoryJobList;
        this.nonExistAIVideoCategoryJobIds = builder.nonExistAIVideoCategoryJobIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAIVideoCategoryJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AIVideoCategoryJobList
     */
    public AIVideoCategoryJobList getAIVideoCategoryJobList() {
        return this.AIVideoCategoryJobList;
    }

    /**
     * @return nonExistAIVideoCategoryJobIds
     */
    public NonExistAIVideoCategoryJobIds getNonExistAIVideoCategoryJobIds() {
        return this.nonExistAIVideoCategoryJobIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AIVideoCategoryJobList AIVideoCategoryJobList; 
        private NonExistAIVideoCategoryJobIds nonExistAIVideoCategoryJobIds; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListAIVideoCategoryJobResponseBody model) {
            this.AIVideoCategoryJobList = model.AIVideoCategoryJobList;
            this.nonExistAIVideoCategoryJobIds = model.nonExistAIVideoCategoryJobIds;
            this.requestId = model.requestId;
        } 

        /**
         * AIVideoCategoryJobList.
         */
        public Builder AIVideoCategoryJobList(AIVideoCategoryJobList AIVideoCategoryJobList) {
            this.AIVideoCategoryJobList = AIVideoCategoryJobList;
            return this;
        }

        /**
         * NonExistAIVideoCategoryJobIds.
         */
        public Builder nonExistAIVideoCategoryJobIds(NonExistAIVideoCategoryJobIds nonExistAIVideoCategoryJobIds) {
            this.nonExistAIVideoCategoryJobIds = nonExistAIVideoCategoryJobIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAIVideoCategoryJobResponseBody build() {
            return new ListAIVideoCategoryJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAIVideoCategoryJobResponseBody} extends {@link TeaModel}
     *
     * <p>ListAIVideoCategoryJobResponseBody</p>
     */
    public static class AIVideoCategoryJob extends TeaModel {
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

        private AIVideoCategoryJob(Builder builder) {
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

        public static AIVideoCategoryJob create() {
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

            private Builder(AIVideoCategoryJob model) {
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

            public AIVideoCategoryJob build() {
                return new AIVideoCategoryJob(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAIVideoCategoryJobResponseBody} extends {@link TeaModel}
     *
     * <p>ListAIVideoCategoryJobResponseBody</p>
     */
    public static class AIVideoCategoryJobList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AIVideoCategoryJob")
        private java.util.List<AIVideoCategoryJob> AIVideoCategoryJob;

        private AIVideoCategoryJobList(Builder builder) {
            this.AIVideoCategoryJob = builder.AIVideoCategoryJob;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AIVideoCategoryJobList create() {
            return builder().build();
        }

        /**
         * @return AIVideoCategoryJob
         */
        public java.util.List<AIVideoCategoryJob> getAIVideoCategoryJob() {
            return this.AIVideoCategoryJob;
        }

        public static final class Builder {
            private java.util.List<AIVideoCategoryJob> AIVideoCategoryJob; 

            private Builder() {
            } 

            private Builder(AIVideoCategoryJobList model) {
                this.AIVideoCategoryJob = model.AIVideoCategoryJob;
            } 

            /**
             * AIVideoCategoryJob.
             */
            public Builder AIVideoCategoryJob(java.util.List<AIVideoCategoryJob> AIVideoCategoryJob) {
                this.AIVideoCategoryJob = AIVideoCategoryJob;
                return this;
            }

            public AIVideoCategoryJobList build() {
                return new AIVideoCategoryJobList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAIVideoCategoryJobResponseBody} extends {@link TeaModel}
     *
     * <p>ListAIVideoCategoryJobResponseBody</p>
     */
    public static class NonExistAIVideoCategoryJobIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("String")
        private java.util.List<String> string;

        private NonExistAIVideoCategoryJobIds(Builder builder) {
            this.string = builder.string;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NonExistAIVideoCategoryJobIds create() {
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

            private Builder(NonExistAIVideoCategoryJobIds model) {
                this.string = model.string;
            } 

            /**
             * String.
             */
            public Builder string(java.util.List<String> string) {
                this.string = string;
                return this;
            }

            public NonExistAIVideoCategoryJobIds build() {
                return new NonExistAIVideoCategoryJobIds(this);
            } 

        } 

    }
}
