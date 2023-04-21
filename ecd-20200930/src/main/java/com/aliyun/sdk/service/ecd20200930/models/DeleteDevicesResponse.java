// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDevicesResponse} extends {@link TeaModel}
 *
 * <p>DeleteDevicesResponse</p>
 */
public class DeleteDevicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDevicesResponseBody body;

    private DeleteDevicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDevicesResponse create() {
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
    public DeleteDevicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDevicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDevicesResponseBody body);

        @Override
        DeleteDevicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDevicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDevicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDevicesResponse response) {
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
        public Builder body(DeleteDevicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDevicesResponse build() {
            return new DeleteDevicesResponse(this);
        } 

    } 

}
