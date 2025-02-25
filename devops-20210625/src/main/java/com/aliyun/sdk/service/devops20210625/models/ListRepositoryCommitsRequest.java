// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListRepositoryCommitsRequest} extends {@link RequestModel}
 *
 * <p>ListRepositoryCommitsRequest</p>
 */
public class ListRepositoryCommitsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("repositoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long repositoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("accessToken")
    private String accessToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("end")
    private String end;

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
    @com.aliyun.core.annotation.NameInMap("path")
    private String path;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("refName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String refName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("search")
    private String search;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("showCommentsCount")
    private Boolean showCommentsCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("showSignature")
    private Boolean showSignature;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("start")
    private String start;

    private ListRepositoryCommitsRequest(Builder builder) {
        super(builder);
        this.repositoryId = builder.repositoryId;
        this.accessToken = builder.accessToken;
        this.end = builder.end;
        this.organizationId = builder.organizationId;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.path = builder.path;
        this.refName = builder.refName;
        this.search = builder.search;
        this.showCommentsCount = builder.showCommentsCount;
        this.showSignature = builder.showSignature;
        this.start = builder.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRepositoryCommitsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return repositoryId
     */
    public Long getRepositoryId() {
        return this.repositoryId;
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return end
     */
    public String getEnd() {
        return this.end;
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
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return refName
     */
    public String getRefName() {
        return this.refName;
    }

    /**
     * @return search
     */
    public String getSearch() {
        return this.search;
    }

    /**
     * @return showCommentsCount
     */
    public Boolean getShowCommentsCount() {
        return this.showCommentsCount;
    }

    /**
     * @return showSignature
     */
    public Boolean getShowSignature() {
        return this.showSignature;
    }

    /**
     * @return start
     */
    public String getStart() {
        return this.start;
    }

    public static final class Builder extends Request.Builder<ListRepositoryCommitsRequest, Builder> {
        private Long repositoryId; 
        private String accessToken; 
        private String end; 
        private String organizationId; 
        private Long page; 
        private Long pageSize; 
        private String path; 
        private String refName; 
        private String search; 
        private Boolean showCommentsCount; 
        private Boolean showSignature; 
        private String start; 

        private Builder() {
            super();
        } 

        private Builder(ListRepositoryCommitsRequest request) {
            super(request);
            this.repositoryId = request.repositoryId;
            this.accessToken = request.accessToken;
            this.end = request.end;
            this.organizationId = request.organizationId;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.path = request.path;
            this.refName = request.refName;
            this.search = request.search;
            this.showCommentsCount = request.showCommentsCount;
            this.showSignature = request.showSignature;
            this.start = request.start;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2334743</p>
         */
        public Builder repositoryId(Long repositoryId) {
            this.putPathParameter("repositoryId", repositoryId);
            this.repositoryId = repositoryId;
            return this;
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
         * end.
         */
        public Builder end(String end) {
            this.putQueryParameter("end", end);
            this.end = end;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>60de7a6852743a5162b5f957</p>
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
         * path.
         */
        public Builder path(String path) {
            this.putQueryParameter("path", path);
            this.path = path;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder refName(String refName) {
            this.putQueryParameter("refName", refName);
            this.refName = refName;
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
         * showCommentsCount.
         */
        public Builder showCommentsCount(Boolean showCommentsCount) {
            this.putQueryParameter("showCommentsCount", showCommentsCount);
            this.showCommentsCount = showCommentsCount;
            return this;
        }

        /**
         * showSignature.
         */
        public Builder showSignature(Boolean showSignature) {
            this.putQueryParameter("showSignature", showSignature);
            this.showSignature = showSignature;
            return this;
        }

        /**
         * start.
         */
        public Builder start(String start) {
            this.putQueryParameter("start", start);
            this.start = start;
            return this;
        }

        @Override
        public ListRepositoryCommitsRequest build() {
            return new ListRepositoryCommitsRequest(this);
        } 

    } 

}
