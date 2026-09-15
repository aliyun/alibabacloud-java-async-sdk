// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListGroupsRequest</p>
 */
public class ListGroupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseNextToken")
    private Boolean useNextToken;

    private ListGroupsRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.lang = builder.lang;
        this.nextToken = builder.nextToken;
        this.pageSize = builder.pageSize;
        this.useNextToken = builder.useNextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGroupsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return useNextToken
     */
    public Boolean getUseNextToken() {
        return this.useNextToken;
    }

    public static final class Builder extends Request.Builder<ListGroupsRequest, Builder> {
        private Integer currentPage; 
        private String lang; 
        private String nextToken; 
        private Integer pageSize; 
        private Boolean useNextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListGroupsRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.lang = request.lang;
            this.nextToken = request.nextToken;
            this.pageSize = request.pageSize;
            this.useNextToken = request.useNextToken;
        } 

        /**
         * <p>The page number of the current page to return. Minimum value: 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>89</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The language type for the request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The token for the next query. If NextToken is empty, no additional results exist. If NextToken has a value, the value indicates the token to use for the next query.</p>
         * 
         * <strong>example:</strong>
         * <p>1426C575705AE8545E8360A6EFA3B***</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The maximum number of entries to return on each page in a paging query. Default value: 20. Maximum value: 2000.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Specifies whether to use the NextToken method to retrieve the vulnerability list data. If this parameter is used, TotalCount is no longer returned. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Uses the NextToken method.</li>
         * <li><strong>false</strong>: Does not use the NextToken method.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder useNextToken(Boolean useNextToken) {
            this.putQueryParameter("UseNextToken", useNextToken);
            this.useNextToken = useNextToken;
            return this;
        }

        @Override
        public ListGroupsRequest build() {
            return new ListGroupsRequest(this);
        } 

    } 

}
