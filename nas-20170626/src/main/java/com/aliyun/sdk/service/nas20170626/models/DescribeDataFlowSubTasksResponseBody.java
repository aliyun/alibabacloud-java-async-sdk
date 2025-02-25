// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link DescribeDataFlowSubTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataFlowSubTasksResponseBody</p>
 */
public class DescribeDataFlowSubTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataFlowSubTask")
    private DataFlowSubTask dataFlowSubTask;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDataFlowSubTasksResponseBody(Builder builder) {
        this.dataFlowSubTask = builder.dataFlowSubTask;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataFlowSubTasksResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataFlowSubTask
     */
    public DataFlowSubTask getDataFlowSubTask() {
        return this.dataFlowSubTask;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DataFlowSubTask dataFlowSubTask; 
        private String nextToken; 
        private String requestId; 

        /**
         * <p>The details about data streaming tasks.</p>
         */
        public Builder dataFlowSubTask(DataFlowSubTask dataFlowSubTask) {
            this.dataFlowSubTask = dataFlowSubTask;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
         * 
         * <strong>example:</strong>
         * <p>pUJaUwAAAABhdGUyNTk1MQ==</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>98696EF0-1607-4E9D-B01D-F20930B6****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDataFlowSubTasksResponseBody build() {
            return new DescribeDataFlowSubTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDataFlowSubTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataFlowSubTasksResponseBody</p>
     */
    public static class FileDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Checksum")
        private String checksum;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        private FileDetail(Builder builder) {
            this.checksum = builder.checksum;
            this.modifyTime = builder.modifyTime;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileDetail create() {
            return builder().build();
        }

        /**
         * @return checksum
         */
        public String getChecksum() {
            return this.checksum;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        public static final class Builder {
            private String checksum; 
            private Long modifyTime; 
            private Long size; 

            /**
             * <p>The checksum. Format example: crc64:123456.</p>
             * 
             * <strong>example:</strong>
             * <p>crc64:850309505450944****</p>
             */
            public Builder checksum(String checksum) {
                this.checksum = checksum;
                return this;
            }

            /**
             * <p>The time when the file was modified. The value is a UNIX timestamp. Unit: ns.</p>
             * 
             * <strong>example:</strong>
             * <p>1721167603</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The file size. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>68</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            public FileDetail build() {
                return new FileDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDataFlowSubTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataFlowSubTasksResponseBody</p>
     */
    public static class ProgressStats extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActualBytes")
        private Long actualBytes;

        @com.aliyun.core.annotation.NameInMap("AverageSpeed")
        private Long averageSpeed;

        @com.aliyun.core.annotation.NameInMap("BytesDone")
        private Long bytesDone;

        @com.aliyun.core.annotation.NameInMap("BytesTotal")
        private Long bytesTotal;

        private ProgressStats(Builder builder) {
            this.actualBytes = builder.actualBytes;
            this.averageSpeed = builder.averageSpeed;
            this.bytesDone = builder.bytesDone;
            this.bytesTotal = builder.bytesTotal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProgressStats create() {
            return builder().build();
        }

        /**
         * @return actualBytes
         */
        public Long getActualBytes() {
            return this.actualBytes;
        }

        /**
         * @return averageSpeed
         */
        public Long getAverageSpeed() {
            return this.averageSpeed;
        }

        /**
         * @return bytesDone
         */
        public Long getBytesDone() {
            return this.bytesDone;
        }

        /**
         * @return bytesTotal
         */
        public Long getBytesTotal() {
            return this.bytesTotal;
        }

        public static final class Builder {
            private Long actualBytes; 
            private Long averageSpeed; 
            private Long bytesDone; 
            private Long bytesTotal; 

            /**
             * <p>The actual amount of data for which the data flow task is complete. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>68</p>
             */
            public Builder actualBytes(Long actualBytes) {
                this.actualBytes = actualBytes;
                return this;
            }

            /**
             * <p>The average flow velocity. Unit: bytes/s.</p>
             * 
             * <strong>example:</strong>
             * <p>34</p>
             */
            public Builder averageSpeed(Long averageSpeed) {
                this.averageSpeed = averageSpeed;
                return this;
            }

            /**
             * <p>The amount of data (including skipped data) for which the data flow task is complete. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>68</p>
             */
            public Builder bytesDone(Long bytesDone) {
                this.bytesDone = bytesDone;
                return this;
            }

            /**
             * <p>The amount of data scanned on the source. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>68</p>
             */
            public Builder bytesTotal(Long bytesTotal) {
                this.bytesTotal = bytesTotal;
                return this;
            }

            public ProgressStats build() {
                return new ProgressStats(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDataFlowSubTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataFlowSubTasksResponseBody</p>
     */
    public static class DataFlowSubTaskDataFlowSubTask extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DataFlowId")
        private String dataFlowId;

        @com.aliyun.core.annotation.NameInMap("DataFlowSubTaskId")
        private String dataFlowSubTaskId;

        @com.aliyun.core.annotation.NameInMap("DataFlowTaskId")
        private String dataFlowTaskId;

        @com.aliyun.core.annotation.NameInMap("DstFilePath")
        private String dstFilePath;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("FileDetail")
        private FileDetail fileDetail;

        @com.aliyun.core.annotation.NameInMap("FileSystemId")
        private String fileSystemId;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Integer progress;

        @com.aliyun.core.annotation.NameInMap("ProgressStats")
        private ProgressStats progressStats;

        @com.aliyun.core.annotation.NameInMap("SrcFilePath")
        private String srcFilePath;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private DataFlowSubTaskDataFlowSubTask(Builder builder) {
            this.createTime = builder.createTime;
            this.dataFlowId = builder.dataFlowId;
            this.dataFlowSubTaskId = builder.dataFlowSubTaskId;
            this.dataFlowTaskId = builder.dataFlowTaskId;
            this.dstFilePath = builder.dstFilePath;
            this.endTime = builder.endTime;
            this.errorMsg = builder.errorMsg;
            this.fileDetail = builder.fileDetail;
            this.fileSystemId = builder.fileSystemId;
            this.progress = builder.progress;
            this.progressStats = builder.progressStats;
            this.srcFilePath = builder.srcFilePath;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataFlowSubTaskDataFlowSubTask create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataFlowId
         */
        public String getDataFlowId() {
            return this.dataFlowId;
        }

        /**
         * @return dataFlowSubTaskId
         */
        public String getDataFlowSubTaskId() {
            return this.dataFlowSubTaskId;
        }

        /**
         * @return dataFlowTaskId
         */
        public String getDataFlowTaskId() {
            return this.dataFlowTaskId;
        }

        /**
         * @return dstFilePath
         */
        public String getDstFilePath() {
            return this.dstFilePath;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return fileDetail
         */
        public FileDetail getFileDetail() {
            return this.fileDetail;
        }

        /**
         * @return fileSystemId
         */
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        /**
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
        }

        /**
         * @return progressStats
         */
        public ProgressStats getProgressStats() {
            return this.progressStats;
        }

        /**
         * @return srcFilePath
         */
        public String getSrcFilePath() {
            return this.srcFilePath;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String createTime; 
            private String dataFlowId; 
            private String dataFlowSubTaskId; 
            private String dataFlowTaskId; 
            private String dstFilePath; 
            private String endTime; 
            private String errorMsg; 
            private FileDetail fileDetail; 
            private String fileSystemId; 
            private Integer progress; 
            private ProgressStats progressStats; 
            private String srcFilePath; 
            private String startTime; 
            private String status; 

            /**
             * <p>The time when the data streaming task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-07-01 19:59:29</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the data flow.</p>
             * 
             * <strong>example:</strong>
             * <p>df-194433a5be31****</p>
             */
            public Builder dataFlowId(String dataFlowId) {
                this.dataFlowId = dataFlowId;
                return this;
            }

            /**
             * <p>The ID of the data streaming task.</p>
             * 
             * <strong>example:</strong>
             * <p>subTaskId-370kyfmyknxcyzw****</p>
             */
            public Builder dataFlowSubTaskId(String dataFlowSubTaskId) {
                this.dataFlowSubTaskId = dataFlowSubTaskId;
                return this;
            }

            /**
             * <p>The ID of the data flow task.</p>
             * 
             * <strong>example:</strong>
             * <p>task-38aa8e890f45****</p>
             */
            public Builder dataFlowTaskId(String dataFlowTaskId) {
                this.dataFlowTaskId = dataFlowTaskId;
                return this;
            }

            /**
             * <p>The path of the destination file. Limits:</p>
             * <ul>
             * <li>The path must be 1 to 1,023 characters in length.</li>
             * <li>The path must be encoded in UTF-8.</li>
             * <li>The path must start with a forward slash (/).</li>
             * <li>The path must end with the file name.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>/mnt/file.png</p>
             */
            public Builder dstFilePath(String dstFilePath) {
                this.dstFilePath = dstFilePath;
                return this;
            }

            /**
             * <p>The time when the data streaming task ended.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-07-04 11:14:22</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The error message returned when the task failed.</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>The file information.</p>
             */
            public Builder fileDetail(FileDetail fileDetail) {
                this.fileDetail = fileDetail;
                return this;
            }

            /**
             * <p>The ID of the file system.</p>
             * 
             * <strong>example:</strong>
             * <p>bmcpfs-370lx1ev9ss27o0****</p>
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * <p>The progress of the data streaming task. Valid values: 0 to 10000.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The progress information about data streaming tasks.</p>
             */
            public Builder progressStats(ProgressStats progressStats) {
                this.progressStats = progressStats;
                return this;
            }

            /**
             * <p>The path of the source file. Limits:</p>
             * <ul>
             * <li>The path must be 1 to 1,023 characters in length.</li>
             * <li>The path must be encoded in UTF-8.</li>
             * <li>The path must start with a forward slash (/).</li>
             * <li>The path must end with the file name.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>/test/file.png</p>
             */
            public Builder srcFilePath(String srcFilePath) {
                this.srcFilePath = srcFilePath;
                return this;
            }

            /**
             * <p>The time when the data streaming task started.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-07-03 10:43:16</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the data streaming task. Valid values:</p>
             * <ul>
             * <li>EXPIRED: The task is terminated.</li>
             * <li>CREATED: The task is created.</li>
             * <li>RUNNING: The task is running.</li>
             * <li>COMPLETE: The task is complete.</li>
             * <li>CANCELING: The task is being canceled.</li>
             * <li>FAILED: The task failed to be executed.</li>
             * <li>CANCELED: The task is canceled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>COMPLETE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DataFlowSubTaskDataFlowSubTask build() {
                return new DataFlowSubTaskDataFlowSubTask(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDataFlowSubTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataFlowSubTasksResponseBody</p>
     */
    public static class DataFlowSubTask extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataFlowSubTask")
        private java.util.List<DataFlowSubTaskDataFlowSubTask> dataFlowSubTask;

        private DataFlowSubTask(Builder builder) {
            this.dataFlowSubTask = builder.dataFlowSubTask;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataFlowSubTask create() {
            return builder().build();
        }

        /**
         * @return dataFlowSubTask
         */
        public java.util.List<DataFlowSubTaskDataFlowSubTask> getDataFlowSubTask() {
            return this.dataFlowSubTask;
        }

        public static final class Builder {
            private java.util.List<DataFlowSubTaskDataFlowSubTask> dataFlowSubTask; 

            /**
             * <p>The details about data streaming tasks.</p>
             */
            public Builder dataFlowSubTask(java.util.List<DataFlowSubTaskDataFlowSubTask> dataFlowSubTask) {
                this.dataFlowSubTask = dataFlowSubTask;
                return this;
            }

            public DataFlowSubTask build() {
                return new DataFlowSubTask(this);
            } 

        } 

    }
}
