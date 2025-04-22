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
 * {@link SearchShareLinkRequest} extends {@link RequestModel}
 *
 * <p>SearchShareLinkRequest</p>
 */
public class SearchShareLinkRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("creators")
    private java.util.List<String> creators;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("limit")
    private Integer limit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("marker")
    private String marker;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("order_by")
    private String orderBy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("order_direction")
    private String orderDirection;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("query")
    private String query;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("return_total_count")
    private Boolean returnTotalCount;

    private SearchShareLinkRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.creators = builder.creators;
        this.limit = builder.limit;
        this.marker = builder.marker;
        this.orderBy = builder.orderBy;
        this.orderDirection = builder.orderDirection;
        this.query = builder.query;
        this.returnTotalCount = builder.returnTotalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchShareLinkRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return creators
     */
    public java.util.List<String> getCreators() {
        return this.creators;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return orderDirection
     */
    public String getOrderDirection() {
        return this.orderDirection;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return returnTotalCount
     */
    public Boolean getReturnTotalCount() {
        return this.returnTotalCount;
    }

    public static final class Builder extends Request.Builder<SearchShareLinkRequest, Builder> {
        private String domainId; 
        private java.util.List<String> creators; 
        private Integer limit; 
        private String marker; 
        private String orderBy; 
        private String orderDirection; 
        private String query; 
        private Boolean returnTotalCount; 

        private Builder() {
            super();
        } 

        private Builder(SearchShareLinkRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.creators = request.creators;
            this.limit = request.limit;
            this.marker = request.marker;
            this.orderBy = request.orderBy;
            this.orderDirection = request.orderDirection;
            this.query = request.query;
            this.returnTotalCount = request.returnTotalCount;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>The creators of shares. Set this parameter to a user ID. If you do not specify this parameter, Drive and Photo Service automatically queries shares based on your permissions. If you are a drive administrator or the super administrator, the shares created by all members are queried. If you are a team administrator, the shares created by all team members are queried. If you are a common user, only the shares created by yourself are queried.</p>
         * <p>If you specify this parameter, this parameter must be set to the ID of the super administrator, a drive administrator, or a team administrator.</p>
         */
        public Builder creators(java.util.List<String> creators) {
            this.putBodyParameter("creators", creators);
            this.creators = creators;
            return this;
        }

        /**
         * <p>The maximum number of results to return. Valid values: 1 to 100. Default value: 100.</p>
         * <p>The number of returned results must be less than or equal to the specified number.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder limit(Integer limit) {
            this.putBodyParameter("limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of marker.<br>By default, this parameter is left empty.</p>
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
         * <p>The field by which to sort the returned results. Default value: created_at. Valid values:</p>
         * <ul>
         * <li>share_name: sorts the results by the name of the share.</li>
         * <li>updated_at: sorts the results by the time when the share was modified.</li>
         * <li>description: sorts the results by the description of the share.</li>
         * <li>created_at: sorts the results by the time when the share was created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>created_at</p>
         */
        public Builder orderBy(String orderBy) {
            this.putBodyParameter("order_by", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The order in which you want to sort the returned results. By default, order_direction is set to DESC if order_by is set to created_at or updated_at, and is set to ASC if order_by is set to other values. Valid values:</p>
         * <ul>
         * <li>ASC: sorts the results in ascending order.</li>
         * <li>DESC: sorts the results in descending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ASC</p>
         */
        public Builder orderDirection(String orderDirection) {
            this.putBodyParameter("order_direction", orderDirection);
            this.orderDirection = orderDirection;
            return this;
        }

        /**
         * <p>The query condition that is used to search for share URLs. You can use the following fields to specify query conditions: created_at: queries a share URL based on the time when the share URL was created. updated_at: queries a share URL based on the time when the share URL was modified. share_name_for_fuzzy: queries a share URL based on the name of the share. A fuzzy match is supported. status: queries a share URL based on the status of the share. Valid values: enabled and disabled. A value of enabled indicates that the share is valid. A value of disabled indicates that the share is canceled. expired_time: queries a share URL based on the expiration time of the share. If the share never expires, set this field to 1970-01-01T00:00:00. Otherwise, set this field to 1970-01-02T00:00:00.</p>
         * 
         * <strong>example:</strong>
         * <p>created_at&gt;=&quot;2022-01-18T02:50:00&quot; and created_at&lt;&quot;2022-01-19T09:45:28&quot; and share_name_for_fuzzy match &quot;HD.mp4&quot; and status in [&quot;enabled&quot;, &quot;disabled&quot;] and expired_time=&quot;1970-01-01T00:00:00&quot;</p>
         */
        public Builder query(String query) {
            this.putBodyParameter("query", query);
            this.query = query;
            return this;
        }

        /**
         * <p>Specifies whether to return the total number of returned results.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder returnTotalCount(Boolean returnTotalCount) {
            this.putBodyParameter("return_total_count", returnTotalCount);
            this.returnTotalCount = returnTotalCount;
            return this;
        }

        @Override
        public SearchShareLinkRequest build() {
            return new SearchShareLinkRequest(this);
        } 

    } 

}
