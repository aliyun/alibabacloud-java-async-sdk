// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEnsSaleControlResponse} extends {@link TeaModel}
 *
 * <p>DeleteEnsSaleControlResponse</p>
 */
public class DeleteEnsSaleControlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteEnsSaleControlResponseBody body;

    private DeleteEnsSaleControlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteEnsSaleControlResponse create() {
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
    public DeleteEnsSaleControlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteEnsSaleControlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteEnsSaleControlResponseBody body);

        @Override
        DeleteEnsSaleControlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteEnsSaleControlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteEnsSaleControlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteEnsSaleControlResponse response) {
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
        public Builder body(DeleteEnsSaleControlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteEnsSaleControlResponse build() {
            return new DeleteEnsSaleControlResponse(this);
        } 

    } 

}
