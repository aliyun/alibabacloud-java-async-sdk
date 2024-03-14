// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OperateGatewayRequest} extends {@link RequestModel}
 *
 * <p>OperateGatewayRequest</p>
 */
public class OperateGatewayRequest extends Request {
    @Query
    @NameInMap("GatewayId")
    @Validation(required = true)
    private String gatewayId;

    @Query
    @NameInMap("OperateAction")
    @Validation(required = true)
    private String operateAction;

    @Query
    @NameInMap("Params")
    private String params;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private OperateGatewayRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.operateAction = builder.operateAction;
        this.params = builder.params;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateGatewayRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return operateAction
     */
    public String getOperateAction() {
        return this.operateAction;
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<OperateGatewayRequest, Builder> {
        private String gatewayId; 
        private String operateAction; 
        private String params; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(OperateGatewayRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.operateAction = request.operateAction;
            this.params = request.params;
            this.securityToken = request.securityToken;
        } 

        /**
         * GatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putQueryParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * OperateAction.
         */
        public Builder operateAction(String operateAction) {
            this.putQueryParameter("OperateAction", operateAction);
            this.operateAction = operateAction;
            return this;
        }

        /**
         * Params.
         */
        public Builder params(String params) {
            this.putQueryParameter("Params", params);
            this.params = params;
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

        @Override
        public OperateGatewayRequest build() {
            return new OperateGatewayRequest(this);
        } 

    } 

}
