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
 * {@link GenerateBroadcastNewsRequest} extends {@link RequestModel}
 *
 * <p>GenerateBroadcastNewsRequest</p>
 */
public class GenerateBroadcastNewsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("prompt")
    @com.aliyun.core.annotation.Validation(required = true)
    private String prompt;

    private GenerateBroadcastNewsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.workspaceId = builder.workspaceId;
        this.prompt = builder.prompt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateBroadcastNewsRequest create() {
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

    public static final class Builder extends Request.Builder<GenerateBroadcastNewsRequest, Builder> {
        private String regionId; 
        private String workspaceId; 
        private String prompt; 

        private Builder() {
            super();
        } 

        private Builder(GenerateBroadcastNewsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.workspaceId = request.workspaceId;
            this.prompt = request.prompt;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
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
         * <p>This parameter is required.</p>
         */
        public Builder prompt(String prompt) {
            this.putBodyParameter("prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        @Override
        public GenerateBroadcastNewsRequest build() {
            return new GenerateBroadcastNewsRequest(this);
        } 

    } 

}
