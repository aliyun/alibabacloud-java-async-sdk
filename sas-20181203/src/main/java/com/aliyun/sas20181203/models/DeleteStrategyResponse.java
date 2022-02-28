// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteStrategyResponse} extends {@link TeaModel}
 *
 * <p>DeleteStrategyResponse</p>
 */
public class DeleteStrategyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteStrategyResponseBody body;

    private DeleteStrategyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteStrategyResponse create() {
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
    public DeleteStrategyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteStrategyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteStrategyResponseBody body);

        @Override
        DeleteStrategyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteStrategyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteStrategyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteStrategyResponse response) {
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
        public Builder body(DeleteStrategyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteStrategyResponse build() {
            return new DeleteStrategyResponse(this);
        } 

    } 

}
