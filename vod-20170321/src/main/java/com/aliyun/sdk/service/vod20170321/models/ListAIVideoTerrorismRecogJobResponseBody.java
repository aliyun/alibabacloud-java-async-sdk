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
 * {@link ListAIVideoTerrorismRecogJobResponseBody} extends {@link TeaModel}
 *
 * <p>ListAIVideoTerrorismRecogJobResponseBody</p>
 */
public class ListAIVideoTerrorismRecogJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AIVideoTerrorismRecogJobList")
    private AIVideoTerrorismRecogJobList AIVideoTerrorismRecogJobList;

    @com.aliyun.core.annotation.NameInMap("NonExistTerrorismRecogJobIds")
    private NonExistTerrorismRecogJobIds nonExistTerrorismRecogJobIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAIVideoTerrorismRecogJobResponseBody(Builder builder) {
        this.AIVideoTerrorismRecogJobList = builder.AIVideoTerrorismRecogJobList;
        this.nonExistTerrorismRecogJobIds = builder.nonExistTerrorismRecogJobIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAIVideoTerrorismRecogJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AIVideoTerrorismRecogJobList
     */
    public AIVideoTerrorismRecogJobList getAIVideoTerrorismRecogJobList() {
        return this.AIVideoTerrorismRecogJobList;
    }

    /**
     * @return nonExistTerrorismRecogJobIds
     */
    public NonExistTerrorismRecogJobIds getNonExistTerrorismRecogJobIds() {
        return this.nonExistTerrorismRecogJobIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AIVideoTerrorismRecogJobList AIVideoTerrorismRecogJobList; 
        private NonExistTerrorismRecogJobIds nonExistTerrorismRecogJobIds; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListAIVideoTerrorismRecogJobResponseBody model) {
            this.AIVideoTerrorismRecogJobList = model.AIVideoTerrorismRecogJobList;
            this.nonExistTerrorismRecogJobIds = model.nonExistTerrorismRecogJobIds;
            this.requestId = model.requestId;
        } 

        /**
         * AIVideoTerrorismRecogJobList.
         */
        public Builder AIVideoTerrorismRecogJobList(AIVideoTerrorismRecogJobList AIVideoTerrorismRecogJobList) {
            this.AIVideoTerrorismRecogJobList = AIVideoTerrorismRecogJobList;
            return this;
        }

        /**
         * NonExistTerrorismRecogJobIds.
         */
        public Builder nonExistTerrorismRecogJobIds(NonExistTerrorismRecogJobIds nonExistTerrorismRecogJobIds) {
            this.nonExistTerrorismRecogJobIds = nonExistTerrorismRecogJobIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAIVideoTerrorismRecogJobResponseBody build() {
            return new ListAIVideoTerrorismRecogJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAIVideoTerrorismRecogJobResponseBody} extends {@link TeaModel}
     *
     * <p>ListAIVideoTerrorismRecogJobResponseBody</p>
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
    /**
     * 
     * {@link ListAIVideoTerrorismRecogJobResponseBody} extends {@link TeaModel}
     *
     * <p>ListAIVideoTerrorismRecogJobResponseBody</p>
     */
    public static class AIVideoTerrorismRecogJobList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AIVideoTerrorismRecogJob")
        private java.util.List<AIVideoTerrorismRecogJob> AIVideoTerrorismRecogJob;

        private AIVideoTerrorismRecogJobList(Builder builder) {
            this.AIVideoTerrorismRecogJob = builder.AIVideoTerrorismRecogJob;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AIVideoTerrorismRecogJobList create() {
            return builder().build();
        }

        /**
         * @return AIVideoTerrorismRecogJob
         */
        public java.util.List<AIVideoTerrorismRecogJob> getAIVideoTerrorismRecogJob() {
            return this.AIVideoTerrorismRecogJob;
        }

        public static final class Builder {
            private java.util.List<AIVideoTerrorismRecogJob> AIVideoTerrorismRecogJob; 

            private Builder() {
            } 

            private Builder(AIVideoTerrorismRecogJobList model) {
                this.AIVideoTerrorismRecogJob = model.AIVideoTerrorismRecogJob;
            } 

            /**
             * AIVideoTerrorismRecogJob.
             */
            public Builder AIVideoTerrorismRecogJob(java.util.List<AIVideoTerrorismRecogJob> AIVideoTerrorismRecogJob) {
                this.AIVideoTerrorismRecogJob = AIVideoTerrorismRecogJob;
                return this;
            }

            public AIVideoTerrorismRecogJobList build() {
                return new AIVideoTerrorismRecogJobList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAIVideoTerrorismRecogJobResponseBody} extends {@link TeaModel}
     *
     * <p>ListAIVideoTerrorismRecogJobResponseBody</p>
     */
    public static class NonExistTerrorismRecogJobIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("String")
        private java.util.List<String> string;

        private NonExistTerrorismRecogJobIds(Builder builder) {
            this.string = builder.string;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NonExistTerrorismRecogJobIds create() {
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

            private Builder(NonExistTerrorismRecogJobIds model) {
                this.string = model.string;
            } 

            /**
             * String.
             */
            public Builder string(java.util.List<String> string) {
                this.string = string;
                return this;
            }

            public NonExistTerrorismRecogJobIds build() {
                return new NonExistTerrorismRecogJobIds(this);
            } 

        } 

    }
}
