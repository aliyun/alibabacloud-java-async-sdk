// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryContentResponseBody} extends {@link TeaModel}
 *
 * <p>QueryContentResponseBody</p>
 */
public class QueryContentResponseBody extends TeaModel {
    @NameInMap("EmbeddingTokens")
    private String embeddingTokens;

    @NameInMap("Matches")
    private Matches matches;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private QueryContentResponseBody(Builder builder) {
        this.embeddingTokens = builder.embeddingTokens;
        this.matches = builder.matches;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryContentResponseBody create() {
        return builder().build();
    }

    /**
     * @return embeddingTokens
     */
    public String getEmbeddingTokens() {
        return this.embeddingTokens;
    }

    /**
     * @return matches
     */
    public Matches getMatches() {
        return this.matches;
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
        private String embeddingTokens; 
        private Matches matches; 
        private String message; 
        private String requestId; 
        private String status; 

        /**
         * EmbeddingTokens.
         */
        public Builder embeddingTokens(String embeddingTokens) {
            this.embeddingTokens = embeddingTokens;
            return this;
        }

        /**
         * Matches.
         */
        public Builder matches(Matches matches) {
            this.matches = matches;
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

        public QueryContentResponseBody build() {
            return new QueryContentResponseBody(this);
        } 

    } 

    public static class Vector extends TeaModel {
        @NameInMap("VectorList")
        private java.util.List < Double > vectorList;

        private Vector(Builder builder) {
            this.vectorList = builder.vectorList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Vector create() {
            return builder().build();
        }

        /**
         * @return vectorList
         */
        public java.util.List < Double > getVectorList() {
            return this.vectorList;
        }

        public static final class Builder {
            private java.util.List < Double > vectorList; 

            /**
             * VectorList.
             */
            public Builder vectorList(java.util.List < Double > vectorList) {
                this.vectorList = vectorList;
                return this;
            }

            public Vector build() {
                return new Vector(this);
            } 

        } 

    }
    public static class MatchList extends TeaModel {
        @NameInMap("Content")
        private String content;

        @NameInMap("FileName")
        private String fileName;

        @NameInMap("Id")
        private String id;

        @NameInMap("LoaderMetadata")
        private String loaderMetadata;

        @NameInMap("Metadata")
        private java.util.Map < String, String > metadata;

        @NameInMap("RetrievalSource")
        private Integer retrievalSource;

        @NameInMap("Score")
        private Double score;

        @NameInMap("Vector")
        private Vector vector;

        private MatchList(Builder builder) {
            this.content = builder.content;
            this.fileName = builder.fileName;
            this.id = builder.id;
            this.loaderMetadata = builder.loaderMetadata;
            this.metadata = builder.metadata;
            this.retrievalSource = builder.retrievalSource;
            this.score = builder.score;
            this.vector = builder.vector;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MatchList create() {
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
        public java.util.Map < String, String > getMetadata() {
            return this.metadata;
        }

        /**
         * @return retrievalSource
         */
        public Integer getRetrievalSource() {
            return this.retrievalSource;
        }

        /**
         * @return score
         */
        public Double getScore() {
            return this.score;
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
            private java.util.Map < String, String > metadata; 
            private Integer retrievalSource; 
            private Double score; 
            private Vector vector; 

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
            public Builder metadata(java.util.Map < String, String > metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * RetrievalSource.
             */
            public Builder retrievalSource(Integer retrievalSource) {
                this.retrievalSource = retrievalSource;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(Double score) {
                this.score = score;
                return this;
            }

            /**
             * Vector.
             */
            public Builder vector(Vector vector) {
                this.vector = vector;
                return this;
            }

            public MatchList build() {
                return new MatchList(this);
            } 

        } 

    }
    public static class Matches extends TeaModel {
        @NameInMap("MatchList")
        private java.util.List < MatchList> matchList;

        private Matches(Builder builder) {
            this.matchList = builder.matchList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Matches create() {
            return builder().build();
        }

        /**
         * @return matchList
         */
        public java.util.List < MatchList> getMatchList() {
            return this.matchList;
        }

        public static final class Builder {
            private java.util.List < MatchList> matchList; 

            /**
             * MatchList.
             */
            public Builder matchList(java.util.List < MatchList> matchList) {
                this.matchList = matchList;
                return this;
            }

            public Matches build() {
                return new Matches(this);
            } 

        } 

    }
}
