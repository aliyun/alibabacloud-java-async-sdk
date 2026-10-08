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
 * {@link DescribeSQLLogFilesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSQLLogFilesResponseBody</p>
 */
public class DescribeSQLLogFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
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

        private Builder() {
        } 

        private Builder(DescribeSQLLogFilesResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
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
         * <p>The number of entries on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeSQLLogFilesResponseBody build() {
            return new DescribeSQLLogFilesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSQLLogFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSQLLogFilesResponseBody</p>
     */
    public static class LogFile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileID")
        private String fileID;

        @com.aliyun.core.annotation.NameInMap("LogDownloadURL")
        private String logDownloadURL;

        @com.aliyun.core.annotation.NameInMap("LogEndTime")
        private String logEndTime;

        @com.aliyun.core.annotation.NameInMap("LogSize")
        private String logSize;

        @com.aliyun.core.annotation.NameInMap("LogStartTime")
        private String logStartTime;

        @com.aliyun.core.annotation.NameInMap("LogStatus")
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

            private Builder() {
            } 

            private Builder(LogFile model) {
                this.fileID = model.fileID;
                this.logDownloadURL = model.logDownloadURL;
                this.logEndTime = model.logEndTime;
                this.logSize = model.logSize;
                this.logStartTime = model.logStartTime;
                this.logStatus = model.logStatus;
            } 

            /**
             * FileID.
             */
            public Builder fileID(String fileID) {
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
            public Builder logSize(String logSize) {
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
    /**
     * 
     * {@link DescribeSQLLogFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSQLLogFilesResponseBody</p>
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
