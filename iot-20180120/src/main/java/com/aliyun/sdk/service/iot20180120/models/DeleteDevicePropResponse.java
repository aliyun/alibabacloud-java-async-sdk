// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDevicePropResponse} extends {@link TeaModel}
 *
 * <p>DeleteDevicePropResponse</p>
 */
public class DeleteDevicePropResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDevicePropResponseBody body;

    private DeleteDevicePropResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDevicePropResponse create() {
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
    public DeleteDevicePropResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDevicePropResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDevicePropResponseBody body);

        @Override
        DeleteDevicePropResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDevicePropResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDevicePropResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDevicePropResponse response) {
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
        public Builder body(DeleteDevicePropResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDevicePropResponse build() {
            return new DeleteDevicePropResponse(this);
        } 

    } 

}
