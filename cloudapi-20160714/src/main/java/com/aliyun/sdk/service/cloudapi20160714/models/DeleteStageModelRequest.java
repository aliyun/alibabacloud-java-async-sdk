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
 * {@link DeleteStageModelRequest} extends {@link RequestModel}
 *
 * <p>DeleteStageModelRequest</p>
 */
public class DeleteStageModelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StageModelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String stageModelId;

    private DeleteStageModelRequest(Builder builder) {
        super(builder);
        this.securityToken = builder.securityToken;
        this.stageModelId = builder.stageModelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteStageModelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return stageModelId
     */
    public String getStageModelId() {
        return this.stageModelId;
    }

    public static final class Builder extends Request.Builder<DeleteStageModelRequest, Builder> {
        private String securityToken; 
        private String stageModelId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteStageModelRequest request) {
            super(request);
            this.securityToken = request.securityToken;
            this.stageModelId = request.stageModelId;
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
         * 
         * <strong>example:</strong>
         * <p>3294sdufo3nenexxx</p>
         */
        public Builder stageModelId(String stageModelId) {
            this.putQueryParameter("StageModelId", stageModelId);
            this.stageModelId = stageModelId;
            return this;
        }

        @Override
        public DeleteStageModelRequest build() {
            return new DeleteStageModelRequest(this);
        } 

    } 

}
