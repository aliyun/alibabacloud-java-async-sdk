// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDistributionProductsLinkRequest} extends {@link RequestModel}
 *
 * <p>DescribeDistributionProductsLinkRequest</p>
 */
public class DescribeDistributionProductsLinkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Codes")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > codes;

    private DescribeDistributionProductsLinkRequest(Builder builder) {
        super(builder);
        this.codes = builder.codes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDistributionProductsLinkRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return codes
     */
    public java.util.List < String > getCodes() {
        return this.codes;
    }

    public static final class Builder extends Request.Builder<DescribeDistributionProductsLinkRequest, Builder> {
        private java.util.List < String > codes; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDistributionProductsLinkRequest request) {
            super(request);
            this.codes = request.codes;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder codes(java.util.List < String > codes) {
            String codesShrink = shrink(codes, "Codes", "json");
            this.putQueryParameter("Codes", codesShrink);
            this.codes = codes;
            return this;
        }

        @Override
        public DescribeDistributionProductsLinkRequest build() {
            return new DescribeDistributionProductsLinkRequest(this);
        } 

    } 

}
