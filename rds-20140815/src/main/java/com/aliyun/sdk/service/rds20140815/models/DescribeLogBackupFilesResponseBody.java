// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeLogBackupFilesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLogBackupFilesResponseBody</p>
 */
public class DescribeLogBackupFilesResponseBody extends TeaModel {
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

    private DescribeLogBackupFilesResponseBody(Builder builder) {
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

    public static DescribeLogBackupFilesResponseBody create() {
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
         * <p>The details of log files.</p>
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number of the page returned.</p>
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
         * <p>100</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F8EC669C-FC85-43D7-AF06-C3641626B37E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total size of log files. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>2300</p>
         */
        public Builder totalFileSize(Long totalFileSize) {
            this.totalFileSize = totalFileSize;
            return this;
        }

        /**
         * <p>The total number of log files.</p>
         * 
         * <strong>example:</strong>
         * <p>17</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeLogBackupFilesResponseBody build() {
            return new DescribeLogBackupFilesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLogBackupFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLogBackupFilesResponseBody</p>
     */
    public static class BinLogFile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DownloadLink")
        private String downloadLink;

        @com.aliyun.core.annotation.NameInMap("FileSize")
        private Long fileSize;

        @com.aliyun.core.annotation.NameInMap("IntranetDownloadLink")
        private String intranetDownloadLink;

        @com.aliyun.core.annotation.NameInMap("LinkExpiredTime")
        private String linkExpiredTime;

        @com.aliyun.core.annotation.NameInMap("LogBeginTime")
        private String logBeginTime;

        @com.aliyun.core.annotation.NameInMap("LogEndTime")
        private String logEndTime;

        private BinLogFile(Builder builder) {
            this.downloadLink = builder.downloadLink;
            this.fileSize = builder.fileSize;
            this.intranetDownloadLink = builder.intranetDownloadLink;
            this.linkExpiredTime = builder.linkExpiredTime;
            this.logBeginTime = builder.logBeginTime;
            this.logEndTime = builder.logEndTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BinLogFile create() {
            return builder().build();
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

        public static final class Builder {
            private String downloadLink; 
            private Long fileSize; 
            private String intranetDownloadLink; 
            private String linkExpiredTime; 
            private String logBeginTime; 
            private String logEndTime; 

            /**
             * <p>The HTTP-based download URL of the log file. If the log file cannot be downloaded, an empty string is returned.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://rdsbak-hz-v3.oss-cn-hangzhou.aliyuncs.com/xxxxx">http://rdsbak-hz-v3.oss-cn-hangzhou.aliyuncs.com/xxxxx</a></p>
             */
            public Builder downloadLink(String downloadLink) {
                this.downloadLink = downloadLink;
                return this;
            }

            /**
             * <p>The size of the log file. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>788480</p>
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * <p>The URL that is used to download the log file over an internal network. If the log file cannot be downloaded, an empty string is returned. This URL is valid for one hour.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://rdsbak-hz-v3.oss-cn-hangzhou.aliyuncs.com/xxxxx">http://rdsbak-hz-v3.oss-cn-hangzhou.aliyuncs.com/xxxxx</a></p>
             */
            public Builder intranetDownloadLink(String intranetDownloadLink) {
                this.intranetDownloadLink = intranetDownloadLink;
                return this;
            }

            /**
             * <p>The expiration time of the URL. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-03-01T15:04:13Z</p>
             */
            public Builder linkExpiredTime(String linkExpiredTime) {
                this.linkExpiredTime = linkExpiredTime;
                return this;
            }

            /**
             * <p>The start time of the log file. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-10-31T08:40Z</p>
             */
            public Builder logBeginTime(String logBeginTime) {
                this.logBeginTime = logBeginTime;
                return this;
            }

            /**
             * <p>The end time of the log file. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-10-31T08:40Z</p>
             */
            public Builder logEndTime(String logEndTime) {
                this.logEndTime = logEndTime;
                return this;
            }

            public BinLogFile build() {
                return new BinLogFile(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLogBackupFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLogBackupFilesResponseBody</p>
     */
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
