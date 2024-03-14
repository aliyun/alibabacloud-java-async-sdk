// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HandleGatewayAutoPlanRequest} extends {@link RequestModel}
 *
 * <p>HandleGatewayAutoPlanRequest</p>
 */
public class HandleGatewayAutoPlanRequest extends Request {
    @Query
    @NameInMap("Cancel")
    private Boolean cancel;

    @Query
    @NameInMap("DelayHours")
    private Integer delayHours;

    @Query
    @NameInMap("GatewayId")
    @Validation(required = true)
    private String gatewayId;

    @Query
    @NameInMap("PlanId")
    @Validation(required = true)
    private String planId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private HandleGatewayAutoPlanRequest(Builder builder) {
        super(builder);
        this.cancel = builder.cancel;
        this.delayHours = builder.delayHours;
        this.gatewayId = builder.gatewayId;
        this.planId = builder.planId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HandleGatewayAutoPlanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cancel
     */
    public Boolean getCancel() {
        return this.cancel;
    }

    /**
     * @return delayHours
     */
    public Integer getDelayHours() {
        return this.delayHours;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return planId
     */
    public String getPlanId() {
        return this.planId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<HandleGatewayAutoPlanRequest, Builder> {
        private Boolean cancel; 
        private Integer delayHours; 
        private String gatewayId; 
        private String planId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(HandleGatewayAutoPlanRequest request) {
            super(request);
            this.cancel = request.cancel;
            this.delayHours = request.delayHours;
            this.gatewayId = request.gatewayId;
            this.planId = request.planId;
            this.securityToken = request.securityToken;
        } 

        /**
         * Cancel.
         */
        public Builder cancel(Boolean cancel) {
            this.putQueryParameter("Cancel", cancel);
            this.cancel = cancel;
            return this;
        }

        /**
         * DelayHours.
         */
        public Builder delayHours(Integer delayHours) {
            this.putQueryParameter("DelayHours", delayHours);
            this.delayHours = delayHours;
            return this;
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
         * PlanId.
         */
        public Builder planId(String planId) {
            this.putQueryParameter("PlanId", planId);
            this.planId = planId;
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
        public HandleGatewayAutoPlanRequest build() {
            return new HandleGatewayAutoPlanRequest(this);
        } 

    } 

}
