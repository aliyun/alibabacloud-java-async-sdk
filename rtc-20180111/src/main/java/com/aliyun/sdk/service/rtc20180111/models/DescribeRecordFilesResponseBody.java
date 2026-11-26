// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
 * {@link DescribeRecordFilesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRecordFilesResponseBody</p>
 */
public class DescribeRecordFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RecordFiles")
    private java.util.List<RecordFiles> recordFiles;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Long totalNum;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Long totalPage;

    private DescribeRecordFilesResponseBody(Builder builder) {
        this.recordFiles = builder.recordFiles;
        this.requestId = builder.requestId;
        this.totalNum = builder.totalNum;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRecordFilesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return recordFiles
     */
    public java.util.List<RecordFiles> getRecordFiles() {
        return this.recordFiles;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalNum
     */
    public Long getTotalNum() {
        return this.totalNum;
    }

    /**
     * @return totalPage
     */
    public Long getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private java.util.List<RecordFiles> recordFiles; 
        private String requestId; 
        private Long totalNum; 
        private Long totalPage; 

        private Builder() {
        } 

        private Builder(DescribeRecordFilesResponseBody model) {
            this.recordFiles = model.recordFiles;
            this.requestId = model.requestId;
            this.totalNum = model.totalNum;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>The file list.</p>
         */
        public Builder recordFiles(java.util.List<RecordFiles> recordFiles) {
            this.recordFiles = recordFiles;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>760bad53276431c499e30dc36f6b****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        /**
         * <p>The total number of pages returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeRecordFilesResponseBody build() {
            return new DescribeRecordFilesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRecordFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRecordFilesResponseBody</p>
     */
    public static class RecordFiles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private String channelId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Float duration;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("StopTime")
        private String stopTime;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private RecordFiles(Builder builder) {
            this.appId = builder.appId;
            this.channelId = builder.channelId;
            this.createTime = builder.createTime;
            this.duration = builder.duration;
            this.startTime = builder.startTime;
            this.stopTime = builder.stopTime;
            this.taskId = builder.taskId;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordFiles create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return channelId
         */
        public String getChannelId() {
            return this.channelId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return duration
         */
        public Float getDuration() {
            return this.duration;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return stopTime
         */
        public String getStopTime() {
            return this.stopTime;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String appId; 
            private String channelId; 
            private String createTime; 
            private Float duration; 
            private String startTime; 
            private String stopTime; 
            private String taskId; 
            private String url; 

            private Builder() {
            } 

            private Builder(RecordFiles model) {
                this.appId = model.appId;
                this.channelId = model.channelId;
                this.createTime = model.createTime;
                this.duration = model.duration;
                this.startTime = model.startTime;
                this.stopTime = model.stopTime;
                this.taskId = model.taskId;
                this.url = model.url;
            } 

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>yourAppId</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The channel ID.</p>
             * 
             * <strong>example:</strong>
             * <p>yourChannelId</p>
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * <p>The creation time. Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC time).</p>
             * 
             * <strong>example:</strong>
             * <p>2020-10-02T17:36:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The duration of the recording file.</p>
             * 
             * <strong>example:</strong>
             * <p>1800</p>
             */
            public Builder duration(Float duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The start time. Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC time).</p>
             * 
             * <strong>example:</strong>
             * <p>2020-11-01T17:36:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The end time. Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC time).</p>
             * 
             * <strong>example:</strong>
             * <p>2020-11-02T17:36:00Z</p>
             */
            public Builder stopTime(String stopTime) {
                this.stopTime = stopTime;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>yourTaskId</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The OSS URL of the recording file.</p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public RecordFiles build() {
                return new RecordFiles(this);
            } 

        } 

    }
}
