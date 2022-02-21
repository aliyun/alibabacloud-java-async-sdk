// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListJournalsRequest} extends {@link RequestModel}
 *
 * <p>ListJournalsRequest</p>
 */
public class ListJournalsRequest extends Request {
    @Query
    @NameInMap("Clue")
    private String clue;

    @Query
    @NameInMap("LedgerId")
    @Validation(required = true)
    private String ledgerId;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("MemberId")
    private String memberId;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("Reverse")
    private Boolean reverse;

    private ListJournalsRequest(Builder builder) {
        super(builder);
        this.clue = builder.clue;
        this.ledgerId = builder.ledgerId;
        this.maxResults = builder.maxResults;
        this.memberId = builder.memberId;
        this.nextToken = builder.nextToken;
        this.reverse = builder.reverse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJournalsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clue
     */
    public String getClue() {
        return this.clue;
    }

    /**
     * @return ledgerId
     */
    public String getLedgerId() {
        return this.ledgerId;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return memberId
     */
    public String getMemberId() {
        return this.memberId;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return reverse
     */
    public Boolean getReverse() {
        return this.reverse;
    }

    public static final class Builder extends Request.Builder<ListJournalsRequest, Builder> {
        private String clue; 
        private String ledgerId; 
        private Integer maxResults; 
        private String memberId; 
        private String nextToken; 
        private Boolean reverse; 

        private Builder() {
            super();
        } 

        private Builder(ListJournalsRequest response) {
            super(response);
            this.clue = response.clue;
            this.ledgerId = response.ledgerId;
            this.maxResults = response.maxResults;
            this.memberId = response.memberId;
            this.nextToken = response.nextToken;
            this.reverse = response.reverse;
        } 

        /**
         * Clue.
         */
        public Builder clue(String clue) {
            this.putQueryParameter("Clue", clue);
            this.clue = clue;
            return this;
        }

        /**
         * LedgerId.
         */
        public Builder ledgerId(String ledgerId) {
            this.putQueryParameter("LedgerId", ledgerId);
            this.ledgerId = ledgerId;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * MemberId.
         */
        public Builder memberId(String memberId) {
            this.putQueryParameter("MemberId", memberId);
            this.memberId = memberId;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Reverse.
         */
        public Builder reverse(Boolean reverse) {
            this.putQueryParameter("Reverse", reverse);
            this.reverse = reverse;
            return this;
        }

        @Override
        public ListJournalsRequest build() {
            return new ListJournalsRequest(this);
        } 

    } 

}
