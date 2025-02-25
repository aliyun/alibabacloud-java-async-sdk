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
 * {@link RunDocSummaryRequest} extends {@link RequestModel}
 *
 * <p>RunDocSummaryRequest</p>
 */
public class RunDocSummaryRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DocId")
    private String docId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Query")
    private String query;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RecommendContent")
    private String recommendContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private RunDocSummaryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.docId = builder.docId;
        this.query = builder.query;
        this.recommendContent = builder.recommendContent;
        this.sessionId = builder.sessionId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunDocSummaryRequest create() {
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
     * @return query
     */
    public String getQuery() {
        return this.query;
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
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<RunDocSummaryRequest, Builder> {
        private String regionId; 
        private String docId; 
        private String query; 
        private String recommendContent; 
        private String sessionId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(RunDocSummaryRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.docId = request.docId;
            this.query = request.query;
            this.recommendContent = request.recommendContent;
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
         * DocId.
         */
        public Builder docId(String docId) {
            this.putBodyParameter("DocId", docId);
            this.docId = docId;
            return this;
        }

        /**
         * Query.
         */
        public Builder query(String query) {
            this.putBodyParameter("Query", query);
            this.query = query;
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
         * <p>0f56f98a-f2d8-47ec-98e9-1cbdcffa9539</p>
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
         * <p>llm-2setzb9x4ewsd</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public RunDocSummaryRequest build() {
            return new RunDocSummaryRequest(this);
        } 

    } 

}
