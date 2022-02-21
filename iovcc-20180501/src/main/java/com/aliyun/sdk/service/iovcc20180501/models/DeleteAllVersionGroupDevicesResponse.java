// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAllVersionGroupDevicesResponse} extends {@link TeaModel}
 *
 * <p>DeleteAllVersionGroupDevicesResponse</p>
 */
public class DeleteAllVersionGroupDevicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteAllVersionGroupDevicesResponseBody body;

    private DeleteAllVersionGroupDevicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteAllVersionGroupDevicesResponse create() {
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
    public DeleteAllVersionGroupDevicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteAllVersionGroupDevicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteAllVersionGroupDevicesResponseBody body);

        @Override
        DeleteAllVersionGroupDevicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAllVersionGroupDevicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteAllVersionGroupDevicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteAllVersionGroupDevicesResponse response) {
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
        public Builder body(DeleteAllVersionGroupDevicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteAllVersionGroupDevicesResponse build() {
            return new DeleteAllVersionGroupDevicesResponse(this);
        } 

    } 

}
