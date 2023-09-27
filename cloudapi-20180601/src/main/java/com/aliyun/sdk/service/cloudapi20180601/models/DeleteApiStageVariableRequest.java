// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteApiStageVariableRequest} extends {@link RequestModel}
 *
 * <p>DeleteApiStageVariableRequest</p>
 */
public class DeleteApiStageVariableRequest extends Request {
    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("StageId")
    @Validation(required = true)
    private String stageId;

    @Query
    @NameInMap("VariableName")
    @Validation(required = true)
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
         * GroupId.
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
         * StageId.
         */
        public Builder stageId(String stageId) {
            this.putQueryParameter("StageId", stageId);
            this.stageId = stageId;
            return this;
        }

        /**
         * VariableName.
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
