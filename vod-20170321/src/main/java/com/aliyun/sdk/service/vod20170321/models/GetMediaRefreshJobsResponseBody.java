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
 * {@link GetMediaRefreshJobsResponseBody} extends {@link TeaModel}
 *
 * <p>GetMediaRefreshJobsResponseBody</p>
 */
public class GetMediaRefreshJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MediaRefreshJobs")
    private java.util.List<MediaRefreshJobs> mediaRefreshJobs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetMediaRefreshJobsResponseBody(Builder builder) {
        this.mediaRefreshJobs = builder.mediaRefreshJobs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMediaRefreshJobsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mediaRefreshJobs
     */
    public java.util.List<MediaRefreshJobs> getMediaRefreshJobs() {
        return this.mediaRefreshJobs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<MediaRefreshJobs> mediaRefreshJobs; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetMediaRefreshJobsResponseBody model) {
            this.mediaRefreshJobs = model.mediaRefreshJobs;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of audio or video purge or prefetch task information.</p>
         */
        public Builder mediaRefreshJobs(java.util.List<MediaRefreshJobs> mediaRefreshJobs) {
            this.mediaRefreshJobs = mediaRefreshJobs;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4AF6-D7393642CA58****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMediaRefreshJobsResponseBody build() {
            return new GetMediaRefreshJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMediaRefreshJobsResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaRefreshJobsResponseBody</p>
     */
    public static class MediaRefreshJobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("FilterPolicy")
        private String filterPolicy;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("MediaRefreshJobId")
        private String mediaRefreshJobId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SuccessPlayUrls")
        private String successPlayUrls;

        @com.aliyun.core.annotation.NameInMap("TaskIds")
        private String taskIds;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        private MediaRefreshJobs(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.filterPolicy = builder.filterPolicy;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.mediaId = builder.mediaId;
            this.mediaRefreshJobId = builder.mediaRefreshJobId;
            this.status = builder.status;
            this.successPlayUrls = builder.successPlayUrls;
            this.taskIds = builder.taskIds;
            this.taskType = builder.taskType;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaRefreshJobs create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return filterPolicy
         */
        public String getFilterPolicy() {
            return this.filterPolicy;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        /**
         * @return mediaRefreshJobId
         */
        public String getMediaRefreshJobId() {
            return this.mediaRefreshJobId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return successPlayUrls
         */
        public String getSuccessPlayUrls() {
            return this.successPlayUrls;
        }

        /**
         * @return taskIds
         */
        public String getTaskIds() {
            return this.taskIds;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 
            private String filterPolicy; 
            private String gmtCreate; 
            private String gmtModified; 
            private String mediaId; 
            private String mediaRefreshJobId; 
            private String status; 
            private String successPlayUrls; 
            private String taskIds; 
            private String taskType; 
            private String userData; 

            private Builder() {
            } 

            private Builder(MediaRefreshJobs model) {
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.filterPolicy = model.filterPolicy;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.mediaId = model.mediaId;
                this.mediaRefreshJobId = model.mediaRefreshJobId;
                this.status = model.status;
                this.successPlayUrls = model.successPlayUrls;
                this.taskIds = model.taskIds;
                this.taskType = model.taskType;
                this.userData = model.userData;
            } 

            /**
             * <p>The error code. This field is returned when the purge or prefetch task fails to be submitted.</p>
             * 
             * <strong>example:</strong>
             * <p>PreloadQueueFull</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message. This field is returned when the purge or prefetch task fails to be submitted.</p>
             * 
             * <strong>example:</strong>
             * <p>Preload queue is full, please try again later!</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The filtering policy for playback streams. The value is in JSON format and contains the request parameters of the <a href="https://help.aliyun.com/document_detail/431095.html">SubmitMediaRefreshJob</a> operation.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Formats&quot;:&quot;mp4,m3u8&quot;, &quot;Definitions&quot;:&quot;HD,SD&quot;,  &quot; StreamType&quot;:&quot;video&quot;,  &quot;ResultType&quot;:&quot;Single&quot;,  &quot; SliceFlag&quot;:false, &quot;SliceCount&quot;: 3}</p>
             */
            public Builder filterPolicy(String filterPolicy) {
                this.filterPolicy = filterPolicy;
                return this;
            }

            /**
             * <p>The time when the task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-05-20 08:23:22</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the task was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-05-21 08:23:22</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The audio or video ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ca3a8f6e4957b658067095869****</p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * <p>The ID of the audio or video purge or prefetch task.</p>
             * 
             * <strong>example:</strong>
             * <p>41d465e31957****</p>
             */
            public Builder mediaRefreshJobId(String mediaRefreshJobId) {
                this.mediaRefreshJobId = mediaRefreshJobId;
                return this;
            }

            /**
             * <p>The task status. Valid values:</p>
             * <ul>
             * <li><strong>success</strong>: succeeded</li>
             * <li><strong>fail</strong>: failed</li>
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
             * <p>The playback URLs that were successfully purged or prefetched.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://shenzhen.****.aliyuncdn.com/74401a4f546007bf845cd8840****.m3u8,https://shenzhen.****.aliyuncdn.com/24041e7d13582d86604d8****.m3u8">https://shenzhen.****.aliyuncdn.com/74401a4f546007bf845cd8840****.m3u8,https://shenzhen.****.aliyuncdn.com/24041e7d13582d86604d8****.m3u8</a></p>
             */
            public Builder successPlayUrls(String successPlayUrls) {
                this.successPlayUrls = successPlayUrls;
                return this;
            }

            /**
             * <p>The task IDs for the purge or prefetch of playback URLs. Each URL corresponds to one task ID. You can use the task ID to call the <a href="https://help.aliyun.com/document_detail/69214.html">DescribeVodRefreshTasks</a> operation to query the purge or prefetch status of each playback URL.</p>
             * 
             * <strong>example:</strong>
             * <p>70422****,9524****</p>
             */
            public Builder taskIds(String taskIds) {
                this.taskIds = taskIds;
                return this;
            }

            /**
             * <p>The task type. Valid values:</p>
             * <ul>
             * <li><strong>Refresh</strong>: purge</li>
             * <li><strong>Preload</strong>: prefetch</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Preload</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * <p>The UserData information specified when the purge or prefetch task was submitted.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;MessageCallback&quot;:{&quot;CallbackURL&quot;:&quot;<a href="http://example.aliyundoc.com%22%7D">http://example.aliyundoc.com&quot;}</a>, &quot;Extend&quot;:{&quot;localId&quot;:&quot;xxx&quot;,&quot;test&quot;:&quot;www&quot;}}</p>
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            public MediaRefreshJobs build() {
                return new MediaRefreshJobs(this);
            } 

        } 

    }
}
