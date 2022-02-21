// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLogBackupFilesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLogBackupFilesResponseBody</p>
 */
public class DescribeLogBackupFilesResponseBody extends TeaModel {
    @NameInMap("Items")
    private Items items;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalFileSize")
    private Long totalFileSize;

    @NameInMap("TotalRecordCount")
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
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
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
         * PageRecordCount.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
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
         * TotalFileSize.
         */
        public Builder totalFileSize(Long totalFileSize) {
            this.totalFileSize = totalFileSize;
            return this;
        }

        /**
         * TotalRecordCount.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeLogBackupFilesResponseBody build() {
            return new DescribeLogBackupFilesResponseBody(this);
        } 

    } 

    public static class BinLogFile extends TeaModel {
        @NameInMap("DownloadLink")
        private String downloadLink;

        @NameInMap("FileSize")
        private Long fileSize;

        @NameInMap("IntranetDownloadLink")
        private String intranetDownloadLink;

        @NameInMap("LinkExpiredTime")
        private String linkExpiredTime;

        @NameInMap("LogBeginTime")
        private String logBeginTime;

        @NameInMap("LogEndTime")
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
             * DownloadLink.
             */
            public Builder downloadLink(String downloadLink) {
                this.downloadLink = downloadLink;
                return this;
            }

            /**
             * FileSize.
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * IntranetDownloadLink.
             */
            public Builder intranetDownloadLink(String intranetDownloadLink) {
                this.intranetDownloadLink = intranetDownloadLink;
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

            public BinLogFile build() {
                return new BinLogFile(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @NameInMap("BinLogFile")
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
