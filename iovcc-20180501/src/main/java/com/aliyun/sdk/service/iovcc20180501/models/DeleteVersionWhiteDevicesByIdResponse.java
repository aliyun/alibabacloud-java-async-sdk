// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVersionWhiteDevicesByIdResponse} extends {@link TeaModel}
 *
 * <p>DeleteVersionWhiteDevicesByIdResponse</p>
 */
public class DeleteVersionWhiteDevicesByIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteVersionWhiteDevicesByIdResponseBody body;

    private DeleteVersionWhiteDevicesByIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteVersionWhiteDevicesByIdResponse create() {
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
    public DeleteVersionWhiteDevicesByIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteVersionWhiteDevicesByIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteVersionWhiteDevicesByIdResponseBody body);

        @Override
        DeleteVersionWhiteDevicesByIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteVersionWhiteDevicesByIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteVersionWhiteDevicesByIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteVersionWhiteDevicesByIdResponse response) {
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
        public Builder body(DeleteVersionWhiteDevicesByIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteVersionWhiteDevicesByIdResponse build() {
            return new DeleteVersionWhiteDevicesByIdResponse(this);
        } 

    } 

}
