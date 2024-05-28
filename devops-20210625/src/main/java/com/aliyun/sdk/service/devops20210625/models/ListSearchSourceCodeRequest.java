// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSearchSourceCodeRequest} extends {@link RequestModel}
 *
 * <p>ListSearchSourceCodeRequest</p>
 */
public class ListSearchSourceCodeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("filePath")
    private FilePath filePath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("isCodeBlock")
    private Boolean isCodeBlock;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("keyword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String keyword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("language")
    private String language;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    private ListSearchSourceCodeRequest(Builder builder) {
        super(builder);
        this.filePath = builder.filePath;
        this.isCodeBlock = builder.isCodeBlock;
        this.keyword = builder.keyword;
        this.language = builder.language;
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

    public static ListSearchSourceCodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filePath
     */
    public FilePath getFilePath() {
        return this.filePath;
    }

    /**
     * @return isCodeBlock
     */
    public Boolean getIsCodeBlock() {
        return this.isCodeBlock;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
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

    public static final class Builder extends Request.Builder<ListSearchSourceCodeRequest, Builder> {
        private FilePath filePath; 
        private Boolean isCodeBlock; 
        private String keyword; 
        private String language; 
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

        private Builder(ListSearchSourceCodeRequest request) {
            super(request);
            this.filePath = request.filePath;
            this.isCodeBlock = request.isCodeBlock;
            this.keyword = request.keyword;
            this.language = request.language;
            this.order = request.order;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.repoPath = request.repoPath;
            this.scope = request.scope;
            this.sort = request.sort;
            this.organizationId = request.organizationId;
        } 

        /**
         * filePath.
         */
        public Builder filePath(FilePath filePath) {
            this.putBodyParameter("filePath", filePath);
            this.filePath = filePath;
            return this;
        }

        /**
         * isCodeBlock.
         */
        public Builder isCodeBlock(Boolean isCodeBlock) {
            this.putBodyParameter("isCodeBlock", isCodeBlock);
            this.isCodeBlock = isCodeBlock;
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
         * language.
         */
        public Builder language(String language) {
            this.putBodyParameter("language", language);
            this.language = language;
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
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        @Override
        public ListSearchSourceCodeRequest build() {
            return new ListSearchSourceCodeRequest(this);
        } 

    } 

    public static class FilePath extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("matchType")
        private String matchType;

        @com.aliyun.core.annotation.NameInMap("operatorType")
        private String operatorType;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private FilePath(Builder builder) {
            this.matchType = builder.matchType;
            this.operatorType = builder.operatorType;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FilePath create() {
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

            public FilePath build() {
                return new FilePath(this);
            } 

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
