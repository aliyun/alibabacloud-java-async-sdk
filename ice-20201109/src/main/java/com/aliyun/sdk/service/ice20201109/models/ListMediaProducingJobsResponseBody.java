// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link ListMediaProducingJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMediaProducingJobsResponseBody</p>
 */
public class ListMediaProducingJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private String maxResults;

    @com.aliyun.core.annotation.NameInMap("MediaProducingJobList")
    private java.util.List<MediaProducingJobList> mediaProducingJobList;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<MediaProducingJobList> getMediaProducingJobList() {
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
        private java.util.List<MediaProducingJobList> mediaProducingJobList; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListMediaProducingJobsResponseBody model) {
            this.maxResults = model.maxResults;
            this.mediaProducingJobList = model.mediaProducingJobList;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The maximum number of entries returned.</p>
         * <p>Default value: 10. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxResults(String maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The queried media editing and production jobs.</p>
         */
        public Builder mediaProducingJobList(java.util.List<MediaProducingJobList> mediaProducingJobList) {
            this.mediaProducingJobList = mediaProducingJobList;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>8EqYpQbZ6Eh7+Zz8DxVYoQ==</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListMediaProducingJobsResponseBody build() {
            return new ListMediaProducingJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMediaProducingJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMediaProducingJobsResponseBody</p>
     */
    public static class MediaProducingJobList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClipsParam")
        private String clipsParam;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("CompleteTime")
        private String completeTime;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Float duration;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("MediaURL")
        private String mediaURL;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("UserData")
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

            private Builder() {
            } 

            private Builder(MediaProducingJobList model) {
                this.clipsParam = model.clipsParam;
                this.code = model.code;
                this.completeTime = model.completeTime;
                this.createTime = model.createTime;
                this.duration = model.duration;
                this.jobId = model.jobId;
                this.mediaId = model.mediaId;
                this.mediaURL = model.mediaURL;
                this.message = model.message;
                this.modifiedTime = model.modifiedTime;
                this.projectId = model.projectId;
                this.status = model.status;
                this.templateId = model.templateId;
                this.userData = model.userData;
            } 

            /**
             * <p>The template material parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Text1&quot;:&quot;text&quot;,&quot;Text0&quot;:&quot;text&quot;,&quot;Media1&quot;:&quot;mediaId&quot;,&quot;Media0&quot;:&quot;mediaId&quot;}</p>
             */
            public Builder clipsParam(String clipsParam) {
                this.clipsParam = clipsParam;
                return this;
            }

            /**
             * <p>The response code.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The time when the job was complete. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-21T16:40:30Z</p>
             */
            public Builder completeTime(String completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * <p>The time when the job was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-21T16:40:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The duration of the output file. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>15.5</p>
             */
            public Builder duration(Float duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The ID of the online editing job.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong><strong>8750b54e3c976a47da6f</strong></strong></strong></p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The media asset ID of the output file.</p>
             * 
             * <strong>example:</strong>
             * <p>0ce4ea70f52471edab61f7e7d6786302</p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * <p>The URL of the output file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://your-bucket.oss-cn-shanghai.aliyuncs.com/your-video.mp4">http://your-bucket.oss-cn-shanghai.aliyuncs.com/your-video.mp4</a></p>
             */
            public Builder mediaURL(String mediaURL) {
                this.mediaURL = mediaURL;
                return this;
            }

            /**
             * <p>The returned message. Note: Pay attention to this parameter if the job failed.</p>
             * 
             * <strong>example:</strong>
             * <p>The resource operated InputFile is bad</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The time when the job was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-21T16:41:00Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The ID of the online editing project.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong><strong>faa3b542f5a6135217e3</strong></strong></strong></p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The job state.</p>
             * 
             * <strong>example:</strong>
             * <p>Sucess</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the online editing template.</p>
             * 
             * <strong>example:</strong>
             * <p>cb786a39c5d44cecb23d8c864facffc1</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The user-defined data in the JSON format.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;key&quot;:&quot;value&quot;}</p>
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
