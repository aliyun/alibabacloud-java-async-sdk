// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link ListNamespacesRequest} extends {@link RequestModel}
 *
 * <p>ListNamespacesRequest</p>
 */
public class ListNamespacesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Catalog")
    private String catalog;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Integer limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    private ListNamespacesRequest(Builder builder) {
        super(builder);
        this.catalog = builder.catalog;
        this.limit = builder.limit;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNamespacesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalog
     */
    public String getCatalog() {
        return this.catalog;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder extends Request.Builder<ListNamespacesRequest, Builder> {
        private String catalog; 
        private Integer limit; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListNamespacesRequest request) {
            super(request);
            this.catalog = request.catalog;
            this.limit = request.limit;
            this.nextToken = request.nextToken;
        } 

        /**
         * <p>Data catalog</p>
         * 
         * <strong>example:</strong>
         * <p>my_catalog</p>
         */
        public Builder catalog(String catalog) {
            this.putQueryParameter("Catalog", catalog);
            this.catalog = catalog;
            return this;
        }

        /**
         * <p>Items per page</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>Pagination Token</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public ListNamespacesRequest build() {
            return new ListNamespacesRequest(this);
        } 

    } 

}
