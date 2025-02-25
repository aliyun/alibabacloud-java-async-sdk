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
 * {@link CreateWorkitemCommentRequest} extends {@link RequestModel}
 *
 * <p>CreateWorkitemCommentRequest</p>
 */
public class CreateWorkitemCommentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("formatType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String formatType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("parentId")
    private String parentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workitemIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workitemIdentifier;

    private CreateWorkitemCommentRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.content = builder.content;
        this.formatType = builder.formatType;
        this.parentId = builder.parentId;
        this.workitemIdentifier = builder.workitemIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWorkitemCommentRequest create() {
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
     * @return parentId
     */
    public String getParentId() {
        return this.parentId;
    }

    /**
     * @return workitemIdentifier
     */
    public String getWorkitemIdentifier() {
        return this.workitemIdentifier;
    }

    public static final class Builder extends Request.Builder<CreateWorkitemCommentRequest, Builder> {
        private String organizationId; 
        private String content; 
        private String formatType; 
        private String parentId; 
        private String workitemIdentifier; 

        private Builder() {
            super();
        } 

        private Builder(CreateWorkitemCommentRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.content = request.content;
            this.formatType = request.formatType;
            this.parentId = request.parentId;
            this.workitemIdentifier = request.workitemIdentifier;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>60811b5eed6e867404f6xxxx</p>
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder content(String content) {
            this.putBodyParameter("content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RICHTEXT/MARKDOWN</p>
         */
        public Builder formatType(String formatType) {
            this.putBodyParameter("formatType", formatType);
            this.formatType = formatType;
            return this;
        }

        /**
         * parentId.
         */
        public Builder parentId(String parentId) {
            this.putBodyParameter("parentId", parentId);
            this.parentId = parentId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1e9903d8b3f12xxxxxf9286ef5</p>
         */
        public Builder workitemIdentifier(String workitemIdentifier) {
            this.putBodyParameter("workitemIdentifier", workitemIdentifier);
            this.workitemIdentifier = workitemIdentifier;
            return this;
        }

        @Override
        public CreateWorkitemCommentRequest build() {
            return new CreateWorkitemCommentRequest(this);
        } 

    } 

}
