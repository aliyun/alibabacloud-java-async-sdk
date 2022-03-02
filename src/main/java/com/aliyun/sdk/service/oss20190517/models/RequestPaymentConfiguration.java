// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

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
         * description
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
