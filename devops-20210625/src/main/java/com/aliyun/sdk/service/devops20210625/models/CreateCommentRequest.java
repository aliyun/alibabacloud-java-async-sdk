// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCommentRequest} extends {@link RequestModel}
 *
 * <p>CreateCommentRequest</p>
 */
public class CreateCommentRequest extends Request {
    @Query
    @NameInMap("accessToken")
    private String accessToken;

    @Body
    @NameInMap("commentType")
    @Validation(required = true)
    private String commentType;

    @Body
    @NameInMap("content")
    @Validation(required = true)
    private String content;

    @Body
    @NameInMap("draft")
    private Boolean draft;

    @Body
    @NameInMap("filePath")
    private String filePath;

    @Body
    @NameInMap("lineNumber")
    private Integer lineNumber;

    @Body
    @NameInMap("parentCommentBizId")
    private String parentCommentBizId;

    @Body
    @NameInMap("patchSetBizId")
    private String patchSetBizId;

    @Body
    @NameInMap("resolved")
    private Boolean resolved;

    @Query
    @NameInMap("localId")
    @Validation(required = true)
    private Long localId;

    @Query
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Query
    @NameInMap("repositoryIdentity")
    @Validation(required = true)
    private String repositoryIdentity;

    private CreateCommentRequest(Builder builder) {
        super(builder);
        this.accessToken = builder.accessToken;
        this.commentType = builder.commentType;
        this.content = builder.content;
        this.draft = builder.draft;
        this.filePath = builder.filePath;
        this.lineNumber = builder.lineNumber;
        this.parentCommentBizId = builder.parentCommentBizId;
        this.patchSetBizId = builder.patchSetBizId;
        this.resolved = builder.resolved;
        this.localId = builder.localId;
        this.organizationId = builder.organizationId;
        this.repositoryIdentity = builder.repositoryIdentity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCommentRequest create() {
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
     * @return commentType
     */
    public String getCommentType() {
        return this.commentType;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return draft
     */
    public Boolean getDraft() {
        return this.draft;
    }

    /**
     * @return filePath
     */
    public String getFilePath() {
        return this.filePath;
    }

    /**
     * @return lineNumber
     */
    public Integer getLineNumber() {
        return this.lineNumber;
    }

    /**
     * @return parentCommentBizId
     */
    public String getParentCommentBizId() {
        return this.parentCommentBizId;
    }

    /**
     * @return patchSetBizId
     */
    public String getPatchSetBizId() {
        return this.patchSetBizId;
    }

    /**
     * @return resolved
     */
    public Boolean getResolved() {
        return this.resolved;
    }

    /**
     * @return localId
     */
    public Long getLocalId() {
        return this.localId;
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

    public static final class Builder extends Request.Builder<CreateCommentRequest, Builder> {
        private String accessToken; 
        private String commentType; 
        private String content; 
        private Boolean draft; 
        private String filePath; 
        private Integer lineNumber; 
        private String parentCommentBizId; 
        private String patchSetBizId; 
        private Boolean resolved; 
        private Long localId; 
        private String organizationId; 
        private String repositoryIdentity; 

        private Builder() {
            super();
        } 

        private Builder(CreateCommentRequest request) {
            super(request);
            this.accessToken = request.accessToken;
            this.commentType = request.commentType;
            this.content = request.content;
            this.draft = request.draft;
            this.filePath = request.filePath;
            this.lineNumber = request.lineNumber;
            this.parentCommentBizId = request.parentCommentBizId;
            this.patchSetBizId = request.patchSetBizId;
            this.resolved = request.resolved;
            this.localId = request.localId;
            this.organizationId = request.organizationId;
            this.repositoryIdentity = request.repositoryIdentity;
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
         * commentType.
         */
        public Builder commentType(String commentType) {
            this.putBodyParameter("commentType", commentType);
            this.commentType = commentType;
            return this;
        }

        /**
         * content.
         */
        public Builder content(String content) {
            this.putBodyParameter("content", content);
            this.content = content;
            return this;
        }

        /**
         * draft.
         */
        public Builder draft(Boolean draft) {
            this.putBodyParameter("draft", draft);
            this.draft = draft;
            return this;
        }

        /**
         * filePath.
         */
        public Builder filePath(String filePath) {
            this.putBodyParameter("filePath", filePath);
            this.filePath = filePath;
            return this;
        }

        /**
         * lineNumber.
         */
        public Builder lineNumber(Integer lineNumber) {
            this.putBodyParameter("lineNumber", lineNumber);
            this.lineNumber = lineNumber;
            return this;
        }

        /**
         * parentCommentBizId.
         */
        public Builder parentCommentBizId(String parentCommentBizId) {
            this.putBodyParameter("parentCommentBizId", parentCommentBizId);
            this.parentCommentBizId = parentCommentBizId;
            return this;
        }

        /**
         * patchSetBizId.
         */
        public Builder patchSetBizId(String patchSetBizId) {
            this.putBodyParameter("patchSetBizId", patchSetBizId);
            this.patchSetBizId = patchSetBizId;
            return this;
        }

        /**
         * resolved.
         */
        public Builder resolved(Boolean resolved) {
            this.putBodyParameter("resolved", resolved);
            this.resolved = resolved;
            return this;
        }

        /**
         * localId.
         */
        public Builder localId(Long localId) {
            this.putQueryParameter("localId", localId);
            this.localId = localId;
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

        @Override
        public CreateCommentRequest build() {
            return new CreateCommentRequest(this);
        } 

    } 

}
