// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

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
 * {@link QueryExportDomainExpireSnatchsRequest} extends {@link RequestModel}
 *
 * <p>QueryExportDomainExpireSnatchsRequest</p>
 */
public class QueryExportDomainExpireSnatchsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long currentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 3000)
    private Integer pageSize;

    private QueryExportDomainExpireSnatchsRequest(Builder builder) {
        super(builder);
        this.currentId = builder.currentId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryExportDomainExpireSnatchsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentId
     */
    public Long getCurrentId() {
        return this.currentId;
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

    public static final class Builder extends Request.Builder<QueryExportDomainExpireSnatchsRequest, Builder> {
        private Long currentId; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(QueryExportDomainExpireSnatchsRequest request) {
            super(request);
            this.currentId = request.currentId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentId(Long currentId) {
            this.putQueryParameter("CurrentId", currentId);
            this.currentId = currentId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>f07b150eadfa1d7a</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public QueryExportDomainExpireSnatchsRequest build() {
            return new QueryExportDomainExpireSnatchsRequest(this);
        } 

    } 

}
