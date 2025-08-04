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
         * <p>35A267BF-xxxx-54DB-8394-AA3B0742D833</p>
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
                this.name = model.name;
                this.overlapSize = model.overlapSize;
                this.size = model.size;
                this.sourceId = model.sourceId;
                this.status = model.status;
                this.separator = model.separator;
            } 

            /**
             * ChunkMode.
             */
            public Builder chunkMode(String chunkMode) {
                this.chunkMode = chunkMode;
                return this;
            }

            /**
             * ChunkSize.
             */
            public Builder chunkSize(String chunkSize) {
                this.chunkSize = chunkSize;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * DocumentType.
             */
            public Builder documentType(String documentType) {
                this.documentType = documentType;
                return this;
            }

            /**
             * EnableHeaders.
             */
            public Builder enableHeaders(String enableHeaders) {
                this.enableHeaders = enableHeaders;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OverlapSize.
             */
            public Builder overlapSize(String overlapSize) {
                this.overlapSize = overlapSize;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * SourceId.
             */
            public Builder sourceId(String sourceId) {
                this.sourceId = sourceId;
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
             * separator.
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
             * Documents.
             */
            public Builder documents(java.util.List<Documents> documents) {
                this.documents = documents;
                return this;
            }

            /**
             * IndexId.
             */
            public Builder indexId(String indexId) {
                this.indexId = indexId;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
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
             * TotalCount.
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
