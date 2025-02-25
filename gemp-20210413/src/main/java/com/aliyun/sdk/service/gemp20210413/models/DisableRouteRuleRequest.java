// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableRouteRuleRequest} extends {@link RequestModel}
 *
 * <p>DisableRouteRuleRequest</p>
 */
public class DisableRouteRuleRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("routeRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long routeRuleId;

    private DisableRouteRuleRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.routeRuleId = builder.routeRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableRouteRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return routeRuleId
     */
    public Long getRouteRuleId() {
        return this.routeRuleId;
    }

    public static final class Builder extends Request.Builder<DisableRouteRuleRequest, Builder> {
        private String clientToken; 
        private Long routeRuleId; 

        private Builder() {
            super();
        } 

        private Builder(DisableRouteRuleRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.routeRuleId = request.routeRuleId;
        } 

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * routeRuleId.
         */
        public Builder routeRuleId(Long routeRuleId) {
            this.putBodyParameter("routeRuleId", routeRuleId);
            this.routeRuleId = routeRuleId;
            return this;
        }

        @Override
        public DisableRouteRuleRequest build() {
            return new DisableRouteRuleRequest(this);
        } 

    } 

}
