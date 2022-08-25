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
         * MediaRefreshJobs.
         */
        public Builder mediaRefreshJobs(java.util.List < MediaRefreshJobs> mediaRefreshJobs) {
            this.mediaRefreshJobs = mediaRefreshJobs;
            return this;
        }

        /**
         * RequestId.
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
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * FilterPolicy.
             */
            public Builder filterPolicy(String filterPolicy) {
                this.filterPolicy = filterPolicy;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
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
             * MediaRefreshJobId.
             */
            public Builder mediaRefreshJobId(String mediaRefreshJobId) {
                this.mediaRefreshJobId = mediaRefreshJobId;
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
             * SuccessPlayUrls.
             */
            public Builder successPlayUrls(String successPlayUrls) {
                this.successPlayUrls = successPlayUrls;
                return this;
            }

            /**
             * TaskIds.
             */
            public Builder taskIds(String taskIds) {
                this.taskIds = taskIds;
                return this;
            }

            /**
             * TaskType.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * UserData.
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
