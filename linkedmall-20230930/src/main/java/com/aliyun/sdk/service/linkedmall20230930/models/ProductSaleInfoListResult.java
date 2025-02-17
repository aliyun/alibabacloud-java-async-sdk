// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

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
 * {@link ProductSaleInfoListResult} extends {@link TeaModel}
 *
 * <p>ProductSaleInfoListResult</p>
 */
public class ProductSaleInfoListResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("productSaleInfos")
    private java.util.List<ProductSaleInfo> productSaleInfos;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ProductSaleInfoListResult(Builder builder) {
        this.productSaleInfos = builder.productSaleInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProductSaleInfoListResult create() {
        return builder().build();
    }

    /**
     * @return productSaleInfos
     */
    public java.util.List<ProductSaleInfo> getProductSaleInfos() {
        return this.productSaleInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ProductSaleInfo> productSaleInfos; 
        private String requestId; 

        /**
         * productSaleInfos.
         */
        public Builder productSaleInfos(java.util.List<ProductSaleInfo> productSaleInfos) {
            this.productSaleInfos = productSaleInfos;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ProductSaleInfoListResult build() {
            return new ProductSaleInfoListResult(this);
        } 

    } 

}
