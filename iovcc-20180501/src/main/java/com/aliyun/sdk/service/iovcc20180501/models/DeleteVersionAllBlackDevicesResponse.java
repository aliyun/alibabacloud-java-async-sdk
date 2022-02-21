// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVersionAllBlackDevicesResponse} extends {@link TeaModel}
 *
 * <p>DeleteVersionAllBlackDevicesResponse</p>
 */
public class DeleteVersionAllBlackDevicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteVersionAllBlackDevicesResponseBody body;

    private DeleteVersionAllBlackDevicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteVersionAllBlackDevicesResponse create() {
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
    public DeleteVersionAllBlackDevicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteVersionAllBlackDevicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteVersionAllBlackDevicesResponseBody body);

        @Override
        DeleteVersionAllBlackDevicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteVersionAllBlackDevicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteVersionAllBlackDevicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteVersionAllBlackDevicesResponse response) {
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
        public Builder body(DeleteVersionAllBlackDevicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteVersionAllBlackDevicesResponse build() {
            return new DeleteVersionAllBlackDevicesResponse(this);
        } 

    } 

}
