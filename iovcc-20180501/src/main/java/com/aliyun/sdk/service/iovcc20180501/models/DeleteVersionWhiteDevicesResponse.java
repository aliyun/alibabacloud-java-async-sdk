// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVersionWhiteDevicesResponse} extends {@link TeaModel}
 *
 * <p>DeleteVersionWhiteDevicesResponse</p>
 */
public class DeleteVersionWhiteDevicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteVersionWhiteDevicesResponseBody body;

    private DeleteVersionWhiteDevicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteVersionWhiteDevicesResponse create() {
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
    public DeleteVersionWhiteDevicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteVersionWhiteDevicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteVersionWhiteDevicesResponseBody body);

        @Override
        DeleteVersionWhiteDevicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteVersionWhiteDevicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteVersionWhiteDevicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteVersionWhiteDevicesResponse response) {
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
        public Builder body(DeleteVersionWhiteDevicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteVersionWhiteDevicesResponse build() {
            return new DeleteVersionWhiteDevicesResponse(this);
        } 

    } 

}
