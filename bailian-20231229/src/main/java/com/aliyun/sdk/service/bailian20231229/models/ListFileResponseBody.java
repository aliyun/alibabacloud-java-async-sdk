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

        private Builder() {
        } 

        private Builder(ListFileResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.status = model.status;
            this.success = model.success;
        } 

        /**
         * <p>The error status code.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data field returned by the operation.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Requests throttling triggered.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8F97A63B-xxxx-527F-9D6E-467B6A7E8CF1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status code returned by the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful. Valid values:</p>
         * <ul>
         * <li>true: Successful. </li>
         * <li>false: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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

        @com.aliyun.core.annotation.NameInMap("ParseErrorMessage")
        private String parseErrorMessage;

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
            this.parseErrorMessage = builder.parseErrorMessage;
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
         * @return parseErrorMessage
         */
        public String getParseErrorMessage() {
            return this.parseErrorMessage;
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
            private String parseErrorMessage; 
            private String parser; 
            private Long sizeInBytes; 
            private String status; 
            private java.util.List<String> tags; 

            private Builder() {
            } 

            private Builder(FileList model) {
                this.categoryId = model.categoryId;
                this.createTime = model.createTime;
                this.fileId = model.fileId;
                this.fileName = model.fileName;
                this.fileType = model.fileType;
                this.parseErrorMessage = model.parseErrorMessage;
                this.parser = model.parser;
                this.sizeInBytes = model.sizeInBytes;
                this.status = model.status;
                this.tags = model.tags;
            } 

            /**
             * <p>The ID of the category to which the file belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cate_cdd11b1b79a74e8bbd675c356a91ee35xxxxxxxx</p>
             */
            public Builder categoryId(String categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * <p>The timestamp when the file was added to Alibaba Cloud Model Studio. Format: yyyy-MM-dd HH:mm:ss. Time zone: UTC+8.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-09-09 11:03:35</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The file ID, which is the <code>FileId</code> returned by the <strong>AddFile</strong> operation. You can also obtain it on the &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a>&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a> page by clicking the icon next to the file name.</p>
             * 
             * <strong>example:</strong>
             * <p>file_5ff599b3455a45db8c41b0054b361518_xxxxxxxx</p>
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>The file name.</p>
             * 
             * <strong>example:</strong>
             * <p>product-overview.pdf</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The file format type. Valid values: pdf, docx, doc, txt, md, pptx, ppt, xlsx, xls, html, png, jpg, jpeg, bmp, and gif.</p>
             * 
             * <strong>example:</strong>
             * <p>docx</p>
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * <p>The reason for the parsing failure.</p>
             * 
             * <strong>example:</strong>
             * <p>Error Message</p>
             */
            public Builder parseErrorMessage(String parseErrorMessage) {
                this.parseErrorMessage = parseErrorMessage;
                return this;
            }

            /**
             * <p>The document parser. Valid values:</p>
             * <ul>
             * <li>DASHSCOPE_DOCMIND: Alibaba Cloud intelligent document parsing.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DASHSCOPE_DOCMIND</p>
             */
            public Builder parser(String parser) {
                this.parser = parser;
                return this;
            }

            /**
             * <p>The file size, in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>512</p>
             */
            public Builder sizeInBytes(Long sizeInBytes) {
                this.sizeInBytes = sizeInBytes;
                return this;
            }

            /**
             * <p>The file parsing status. Valid values:</p>
             * <ul>
             * <li>INIT: Initialization. The file is waiting to be scheduled.</li>
             * <li>PARSING: Parsing in progress.</li>
             * <li>PARSE_SUCCESS: Parsing succeeded.</li>
             * <li>PARSE_FAILED: Parsing failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PARSE_SUCCESS</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The list of tags associated with the file. A document can be associated with multiple tags.</p>
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.fileList = model.fileList;
                this.hasNext = model.hasNext;
                this.maxResults = model.maxResults;
                this.nextToken = model.nextToken;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The list of files in the category.</p>
             */
            public Builder fileList(java.util.List<FileList> fileList) {
                this.fileList = fileList;
                return this;
            }

            /**
             * <p>Indicates whether a next page exists for the category data that matches the query conditions. Valid values:</p>
             * <ul>
             * <li>true: A next page exists.</li>
             * <li>false: No next page exists.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasNext(Boolean hasNext) {
                this.hasNext = hasNext;
                return this;
            }

            /**
             * <p>The number of entries per page for a paged query.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * <p>The pagination token returned by this call.</p>
             * 
             * <strong>example:</strong>
             * <p>4jzbJk9J6lNeuXD9hP0viA==</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>48</p>
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
