// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVersionGroupDeviceResponse} extends {@link TeaModel}
 *
 * <p>DeleteVersionGroupDeviceResponse</p>
 */
public class DeleteVersionGroupDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteVersionGroupDeviceResponseBody body;

    private DeleteVersionGroupDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteVersionGroupDeviceResponse create() {
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
    public DeleteVersionGroupDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteVersionGroupDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteVersionGroupDeviceResponseBody body);

        @Override
        DeleteVersionGroupDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteVersionGroupDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteVersionGroupDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteVersionGroupDeviceResponse response) {
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
        public Builder body(DeleteVersionGroupDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteVersionGroupDeviceResponse build() {
            return new DeleteVersionGroupDeviceResponse(this);
        } 

    } 

}
