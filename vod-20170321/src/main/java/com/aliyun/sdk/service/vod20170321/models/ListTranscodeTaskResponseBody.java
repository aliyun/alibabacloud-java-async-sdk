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
 * {@link ListTranscodeTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ListTranscodeTaskResponseBody</p>
 */
public class ListTranscodeTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TranscodeTaskList")
    private java.util.List<TranscodeTaskList> transcodeTaskList;

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
     * @return transcodeTaskList
     */
    public java.util.List<TranscodeTaskList> getTranscodeTaskList() {
        return this.transcodeTaskList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<TranscodeTaskList> transcodeTaskList; 

        private Builder() {
        } 

        private Builder(ListTranscodeTaskResponseBody model) {
            this.requestId = model.requestId;
            this.transcodeTaskList = model.transcodeTaskList;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4A*****F6-D7393642CA58</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Details about transcoding tasks.</p>
         */
        public Builder transcodeTaskList(java.util.List<TranscodeTaskList> transcodeTaskList) {
            this.transcodeTaskList = transcodeTaskList;
            return this;
        }

        public ListTranscodeTaskResponseBody build() {
            return new ListTranscodeTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTranscodeTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ListTranscodeTaskResponseBody</p>
     */
    public static class TranscodeTaskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompleteTime")
        private String completeTime;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private String taskStatus;

        @com.aliyun.core.annotation.NameInMap("TranscodeTaskId")
        private String transcodeTaskId;

        @com.aliyun.core.annotation.NameInMap("TranscodeTemplateGroupId")
        private String transcodeTemplateGroupId;

        @com.aliyun.core.annotation.NameInMap("Trigger")
        private String trigger;

        @com.aliyun.core.annotation.NameInMap("VideoId")
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

            private Builder() {
            } 

            private Builder(TranscodeTaskList model) {
                this.completeTime = model.completeTime;
                this.creationTime = model.creationTime;
                this.taskStatus = model.taskStatus;
                this.transcodeTaskId = model.transcodeTaskId;
                this.transcodeTemplateGroupId = model.transcodeTemplateGroupId;
                this.trigger = model.trigger;
                this.videoId = model.videoId;
            } 

            /**
             * <p>The time when the transcoding task was complete. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-01-23T12:40:12Z</p>
             */
            public Builder completeTime(String completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * <p>The time when the transcoding task was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-01-23T12:35:12Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The status of the transcoding task. Valid values:</p>
             * <ul>
             * <li><strong>Processing</strong>: In progress.</li>
             * <li><strong>Partial</strong>: Some transcoding jobs were complete.</li>
             * <li><strong>CompleteAllSucc</strong>: All transcoding jobs were successful.</li>
             * <li><strong>CompleteAllFail</strong>: All transcoding jobs failed. If an exception occurs in the source file, no transcoding job is initiated and the transcoding task fails.</li>
             * <li><strong>CompletePartialSucc</strong>: All transcoding jobs were complete but only some were successful.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Processing</p>
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * <p>The ID of the transcoding task.</p>
             * 
             * <strong>example:</strong>
             * <p>b1b65ab107*****ba3dbb900f6c1fe0</p>
             */
            public Builder transcodeTaskId(String transcodeTaskId) {
                this.transcodeTaskId = transcodeTaskId;
                return this;
            }

            /**
             * <p>The ID of the transcoding template group.</p>
             * 
             * <strong>example:</strong>
             * <p>b500c7094bd24*****f3e9900752d7c3</p>
             */
            public Builder transcodeTemplateGroupId(String transcodeTemplateGroupId) {
                this.transcodeTemplateGroupId = transcodeTemplateGroupId;
                return this;
            }

            /**
             * <p>The mode in which the transcoding task is triggered. Valid values:</p>
             * <ul>
             * <li><strong>Auto</strong>: The transcoding task is automatically triggered when the video is uploaded.</li>
             * <li><strong>Manual</strong>: The transcoding task is triggered by calling the SubmitTranscodeJobs operation.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Auto</p>
             */
            public Builder trigger(String trigger) {
                this.trigger = trigger;
                return this;
            }

            /**
             * <p>The ID of the audio or video file.</p>
             * 
             * <strong>example:</strong>
             * <p>d4860fcc6a5*****bce9fed52e893824</p>
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
