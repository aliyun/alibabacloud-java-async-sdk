// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link SearchDomainsRequest} extends {@link RequestModel}
 *
 * <p>SearchDomainsRequest</p>
 */
public class SearchDomainsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("limit")
    private Long limit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("marker")
    private String marker;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("order_by")
    private String orderBy;

    private SearchDomainsRequest(Builder builder) {
        super(builder);
        this.limit = builder.limit;
        this.marker = builder.marker;
        this.name = builder.name;
        this.orderBy = builder.orderBy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchDomainsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return limit
     */
    public Long getLimit() {
        return this.limit;
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    public static final class Builder extends Request.Builder<SearchDomainsRequest, Builder> {
        private Long limit; 
        private String marker; 
        private String name; 
        private String orderBy; 

        private Builder() {
            super();
        } 

        private Builder(SearchDomainsRequest request) {
            super(request);
            this.limit = request.limit;
            this.marker = request.marker;
            this.name = request.name;
            this.orderBy = request.orderBy;
        } 

        /**
         * <p>The maximum number of results to return. Valid values: 1 to 100. Default value: 100.</p>
         * <p>The number of returned results must be less than or equal to the specified number.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder limit(Long limit) {
            this.putBodyParameter("limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of marker.<br>By default, this parameter is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>NWQ1Yjk4YmI1ZDRlYmU1Y2E0YWE0NmJhYWJmODBhNDQ2NzhlMTRhMg</p>
         */
        public Builder marker(String marker) {
            this.putBodyParameter("marker", marker);
            this.marker = marker;
            return this;
        }

        /**
         * <p>The name of the domain. Fuzzy search is supported.</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The sorting rule. Set the value to created_at, which specifies that the results are sorted based on the time when the domain was created.</p>
         * 
         * <strong>example:</strong>
         * <p>created_at</p>
         */
        public Builder orderBy(String orderBy) {
            this.putBodyParameter("order_by", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        @Override
        public SearchDomainsRequest build() {
            return new SearchDomainsRequest(this);
        } 

    } 

}
