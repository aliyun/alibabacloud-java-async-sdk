// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ProductPrice} extends {@link TeaModel}
 *
 * <p>ProductPrice</p>
 */
public class ProductPrice extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("fundAmountMoney")
    private String fundAmountMoney;

    private ProductPrice(Builder builder) {
        this.fundAmountMoney = builder.fundAmountMoney;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProductPrice create() {
        return builder().build();
    }

    /**
     * @return fundAmountMoney
     */
    public String getFundAmountMoney() {
        return this.fundAmountMoney;
    }

    public static final class Builder {
        private String fundAmountMoney; 

        /**
         * fundAmountMoney.
         */
        public Builder fundAmountMoney(String fundAmountMoney) {
            this.fundAmountMoney = fundAmountMoney;
            return this;
        }

        public ProductPrice build() {
            return new ProductPrice(this);
        } 

    } 

}
