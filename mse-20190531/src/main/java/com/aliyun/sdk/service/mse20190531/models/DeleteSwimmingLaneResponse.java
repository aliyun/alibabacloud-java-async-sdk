// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSwimmingLaneResponse} extends {@link TeaModel}
 *
 * <p>DeleteSwimmingLaneResponse</p>
 */
public class DeleteSwimmingLaneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSwimmingLaneResponseBody body;

    private DeleteSwimmingLaneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSwimmingLaneResponse create() {
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
    public DeleteSwimmingLaneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSwimmingLaneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSwimmingLaneResponseBody body);

        @Override
        DeleteSwimmingLaneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSwimmingLaneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSwimmingLaneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSwimmingLaneResponse response) {
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
        public Builder body(DeleteSwimmingLaneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSwimmingLaneResponse build() {
            return new DeleteSwimmingLaneResponse(this);
        } 

    } 

}
