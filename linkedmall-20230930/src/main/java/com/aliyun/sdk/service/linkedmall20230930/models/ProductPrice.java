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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fundAmountMoney
     */
    public String getFundAmountMoney() {
        return this.fundAmountMoney;
    }

    public static final class Builder {
        private String fundAmountMoney; 

        private Builder() {
        } 

        private Builder(ProductPrice model) {
            this.fundAmountMoney = model.fundAmountMoney;
        } 

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
