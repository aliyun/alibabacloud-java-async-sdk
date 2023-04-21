// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CompleteCdsFileResponse} extends {@link TeaModel}
 *
 * <p>CompleteCdsFileResponse</p>
 */
public class CompleteCdsFileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CompleteCdsFileResponseBody body;

    private CompleteCdsFileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CompleteCdsFileResponse create() {
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
    public CompleteCdsFileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CompleteCdsFileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CompleteCdsFileResponseBody body);

        @Override
        CompleteCdsFileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CompleteCdsFileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CompleteCdsFileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CompleteCdsFileResponse response) {
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
        public Builder body(CompleteCdsFileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CompleteCdsFileResponse build() {
            return new CompleteCdsFileResponse(this);
        } 

    } 

}
