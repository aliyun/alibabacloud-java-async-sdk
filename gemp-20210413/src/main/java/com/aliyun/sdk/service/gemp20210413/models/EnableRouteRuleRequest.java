// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableRouteRuleRequest} extends {@link RequestModel}
 *
 * <p>EnableRouteRuleRequest</p>
 */
public class EnableRouteRuleRequest extends Request {
    @Body
    @NameInMap("clientToken")
    @Validation(required = true)
    private String clientToken;

    @Body
    @NameInMap("routeRuleId")
    @Validation(required = true)
    private Long routeRuleId;

    private EnableRouteRuleRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.routeRuleId = builder.routeRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableRouteRuleRequest create() {
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

    public static final class Builder extends Request.Builder<EnableRouteRuleRequest, Builder> {
        private String clientToken; 
        private Long routeRuleId; 

        private Builder() {
            super();
        } 

        private Builder(EnableRouteRuleRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.routeRuleId = response.routeRuleId;
        } 

        /**
         * 幂等号
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 规则ID
         */
        public Builder routeRuleId(Long routeRuleId) {
            this.putBodyParameter("routeRuleId", routeRuleId);
            this.routeRuleId = routeRuleId;
            return this;
        }

        @Override
        public EnableRouteRuleRequest build() {
            return new EnableRouteRuleRequest(this);
        } 

    } 

}
