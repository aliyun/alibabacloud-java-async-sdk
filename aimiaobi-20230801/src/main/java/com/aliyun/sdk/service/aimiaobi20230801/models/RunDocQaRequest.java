// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RunDocQaRequest} extends {@link RequestModel}
 *
 * <p>RunDocQaRequest</p>
 */
public class RunDocQaRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CategoryIds")
    private java.util.List < String > categoryIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConversationContexts")
    private java.util.List < ConversationContexts> conversationContexts;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DocIds")
    private java.util.List < String > docIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Query")
    @com.aliyun.core.annotation.Validation(required = true)
    private String query;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReferenceContent")
    private String referenceContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SearchSource")
    @com.aliyun.core.annotation.Validation(required = true)
    private String searchSource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private RunDocQaRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.categoryIds = builder.categoryIds;
        this.conversationContexts = builder.conversationContexts;
        this.docIds = builder.docIds;
        this.query = builder.query;
        this.referenceContent = builder.referenceContent;
        this.searchSource = builder.searchSource;
        this.sessionId = builder.sessionId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunDocQaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return categoryIds
     */
    public java.util.List < String > getCategoryIds() {
        return this.categoryIds;
    }

    /**
     * @return conversationContexts
     */
    public java.util.List < ConversationContexts> getConversationContexts() {
        return this.conversationContexts;
    }

    /**
     * @return docIds
     */
    public java.util.List < String > getDocIds() {
        return this.docIds;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return referenceContent
     */
    public String getReferenceContent() {
        return this.referenceContent;
    }

    /**
     * @return searchSource
     */
    public String getSearchSource() {
        return this.searchSource;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<RunDocQaRequest, Builder> {
        private String regionId; 
        private java.util.List < String > categoryIds; 
        private java.util.List < ConversationContexts> conversationContexts; 
        private java.util.List < String > docIds; 
        private String query; 
        private String referenceContent; 
        private String searchSource; 
        private String sessionId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(RunDocQaRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.categoryIds = request.categoryIds;
            this.conversationContexts = request.conversationContexts;
            this.docIds = request.docIds;
            this.query = request.query;
            this.referenceContent = request.referenceContent;
            this.searchSource = request.searchSource;
            this.sessionId = request.sessionId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * CategoryIds.
         */
        public Builder categoryIds(java.util.List < String > categoryIds) {
            String categoryIdsShrink = shrink(categoryIds, "CategoryIds", "json");
            this.putBodyParameter("CategoryIds", categoryIdsShrink);
            this.categoryIds = categoryIds;
            return this;
        }

        /**
         * ConversationContexts.
         */
        public Builder conversationContexts(java.util.List < ConversationContexts> conversationContexts) {
            String conversationContextsShrink = shrink(conversationContexts, "ConversationContexts", "json");
            this.putBodyParameter("ConversationContexts", conversationContextsShrink);
            this.conversationContexts = conversationContexts;
            return this;
        }

        /**
         * DocIds.
         */
        public Builder docIds(java.util.List < String > docIds) {
            String docIdsShrink = shrink(docIds, "DocIds", "json");
            this.putBodyParameter("DocIds", docIdsShrink);
            this.docIds = docIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder query(String query) {
            this.putBodyParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * ReferenceContent.
         */
        public Builder referenceContent(String referenceContent) {
            this.putBodyParameter("ReferenceContent", referenceContent);
            this.referenceContent = referenceContent;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fromWeb</p>
         */
        public Builder searchSource(String searchSource) {
            this.putBodyParameter("SearchSource", searchSource);
            this.searchSource = searchSource;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>f486c4e2-b773-4d65-88f8-2ba540610456</p>
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-dswd4003ny4gh9rw</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public RunDocQaRequest build() {
            return new RunDocQaRequest(this);
        } 

    } 

    /**
     * 
     * {@link RunDocQaRequest} extends {@link TeaModel}
     *
     * <p>RunDocQaRequest</p>
     */
    public static class ConversationContexts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        private ConversationContexts(Builder builder) {
            this.content = builder.content;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConversationContexts create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private String content; 
            private String role; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public ConversationContexts build() {
                return new ConversationContexts(this);
            } 

        } 

    }
}
