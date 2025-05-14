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
 * {@link QueryAuditTaskRequest} extends {@link RequestModel}
 *
 * <p>QueryAuditTaskRequest</p>
 */
public class QueryAuditTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ArticleId")
    private String articleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContentAuditTaskId")
    private String contentAuditTaskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private QueryAuditTaskRequest(Builder builder) {
        super(builder);
        this.articleId = builder.articleId;
        this.contentAuditTaskId = builder.contentAuditTaskId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAuditTaskRequest create() {
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
     * @return contentAuditTaskId
     */
    public String getContentAuditTaskId() {
        return this.contentAuditTaskId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<QueryAuditTaskRequest, Builder> {
        private String articleId; 
        private String contentAuditTaskId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(QueryAuditTaskRequest request) {
            super(request);
            this.articleId = request.articleId;
            this.contentAuditTaskId = request.contentAuditTaskId;
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
         * ContentAuditTaskId.
         */
        public Builder contentAuditTaskId(String contentAuditTaskId) {
            this.putBodyParameter("ContentAuditTaskId", contentAuditTaskId);
            this.contentAuditTaskId = contentAuditTaskId;
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
        public QueryAuditTaskRequest build() {
            return new QueryAuditTaskRequest(this);
        } 

    } 

}
