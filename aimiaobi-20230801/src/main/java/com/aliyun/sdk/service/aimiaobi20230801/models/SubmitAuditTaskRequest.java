// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link SubmitAuditTaskRequest} extends {@link RequestModel}
 *
 * <p>SubmitAuditTaskRequest</p>
 */
public class SubmitAuditTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ArticleId")
    private String articleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HtmlContent")
    private String htmlContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private SubmitAuditTaskRequest(Builder builder) {
        super(builder);
        this.articleId = builder.articleId;
        this.content = builder.content;
        this.htmlContent = builder.htmlContent;
        this.title = builder.title;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitAuditTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return articleId
     */
    public String getArticleId() {
        return this.articleId;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return htmlContent
     */
    public String getHtmlContent() {
        return this.htmlContent;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<SubmitAuditTaskRequest, Builder> {
        private String articleId; 
        private String content; 
        private String htmlContent; 
        private String title; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitAuditTaskRequest request) {
            super(request);
            this.articleId = request.articleId;
            this.content = request.content;
            this.htmlContent = request.htmlContent;
            this.title = request.title;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * ArticleId.
         */
        public Builder articleId(String articleId) {
            this.putBodyParameter("ArticleId", articleId);
            this.articleId = articleId;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * HtmlContent.
         */
        public Builder htmlContent(String htmlContent) {
            this.putBodyParameter("HtmlContent", htmlContent);
            this.htmlContent = htmlContent;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public SubmitAuditTaskRequest build() {
            return new SubmitAuditTaskRequest(this);
        } 

    } 

}
