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
 * {@link CreateStageModelRequest} extends {@link RequestModel}
 *
 * <p>CreateStageModelRequest</p>
 */
public class CreateStageModelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StageAlias")
    @com.aliyun.core.annotation.Validation(required = true)
    private String stageAlias;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StageName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String stageName;

    private CreateStageModelRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.securityToken = builder.securityToken;
        this.stageAlias = builder.stageAlias;
        this.stageName = builder.stageName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStageModelRequest create() {
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
     * @return stageName
     */
    public String getStageName() {
        return this.stageName;
    }

    public static final class Builder extends Request.Builder<CreateStageModelRequest, Builder> {
        private String description; 
        private String securityToken; 
        private String stageAlias; 
        private String stageName; 

        private Builder() {
            super();
        } 

        private Builder(CreateStageModelRequest request) {
            super(request);
            this.description = request.description;
            this.securityToken = request.securityToken;
            this.stageAlias = request.stageAlias;
            this.stageName = request.stageName;
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
         * <p>This parameter is required.</p>
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
         * <p>RELEASE</p>
         */
        public Builder stageName(String stageName) {
            this.putQueryParameter("StageName", stageName);
            this.stageName = stageName;
            return this;
        }

        @Override
        public CreateStageModelRequest build() {
            return new CreateStageModelRequest(this);
        } 

    } 

}
