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
 * {@link UpdateMmAppRagConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateMmAppRagConfigRequest</p>
 */
public class UpdateMmAppRagConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromptStrategy")
    @com.aliyun.core.annotation.Validation(required = true)
    private String promptStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetrieveMaxLength")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer retrieveMaxLength;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopK")
    private Integer topK;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private UpdateMmAppRagConfigRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.promptStrategy = builder.promptStrategy;
        this.retrieveMaxLength = builder.retrieveMaxLength;
        this.topK = builder.topK;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMmAppRagConfigRequest create() {
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
     * @return promptStrategy
     */
    public String getPromptStrategy() {
        return this.promptStrategy;
    }

    /**
     * @return retrieveMaxLength
     */
    public Integer getRetrieveMaxLength() {
        return this.retrieveMaxLength;
    }

    /**
     * @return topK
     */
    public Integer getTopK() {
        return this.topK;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<UpdateMmAppRagConfigRequest, Builder> {
        private String appId; 
        private String promptStrategy; 
        private Integer retrieveMaxLength; 
        private Integer topK; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMmAppRagConfigRequest request) {
            super(request);
            this.appId = request.appId;
            this.promptStrategy = request.promptStrategy;
            this.retrieveMaxLength = request.retrieveMaxLength;
            this.topK = request.topK;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mm_a2eb4e04b48041108edb1f6de815</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>top_k</p>
         */
        public Builder promptStrategy(String promptStrategy) {
            this.putQueryParameter("PromptStrategy", promptStrategy);
            this.promptStrategy = promptStrategy;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder retrieveMaxLength(Integer retrieveMaxLength) {
            this.putQueryParameter("RetrieveMaxLength", retrieveMaxLength);
            this.retrieveMaxLength = retrieveMaxLength;
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
         * <p>llm-6uhm7nfev4k8pwcz</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public UpdateMmAppRagConfigRequest build() {
            return new UpdateMmAppRagConfigRequest(this);
        } 

    } 

}
