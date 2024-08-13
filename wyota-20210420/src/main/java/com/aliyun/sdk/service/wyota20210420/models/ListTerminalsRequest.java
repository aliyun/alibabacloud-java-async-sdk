// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTerminalsRequest} extends {@link RequestModel}
 *
 * <p>ListTerminalsRequest</p>
 */
public class ListTerminalsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 500)
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SearchKeyword")
    private String searchKeyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SerialNumbers")
    private java.util.List < String > serialNumbers;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TerminalGroupId")
    private String terminalGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuids")
    private java.util.List < String > uuids;

    private ListTerminalsRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.searchKeyword = builder.searchKeyword;
        this.serialNumbers = builder.serialNumbers;
        this.terminalGroupId = builder.terminalGroupId;
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTerminalsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return searchKeyword
     */
    public String getSearchKeyword() {
        return this.searchKeyword;
    }

    /**
     * @return serialNumbers
     */
    public java.util.List < String > getSerialNumbers() {
        return this.serialNumbers;
    }

    /**
     * @return terminalGroupId
     */
    public String getTerminalGroupId() {
        return this.terminalGroupId;
    }

    /**
     * @return uuids
     */
    public java.util.List < String > getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<ListTerminalsRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private String searchKeyword; 
        private java.util.List < String > serialNumbers; 
        private String terminalGroupId; 
        private java.util.List < String > uuids; 

        private Builder() {
            super();
        } 

        private Builder(ListTerminalsRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.searchKeyword = request.searchKeyword;
            this.serialNumbers = request.serialNumbers;
            this.terminalGroupId = request.terminalGroupId;
            this.uuids = request.uuids;
        } 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * SearchKeyword.
         */
        public Builder searchKeyword(String searchKeyword) {
            this.putBodyParameter("SearchKeyword", searchKeyword);
            this.searchKeyword = searchKeyword;
            return this;
        }

        /**
         * SerialNumbers.
         */
        public Builder serialNumbers(java.util.List < String > serialNumbers) {
            this.putQueryParameter("SerialNumbers", serialNumbers);
            this.serialNumbers = serialNumbers;
            return this;
        }

        /**
         * TerminalGroupId.
         */
        public Builder terminalGroupId(String terminalGroupId) {
            this.putBodyParameter("TerminalGroupId", terminalGroupId);
            this.terminalGroupId = terminalGroupId;
            return this;
        }

        /**
         * Uuids.
         */
        public Builder uuids(java.util.List < String > uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public ListTerminalsRequest build() {
            return new ListTerminalsRequest(this);
        } 

    } 

}
