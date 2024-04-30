// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBinlogFilesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBinlogFilesResponseBody</p>
 */
public class DescribeBinlogFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalFileSize")
    private Long totalFileSize;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeBinlogFilesResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalFileSize = builder.totalFileSize;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBinlogFilesResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalFileSize
     */
    public Long getTotalFileSize() {
        return this.totalFileSize;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private Items items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Long totalFileSize; 
        private Integer totalRecordCount; 

        /**
         * The details of the log file.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of log files on the current page.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total size of the log file.
         */
        public Builder totalFileSize(Long totalFileSize) {
            this.totalFileSize = totalFileSize;
            return this;
        }

        /**
         * The total number of log files.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeBinlogFilesResponseBody build() {
            return new DescribeBinlogFilesResponseBody(this);
        } 

    } 

    public static class BinLogFile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Checksum")
        private String checksum;

        @com.aliyun.core.annotation.NameInMap("DownloadLink")
        private String downloadLink;

        @com.aliyun.core.annotation.NameInMap("FileSize")
        private Long fileSize;

        @com.aliyun.core.annotation.NameInMap("HostInstanceID")
        private String hostInstanceID;

        @com.aliyun.core.annotation.NameInMap("IntranetDownloadLink")
        private String intranetDownloadLink;

        @com.aliyun.core.annotation.NameInMap("LinkExpiredTime")
        private String linkExpiredTime;

        @com.aliyun.core.annotation.NameInMap("LogBeginTime")
        private String logBeginTime;

        @com.aliyun.core.annotation.NameInMap("LogEndTime")
        private String logEndTime;

        @com.aliyun.core.annotation.NameInMap("LogFileName")
        private String logFileName;

        @com.aliyun.core.annotation.NameInMap("RemoteStatus")
        private String remoteStatus;

        private BinLogFile(Builder builder) {
            this.checksum = builder.checksum;
            this.downloadLink = builder.downloadLink;
            this.fileSize = builder.fileSize;
            this.hostInstanceID = builder.hostInstanceID;
            this.intranetDownloadLink = builder.intranetDownloadLink;
            this.linkExpiredTime = builder.linkExpiredTime;
            this.logBeginTime = builder.logBeginTime;
            this.logEndTime = builder.logEndTime;
            this.logFileName = builder.logFileName;
            this.remoteStatus = builder.remoteStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BinLogFile create() {
            return builder().build();
        }

        /**
         * @return checksum
         */
        public String getChecksum() {
            return this.checksum;
        }

        /**
         * @return downloadLink
         */
        public String getDownloadLink() {
            return this.downloadLink;
        }

        /**
         * @return fileSize
         */
        public Long getFileSize() {
            return this.fileSize;
        }

        /**
         * @return hostInstanceID
         */
        public String getHostInstanceID() {
            return this.hostInstanceID;
        }

        /**
         * @return intranetDownloadLink
         */
        public String getIntranetDownloadLink() {
            return this.intranetDownloadLink;
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
         * @return remoteStatus
         */
        public String getRemoteStatus() {
            return this.remoteStatus;
        }

        public static final class Builder {
            private String checksum; 
            private String downloadLink; 
            private Long fileSize; 
            private String hostInstanceID; 
            private String intranetDownloadLink; 
            private String linkExpiredTime; 
            private String logBeginTime; 
            private String logEndTime; 
            private String logFileName; 
            private String remoteStatus; 

            /**
             * The checksum. The value of this parameter is calculated by using the CRC64 algorithm.
             */
            public Builder checksum(String checksum) {
                this.checksum = checksum;
                return this;
            }

            /**
             * The HTTP-based download URL of the log file. If the return value of this parameter is NULL, ApsaraDB RDS does not provide a download URL for the log file.
             */
            public Builder downloadLink(String downloadLink) {
                this.downloadLink = downloadLink;
                return this;
            }

            /**
             * The size of the log file.
             * <p>
             * 
             * Unit: bytes.
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * The ID of the instance to which the log file belongs. This parameter helps determine whether the log file is generated on the primary instance or the secondary instance.
             * <p>
             * 
             * >  You can log on to the ApsaraDB RDS console and go to the instance details page. In the left-side navigation pane, click **Service Availability** to view the values of **Primary Instance No.** and **Secondary Instance No.**.
             */
            public Builder hostInstanceID(String hostInstanceID) {
                this.hostInstanceID = hostInstanceID;
                return this;
            }

            /**
             * The URL that is used to download files over an internal network.
             */
            public Builder intranetDownloadLink(String intranetDownloadLink) {
                this.intranetDownloadLink = intranetDownloadLink;
                return this;
            }

            /**
             * The expiration time of the URL.
             * <p>
             * 
             * The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder linkExpiredTime(String linkExpiredTime) {
                this.linkExpiredTime = linkExpiredTime;
                return this;
            }

            /**
             * The beginning of the time range to query.
             * <p>
             * 
             * The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder logBeginTime(String logBeginTime) {
                this.logBeginTime = logBeginTime;
                return this;
            }

            /**
             * The end of the time range to query.
             * <p>
             * 
             * The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder logEndTime(String logEndTime) {
                this.logEndTime = logEndTime;
                return this;
            }

            /**
             * The log file name.
             */
            public Builder logFileName(String logFileName) {
                this.logFileName = logFileName;
                return this;
            }

            /**
             * The status of the log file that is stored in the Object Storage Service (OSS) bucket.
             * <p>
             * 
             * Valid values:
             * 
             * *   **Uploading**
             * *   **Completed**
             */
            public Builder remoteStatus(String remoteStatus) {
                this.remoteStatus = remoteStatus;
                return this;
            }

            public BinLogFile build() {
                return new BinLogFile(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BinLogFile")
        private java.util.List < BinLogFile> binLogFile;

        private Items(Builder builder) {
            this.binLogFile = builder.binLogFile;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return binLogFile
         */
        public java.util.List < BinLogFile> getBinLogFile() {
            return this.binLogFile;
        }

        public static final class Builder {
            private java.util.List < BinLogFile> binLogFile; 

            /**
             * BinLogFile.
             */
            public Builder binLogFile(java.util.List < BinLogFile> binLogFile) {
                this.binLogFile = binLogFile;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
