// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteShareTaskDeviceResponse} extends {@link TeaModel}
 *
 * <p>DeleteShareTaskDeviceResponse</p>
 */
public class DeleteShareTaskDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteShareTaskDeviceResponseBody body;

    private DeleteShareTaskDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteShareTaskDeviceResponse create() {
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
    public DeleteShareTaskDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteShareTaskDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteShareTaskDeviceResponseBody body);

        @Override
        DeleteShareTaskDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteShareTaskDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteShareTaskDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteShareTaskDeviceResponse response) {
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
        public Builder body(DeleteShareTaskDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteShareTaskDeviceResponse build() {
            return new DeleteShareTaskDeviceResponse(this);
        } 

    } 

}
