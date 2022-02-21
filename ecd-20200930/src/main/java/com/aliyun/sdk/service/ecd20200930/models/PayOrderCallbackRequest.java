// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PayOrderCallbackRequest} extends {@link RequestModel}
 *
 * <p>PayOrderCallbackRequest</p>
 */
public class PayOrderCallbackRequest extends Request {
    @Query
    @NameInMap("data")
    @Validation(required = true)
    private String data;

    private PayOrderCallbackRequest(Builder builder) {
        super(builder);
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PayOrderCallbackRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    public static final class Builder extends Request.Builder<PayOrderCallbackRequest, Builder> {
        private String data; 

        private Builder() {
            super();
        } 

        private Builder(PayOrderCallbackRequest response) {
            super(response);
            this.data = response.data;
        } 

        /**
         * data.
         */
        public Builder data(String data) {
            this.putQueryParameter("data", data);
            this.data = data;
            return this;
        }

        @Override
        public PayOrderCallbackRequest build() {
            return new PayOrderCallbackRequest(this);
        } 

    } 

}
