// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
         * <p>The details of the log file.</p>
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of log files on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ED169A3E-1657-4104-82AB-24EA8CD0DB75</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total size of the log file.</p>
         * 
         * <strong>example:</strong>
         * <p>2269410</p>
         */
        public Builder totalFileSize(Long totalFileSize) {
            this.totalFileSize = totalFileSize;
            return this;
        }

        /**
         * <p>The total number of log files.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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
             * <p>The checksum. The value of this parameter is calculated by using the CRC64 algorithm.</p>
             * 
             * <strong>example:</strong>
             * <p>18358304393468701857</p>
             */
            public Builder checksum(String checksum) {
                this.checksum = checksum;
                return this;
            }

            /**
             * <p>The HTTP-based download URL of the log file. If the return value of this parameter is NULL, ApsaraDB RDS does not provide a download URL for the log file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://rdsxxxxx.oss.aliyuncs.com/xxxxxx">http://rdsxxxxx.oss.aliyuncs.com/xxxxxx</a></p>
             */
            public Builder downloadLink(String downloadLink) {
                this.downloadLink = downloadLink;
                return this;
            }

            /**
             * <p>The size of the log file.</p>
             * <p>Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>2269410</p>
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * <p>The ID of the instance to which the log file belongs. This parameter helps determine whether the log file is generated on the primary instance or the secondary instance.</p>
             * <blockquote>
             * <p> You can log on to the ApsaraDB RDS console and go to the instance details page. In the left-side navigation pane, click <strong>Service Availability</strong> to view the values of <strong>Primary Instance No.</strong> and <strong>Secondary Instance No.</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>5841973</p>
             */
            public Builder hostInstanceID(String hostInstanceID) {
                this.hostInstanceID = hostInstanceID;
                return this;
            }

            /**
             * <p>The URL that is used to download files over an internal network.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://rdslog-hz-v3.oss-cn-hangzhou-internal.aliyuncs.com/xxxxxx">http://rdslog-hz-v3.oss-cn-hangzhou-internal.aliyuncs.com/xxxxxx</a></p>
             */
            public Builder intranetDownloadLink(String intranetDownloadLink) {
                this.intranetDownloadLink = intranetDownloadLink;
                return this;
            }

            /**
             * <p>The expiration time of the URL.</p>
             * <p>The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2013-06-09T18:00:00Z</p>
             */
            public Builder linkExpiredTime(String linkExpiredTime) {
                this.linkExpiredTime = linkExpiredTime;
                return this;
            }

            /**
             * <p>The beginning of the time range to query.</p>
             * <p>The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-02-09T17:45:21Z</p>
             */
            public Builder logBeginTime(String logBeginTime) {
                this.logBeginTime = logBeginTime;
                return this;
            }

            /**
             * <p>The end of the time range to query.</p>
             * <p>The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-02-15T13:10:28Z</p>
             */
            public Builder logEndTime(String logEndTime) {
                this.logEndTime = logEndTime;
                return this;
            }

            /**
             * <p>The log file name.</p>
             * 
             * <strong>example:</strong>
             * <p>000000040000000000000019</p>
             */
            public Builder logFileName(String logFileName) {
                this.logFileName = logFileName;
                return this;
            }

            /**
             * <p>The status of the log file that is stored in the Object Storage Service (OSS) bucket.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><strong>Uploading</strong></li>
             * <li><strong>Completed</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Completed</p>
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
    /**
     * 
     * {@link DescribeBinlogFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBinlogFilesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BinLogFile")
        private java.util.List<BinLogFile> binLogFile;

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
        public java.util.List<BinLogFile> getBinLogFile() {
            return this.binLogFile;
        }

        public static final class Builder {
            private java.util.List<BinLogFile> binLogFile; 

            /**
             * BinLogFile.
             */
            public Builder binLogFile(java.util.List<BinLogFile> binLogFile) {
                this.binLogFile = binLogFile;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
