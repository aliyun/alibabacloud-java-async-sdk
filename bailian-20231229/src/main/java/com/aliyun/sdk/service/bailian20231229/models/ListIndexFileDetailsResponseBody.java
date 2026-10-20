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
 * {@link ListIndexFileDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>ListIndexFileDetailsResponseBody</p>
 */
public class ListIndexFileDetailsResponseBody extends TeaModel {
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

    private ListIndexFileDetailsResponseBody(Builder builder) {
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

    public static ListIndexFileDetailsResponseBody create() {
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

        private Builder(ListIndexFileDetailsResponseBody model) {
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
         * <p>InvalidParameter</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The business data field of the operation.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Required parameter(%s) missing or invalid, please check the request parameters.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>35A267BF-xxxx-54DB-8394-AA3B0742D833</p>
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
         * <li>true: Successful.</li>
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

        public ListIndexFileDetailsResponseBody build() {
            return new ListIndexFileDetailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListIndexFileDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>ListIndexFileDetailsResponseBody</p>
     */
    public static class Documents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChunkMode")
        private String chunkMode;

        @com.aliyun.core.annotation.NameInMap("ChunkSize")
        private String chunkSize;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("DocumentType")
        private String documentType;

        @com.aliyun.core.annotation.NameInMap("EnableHeaders")
        private String enableHeaders;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("MetaExtractInfo")
        private String metaExtractInfo;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OverlapSize")
        private String overlapSize;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("SourceId")
        private String sourceId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("separator")
        private String separator;

        private Documents(Builder builder) {
            this.chunkMode = builder.chunkMode;
            this.chunkSize = builder.chunkSize;
            this.code = builder.code;
            this.documentType = builder.documentType;
            this.enableHeaders = builder.enableHeaders;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.message = builder.message;
            this.metaExtractInfo = builder.metaExtractInfo;
            this.name = builder.name;
            this.overlapSize = builder.overlapSize;
            this.size = builder.size;
            this.sourceId = builder.sourceId;
            this.status = builder.status;
            this.separator = builder.separator;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Documents create() {
            return builder().build();
        }

        /**
         * @return chunkMode
         */
        public String getChunkMode() {
            return this.chunkMode;
        }

        /**
         * @return chunkSize
         */
        public String getChunkSize() {
            return this.chunkSize;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return documentType
         */
        public String getDocumentType() {
            return this.documentType;
        }

        /**
         * @return enableHeaders
         */
        public String getEnableHeaders() {
            return this.enableHeaders;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return metaExtractInfo
         */
        public String getMetaExtractInfo() {
            return this.metaExtractInfo;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return overlapSize
         */
        public String getOverlapSize() {
            return this.overlapSize;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return sourceId
         */
        public String getSourceId() {
            return this.sourceId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return separator
         */
        public String getSeparator() {
            return this.separator;
        }

        public static final class Builder {
            private String chunkMode; 
            private String chunkSize; 
            private String code; 
            private String documentType; 
            private String enableHeaders; 
            private Long gmtModified; 
            private String id; 
            private String message; 
            private String metaExtractInfo; 
            private String name; 
            private String overlapSize; 
            private Integer size; 
            private String sourceId; 
            private String status; 
            private String separator; 

            private Builder() {
            } 

            private Builder(Documents model) {
                this.chunkMode = model.chunkMode;
                this.chunkSize = model.chunkSize;
                this.code = model.code;
                this.documentType = model.documentType;
                this.enableHeaders = model.enableHeaders;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.message = model.message;
                this.metaExtractInfo = model.metaExtractInfo;
                this.name = model.name;
                this.overlapSize = model.overlapSize;
                this.size = model.size;
                this.sourceId = model.sourceId;
                this.status = model.status;
                this.separator = model.separator;
            } 

            /**
             * <p>The custom chunking mode.</p>
             * 
             * <strong>example:</strong>
             * <p>DashSplitter</p>
             */
            public Builder chunkMode(String chunkMode) {
                this.chunkMode = chunkMode;
                return this;
            }

            /**
             * <p>The chunk length, which is the number of characters in a text chunk.</p>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder chunkSize(String chunkSize) {
                this.chunkSize = chunkSize;
                return this;
            }

            /**
             * <p>The file import error status code.</p>
             * 
             * <strong>example:</strong>
             * <p>110002</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The file format type. Valid values: pdf, docx, doc, txt, md, pptx, ppt, png, jpg, jpeg, bmp, gif, EXCEL.</p>
             * 
             * <strong>example:</strong>
             * <p>pdf</p>
             */
            public Builder documentType(String documentType) {
                this.documentType = documentType;
                return this;
            }

            /**
             * <p>Indicates whether Excel file headers support concatenation.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableHeaders(String enableHeaders) {
                this.enableHeaders = enableHeaders;
                return this;
            }

            /**
             * <p>The time when the file was imported to the knowledge base, in UNIX timestamp format.</p>
             * 
             * <strong>example:</strong>
             * <p>1744856423000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The file ID.</p>
             * 
             * <strong>example:</strong>
             * <p>doc_c134aa2073204a5d936d870bf960f56axxxxxxxx</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The file import error message.</p>
             * 
             * <strong>example:</strong>
             * <p>check fileUrlKey[file_path] / fileNameKey[null] / fileExtensionKey[file_extension] is invalid</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The metadata extracted from the document.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;doc_summary&quot;: [&quot;Example 1.&quot;],
             *   &quot;health_rule&quot;: [&quot;Example 2&quot;]
             * }</p>
             */
            public Builder metaExtractInfo(String metaExtractInfo) {
                this.metaExtractInfo = metaExtractInfo;
                return this;
            }

            /**
             * <p>The file name.</p>
             * 
             * <strong>example:</strong>
             * <p>TranslationPlatformO&amp;MDocument.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The chunk overlap length.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder overlapSize(String overlapSize) {
                this.overlapSize = overlapSize;
                return this;
            }

            /**
             * <p>The file size, in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>996764</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The category ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cate_21a407a3372c4ba7aedc649709143f0cxxxxxxxx</p>
             */
            public Builder sourceId(String sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * <p>The file import status. Valid values:</p>
             * <ul>
             * <li>INSERT_ERROR: File import failed.</li>
             * <li>RUNNING: File import in progress.</li>
             * <li>DELETED: File deleted.</li>
             * <li>FINISH: File import succeeded.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The sentence separator.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot; &quot;</p>
             */
            public Builder separator(String separator) {
                this.separator = separator;
                return this;
            }

            public Documents build() {
                return new Documents(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListIndexFileDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>ListIndexFileDetailsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Documents")
        private java.util.List<Documents> documents;

        @com.aliyun.core.annotation.NameInMap("IndexId")
        private String indexId;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.documents = builder.documents;
            this.indexId = builder.indexId;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return documents
         */
        public java.util.List<Documents> getDocuments() {
            return this.documents;
        }

        /**
         * @return indexId
         */
        public String getIndexId() {
            return this.indexId;
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
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<Documents> documents; 
            private String indexId; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.documents = model.documents;
                this.indexId = model.indexId;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The list of files in the knowledge base, sorted in descending order by file import time (consistent with the console).</p>
             */
            public Builder documents(java.util.List<Documents> documents) {
                this.documents = documents;
                return this;
            }

            /**
             * <p>The knowledge base ID.</p>
             * 
             * <strong>example:</strong>
             * <p>79c0alxxxx</p>
             */
            public Builder indexId(String indexId) {
                this.indexId = indexId;
                return this;
            }

            /**
             * <p>The returned page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The returned number of items per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of returned results.</p>
             * 
             * <strong>example:</strong>
             * <p>2437</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
