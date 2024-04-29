// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDocumentCollectionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDocumentCollectionsResponseBody</p>
 */
public class ListDocumentCollectionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ListDocumentCollectionsResponseBody(Builder builder) {
        this.count = builder.count;
        this.items = builder.items;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDocumentCollectionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
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

    public static final class Builder {
        private Integer count; 
        private Items items; 
        private String message; 
        private String requestId; 
        private String status; 

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
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
         * RequestId.
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

        public ListDocumentCollectionsResponseBody build() {
            return new ListDocumentCollectionsResponseBody(this);
        } 

    } 

    public static class CollectionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CollectionName")
        private String collectionName;

        @com.aliyun.core.annotation.NameInMap("Dimension")
        private Integer dimension;

        @com.aliyun.core.annotation.NameInMap("EmbeddingModel")
        private String embeddingModel;

        @com.aliyun.core.annotation.NameInMap("FullTextRetrievalFields")
        private String fullTextRetrievalFields;

        @com.aliyun.core.annotation.NameInMap("Metadata")
        private String metadata;

        @com.aliyun.core.annotation.NameInMap("Metrics")
        private String metrics;

        @com.aliyun.core.annotation.NameInMap("Parser")
        private String parser;

        private CollectionList(Builder builder) {
            this.collectionName = builder.collectionName;
            this.dimension = builder.dimension;
            this.embeddingModel = builder.embeddingModel;
            this.fullTextRetrievalFields = builder.fullTextRetrievalFields;
            this.metadata = builder.metadata;
            this.metrics = builder.metrics;
            this.parser = builder.parser;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CollectionList create() {
            return builder().build();
        }

        /**
         * @return collectionName
         */
        public String getCollectionName() {
            return this.collectionName;
        }

        /**
         * @return dimension
         */
        public Integer getDimension() {
            return this.dimension;
        }

        /**
         * @return embeddingModel
         */
        public String getEmbeddingModel() {
            return this.embeddingModel;
        }

        /**
         * @return fullTextRetrievalFields
         */
        public String getFullTextRetrievalFields() {
            return this.fullTextRetrievalFields;
        }

        /**
         * @return metadata
         */
        public String getMetadata() {
            return this.metadata;
        }

        /**
         * @return metrics
         */
        public String getMetrics() {
            return this.metrics;
        }

        /**
         * @return parser
         */
        public String getParser() {
            return this.parser;
        }

        public static final class Builder {
            private String collectionName; 
            private Integer dimension; 
            private String embeddingModel; 
            private String fullTextRetrievalFields; 
            private String metadata; 
            private String metrics; 
            private String parser; 

            /**
             * CollectionName.
             */
            public Builder collectionName(String collectionName) {
                this.collectionName = collectionName;
                return this;
            }

            /**
             * Dimension.
             */
            public Builder dimension(Integer dimension) {
                this.dimension = dimension;
                return this;
            }

            /**
             * EmbeddingModel.
             */
            public Builder embeddingModel(String embeddingModel) {
                this.embeddingModel = embeddingModel;
                return this;
            }

            /**
             * FullTextRetrievalFields.
             */
            public Builder fullTextRetrievalFields(String fullTextRetrievalFields) {
                this.fullTextRetrievalFields = fullTextRetrievalFields;
                return this;
            }

            /**
             * Metadata.
             */
            public Builder metadata(String metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * Metrics.
             */
            public Builder metrics(String metrics) {
                this.metrics = metrics;
                return this;
            }

            /**
             * Parser.
             */
            public Builder parser(String parser) {
                this.parser = parser;
                return this;
            }

            public CollectionList build() {
                return new CollectionList(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CollectionList")
        private java.util.List < CollectionList> collectionList;

        private Items(Builder builder) {
            this.collectionList = builder.collectionList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return collectionList
         */
        public java.util.List < CollectionList> getCollectionList() {
            return this.collectionList;
        }

        public static final class Builder {
            private java.util.List < CollectionList> collectionList; 

            /**
             * CollectionList.
             */
            public Builder collectionList(java.util.List < CollectionList> collectionList) {
                this.collectionList = collectionList;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
