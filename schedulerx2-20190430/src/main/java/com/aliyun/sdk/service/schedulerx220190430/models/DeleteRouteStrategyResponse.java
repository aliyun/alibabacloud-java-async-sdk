// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRouteStrategyResponse} extends {@link TeaModel}
 *
 * <p>DeleteRouteStrategyResponse</p>
 */
public class DeleteRouteStrategyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteRouteStrategyResponseBody body;

    private DeleteRouteStrategyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteRouteStrategyResponse create() {
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
    public DeleteRouteStrategyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteRouteStrategyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteRouteStrategyResponseBody body);

        @Override
        DeleteRouteStrategyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteRouteStrategyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteRouteStrategyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteRouteStrategyResponse response) {
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
        public Builder body(DeleteRouteStrategyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteRouteStrategyResponse build() {
            return new DeleteRouteStrategyResponse(this);
        } 

    } 

}
