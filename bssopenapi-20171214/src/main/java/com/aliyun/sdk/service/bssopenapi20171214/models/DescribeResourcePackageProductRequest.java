// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourcePackageProductRequest} extends {@link RequestModel}
 *
 * <p>DescribeResourcePackageProductRequest</p>
 */
public class DescribeResourcePackageProductRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productCode;

    private DescribeResourcePackageProductRequest(Builder builder) {
        super(builder);
        this.productCode = builder.productCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourcePackageProductRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    public static final class Builder extends Request.Builder<DescribeResourcePackageProductRequest, Builder> {
        private String productCode; 

        private Builder() {
            super();
        } 

        private Builder(DescribeResourcePackageProductRequest request) {
            super(request);
            this.productCode = request.productCode;
        } 

        /**
         * The code of the service.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        @Override
        public DescribeResourcePackageProductRequest build() {
            return new DescribeResourcePackageProductRequest(this);
        } 

    } 

}
