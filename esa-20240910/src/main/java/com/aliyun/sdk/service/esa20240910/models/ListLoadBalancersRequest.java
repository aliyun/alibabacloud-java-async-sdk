// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListLoadBalancersRequest} extends {@link RequestModel}
 *
 * <p>ListLoadBalancersRequest</p>
 */
public class ListLoadBalancersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatchType")
    private String matchType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    private ListLoadBalancersRequest(Builder builder) {
        super(builder);
        this.matchType = builder.matchType;
        this.name = builder.name;
        this.orderBy = builder.orderBy;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLoadBalancersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return matchType
     */
    public String getMatchType() {
        return this.matchType;
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

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<ListLoadBalancersRequest, Builder> {
        private String matchType; 
        private String name; 
        private String orderBy; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(ListLoadBalancersRequest request) {
            super(request);
            this.matchType = request.matchType;
            this.name = request.name;
            this.orderBy = request.orderBy;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.siteId = request.siteId;
        } 

        /**
         * <p>The name matching strategy when querying by name:</p>
         * <ul>
         * <li>fuzzy: Fuzzy match;</li>
         * <li>exact: Exact match, equivalent to an equality query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>fuzzy</p>
         */
        public Builder matchType(String matchType) {
            this.putQueryParameter("MatchType", matchType);
            this.matchType = matchType;
            return this;
        }

        /**
         * <p>The name of the load balancer, which can be used to query by name.</p>
         * 
         * <strong>example:</strong>
         * <p>lb.example.com</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The sorting field. Currently, only sorting by id is supported. &quot;id&quot; indicates ascending order by id, and &quot;-id&quot; indicates descending order by id. The id size is positively correlated with the creation time. If not provided, it defaults to descending order by id.</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The page number for paginated queries.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The page size for paginated queries, with a value range of 1-500.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The site ID, which can be obtained by calling the <a href="~~ListSites~~">ListSites</a> API.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>21655860979****</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public ListLoadBalancersRequest build() {
            return new ListLoadBalancersRequest(this);
        } 

    } 

}
