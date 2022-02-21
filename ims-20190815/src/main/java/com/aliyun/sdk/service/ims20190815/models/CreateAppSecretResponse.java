// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppSecretResponse} extends {@link TeaModel}
 *
 * <p>CreateAppSecretResponse</p>
 */
public class CreateAppSecretResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateAppSecretResponseBody body;

    private CreateAppSecretResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateAppSecretResponse create() {
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
    public CreateAppSecretResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateAppSecretResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateAppSecretResponseBody body);

        @Override
        CreateAppSecretResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateAppSecretResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateAppSecretResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateAppSecretResponse response) {
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
        public Builder body(CreateAppSecretResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateAppSecretResponse build() {
            return new CreateAppSecretResponse(this);
        } 

    } 

}
