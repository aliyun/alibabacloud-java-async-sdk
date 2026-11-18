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
 * {@link GetAIImageJobsResponseBody} extends {@link TeaModel}
 *
 * <p>GetAIImageJobsResponseBody</p>
 */
public class GetAIImageJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AIImageJobList")
    private java.util.List<AIImageJobList> AIImageJobList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AIImageJobList
     */
    public java.util.List<AIImageJobList> getAIImageJobList() {
        return this.AIImageJobList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<AIImageJobList> AIImageJobList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAIImageJobsResponseBody model) {
            this.AIImageJobList = model.AIImageJobList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of AI image processing tasks.</p>
         */
        public Builder AIImageJobList(java.util.List<AIImageJobList> AIImageJobList) {
            this.AIImageJobList = AIImageJobList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7721B494-1F78-4E*****E8-A7CEE7315BFA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAIImageJobsResponseBody build() {
            return new GetAIImageJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAIImageJobsResponseBody} extends {@link TeaModel}
     *
     * <p>GetAIImageJobsResponseBody</p>
     */
    public static class AIImageJobList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AIImageResult")
        private String AIImageResult;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TemplateConfig")
        private String templateConfig;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        @com.aliyun.core.annotation.NameInMap("VideoId")
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

            private Builder() {
            } 

            private Builder(AIImageJobList model) {
                this.AIImageResult = model.AIImageResult;
                this.code = model.code;
                this.creationTime = model.creationTime;
                this.jobId = model.jobId;
                this.message = model.message;
                this.status = model.status;
                this.templateConfig = model.templateConfig;
                this.templateId = model.templateId;
                this.userData = model.userData;
                this.videoId = model.videoId;
            } 

            /**
             * <p>The OSS URL of the AI image.</p>
             * <blockquote>
             * <p>This URL is returned as the task result and does not provide complete authentication information. To obtain authentication information, generate it or call the <a href="https://help.aliyun.com/document_detail/186924.html">ListAIImage</a> operation to retrieve the media asset result.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;Score&quot;:5.035636554444242,&quot;Url&quot;:&quot;<a href="http://outin-*****.oss-cn-shanghai.aliyuncs.com/357a8748c577*****789d2726e6436aa/image/ai/b0a7612554d*****5cbe3-00001.gif%22%7D%5D">http://outin-*****.oss-cn-shanghai.aliyuncs.com/357a8748c577*****789d2726e6436aa/image/ai/b0a7612554d*****5cbe3-00001.gif&quot;}]</a></p>
             */
            public Builder AIImageResult(String AIImageResult) {
                this.AIImageResult = AIImageResult;
                return this;
            }

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The creation time of the AI image processing task. The time is in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2020-10-15T03:30:03Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The ID of the AI image processing task.</p>
             * 
             * <strong>example:</strong>
             * <p>cf08a2c6e11e*****de1711b738b9067</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The task status. Valid values:</p>
             * <ul>
             * <li><strong>success</strong>: The task succeeded.</li>
             * <li><strong>fail</strong>: The task failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The snapshot of the configuration of the specified template when the task was submitted.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Format&quot;:&quot;gif&quot;,&quot;SetDefaultCover&quot;:&quot;true&quot;}</p>
             */
            public Builder templateConfig(String templateConfig) {
                this.templateConfig = templateConfig;
                return this;
            }

            /**
             * <p>The ID of the AI template.</p>
             * 
             * <strong>example:</strong>
             * <p>5a86a00f15194*****d7fe7de1b4a173</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The custom settings.</p>
             * <ul>
             * <li>The value must be a JSON string.</li>
             * <li>The value must contain the MessageCallback or Extend parameter.</li>
             * <li>The maximum length is 512 bytes.</li>
             * </ul>
             * <p>For more information about how to construct the parameter, see <a href="https://help.aliyun.com/document_detail/86952.html">UserData</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Extend&quot;:{&quot;localId&quot;:&quot;****&quot;,&quot;test&quot;:&quot;www&quot;}}</p>
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            /**
             * <p>The video ID.</p>
             * 
             * <strong>example:</strong>
             * <p>357a8748c577*****789d2726e6436aa</p>
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
