// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quanmiaolightapp20240801.models;

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
 * {@link HotNewsRecommendRequest} extends {@link RequestModel}
 *
 * <p>HotNewsRecommendRequest</p>
 */
public class HotNewsRecommendRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("prompt")
    private String prompt;

    private HotNewsRecommendRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.prompt = builder.prompt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HotNewsRecommendRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    public static final class Builder extends Request.Builder<HotNewsRecommendRequest, Builder> {
        private String workspaceId; 
        private String prompt; 

        private Builder() {
            super();
        } 

        private Builder(HotNewsRecommendRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.prompt = request.prompt;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * prompt.
         */
        public Builder prompt(String prompt) {
            this.putBodyParameter("prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        @Override
        public HotNewsRecommendRequest build() {
            return new HotNewsRecommendRequest(this);
        } 

    } 

}
