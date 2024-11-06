// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
    private java.util.List < RecordFiles> recordFiles;

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

    /**
     * @return recordFiles
     */
    public java.util.List < RecordFiles> getRecordFiles() {
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
        private java.util.List < RecordFiles> recordFiles; 
        private String requestId; 
        private Long totalNum; 
        private Long totalPage; 

        /**
         * RecordFiles.
         */
        public Builder recordFiles(java.util.List < RecordFiles> recordFiles) {
            this.recordFiles = recordFiles;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalNum.
         */
        public Builder totalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        /**
         * TotalPage.
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

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * ChannelId.
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Float duration) {
                this.duration = duration;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * StopTime.
             */
            public Builder stopTime(String stopTime) {
                this.stopTime = stopTime;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * Url.
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
