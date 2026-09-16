// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link ListKnowledgeFilesResponseBody} extends {@link TeaModel}
 *
 * <p>ListKnowledgeFilesResponseBody</p>
 */
public class ListKnowledgeFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListKnowledgeFilesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKnowledgeFilesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListKnowledgeFilesResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListKnowledgeFilesResponseBody build() {
            return new ListKnowledgeFilesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListKnowledgeFilesResponseBody} extends {@link TeaModel}
     *
     * <p>ListKnowledgeFilesResponseBody</p>
     */
    public static class Files extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private Long fileId;

        @com.aliyun.core.annotation.NameInMap("FileSizeBytes")
        private Long fileSizeBytes;

        @com.aliyun.core.annotation.NameInMap("FileUrl")
        private String fileUrl;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("IsDirectory")
        private Boolean isDirectory;

        @com.aliyun.core.annotation.NameInMap("OwnerFileId")
        private Long ownerFileId;

        @com.aliyun.core.annotation.NameInMap("PageCount")
        private Integer pageCount;

        @com.aliyun.core.annotation.NameInMap("ProcessMessage")
        private String processMessage;

        @com.aliyun.core.annotation.NameInMap("ProcessStatus")
        private String processStatus;

        @com.aliyun.core.annotation.NameInMap("UpdatedAt")
        private String updatedAt;

        private Files(Builder builder) {
            this.createdAt = builder.createdAt;
            this.fileId = builder.fileId;
            this.fileSizeBytes = builder.fileSizeBytes;
            this.fileUrl = builder.fileUrl;
            this.format = builder.format;
            this.isDirectory = builder.isDirectory;
            this.ownerFileId = builder.ownerFileId;
            this.pageCount = builder.pageCount;
            this.processMessage = builder.processMessage;
            this.processStatus = builder.processStatus;
            this.updatedAt = builder.updatedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Files create() {
            return builder().build();
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return fileId
         */
        public Long getFileId() {
            return this.fileId;
        }

        /**
         * @return fileSizeBytes
         */
        public Long getFileSizeBytes() {
            return this.fileSizeBytes;
        }

        /**
         * @return fileUrl
         */
        public String getFileUrl() {
            return this.fileUrl;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return isDirectory
         */
        public Boolean getIsDirectory() {
            return this.isDirectory;
        }

        /**
         * @return ownerFileId
         */
        public Long getOwnerFileId() {
            return this.ownerFileId;
        }

        /**
         * @return pageCount
         */
        public Integer getPageCount() {
            return this.pageCount;
        }

        /**
         * @return processMessage
         */
        public String getProcessMessage() {
            return this.processMessage;
        }

        /**
         * @return processStatus
         */
        public String getProcessStatus() {
            return this.processStatus;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public static final class Builder {
            private String createdAt; 
            private Long fileId; 
            private Long fileSizeBytes; 
            private String fileUrl; 
            private String format; 
            private Boolean isDirectory; 
            private Long ownerFileId; 
            private Integer pageCount; 
            private String processMessage; 
            private String processStatus; 
            private String updatedAt; 

            private Builder() {
            } 

            private Builder(Files model) {
                this.createdAt = model.createdAt;
                this.fileId = model.fileId;
                this.fileSizeBytes = model.fileSizeBytes;
                this.fileUrl = model.fileUrl;
                this.format = model.format;
                this.isDirectory = model.isDirectory;
                this.ownerFileId = model.ownerFileId;
                this.pageCount = model.pageCount;
                this.processMessage = model.processMessage;
                this.processStatus = model.processStatus;
                this.updatedAt = model.updatedAt;
            } 

            /**
             * CreatedAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * FileId.
             */
            public Builder fileId(Long fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * FileSizeBytes.
             */
            public Builder fileSizeBytes(Long fileSizeBytes) {
                this.fileSizeBytes = fileSizeBytes;
                return this;
            }

            /**
             * FileUrl.
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            /**
             * Format.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * IsDirectory.
             */
            public Builder isDirectory(Boolean isDirectory) {
                this.isDirectory = isDirectory;
                return this;
            }

            /**
             * OwnerFileId.
             */
            public Builder ownerFileId(Long ownerFileId) {
                this.ownerFileId = ownerFileId;
                return this;
            }

            /**
             * PageCount.
             */
            public Builder pageCount(Integer pageCount) {
                this.pageCount = pageCount;
                return this;
            }

            /**
             * ProcessMessage.
             */
            public Builder processMessage(String processMessage) {
                this.processMessage = processMessage;
                return this;
            }

            /**
             * ProcessStatus.
             */
            public Builder processStatus(String processStatus) {
                this.processStatus = processStatus;
                return this;
            }

            /**
             * UpdatedAt.
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            public Files build() {
                return new Files(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListKnowledgeFilesResponseBody} extends {@link TeaModel}
     *
     * <p>ListKnowledgeFilesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Files")
        private java.util.List<Files> files;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Page")
        private Integer page;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.files = builder.files;
            this.message = builder.message;
            this.page = builder.page;
            this.pageSize = builder.pageSize;
            this.success = builder.success;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return files
         */
        public java.util.List<Files> getFiles() {
            return this.files;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return page
         */
        public Integer getPage() {
            return this.page;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<Files> files; 
            private String message; 
            private Integer page; 
            private Integer pageSize; 
            private Boolean success; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.files = model.files;
                this.message = model.message;
                this.page = model.page;
                this.pageSize = model.pageSize;
                this.success = model.success;
                this.total = model.total;
            } 

            /**
             * Files.
             */
            public Builder files(java.util.List<Files> files) {
                this.files = files;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * Page.
             */
            public Builder page(Integer page) {
                this.page = page;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
