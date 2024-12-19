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
 * {@link CreateApiStageVariableRequest} extends {@link RequestModel}
 *
 * <p>CreateApiStageVariableRequest</p>
 */
public class CreateApiStageVariableRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("StageRouteModel")
    @Deprecated
    private String stageRouteModel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupportRoute")
    private Boolean supportRoute;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VariableName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String variableName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VariableValue")
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
         * <p>The ID of the runtime environment.</p>
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
         * <p>The routing model of the environment.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;location&quot;: &quot;HEAD&quot;,
         *     &quot;parameterCatalog&quot;: &quot;CUSTOM&quot;,
         *     &quot;parameterType&quot;: &quot;String&quot;,
         *     &quot;serviceParameterName&quot;: &quot;TestConstant&quot;,
         *     &quot;routeMatchSymbol&quot;: &quot;IN&quot;,
         *     &quot;routeRules&quot;: [
         *         {
         *             &quot;conditionValue&quot;: &quot;aaa,bbb&quot;,
         *             &quot;resultValue&quot;: &quot;apigateway-test.com&quot;
         *         }
         *     ]
         * }</p>
         */
        public Builder stageRouteModel(String stageRouteModel) {
            this.putQueryParameter("StageRouteModel", stageRouteModel);
            this.stageRouteModel = stageRouteModel;
            return this;
        }

        /**
         * <p>Specifies whether routing is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder supportRoute(Boolean supportRoute) {
            this.putQueryParameter("SupportRoute", supportRoute);
            this.supportRoute = supportRoute;
            return this;
        }

        /**
         * <p>The name of the variable to be added. This parameter is case-sensitive.</p>
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

        /**
         * <p>The value of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>api.domain.com</p>
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
