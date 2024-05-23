// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateKMSDataKeyRequest} extends {@link RequestModel}
 *
 * <p>GenerateKMSDataKeyRequest</p>
 */
public class GenerateKMSDataKeyRequest extends Request {
    private GenerateKMSDataKeyRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateKMSDataKeyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GenerateKMSDataKeyRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GenerateKMSDataKeyRequest request) {
            super(request);
        } 

        @Override
        public GenerateKMSDataKeyRequest build() {
            return new GenerateKMSDataKeyRequest(this);
        } 

    } 

}
