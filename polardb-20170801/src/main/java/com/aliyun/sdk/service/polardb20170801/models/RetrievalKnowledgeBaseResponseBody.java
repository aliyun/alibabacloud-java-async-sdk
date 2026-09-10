// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link RetrievalKnowledgeBaseResponseBody} extends {@link TeaModel}
 *
 * <p>RetrievalKnowledgeBaseResponseBody</p>
 */
public class RetrievalKnowledgeBaseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("QueryText")
    private String queryText;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCount")
    private Integer resultCount;

    @com.aliyun.core.annotation.NameInMap("Results")
    private java.util.List<Results> results;

    private RetrievalKnowledgeBaseResponseBody(Builder builder) {
        this.queryText = builder.queryText;
        this.requestId = builder.requestId;
        this.resultCount = builder.resultCount;
        this.results = builder.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RetrievalKnowledgeBaseResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return queryText
     */
    public String getQueryText() {
        return this.queryText;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultCount
     */
    public Integer getResultCount() {
        return this.resultCount;
    }

    /**
     * @return results
     */
    public java.util.List<Results> getResults() {
        return this.results;
    }

    public static final class Builder {
        private String queryText; 
        private String requestId; 
        private Integer resultCount; 
        private java.util.List<Results> results; 

        private Builder() {
        } 

        private Builder(RetrievalKnowledgeBaseResponseBody model) {
            this.queryText = model.queryText;
            this.requestId = model.requestId;
            this.resultCount = model.resultCount;
            this.results = model.results;
        } 

        /**
         * <p>The query text.</p>
         * 
         * <strong>example:</strong>
         * <p>Financial report</p>
         */
        public Builder queryText(String queryText) {
            this.queryText = queryText;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>CD35F3-F3-44CA-AFFF-BAF869******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of results.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder resultCount(Integer resultCount) {
            this.resultCount = resultCount;
            return this;
        }

        /**
         * <p>The search results.</p>
         */
        public Builder results(java.util.List<Results> results) {
            this.results = results;
            return this;
        }

        public RetrievalKnowledgeBaseResponseBody build() {
            return new RetrievalKnowledgeBaseResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RetrievalKnowledgeBaseResponseBody} extends {@link TeaModel}
     *
     * <p>RetrievalKnowledgeBaseResponseBody</p>
     */
    public static class ImageResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DocumentIndex")
        private Integer documentIndex;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("ItemRef")
        private String itemRef;

        @com.aliyun.core.annotation.NameInMap("MimeType")
        private String mimeType;

        @com.aliyun.core.annotation.NameInMap("Uri")
        private String uri;

        private ImageResources(Builder builder) {
            this.documentIndex = builder.documentIndex;
            this.id = builder.id;
            this.itemRef = builder.itemRef;
            this.mimeType = builder.mimeType;
            this.uri = builder.uri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageResources create() {
            return builder().build();
        }

        /**
         * @return documentIndex
         */
        public Integer getDocumentIndex() {
            return this.documentIndex;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return itemRef
         */
        public String getItemRef() {
            return this.itemRef;
        }

        /**
         * @return mimeType
         */
        public String getMimeType() {
            return this.mimeType;
        }

        /**
         * @return uri
         */
        public String getUri() {
            return this.uri;
        }

        public static final class Builder {
            private Integer documentIndex; 
            private String id; 
            private String itemRef; 
            private String mimeType; 
            private String uri; 

            private Builder() {
            } 

            private Builder(ImageResources model) {
                this.documentIndex = model.documentIndex;
                this.id = model.id;
                this.itemRef = model.itemRef;
                this.mimeType = model.mimeType;
                this.uri = model.uri;
            } 

            /**
             * <p>The index of the source document that the image belongs to, starting from 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder documentIndex(Integer documentIndex) {
                this.documentIndex = documentIndex;
                return this;
            }

            /**
             * <p>The unique ID of the image resource.</p>
             * 
             * <strong>example:</strong>
             * <p>document-0/pictures/1</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The element reference of the image in the Docling source document structure.</p>
             * 
             * <strong>example:</strong>
             * <p>#/pictures/1</p>
             */
            public Builder itemRef(String itemRef) {
                this.itemRef = itemRef;
                return this;
            }

            /**
             * <p>The media type of the image resource.</p>
             * 
             * <strong>example:</strong>
             * <p>image/png</p>
             */
            public Builder mimeType(String mimeType) {
                this.mimeType = mimeType;
                return this;
            }

            /**
             * <p>The OSS URI of the image resource.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://my-bucket/results/my-space/doc-001/artifacts/image-1.png</p>
             */
            public Builder uri(String uri) {
                this.uri = uri;
                return this;
            }

            public ImageResources build() {
                return new ImageResources(this);
            } 

        } 

    }
    /**
     * 
     * {@link RetrievalKnowledgeBaseResponseBody} extends {@link TeaModel}
     *
     * <p>RetrievalKnowledgeBaseResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Captions")
        private java.util.List<String> captions;

        @com.aliyun.core.annotation.NameInMap("DocItems")
        private java.util.List<String> docItems;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("Headings")
        private java.util.List<String> headings;

        @com.aliyun.core.annotation.NameInMap("ImageResources")
        private java.util.List<ImageResources> imageResources;

        @com.aliyun.core.annotation.NameInMap("Metadata")
        private String metadata;

        @com.aliyun.core.annotation.NameInMap("PageNumbers")
        private java.util.List<Integer> pageNumbers;

        @com.aliyun.core.annotation.NameInMap("ShardContent")
        private String shardContent;

        @com.aliyun.core.annotation.NameInMap("ShardIndex")
        private Integer shardIndex;

        @com.aliyun.core.annotation.NameInMap("SimilarityScore")
        private Double similarityScore;

        private Results(Builder builder) {
            this.captions = builder.captions;
            this.docItems = builder.docItems;
            this.fileId = builder.fileId;
            this.fileName = builder.fileName;
            this.headings = builder.headings;
            this.imageResources = builder.imageResources;
            this.metadata = builder.metadata;
            this.pageNumbers = builder.pageNumbers;
            this.shardContent = builder.shardContent;
            this.shardIndex = builder.shardIndex;
            this.similarityScore = builder.similarityScore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return captions
         */
        public java.util.List<String> getCaptions() {
            return this.captions;
        }

        /**
         * @return docItems
         */
        public java.util.List<String> getDocItems() {
            return this.docItems;
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
         * @return headings
         */
        public java.util.List<String> getHeadings() {
            return this.headings;
        }

        /**
         * @return imageResources
         */
        public java.util.List<ImageResources> getImageResources() {
            return this.imageResources;
        }

        /**
         * @return metadata
         */
        public String getMetadata() {
            return this.metadata;
        }

        /**
         * @return pageNumbers
         */
        public java.util.List<Integer> getPageNumbers() {
            return this.pageNumbers;
        }

        /**
         * @return shardContent
         */
        public String getShardContent() {
            return this.shardContent;
        }

        /**
         * @return shardIndex
         */
        public Integer getShardIndex() {
            return this.shardIndex;
        }

        /**
         * @return similarityScore
         */
        public Double getSimilarityScore() {
            return this.similarityScore;
        }

        public static final class Builder {
            private java.util.List<String> captions; 
            private java.util.List<String> docItems; 
            private String fileId; 
            private String fileName; 
            private java.util.List<String> headings; 
            private java.util.List<ImageResources> imageResources; 
            private String metadata; 
            private java.util.List<Integer> pageNumbers; 
            private String shardContent; 
            private Integer shardIndex; 
            private Double similarityScore; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.captions = model.captions;
                this.docItems = model.docItems;
                this.fileId = model.fileId;
                this.fileName = model.fileName;
                this.headings = model.headings;
                this.imageResources = model.imageResources;
                this.metadata = model.metadata;
                this.pageNumbers = model.pageNumbers;
                this.shardContent = model.shardContent;
                this.shardIndex = model.shardIndex;
                this.similarityScore = model.similarityScore;
            } 

            /**
             * <p>The list of figure or table captions associated with the chunk.</p>
             */
            public Builder captions(java.util.List<String> captions) {
                this.captions = captions;
                return this;
            }

            /**
             * <p>The list of Docling source document structured element references associated with the chunk. You can use these references to precisely locate original elements.</p>
             */
            public Builder docItems(java.util.List<String> docItems) {
                this.docItems = docItems;
                return this;
            }

            /**
             * <p>The unique ID of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>91b97b71-xxxx-xxxx-xxxx-33c6a6341cdc</p>
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>The name of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>2024FinancialReport.pdf</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The chain of section headings that the chunk belongs to.</p>
             */
            public Builder headings(java.util.List<String> headings) {
                this.headings = headings;
                return this;
            }

            /**
             * <p>The list of image resources referenced by the chunk.</p>
             */
            public Builder imageResources(java.util.List<ImageResources> imageResources) {
                this.imageResources = imageResources;
                return this;
            }

            /**
             * <p>The metadata.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder metadata(String metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The list of page numbers that the chunk belongs to.</p>
             */
            public Builder pageNumbers(java.util.List<Integer> pageNumbers) {
                this.pageNumbers = pageNumbers;
                return this;
            }

            /**
             * <p>The text content of the chunk.</p>
             * 
             * <strong>example:</strong>
             * <p>Financial report</p>
             */
            public Builder shardContent(String shardContent) {
                this.shardContent = shardContent;
                return this;
            }

            /**
             * <p>The index of the chunk.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder shardIndex(Integer shardIndex) {
                this.shardIndex = shardIndex;
                return this;
            }

            /**
             * <p>The similarity score.</p>
             * 
             * <strong>example:</strong>
             * <p>0.8</p>
             */
            public Builder similarityScore(Double similarityScore) {
                this.similarityScore = similarityScore;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
