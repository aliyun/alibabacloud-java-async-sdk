// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCollectionDataResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCollectionDataResponseBody</p>
 */
public class QueryCollectionDataResponseBody extends TeaModel {
    @NameInMap("Matches")
    private Matches matches;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private QueryCollectionDataResponseBody(Builder builder) {
        this.matches = builder.matches;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCollectionDataResponseBody create() {
        return builder().build();
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
        private Matches matches; 
        private String message; 
        private String requestId; 
        private String status; 

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

        public QueryCollectionDataResponseBody build() {
            return new QueryCollectionDataResponseBody(this);
        } 

    } 

    public static class Values extends TeaModel {
        @NameInMap("value")
        private java.util.List < Double > value;

        private Values(Builder builder) {
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Values create() {
            return builder().build();
        }

        /**
         * @return value
         */
        public java.util.List < Double > getValue() {
            return this.value;
        }

        public static final class Builder {
            private java.util.List < Double > value; 

            /**
             * value.
             */
            public Builder value(java.util.List < Double > value) {
                this.value = value;
                return this;
            }

            public Values build() {
                return new Values(this);
            } 

        } 

    }
    public static class Match extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("Metadata")
        private java.util.Map < String, String > metadata;

        @NameInMap("Similarity")
        private Double similarity;

        @NameInMap("Values")
        private Values values;

        private Match(Builder builder) {
            this.id = builder.id;
            this.metadata = builder.metadata;
            this.similarity = builder.similarity;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Match create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return metadata
         */
        public java.util.Map < String, String > getMetadata() {
            return this.metadata;
        }

        /**
         * @return similarity
         */
        public Double getSimilarity() {
            return this.similarity;
        }

        /**
         * @return values
         */
        public Values getValues() {
            return this.values;
        }

        public static final class Builder {
            private String id; 
            private java.util.Map < String, String > metadata; 
            private Double similarity; 
            private Values values; 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
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
             * Similarity.
             */
            public Builder similarity(Double similarity) {
                this.similarity = similarity;
                return this;
            }

            /**
             * Values.
             */
            public Builder values(Values values) {
                this.values = values;
                return this;
            }

            public Match build() {
                return new Match(this);
            } 

        } 

    }
    public static class Matches extends TeaModel {
        @NameInMap("match")
        private java.util.List < Match> match;

        private Matches(Builder builder) {
            this.match = builder.match;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Matches create() {
            return builder().build();
        }

        /**
         * @return match
         */
        public java.util.List < Match> getMatch() {
            return this.match;
        }

        public static final class Builder {
            private java.util.List < Match> match; 

            /**
             * match.
             */
            public Builder match(java.util.List < Match> match) {
                this.match = match;
                return this;
            }

            public Matches build() {
                return new Matches(this);
            } 

        } 

    }
}
