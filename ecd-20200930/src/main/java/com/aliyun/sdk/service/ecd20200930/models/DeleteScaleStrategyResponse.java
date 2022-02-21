// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteScaleStrategyResponse} extends {@link TeaModel}
 *
 * <p>DeleteScaleStrategyResponse</p>
 */
public class DeleteScaleStrategyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteScaleStrategyResponseBody body;

    private DeleteScaleStrategyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteScaleStrategyResponse create() {
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
    public DeleteScaleStrategyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteScaleStrategyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteScaleStrategyResponseBody body);

        @Override
        DeleteScaleStrategyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteScaleStrategyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteScaleStrategyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteScaleStrategyResponse response) {
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
        public Builder body(DeleteScaleStrategyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteScaleStrategyResponse build() {
            return new DeleteScaleStrategyResponse(this);
        } 

    } 

}
