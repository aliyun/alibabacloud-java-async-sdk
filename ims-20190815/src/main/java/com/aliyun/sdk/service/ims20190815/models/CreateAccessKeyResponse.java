// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAccessKeyResponse} extends {@link TeaModel}
 *
 * <p>CreateAccessKeyResponse</p>
 */
public class CreateAccessKeyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateAccessKeyResponseBody body;

    private CreateAccessKeyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateAccessKeyResponse create() {
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
    public CreateAccessKeyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateAccessKeyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateAccessKeyResponseBody body);

        @Override
        CreateAccessKeyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateAccessKeyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateAccessKeyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateAccessKeyResponse response) {
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
        public Builder body(CreateAccessKeyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateAccessKeyResponse build() {
            return new CreateAccessKeyResponse(this);
        } 

    } 

}
