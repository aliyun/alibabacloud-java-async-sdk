// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLivePullToPushResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLivePullToPushResponseBody</p>
 */
public class DescribeLivePullToPushResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentFileIndex")
    private Integer currentFileIndex;

    @com.aliyun.core.annotation.NameInMap("CurrentOffset")
    private Integer currentOffset;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RetCode")
    private Integer retCode;

    @com.aliyun.core.annotation.NameInMap("TaskExitReason")
    private String taskExitReason;

    @com.aliyun.core.annotation.NameInMap("TaskExitTime")
    private Integer taskExitTime;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("TaskInfo")
    private TaskInfo taskInfo;

    @com.aliyun.core.annotation.NameInMap("TaskInvalidReason")
    private String taskInvalidReason;

    @com.aliyun.core.annotation.NameInMap("TaskStatus")
    private Integer taskStatus;

    private DescribeLivePullToPushResponseBody(Builder builder) {
        this.currentFileIndex = builder.currentFileIndex;
        this.currentOffset = builder.currentOffset;
        this.description = builder.description;
        this.requestId = builder.requestId;
        this.retCode = builder.retCode;
        this.taskExitReason = builder.taskExitReason;
        this.taskExitTime = builder.taskExitTime;
        this.taskId = builder.taskId;
        this.taskInfo = builder.taskInfo;
        this.taskInvalidReason = builder.taskInvalidReason;
        this.taskStatus = builder.taskStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLivePullToPushResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentFileIndex
     */
    public Integer getCurrentFileIndex() {
        return this.currentFileIndex;
    }

    /**
     * @return currentOffset
     */
    public Integer getCurrentOffset() {
        return this.currentOffset;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return retCode
     */
    public Integer getRetCode() {
        return this.retCode;
    }

    /**
     * @return taskExitReason
     */
    public String getTaskExitReason() {
        return this.taskExitReason;
    }

    /**
     * @return taskExitTime
     */
    public Integer getTaskExitTime() {
        return this.taskExitTime;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskInfo
     */
    public TaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    /**
     * @return taskInvalidReason
     */
    public String getTaskInvalidReason() {
        return this.taskInvalidReason;
    }

    /**
     * @return taskStatus
     */
    public Integer getTaskStatus() {
        return this.taskStatus;
    }

    public static final class Builder {
        private Integer currentFileIndex; 
        private Integer currentOffset; 
        private String description; 
        private String requestId; 
        private Integer retCode; 
        private String taskExitReason; 
        private Integer taskExitTime; 
        private String taskId; 
        private TaskInfo taskInfo; 
        private String taskInvalidReason; 
        private Integer taskStatus; 

        private Builder() {
        } 

        private Builder(DescribeLivePullToPushResponseBody model) {
            this.currentFileIndex = model.currentFileIndex;
            this.currentOffset = model.currentOffset;
            this.description = model.description;
            this.requestId = model.requestId;
            this.retCode = model.retCode;
            this.taskExitReason = model.taskExitReason;
            this.taskExitTime = model.taskExitTime;
            this.taskId = model.taskId;
            this.taskInfo = model.taskInfo;
            this.taskInvalidReason = model.taskInvalidReason;
            this.taskStatus = model.taskStatus;
        } 

        /**
         * <p>The current file index.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder currentFileIndex(Integer currentFileIndex) {
            this.currentFileIndex = currentFileIndex;
            return this;
        }

        /**
         * <p>The current offset for video playback.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder currentOffset(Integer currentOffset) {
            this.currentOffset = currentOffset;
            return this;
        }

        /**
         * <p>The error description.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3271ACD2-F143-1204-AFDB-9A87C131****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The code that is returned for the request.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>0 is returned if the request is normal.</p>
         * </li>
         * <li><p>For information about codes that are returned when exceptions occur, see the following Error codes table.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder retCode(Integer retCode) {
            this.retCode = retCode;
            return this;
        }

        /**
         * <p>The reason why the task is stopped.</p>
         * <ul>
         * <li>TriggerByUser: You proactively stopped the task.</li>
         * <li>OverEndTime: The specified end time was exceeded.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is returned only if the task is stopped.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>TriggerByUser</p>
         */
        public Builder taskExitReason(String taskExitReason) {
            this.taskExitReason = taskExitReason;
            return this;
        }

        /**
         * <p>The time when the task was exited. The value is a Unix timestamp in seconds.</p>
         * <blockquote>
         * <p> This parameter is returned only if the task status is exited.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1724740200</p>
         */
        public Builder taskExitTime(Integer taskExitTime) {
            this.taskExitTime = taskExitTime;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>fd245384-4067-4f91-9d75-9666a6bc9****</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The information about the task.</p>
         */
        public Builder taskInfo(TaskInfo taskInfo) {
            this.taskInfo = taskInfo;
            return this;
        }

        /**
         * <p>The reason why the task was stopped.</p>
         * <ul>
         * <li>PullStreamFailed: An exception occurred while pulling the source stream. A retry is in progress.</li>
         * <li>PushStreamFailed: An exception occurred while ingesting the stream. A retry is in progress.</li>
         * <li>UnknownError: An unknown exception occurred.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is returned only if the task status is stopped.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder taskInvalidReason(String taskInvalidReason) {
            this.taskInvalidReason = taskInvalidReason;
            return this;
        }

        /**
         * <p>The current status of the task.</p>
         * <ul>
         * <li>0: not started.</li>
         * <li>1: running. Stream pulling and stream relay are normal.</li>
         * <li>2: abnormal.</li>
         * <li>3: stopped. It may be because exceptions occur during stream pulling or stream relay or you proactively call the StopLivePullToPush operation.</li>
         * <li>-1: exited.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder taskStatus(Integer taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }

        public DescribeLivePullToPushResponseBody build() {
            return new DescribeLivePullToPushResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLivePullToPushResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLivePullToPushResponseBody</p>
     */
    public static class TaskInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallbackURL")
        private String callbackURL;

        @com.aliyun.core.annotation.NameInMap("DstUrl")
        private String dstUrl;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("FileIndex")
        private Integer fileIndex;

        @com.aliyun.core.annotation.NameInMap("Offset")
        private Integer offset;

        @com.aliyun.core.annotation.NameInMap("RepeatNumber")
        private Integer repeatNumber;

        @com.aliyun.core.annotation.NameInMap("RetryCount")
        private Integer retryCount;

        @com.aliyun.core.annotation.NameInMap("RetryInterval")
        private Integer retryInterval;

        @com.aliyun.core.annotation.NameInMap("SourceProtocol")
        private String sourceProtocol;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("SourceUrls")
        private java.util.List<String> sourceUrls;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        private TaskInfo(Builder builder) {
            this.callbackURL = builder.callbackURL;
            this.dstUrl = builder.dstUrl;
            this.endTime = builder.endTime;
            this.fileIndex = builder.fileIndex;
            this.offset = builder.offset;
            this.repeatNumber = builder.repeatNumber;
            this.retryCount = builder.retryCount;
            this.retryInterval = builder.retryInterval;
            this.sourceProtocol = builder.sourceProtocol;
            this.sourceType = builder.sourceType;
            this.sourceUrls = builder.sourceUrls;
            this.startTime = builder.startTime;
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskInfo create() {
            return builder().build();
        }

        /**
         * @return callbackURL
         */
        public String getCallbackURL() {
            return this.callbackURL;
        }

        /**
         * @return dstUrl
         */
        public String getDstUrl() {
            return this.dstUrl;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return fileIndex
         */
        public Integer getFileIndex() {
            return this.fileIndex;
        }

        /**
         * @return offset
         */
        public Integer getOffset() {
            return this.offset;
        }

        /**
         * @return repeatNumber
         */
        public Integer getRepeatNumber() {
            return this.repeatNumber;
        }

        /**
         * @return retryCount
         */
        public Integer getRetryCount() {
            return this.retryCount;
        }

        /**
         * @return retryInterval
         */
        public Integer getRetryInterval() {
            return this.retryInterval;
        }

        /**
         * @return sourceProtocol
         */
        public String getSourceProtocol() {
            return this.sourceProtocol;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return sourceUrls
         */
        public java.util.List<String> getSourceUrls() {
            return this.sourceUrls;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        public static final class Builder {
            private String callbackURL; 
            private String dstUrl; 
            private String endTime; 
            private Integer fileIndex; 
            private Integer offset; 
            private Integer repeatNumber; 
            private Integer retryCount; 
            private Integer retryInterval; 
            private String sourceProtocol; 
            private String sourceType; 
            private java.util.List<String> sourceUrls; 
            private String startTime; 
            private String taskId; 
            private String taskName; 

            private Builder() {
            } 

            private Builder(TaskInfo model) {
                this.callbackURL = model.callbackURL;
                this.dstUrl = model.dstUrl;
                this.endTime = model.endTime;
                this.fileIndex = model.fileIndex;
                this.offset = model.offset;
                this.repeatNumber = model.repeatNumber;
                this.retryCount = model.retryCount;
                this.retryInterval = model.retryInterval;
                this.sourceProtocol = model.sourceProtocol;
                this.sourceType = model.sourceType;
                this.sourceUrls = model.sourceUrls;
                this.startTime = model.startTime;
                this.taskId = model.taskId;
                this.taskName = model.taskName;
            } 

            /**
             * <p>The HTTP callback URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://callback*****.com">https://callback*****.com</a></p>
             */
            public Builder callbackURL(String callbackURL) {
                this.callbackURL = callbackURL;
                return this;
            }

            /**
             * <p>The destination URL to which the stream is relayed.</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp://pushtest.********.aliyunlive.com/pulltest493/pulltest-w434</p>
             */
            public Builder dstUrl(String dstUrl) {
                this.dstUrl = dstUrl;
                return this;
            }

            /**
             * <p>The end time of the task. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-08-27T14:30:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The file index, which indicates the sequence of the file where the playback starts.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder fileIndex(Integer fileIndex) {
                this.fileIndex = fileIndex;
                return this;
            }

            /**
             * <p>The offset of the position where the system starts to read the video resource. Unit: seconds. Valid values: positive numbers.</p>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>This parameter indicates an offset from the first frame.</p>
             * </li>
             * <li><p>This parameter is applicable to only video resources from ApsaraVideo VOD or a third party.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder offset(Integer offset) {
                this.offset = offset;
                return this;
            }

            /**
             * <p>The number of playbacks after the first playback is complete. Valid values:</p>
             * <ul>
             * <li>0 (default): specifies that the video list is played only once.</li>
             * <li>-1: specifies that the video list is played in loop mode.</li>
             * <li>Positive integer: specifies the number of times the video list repeats after the first playback is complete.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is applicable to only video resources from ApsaraVideo VOD or a third party.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder repeatNumber(Integer repeatNumber) {
                this.repeatNumber = repeatNumber;
                return this;
            }

            /**
             * <p>The number of retries allowed.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder retryCount(Integer retryCount) {
                this.retryCount = retryCount;
                return this;
            }

            /**
             * <p>The retry interval. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder retryInterval(Integer retryInterval) {
                this.retryInterval = retryInterval;
                return this;
            }

            /**
             * <p>The protocol of the source stream.</p>
             * 
             * <strong>example:</strong>
             * <p>RTMP</p>
             */
            public Builder sourceProtocol(String sourceProtocol) {
                this.sourceProtocol = sourceProtocol;
                return this;
            }

            /**
             * <p>The type of the source stream. Valid values:</p>
             * <ul>
             * <li>live: a live stream</li>
             * <li>vod: a list of ApsaraVideo VOD resources</li>
             * <li>url: a list of video resources from a third party</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>live</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The source URLs.</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp://pulltest.****.aliyunlive.com/pulltest493/pulltest-w434</p>
             */
            public Builder sourceUrls(java.util.List<String> sourceUrls) {
                this.sourceUrls = sourceUrls;
                return this;
            }

            /**
             * <p>The start time of the task. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-08-26T10:30:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>fd245384-4067-4f91-9d75-9666a6bc9****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The task name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            public TaskInfo build() {
                return new TaskInfo(this);
            } 

        } 

    }
}
