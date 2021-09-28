// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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
    public String payer() {
        return this.payer;
    }

    public static final class Builder {
        private String payer; 

        /**
         * <p>Payer.</p>
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
