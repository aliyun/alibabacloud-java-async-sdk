// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePackageStateRequest} extends {@link RequestModel}
 *
 * <p>DescribePackageStateRequest</p>
 */
public class DescribePackageStateRequest extends Request {
    @Query
    @NameInMap("ProductCode")
    private String productCode;

    private DescribePackageStateRequest(Builder builder) {
        super(builder);
        this.productCode = builder.productCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePackageStateRequest create() {
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

    public static final class Builder extends Request.Builder<DescribePackageStateRequest, Builder> {
        private String productCode; 

        private Builder() {
            super();
        } 

        private Builder(DescribePackageStateRequest response) {
            super(response);
            this.productCode = response.productCode;
        } 

        /**
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        @Override
        public DescribePackageStateRequest build() {
            return new DescribePackageStateRequest(this);
        } 

    } 

}
