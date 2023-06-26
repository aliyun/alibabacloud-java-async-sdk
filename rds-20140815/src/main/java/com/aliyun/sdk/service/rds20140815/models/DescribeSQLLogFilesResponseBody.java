// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSQLLogFilesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSQLLogFilesResponseBody</p>
 */
public class DescribeSQLLogFilesResponseBody extends TeaModel {
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

    private DescribeSQLLogFilesResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSQLLogFilesResponseBody create() {
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
         * An array that consists of the returned audit log files.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeSQLLogFilesResponseBody build() {
            return new DescribeSQLLogFilesResponseBody(this);
        } 

    } 

    public static class LogFile extends TeaModel {
        @NameInMap("FileID")
        private String fileID;

        @NameInMap("LogDownloadURL")
        private String logDownloadURL;

        @NameInMap("LogEndTime")
        private String logEndTime;

        @NameInMap("LogSize")
        private String logSize;

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
        public String getFileID() {
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
        public String getLogSize() {
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
            private String fileID; 
            private String logDownloadURL; 
            private String logEndTime; 
            private String logSize; 
            private String logStartTime; 
            private String logStatus; 

            /**
             * The name of the file.
             */
            public Builder fileID(String fileID) {
                this.fileID = fileID;
                return this;
            }

            /**
             * The download URL of the file. If the audit log file cannot be downloaded, this parameter is null.
             */
            public Builder logDownloadURL(String logDownloadURL) {
                this.logDownloadURL = logDownloadURL;
                return this;
            }

            /**
             * The time at which the last SQL statement recorded in the audit log file was executed. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder logEndTime(String logEndTime) {
                this.logEndTime = logEndTime;
                return this;
            }

            /**
             * The size of the audit log file. Unit: bytes.
             */
            public Builder logSize(String logSize) {
                this.logSize = logSize;
                return this;
            }

            /**
             * The time at which the first SQL statement recorded in the audit log file was executed. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder logStartTime(String logStartTime) {
                this.logStartTime = logStartTime;
                return this;
            }

            /**
             * The status of the audit log file. Valid values:
             * <p>
             * 
             * *   **Success**
             * *   **Failed**
             * *   **Generating**
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
