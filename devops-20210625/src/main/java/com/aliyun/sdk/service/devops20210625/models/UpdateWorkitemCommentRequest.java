// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateWorkitemCommentRequest} extends {@link RequestModel}
 *
 * <p>UpdateWorkitemCommentRequest</p>
 */
public class UpdateWorkitemCommentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("commentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long commentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("formatType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String formatType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workitemIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workitemIdentifier;

    private UpdateWorkitemCommentRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.commentId = builder.commentId;
        this.content = builder.content;
        this.formatType = builder.formatType;
        this.workitemIdentifier = builder.workitemIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWorkitemCommentRequest create() {
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
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return formatType
     */
    public String getFormatType() {
        return this.formatType;
    }

    /**
     * @return workitemIdentifier
     */
    public String getWorkitemIdentifier() {
        return this.workitemIdentifier;
    }

    public static final class Builder extends Request.Builder<UpdateWorkitemCommentRequest, Builder> {
        private String organizationId; 
        private Long commentId; 
        private String content; 
        private String formatType; 
        private String workitemIdentifier; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWorkitemCommentRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.commentId = request.commentId;
            this.content = request.content;
            this.formatType = request.formatType;
            this.workitemIdentifier = request.workitemIdentifier;
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
         * content.
         */
        public Builder content(String content) {
            this.putBodyParameter("content", content);
            this.content = content;
            return this;
        }

        /**
         * formatType.
         */
        public Builder formatType(String formatType) {
            this.putBodyParameter("formatType", formatType);
            this.formatType = formatType;
            return this;
        }

        /**
         * workitemIdentifier.
         */
        public Builder workitemIdentifier(String workitemIdentifier) {
            this.putBodyParameter("workitemIdentifier", workitemIdentifier);
            this.workitemIdentifier = workitemIdentifier;
            return this;
        }

        @Override
        public UpdateWorkitemCommentRequest build() {
            return new UpdateWorkitemCommentRequest(this);
        } 

    } 

}
