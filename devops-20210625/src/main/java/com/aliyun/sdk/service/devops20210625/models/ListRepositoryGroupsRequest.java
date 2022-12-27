// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRepositoryGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListRepositoryGroupsRequest</p>
 */
public class ListRepositoryGroupsRequest extends Request {
    @Query
    @NameInMap("accessToken")
    private String accessToken;

    @Query
    @NameInMap("includePersonal")
    private Boolean includePersonal;

    @Query
    @NameInMap("orderBy")
    private String orderBy;

    @Query
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Query
    @NameInMap("page")
    private Long page;

    @Query
    @NameInMap("pageSize")
    private Long pageSize;

    @Query
    @NameInMap("parentId")
    @Validation(required = true)
    private Long parentId;

    @Query
    @NameInMap("search")
    private String search;

    @Query
    @NameInMap("sort")
    private String sort;

    private ListRepositoryGroupsRequest(Builder builder) {
        super(builder);
        this.accessToken = builder.accessToken;
        this.includePersonal = builder.includePersonal;
        this.orderBy = builder.orderBy;
        this.organizationId = builder.organizationId;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.parentId = builder.parentId;
        this.search = builder.search;
        this.sort = builder.sort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRepositoryGroupsRequest create() {
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
     * @return includePersonal
     */
    public Boolean getIncludePersonal() {
        return this.includePersonal;
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
    public Long getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return parentId
     */
    public Long getParentId() {
        return this.parentId;
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

    public static final class Builder extends Request.Builder<ListRepositoryGroupsRequest, Builder> {
        private String accessToken; 
        private Boolean includePersonal; 
        private String orderBy; 
        private String organizationId; 
        private Long page; 
        private Long pageSize; 
        private Long parentId; 
        private String search; 
        private String sort; 

        private Builder() {
            super();
        } 

        private Builder(ListRepositoryGroupsRequest request) {
            super(request);
            this.accessToken = request.accessToken;
            this.includePersonal = request.includePersonal;
            this.orderBy = request.orderBy;
            this.organizationId = request.organizationId;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.parentId = request.parentId;
            this.search = request.search;
            this.sort = request.sort;
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
         * includePersonal.
         */
        public Builder includePersonal(Boolean includePersonal) {
            this.putQueryParameter("includePersonal", includePersonal);
            this.includePersonal = includePersonal;
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
         * A short description of struct
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * page.
         */
        public Builder page(Long page) {
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
         * parentId.
         */
        public Builder parentId(Long parentId) {
            this.putQueryParameter("parentId", parentId);
            this.parentId = parentId;
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

        @Override
        public ListRepositoryGroupsRequest build() {
            return new ListRepositoryGroupsRequest(this);
        } 

    } 

}
