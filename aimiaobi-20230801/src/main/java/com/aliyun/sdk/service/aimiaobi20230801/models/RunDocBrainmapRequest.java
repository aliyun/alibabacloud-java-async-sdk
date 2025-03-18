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
 * {@link RunDocBrainmapRequest} extends {@link RequestModel}
 *
 * <p>RunDocBrainmapRequest</p>
 */
public class RunDocBrainmapRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CleanCache")
    private Boolean cleanCache;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DocId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String docId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeNumber")
    private Integer nodeNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Prompt")
    private String prompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WordNumber")
    private Integer wordNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private RunDocBrainmapRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.cleanCache = builder.cleanCache;
        this.docId = builder.docId;
        this.nodeNumber = builder.nodeNumber;
        this.prompt = builder.prompt;
        this.sessionId = builder.sessionId;
        this.wordNumber = builder.wordNumber;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunDocBrainmapRequest create() {
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
     * @return nodeNumber
     */
    public Integer getNodeNumber() {
        return this.nodeNumber;
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return wordNumber
     */
    public Integer getWordNumber() {
        return this.wordNumber;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<RunDocBrainmapRequest, Builder> {
        private String regionId; 
        private Boolean cleanCache; 
        private String docId; 
        private Integer nodeNumber; 
        private String prompt; 
        private String sessionId; 
        private Integer wordNumber; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(RunDocBrainmapRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.cleanCache = request.cleanCache;
            this.docId = request.docId;
            this.nodeNumber = request.nodeNumber;
            this.prompt = request.prompt;
            this.sessionId = request.sessionId;
            this.wordNumber = request.wordNumber;
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
            this.putBodyParameter("CleanCache", cleanCache);
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
         * NodeNumber.
         */
        public Builder nodeNumber(Integer nodeNumber) {
            this.putBodyParameter("NodeNumber", nodeNumber);
            this.nodeNumber = nodeNumber;
            return this;
        }

        /**
         * Prompt.
         */
        public Builder prompt(String prompt) {
            this.putBodyParameter("Prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * WordNumber.
         */
        public Builder wordNumber(Integer wordNumber) {
            this.putBodyParameter("WordNumber", wordNumber);
            this.wordNumber = wordNumber;
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
        public RunDocBrainmapRequest build() {
            return new RunDocBrainmapRequest(this);
        } 

    } 

}
