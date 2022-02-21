// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVersionAllWhiteDevicesResponse} extends {@link TeaModel}
 *
 * <p>DeleteVersionAllWhiteDevicesResponse</p>
 */
public class DeleteVersionAllWhiteDevicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteVersionAllWhiteDevicesResponseBody body;

    private DeleteVersionAllWhiteDevicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteVersionAllWhiteDevicesResponse create() {
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
    public DeleteVersionAllWhiteDevicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteVersionAllWhiteDevicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteVersionAllWhiteDevicesResponseBody body);

        @Override
        DeleteVersionAllWhiteDevicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteVersionAllWhiteDevicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteVersionAllWhiteDevicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteVersionAllWhiteDevicesResponse response) {
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
        public Builder body(DeleteVersionAllWhiteDevicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteVersionAllWhiteDevicesResponse build() {
            return new DeleteVersionAllWhiteDevicesResponse(this);
        } 

    } 

}
