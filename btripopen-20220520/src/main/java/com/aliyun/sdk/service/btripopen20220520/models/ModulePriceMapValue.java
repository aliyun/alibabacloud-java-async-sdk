// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link ModulePriceMapValue} extends {@link TeaModel}
 *
 * <p>ModulePriceMapValue</p>
 */
public class ModulePriceMapValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("price")
    private Long price;

    @com.aliyun.core.annotation.NameInMap("service_no")
    private String serviceNo;

    private ModulePriceMapValue(Builder builder) {
        this.price = builder.price;
        this.serviceNo = builder.serviceNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModulePriceMapValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return price
     */
    public Long getPrice() {
        return this.price;
    }

    /**
     * @return serviceNo
     */
    public String getServiceNo() {
        return this.serviceNo;
    }

    public static final class Builder {
        private Long price; 
        private String serviceNo; 

        private Builder() {
        } 

        private Builder(ModulePriceMapValue model) {
            this.price = model.price;
            this.serviceNo = model.serviceNo;
        } 

        /**
         * price.
         */
        public Builder price(Long price) {
            this.price = price;
            return this;
        }

        /**
         * service_no.
         */
        public Builder serviceNo(String serviceNo) {
            this.serviceNo = serviceNo;
            return this;
        }

        public ModulePriceMapValue build() {
            return new ModulePriceMapValue(this);
        } 

    } 

}
