// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEdgeDriverResponse} extends {@link TeaModel}
 *
 * <p>DeleteEdgeDriverResponse</p>
 */
public class DeleteEdgeDriverResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteEdgeDriverResponseBody body;

    private DeleteEdgeDriverResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteEdgeDriverResponse create() {
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
    public DeleteEdgeDriverResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteEdgeDriverResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteEdgeDriverResponseBody body);

        @Override
        DeleteEdgeDriverResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteEdgeDriverResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteEdgeDriverResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteEdgeDriverResponse response) {
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
        public Builder body(DeleteEdgeDriverResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteEdgeDriverResponse build() {
            return new DeleteEdgeDriverResponse(this);
        } 

    } 

}
