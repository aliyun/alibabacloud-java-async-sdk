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
 * {@link ListAIVideoCensorJobResponseBody} extends {@link TeaModel}
 *
 * <p>ListAIVideoCensorJobResponseBody</p>
 */
public class ListAIVideoCensorJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AIVideoCensorJobList")
    private AIVideoCensorJobList AIVideoCensorJobList;

    @com.aliyun.core.annotation.NameInMap("NonExistAIVideoCensorJobIds")
    private NonExistAIVideoCensorJobIds nonExistAIVideoCensorJobIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAIVideoCensorJobResponseBody(Builder builder) {
        this.AIVideoCensorJobList = builder.AIVideoCensorJobList;
        this.nonExistAIVideoCensorJobIds = builder.nonExistAIVideoCensorJobIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAIVideoCensorJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AIVideoCensorJobList
     */
    public AIVideoCensorJobList getAIVideoCensorJobList() {
        return this.AIVideoCensorJobList;
    }

    /**
     * @return nonExistAIVideoCensorJobIds
     */
    public NonExistAIVideoCensorJobIds getNonExistAIVideoCensorJobIds() {
        return this.nonExistAIVideoCensorJobIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AIVideoCensorJobList AIVideoCensorJobList; 
        private NonExistAIVideoCensorJobIds nonExistAIVideoCensorJobIds; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListAIVideoCensorJobResponseBody model) {
            this.AIVideoCensorJobList = model.AIVideoCensorJobList;
            this.nonExistAIVideoCensorJobIds = model.nonExistAIVideoCensorJobIds;
            this.requestId = model.requestId;
        } 

        /**
         * AIVideoCensorJobList.
         */
        public Builder AIVideoCensorJobList(AIVideoCensorJobList AIVideoCensorJobList) {
            this.AIVideoCensorJobList = AIVideoCensorJobList;
            return this;
        }

        /**
         * NonExistAIVideoCensorJobIds.
         */
        public Builder nonExistAIVideoCensorJobIds(NonExistAIVideoCensorJobIds nonExistAIVideoCensorJobIds) {
            this.nonExistAIVideoCensorJobIds = nonExistAIVideoCensorJobIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAIVideoCensorJobResponseBody build() {
            return new ListAIVideoCensorJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAIVideoCensorJobResponseBody} extends {@link TeaModel}
     *
     * <p>ListAIVideoCensorJobResponseBody</p>
     */
    public static class AIVideoCensorJob extends TeaModel {
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

        private AIVideoCensorJob(Builder builder) {
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

        public static AIVideoCensorJob create() {
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

            private Builder(AIVideoCensorJob model) {
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

            public AIVideoCensorJob build() {
                return new AIVideoCensorJob(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAIVideoCensorJobResponseBody} extends {@link TeaModel}
     *
     * <p>ListAIVideoCensorJobResponseBody</p>
     */
    public static class AIVideoCensorJobList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AIVideoCensorJob")
        private java.util.List<AIVideoCensorJob> AIVideoCensorJob;

        private AIVideoCensorJobList(Builder builder) {
            this.AIVideoCensorJob = builder.AIVideoCensorJob;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AIVideoCensorJobList create() {
            return builder().build();
        }

        /**
         * @return AIVideoCensorJob
         */
        public java.util.List<AIVideoCensorJob> getAIVideoCensorJob() {
            return this.AIVideoCensorJob;
        }

        public static final class Builder {
            private java.util.List<AIVideoCensorJob> AIVideoCensorJob; 

            private Builder() {
            } 

            private Builder(AIVideoCensorJobList model) {
                this.AIVideoCensorJob = model.AIVideoCensorJob;
            } 

            /**
             * AIVideoCensorJob.
             */
            public Builder AIVideoCensorJob(java.util.List<AIVideoCensorJob> AIVideoCensorJob) {
                this.AIVideoCensorJob = AIVideoCensorJob;
                return this;
            }

            public AIVideoCensorJobList build() {
                return new AIVideoCensorJobList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAIVideoCensorJobResponseBody} extends {@link TeaModel}
     *
     * <p>ListAIVideoCensorJobResponseBody</p>
     */
    public static class NonExistAIVideoCensorJobIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("String")
        private java.util.List<String> string;

        private NonExistAIVideoCensorJobIds(Builder builder) {
            this.string = builder.string;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NonExistAIVideoCensorJobIds create() {
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

            private Builder(NonExistAIVideoCensorJobIds model) {
                this.string = model.string;
            } 

            /**
             * String.
             */
            public Builder string(java.util.List<String> string) {
                this.string = string;
                return this;
            }

            public NonExistAIVideoCensorJobIds build() {
                return new NonExistAIVideoCensorJobIds(this);
            } 

        } 

    }
}
