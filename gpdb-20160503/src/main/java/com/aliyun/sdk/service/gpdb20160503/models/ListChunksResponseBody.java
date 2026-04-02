// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link ListChunksResponseBody} extends {@link TeaModel}
 *
 * <p>ListChunksResponseBody</p>
 */
public class ListChunksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Chunks")
    private Chunks chunks;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Long pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Long totalRecordCount;

    private ListChunksResponseBody(Builder builder) {
        this.chunks = builder.chunks;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChunksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chunks
     */
    public Chunks getChunks() {
        return this.chunks;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Long getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private Chunks chunks; 
        private Long pageNumber; 
        private Long pageRecordCount; 
        private String requestId; 
        private Long totalRecordCount; 

        private Builder() {
        } 

        private Builder(ListChunksResponseBody model) {
            this.chunks = model.chunks;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * Chunks.
         */
        public Builder chunks(Chunks chunks) {
            this.chunks = chunks;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageRecordCount.
         */
        public Builder pageRecordCount(Long pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
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
         * TotalRecordCount.
         */
        public Builder totalRecordCount(Long totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public ListChunksResponseBody build() {
            return new ListChunksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListChunksResponseBody} extends {@link TeaModel}
     *
     * <p>ListChunksResponseBody</p>
     */
    public static class Vector extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("vector")
        private java.util.List<Double> vector;

        private Vector(Builder builder) {
            this.vector = builder.vector;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Vector create() {
            return builder().build();
        }

        /**
         * @return vector
         */
        public java.util.List<Double> getVector() {
            return this.vector;
        }

        public static final class Builder {
            private java.util.List<Double> vector; 

            private Builder() {
            } 

            private Builder(Vector model) {
                this.vector = model.vector;
            } 

            /**
             * vector.
             */
            public Builder vector(java.util.List<Double> vector) {
                this.vector = vector;
                return this;
            }

            public Vector build() {
                return new Vector(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListChunksResponseBody} extends {@link TeaModel}
     *
     * <p>ListChunksResponseBody</p>
     */
    public static class ChunksChunks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("LoaderMetadata")
        private String loaderMetadata;

        @com.aliyun.core.annotation.NameInMap("Metadata")
        private java.util.Map<String, ?> metadata;

        @com.aliyun.core.annotation.NameInMap("PageIndex")
        private Long pageIndex;

        @com.aliyun.core.annotation.NameInMap("Vector")
        private Vector vector;

        private ChunksChunks(Builder builder) {
            this.content = builder.content;
            this.fileName = builder.fileName;
            this.id = builder.id;
            this.loaderMetadata = builder.loaderMetadata;
            this.metadata = builder.metadata;
            this.pageIndex = builder.pageIndex;
            this.vector = builder.vector;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChunksChunks create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return loaderMetadata
         */
        public String getLoaderMetadata() {
            return this.loaderMetadata;
        }

        /**
         * @return metadata
         */
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        /**
         * @return pageIndex
         */
        public Long getPageIndex() {
            return this.pageIndex;
        }

        /**
         * @return vector
         */
        public Vector getVector() {
            return this.vector;
        }

        public static final class Builder {
            private String content; 
            private String fileName; 
            private String id; 
            private String loaderMetadata; 
            private java.util.Map<String, ?> metadata; 
            private Long pageIndex; 
            private Vector vector; 

            private Builder() {
            } 

            private Builder(ChunksChunks model) {
                this.content = model.content;
                this.fileName = model.fileName;
                this.id = model.id;
                this.loaderMetadata = model.loaderMetadata;
                this.metadata = model.metadata;
                this.pageIndex = model.pageIndex;
                this.vector = model.vector;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
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
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * LoaderMetadata.
             */
            public Builder loaderMetadata(String loaderMetadata) {
                this.loaderMetadata = loaderMetadata;
                return this;
            }

            /**
             * Metadata.
             */
            public Builder metadata(java.util.Map<String, ?> metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * PageIndex.
             */
            public Builder pageIndex(Long pageIndex) {
                this.pageIndex = pageIndex;
                return this;
            }

            /**
             * Vector.
             */
            public Builder vector(Vector vector) {
                this.vector = vector;
                return this;
            }

            public ChunksChunks build() {
                return new ChunksChunks(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListChunksResponseBody} extends {@link TeaModel}
     *
     * <p>ListChunksResponseBody</p>
     */
    public static class Chunks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("chunks")
        private java.util.List<ChunksChunks> chunks;

        private Chunks(Builder builder) {
            this.chunks = builder.chunks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Chunks create() {
            return builder().build();
        }

        /**
         * @return chunks
         */
        public java.util.List<ChunksChunks> getChunks() {
            return this.chunks;
        }

        public static final class Builder {
            private java.util.List<ChunksChunks> chunks; 

            private Builder() {
            } 

            private Builder(Chunks model) {
                this.chunks = model.chunks;
            } 

            /**
             * chunks.
             */
            public Builder chunks(java.util.List<ChunksChunks> chunks) {
                this.chunks = chunks;
                return this;
            }

            public Chunks build() {
                return new Chunks(this);
            } 

        } 

    }
}
