// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMediaRefreshJobsResponseBody} extends {@link TeaModel}
 *
 * <p>GetMediaRefreshJobsResponseBody</p>
 */
public class GetMediaRefreshJobsResponseBody extends TeaModel {
    @NameInMap("MediaRefreshJobs")
    private java.util.List < MediaRefreshJobs> mediaRefreshJobs;

    @NameInMap("RequestId")
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
    public java.util.List < MediaRefreshJobs> getMediaRefreshJobs() {
        return this.mediaRefreshJobs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < MediaRefreshJobs> mediaRefreshJobs; 
        private String requestId; 

        /**
         * The media refresh or prefetch jobs.
         */
        public Builder mediaRefreshJobs(java.util.List < MediaRefreshJobs> mediaRefreshJobs) {
            this.mediaRefreshJobs = mediaRefreshJobs;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMediaRefreshJobsResponseBody build() {
            return new GetMediaRefreshJobsResponseBody(this);
        } 

    } 

    public static class MediaRefreshJobs extends TeaModel {
        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("FilterPolicy")
        private String filterPolicy;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("MediaId")
        private String mediaId;

        @NameInMap("MediaRefreshJobId")
        private String mediaRefreshJobId;

        @NameInMap("Status")
        private String status;

        @NameInMap("SuccessPlayUrls")
        private String successPlayUrls;

        @NameInMap("TaskIds")
        private String taskIds;

        @NameInMap("TaskType")
        private String taskType;

        @NameInMap("UserData")
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
             * The error code. This parameter is returned if the refresh or prefetch task fails.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The error message. This parameter is returned if the refresh or prefetch task fails.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The filtering conditions for stream playback. The value is a JSON string. This parameter is used as a request parameter of the [RefreshMediaPlayUrls](~~RefreshMediaPlayUrls~~) operation.
             */
            public Builder filterPolicy(String filterPolicy) {
                this.filterPolicy = filterPolicy;
                return this;
            }

            /**
             * The time when the task was created.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The time when the task was modified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The ID of the media file.
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * The ID of the job.
             */
            public Builder mediaRefreshJobId(String mediaRefreshJobId) {
                this.mediaRefreshJobId = mediaRefreshJobId;
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
             * The playback URLs that were refreshed or prefetched.
             */
            public Builder successPlayUrls(String successPlayUrls) {
                this.successPlayUrls = successPlayUrls;
                return this;
            }

            /**
             * The IDs of the refresh or prefetch tasks for the playback URLs of media files. Only one URL can be refreshed or prefetched in a task. This value is used in the [DescribeVodRefreshTasks](~~DescribeVodRefreshTasks~~) operation, which queries the status of refresh or prefetch tasks for playback URLs of media files.
             */
            public Builder taskIds(String taskIds) {
                this.taskIds = taskIds;
                return this;
            }

            /**
             * The type of the job. Valid values:
             * <p>
             * 
             * *   **Refresh**
             * *   **Preload**
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * The user data that you passed when you submit a refresh or prefetch task.
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
