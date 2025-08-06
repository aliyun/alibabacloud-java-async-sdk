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
 * {@link GetAICaptionExtractionJobsResponseBody} extends {@link TeaModel}
 *
 * <p>GetAICaptionExtractionJobsResponseBody</p>
 */
public class GetAICaptionExtractionJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AICaptionExtractionJobList")
    private java.util.List<AICaptionExtractionJobList> AICaptionExtractionJobList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAICaptionExtractionJobsResponseBody(Builder builder) {
        this.AICaptionExtractionJobList = builder.AICaptionExtractionJobList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAICaptionExtractionJobsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AICaptionExtractionJobList
     */
    public java.util.List<AICaptionExtractionJobList> getAICaptionExtractionJobList() {
        return this.AICaptionExtractionJobList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<AICaptionExtractionJobList> AICaptionExtractionJobList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAICaptionExtractionJobsResponseBody model) {
            this.AICaptionExtractionJobList = model.AICaptionExtractionJobList;
            this.requestId = model.requestId;
        } 

        /**
         * AICaptionExtractionJobList.
         */
        public Builder AICaptionExtractionJobList(java.util.List<AICaptionExtractionJobList> AICaptionExtractionJobList) {
            this.AICaptionExtractionJobList = AICaptionExtractionJobList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAICaptionExtractionJobsResponseBody build() {
            return new GetAICaptionExtractionJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAICaptionExtractionJobsResponseBody} extends {@link TeaModel}
     *
     * <p>GetAICaptionExtractionJobsResponseBody</p>
     */
    public static class AICaptionExtractionJobList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AICaptionExtractionResult")
        private String AICaptionExtractionResult;

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

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        @com.aliyun.core.annotation.NameInMap("VideoId")
        private String videoId;

        private AICaptionExtractionJobList(Builder builder) {
            this.AICaptionExtractionResult = builder.AICaptionExtractionResult;
            this.code = builder.code;
            this.creationTime = builder.creationTime;
            this.jobId = builder.jobId;
            this.message = builder.message;
            this.status = builder.status;
            this.templateConfig = builder.templateConfig;
            this.userData = builder.userData;
            this.videoId = builder.videoId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AICaptionExtractionJobList create() {
            return builder().build();
        }

        /**
         * @return AICaptionExtractionResult
         */
        public String getAICaptionExtractionResult() {
            return this.AICaptionExtractionResult;
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
            private String AICaptionExtractionResult; 
            private String code; 
            private String creationTime; 
            private String jobId; 
            private String message; 
            private String status; 
            private String templateConfig; 
            private String userData; 
            private String videoId; 

            private Builder() {
            } 

            private Builder(AICaptionExtractionJobList model) {
                this.AICaptionExtractionResult = model.AICaptionExtractionResult;
                this.code = model.code;
                this.creationTime = model.creationTime;
                this.jobId = model.jobId;
                this.message = model.message;
                this.status = model.status;
                this.templateConfig = model.templateConfig;
                this.userData = model.userData;
                this.videoId = model.videoId;
            } 

            /**
             * AICaptionExtractionResult.
             */
            public Builder AICaptionExtractionResult(String AICaptionExtractionResult) {
                this.AICaptionExtractionResult = AICaptionExtractionResult;
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

            public AICaptionExtractionJobList build() {
                return new AICaptionExtractionJobList(this);
            } 

        } 

    }
}
