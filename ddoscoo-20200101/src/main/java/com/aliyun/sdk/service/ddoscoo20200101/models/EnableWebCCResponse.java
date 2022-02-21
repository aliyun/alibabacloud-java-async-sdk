// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableWebCCResponse} extends {@link TeaModel}
 *
 * <p>EnableWebCCResponse</p>
 */
public class EnableWebCCResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableWebCCResponseBody body;

    private EnableWebCCResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableWebCCResponse create() {
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
    public EnableWebCCResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableWebCCResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableWebCCResponseBody body);

        @Override
        EnableWebCCResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableWebCCResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableWebCCResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableWebCCResponse response) {
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
        public Builder body(EnableWebCCResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableWebCCResponse build() {
            return new EnableWebCCResponse(this);
        } 

    } 

}
