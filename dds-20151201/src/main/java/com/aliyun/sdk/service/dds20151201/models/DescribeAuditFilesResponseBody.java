// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAuditFilesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAuditFilesResponseBody</p>
 */
public class DescribeAuditFilesResponseBody extends TeaModel {
    @NameInMap("Items")
    private Items items;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeAuditFilesResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAuditFilesResponseBody create() {
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
         * TotalRecordCount.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeAuditFilesResponseBody build() {
            return new DescribeAuditFilesResponseBody(this);
        } 

    } 

    public static class LogFile extends TeaModel {
        @NameInMap("FileID")
        private Integer fileID;

        @NameInMap("LogDownloadURL")
        private String logDownloadURL;

        @NameInMap("LogEndTime")
        private String logEndTime;

        @NameInMap("LogSize")
        private Long logSize;

        @NameInMap("LogStartTime")
        private String logStartTime;

        @NameInMap("LogStatus")
        private String logStatus;

        private LogFile(Builder builder) {
            this.fileID = builder.fileID;
            this.logDownloadURL = builder.logDownloadURL;
            this.logEndTime = builder.logEndTime;
            this.logSize = builder.logSize;
            this.logStartTime = builder.logStartTime;
            this.logStatus = builder.logStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogFile create() {
            return builder().build();
        }

        /**
         * @return fileID
         */
        public Integer getFileID() {
            return this.fileID;
        }

        /**
         * @return logDownloadURL
         */
        public String getLogDownloadURL() {
            return this.logDownloadURL;
        }

        /**
         * @return logEndTime
         */
        public String getLogEndTime() {
            return this.logEndTime;
        }

        /**
         * @return logSize
         */
        public Long getLogSize() {
            return this.logSize;
        }

        /**
         * @return logStartTime
         */
        public String getLogStartTime() {
            return this.logStartTime;
        }

        /**
         * @return logStatus
         */
        public String getLogStatus() {
            return this.logStatus;
        }

        public static final class Builder {
            private Integer fileID; 
            private String logDownloadURL; 
            private String logEndTime; 
            private Long logSize; 
            private String logStartTime; 
            private String logStatus; 

            /**
             * FileID.
             */
            public Builder fileID(Integer fileID) {
                this.fileID = fileID;
                return this;
            }

            /**
             * LogDownloadURL.
             */
            public Builder logDownloadURL(String logDownloadURL) {
                this.logDownloadURL = logDownloadURL;
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
             * LogSize.
             */
            public Builder logSize(Long logSize) {
                this.logSize = logSize;
                return this;
            }

            /**
             * LogStartTime.
             */
            public Builder logStartTime(String logStartTime) {
                this.logStartTime = logStartTime;
                return this;
            }

            /**
             * LogStatus.
             */
            public Builder logStatus(String logStatus) {
                this.logStatus = logStatus;
                return this;
            }

            public LogFile build() {
                return new LogFile(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @NameInMap("LogFile")
        private java.util.List < LogFile> logFile;

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
        public java.util.List < LogFile> getLogFile() {
            return this.logFile;
        }

        public static final class Builder {
            private java.util.List < LogFile> logFile; 

            /**
             * LogFile.
             */
            public Builder logFile(java.util.List < LogFile> logFile) {
                this.logFile = logFile;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
