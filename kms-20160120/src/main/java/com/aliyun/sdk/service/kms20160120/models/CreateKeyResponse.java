// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateKeyResponse} extends {@link TeaModel}
 *
 * <p>CreateKeyResponse</p>
 */
public class CreateKeyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateKeyResponseBody body;

    private CreateKeyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateKeyResponse create() {
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
    public CreateKeyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateKeyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateKeyResponseBody body);

        @Override
        CreateKeyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateKeyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateKeyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateKeyResponse response) {
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
        public Builder body(CreateKeyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateKeyResponse build() {
            return new CreateKeyResponse(this);
        } 

    } 

}
