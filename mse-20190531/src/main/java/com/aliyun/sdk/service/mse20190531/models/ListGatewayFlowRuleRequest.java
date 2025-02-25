// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link ListGatewayFlowRuleRequest} extends {@link RequestModel}
 *
 * <p>ListGatewayFlowRuleRequest</p>
 */
public class ListGatewayFlowRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterParams")
    @com.aliyun.core.annotation.Validation(required = true)
    private String filterParams;

    private ListGatewayFlowRuleRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.filterParams = builder.filterParams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGatewayFlowRuleRequest create() {
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

    public static final class Builder extends Request.Builder<ListGatewayFlowRuleRequest, Builder> {
        private String acceptLanguage; 
        private String filterParams; 

        private Builder() {
            super();
        } 

        private Builder(ListGatewayFlowRuleRequest request) {
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
         * <p>just for POP</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>param</p>
         */
        public Builder filterParams(String filterParams) {
            this.putQueryParameter("FilterParams", filterParams);
            this.filterParams = filterParams;
            return this;
        }

        @Override
        public ListGatewayFlowRuleRequest build() {
            return new ListGatewayFlowRuleRequest(this);
        } 

    } 

}
