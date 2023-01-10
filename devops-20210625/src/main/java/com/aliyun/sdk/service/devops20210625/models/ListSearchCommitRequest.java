// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSearchCommitRequest} extends {@link RequestModel}
 *
 * <p>ListSearchCommitRequest</p>
 */
public class ListSearchCommitRequest extends Request {
    @Body
    @NameInMap("keyword")
    @Validation(required = true)
    private String keyword;

    @Body
    @NameInMap("order")
    private String order;

    @Body
    @NameInMap("page")
    private Integer page;

    @Body
    @NameInMap("pageSize")
    private Integer pageSize;

    @Body
    @NameInMap("repoPath")
    private RepoPath repoPath;

    @Body
    @NameInMap("scope")
    private String scope;

    @Body
    @NameInMap("sort")
    private String sort;

    @Query
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    private ListSearchCommitRequest(Builder builder) {
        super(builder);
        this.keyword = builder.keyword;
        this.order = builder.order;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.repoPath = builder.repoPath;
        this.scope = builder.scope;
        this.sort = builder.sort;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSearchCommitRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static final class Builder extends Request.Builder<ListSearchCommitRequest, Builder> {
        private String keyword; 
        private String order; 
        private Integer page; 
        private Integer pageSize; 
        private RepoPath repoPath; 
        private String scope; 
        private String sort; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(ListSearchCommitRequest request) {
            super(request);
            this.keyword = request.keyword;
            this.order = request.order;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.repoPath = request.repoPath;
            this.scope = request.scope;
            this.sort = request.sort;
            this.organizationId = request.organizationId;
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
         * A short description of struct
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        @Override
        public ListSearchCommitRequest build() {
            return new ListSearchCommitRequest(this);
        } 

    } 

    public static class RepoPath extends TeaModel {
        @NameInMap("matchType")
        private String matchType;

        @NameInMap("operatorType")
        private String operatorType;

        @NameInMap("value")
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
