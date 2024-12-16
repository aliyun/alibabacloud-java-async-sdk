// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RunDocTranslationRequest} extends {@link RequestModel}
 *
 * <p>RunDocTranslationRequest</p>
 */
public class RunDocTranslationRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DocId")
    private String docId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RecommendContent")
    private String recommendContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TransType")
    private String transType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private RunDocTranslationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.docId = builder.docId;
        this.recommendContent = builder.recommendContent;
        this.sessionId = builder.sessionId;
        this.transType = builder.transType;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunDocTranslationRequest create() {
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
     * @return docId
     */
    public String getDocId() {
        return this.docId;
    }

    /**
     * @return recommendContent
     */
    public String getRecommendContent() {
        return this.recommendContent;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return transType
     */
    public String getTransType() {
        return this.transType;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<RunDocTranslationRequest, Builder> {
        private String regionId; 
        private String docId; 
        private String recommendContent; 
        private String sessionId; 
        private String transType; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(RunDocTranslationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.docId = request.docId;
            this.recommendContent = request.recommendContent;
            this.sessionId = request.sessionId;
            this.transType = request.transType;
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
         * DocId.
         */
        public Builder docId(String docId) {
            this.putBodyParameter("DocId", docId);
            this.docId = docId;
            return this;
        }

        /**
         * RecommendContent.
         */
        public Builder recommendContent(String recommendContent) {
            this.putBodyParameter("RecommendContent", recommendContent);
            this.recommendContent = recommendContent;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2e6b3987-f743-4d4c-8326-d9c41a6af3ee</p>
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * TransType.
         */
        public Builder transType(String transType) {
            this.putBodyParameter("TransType", transType);
            this.transType = transType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public RunDocTranslationRequest build() {
            return new RunDocTranslationRequest(this);
        } 

    } 

}
