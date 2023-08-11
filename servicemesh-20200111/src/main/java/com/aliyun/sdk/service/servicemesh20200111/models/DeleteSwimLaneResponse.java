// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSwimLaneResponse} extends {@link TeaModel}
 *
 * <p>DeleteSwimLaneResponse</p>
 */
public class DeleteSwimLaneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSwimLaneResponseBody body;

    private DeleteSwimLaneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSwimLaneResponse create() {
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
    public DeleteSwimLaneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSwimLaneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSwimLaneResponseBody body);

        @Override
        DeleteSwimLaneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSwimLaneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSwimLaneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSwimLaneResponse response) {
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
        public Builder body(DeleteSwimLaneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSwimLaneResponse build() {
            return new DeleteSwimLaneResponse(this);
        } 

    } 

}
