// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSearchRepositoryRequest} extends {@link RequestModel}
 *
 * <p>ListSearchRepositoryRequest</p>
 */
public class ListSearchRepositoryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("aliyunPk")
    private String aliyunPk;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("keyword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String keyword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("order")
    private String order;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("page")
    private Integer page;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("repoPath")
    private RepoPath repoPath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scope")
    private String scope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sort")
    private String sort;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("visibilityLevel")
    private Integer visibilityLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    private ListSearchRepositoryRequest(Builder builder) {
        super(builder);
        this.aliyunPk = builder.aliyunPk;
        this.keyword = builder.keyword;
        this.order = builder.order;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.repoPath = builder.repoPath;
        this.scope = builder.scope;
        this.sort = builder.sort;
        this.visibilityLevel = builder.visibilityLevel;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSearchRepositoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliyunPk
     */
    public String getAliyunPk() {
        return this.aliyunPk;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
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
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return repoPath
     */
    public RepoPath getRepoPath() {
        return this.repoPath;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return sort
     */
    public String getSort() {
        return this.sort;
    }

    /**
     * @return visibilityLevel
     */
    public Integer getVisibilityLevel() {
        return this.visibilityLevel;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static final class Builder extends Request.Builder<ListSearchRepositoryRequest, Builder> {
        private String aliyunPk; 
        private String keyword; 
        private String order; 
        private Integer page; 
        private Integer pageSize; 
        private RepoPath repoPath; 
        private String scope; 
        private String sort; 
        private Integer visibilityLevel; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(ListSearchRepositoryRequest request) {
            super(request);
            this.aliyunPk = request.aliyunPk;
            this.keyword = request.keyword;
            this.order = request.order;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.repoPath = request.repoPath;
            this.scope = request.scope;
            this.sort = request.sort;
            this.visibilityLevel = request.visibilityLevel;
            this.organizationId = request.organizationId;
        } 

        /**
         * aliyunPk.
         */
        public Builder aliyunPk(String aliyunPk) {
            this.putBodyParameter("aliyunPk", aliyunPk);
            this.aliyunPk = aliyunPk;
            return this;
        }

        /**
         * keyword.
         */
        public Builder keyword(String keyword) {
            this.putBodyParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * order.
         */
        public Builder order(String order) {
            this.putBodyParameter("order", order);
            this.order = order;
            return this;
        }

        /**
         * page.
         */
        public Builder page(Integer page) {
            this.putBodyParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * repoPath.
         */
        public Builder repoPath(RepoPath repoPath) {
            this.putBodyParameter("repoPath", repoPath);
            this.repoPath = repoPath;
            return this;
        }

        /**
         * scope.
         */
        public Builder scope(String scope) {
            this.putBodyParameter("scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * sort.
         */
        public Builder sort(String sort) {
            this.putBodyParameter("sort", sort);
            this.sort = sort;
            return this;
        }

        /**
         * visibilityLevel.
         */
        public Builder visibilityLevel(Integer visibilityLevel) {
            this.putBodyParameter("visibilityLevel", visibilityLevel);
            this.visibilityLevel = visibilityLevel;
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

        @Override
        public ListSearchRepositoryRequest build() {
            return new ListSearchRepositoryRequest(this);
        } 

    } 

    public static class RepoPath extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("matchType")
        private String matchType;

        @com.aliyun.core.annotation.NameInMap("operatorType")
        private String operatorType;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private RepoPath(Builder builder) {
            this.matchType = builder.matchType;
            this.operatorType = builder.operatorType;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RepoPath create() {
            return builder().build();
        }

        /**
         * @return matchType
         */
        public String getMatchType() {
            return this.matchType;
        }

        /**
         * @return operatorType
         */
        public String getOperatorType() {
            return this.operatorType;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String matchType; 
            private String operatorType; 
            private String value; 

            /**
             * matchType.
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
                return this;
            }

            /**
             * operatorType.
             */
            public Builder operatorType(String operatorType) {
                this.operatorType = operatorType;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public RepoPath build() {
                return new RepoPath(this);
            } 

        } 

    }
}
