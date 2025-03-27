// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link BatchGetVideoClipTaskResponseBody} extends {@link TeaModel}
 *
 * <p>BatchGetVideoClipTaskResponseBody</p>
 */
public class BatchGetVideoClipTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("taskList")
    private java.util.List<TaskList> taskList;

    private BatchGetVideoClipTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskList = builder.taskList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetVideoClipTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskList
     */
    public java.util.List<TaskList> getTaskList() {
        return this.taskList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<TaskList> taskList; 

        private Builder() {
        } 

        private Builder(BatchGetVideoClipTaskResponseBody model) {
            this.requestId = model.requestId;
            this.taskList = model.taskList;
        } 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * taskList.
         */
        public Builder taskList(java.util.List<TaskList> taskList) {
            this.taskList = taskList;
            return this;
        }

        public BatchGetVideoClipTaskResponseBody build() {
            return new BatchGetVideoClipTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchGetVideoClipTaskResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetVideoClipTaskResponseBody</p>
     */
    public static class VideoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("beginTime")
        private Integer beginTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("endTime")
        private Integer endTime;

        @com.aliyun.core.annotation.NameInMap("errorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("videoDownloadUrl")
        private String videoDownloadUrl;

        @com.aliyun.core.annotation.NameInMap("videoName")
        private String videoName;

        @com.aliyun.core.annotation.NameInMap("videoUrl")
        private String videoUrl;

        private VideoList(Builder builder) {
            this.beginTime = builder.beginTime;
            this.description = builder.description;
            this.endTime = builder.endTime;
            this.errorMsg = builder.errorMsg;
            this.title = builder.title;
            this.videoDownloadUrl = builder.videoDownloadUrl;
            this.videoName = builder.videoName;
            this.videoUrl = builder.videoUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoList create() {
            return builder().build();
        }

        /**
         * @return beginTime
         */
        public Integer getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endTime
         */
        public Integer getEndTime() {
            return this.endTime;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return videoDownloadUrl
         */
        public String getVideoDownloadUrl() {
            return this.videoDownloadUrl;
        }

        /**
         * @return videoName
         */
        public String getVideoName() {
            return this.videoName;
        }

        /**
         * @return videoUrl
         */
        public String getVideoUrl() {
            return this.videoUrl;
        }

        public static final class Builder {
            private Integer beginTime; 
            private String description; 
            private Integer endTime; 
            private String errorMsg; 
            private String title; 
            private String videoDownloadUrl; 
            private String videoName; 
            private String videoUrl; 

            private Builder() {
            } 

            private Builder(VideoList model) {
                this.beginTime = model.beginTime;
                this.description = model.description;
                this.endTime = model.endTime;
                this.errorMsg = model.errorMsg;
                this.title = model.title;
                this.videoDownloadUrl = model.videoDownloadUrl;
                this.videoName = model.videoName;
                this.videoUrl = model.videoUrl;
            } 

            /**
             * beginTime.
             */
            public Builder beginTime(Integer beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * endTime.
             */
            public Builder endTime(Integer endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * errorMsg.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
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
             * videoName.
             */
            public Builder videoName(String videoName) {
                this.videoName = videoName;
                return this;
            }

            /**
             * videoUrl.
             */
            public Builder videoUrl(String videoUrl) {
                this.videoUrl = videoUrl;
                return this;
            }

            public VideoList build() {
                return new VideoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchGetVideoClipTaskResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetVideoClipTaskResponseBody</p>
     */
    public static class TaskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("totalDuration")
        private Double totalDuration;

        @com.aliyun.core.annotation.NameInMap("totalToken")
        private Long totalToken;

        @com.aliyun.core.annotation.NameInMap("videoList")
        private java.util.List<VideoList> videoList;

        private TaskList(Builder builder) {
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.totalDuration = builder.totalDuration;
            this.totalToken = builder.totalToken;
            this.videoList = builder.videoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskList create() {
            return builder().build();
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
         * @return totalDuration
         */
        public Double getTotalDuration() {
            return this.totalDuration;
        }

        /**
         * @return totalToken
         */
        public Long getTotalToken() {
            return this.totalToken;
        }

        /**
         * @return videoList
         */
        public java.util.List<VideoList> getVideoList() {
            return this.videoList;
        }

        public static final class Builder {
            private String status; 
            private String taskId; 
            private Double totalDuration; 
            private Long totalToken; 
            private java.util.List<VideoList> videoList; 

            private Builder() {
            } 

            private Builder(TaskList model) {
                this.status = model.status;
                this.taskId = model.taskId;
                this.totalDuration = model.totalDuration;
                this.totalToken = model.totalToken;
                this.videoList = model.videoList;
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
             * totalDuration.
             */
            public Builder totalDuration(Double totalDuration) {
                this.totalDuration = totalDuration;
                return this;
            }

            /**
             * totalToken.
             */
            public Builder totalToken(Long totalToken) {
                this.totalToken = totalToken;
                return this;
            }

            /**
             * videoList.
             */
            public Builder videoList(java.util.List<VideoList> videoList) {
                this.videoList = videoList;
                return this;
            }

            public TaskList build() {
                return new TaskList(this);
            } 

        } 

    }
}
