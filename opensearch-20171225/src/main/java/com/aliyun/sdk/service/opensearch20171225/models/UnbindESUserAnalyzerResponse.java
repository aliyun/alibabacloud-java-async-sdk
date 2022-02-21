// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindESUserAnalyzerResponse} extends {@link TeaModel}
 *
 * <p>UnbindESUserAnalyzerResponse</p>
 */
public class UnbindESUserAnalyzerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnbindESUserAnalyzerResponseBody body;

    private UnbindESUserAnalyzerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnbindESUserAnalyzerResponse create() {
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
    public UnbindESUserAnalyzerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnbindESUserAnalyzerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnbindESUserAnalyzerResponseBody body);

        @Override
        UnbindESUserAnalyzerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnbindESUserAnalyzerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnbindESUserAnalyzerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnbindESUserAnalyzerResponse response) {
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
        public Builder body(UnbindESUserAnalyzerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnbindESUserAnalyzerResponse build() {
            return new UnbindESUserAnalyzerResponse(this);
        } 

    } 

}
