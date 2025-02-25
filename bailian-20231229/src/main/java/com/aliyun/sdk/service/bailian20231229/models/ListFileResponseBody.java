// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

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
 * {@link ListFileResponseBody} extends {@link TeaModel}
 *
 * <p>ListFileResponseBody</p>
 */
public class ListFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListFileResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFileResponseBody create() {
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String status; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>8F97A63B-55F1-527F-9D6E-467B6A7E8CF1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListFileResponseBody build() {
            return new ListFileResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFileResponseBody} extends {@link TeaModel}
     *
     * <p>ListFileResponseBody</p>
     */
    public static class FileList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryId")
        private String categoryId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileType")
        private String fileType;

        @com.aliyun.core.annotation.NameInMap("Parser")
        private String parser;

        @com.aliyun.core.annotation.NameInMap("SizeInBytes")
        private Long sizeInBytes;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<String> tags;

        private FileList(Builder builder) {
            this.categoryId = builder.categoryId;
            this.createTime = builder.createTime;
            this.fileId = builder.fileId;
            this.fileName = builder.fileName;
            this.fileType = builder.fileType;
            this.parser = builder.parser;
            this.sizeInBytes = builder.sizeInBytes;
            this.status = builder.status;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileList create() {
            return builder().build();
        }

        /**
         * @return categoryId
         */
        public String getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
         * @return fileType
         */
        public String getFileType() {
            return this.fileType;
        }

        /**
         * @return parser
         */
        public String getParser() {
            return this.parser;
        }

        /**
         * @return sizeInBytes
         */
        public Long getSizeInBytes() {
            return this.sizeInBytes;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String categoryId; 
            private String createTime; 
            private String fileId; 
            private String fileName; 
            private String fileType; 
            private String parser; 
            private Long sizeInBytes; 
            private String status; 
            private java.util.List<String> tags; 

            /**
             * CategoryId.
             */
            public Builder categoryId(String categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * FileType.
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * Parser.
             */
            public Builder parser(String parser) {
                this.parser = parser;
                return this;
            }

            /**
             * SizeInBytes.
             */
            public Builder sizeInBytes(Long sizeInBytes) {
                this.sizeInBytes = sizeInBytes;
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
             * Tags.
             */
            public Builder tags(java.util.List<String> tags) {
                this.tags = tags;
                return this;
            }

            public FileList build() {
                return new FileList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListFileResponseBody} extends {@link TeaModel}
     *
     * <p>ListFileResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileList")
        private java.util.List<FileList> fileList;

        @com.aliyun.core.annotation.NameInMap("HasNext")
        private Boolean hasNext;

        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.fileList = builder.fileList;
            this.hasNext = builder.hasNext;
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return fileList
         */
        public java.util.List<FileList> getFileList() {
            return this.fileList;
        }

        /**
         * @return hasNext
         */
        public Boolean getHasNext() {
            return this.hasNext;
        }

        /**
         * @return maxResults
         */
        public Integer getMaxResults() {
            return this.maxResults;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<FileList> fileList; 
            private Boolean hasNext; 
            private Integer maxResults; 
            private String nextToken; 
            private Integer totalCount; 

            /**
             * FileList.
             */
            public Builder fileList(java.util.List<FileList> fileList) {
                this.fileList = fileList;
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
             * MaxResults.
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * NextToken.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
