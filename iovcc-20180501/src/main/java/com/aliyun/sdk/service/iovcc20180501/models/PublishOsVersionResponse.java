// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishOsVersionResponse} extends {@link TeaModel}
 *
 * <p>PublishOsVersionResponse</p>
 */
public class PublishOsVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PublishOsVersionResponseBody body;

    private PublishOsVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PublishOsVersionResponse create() {
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
    public PublishOsVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PublishOsVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PublishOsVersionResponseBody body);

        @Override
        PublishOsVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PublishOsVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PublishOsVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PublishOsVersionResponse response) {
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
        public Builder body(PublishOsVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PublishOsVersionResponse build() {
            return new PublishOsVersionResponse(this);
        } 

    } 

}
