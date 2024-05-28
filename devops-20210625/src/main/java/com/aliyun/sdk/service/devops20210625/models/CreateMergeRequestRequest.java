// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMergeRequestRequest} extends {@link RequestModel}
 *
 * <p>CreateMergeRequestRequest</p>
 */
public class CreateMergeRequestRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("repositoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long repositoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("accessToken")
    private String accessToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("createFrom")
    @com.aliyun.core.annotation.Validation(required = true)
    private String createFrom;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("reviewerIds")
    private java.util.List < String > reviewerIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceBranch")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceBranch;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sourceProjectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("targetBranch")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetBranch;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("targetProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long targetProjectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("title")
    @com.aliyun.core.annotation.Validation(required = true)
    private String title;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workItemIds")
    private String workItemIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    private CreateMergeRequestRequest(Builder builder) {
        super(builder);
        this.repositoryId = builder.repositoryId;
        this.accessToken = builder.accessToken;
        this.createFrom = builder.createFrom;
        this.description = builder.description;
        this.reviewerIds = builder.reviewerIds;
        this.sourceBranch = builder.sourceBranch;
        this.sourceProjectId = builder.sourceProjectId;
        this.targetBranch = builder.targetBranch;
        this.targetProjectId = builder.targetProjectId;
        this.title = builder.title;
        this.workItemIds = builder.workItemIds;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMergeRequestRequest create() {
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
     * @return createFrom
     */
    public String getCreateFrom() {
        return this.createFrom;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return reviewerIds
     */
    public java.util.List < String > getReviewerIds() {
        return this.reviewerIds;
    }

    /**
     * @return sourceBranch
     */
    public String getSourceBranch() {
        return this.sourceBranch;
    }

    /**
     * @return sourceProjectId
     */
    public Long getSourceProjectId() {
        return this.sourceProjectId;
    }

    /**
     * @return targetBranch
     */
    public String getTargetBranch() {
        return this.targetBranch;
    }

    /**
     * @return targetProjectId
     */
    public Long getTargetProjectId() {
        return this.targetProjectId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return workItemIds
     */
    public String getWorkItemIds() {
        return this.workItemIds;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static final class Builder extends Request.Builder<CreateMergeRequestRequest, Builder> {
        private Long repositoryId; 
        private String accessToken; 
        private String createFrom; 
        private String description; 
        private java.util.List < String > reviewerIds; 
        private String sourceBranch; 
        private Long sourceProjectId; 
        private String targetBranch; 
        private Long targetProjectId; 
        private String title; 
        private String workItemIds; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(CreateMergeRequestRequest request) {
            super(request);
            this.repositoryId = request.repositoryId;
            this.accessToken = request.accessToken;
            this.createFrom = request.createFrom;
            this.description = request.description;
            this.reviewerIds = request.reviewerIds;
            this.sourceBranch = request.sourceBranch;
            this.sourceProjectId = request.sourceProjectId;
            this.targetBranch = request.targetBranch;
            this.targetProjectId = request.targetProjectId;
            this.title = request.title;
            this.workItemIds = request.workItemIds;
            this.organizationId = request.organizationId;
        } 

        /**
         * repositoryId.
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
         * createFrom.
         */
        public Builder createFrom(String createFrom) {
            this.putBodyParameter("createFrom", createFrom);
            this.createFrom = createFrom;
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
         * reviewerIds.
         */
        public Builder reviewerIds(java.util.List < String > reviewerIds) {
            this.putBodyParameter("reviewerIds", reviewerIds);
            this.reviewerIds = reviewerIds;
            return this;
        }

        /**
         * sourceBranch.
         */
        public Builder sourceBranch(String sourceBranch) {
            this.putBodyParameter("sourceBranch", sourceBranch);
            this.sourceBranch = sourceBranch;
            return this;
        }

        /**
         * sourceProjectId.
         */
        public Builder sourceProjectId(Long sourceProjectId) {
            this.putBodyParameter("sourceProjectId", sourceProjectId);
            this.sourceProjectId = sourceProjectId;
            return this;
        }

        /**
         * targetBranch.
         */
        public Builder targetBranch(String targetBranch) {
            this.putBodyParameter("targetBranch", targetBranch);
            this.targetBranch = targetBranch;
            return this;
        }

        /**
         * targetProjectId.
         */
        public Builder targetProjectId(Long targetProjectId) {
            this.putBodyParameter("targetProjectId", targetProjectId);
            this.targetProjectId = targetProjectId;
            return this;
        }

        /**
         * title.
         */
        public Builder title(String title) {
            this.putBodyParameter("title", title);
            this.title = title;
            return this;
        }

        /**
         * workItemIds.
         */
        public Builder workItemIds(String workItemIds) {
            this.putBodyParameter("workItemIds", workItemIds);
            this.workItemIds = workItemIds;
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
        public CreateMergeRequestRequest build() {
            return new CreateMergeRequestRequest(this);
        } 

    } 

}
