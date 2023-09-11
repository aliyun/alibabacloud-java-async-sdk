// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClientKeyResponse} extends {@link TeaModel}
 *
 * <p>CreateClientKeyResponse</p>
 */
public class CreateClientKeyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateClientKeyResponseBody body;

    private CreateClientKeyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateClientKeyResponse create() {
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
    public CreateClientKeyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateClientKeyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateClientKeyResponseBody body);

        @Override
        CreateClientKeyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateClientKeyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateClientKeyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateClientKeyResponse response) {
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
        public Builder body(CreateClientKeyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateClientKeyResponse build() {
            return new CreateClientKeyResponse(this);
        } 

    } 

}
