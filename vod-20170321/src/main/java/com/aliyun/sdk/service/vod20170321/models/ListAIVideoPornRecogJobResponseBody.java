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
 * {@link ListAIVideoPornRecogJobResponseBody} extends {@link TeaModel}
 *
 * <p>ListAIVideoPornRecogJobResponseBody</p>
 */
public class ListAIVideoPornRecogJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AIVideoPornRecogJobList")
    private AIVideoPornRecogJobList AIVideoPornRecogJobList;

    @com.aliyun.core.annotation.NameInMap("NonExistPornRecogJobIds")
    private NonExistPornRecogJobIds nonExistPornRecogJobIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAIVideoPornRecogJobResponseBody(Builder builder) {
        this.AIVideoPornRecogJobList = builder.AIVideoPornRecogJobList;
        this.nonExistPornRecogJobIds = builder.nonExistPornRecogJobIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAIVideoPornRecogJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AIVideoPornRecogJobList
     */
    public AIVideoPornRecogJobList getAIVideoPornRecogJobList() {
        return this.AIVideoPornRecogJobList;
    }

    /**
     * @return nonExistPornRecogJobIds
     */
    public NonExistPornRecogJobIds getNonExistPornRecogJobIds() {
        return this.nonExistPornRecogJobIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AIVideoPornRecogJobList AIVideoPornRecogJobList; 
        private NonExistPornRecogJobIds nonExistPornRecogJobIds; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListAIVideoPornRecogJobResponseBody model) {
            this.AIVideoPornRecogJobList = model.AIVideoPornRecogJobList;
            this.nonExistPornRecogJobIds = model.nonExistPornRecogJobIds;
            this.requestId = model.requestId;
        } 

        /**
         * AIVideoPornRecogJobList.
         */
        public Builder AIVideoPornRecogJobList(AIVideoPornRecogJobList AIVideoPornRecogJobList) {
            this.AIVideoPornRecogJobList = AIVideoPornRecogJobList;
            return this;
        }

        /**
         * NonExistPornRecogJobIds.
         */
        public Builder nonExistPornRecogJobIds(NonExistPornRecogJobIds nonExistPornRecogJobIds) {
            this.nonExistPornRecogJobIds = nonExistPornRecogJobIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAIVideoPornRecogJobResponseBody build() {
            return new ListAIVideoPornRecogJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAIVideoPornRecogJobResponseBody} extends {@link TeaModel}
     *
     * <p>ListAIVideoPornRecogJobResponseBody</p>
     */
    public static class AIVideoPornRecogJob extends TeaModel {
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

        private AIVideoPornRecogJob(Builder builder) {
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

        public static AIVideoPornRecogJob create() {
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

            private Builder(AIVideoPornRecogJob model) {
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

            public AIVideoPornRecogJob build() {
                return new AIVideoPornRecogJob(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAIVideoPornRecogJobResponseBody} extends {@link TeaModel}
     *
     * <p>ListAIVideoPornRecogJobResponseBody</p>
     */
    public static class AIVideoPornRecogJobList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AIVideoPornRecogJob")
        private java.util.List<AIVideoPornRecogJob> AIVideoPornRecogJob;

        private AIVideoPornRecogJobList(Builder builder) {
            this.AIVideoPornRecogJob = builder.AIVideoPornRecogJob;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AIVideoPornRecogJobList create() {
            return builder().build();
        }

        /**
         * @return AIVideoPornRecogJob
         */
        public java.util.List<AIVideoPornRecogJob> getAIVideoPornRecogJob() {
            return this.AIVideoPornRecogJob;
        }

        public static final class Builder {
            private java.util.List<AIVideoPornRecogJob> AIVideoPornRecogJob; 

            private Builder() {
            } 

            private Builder(AIVideoPornRecogJobList model) {
                this.AIVideoPornRecogJob = model.AIVideoPornRecogJob;
            } 

            /**
             * AIVideoPornRecogJob.
             */
            public Builder AIVideoPornRecogJob(java.util.List<AIVideoPornRecogJob> AIVideoPornRecogJob) {
                this.AIVideoPornRecogJob = AIVideoPornRecogJob;
                return this;
            }

            public AIVideoPornRecogJobList build() {
                return new AIVideoPornRecogJobList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAIVideoPornRecogJobResponseBody} extends {@link TeaModel}
     *
     * <p>ListAIVideoPornRecogJobResponseBody</p>
     */
    public static class NonExistPornRecogJobIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("String")
        private java.util.List<String> string;

        private NonExistPornRecogJobIds(Builder builder) {
            this.string = builder.string;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NonExistPornRecogJobIds create() {
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

            private Builder(NonExistPornRecogJobIds model) {
                this.string = model.string;
            } 

            /**
             * String.
             */
            public Builder string(java.util.List<String> string) {
                this.string = string;
                return this;
            }

            public NonExistPornRecogJobIds build() {
                return new NonExistPornRecogJobIds(this);
            } 

        } 

    }
}
