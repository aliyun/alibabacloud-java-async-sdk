// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenAlinlpServiceRequest} extends {@link RequestModel}
 *
 * <p>OpenAlinlpServiceRequest</p>
 */
public class OpenAlinlpServiceRequest extends Request {
    private OpenAlinlpServiceRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenAlinlpServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<OpenAlinlpServiceRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(OpenAlinlpServiceRequest request) {
            super(request);
        } 

        @Override
        public OpenAlinlpServiceRequest build() {
            return new OpenAlinlpServiceRequest(this);
        } 

    } 

}
