// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DelayPublishOsVersionResponse} extends {@link TeaModel}
 *
 * <p>DelayPublishOsVersionResponse</p>
 */
public class DelayPublishOsVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DelayPublishOsVersionResponseBody body;

    private DelayPublishOsVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DelayPublishOsVersionResponse create() {
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
    public DelayPublishOsVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DelayPublishOsVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DelayPublishOsVersionResponseBody body);

        @Override
        DelayPublishOsVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DelayPublishOsVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DelayPublishOsVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DelayPublishOsVersionResponse response) {
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
        public Builder body(DelayPublishOsVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DelayPublishOsVersionResponse build() {
            return new DelayPublishOsVersionResponse(this);
        } 

    } 

}
