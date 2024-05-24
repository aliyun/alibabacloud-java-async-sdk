// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20190102.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TranslateECommerceRequest} extends {@link RequestModel}
 *
 * <p>TranslateECommerceRequest</p>
 */
public class TranslateECommerceRequest extends Request {
    private TranslateECommerceRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TranslateECommerceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<TranslateECommerceRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(TranslateECommerceRequest request) {
            super(request);
        } 

        @Override
        public TranslateECommerceRequest build() {
            return new TranslateECommerceRequest(this);
        } 

    } 

}
