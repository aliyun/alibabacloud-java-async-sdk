// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeActiveMetricRuleListRequest} extends {@link RequestModel}
 *
 * <p>DescribeActiveMetricRuleListRequest</p>
 */
public class DescribeActiveMetricRuleListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Product")
    @com.aliyun.core.annotation.Validation(required = true)
    private String product;

    private DescribeActiveMetricRuleListRequest(Builder builder) {
        super(builder);
        this.product = builder.product;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeActiveMetricRuleListRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeActiveMetricRuleListRequest, Builder> {
        private String product; 

        private Builder() {
            super();
        } 

        private Builder(DescribeActiveMetricRuleListRequest request) {
            super(request);
            this.product = request.product;
        } 

        /**
         * <p>The abbreviation of the cloud service that supports initiative alert rules.</p>
         * <p>For more information about how to obtain the name of a cloud service, see <a href="https://help.aliyun.com/document_detail/114930.html">DescribeProductsOfActiveMetricRule</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder product(String product) {
            this.putQueryParameter("Product", product);
            this.product = product;
            return this;
        }

        @Override
        public DescribeActiveMetricRuleListRequest build() {
            return new DescribeActiveMetricRuleListRequest(this);
        } 

    } 

}
