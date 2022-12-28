// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20220822.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateAcccessTokenRequest} extends {@link RequestModel}
 *
 * <p>GenerateAcccessTokenRequest</p>
 */
public class GenerateAcccessTokenRequest extends Request {
    private GenerateAcccessTokenRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateAcccessTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GenerateAcccessTokenRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GenerateAcccessTokenRequest request) {
            super(request);
        } 

        @Override
        public GenerateAcccessTokenRequest build() {
            return new GenerateAcccessTokenRequest(this);
        } 

    } 

}
