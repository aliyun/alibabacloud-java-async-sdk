// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * DataFlowSubTask.
         */
        public Builder dataFlowSubTask(DataFlowSubTask dataFlowSubTask) {
            this.dataFlowSubTask = dataFlowSubTask;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDataFlowSubTasksResponseBody build() {
            return new DescribeDataFlowSubTasksResponseBody(this);
        } 

    } 

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
             * Checksum.
             */
            public Builder checksum(String checksum) {
                this.checksum = checksum;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * Size.
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
             * ActualBytes.
             */
            public Builder actualBytes(Long actualBytes) {
                this.actualBytes = actualBytes;
                return this;
            }

            /**
             * AverageSpeed.
             */
            public Builder averageSpeed(Long averageSpeed) {
                this.averageSpeed = averageSpeed;
                return this;
            }

            /**
             * BytesDone.
             */
            public Builder bytesDone(Long bytesDone) {
                this.bytesDone = bytesDone;
                return this;
            }

            /**
             * BytesTotal.
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
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DataFlowId.
             */
            public Builder dataFlowId(String dataFlowId) {
                this.dataFlowId = dataFlowId;
                return this;
            }

            /**
             * DataFlowSubTaskId.
             */
            public Builder dataFlowSubTaskId(String dataFlowSubTaskId) {
                this.dataFlowSubTaskId = dataFlowSubTaskId;
                return this;
            }

            /**
             * DataFlowTaskId.
             */
            public Builder dataFlowTaskId(String dataFlowTaskId) {
                this.dataFlowTaskId = dataFlowTaskId;
                return this;
            }

            /**
             * DstFilePath.
             */
            public Builder dstFilePath(String dstFilePath) {
                this.dstFilePath = dstFilePath;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * ErrorMsg.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * FileDetail.
             */
            public Builder fileDetail(FileDetail fileDetail) {
                this.fileDetail = fileDetail;
                return this;
            }

            /**
             * FileSystemId.
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * ProgressStats.
             */
            public Builder progressStats(ProgressStats progressStats) {
                this.progressStats = progressStats;
                return this;
            }

            /**
             * SrcFilePath.
             */
            public Builder srcFilePath(String srcFilePath) {
                this.srcFilePath = srcFilePath;
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
             * Status.
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
    public static class DataFlowSubTask extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataFlowSubTask")
        private java.util.List < DataFlowSubTaskDataFlowSubTask> dataFlowSubTask;

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
        public java.util.List < DataFlowSubTaskDataFlowSubTask> getDataFlowSubTask() {
            return this.dataFlowSubTask;
        }

        public static final class Builder {
            private java.util.List < DataFlowSubTaskDataFlowSubTask> dataFlowSubTask; 

            /**
             * DataFlowSubTask.
             */
            public Builder dataFlowSubTask(java.util.List < DataFlowSubTaskDataFlowSubTask> dataFlowSubTask) {
                this.dataFlowSubTask = dataFlowSubTask;
                return this;
            }

            public DataFlowSubTask build() {
                return new DataFlowSubTask(this);
            } 

        } 

    }
}
