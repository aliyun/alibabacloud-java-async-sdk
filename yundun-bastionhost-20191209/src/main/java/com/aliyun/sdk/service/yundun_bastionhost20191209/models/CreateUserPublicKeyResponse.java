// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUserPublicKeyResponse} extends {@link TeaModel}
 *
 * <p>CreateUserPublicKeyResponse</p>
 */
public class CreateUserPublicKeyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateUserPublicKeyResponseBody body;

    private CreateUserPublicKeyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateUserPublicKeyResponse create() {
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
    public CreateUserPublicKeyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateUserPublicKeyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateUserPublicKeyResponseBody body);

        @Override
        CreateUserPublicKeyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateUserPublicKeyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateUserPublicKeyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateUserPublicKeyResponse response) {
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
        public Builder body(CreateUserPublicKeyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateUserPublicKeyResponse build() {
            return new CreateUserPublicKeyResponse(this);
        } 

    } 

}
