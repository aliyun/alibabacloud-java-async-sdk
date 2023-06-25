// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUserKeyResponse} extends {@link TeaModel}
 *
 * <p>CreateUserKeyResponse</p>
 */
public class CreateUserKeyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateUserKeyResponseBody body;

    private CreateUserKeyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateUserKeyResponse create() {
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
    public CreateUserKeyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateUserKeyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateUserKeyResponseBody body);

        @Override
        CreateUserKeyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateUserKeyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateUserKeyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateUserKeyResponse response) {
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
        public Builder body(CreateUserKeyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateUserKeyResponse build() {
            return new CreateUserKeyResponse(this);
        } 

    } 

}
