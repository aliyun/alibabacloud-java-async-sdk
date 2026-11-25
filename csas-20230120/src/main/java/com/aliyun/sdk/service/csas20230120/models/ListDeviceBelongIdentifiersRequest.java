// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListDeviceBelongIdentifiersRequest} extends {@link RequestModel}
 *
 * <p>ListDeviceBelongIdentifiersRequest</p>
 */
public class ListDeviceBelongIdentifiersRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer currentPage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdentifierIds")
    private java.util.List<String> identifierIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdentifierType")
    private String identifierType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    private ListDeviceBelongIdentifiersRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.identifierIds = builder.identifierIds;
        this.identifierType = builder.identifierType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeviceBelongIdentifiersRequest create() {
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
     * @return identifierIds
     */
    public java.util.List<String> getIdentifierIds() {
        return this.identifierIds;
    }

    /**
     * @return identifierType
     */
    public String getIdentifierType() {
        return this.identifierType;
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
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListDeviceBelongIdentifiersRequest, Builder> {
        private Integer currentPage; 
        private java.util.List<String> identifierIds; 
        private String identifierType; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListDeviceBelongIdentifiersRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.identifierIds = request.identifierIds;
            this.identifierType = request.identifierType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putBodyParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * IdentifierIds.
         */
        public Builder identifierIds(java.util.List<String> identifierIds) {
            this.putBodyParameter("IdentifierIds", identifierIds);
            this.identifierIds = identifierIds;
            return this;
        }

        /**
         * IdentifierType.
         */
        public Builder identifierType(String identifierType) {
            this.putBodyParameter("IdentifierType", identifierType);
            this.identifierType = identifierType;
            return this;
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
         * <p>This parameter is required.</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListDeviceBelongIdentifiersRequest build() {
            return new ListDeviceBelongIdentifiersRequest(this);
        } 

    } 

}
