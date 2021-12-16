// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link RequestPaymentConfiguration} extends {@link TeaModel}
 *
 * <p>RequestPaymentConfiguration</p>
 */
public class RequestPaymentConfiguration extends TeaModel {
    @NameInMap("Payer")
    private String payer;


    private RequestPaymentConfiguration(Builder builder) {
        this.payer = builder.payer;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RequestPaymentConfiguration create() {
        return builder().build();
    }

    /**
     * @return payer
     */
    public String getPayer() {
        return this.payer;
    }

    public static final class Builder {
        private String payer; 

        /**
         * <p>description</p>
         */
        public Builder payer(String payer) {
            this.payer = payer;
            return this;
        }

        public RequestPaymentConfiguration build() {
            return new RequestPaymentConfiguration(this);
        } 

    } 

}
