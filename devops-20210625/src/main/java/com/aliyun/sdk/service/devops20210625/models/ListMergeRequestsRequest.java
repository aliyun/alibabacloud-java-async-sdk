// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMergeRequestsRequest} extends {@link RequestModel}
 *
 * <p>ListMergeRequestsRequest</p>
 */
public class ListMergeRequestsRequest extends Request {
    @Query
    @NameInMap("accessToken")
    private String accessToken;

    @Query
    @NameInMap("authorIds")
    private String authorIds;

    @Query
    @NameInMap("filter")
    private String filter;

    @Query
    @NameInMap("groupIds")
    private String groupIds;

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
    @NameInMap("projectIds")
    private String projectIds;

    @Query
    @NameInMap("reviewerIds")
    private String reviewerIds;

    @Query
    @NameInMap("search")
    private String search;

    @Query
    @NameInMap("sort")
    private String sort;

    @Query
    @NameInMap("state")
    private String state;

    private ListMergeRequestsRequest(Builder builder) {
        super(builder);
        this.accessToken = builder.accessToken;
        this.authorIds = builder.authorIds;
        this.filter = builder.filter;
        this.groupIds = builder.groupIds;
        this.orderBy = builder.orderBy;
        this.organizationId = builder.organizationId;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.projectIds = builder.projectIds;
        this.reviewerIds = builder.reviewerIds;
        this.search = builder.search;
        this.sort = builder.sort;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMergeRequestsRequest create() {
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
     * @return authorIds
     */
    public String getAuthorIds() {
        return this.authorIds;
    }

    /**
     * @return filter
     */
    public String getFilter() {
        return this.filter;
    }

    /**
     * @return groupIds
     */
    public String getGroupIds() {
        return this.groupIds;
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
     * @return projectIds
     */
    public String getProjectIds() {
        return this.projectIds;
    }

    /**
     * @return reviewerIds
     */
    public String getReviewerIds() {
        return this.reviewerIds;
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
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder extends Request.Builder<ListMergeRequestsRequest, Builder> {
        private String accessToken; 
        private String authorIds; 
        private String filter; 
        private String groupIds; 
        private String orderBy; 
        private String organizationId; 
        private Long page; 
        private Long pageSize; 
        private String projectIds; 
        private String reviewerIds; 
        private String search; 
        private String sort; 
        private String state; 

        private Builder() {
            super();
        } 

        private Builder(ListMergeRequestsRequest request) {
            super(request);
            this.accessToken = request.accessToken;
            this.authorIds = request.authorIds;
            this.filter = request.filter;
            this.groupIds = request.groupIds;
            this.orderBy = request.orderBy;
            this.organizationId = request.organizationId;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.projectIds = request.projectIds;
            this.reviewerIds = request.reviewerIds;
            this.search = request.search;
            this.sort = request.sort;
            this.state = request.state;
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
         * authorIds.
         */
        public Builder authorIds(String authorIds) {
            this.putQueryParameter("authorIds", authorIds);
            this.authorIds = authorIds;
            return this;
        }

        /**
         * filter.
         */
        public Builder filter(String filter) {
            this.putQueryParameter("filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * groupIds.
         */
        public Builder groupIds(String groupIds) {
            this.putQueryParameter("groupIds", groupIds);
            this.groupIds = groupIds;
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
         * projectIds.
         */
        public Builder projectIds(String projectIds) {
            this.putQueryParameter("projectIds", projectIds);
            this.projectIds = projectIds;
            return this;
        }

        /**
         * reviewerIds.
         */
        public Builder reviewerIds(String reviewerIds) {
            this.putQueryParameter("reviewerIds", reviewerIds);
            this.reviewerIds = reviewerIds;
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
         * state.
         */
        public Builder state(String state) {
            this.putQueryParameter("state", state);
            this.state = state;
            return this;
        }

        @Override
        public ListMergeRequestsRequest build() {
            return new ListMergeRequestsRequest(this);
        } 

    } 

}
