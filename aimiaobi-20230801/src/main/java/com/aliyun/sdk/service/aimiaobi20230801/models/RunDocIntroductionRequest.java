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
 * {@link RunDocIntroductionRequest} extends {@link RequestModel}
 *
 * <p>RunDocIntroductionRequest</p>
 */
public class RunDocIntroductionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CleanCache")
    private Boolean cleanCache;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DocId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String docId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IntroductionPrompt")
    private String introductionPrompt;

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

    private RunDocIntroductionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.cleanCache = builder.cleanCache;
        this.docId = builder.docId;
        this.introductionPrompt = builder.introductionPrompt;
        this.keyPointPrompt = builder.keyPointPrompt;
        this.sessionId = builder.sessionId;
        this.summaryPrompt = builder.summaryPrompt;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunDocIntroductionRequest create() {
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
     * @return cleanCache
     */
    public Boolean getCleanCache() {
        return this.cleanCache;
    }

    /**
     * @return docId
     */
    public String getDocId() {
        return this.docId;
    }

    /**
     * @return introductionPrompt
     */
    public String getIntroductionPrompt() {
        return this.introductionPrompt;
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

    public static final class Builder extends Request.Builder<RunDocIntroductionRequest, Builder> {
        private String regionId; 
        private Boolean cleanCache; 
        private String docId; 
        private String introductionPrompt; 
        private String keyPointPrompt; 
        private String sessionId; 
        private String summaryPrompt; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(RunDocIntroductionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.cleanCache = request.cleanCache;
            this.docId = request.docId;
            this.introductionPrompt = request.introductionPrompt;
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
         * CleanCache.
         */
        public Builder cleanCache(Boolean cleanCache) {
            this.putQueryParameter("CleanCache", cleanCache);
            this.cleanCache = cleanCache;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder docId(String docId) {
            this.putBodyParameter("DocId", docId);
            this.docId = docId;
            return this;
        }

        /**
         * IntroductionPrompt.
         */
        public Builder introductionPrompt(String introductionPrompt) {
            this.putBodyParameter("IntroductionPrompt", introductionPrompt);
            this.introductionPrompt = introductionPrompt;
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
         * <p>a3b5eb35-6b28-4cf9-ac09-1dec25ab4df6</p>
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
         * <p>xxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public RunDocIntroductionRequest build() {
            return new RunDocIntroductionRequest(this);
        } 

    } 

}
