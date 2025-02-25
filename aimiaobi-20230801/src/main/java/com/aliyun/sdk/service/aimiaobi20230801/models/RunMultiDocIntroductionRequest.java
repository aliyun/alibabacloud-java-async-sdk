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
 * {@link RunMultiDocIntroductionRequest} extends {@link RequestModel}
 *
 * <p>RunMultiDocIntroductionRequest</p>
 */
public class RunMultiDocIntroductionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DocIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> docIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KeyPointPrompt")
    private String keyPointPrompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SummaryPrompt")
    private String summaryPrompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private RunMultiDocIntroductionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.docIds = builder.docIds;
        this.keyPointPrompt = builder.keyPointPrompt;
        this.sessionId = builder.sessionId;
        this.summaryPrompt = builder.summaryPrompt;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunMultiDocIntroductionRequest create() {
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
     * @return docIds
     */
    public java.util.List<String> getDocIds() {
        return this.docIds;
    }

    /**
     * @return keyPointPrompt
     */
    public String getKeyPointPrompt() {
        return this.keyPointPrompt;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return summaryPrompt
     */
    public String getSummaryPrompt() {
        return this.summaryPrompt;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<RunMultiDocIntroductionRequest, Builder> {
        private String regionId; 
        private java.util.List<String> docIds; 
        private String keyPointPrompt; 
        private String sessionId; 
        private String summaryPrompt; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(RunMultiDocIntroductionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.docIds = request.docIds;
            this.keyPointPrompt = request.keyPointPrompt;
            this.sessionId = request.sessionId;
            this.summaryPrompt = request.summaryPrompt;
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
         * <p>This parameter is required.</p>
         */
        public Builder docIds(java.util.List<String> docIds) {
            String docIdsShrink = shrink(docIds, "DocIds", "json");
            this.putBodyParameter("DocIds", docIdsShrink);
            this.docIds = docIds;
            return this;
        }

        /**
         * KeyPointPrompt.
         */
        public Builder keyPointPrompt(String keyPointPrompt) {
            this.putBodyParameter("KeyPointPrompt", keyPointPrompt);
            this.keyPointPrompt = keyPointPrompt;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>75bf82fa-b71b-45d7-ae40-0b00e496cd9e</p>
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * SummaryPrompt.
         */
        public Builder summaryPrompt(String summaryPrompt) {
            this.putBodyParameter("SummaryPrompt", summaryPrompt);
            this.summaryPrompt = summaryPrompt;
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
        public RunMultiDocIntroductionRequest build() {
            return new RunMultiDocIntroductionRequest(this);
        } 

    } 

}
