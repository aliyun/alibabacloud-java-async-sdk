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
 * {@link ListCommitStatusesRequest} extends {@link RequestModel}
 *
 * <p>ListCommitStatusesRequest</p>
 */
public class ListCommitStatusesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("accessToken")
    private String accessToken;

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
    @com.aliyun.core.annotation.NameInMap("repositoryIdentity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String repositoryIdentity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sha")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sha;

    private ListCommitStatusesRequest(Builder builder) {
        super(builder);
        this.accessToken = builder.accessToken;
        this.organizationId = builder.organizationId;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.repositoryIdentity = builder.repositoryIdentity;
        this.sha = builder.sha;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCommitStatusesRequest create() {
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
     * @return repositoryIdentity
     */
    public String getRepositoryIdentity() {
        return this.repositoryIdentity;
    }

    /**
     * @return sha
     */
    public String getSha() {
        return this.sha;
    }

    public static final class Builder extends Request.Builder<ListCommitStatusesRequest, Builder> {
        private String accessToken; 
        private String organizationId; 
        private Long page; 
        private Long pageSize; 
        private String repositoryIdentity; 
        private String sha; 

        private Builder() {
            super();
        } 

        private Builder(ListCommitStatusesRequest request) {
            super(request);
            this.accessToken = request.accessToken;
            this.organizationId = request.organizationId;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.repositoryIdentity = request.repositoryIdentity;
            this.sha = request.sha;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5ebbc0228123212b59xxxxx</p>
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
         * <p>This parameter is required.</p>
         */
        public Builder repositoryIdentity(String repositoryIdentity) {
            this.putQueryParameter("repositoryIdentity", repositoryIdentity);
            this.repositoryIdentity = repositoryIdentity;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>61cc69557962d29f737a91730b3e86f497f083a3</p>
         */
        public Builder sha(String sha) {
            this.putQueryParameter("sha", sha);
            this.sha = sha;
            return this;
        }

        @Override
        public ListCommitStatusesRequest build() {
            return new ListCommitStatusesRequest(this);
        } 

    } 

}
