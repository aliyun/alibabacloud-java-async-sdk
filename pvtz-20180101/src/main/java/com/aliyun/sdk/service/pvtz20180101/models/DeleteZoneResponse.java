// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteZoneResponse} extends {@link TeaModel}
 *
 * <p>DeleteZoneResponse</p>
 */
public class DeleteZoneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteZoneResponseBody body;

    private DeleteZoneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteZoneResponse create() {
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
    public DeleteZoneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteZoneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteZoneResponseBody body);

        @Override
        DeleteZoneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteZoneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteZoneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteZoneResponse response) {
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
        public Builder body(DeleteZoneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteZoneResponse build() {
            return new DeleteZoneResponse(this);
        } 

    } 

}
