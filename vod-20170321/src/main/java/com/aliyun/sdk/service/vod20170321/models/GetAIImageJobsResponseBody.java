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
         * The image AI processing jobs.
         */
        public Builder AIImageJobList(java.util.List < AIImageJobList> AIImageJobList) {
            this.AIImageJobList = AIImageJobList;
            return this;
        }

        /**
         * The ID of the request.
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
             * The Object Storage Service (OSS) URL of the image file.
             * <p>
             * 
             * > This parameter does not include the complete authentication information. To obtain the authentication information, you must generate a signed URL. Alternatively, you can call the [ListAIImage](~~ListAIImage~~) operation to obtain the image information.
             */
            public Builder AIImageResult(String AIImageResult) {
                this.AIImageResult = AIImageResult;
                return this;
            }

            /**
             * The error code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The time when the image AI processing job was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The ID of the image AI processing job.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * The error message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The status of the job. Valid values:
             * <p>
             * 
             * *   **success**
             * *   **fail**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The configurations of the AI template that was used to submit the job.
             */
            public Builder templateConfig(String templateConfig) {
                this.templateConfig = templateConfig;
                return this;
            }

            /**
             * The ID of the AI template.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * The user data.
             * <p>
             * 
             * *   The value must be a JSON string.
             * *   The MessageCallback or Extend parameter is returned.
             * *   The value contains a maximum of 512 bytes.
             * 
             * For more information, see the "UserData: specifies the custom configurations for media upload" section of the [Request parameters](~~86952~~) topic.
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            /**
             * The ID of the video.
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
