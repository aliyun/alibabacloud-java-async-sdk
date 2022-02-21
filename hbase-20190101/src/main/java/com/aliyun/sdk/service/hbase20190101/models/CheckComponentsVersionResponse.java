// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckComponentsVersionResponse} extends {@link TeaModel}
 *
 * <p>CheckComponentsVersionResponse</p>
 */
public class CheckComponentsVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckComponentsVersionResponseBody body;

    private CheckComponentsVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckComponentsVersionResponse create() {
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
    public CheckComponentsVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckComponentsVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckComponentsVersionResponseBody body);

        @Override
        CheckComponentsVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckComponentsVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckComponentsVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckComponentsVersionResponse response) {
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
        public Builder body(CheckComponentsVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckComponentsVersionResponse build() {
            return new CheckComponentsVersionResponse(this);
        } 

    } 

}
