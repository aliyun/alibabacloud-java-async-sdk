// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSpecificConfigResponse} extends {@link TeaModel}
 *
 * <p>DeleteSpecificConfigResponse</p>
 */
public class DeleteSpecificConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSpecificConfigResponseBody body;

    private DeleteSpecificConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSpecificConfigResponse create() {
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
    public DeleteSpecificConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSpecificConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSpecificConfigResponseBody body);

        @Override
        DeleteSpecificConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSpecificConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSpecificConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSpecificConfigResponse response) {
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
        public Builder body(DeleteSpecificConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSpecificConfigResponse build() {
            return new DeleteSpecificConfigResponse(this);
        } 

    } 

}
