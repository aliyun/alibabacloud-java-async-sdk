// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSecretResponse} extends {@link TeaModel}
 *
 * <p>UpdateSecretResponse</p>
 */
public class UpdateSecretResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateSecretResponseBody body;

    private UpdateSecretResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateSecretResponse create() {
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
    public UpdateSecretResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateSecretResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateSecretResponseBody body);

        @Override
        UpdateSecretResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateSecretResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateSecretResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateSecretResponse response) {
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
        public Builder body(UpdateSecretResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateSecretResponse build() {
            return new UpdateSecretResponse(this);
        } 

    } 

}
