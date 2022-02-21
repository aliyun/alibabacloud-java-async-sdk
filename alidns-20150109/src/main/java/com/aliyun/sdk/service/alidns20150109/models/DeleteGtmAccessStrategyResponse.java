// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGtmAccessStrategyResponse} extends {@link TeaModel}
 *
 * <p>DeleteGtmAccessStrategyResponse</p>
 */
public class DeleteGtmAccessStrategyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteGtmAccessStrategyResponseBody body;

    private DeleteGtmAccessStrategyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteGtmAccessStrategyResponse create() {
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
    public DeleteGtmAccessStrategyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteGtmAccessStrategyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteGtmAccessStrategyResponseBody body);

        @Override
        DeleteGtmAccessStrategyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteGtmAccessStrategyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteGtmAccessStrategyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteGtmAccessStrategyResponse response) {
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
        public Builder body(DeleteGtmAccessStrategyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteGtmAccessStrategyResponse build() {
            return new DeleteGtmAccessStrategyResponse(this);
        } 

    } 

}
