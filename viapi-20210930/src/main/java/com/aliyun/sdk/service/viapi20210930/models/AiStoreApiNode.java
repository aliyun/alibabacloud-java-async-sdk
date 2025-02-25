// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.viapi20210930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AiStoreApiNode} extends {@link TeaModel}
 *
 * <p>AiStoreApiNode</p>
 */
public class AiStoreApiNode extends TeaModel {
    @NameInMap("Apis")
    private java.util.List < AiStoreUserTask > apis;

    @NameInMap("Product")
    private String product;

    @NameInMap("ProductDesc")
    private String productDesc;

    private AiStoreApiNode(Builder builder) {
        this.apis = builder.apis;
        this.product = builder.product;
        this.productDesc = builder.productDesc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AiStoreApiNode create() {
        return builder().build();
    }

    /**
     * @return apis
     */
    public java.util.List < AiStoreUserTask > getApis() {
        return this.apis;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    /**
     * @return productDesc
     */
    public String getProductDesc() {
        return this.productDesc;
    }

    public static final class Builder {
        private java.util.List < AiStoreUserTask > apis; 
        private String product; 
        private String productDesc; 

        /**
         * Apis.
         */
        public Builder apis(java.util.List < AiStoreUserTask > apis) {
            this.apis = apis;
            return this;
        }

        /**
         * Product.
         */
        public Builder product(String product) {
            this.product = product;
            return this;
        }

        /**
         * ProductDesc.
         */
        public Builder productDesc(String productDesc) {
            this.productDesc = productDesc;
            return this;
        }

        public AiStoreApiNode build() {
            return new AiStoreApiNode(this);
        } 

    } 

}
