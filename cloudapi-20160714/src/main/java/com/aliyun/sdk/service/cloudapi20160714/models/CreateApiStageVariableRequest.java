// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateApiStageVariableRequest} extends {@link RequestModel}
 *
 * <p>CreateApiStageVariableRequest</p>
 */
public class CreateApiStageVariableRequest extends Request {
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
    @NameInMap("StageRouteModel")
    private String stageRouteModel;

    @Query
    @NameInMap("SupportRoute")
    private Boolean supportRoute;

    @Query
    @NameInMap("VariableName")
    @Validation(required = true)
    private String variableName;

    @Query
    @NameInMap("VariableValue")
    private String variableValue;

    private CreateApiStageVariableRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.securityToken = builder.securityToken;
        this.stageId = builder.stageId;
        this.stageRouteModel = builder.stageRouteModel;
        this.supportRoute = builder.supportRoute;
        this.variableName = builder.variableName;
        this.variableValue = builder.variableValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApiStageVariableRequest create() {
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
     * @return stageRouteModel
     */
    public String getStageRouteModel() {
        return this.stageRouteModel;
    }

    /**
     * @return supportRoute
     */
    public Boolean getSupportRoute() {
        return this.supportRoute;
    }

    /**
     * @return variableName
     */
    public String getVariableName() {
        return this.variableName;
    }

    /**
     * @return variableValue
     */
    public String getVariableValue() {
        return this.variableValue;
    }

    public static final class Builder extends Request.Builder<CreateApiStageVariableRequest, Builder> {
        private String groupId; 
        private String securityToken; 
        private String stageId; 
        private String stageRouteModel; 
        private Boolean supportRoute; 
        private String variableName; 
        private String variableValue; 

        private Builder() {
            super();
        } 

        private Builder(CreateApiStageVariableRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.securityToken = request.securityToken;
            this.stageId = request.stageId;
            this.stageRouteModel = request.stageRouteModel;
            this.supportRoute = request.supportRoute;
            this.variableName = request.variableName;
            this.variableValue = request.variableValue;
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
         * StageRouteModel.
         */
        public Builder stageRouteModel(String stageRouteModel) {
            this.putQueryParameter("StageRouteModel", stageRouteModel);
            this.stageRouteModel = stageRouteModel;
            return this;
        }

        /**
         * SupportRoute.
         */
        public Builder supportRoute(Boolean supportRoute) {
            this.putQueryParameter("SupportRoute", supportRoute);
            this.supportRoute = supportRoute;
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

        /**
         * VariableValue.
         */
        public Builder variableValue(String variableValue) {
            this.putQueryParameter("VariableValue", variableValue);
            this.variableValue = variableValue;
            return this;
        }

        @Override
        public CreateApiStageVariableRequest build() {
            return new CreateApiStageVariableRequest(this);
        } 

    } 

}
