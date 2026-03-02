// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sfmmultimodalapp20250909.models;

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
 * {@link PatchMemoryConfigRequest} extends {@link RequestModel}
 *
 * <p>PatchMemoryConfigRequest</p>
 */
public class PatchMemoryConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoUpdate")
    private Boolean autoUpdate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpirationTime")
    private Integer expirationTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Prompt")
    private String prompt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Threshold")
    private Double threshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopK")
    private Integer topK;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserDefinedId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userDefinedId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private PatchMemoryConfigRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.autoUpdate = builder.autoUpdate;
        this.expirationTime = builder.expirationTime;
        this.prompt = builder.prompt;
        this.threshold = builder.threshold;
        this.topK = builder.topK;
        this.userDefinedId = builder.userDefinedId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PatchMemoryConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return autoUpdate
     */
    public Boolean getAutoUpdate() {
        return this.autoUpdate;
    }

    /**
     * @return expirationTime
     */
    public Integer getExpirationTime() {
        return this.expirationTime;
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return threshold
     */
    public Double getThreshold() {
        return this.threshold;
    }

    /**
     * @return topK
     */
    public Integer getTopK() {
        return this.topK;
    }

    /**
     * @return userDefinedId
     */
    public String getUserDefinedId() {
        return this.userDefinedId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<PatchMemoryConfigRequest, Builder> {
        private String appId; 
        private Boolean autoUpdate; 
        private Integer expirationTime; 
        private String prompt; 
        private Double threshold; 
        private Integer topK; 
        private String userDefinedId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(PatchMemoryConfigRequest request) {
            super(request);
            this.appId = request.appId;
            this.autoUpdate = request.autoUpdate;
            this.expirationTime = request.expirationTime;
            this.prompt = request.prompt;
            this.threshold = request.threshold;
            this.topK = request.topK;
            this.userDefinedId = request.userDefinedId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mm_bfaf7e110b6d4359977d1686a3f8</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * AutoUpdate.
         */
        public Builder autoUpdate(Boolean autoUpdate) {
            this.putQueryParameter("AutoUpdate", autoUpdate);
            this.autoUpdate = autoUpdate;
            return this;
        }

        /**
         * ExpirationTime.
         */
        public Builder expirationTime(Integer expirationTime) {
            this.putQueryParameter("ExpirationTime", expirationTime);
            this.expirationTime = expirationTime;
            return this;
        }

        /**
         * Prompt.
         */
        public Builder prompt(String prompt) {
            this.putQueryParameter("Prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        /**
         * Threshold.
         */
        public Builder threshold(Double threshold) {
            this.putQueryParameter("Threshold", threshold);
            this.threshold = threshold;
            return this;
        }

        /**
         * TopK.
         */
        public Builder topK(Integer topK) {
            this.putQueryParameter("TopK", topK);
            this.topK = topK;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>110b6d4359977d1</p>
         */
        public Builder userDefinedId(String userDefinedId) {
            this.putQueryParameter("UserDefinedId", userDefinedId);
            this.userDefinedId = userDefinedId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-jb5sabg80b4ts71g</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public PatchMemoryConfigRequest build() {
            return new PatchMemoryConfigRequest(this);
        } 

    } 

}
