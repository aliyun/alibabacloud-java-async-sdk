// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BatchGetProjectTaskResponseBody} extends {@link TeaModel}
 *
 * <p>BatchGetProjectTaskResponseBody</p>
 */
public class BatchGetProjectTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultList")
    private java.util.List < ResultList> resultList;

    private BatchGetProjectTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultList = builder.resultList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetProjectTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultList
     */
    public java.util.List < ResultList> getResultList() {
        return this.resultList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < ResultList> resultList; 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * resultList.
         */
        public Builder resultList(java.util.List < ResultList> resultList) {
            this.resultList = resultList;
            return this;
        }

        public BatchGetProjectTaskResponseBody build() {
            return new BatchGetProjectTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchGetProjectTaskResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetProjectTaskResponseBody</p>
     */
    public static class ResultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("errorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("videoDownloadUrl")
        private String videoDownloadUrl;

        @com.aliyun.core.annotation.NameInMap("videoDuration")
        private Integer videoDuration;

        @com.aliyun.core.annotation.NameInMap("videoUrl")
        private String videoUrl;

        private ResultList(Builder builder) {
            this.errorMsg = builder.errorMsg;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.videoDownloadUrl = builder.videoDownloadUrl;
            this.videoDuration = builder.videoDuration;
            this.videoUrl = builder.videoUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultList create() {
            return builder().build();
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return videoDownloadUrl
         */
        public String getVideoDownloadUrl() {
            return this.videoDownloadUrl;
        }

        /**
         * @return videoDuration
         */
        public Integer getVideoDuration() {
            return this.videoDuration;
        }

        /**
         * @return videoUrl
         */
        public String getVideoUrl() {
            return this.videoUrl;
        }

        public static final class Builder {
            private String errorMsg; 
            private String status; 
            private String taskId; 
            private String videoDownloadUrl; 
            private Integer videoDuration; 
            private String videoUrl; 

            /**
             * errorMsg.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * taskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * videoDownloadUrl.
             */
            public Builder videoDownloadUrl(String videoDownloadUrl) {
                this.videoDownloadUrl = videoDownloadUrl;
                return this;
            }

            /**
             * videoDuration.
             */
            public Builder videoDuration(Integer videoDuration) {
                this.videoDuration = videoDuration;
                return this;
            }

            /**
             * videoUrl.
             */
            public Builder videoUrl(String videoUrl) {
                this.videoUrl = videoUrl;
                return this;
            }

            public ResultList build() {
                return new ResultList(this);
            } 

        } 

    }
}
