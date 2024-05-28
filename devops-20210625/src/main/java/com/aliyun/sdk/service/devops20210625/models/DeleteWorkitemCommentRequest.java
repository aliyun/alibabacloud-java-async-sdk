// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteWorkitemCommentRequest} extends {@link RequestModel}
 *
 * <p>DeleteWorkitemCommentRequest</p>
 */
public class DeleteWorkitemCommentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("commentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long commentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("identifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identifier;

    private DeleteWorkitemCommentRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.commentId = builder.commentId;
        this.identifier = builder.identifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteWorkitemCommentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return commentId
     */
    public Long getCommentId() {
        return this.commentId;
    }

    /**
     * @return identifier
     */
    public String getIdentifier() {
        return this.identifier;
    }

    public static final class Builder extends Request.Builder<DeleteWorkitemCommentRequest, Builder> {
        private String organizationId; 
        private Long commentId; 
        private String identifier; 

        private Builder() {
            super();
        } 

        private Builder(DeleteWorkitemCommentRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.commentId = request.commentId;
            this.identifier = request.identifier;
        } 

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * commentId.
         */
        public Builder commentId(Long commentId) {
            this.putBodyParameter("commentId", commentId);
            this.commentId = commentId;
            return this;
        }

        /**
         * identifier.
         */
        public Builder identifier(String identifier) {
            this.putBodyParameter("identifier", identifier);
            this.identifier = identifier;
            return this;
        }

        @Override
        public DeleteWorkitemCommentRequest build() {
            return new DeleteWorkitemCommentRequest(this);
        } 

    } 

}
