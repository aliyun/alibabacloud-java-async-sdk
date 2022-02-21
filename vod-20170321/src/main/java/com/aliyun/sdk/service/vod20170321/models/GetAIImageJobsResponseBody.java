// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAIImageJobsResponseBody} extends {@link TeaModel}
 *
 * <p>GetAIImageJobsResponseBody</p>
 */
public class GetAIImageJobsResponseBody extends TeaModel {
    @NameInMap("AIImageJobList")
    private java.util.List < AIImageJobList> AIImageJobList;

    @NameInMap("RequestId")
    private String requestId;

    private GetAIImageJobsResponseBody(Builder builder) {
        this.AIImageJobList = builder.AIImageJobList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAIImageJobsResponseBody create() {
        return builder().build();
    }

    /**
     * @return AIImageJobList
     */
    public java.util.List < AIImageJobList> getAIImageJobList() {
        return this.AIImageJobList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < AIImageJobList> AIImageJobList; 
        private String requestId; 

        /**
         * AIImageJobList.
         */
        public Builder AIImageJobList(java.util.List < AIImageJobList> AIImageJobList) {
            this.AIImageJobList = AIImageJobList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAIImageJobsResponseBody build() {
            return new GetAIImageJobsResponseBody(this);
        } 

    } 

    public static class AIImageJobList extends TeaModel {
        @NameInMap("AIImageResult")
        private String AIImageResult;

        @NameInMap("Code")
        private String code;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("Message")
        private String message;

        @NameInMap("Status")
        private String status;

        @NameInMap("TemplateConfig")
        private String templateConfig;

        @NameInMap("TemplateId")
        private String templateId;

        @NameInMap("UserData")
        private String userData;

        @NameInMap("VideoId")
        private String videoId;

        private AIImageJobList(Builder builder) {
            this.AIImageResult = builder.AIImageResult;
            this.code = builder.code;
            this.creationTime = builder.creationTime;
            this.jobId = builder.jobId;
            this.message = builder.message;
            this.status = builder.status;
            this.templateConfig = builder.templateConfig;
            this.templateId = builder.templateId;
            this.userData = builder.userData;
            this.videoId = builder.videoId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AIImageJobList create() {
            return builder().build();
        }

        /**
         * @return AIImageResult
         */
        public String getAIImageResult() {
            return this.AIImageResult;
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
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
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

        /**
         * @return templateConfig
         */
        public String getTemplateConfig() {
            return this.templateConfig;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        /**
         * @return videoId
         */
        public String getVideoId() {
            return this.videoId;
        }

        public static final class Builder {
            private String AIImageResult; 
            private String code; 
            private String creationTime; 
            private String jobId; 
            private String message; 
            private String status; 
            private String templateConfig; 
            private String templateId; 
            private String userData; 
            private String videoId; 

            /**
             * AIImageResult.
             */
            public Builder AIImageResult(String AIImageResult) {
                this.AIImageResult = AIImageResult;
                return this;
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
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
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

            /**
             * TemplateConfig.
             */
            public Builder templateConfig(String templateConfig) {
                this.templateConfig = templateConfig;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * UserData.
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            /**
             * VideoId.
             */
            public Builder videoId(String videoId) {
                this.videoId = videoId;
                return this;
            }

            public AIImageJobList build() {
                return new AIImageJobList(this);
            } 

        } 

    }
}
