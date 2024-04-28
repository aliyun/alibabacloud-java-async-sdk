// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMediaProducingJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMediaProducingJobsResponseBody</p>
 */
public class ListMediaProducingJobsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private String maxResults;

    @NameInMap("MediaProducingJobList")
    private java.util.List < MediaProducingJobList> mediaProducingJobList;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    private ListMediaProducingJobsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.mediaProducingJobList = builder.mediaProducingJobList;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMediaProducingJobsResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public String getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return mediaProducingJobList
     */
    public java.util.List < MediaProducingJobList> getMediaProducingJobList() {
        return this.mediaProducingJobList;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String maxResults; 
        private java.util.List < MediaProducingJobList> mediaProducingJobList; 
        private String nextToken; 
        private String requestId; 

        /**
         * MaxResults.
         */
        public Builder maxResults(String maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * MediaProducingJobList.
         */
        public Builder mediaProducingJobList(java.util.List < MediaProducingJobList> mediaProducingJobList) {
            this.mediaProducingJobList = mediaProducingJobList;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListMediaProducingJobsResponseBody build() {
            return new ListMediaProducingJobsResponseBody(this);
        } 

    } 

    public static class MediaProducingJobList extends TeaModel {
        @NameInMap("ClipsParam")
        private String clipsParam;

        @NameInMap("Code")
        private String code;

        @NameInMap("CompleteTime")
        private String completeTime;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Duration")
        private Float duration;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("MediaId")
        private String mediaId;

        @NameInMap("MediaURL")
        private String mediaURL;

        @NameInMap("Message")
        private String message;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("ProjectId")
        private String projectId;

        @NameInMap("Status")
        private String status;

        @NameInMap("TemplateId")
        private String templateId;

        @NameInMap("UserData")
        private String userData;

        private MediaProducingJobList(Builder builder) {
            this.clipsParam = builder.clipsParam;
            this.code = builder.code;
            this.completeTime = builder.completeTime;
            this.createTime = builder.createTime;
            this.duration = builder.duration;
            this.jobId = builder.jobId;
            this.mediaId = builder.mediaId;
            this.mediaURL = builder.mediaURL;
            this.message = builder.message;
            this.modifiedTime = builder.modifiedTime;
            this.projectId = builder.projectId;
            this.status = builder.status;
            this.templateId = builder.templateId;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaProducingJobList create() {
            return builder().build();
        }

        /**
         * @return clipsParam
         */
        public String getClipsParam() {
            return this.clipsParam;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return completeTime
         */
        public String getCompleteTime() {
            return this.completeTime;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return duration
         */
        public Float getDuration() {
            return this.duration;
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
         * @return mediaURL
         */
        public String getMediaURL() {
            return this.mediaURL;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
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

        public static final class Builder {
            private String clipsParam; 
            private String code; 
            private String completeTime; 
            private String createTime; 
            private Float duration; 
            private String jobId; 
            private String mediaId; 
            private String mediaURL; 
            private String message; 
            private String modifiedTime; 
            private String projectId; 
            private String status; 
            private String templateId; 
            private String userData; 

            /**
             * ClipsParam.
             */
            public Builder clipsParam(String clipsParam) {
                this.clipsParam = clipsParam;
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
             * CompleteTime.
             */
            public Builder completeTime(String completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Float duration) {
                this.duration = duration;
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
             * MediaURL.
             */
            public Builder mediaURL(String mediaURL) {
                this.mediaURL = mediaURL;
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
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
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

            public MediaProducingJobList build() {
                return new MediaProducingJobList(this);
            } 

        } 

    }
}
