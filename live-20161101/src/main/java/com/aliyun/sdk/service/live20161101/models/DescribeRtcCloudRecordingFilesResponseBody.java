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
 * {@link DescribeRtcCloudRecordingFilesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRtcCloudRecordingFilesResponseBody</p>
 */
public class DescribeRtcCloudRecordingFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskInfo")
    private TaskInfo taskInfo;

    private DescribeRtcCloudRecordingFilesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskInfo = builder.taskInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRtcCloudRecordingFilesResponseBody create() {
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
     * @return taskInfo
     */
    public TaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    public static final class Builder {
        private String requestId; 
        private TaskInfo taskInfo; 

        private Builder() {
        } 

        private Builder(DescribeRtcCloudRecordingFilesResponseBody model) {
            this.requestId = model.requestId;
            this.taskInfo = model.taskInfo;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TaskInfo.
         */
        public Builder taskInfo(TaskInfo taskInfo) {
            this.taskInfo = taskInfo;
            return this;
        }

        public DescribeRtcCloudRecordingFilesResponseBody build() {
            return new DescribeRtcCloudRecordingFilesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRtcCloudRecordingFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRtcCloudRecordingFilesResponseBody</p>
     */
    public static class RecordFileList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HlsFileList")
        private java.util.List<String> hlsFileList;

        @com.aliyun.core.annotation.NameInMap("Mp3FileList")
        private java.util.List<String> mp3FileList;

        @com.aliyun.core.annotation.NameInMap("Mp4FileList")
        private java.util.List<String> mp4FileList;

        private RecordFileList(Builder builder) {
            this.hlsFileList = builder.hlsFileList;
            this.mp3FileList = builder.mp3FileList;
            this.mp4FileList = builder.mp4FileList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordFileList create() {
            return builder().build();
        }

        /**
         * @return hlsFileList
         */
        public java.util.List<String> getHlsFileList() {
            return this.hlsFileList;
        }

        /**
         * @return mp3FileList
         */
        public java.util.List<String> getMp3FileList() {
            return this.mp3FileList;
        }

        /**
         * @return mp4FileList
         */
        public java.util.List<String> getMp4FileList() {
            return this.mp4FileList;
        }

        public static final class Builder {
            private java.util.List<String> hlsFileList; 
            private java.util.List<String> mp3FileList; 
            private java.util.List<String> mp4FileList; 

            private Builder() {
            } 

            private Builder(RecordFileList model) {
                this.hlsFileList = model.hlsFileList;
                this.mp3FileList = model.mp3FileList;
                this.mp4FileList = model.mp4FileList;
            } 

            /**
             * HlsFileList.
             */
            public Builder hlsFileList(java.util.List<String> hlsFileList) {
                this.hlsFileList = hlsFileList;
                return this;
            }

            /**
             * Mp3FileList.
             */
            public Builder mp3FileList(java.util.List<String> mp3FileList) {
                this.mp3FileList = mp3FileList;
                return this;
            }

            /**
             * Mp4FileList.
             */
            public Builder mp4FileList(java.util.List<String> mp4FileList) {
                this.mp4FileList = mp4FileList;
                return this;
            }

            public RecordFileList build() {
                return new RecordFileList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRtcCloudRecordingFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRtcCloudRecordingFilesResponseBody</p>
     */
    public static class TaskInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RecordFileList")
        private RecordFileList recordFileList;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private TaskInfo(Builder builder) {
            this.recordFileList = builder.recordFileList;
            this.status = builder.status;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskInfo create() {
            return builder().build();
        }

        /**
         * @return recordFileList
         */
        public RecordFileList getRecordFileList() {
            return this.recordFileList;
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

        public static final class Builder {
            private RecordFileList recordFileList; 
            private String status; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(TaskInfo model) {
                this.recordFileList = model.recordFileList;
                this.status = model.status;
                this.taskId = model.taskId;
            } 

            /**
             * RecordFileList.
             */
            public Builder recordFileList(RecordFileList recordFileList) {
                this.recordFileList = recordFileList;
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
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public TaskInfo build() {
                return new TaskInfo(this);
            } 

        } 

    }
}
