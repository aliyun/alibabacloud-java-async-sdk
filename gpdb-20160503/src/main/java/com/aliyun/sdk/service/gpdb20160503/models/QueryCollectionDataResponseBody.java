// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryCollectionDataResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCollectionDataResponseBody</p>
 */
public class QueryCollectionDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Matches")
    private Matches matches;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private QueryCollectionDataResponseBody(Builder builder) {
        this.matches = builder.matches;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.total = builder.total;
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

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Matches matches; 
        private String message; 
        private String requestId; 
        private String status; 
        private Integer total; 

        /**
         * <p>Data list.</p>
         */
        public Builder matches(Matches matches) {
            this.matches = matches;
            return this;
        }

        /**
         * <p>Detailed information when the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1234</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Status, with the following values:</p>
         * <ul>
         * <li><strong>success</strong>: Success.</li>
         * <li><strong>fail</strong>: Failure.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Only returned when the Offset is not 0, this value represents the total number of hits for the search criteria.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public QueryCollectionDataResponseBody build() {
            return new QueryCollectionDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryCollectionDataResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCollectionDataResponseBody</p>
     */
    public static class Values extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("value")
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
    /**
     * 
     * {@link QueryCollectionDataResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCollectionDataResponseBody</p>
     */
    public static class Match extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Metadata")
        private java.util.Map < String, String > metadata;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Double score;

        @com.aliyun.core.annotation.NameInMap("Values")
        private Values values;

        private Match(Builder builder) {
            this.id = builder.id;
            this.metadata = builder.metadata;
            this.score = builder.score;
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
         * @return score
         */
        public Double getScore() {
            return this.score;
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
            private Double score; 
            private Values values; 

            /**
             * <p>The unique ID of the vector data.</p>
             * 
             * <strong>example:</strong>
             * <p>doca-1234</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Metadata.</p>
             */
            public Builder metadata(java.util.Map < String, String > metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The similarity score of this data, which is related to the algorithm <code>(l2/ip/cosine)</code> specified when creating the index.</p>
             * 
             * <strong>example:</strong>
             * <p>0.12345</p>
             */
            public Builder score(Double score) {
                this.score = score;
                return this;
            }

            /**
             * <p>List of vector data.</p>
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
    /**
     * 
     * {@link QueryCollectionDataResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCollectionDataResponseBody</p>
     */
    public static class Matches extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("match")
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
