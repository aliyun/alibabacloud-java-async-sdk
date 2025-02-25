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

        /**
         * <p>The media refresh or prefetch jobs.</p>
         */
        public Builder mediaRefreshJobs(java.util.List<MediaRefreshJobs> mediaRefreshJobs) {
            this.mediaRefreshJobs = mediaRefreshJobs;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
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

            /**
             * <p>The error code. This parameter is returned if the refresh or prefetch task fails.</p>
             * 
             * <strong>example:</strong>
             * <p>PreloadQueueFull</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message. This parameter is returned if the refresh or prefetch task fails.</p>
             * 
             * <strong>example:</strong>
             * <p>Preload queue is full, please try again later!</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The filtering conditions for stream playback. The value is a JSON string. This parameter is used as a request parameter of the <a href="~~RefreshMediaPlayUrls~~">RefreshMediaPlayUrls</a> operation.</p>
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
             * <p>2022-05-20T08:23:22Z</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the task was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-05-21T08:23:22Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the media file.</p>
             * 
             * <strong>example:</strong>
             * <p>ca3a8f6e4957b658067095869****</p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * <p>The ID of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>41d465e31957****</p>
             */
            public Builder mediaRefreshJobId(String mediaRefreshJobId) {
                this.mediaRefreshJobId = mediaRefreshJobId;
                return this;
            }

            /**
             * <p>The status of the job. Valid values:</p>
             * <ul>
             * <li><strong>success</strong></li>
             * <li><strong>fail</strong></li>
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
             * <p>The playback URLs that were refreshed or prefetched.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://shenzhen.****.aliyuncdn.com/74401a4f546007bf845cd8840****.m3u8,https://shenzhen.****.aliyuncdn.com/24041e7d13582d86604d8****.m3u8">https://shenzhen.****.aliyuncdn.com/74401a4f546007bf845cd8840****.m3u8,https://shenzhen.****.aliyuncdn.com/24041e7d13582d86604d8****.m3u8</a></p>
             */
            public Builder successPlayUrls(String successPlayUrls) {
                this.successPlayUrls = successPlayUrls;
                return this;
            }

            /**
             * <p>The IDs of the refresh or prefetch tasks for the playback URLs of media files. Only one URL can be refreshed or prefetched in a task. This value is used in the <a href="~~DescribeVodRefreshTasks~~">DescribeVodRefreshTasks</a> operation, which queries the status of refresh or prefetch tasks for playback URLs of media files.</p>
             * 
             * <strong>example:</strong>
             * <p>70422****,9524****</p>
             */
            public Builder taskIds(String taskIds) {
                this.taskIds = taskIds;
                return this;
            }

            /**
             * <p>The type of the job. Valid values:</p>
             * <ul>
             * <li><strong>Refresh</strong></li>
             * <li><strong>Preload</strong></li>
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
             * <p>The user data that you passed when you submit a refresh or prefetch task.</p>
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
