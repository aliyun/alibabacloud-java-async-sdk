// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSecretRotationPolicyResponse} extends {@link TeaModel}
 *
 * <p>UpdateSecretRotationPolicyResponse</p>
 */
public class UpdateSecretRotationPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateSecretRotationPolicyResponseBody body;

    private UpdateSecretRotationPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateSecretRotationPolicyResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public UpdateSecretRotationPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateSecretRotationPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateSecretRotationPolicyResponseBody body);

        @Override
        UpdateSecretRotationPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateSecretRotationPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateSecretRotationPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateSecretRotationPolicyResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(UpdateSecretRotationPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateSecretRotationPolicyResponse build() {
            return new UpdateSecretRotationPolicyResponse(this);
        } 

    } 

}
