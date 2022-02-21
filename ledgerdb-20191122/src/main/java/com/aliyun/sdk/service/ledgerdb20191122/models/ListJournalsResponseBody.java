// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListJournalsResponseBody} extends {@link TeaModel}
 *
 * <p>ListJournalsResponseBody</p>
 */
public class ListJournalsResponseBody extends TeaModel {
    @NameInMap("Journals")
    private java.util.List < Journals> journals;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    private ListJournalsResponseBody(Builder builder) {
        this.journals = builder.journals;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJournalsResponseBody create() {
        return builder().build();
    }

    /**
     * @return journals
     */
    public java.util.List < Journals> getJournals() {
        return this.journals;
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

    public static final class Builder {
        private java.util.List < Journals> journals; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 

        /**
         * Journals.
         */
        public Builder journals(java.util.List < Journals> journals) {
            this.journals = journals;
            return this;
        }

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

        public ListJournalsResponseBody build() {
            return new ListJournalsResponseBody(this);
        } 

    } 

    public static class Journals extends TeaModel {
        @NameInMap("ClientId")
        private String clientId;

        @NameInMap("Clues")
        private java.util.List < String > clues;

        @NameInMap("JournalHash")
        private String journalHash;

        @NameInMap("JournalId")
        private String journalId;

        @NameInMap("LedgerId")
        private String ledgerId;

        @NameInMap("MemberId")
        private String memberId;

        @NameInMap("PayloadJsonString")
        private String payloadJsonString;

        @NameInMap("PayloadType")
        private String payloadType;

        @NameInMap("Timestamp")
        private Long timestamp;

        private Journals(Builder builder) {
            this.clientId = builder.clientId;
            this.clues = builder.clues;
            this.journalHash = builder.journalHash;
            this.journalId = builder.journalId;
            this.ledgerId = builder.ledgerId;
            this.memberId = builder.memberId;
            this.payloadJsonString = builder.payloadJsonString;
            this.payloadType = builder.payloadType;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Journals create() {
            return builder().build();
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return clues
         */
        public java.util.List < String > getClues() {
            return this.clues;
        }

        /**
         * @return journalHash
         */
        public String getJournalHash() {
            return this.journalHash;
        }

        /**
         * @return journalId
         */
        public String getJournalId() {
            return this.journalId;
        }

        /**
         * @return ledgerId
         */
        public String getLedgerId() {
            return this.ledgerId;
        }

        /**
         * @return memberId
         */
        public String getMemberId() {
            return this.memberId;
        }

        /**
         * @return payloadJsonString
         */
        public String getPayloadJsonString() {
            return this.payloadJsonString;
        }

        /**
         * @return payloadType
         */
        public String getPayloadType() {
            return this.payloadType;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private String clientId; 
            private java.util.List < String > clues; 
            private String journalHash; 
            private String journalId; 
            private String ledgerId; 
            private String memberId; 
            private String payloadJsonString; 
            private String payloadType; 
            private Long timestamp; 

            /**
             * ClientId.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * Clues.
             */
            public Builder clues(java.util.List < String > clues) {
                this.clues = clues;
                return this;
            }

            /**
             * JournalHash.
             */
            public Builder journalHash(String journalHash) {
                this.journalHash = journalHash;
                return this;
            }

            /**
             * JournalId.
             */
            public Builder journalId(String journalId) {
                this.journalId = journalId;
                return this;
            }

            /**
             * LedgerId.
             */
            public Builder ledgerId(String ledgerId) {
                this.ledgerId = ledgerId;
                return this;
            }

            /**
             * MemberId.
             */
            public Builder memberId(String memberId) {
                this.memberId = memberId;
                return this;
            }

            /**
             * PayloadJsonString.
             */
            public Builder payloadJsonString(String payloadJsonString) {
                this.payloadJsonString = payloadJsonString;
                return this;
            }

            /**
             * PayloadType.
             */
            public Builder payloadType(String payloadType) {
                this.payloadType = payloadType;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Journals build() {
                return new Journals(this);
            } 

        } 

    }
}
