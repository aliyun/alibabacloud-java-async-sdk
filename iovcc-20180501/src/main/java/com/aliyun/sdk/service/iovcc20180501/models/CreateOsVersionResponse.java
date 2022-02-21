// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOsVersionResponse} extends {@link TeaModel}
 *
 * <p>CreateOsVersionResponse</p>
 */
public class CreateOsVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateOsVersionResponseBody body;

    private CreateOsVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateOsVersionResponse create() {
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
    public CreateOsVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateOsVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateOsVersionResponseBody body);

        @Override
        CreateOsVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateOsVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateOsVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateOsVersionResponse response) {
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
        public Builder body(CreateOsVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateOsVersionResponse build() {
            return new CreateOsVersionResponse(this);
        } 

    } 

}
