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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TerminalGroupId")
    private String terminalGroupId;

    private ListTerminalsRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.searchKeyword = builder.searchKeyword;
        this.terminalGroupId = builder.terminalGroupId;
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
     * @return terminalGroupId
     */
    public String getTerminalGroupId() {
        return this.terminalGroupId;
    }

    public static final class Builder extends Request.Builder<ListTerminalsRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private String searchKeyword; 
        private String terminalGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ListTerminalsRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.searchKeyword = request.searchKeyword;
            this.terminalGroupId = request.terminalGroupId;
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
         * TerminalGroupId.
         */
        public Builder terminalGroupId(String terminalGroupId) {
            this.putBodyParameter("TerminalGroupId", terminalGroupId);
            this.terminalGroupId = terminalGroupId;
            return this;
        }

        @Override
        public ListTerminalsRequest build() {
            return new ListTerminalsRequest(this);
        } 

    } 

}
