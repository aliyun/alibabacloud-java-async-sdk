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
 * {@link DeleteApiStageVariableRequest} extends {@link RequestModel}
 *
 * <p>DeleteApiStageVariableRequest</p>
 */
public class DeleteApiStageVariableRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String stageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VariableName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String variableName;

    private DeleteApiStageVariableRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.securityToken = builder.securityToken;
        this.stageId = builder.stageId;
        this.variableName = builder.variableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteApiStageVariableRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return stageId
     */
    public String getStageId() {
        return this.stageId;
    }

    /**
     * @return variableName
     */
    public String getVariableName() {
        return this.variableName;
    }

    public static final class Builder extends Request.Builder<DeleteApiStageVariableRequest, Builder> {
        private String groupId; 
        private String securityToken; 
        private String stageId; 
        private String variableName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteApiStageVariableRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.securityToken = request.securityToken;
            this.stageId = request.stageId;
            this.variableName = request.variableName;
        } 

        /**
         * <p>The ID of the API group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>523e8dc7bbe04613b5b1d726c2a7889d</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
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
         * <p>The ID of the environment.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6EF60BEC-0242-43AF-BB20-270359FB54A7</p>
         */
        public Builder stageId(String stageId) {
            this.putQueryParameter("StageId", stageId);
            this.stageId = stageId;
            return this;
        }

        /**
         * <p>The name of the variable to be deleted. This parameter is case-sensitive.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>serverName</p>
         */
        public Builder variableName(String variableName) {
            this.putQueryParameter("VariableName", variableName);
            this.variableName = variableName;
            return this;
        }

        @Override
        public DeleteApiStageVariableRequest build() {
            return new DeleteApiStageVariableRequest(this);
        } 

    } 

}
