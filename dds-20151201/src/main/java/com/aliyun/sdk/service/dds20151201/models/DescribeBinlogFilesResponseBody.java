// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
 * {@link DescribeBinlogFilesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBinlogFilesResponseBody</p>
 */
public class DescribeBinlogFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("MaxRecordsPerPage")
    private Integer maxRecordsPerPage;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeBinlogFilesResponseBody(Builder builder) {
        this.items = builder.items;
        this.maxRecordsPerPage = builder.maxRecordsPerPage;
        this.pageNumber = builder.pageNumber;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBinlogFilesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return maxRecordsPerPage
     */
    public Integer getMaxRecordsPerPage() {
        return this.maxRecordsPerPage;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private Items items; 
        private Integer maxRecordsPerPage; 
        private Integer pageNumber; 
        private String requestId; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeBinlogFilesResponseBody model) {
            this.items = model.items;
            this.maxRecordsPerPage = model.maxRecordsPerPage;
            this.pageNumber = model.pageNumber;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * MaxRecordsPerPage.
         */
        public Builder maxRecordsPerPage(Integer maxRecordsPerPage) {
            this.maxRecordsPerPage = maxRecordsPerPage;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * TotalRecordCount.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeBinlogFilesResponseBody build() {
            return new DescribeBinlogFilesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBinlogFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBinlogFilesResponseBody</p>
     */
    public static class LogFile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BinLogId")
        private String binLogId;

        @com.aliyun.core.annotation.NameInMap("DownloadLink")
        private String downloadLink;

        @com.aliyun.core.annotation.NameInMap("DumpBucket")
        private String dumpBucket;

        @com.aliyun.core.annotation.NameInMap("DumpDownloadURL")
        private String dumpDownloadURL;

        @com.aliyun.core.annotation.NameInMap("DumpState")
        private Integer dumpState;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("FileSize")
        private String fileSize;

        @com.aliyun.core.annotation.NameInMap("LinkExpiredTime")
        private String linkExpiredTime;

        @com.aliyun.core.annotation.NameInMap("LogBeginTime")
        private String logBeginTime;

        @com.aliyun.core.annotation.NameInMap("LogEndTime")
        private String logEndTime;

        @com.aliyun.core.annotation.NameInMap("LogFileName")
        private String logFileName;

        @com.aliyun.core.annotation.NameInMap("LogStatus")
        private String logStatus;

        @com.aliyun.core.annotation.NameInMap("OSSEndpoint")
        private String OSSEndpoint;

        private LogFile(Builder builder) {
            this.binLogId = builder.binLogId;
            this.downloadLink = builder.downloadLink;
            this.dumpBucket = builder.dumpBucket;
            this.dumpDownloadURL = builder.dumpDownloadURL;
            this.dumpState = builder.dumpState;
            this.fileId = builder.fileId;
            this.fileSize = builder.fileSize;
            this.linkExpiredTime = builder.linkExpiredTime;
            this.logBeginTime = builder.logBeginTime;
            this.logEndTime = builder.logEndTime;
            this.logFileName = builder.logFileName;
            this.logStatus = builder.logStatus;
            this.OSSEndpoint = builder.OSSEndpoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogFile create() {
            return builder().build();
        }

        /**
         * @return binLogId
         */
        public String getBinLogId() {
            return this.binLogId;
        }

        /**
         * @return downloadLink
         */
        public String getDownloadLink() {
            return this.downloadLink;
        }

        /**
         * @return dumpBucket
         */
        public String getDumpBucket() {
            return this.dumpBucket;
        }

        /**
         * @return dumpDownloadURL
         */
        public String getDumpDownloadURL() {
            return this.dumpDownloadURL;
        }

        /**
         * @return dumpState
         */
        public Integer getDumpState() {
            return this.dumpState;
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return fileSize
         */
        public String getFileSize() {
            return this.fileSize;
        }

        /**
         * @return linkExpiredTime
         */
        public String getLinkExpiredTime() {
            return this.linkExpiredTime;
        }

        /**
         * @return logBeginTime
         */
        public String getLogBeginTime() {
            return this.logBeginTime;
        }

        /**
         * @return logEndTime
         */
        public String getLogEndTime() {
            return this.logEndTime;
        }

        /**
         * @return logFileName
         */
        public String getLogFileName() {
            return this.logFileName;
        }

        /**
         * @return logStatus
         */
        public String getLogStatus() {
            return this.logStatus;
        }

        /**
         * @return OSSEndpoint
         */
        public String getOSSEndpoint() {
            return this.OSSEndpoint;
        }

        public static final class Builder {
            private String binLogId; 
            private String downloadLink; 
            private String dumpBucket; 
            private String dumpDownloadURL; 
            private Integer dumpState; 
            private String fileId; 
            private String fileSize; 
            private String linkExpiredTime; 
            private String logBeginTime; 
            private String logEndTime; 
            private String logFileName; 
            private String logStatus; 
            private String OSSEndpoint; 

            private Builder() {
            } 

            private Builder(LogFile model) {
                this.binLogId = model.binLogId;
                this.downloadLink = model.downloadLink;
                this.dumpBucket = model.dumpBucket;
                this.dumpDownloadURL = model.dumpDownloadURL;
                this.dumpState = model.dumpState;
                this.fileId = model.fileId;
                this.fileSize = model.fileSize;
                this.linkExpiredTime = model.linkExpiredTime;
                this.logBeginTime = model.logBeginTime;
                this.logEndTime = model.logEndTime;
                this.logFileName = model.logFileName;
                this.logStatus = model.logStatus;
                this.OSSEndpoint = model.OSSEndpoint;
            } 

            /**
             * BinLogId.
             */
            public Builder binLogId(String binLogId) {
                this.binLogId = binLogId;
                return this;
            }

            /**
             * DownloadLink.
             */
            public Builder downloadLink(String downloadLink) {
                this.downloadLink = downloadLink;
                return this;
            }

            /**
             * DumpBucket.
             */
            public Builder dumpBucket(String dumpBucket) {
                this.dumpBucket = dumpBucket;
                return this;
            }

            /**
             * DumpDownloadURL.
             */
            public Builder dumpDownloadURL(String dumpDownloadURL) {
                this.dumpDownloadURL = dumpDownloadURL;
                return this;
            }

            /**
             * DumpState.
             */
            public Builder dumpState(Integer dumpState) {
                this.dumpState = dumpState;
                return this;
            }

            /**
             * FileId.
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * FileSize.
             */
            public Builder fileSize(String fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * LinkExpiredTime.
             */
            public Builder linkExpiredTime(String linkExpiredTime) {
                this.linkExpiredTime = linkExpiredTime;
                return this;
            }

            /**
             * LogBeginTime.
             */
            public Builder logBeginTime(String logBeginTime) {
                this.logBeginTime = logBeginTime;
                return this;
            }

            /**
             * LogEndTime.
             */
            public Builder logEndTime(String logEndTime) {
                this.logEndTime = logEndTime;
                return this;
            }

            /**
             * LogFileName.
             */
            public Builder logFileName(String logFileName) {
                this.logFileName = logFileName;
                return this;
            }

            /**
             * LogStatus.
             */
            public Builder logStatus(String logStatus) {
                this.logStatus = logStatus;
                return this;
            }

            /**
             * OSSEndpoint.
             */
            public Builder OSSEndpoint(String OSSEndpoint) {
                this.OSSEndpoint = OSSEndpoint;
                return this;
            }

            public LogFile build() {
                return new LogFile(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBinlogFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBinlogFilesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogFile")
        private java.util.List<LogFile> logFile;

        private Items(Builder builder) {
            this.logFile = builder.logFile;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return logFile
         */
        public java.util.List<LogFile> getLogFile() {
            return this.logFile;
        }

        public static final class Builder {
            private java.util.List<LogFile> logFile; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.logFile = model.logFile;
            } 

            /**
             * LogFile.
             */
            public Builder logFile(java.util.List<LogFile> logFile) {
                this.logFile = logFile;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
