// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20190102.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TranslateGeneralRequest} extends {@link RequestModel}
 *
 * <p>TranslateGeneralRequest</p>
 */
public class TranslateGeneralRequest extends Request {
    private TranslateGeneralRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TranslateGeneralRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<TranslateGeneralRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(TranslateGeneralRequest request) {
            super(request);
        } 

        @Override
        public TranslateGeneralRequest build() {
            return new TranslateGeneralRequest(this);
        } 

    } 

}
