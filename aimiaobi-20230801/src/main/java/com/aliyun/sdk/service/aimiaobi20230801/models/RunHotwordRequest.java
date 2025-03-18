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
 * {@link RunHotwordRequest} extends {@link RequestModel}
 *
 * <p>RunHotwordRequest</p>
 */
public class RunHotwordRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DocId")
    private String docId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Prompt")
    private String prompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReferenceContent")
    private String referenceContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private RunHotwordRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.docId = builder.docId;
        this.prompt = builder.prompt;
        this.referenceContent = builder.referenceContent;
        this.sessionId = builder.sessionId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunHotwordRequest create() {
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
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return referenceContent
     */
    public String getReferenceContent() {
        return this.referenceContent;
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

    public static final class Builder extends Request.Builder<RunHotwordRequest, Builder> {
        private String regionId; 
        private String docId; 
        private String prompt; 
        private String referenceContent; 
        private String sessionId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(RunHotwordRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.docId = request.docId;
            this.prompt = request.prompt;
            this.referenceContent = request.referenceContent;
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
         * Prompt.
         */
        public Builder prompt(String prompt) {
            this.putBodyParameter("Prompt", prompt);
            this.prompt = prompt;
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
         * SessionId.
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
         * <p>llm-baw8as25ll3wnzjr</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public RunHotwordRequest build() {
            return new RunHotwordRequest(this);
        } 

    } 

}
