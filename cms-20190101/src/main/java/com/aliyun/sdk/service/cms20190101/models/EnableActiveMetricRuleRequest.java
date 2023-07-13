// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableActiveMetricRuleRequest} extends {@link RequestModel}
 *
 * <p>EnableActiveMetricRuleRequest</p>
 */
public class EnableActiveMetricRuleRequest extends Request {
    @Query
    @NameInMap("Product")
    @Validation(required = true)
    private String product;

    private EnableActiveMetricRuleRequest(Builder builder) {
        super(builder);
        this.product = builder.product;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableActiveMetricRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    public static final class Builder extends Request.Builder<EnableActiveMetricRuleRequest, Builder> {
        private String product; 

        private Builder() {
            super();
        } 

        private Builder(EnableActiveMetricRuleRequest request) {
            super(request);
            this.product = request.product;
        } 

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call was successful.
         */
        public Builder product(String product) {
            this.putQueryParameter("Product", product);
            this.product = product;
            return this;
        }

        @Override
        public EnableActiveMetricRuleRequest build() {
            return new EnableActiveMetricRuleRequest(this);
        } 

    } 

}
