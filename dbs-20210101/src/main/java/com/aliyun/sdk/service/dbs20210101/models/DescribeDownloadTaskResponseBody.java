// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDownloadTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDownloadTaskResponseBody</p>
 */
public class DescribeDownloadTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    private DescribeDownloadTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDownloadTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errCode; 
        private String errMessage; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * The error code returned if the request fails.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The details of the download task.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error code returned if the request fails.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * The error message returned if the request fails.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * The error message returned if the request fails.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**: The request was successful.
         * *   **false**: The request failed.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeDownloadTaskResponseBody build() {
            return new DescribeDownloadTaskResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("BackupSetTime")
        private String backupSetTime;

        @NameInMap("BakSetId")
        private String bakSetId;

        @NameInMap("DbList")
        private String dbList;

        @NameInMap("DownloadStatus")
        private String downloadStatus;

        @NameInMap("ExportDataSize")
        private String exportDataSize;

        @NameInMap("Format")
        private String format;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("ImportDataSize")
        private String importDataSize;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("RegionCode")
        private String regionCode;

        @NameInMap("TargetPath")
        private String targetPath;

        @NameInMap("TargetType")
        private String targetType;

        @NameInMap("TaskId")
        private String taskId;

        private List(Builder builder) {
            this.backupSetTime = builder.backupSetTime;
            this.bakSetId = builder.bakSetId;
            this.dbList = builder.dbList;
            this.downloadStatus = builder.downloadStatus;
            this.exportDataSize = builder.exportDataSize;
            this.format = builder.format;
            this.gmtCreate = builder.gmtCreate;
            this.importDataSize = builder.importDataSize;
            this.progress = builder.progress;
            this.regionCode = builder.regionCode;
            this.targetPath = builder.targetPath;
            this.targetType = builder.targetType;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return backupSetTime
         */
        public String getBackupSetTime() {
            return this.backupSetTime;
        }

        /**
         * @return bakSetId
         */
        public String getBakSetId() {
            return this.bakSetId;
        }

        /**
         * @return dbList
         */
        public String getDbList() {
            return this.dbList;
        }

        /**
         * @return downloadStatus
         */
        public String getDownloadStatus() {
            return this.downloadStatus;
        }

        /**
         * @return exportDataSize
         */
        public String getExportDataSize() {
            return this.exportDataSize;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return importDataSize
         */
        public String getImportDataSize() {
            return this.importDataSize;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return regionCode
         */
        public String getRegionCode() {
            return this.regionCode;
        }

        /**
         * @return targetPath
         */
        public String getTargetPath() {
            return this.targetPath;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String backupSetTime; 
            private String bakSetId; 
            private String dbList; 
            private String downloadStatus; 
            private String exportDataSize; 
            private String format; 
            private String gmtCreate; 
            private String importDataSize; 
            private String progress; 
            private String regionCode; 
            private String targetPath; 
            private String targetType; 
            private String taskId; 

            /**
             * The point in time of the backup set if the task is used to download a backup set at a specific point in time. The value is a timestamp of the LONG type. Unit: milliseconds.
             */
            public Builder backupSetTime(String backupSetTime) {
                this.backupSetTime = backupSetTime;
                return this;
            }

            /**
             * The ID of the full backup set.
             */
            public Builder bakSetId(String bakSetId) {
                this.bakSetId = bakSetId;
                return this;
            }

            /**
             * The databases.
             */
            public Builder dbList(String dbList) {
                this.dbList = dbList;
                return this;
            }

            /**
             * The state of the download task. Valid values:
             * <p>
             * 
             * *   **Initializing**: The download task was being initialized.
             * *   **queuing**: The download task was queuing.
             * *   **running**: The download task was running.
             * *   **failed**: The download task failed.
             * *   **finished**: The download task was complete.
             * *   **expired**: The download task expired.
             */
            public Builder downloadStatus(String downloadStatus) {
                this.downloadStatus = downloadStatus;
                return this;
            }

            /**
             * The amount of output data. Unit: bytes.
             */
            public Builder exportDataSize(String exportDataSize) {
                this.exportDataSize = exportDataSize;
                return this;
            }

            /**
             * The format to which the downloaded backup set is converted. Valid values:
             * <p>
             * 
             * *   **csv**
             * *   **SQL**
             * *   **Parquet**
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * The time when the download task was created. The value is a timestamp.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The amount of data that is processed. Unit: bytes.
             */
            public Builder importDataSize(String importDataSize) {
                this.importDataSize = importDataSize;
                return this;
            }

            /**
             * The number of tables that have been downloaded and the total number of tables to be downloaded.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The ID of the region in which the instance resides.
             */
            public Builder regionCode(String regionCode) {
                this.regionCode = regionCode;
                return this;
            }

            /**
             * The destination path to which the data is downloaded if the TargeType parameter is set to OSS.
             */
            public Builder targetPath(String targetPath) {
                this.targetPath = targetPath;
                return this;
            }

            /**
             * The type of the method in which the backup set is downloaded. Valid values:
             * <p>
             * 
             * *   **OSS**
             * *   **URL**
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * The ID of the download task.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Content extends TeaModel {
        @NameInMap("List")
        private java.util.List < List> list;

        private Content(Builder builder) {
            this.list = builder.list;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        public static final class Builder {
            private java.util.List < List> list; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Content")
        private Content content;

        @NameInMap("Extra")
        private String extra;

        @NameInMap("PageNumber")
        private Long pageNumber;

        @NameInMap("PageSize")
        private Long pageSize;

        @NameInMap("TotalElements")
        private Long totalElements;

        @NameInMap("TotalPages")
        private Long totalPages;

        private Data(Builder builder) {
            this.content = builder.content;
            this.extra = builder.extra;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalElements = builder.totalElements;
            this.totalPages = builder.totalPages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public Content getContent() {
            return this.content;
        }

        /**
         * @return extra
         */
        public String getExtra() {
            return this.extra;
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalElements
         */
        public Long getTotalElements() {
            return this.totalElements;
        }

        /**
         * @return totalPages
         */
        public Long getTotalPages() {
            return this.totalPages;
        }

        public static final class Builder {
            private Content content; 
            private String extra; 
            private Long pageNumber; 
            private Long pageSize; 
            private Long totalElements; 
            private Long totalPages; 

            /**
             * The details of the download task.
             */
            public Builder content(Content content) {
                this.content = content;
                return this;
            }

            /**
             * The extra description of the download tasks.
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * The page number of the returned page. The value must be an integer that is greater than 0. Default value: 1.
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of full backup tasks.
             */
            public Builder totalElements(Long totalElements) {
                this.totalElements = totalElements;
                return this;
            }

            /**
             * The total number of returned pages.
             */
            public Builder totalPages(Long totalPages) {
                this.totalPages = totalPages;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
