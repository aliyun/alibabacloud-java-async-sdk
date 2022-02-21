// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTimeAnchorsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTimeAnchorsResponseBody</p>
 */
public class ListTimeAnchorsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TimeAnchors")
    private java.util.List < TimeAnchors> timeAnchors;

    private ListTimeAnchorsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.timeAnchors = builder.timeAnchors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTimeAnchorsResponseBody create() {
        return builder().build();
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return timeAnchors
     */
    public java.util.List < TimeAnchors> getTimeAnchors() {
        return this.timeAnchors;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List < TimeAnchors> timeAnchors; 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * TimeAnchors.
         */
        public Builder timeAnchors(java.util.List < TimeAnchors> timeAnchors) {
            this.timeAnchors = timeAnchors;
            return this;
        }

        public ListTimeAnchorsResponseBody build() {
            return new ListTimeAnchorsResponseBody(this);
        } 

    } 

    public static class TimeAnchors extends TeaModel {
        @NameInMap("JournalId")
        private Long journalId;

        @NameInMap("LedgerDigest")
        private String ledgerDigest;

        @NameInMap("LedgerDigestType")
        private String ledgerDigestType;

        @NameInMap("LedgerVersion")
        private Long ledgerVersion;

        @NameInMap("Proof")
        private String proof;

        @NameInMap("TimeStamp")
        private Long timeStamp;

        private TimeAnchors(Builder builder) {
            this.journalId = builder.journalId;
            this.ledgerDigest = builder.ledgerDigest;
            this.ledgerDigestType = builder.ledgerDigestType;
            this.ledgerVersion = builder.ledgerVersion;
            this.proof = builder.proof;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeAnchors create() {
            return builder().build();
        }

        /**
         * @return journalId
         */
        public Long getJournalId() {
            return this.journalId;
        }

        /**
         * @return ledgerDigest
         */
        public String getLedgerDigest() {
            return this.ledgerDigest;
        }

        /**
         * @return ledgerDigestType
         */
        public String getLedgerDigestType() {
            return this.ledgerDigestType;
        }

        /**
         * @return ledgerVersion
         */
        public Long getLedgerVersion() {
            return this.ledgerVersion;
        }

        /**
         * @return proof
         */
        public String getProof() {
            return this.proof;
        }

        /**
         * @return timeStamp
         */
        public Long getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private Long journalId; 
            private String ledgerDigest; 
            private String ledgerDigestType; 
            private Long ledgerVersion; 
            private String proof; 
            private Long timeStamp; 

            /**
             * JournalId.
             */
            public Builder journalId(Long journalId) {
                this.journalId = journalId;
                return this;
            }

            /**
             * LedgerDigest.
             */
            public Builder ledgerDigest(String ledgerDigest) {
                this.ledgerDigest = ledgerDigest;
                return this;
            }

            /**
             * LedgerDigestType.
             */
            public Builder ledgerDigestType(String ledgerDigestType) {
                this.ledgerDigestType = ledgerDigestType;
                return this;
            }

            /**
             * LedgerVersion.
             */
            public Builder ledgerVersion(Long ledgerVersion) {
                this.ledgerVersion = ledgerVersion;
                return this;
            }

            /**
             * Proof.
             */
            public Builder proof(String proof) {
                this.proof = proof;
                return this;
            }

            /**
             * TimeStamp.
             */
            public Builder timeStamp(Long timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public TimeAnchors build() {
                return new TimeAnchors(this);
            } 

        } 

    }
}
