// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMcdpZoneResponse} extends {@link TeaModel}
 *
 * <p>DeleteMcdpZoneResponse</p>
 */
public class DeleteMcdpZoneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteMcdpZoneResponseBody body;

    private DeleteMcdpZoneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteMcdpZoneResponse create() {
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
    public DeleteMcdpZoneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteMcdpZoneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteMcdpZoneResponseBody body);

        @Override
        DeleteMcdpZoneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteMcdpZoneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteMcdpZoneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteMcdpZoneResponse response) {
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
        public Builder body(DeleteMcdpZoneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteMcdpZoneResponse build() {
            return new DeleteMcdpZoneResponse(this);
        } 

    } 

}
