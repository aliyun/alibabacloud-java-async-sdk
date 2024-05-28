// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCommitStatusRequest} extends {@link RequestModel}
 *
 * <p>CreateCommitStatusRequest</p>
 */
public class CreateCommitStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("accessToken")
    private String accessToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("context")
    private String context;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("state")
    @com.aliyun.core.annotation.Validation(required = true)
    private String state;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("targetUrl")
    private String targetUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("repositoryIdentity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String repositoryIdentity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sha")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sha;

    private CreateCommitStatusRequest(Builder builder) {
        super(builder);
        this.accessToken = builder.accessToken;
        this.context = builder.context;
        this.description = builder.description;
        this.state = builder.state;
        this.targetUrl = builder.targetUrl;
        this.organizationId = builder.organizationId;
        this.repositoryIdentity = builder.repositoryIdentity;
        this.sha = builder.sha;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCommitStatusRequest create() {
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
     * @return context
     */
    public String getContext() {
        return this.context;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return targetUrl
     */
    public String getTargetUrl() {
        return this.targetUrl;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
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

    public static final class Builder extends Request.Builder<CreateCommitStatusRequest, Builder> {
        private String accessToken; 
        private String context; 
        private String description; 
        private String state; 
        private String targetUrl; 
        private String organizationId; 
        private String repositoryIdentity; 
        private String sha; 

        private Builder() {
            super();
        } 

        private Builder(CreateCommitStatusRequest request) {
            super(request);
            this.accessToken = request.accessToken;
            this.context = request.context;
            this.description = request.description;
            this.state = request.state;
            this.targetUrl = request.targetUrl;
            this.organizationId = request.organizationId;
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
         * context.
         */
        public Builder context(String context) {
            this.putBodyParameter("context", context);
            this.context = context;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * state.
         */
        public Builder state(String state) {
            this.putBodyParameter("state", state);
            this.state = state;
            return this;
        }

        /**
         * targetUrl.
         */
        public Builder targetUrl(String targetUrl) {
            this.putBodyParameter("targetUrl", targetUrl);
            this.targetUrl = targetUrl;
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
         * repositoryIdentity.
         */
        public Builder repositoryIdentity(String repositoryIdentity) {
            this.putQueryParameter("repositoryIdentity", repositoryIdentity);
            this.repositoryIdentity = repositoryIdentity;
            return this;
        }

        /**
         * sha.
         */
        public Builder sha(String sha) {
            this.putQueryParameter("sha", sha);
            this.sha = sha;
            return this;
        }

        @Override
        public CreateCommitStatusRequest build() {
            return new CreateCommitStatusRequest(this);
        } 

    } 

}
