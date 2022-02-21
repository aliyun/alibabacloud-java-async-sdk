// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVersionGroupDeviceByIdResponse} extends {@link TeaModel}
 *
 * <p>DeleteVersionGroupDeviceByIdResponse</p>
 */
public class DeleteVersionGroupDeviceByIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteVersionGroupDeviceByIdResponseBody body;

    private DeleteVersionGroupDeviceByIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteVersionGroupDeviceByIdResponse create() {
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
    public DeleteVersionGroupDeviceByIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteVersionGroupDeviceByIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteVersionGroupDeviceByIdResponseBody body);

        @Override
        DeleteVersionGroupDeviceByIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteVersionGroupDeviceByIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteVersionGroupDeviceByIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteVersionGroupDeviceByIdResponse response) {
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
        public Builder body(DeleteVersionGroupDeviceByIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteVersionGroupDeviceByIdResponse build() {
            return new DeleteVersionGroupDeviceByIdResponse(this);
        } 

    } 

}
