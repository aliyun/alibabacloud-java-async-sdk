// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiagnoseRequest} extends {@link RequestModel}
 *
 * <p>DescribeDiagnoseRequest</p>
 */
public class DescribeDiagnoseRequest extends Request {
    @Query
    @NameInMap("Product")
    private String product;

    private DescribeDiagnoseRequest(Builder builder) {
        super(builder);
        this.product = builder.product;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiagnoseRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDiagnoseRequest, Builder> {
        private String product; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDiagnoseRequest request) {
            super(request);
            this.product = request.product;
        } 

        /**
         * Product.
         */
        public Builder product(String product) {
            this.putQueryParameter("Product", product);
            this.product = product;
            return this;
        }

        @Override
        public DescribeDiagnoseRequest build() {
            return new DescribeDiagnoseRequest(this);
        } 

    } 

}
