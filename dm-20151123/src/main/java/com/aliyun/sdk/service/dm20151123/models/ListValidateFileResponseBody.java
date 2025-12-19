// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link ListValidateFileResponseBody} extends {@link TeaModel}
 *
 * <p>ListValidateFileResponseBody</p>
 */
public class ListValidateFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Files")
    private java.util.List<Files> files;

    @com.aliyun.core.annotation.NameInMap("HasNext")
    private Boolean hasNext;

    @com.aliyun.core.annotation.NameInMap("Page")
    private Integer page;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalPages")
    private Integer totalPages;

    @com.aliyun.core.annotation.NameInMap("TotalSize")
    private Integer totalSize;

    private ListValidateFileResponseBody(Builder builder) {
        this.files = builder.files;
        this.hasNext = builder.hasNext;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalPages = builder.totalPages;
        this.totalSize = builder.totalSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListValidateFileResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return files
     */
    public java.util.List<Files> getFiles() {
        return this.files;
    }

    /**
     * @return hasNext
     */
    public Boolean getHasNext() {
        return this.hasNext;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalPages
     */
    public Integer getTotalPages() {
        return this.totalPages;
    }

    /**
     * @return totalSize
     */
    public Integer getTotalSize() {
        return this.totalSize;
    }

    public static final class Builder {
        private java.util.List<Files> files; 
        private Boolean hasNext; 
        private Integer page; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalPages; 
        private Integer totalSize; 

        private Builder() {
        } 

        private Builder(ListValidateFileResponseBody model) {
            this.files = model.files;
            this.hasNext = model.hasNext;
            this.page = model.page;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalPages = model.totalPages;
            this.totalSize = model.totalSize;
        } 

        /**
         * Files.
         */
        public Builder files(java.util.List<Files> files) {
            this.files = files;
            return this;
        }

        /**
         * HasNext.
         */
        public Builder hasNext(Boolean hasNext) {
            this.hasNext = hasNext;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalPages.
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        /**
         * TotalSize.
         */
        public Builder totalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }

        public ListValidateFileResponseBody build() {
            return new ListValidateFileResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListValidateFileResponseBody} extends {@link TeaModel}
     *
     * <p>ListValidateFileResponseBody</p>
     */
    public static class Files extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CatchAllNum")
        private String catchAllNum;

        @com.aliyun.core.annotation.NameInMap("CompleteTime")
        private String completeTime;

        @com.aliyun.core.annotation.NameInMap("DoNotMailNum")
        private String doNotMailNum;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("InvalidNum")
        private String invalidNum;

        @com.aliyun.core.annotation.NameInMap("IsDownloadable")
        private Boolean isDownloadable;

        @com.aliyun.core.annotation.NameInMap("Percentage")
        private String percentage;

        @com.aliyun.core.annotation.NameInMap("ProcessedNum")
        private String processedNum;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TotalNum")
        private String totalNum;

        @com.aliyun.core.annotation.NameInMap("UnknownNum")
        private String unknownNum;

        @com.aliyun.core.annotation.NameInMap("UploadTime")
        private String uploadTime;

        @com.aliyun.core.annotation.NameInMap("ValidNum")
        private String validNum;

        private Files(Builder builder) {
            this.catchAllNum = builder.catchAllNum;
            this.completeTime = builder.completeTime;
            this.doNotMailNum = builder.doNotMailNum;
            this.fileId = builder.fileId;
            this.fileName = builder.fileName;
            this.invalidNum = builder.invalidNum;
            this.isDownloadable = builder.isDownloadable;
            this.percentage = builder.percentage;
            this.processedNum = builder.processedNum;
            this.status = builder.status;
            this.totalNum = builder.totalNum;
            this.unknownNum = builder.unknownNum;
            this.uploadTime = builder.uploadTime;
            this.validNum = builder.validNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Files create() {
            return builder().build();
        }

        /**
         * @return catchAllNum
         */
        public String getCatchAllNum() {
            return this.catchAllNum;
        }

        /**
         * @return completeTime
         */
        public String getCompleteTime() {
            return this.completeTime;
        }

        /**
         * @return doNotMailNum
         */
        public String getDoNotMailNum() {
            return this.doNotMailNum;
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return invalidNum
         */
        public String getInvalidNum() {
            return this.invalidNum;
        }

        /**
         * @return isDownloadable
         */
        public Boolean getIsDownloadable() {
            return this.isDownloadable;
        }

        /**
         * @return percentage
         */
        public String getPercentage() {
            return this.percentage;
        }

        /**
         * @return processedNum
         */
        public String getProcessedNum() {
            return this.processedNum;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return totalNum
         */
        public String getTotalNum() {
            return this.totalNum;
        }

        /**
         * @return unknownNum
         */
        public String getUnknownNum() {
            return this.unknownNum;
        }

        /**
         * @return uploadTime
         */
        public String getUploadTime() {
            return this.uploadTime;
        }

        /**
         * @return validNum
         */
        public String getValidNum() {
            return this.validNum;
        }

        public static final class Builder {
            private String catchAllNum; 
            private String completeTime; 
            private String doNotMailNum; 
            private String fileId; 
            private String fileName; 
            private String invalidNum; 
            private Boolean isDownloadable; 
            private String percentage; 
            private String processedNum; 
            private String status; 
            private String totalNum; 
            private String unknownNum; 
            private String uploadTime; 
            private String validNum; 

            private Builder() {
            } 

            private Builder(Files model) {
                this.catchAllNum = model.catchAllNum;
                this.completeTime = model.completeTime;
                this.doNotMailNum = model.doNotMailNum;
                this.fileId = model.fileId;
                this.fileName = model.fileName;
                this.invalidNum = model.invalidNum;
                this.isDownloadable = model.isDownloadable;
                this.percentage = model.percentage;
                this.processedNum = model.processedNum;
                this.status = model.status;
                this.totalNum = model.totalNum;
                this.unknownNum = model.unknownNum;
                this.uploadTime = model.uploadTime;
                this.validNum = model.validNum;
            } 

            /**
             * CatchAllNum.
             */
            public Builder catchAllNum(String catchAllNum) {
                this.catchAllNum = catchAllNum;
                return this;
            }

            /**
             * CompleteTime.
             */
            public Builder completeTime(String completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * DoNotMailNum.
             */
            public Builder doNotMailNum(String doNotMailNum) {
                this.doNotMailNum = doNotMailNum;
                return this;
            }

            /**
             * FileId.
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * InvalidNum.
             */
            public Builder invalidNum(String invalidNum) {
                this.invalidNum = invalidNum;
                return this;
            }

            /**
             * IsDownloadable.
             */
            public Builder isDownloadable(Boolean isDownloadable) {
                this.isDownloadable = isDownloadable;
                return this;
            }

            /**
             * Percentage.
             */
            public Builder percentage(String percentage) {
                this.percentage = percentage;
                return this;
            }

            /**
             * ProcessedNum.
             */
            public Builder processedNum(String processedNum) {
                this.processedNum = processedNum;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TotalNum.
             */
            public Builder totalNum(String totalNum) {
                this.totalNum = totalNum;
                return this;
            }

            /**
             * UnknownNum.
             */
            public Builder unknownNum(String unknownNum) {
                this.unknownNum = unknownNum;
                return this;
            }

            /**
             * UploadTime.
             */
            public Builder uploadTime(String uploadTime) {
                this.uploadTime = uploadTime;
                return this;
            }

            /**
             * ValidNum.
             */
            public Builder validNum(String validNum) {
                this.validNum = validNum;
                return this;
            }

            public Files build() {
                return new Files(this);
            } 

        } 

    }
}
