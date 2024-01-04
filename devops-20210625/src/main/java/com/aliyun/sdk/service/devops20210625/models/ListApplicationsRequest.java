// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListApplicationsRequest} extends {@link RequestModel}
 *
 * <p>ListApplicationsRequest</p>
 */
public class ListApplicationsRequest extends Request {
    @Query
    @NameInMap("nextToken")
    private String nextToken;

    @Query
    @NameInMap("orderBy")
    private String orderBy;

    @Query
    @NameInMap("organizationId")
    private String organizationId;

    @Query
    @NameInMap("pagination")
    private String pagination;

    @Query
    @NameInMap("perPage")
    private Integer perPage;

    @Query
    @NameInMap("sort")
    private String sort;

    private ListApplicationsRequest(Builder builder) {
        super(builder);
        this.nextToken = builder.nextToken;
        this.orderBy = builder.orderBy;
        this.organizationId = builder.organizationId;
        this.pagination = builder.pagination;
        this.perPage = builder.perPage;
        this.sort = builder.sort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return pagination
     */
    public String getPagination() {
        return this.pagination;
    }

    /**
     * @return perPage
     */
    public Integer getPerPage() {
        return this.perPage;
    }

    /**
     * @return sort
     */
    public String getSort() {
        return this.sort;
    }

    public static final class Builder extends Request.Builder<ListApplicationsRequest, Builder> {
        private String nextToken; 
        private String orderBy; 
        private String organizationId; 
        private String pagination; 
        private Integer perPage; 
        private String sort; 

        private Builder() {
            super();
        } 

        private Builder(ListApplicationsRequest request) {
            super(request);
            this.nextToken = request.nextToken;
            this.orderBy = request.orderBy;
            this.organizationId = request.organizationId;
            this.pagination = request.pagination;
            this.perPage = request.perPage;
            this.sort = request.sort;
        } 

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * orderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("orderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * pagination.
         */
        public Builder pagination(String pagination) {
            this.putQueryParameter("pagination", pagination);
            this.pagination = pagination;
            return this;
        }

        /**
         * perPage.
         */
        public Builder perPage(Integer perPage) {
            this.putQueryParameter("perPage", perPage);
            this.perPage = perPage;
            return this;
        }

        /**
         * sort.
         */
        public Builder sort(String sort) {
            this.putQueryParameter("sort", sort);
            this.sort = sort;
            return this;
        }

        @Override
        public ListApplicationsRequest build() {
            return new ListApplicationsRequest(this);
        } 

    } 

}
