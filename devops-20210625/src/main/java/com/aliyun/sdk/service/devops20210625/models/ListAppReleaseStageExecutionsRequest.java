// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppReleaseStageExecutionsRequest} extends {@link RequestModel}
 *
 * <p>ListAppReleaseStageExecutionsRequest</p>
 */
public class ListAppReleaseStageExecutionsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("releaseWorkflowSn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String releaseWorkflowSn;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("releaseStageSn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String releaseStageSn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("orderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("organizationId")
    private String organizationId;

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

    private ListAppReleaseStageExecutionsRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.releaseWorkflowSn = builder.releaseWorkflowSn;
        this.releaseStageSn = builder.releaseStageSn;
        this.nextToken = builder.nextToken;
        this.orderBy = builder.orderBy;
        this.organizationId = builder.organizationId;
        this.page = builder.page;
        this.pagination = builder.pagination;
        this.perPage = builder.perPage;
        this.sort = builder.sort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppReleaseStageExecutionsRequest create() {
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
     * @return releaseWorkflowSn
     */
    public String getReleaseWorkflowSn() {
        return this.releaseWorkflowSn;
    }

    /**
     * @return releaseStageSn
     */
    public String getReleaseStageSn() {
        return this.releaseStageSn;
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

    public static final class Builder extends Request.Builder<ListAppReleaseStageExecutionsRequest, Builder> {
        private String appName; 
        private String releaseWorkflowSn; 
        private String releaseStageSn; 
        private String nextToken; 
        private String orderBy; 
        private String organizationId; 
        private Integer page; 
        private String pagination; 
        private Integer perPage; 
        private String sort; 

        private Builder() {
            super();
        } 

        private Builder(ListAppReleaseStageExecutionsRequest request) {
            super(request);
            this.appName = request.appName;
            this.releaseWorkflowSn = request.releaseWorkflowSn;
            this.releaseStageSn = request.releaseStageSn;
            this.nextToken = request.nextToken;
            this.orderBy = request.orderBy;
            this.organizationId = request.organizationId;
            this.page = request.page;
            this.pagination = request.pagination;
            this.perPage = request.perPage;
            this.sort = request.sort;
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
         * releaseWorkflowSn.
         */
        public Builder releaseWorkflowSn(String releaseWorkflowSn) {
            this.putPathParameter("releaseWorkflowSn", releaseWorkflowSn);
            this.releaseWorkflowSn = releaseWorkflowSn;
            return this;
        }

        /**
         * releaseStageSn.
         */
        public Builder releaseStageSn(String releaseStageSn) {
            this.putPathParameter("releaseStageSn", releaseStageSn);
            this.releaseStageSn = releaseStageSn;
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

        @Override
        public ListAppReleaseStageExecutionsRequest build() {
            return new ListAppReleaseStageExecutionsRequest(this);
        } 

    } 

}
