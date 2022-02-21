// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddGtmAccessStrategyResponse} extends {@link TeaModel}
 *
 * <p>AddGtmAccessStrategyResponse</p>
 */
public class AddGtmAccessStrategyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddGtmAccessStrategyResponseBody body;

    private AddGtmAccessStrategyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddGtmAccessStrategyResponse create() {
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
    public AddGtmAccessStrategyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddGtmAccessStrategyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddGtmAccessStrategyResponseBody body);

        @Override
        AddGtmAccessStrategyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddGtmAccessStrategyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddGtmAccessStrategyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddGtmAccessStrategyResponse response) {
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
        public Builder body(AddGtmAccessStrategyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddGtmAccessStrategyResponse build() {
            return new AddGtmAccessStrategyResponse(this);
        } 

    } 

}
