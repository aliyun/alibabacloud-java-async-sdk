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
 * {@link ListVoiceRequest} extends {@link RequestModel}
 *
 * <p>ListVoiceRequest</p>
 */
public class ListVoiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private ListVoiceRequest(Builder builder) {
        super(builder);
        this.modelId = builder.modelId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVoiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListVoiceRequest, Builder> {
        private String modelId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListVoiceRequest request) {
            super(request);
            this.modelId = request.modelId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3-tts</p>
         */
        public Builder modelId(String modelId) {
            this.putQueryParameter("ModelId", modelId);
            this.modelId = modelId;
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
        public ListVoiceRequest build() {
            return new ListVoiceRequest(this);
        } 

    } 

}
