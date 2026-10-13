// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link ListDownloadTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListDownloadTasksResponseBody</p>
 */
public class ListDownloadTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DownloadTasks")
    private DownloadTasks downloadTasks;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListDownloadTasksResponseBody(Builder builder) {
        this.code = builder.code;
        this.downloadTasks = builder.downloadTasks;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDownloadTasksResponseBody create() {
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
     * @return downloadTasks
     */
    public DownloadTasks getDownloadTasks() {
        return this.downloadTasks;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private DownloadTasks downloadTasks; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListDownloadTasksResponseBody model) {
            this.code = model.code;
            this.downloadTasks = model.downloadTasks;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The list of download tasks.</p>
         */
        public Builder downloadTasks(DownloadTasks downloadTasks) {
            this.downloadTasks = downloadTasks;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The message returned by the API.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>904CFA7B-8AD9-50FF-9B3E-404B20B9EE31</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListDownloadTasksResponseBody build() {
            return new ListDownloadTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDownloadTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListDownloadTasksResponseBody</p>
     */
    public static class DownloadTaskFiles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Integer progress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private DownloadTaskFiles(Builder builder) {
            this.fileId = builder.fileId;
            this.progress = builder.progress;
            this.status = builder.status;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DownloadTaskFiles create() {
            return builder().build();
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String fileId; 
            private Integer progress; 
            private String status; 
            private String title; 

            private Builder() {
            } 

            private Builder(DownloadTaskFiles model) {
                this.fileId = model.fileId;
                this.progress = model.progress;
                this.status = model.status;
                this.title = model.title;
            } 

            /**
             * <p>The file ID.</p>
             * 
             * <strong>example:</strong>
             * <p>01f8d11abdb9406996c0c46e7*******</p>
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The completion progress.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The file status. Valid values:</p>
             * <ul>
             * <li>Pending: Pending.</li>
             * <li>InProgress: In progress.</li>
             * <li>Finished: Finished.</li>
             * <li>Failed: Failed.</li>
             * <li>Expired: Expired.</li>
             * <li>Cancelled: Cancelled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Empty</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The title.</p>
             * 
             * <strong>example:</strong>
             * <p>GUI-TEST-Create risk</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public DownloadTaskFiles build() {
                return new DownloadTaskFiles(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDownloadTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListDownloadTasksResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DownloadTaskFiles")
        private java.util.List<DownloadTaskFiles> downloadTaskFiles;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private Long expireTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private List(Builder builder) {
            this.downloadTaskFiles = builder.downloadTaskFiles;
            this.expireTime = builder.expireTime;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return downloadTaskFiles
         */
        public java.util.List<DownloadTaskFiles> getDownloadTaskFiles() {
            return this.downloadTaskFiles;
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private java.util.List<DownloadTaskFiles> downloadTaskFiles; 
            private Long expireTime; 
            private String status; 
            private String taskId; 
            private String title; 

            private Builder() {
            } 

            private Builder(List model) {
                this.downloadTaskFiles = model.downloadTaskFiles;
                this.expireTime = model.expireTime;
                this.status = model.status;
                this.taskId = model.taskId;
                this.title = model.title;
            } 

            /**
             * <p>The list of files for the download task.</p>
             */
            public Builder downloadTaskFiles(java.util.List<DownloadTaskFiles> downloadTaskFiles) {
                this.downloadTaskFiles = downloadTaskFiles;
                return this;
            }

            /**
             * <p>The expiration time. The value is a UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1646792941</p>
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The export status. Valid values:</p>
             * <ul>
             * <li>Pending: Pending.</li>
             * <li>InProgress: In progress.</li>
             * <li>Finished: Finished.</li>
             * <li>Failed: Failed.</li>
             * <li>Expired: Expired.</li>
             * <li>Cancelled: Cancelled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Empty</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>6b0e547e-501c-480a-812f-d27e28e74f9a</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The title.</p>
             * 
             * <strong>example:</strong>
             * <p>GUI-TEST-Create risk</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDownloadTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListDownloadTasksResponseBody</p>
     */
    public static class DownloadTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private DownloadTasks(Builder builder) {
            this.list = builder.list;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DownloadTasks create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<List> list; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(DownloadTasks model) {
                this.list = model.list;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The array of download tasks.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
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
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public DownloadTasks build() {
                return new DownloadTasks(this);
            } 

        } 

    }
}
