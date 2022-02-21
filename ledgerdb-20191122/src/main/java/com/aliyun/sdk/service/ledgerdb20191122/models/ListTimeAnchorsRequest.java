// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTimeAnchorsRequest} extends {@link RequestModel}
 *
 * <p>ListTimeAnchorsRequest</p>
 */
public class ListTimeAnchorsRequest extends Request {
    @Query
    @NameInMap("LedgerId")
    @Validation(required = true)
    private String ledgerId;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("Reverse")
    private Boolean reverse;

    private ListTimeAnchorsRequest(Builder builder) {
        super(builder);
        this.ledgerId = builder.ledgerId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.reverse = builder.reverse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTimeAnchorsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<ListTimeAnchorsRequest, Builder> {
        private String ledgerId; 
        private Integer maxResults; 
        private String nextToken; 
        private Boolean reverse; 

        private Builder() {
            super();
        } 

        private Builder(ListTimeAnchorsRequest response) {
            super(response);
            this.ledgerId = response.ledgerId;
            this.maxResults = response.maxResults;
            this.nextToken = response.nextToken;
            this.reverse = response.reverse;
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
        public ListTimeAnchorsRequest build() {
            return new ListTimeAnchorsRequest(this);
        } 

    } 

}
