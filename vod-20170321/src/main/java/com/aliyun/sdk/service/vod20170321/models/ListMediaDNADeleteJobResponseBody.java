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
 * {@link ListMediaDNADeleteJobResponseBody} extends {@link TeaModel}
 *
 * <p>ListMediaDNADeleteJobResponseBody</p>
 */
public class ListMediaDNADeleteJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AIJobList")
    private AIJobList AIJobList;

    @com.aliyun.core.annotation.NameInMap("NonExistAIJobIds")
    private NonExistAIJobIds nonExistAIJobIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListMediaDNADeleteJobResponseBody(Builder builder) {
        this.AIJobList = builder.AIJobList;
        this.nonExistAIJobIds = builder.nonExistAIJobIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMediaDNADeleteJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AIJobList
     */
    public AIJobList getAIJobList() {
        return this.AIJobList;
    }

    /**
     * @return nonExistAIJobIds
     */
    public NonExistAIJobIds getNonExistAIJobIds() {
        return this.nonExistAIJobIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AIJobList AIJobList; 
        private NonExistAIJobIds nonExistAIJobIds; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListMediaDNADeleteJobResponseBody model) {
            this.AIJobList = model.AIJobList;
            this.nonExistAIJobIds = model.nonExistAIJobIds;
            this.requestId = model.requestId;
        } 

        /**
         * AIJobList.
         */
        public Builder AIJobList(AIJobList AIJobList) {
            this.AIJobList = AIJobList;
            return this;
        }

        /**
         * NonExistAIJobIds.
         */
        public Builder nonExistAIJobIds(NonExistAIJobIds nonExistAIJobIds) {
            this.nonExistAIJobIds = nonExistAIJobIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListMediaDNADeleteJobResponseBody build() {
            return new ListMediaDNADeleteJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMediaDNADeleteJobResponseBody} extends {@link TeaModel}
     *
     * <p>ListMediaDNADeleteJobResponseBody</p>
     */
    public static class AIJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("FpDBId")
        private String fpDBId;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private AIJob(Builder builder) {
            this.code = builder.code;
            this.fpDBId = builder.fpDBId;
            this.jobId = builder.jobId;
            this.mediaId = builder.mediaId;
            this.message = builder.message;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AIJob create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return fpDBId
         */
        public String getFpDBId() {
            return this.fpDBId;
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
            private String fpDBId; 
            private String jobId; 
            private String mediaId; 
            private String message; 
            private String status; 

            private Builder() {
            } 

            private Builder(AIJob model) {
                this.code = model.code;
                this.fpDBId = model.fpDBId;
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
             * FpDBId.
             */
            public Builder fpDBId(String fpDBId) {
                this.fpDBId = fpDBId;
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

            public AIJob build() {
                return new AIJob(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMediaDNADeleteJobResponseBody} extends {@link TeaModel}
     *
     * <p>ListMediaDNADeleteJobResponseBody</p>
     */
    public static class AIJobList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AIJob")
        private java.util.List<AIJob> AIJob;

        private AIJobList(Builder builder) {
            this.AIJob = builder.AIJob;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AIJobList create() {
            return builder().build();
        }

        /**
         * @return AIJob
         */
        public java.util.List<AIJob> getAIJob() {
            return this.AIJob;
        }

        public static final class Builder {
            private java.util.List<AIJob> AIJob; 

            private Builder() {
            } 

            private Builder(AIJobList model) {
                this.AIJob = model.AIJob;
            } 

            /**
             * AIJob.
             */
            public Builder AIJob(java.util.List<AIJob> AIJob) {
                this.AIJob = AIJob;
                return this;
            }

            public AIJobList build() {
                return new AIJobList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMediaDNADeleteJobResponseBody} extends {@link TeaModel}
     *
     * <p>ListMediaDNADeleteJobResponseBody</p>
     */
    public static class NonExistAIJobIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("String")
        private java.util.List<String> string;

        private NonExistAIJobIds(Builder builder) {
            this.string = builder.string;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NonExistAIJobIds create() {
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

            private Builder(NonExistAIJobIds model) {
                this.string = model.string;
            } 

            /**
             * String.
             */
            public Builder string(java.util.List<String> string) {
                this.string = string;
                return this;
            }

            public NonExistAIJobIds build() {
                return new NonExistAIJobIds(this);
            } 

        } 

    }
}
