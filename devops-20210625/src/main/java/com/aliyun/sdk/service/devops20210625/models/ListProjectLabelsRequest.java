// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProjectLabelsRequest} extends {@link RequestModel}
 *
 * <p>ListProjectLabelsRequest</p>
 */
public class ListProjectLabelsRequest extends Request {
    @Query
    @NameInMap("accessToken")
    private String accessToken;

    @Query
    @NameInMap("orderBy")
    private String orderBy;

    @Query
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Query
    @NameInMap("page")
    private Integer page;

    @Query
    @NameInMap("pageSize")
    private Long pageSize;

    @Query
    @NameInMap("repositoryIdentity")
    @Validation(required = true)
    private String repositoryIdentity;

    @Query
    @NameInMap("search")
    private String search;

    @Query
    @NameInMap("sort")
    private String sort;

    @Query
    @NameInMap("withCounts")
    private Boolean withCounts;

    private ListProjectLabelsRequest(Builder builder) {
        super(builder);
        this.accessToken = builder.accessToken;
        this.orderBy = builder.orderBy;
        this.organizationId = builder.organizationId;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.repositoryIdentity = builder.repositoryIdentity;
        this.search = builder.search;
        this.sort = builder.sort;
        this.withCounts = builder.withCounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectLabelsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
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
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return repositoryIdentity
     */
    public String getRepositoryIdentity() {
        return this.repositoryIdentity;
    }

    /**
     * @return search
     */
    public String getSearch() {
        return this.search;
    }

    /**
     * @return sort
     */
    public String getSort() {
        return this.sort;
    }

    /**
     * @return withCounts
     */
    public Boolean getWithCounts() {
        return this.withCounts;
    }

    public static final class Builder extends Request.Builder<ListProjectLabelsRequest, Builder> {
        private String accessToken; 
        private String orderBy; 
        private String organizationId; 
        private Integer page; 
        private Long pageSize; 
        private String repositoryIdentity; 
        private String search; 
        private String sort; 
        private Boolean withCounts; 

        private Builder() {
            super();
        } 

        private Builder(ListProjectLabelsRequest request) {
            super(request);
            this.accessToken = request.accessToken;
            this.orderBy = request.orderBy;
            this.organizationId = request.organizationId;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.repositoryIdentity = request.repositoryIdentity;
            this.search = request.search;
            this.sort = request.sort;
            this.withCounts = request.withCounts;
        } 

        /**
         * accessToken.
         */
        public Builder accessToken(String accessToken) {
            this.putQueryParameter("accessToken", accessToken);
            this.accessToken = accessToken;
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
         * page.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * repositoryIdentity.
         */
        public Builder repositoryIdentity(String repositoryIdentity) {
            this.putQueryParameter("repositoryIdentity", repositoryIdentity);
            this.repositoryIdentity = repositoryIdentity;
            return this;
        }

        /**
         * search.
         */
        public Builder search(String search) {
            this.putQueryParameter("search", search);
            this.search = search;
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

        /**
         * withCounts.
         */
        public Builder withCounts(Boolean withCounts) {
            this.putQueryParameter("withCounts", withCounts);
            this.withCounts = withCounts;
            return this;
        }

        @Override
        public ListProjectLabelsRequest build() {
            return new ListProjectLabelsRequest(this);
        } 

    } 

}
