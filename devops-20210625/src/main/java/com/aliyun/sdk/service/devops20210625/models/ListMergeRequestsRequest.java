// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMergeRequestsRequest} extends {@link RequestModel}
 *
 * <p>ListMergeRequestsRequest</p>
 */
public class ListMergeRequestsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("accessToken")
    private String accessToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("authorIds")
    private String authorIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("createdAfter")
    private String createdAfter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("createdBefore")
    private String createdBefore;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("filter")
    private String filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("groupIds")
    private String groupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("labelIds")
    private String labelIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("orderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page")
    private Long page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("projectIds")
    private String projectIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("reviewerIds")
    private String reviewerIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("search")
    private String search;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sort")
    private String sort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("state")
    private String state;

    private ListMergeRequestsRequest(Builder builder) {
        super(builder);
        this.accessToken = builder.accessToken;
        this.authorIds = builder.authorIds;
        this.createdAfter = builder.createdAfter;
        this.createdBefore = builder.createdBefore;
        this.filter = builder.filter;
        this.groupIds = builder.groupIds;
        this.labelIds = builder.labelIds;
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
     * @return createdAfter
     */
    public String getCreatedAfter() {
        return this.createdAfter;
    }

    /**
     * @return createdBefore
     */
    public String getCreatedBefore() {
        return this.createdBefore;
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
     * @return labelIds
     */
    public String getLabelIds() {
        return this.labelIds;
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
        private String createdAfter; 
        private String createdBefore; 
        private String filter; 
        private String groupIds; 
        private String labelIds; 
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
            this.createdAfter = request.createdAfter;
            this.createdBefore = request.createdBefore;
            this.filter = request.filter;
            this.groupIds = request.groupIds;
            this.labelIds = request.labelIds;
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
         * createdAfter.
         */
        public Builder createdAfter(String createdAfter) {
            this.putQueryParameter("createdAfter", createdAfter);
            this.createdAfter = createdAfter;
            return this;
        }

        /**
         * createdBefore.
         */
        public Builder createdBefore(String createdBefore) {
            this.putQueryParameter("createdBefore", createdBefore);
            this.createdBefore = createdBefore;
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
         * labelIds.
         */
        public Builder labelIds(String labelIds) {
            this.putQueryParameter("labelIds", labelIds);
            this.labelIds = labelIds;
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
