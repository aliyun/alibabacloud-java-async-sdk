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
 * {@link DescribeAppRecordingFilesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAppRecordingFilesResponseBody</p>
 */
public class DescribeAppRecordingFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCnt")
    private Integer totalCnt;

    private DescribeAppRecordingFilesResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCnt = builder.totalCnt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppRecordingFilesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCnt
     */
    public Integer getTotalCnt() {
        return this.totalCnt;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCnt; 

        private Builder() {
        } 

        private Builder(DescribeAppRecordingFilesResponseBody model) {
            this.items = model.items;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCnt = model.totalCnt;
        } 

        /**
         * <p>List of recording files.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>Page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>Number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CF8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total count.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCnt(Integer totalCnt) {
            this.totalCnt = totalCnt;
            return this;
        }

        public DescribeAppRecordingFilesResponseBody build() {
            return new DescribeAppRecordingFilesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAppRecordingFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppRecordingFilesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private String channelId;

        @com.aliyun.core.annotation.NameInMap("FileCreateTs")
        private Long fileCreateTs;

        @com.aliyun.core.annotation.NameInMap("FileDuration")
        private Integer fileDuration;

        @com.aliyun.core.annotation.NameInMap("FilePath")
        private String filePath;

        @com.aliyun.core.annotation.NameInMap("FileSize")
        private Integer fileSize;

        @com.aliyun.core.annotation.NameInMap("Region")
        private Integer region;

        @com.aliyun.core.annotation.NameInMap("StartTs")
        private Long startTs;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        private Integer vendor;

        private Items(Builder builder) {
            this.bucket = builder.bucket;
            this.channelId = builder.channelId;
            this.fileCreateTs = builder.fileCreateTs;
            this.fileDuration = builder.fileDuration;
            this.filePath = builder.filePath;
            this.fileSize = builder.fileSize;
            this.region = builder.region;
            this.startTs = builder.startTs;
            this.taskId = builder.taskId;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return channelId
         */
        public String getChannelId() {
            return this.channelId;
        }

        /**
         * @return fileCreateTs
         */
        public Long getFileCreateTs() {
            return this.fileCreateTs;
        }

        /**
         * @return fileDuration
         */
        public Integer getFileDuration() {
            return this.fileDuration;
        }

        /**
         * @return filePath
         */
        public String getFilePath() {
            return this.filePath;
        }

        /**
         * @return fileSize
         */
        public Integer getFileSize() {
            return this.fileSize;
        }

        /**
         * @return region
         */
        public Integer getRegion() {
            return this.region;
        }

        /**
         * @return startTs
         */
        public Long getStartTs() {
            return this.startTs;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return vendor
         */
        public Integer getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private String bucket; 
            private String channelId; 
            private Long fileCreateTs; 
            private Integer fileDuration; 
            private String filePath; 
            private Integer fileSize; 
            private Integer region; 
            private Long startTs; 
            private String taskId; 
            private Integer vendor; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.bucket = model.bucket;
                this.channelId = model.channelId;
                this.fileCreateTs = model.fileCreateTs;
                this.fileDuration = model.fileDuration;
                this.filePath = model.filePath;
                this.fileSize = model.fileSize;
                this.region = model.region;
                this.startTs = model.startTs;
                this.taskId = model.taskId;
                this.vendor = model.vendor;
            } 

            /**
             * <p>User-defined bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>rtc-bucket</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>Channel ID.</p>
             * 
             * <strong>example:</strong>
             * <p>testchannelId</p>
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * <p>Recording file creation timestamp, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1712376032000</p>
             */
            public Builder fileCreateTs(Long fileCreateTs) {
                this.fileCreateTs = fileCreateTs;
                return this;
            }

            /**
             * <p>Recording file duration, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder fileDuration(Integer fileDuration) {
                this.fileDuration = fileDuration;
                return this;
            }

            /**
             * <p>Path where the recording file is stored. Use the SDK of your cloud provider&quot;s Object Storage Service to access the file. For Alibaba Cloud OSS, see <a href="https://help.aliyun.com/zh/oss/user-guide/how-to-obtain-the-url-of-a-single-object-or-the-urls-of-multiple-objects">here</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>record/appid/12_task_local1/1712279809158_1712279844691/playlist.mp4</p>
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
                return this;
            }

            /**
             * <p>Recording file size, in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder fileSize(Integer fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * <p>See region used in the recording task.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder region(Integer region) {
                this.region = region;
                return this;
            }

            /**
             * <p>Recording task start timestamp, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1712376012000</p>
             */
            public Builder startTs(Long startTs) {
                this.startTs = startTs;
                return this;
            }

            /**
             * <p>Recording task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>test001</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>See vendor used when starting the recording task.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder vendor(Integer vendor) {
                this.vendor = vendor;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
