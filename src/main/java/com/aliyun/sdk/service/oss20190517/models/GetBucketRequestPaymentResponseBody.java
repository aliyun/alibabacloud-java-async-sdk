// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link GetBucketRequestPaymentResponseBody} extends {@link TeaModel}
 *
 * <p>GetBucketRequestPaymentResponseBody</p>
 */
public class GetBucketRequestPaymentResponseBody extends TeaModel {
    @ParentIgnore("RequestPaymentConfiguration")
    @NameInMap("Payer")
    private String payer;

    private GetBucketRequestPaymentResponseBody(Builder builder) {
        this.payer = builder.payer;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBucketRequestPaymentResponseBody create() {
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
         * Payer.
         */
        public Builder payer(String payer) {
            this.payer = payer;
            return this;
        }

        public GetBucketRequestPaymentResponseBody build() {
            return new GetBucketRequestPaymentResponseBody(this);
        } 

    } 

}
