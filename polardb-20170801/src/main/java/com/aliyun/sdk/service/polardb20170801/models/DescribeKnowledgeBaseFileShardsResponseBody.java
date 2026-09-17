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
 * {@link DescribeKnowledgeBaseFileShardsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeKnowledgeBaseFileShardsResponseBody</p>
 */
public class DescribeKnowledgeBaseFileShardsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Shards")
    private java.util.List<Shards> shards;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeKnowledgeBaseFileShardsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.shards = builder.shards;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKnowledgeBaseFileShardsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
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
     * @return shards
     */
    public java.util.List<Shards> getShards() {
        return this.shards;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<Shards> shards; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeKnowledgeBaseFileShardsResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.shards = model.shards;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of records on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The number of entries per page in a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>3E5CD764-xxxx-xxxx-xxxx-20E0DE84B2AF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The shard information.</p>
         */
        public Builder shards(java.util.List<Shards> shards) {
            this.shards = shards;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeKnowledgeBaseFileShardsResponseBody build() {
            return new DescribeKnowledgeBaseFileShardsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeKnowledgeBaseFileShardsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeKnowledgeBaseFileShardsResponseBody</p>
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
             * <p>The index of the source document to which the image belongs, starting from 0.</p>
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
     * {@link DescribeKnowledgeBaseFileShardsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeKnowledgeBaseFileShardsResponseBody</p>
     */
    public static class Shards extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Captions")
        private java.util.List<String> captions;

        @com.aliyun.core.annotation.NameInMap("DocItems")
        private java.util.List<String> docItems;

        @com.aliyun.core.annotation.NameInMap("Headings")
        private java.util.List<String> headings;

        @com.aliyun.core.annotation.NameInMap("ImageResources")
        private java.util.List<ImageResources> imageResources;

        @com.aliyun.core.annotation.NameInMap("PageNumbers")
        private java.util.List<String> pageNumbers;

        @com.aliyun.core.annotation.NameInMap("ShardContent")
        private String shardContent;

        @com.aliyun.core.annotation.NameInMap("ShardIndex")
        private Integer shardIndex;

        private Shards(Builder builder) {
            this.captions = builder.captions;
            this.docItems = builder.docItems;
            this.headings = builder.headings;
            this.imageResources = builder.imageResources;
            this.pageNumbers = builder.pageNumbers;
            this.shardContent = builder.shardContent;
            this.shardIndex = builder.shardIndex;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Shards create() {
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
         * @return pageNumbers
         */
        public java.util.List<String> getPageNumbers() {
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

        public static final class Builder {
            private java.util.List<String> captions; 
            private java.util.List<String> docItems; 
            private java.util.List<String> headings; 
            private java.util.List<ImageResources> imageResources; 
            private java.util.List<String> pageNumbers; 
            private String shardContent; 
            private Integer shardIndex; 

            private Builder() {
            } 

            private Builder(Shards model) {
                this.captions = model.captions;
                this.docItems = model.docItems;
                this.headings = model.headings;
                this.imageResources = model.imageResources;
                this.pageNumbers = model.pageNumbers;
                this.shardContent = model.shardContent;
                this.shardIndex = model.shardIndex;
            } 

            /**
             * <p>The list of figure or table captions associated with the shard.</p>
             */
            public Builder captions(java.util.List<String> captions) {
                this.captions = captions;
                return this;
            }

            /**
             * <p>The list of Docling source document structured element references associated with the shard. You can use these references to precisely locate original document elements.</p>
             */
            public Builder docItems(java.util.List<String> docItems) {
                this.docItems = docItems;
                return this;
            }

            /**
             * <p>The chain of section headings to which the shard belongs.</p>
             */
            public Builder headings(java.util.List<String> headings) {
                this.headings = headings;
                return this;
            }

            /**
             * <p>The list of image resources referenced by the shard.</p>
             */
            public Builder imageResources(java.util.List<ImageResources> imageResources) {
                this.imageResources = imageResources;
                return this;
            }

            /**
             * <p>The list of page numbers to which the shard belongs.</p>
             */
            public Builder pageNumbers(java.util.List<String> pageNumbers) {
                this.pageNumbers = pageNumbers;
                return this;
            }

            /**
             * <p>The text content of the shard.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder shardContent(String shardContent) {
                this.shardContent = shardContent;
                return this;
            }

            /**
             * <p>The index of the shard.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder shardIndex(Integer shardIndex) {
                this.shardIndex = shardIndex;
                return this;
            }

            public Shards build() {
                return new Shards(this);
            } 

        } 

    }
}
