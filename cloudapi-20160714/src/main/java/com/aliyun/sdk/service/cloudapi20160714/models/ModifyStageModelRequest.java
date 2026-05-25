// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link ModifyStageModelRequest} extends {@link RequestModel}
 *
 * <p>ModifyStageModelRequest</p>
 */
public class ModifyStageModelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StageAlias")
    private String stageAlias;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StageModelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String stageModelId;

    private ModifyStageModelRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.securityToken = builder.securityToken;
        this.stageAlias = builder.stageAlias;
        this.stageModelId = builder.stageModelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyStageModelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return stageAlias
     */
    public String getStageAlias() {
        return this.stageAlias;
    }

    /**
     * @return stageModelId
     */
    public String getStageModelId() {
        return this.stageModelId;
    }

    public static final class Builder extends Request.Builder<ModifyStageModelRequest, Builder> {
        private String description; 
        private String securityToken; 
        private String stageAlias; 
        private String stageModelId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyStageModelRequest request) {
            super(request);
            this.description = request.description;
            this.securityToken = request.securityToken;
            this.stageAlias = request.stageAlias;
            this.stageModelId = request.stageModelId;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * StageAlias.
         */
        public Builder stageAlias(String stageAlias) {
            this.putQueryParameter("StageAlias", stageAlias);
            this.stageAlias = stageAlias;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sdljflsjflj324xxx</p>
         */
        public Builder stageModelId(String stageModelId) {
            this.putQueryParameter("StageModelId", stageModelId);
            this.stageModelId = stageModelId;
            return this;
        }

        @Override
        public ModifyStageModelRequest build() {
            return new ModifyStageModelRequest(this);
        } 

    } 

}
