// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGatewayCircuitBreakerRuleRequest} extends {@link RequestModel}
 *
 * <p>ListGatewayCircuitBreakerRuleRequest</p>
 */
public class ListGatewayCircuitBreakerRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterParams")
    @com.aliyun.core.annotation.Validation(required = true)
    private String filterParams;

    private ListGatewayCircuitBreakerRuleRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.filterParams = builder.filterParams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGatewayCircuitBreakerRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return filterParams
     */
    public String getFilterParams() {
        return this.filterParams;
    }

    public static final class Builder extends Request.Builder<ListGatewayCircuitBreakerRuleRequest, Builder> {
        private String acceptLanguage; 
        private String filterParams; 

        private Builder() {
            super();
        } 

        private Builder(ListGatewayCircuitBreakerRuleRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.filterParams = request.filterParams;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * just for POP
         */
        public Builder filterParams(String filterParams) {
            this.putQueryParameter("FilterParams", filterParams);
            this.filterParams = filterParams;
            return this;
        }

        @Override
        public ListGatewayCircuitBreakerRuleRequest build() {
            return new ListGatewayCircuitBreakerRuleRequest(this);
        } 

    } 

}
