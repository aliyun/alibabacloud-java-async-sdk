// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDnsGtmAccessStrategyResponse} extends {@link TeaModel}
 *
 * <p>AddDnsGtmAccessStrategyResponse</p>
 */
public class AddDnsGtmAccessStrategyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddDnsGtmAccessStrategyResponseBody body;

    private AddDnsGtmAccessStrategyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddDnsGtmAccessStrategyResponse create() {
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
    public AddDnsGtmAccessStrategyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddDnsGtmAccessStrategyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddDnsGtmAccessStrategyResponseBody body);

        @Override
        AddDnsGtmAccessStrategyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddDnsGtmAccessStrategyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddDnsGtmAccessStrategyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddDnsGtmAccessStrategyResponse response) {
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
        public Builder body(AddDnsGtmAccessStrategyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddDnsGtmAccessStrategyResponse build() {
            return new AddDnsGtmAccessStrategyResponse(this);
        } 

    } 

}
