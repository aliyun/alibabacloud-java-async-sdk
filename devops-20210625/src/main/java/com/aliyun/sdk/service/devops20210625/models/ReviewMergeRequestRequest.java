// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReviewMergeRequestRequest} extends {@link RequestModel}
 *
 * <p>ReviewMergeRequestRequest</p>
 */
public class ReviewMergeRequestRequest extends Request {
    @Path
    @NameInMap("repositoryId")
    @Validation(required = true)
    private Long repositoryId;

    @Path
    @NameInMap("localId")
    @Validation(required = true)
    private Long localId;

    @Query
    @NameInMap("accessToken")
    private String accessToken;

    @Body
    @NameInMap("draftCommentIds")
    private java.util.List < String > draftCommentIds;

    @Body
    @NameInMap("reviewComment")
    private String reviewComment;

    @Body
    @NameInMap("reviewOpinion")
    @Validation(required = true)
    private String reviewOpinion;

    @Query
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    private ReviewMergeRequestRequest(Builder builder) {
        super(builder);
        this.repositoryId = builder.repositoryId;
        this.localId = builder.localId;
        this.accessToken = builder.accessToken;
        this.draftCommentIds = builder.draftCommentIds;
        this.reviewComment = builder.reviewComment;
        this.reviewOpinion = builder.reviewOpinion;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReviewMergeRequestRequest create() {
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
     * @return localId
     */
    public Long getLocalId() {
        return this.localId;
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return draftCommentIds
     */
    public java.util.List < String > getDraftCommentIds() {
        return this.draftCommentIds;
    }

    /**
     * @return reviewComment
     */
    public String getReviewComment() {
        return this.reviewComment;
    }

    /**
     * @return reviewOpinion
     */
    public String getReviewOpinion() {
        return this.reviewOpinion;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static final class Builder extends Request.Builder<ReviewMergeRequestRequest, Builder> {
        private Long repositoryId; 
        private Long localId; 
        private String accessToken; 
        private java.util.List < String > draftCommentIds; 
        private String reviewComment; 
        private String reviewOpinion; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(ReviewMergeRequestRequest request) {
            super(request);
            this.repositoryId = request.repositoryId;
            this.localId = request.localId;
            this.accessToken = request.accessToken;
            this.draftCommentIds = request.draftCommentIds;
            this.reviewComment = request.reviewComment;
            this.reviewOpinion = request.reviewOpinion;
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
         * localId.
         */
        public Builder localId(Long localId) {
            this.putPathParameter("localId", localId);
            this.localId = localId;
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
         * draftCommentIds.
         */
        public Builder draftCommentIds(java.util.List < String > draftCommentIds) {
            this.putBodyParameter("draftCommentIds", draftCommentIds);
            this.draftCommentIds = draftCommentIds;
            return this;
        }

        /**
         * reviewComment.
         */
        public Builder reviewComment(String reviewComment) {
            this.putBodyParameter("reviewComment", reviewComment);
            this.reviewComment = reviewComment;
            return this;
        }

        /**
         * reviewOpinion.
         */
        public Builder reviewOpinion(String reviewOpinion) {
            this.putBodyParameter("reviewOpinion", reviewOpinion);
            this.reviewOpinion = reviewOpinion;
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
        public ReviewMergeRequestRequest build() {
            return new ReviewMergeRequestRequest(this);
        } 

    } 

}
