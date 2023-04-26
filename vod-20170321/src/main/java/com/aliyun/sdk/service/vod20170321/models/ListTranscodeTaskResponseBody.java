// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTranscodeTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ListTranscodeTaskResponseBody</p>
 */
public class ListTranscodeTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TranscodeTaskList")
    private java.util.List < TranscodeTaskList> transcodeTaskList;

    private ListTranscodeTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.transcodeTaskList = builder.transcodeTaskList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTranscodeTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return transcodeTaskList
     */
    public java.util.List < TranscodeTaskList> getTranscodeTaskList() {
        return this.transcodeTaskList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < TranscodeTaskList> transcodeTaskList; 

        /**
         * The ID of the transcoding template group.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the transcoding task.
         */
        public Builder transcodeTaskList(java.util.List < TranscodeTaskList> transcodeTaskList) {
            this.transcodeTaskList = transcodeTaskList;
            return this;
        }

        public ListTranscodeTaskResponseBody build() {
            return new ListTranscodeTaskResponseBody(this);
        } 

    } 

    public static class TranscodeTaskList extends TeaModel {
        @NameInMap("CompleteTime")
        private String completeTime;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("TaskStatus")
        private String taskStatus;

        @NameInMap("TranscodeTaskId")
        private String transcodeTaskId;

        @NameInMap("TranscodeTemplateGroupId")
        private String transcodeTemplateGroupId;

        @NameInMap("Trigger")
        private String trigger;

        @NameInMap("VideoId")
        private String videoId;

        private TranscodeTaskList(Builder builder) {
            this.completeTime = builder.completeTime;
            this.creationTime = builder.creationTime;
            this.taskStatus = builder.taskStatus;
            this.transcodeTaskId = builder.transcodeTaskId;
            this.transcodeTemplateGroupId = builder.transcodeTemplateGroupId;
            this.trigger = builder.trigger;
            this.videoId = builder.videoId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscodeTaskList create() {
            return builder().build();
        }

        /**
         * @return completeTime
         */
        public String getCompleteTime() {
            return this.completeTime;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        /**
         * @return transcodeTaskId
         */
        public String getTranscodeTaskId() {
            return this.transcodeTaskId;
        }

        /**
         * @return transcodeTemplateGroupId
         */
        public String getTranscodeTemplateGroupId() {
            return this.transcodeTemplateGroupId;
        }

        /**
         * @return trigger
         */
        public String getTrigger() {
            return this.trigger;
        }

        /**
         * @return videoId
         */
        public String getVideoId() {
            return this.videoId;
        }

        public static final class Builder {
            private String completeTime; 
            private String creationTime; 
            private String taskStatus; 
            private String transcodeTaskId; 
            private String transcodeTemplateGroupId; 
            private String trigger; 
            private String videoId; 

            /**
             * Queries transcoding tasks based on the media ID. This operation does not return specific job information.
             */
            public Builder completeTime(String completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * The ID of the audio or video file. You can use one of the following methods to obtain the ID of the file:
             * <p>
             * 
             * *   Log on to the [ApsaraVideo VOD](https://vod.console.aliyun.com) console. In the left-side navigation pane, choose **Media Files** > **Audio/Video**. On the Video and Audio page, view the ID of the audio or video file. This method is applicable to files that are uploaded by using the ApsaraVideo VOD console.
             * *   Obtain the value of VideoId from the response to the [CreateUploadVideo](~~55407~~) operation that you call to obtain the upload URL and credential.
             * *   Obtain the value of VideoId by calling the [SearchMedia](~~86044~~) operation. This method is applicable to files that have been uploaded.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The number of entries to return on each page. Maximum value: **50**. Default value: **10**.
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * TranscodeTaskId.
             */
            public Builder transcodeTaskId(String transcodeTaskId) {
                this.transcodeTaskId = transcodeTaskId;
                return this;
            }

            /**
             * TranscodeTemplateGroupId.
             */
            public Builder transcodeTemplateGroupId(String transcodeTemplateGroupId) {
                this.transcodeTemplateGroupId = transcodeTemplateGroupId;
                return this;
            }

            /**
             * The status of the transcoding task. Valid values:
             * <p>
             * 
             * *   **Processing**: In progress.
             * *   **Partial**: Some transcoding jobs were complete.
             * *   **CompleteAllSucc**: All transcoding jobs were successful.
             * *   **CompleteAllFail**: All transcoding jobs failed. If an exception occurs in the source file, no transcoding job is initiated and the transcoding task fails.
             * *   **CompletePartialSucc**: All transcoding jobs were complete but only some were successful.
             */
            public Builder trigger(String trigger) {
                this.trigger = trigger;
                return this;
            }

            /**
             * The ID of the request.
             */
            public Builder videoId(String videoId) {
                this.videoId = videoId;
                return this;
            }

            public TranscodeTaskList build() {
                return new TranscodeTaskList(this);
            } 

        } 

    }
}
