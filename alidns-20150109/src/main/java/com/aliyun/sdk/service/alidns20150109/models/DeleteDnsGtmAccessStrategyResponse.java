// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDnsGtmAccessStrategyResponse} extends {@link TeaModel}
 *
 * <p>DeleteDnsGtmAccessStrategyResponse</p>
 */
public class DeleteDnsGtmAccessStrategyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDnsGtmAccessStrategyResponseBody body;

    private DeleteDnsGtmAccessStrategyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDnsGtmAccessStrategyResponse create() {
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
    public DeleteDnsGtmAccessStrategyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDnsGtmAccessStrategyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDnsGtmAccessStrategyResponseBody body);

        @Override
        DeleteDnsGtmAccessStrategyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDnsGtmAccessStrategyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDnsGtmAccessStrategyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDnsGtmAccessStrategyResponse response) {
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
        public Builder body(DeleteDnsGtmAccessStrategyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDnsGtmAccessStrategyResponse build() {
            return new DeleteDnsGtmAccessStrategyResponse(this);
        } 

    } 

}
