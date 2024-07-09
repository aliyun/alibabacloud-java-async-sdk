// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListChangeRequestsRequest} extends {@link RequestModel}
 *
 * <p>ListChangeRequestsRequest</p>
 */
public class ListChangeRequestsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("appNameList")
    private java.util.List < String > appNameList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("displayNameKeyword")
    private String displayNameKeyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("orderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ownerIdList")
    private java.util.List < String > ownerIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page")
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pagination")
    private String pagination;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("perPage")
    private Integer perPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sort")
    private String sort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("stateList")
    private java.util.List < String > stateList;

    private ListChangeRequestsRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.appNameList = builder.appNameList;
        this.displayNameKeyword = builder.displayNameKeyword;
        this.nextToken = builder.nextToken;
        this.orderBy = builder.orderBy;
        this.organizationId = builder.organizationId;
        this.ownerIdList = builder.ownerIdList;
        this.page = builder.page;
        this.pagination = builder.pagination;
        this.perPage = builder.perPage;
        this.sort = builder.sort;
        this.stateList = builder.stateList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChangeRequestsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return appNameList
     */
    public java.util.List < String > getAppNameList() {
        return this.appNameList;
    }

    /**
     * @return displayNameKeyword
     */
    public String getDisplayNameKeyword() {
        return this.displayNameKeyword;
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
     * @return ownerIdList
     */
    public java.util.List < String > getOwnerIdList() {
        return this.ownerIdList;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
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

    /**
     * @return stateList
     */
    public java.util.List < String > getStateList() {
        return this.stateList;
    }

    public static final class Builder extends Request.Builder<ListChangeRequestsRequest, Builder> {
        private String appName; 
        private java.util.List < String > appNameList; 
        private String displayNameKeyword; 
        private String nextToken; 
        private String orderBy; 
        private String organizationId; 
        private java.util.List < String > ownerIdList; 
        private Integer page; 
        private String pagination; 
        private Integer perPage; 
        private String sort; 
        private java.util.List < String > stateList; 

        private Builder() {
            super();
        } 

        private Builder(ListChangeRequestsRequest request) {
            super(request);
            this.appName = request.appName;
            this.appNameList = request.appNameList;
            this.displayNameKeyword = request.displayNameKeyword;
            this.nextToken = request.nextToken;
            this.orderBy = request.orderBy;
            this.organizationId = request.organizationId;
            this.ownerIdList = request.ownerIdList;
            this.page = request.page;
            this.pagination = request.pagination;
            this.perPage = request.perPage;
            this.sort = request.sort;
            this.stateList = request.stateList;
        } 

        /**
         * appName.
         */
        public Builder appName(String appName) {
            this.putPathParameter("appName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * appNameList.
         */
        public Builder appNameList(java.util.List < String > appNameList) {
            String appNameListShrink = shrink(appNameList, "appNameList", "json");
            this.putQueryParameter("appNameList", appNameListShrink);
            this.appNameList = appNameList;
            return this;
        }

        /**
         * displayNameKeyword.
         */
        public Builder displayNameKeyword(String displayNameKeyword) {
            this.putQueryParameter("displayNameKeyword", displayNameKeyword);
            this.displayNameKeyword = displayNameKeyword;
            return this;
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
         * ownerIdList.
         */
        public Builder ownerIdList(java.util.List < String > ownerIdList) {
            String ownerIdListShrink = shrink(ownerIdList, "ownerIdList", "json");
            this.putQueryParameter("ownerIdList", ownerIdListShrink);
            this.ownerIdList = ownerIdList;
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

        /**
         * stateList.
         */
        public Builder stateList(java.util.List < String > stateList) {
            String stateListShrink = shrink(stateList, "stateList", "json");
            this.putQueryParameter("stateList", stateListShrink);
            this.stateList = stateList;
            return this;
        }

        @Override
        public ListChangeRequestsRequest build() {
            return new ListChangeRequestsRequest(this);
        } 

    } 

}
