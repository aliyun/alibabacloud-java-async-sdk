// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20210101.models;

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
 * {@link DescribeDownloadTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDownloadTaskResponseBody</p>
 */
public class DescribeDownloadTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDownloadTaskResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>DBS.InternalError</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The details of the tasks.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>DBS.InternalError</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>instanceName can not be empty</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The error message returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>instanceName can not be empty</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5D285EB9-A443-592D-9F3D-A888FAC3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeDownloadTaskResponseBody build() {
            return new DescribeDownloadTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDownloadTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDownloadTaskResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupSetTime")
        private String backupSetTime;

        @com.aliyun.core.annotation.NameInMap("BakSetId")
        private String bakSetId;

        @com.aliyun.core.annotation.NameInMap("DbList")
        private String dbList;

        @com.aliyun.core.annotation.NameInMap("DownloadStatus")
        private String downloadStatus;

        @com.aliyun.core.annotation.NameInMap("ExportDataSize")
        private String exportDataSize;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("ImportDataSize")
        private String importDataSize;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("RegionCode")
        private String regionCode;

        @com.aliyun.core.annotation.NameInMap("TargetPath")
        private String targetPath;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        @com.aliyun.core.annotation.NameInMap("TaskId")
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

            private Builder() {
            } 

            private Builder(List model) {
                this.backupSetTime = model.backupSetTime;
                this.bakSetId = model.bakSetId;
                this.dbList = model.dbList;
                this.downloadStatus = model.downloadStatus;
                this.exportDataSize = model.exportDataSize;
                this.format = model.format;
                this.gmtCreate = model.gmtCreate;
                this.importDataSize = model.importDataSize;
                this.progress = model.progress;
                this.regionCode = model.regionCode;
                this.targetPath = model.targetPath;
                this.targetType = model.targetType;
                this.taskId = model.taskId;
            } 

            /**
             * <p>The point in time of the backup set if the task is used to download a backup set at a specific point in time. The value is a timestamp of the LONG type. Unit: millisecond.</p>
             * 
             * <strong>example:</strong>
             * <p>1663162216000</p>
             */
            public Builder backupSetTime(String backupSetTime) {
                this.backupSetTime = backupSetTime;
                return this;
            }

            /**
             * <p>The ID of the full backup set.</p>
             * 
             * <strong>example:</strong>
             * <p>148261****</p>
             */
            public Builder bakSetId(String bakSetId) {
                this.bakSetId = bakSetId;
                return this;
            }

            /**
             * <p>The details of the databases.</p>
             * 
             * <strong>example:</strong>
             * <p>[dbtest]</p>
             */
            public Builder dbList(String dbList) {
                this.dbList = dbList;
                return this;
            }

            /**
             * <p>The status of the download task. Valid values:</p>
             * <ul>
             * <li><strong>Initializing</strong>: The download task is being initialized.</li>
             * <li><strong>queuing</strong>: The download task is queuing.</li>
             * <li><strong>running</strong>: The download task is running.</li>
             * <li><strong>failed</strong>: The download task fails.</li>
             * <li><strong>finished</strong>: The download task is complete.</li>
             * <li><strong>expired</strong>: The download task expires.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>queueing</p>
             */
            public Builder downloadStatus(String downloadStatus) {
                this.downloadStatus = downloadStatus;
                return this;
            }

            /**
             * <p>The amount of output data. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder exportDataSize(String exportDataSize) {
                this.exportDataSize = exportDataSize;
                return this;
            }

            /**
             * <p>The format to which the downloaded backup set is converted. Valid values:</p>
             * <ul>
             * <li><strong>csv</strong></li>
             * <li><strong>SQL</strong></li>
             * <li><strong>Parquet</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>csv</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The time when the download task was created. The value is a timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1663321957000</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The amount of data that is processed. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder importDataSize(String importDataSize) {
                this.importDataSize = importDataSize;
                return this;
            }

            /**
             * <p>The number of tables that have been downloaded and the total number of tables to be downloaded.</p>
             * 
             * <strong>example:</strong>
             * <p>0/0</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The ID of the region in which the instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionCode(String regionCode) {
                this.regionCode = regionCode;
                return this;
            }

            /**
             * <p>The destination path to which the data is downloaded if the value of <strong>TargetType is OSS</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>test_db/path</p>
             */
            public Builder targetPath(String targetPath) {
                this.targetPath = targetPath;
                return this;
            }

            /**
             * <p>The type of the method in which the backup set is downloaded. Valid values:</p>
             * <ul>
             * <li><strong>OSS</strong></li>
             * <li><strong>URL</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>URL</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * <p>The download task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>dt-qxntlvgu****</p>
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
    /**
     * 
     * {@link DescribeDownloadTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDownloadTaskResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

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
        public java.util.List<List> getList() {
            return this.list;
        }

        public static final class Builder {
            private java.util.List<List> list; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.list = model.list;
            } 

            /**
             * List.
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDownloadTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDownloadTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private Content content;

        @com.aliyun.core.annotation.NameInMap("Extra")
        private String extra;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalElements")
        private Long totalElements;

        @com.aliyun.core.annotation.NameInMap("TotalPages")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.content = model.content;
                this.extra = model.extra;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalElements = model.totalElements;
                this.totalPages = model.totalPages;
            } 

            /**
             * <p>The details of the task.</p>
             */
            public Builder content(Content content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The extra description of the download tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>dbtest</p>
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * <p>The page number of the returned page. The value must be an integer that is greater than 0. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of full backup tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalElements(Long totalElements) {
                this.totalElements = totalElements;
                return this;
            }

            /**
             * <p>The total number of returned pages.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
