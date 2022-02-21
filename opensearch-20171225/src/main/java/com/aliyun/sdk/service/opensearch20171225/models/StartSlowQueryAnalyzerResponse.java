// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartSlowQueryAnalyzerResponse} extends {@link TeaModel}
 *
 * <p>StartSlowQueryAnalyzerResponse</p>
 */
public class StartSlowQueryAnalyzerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartSlowQueryAnalyzerResponseBody body;

    private StartSlowQueryAnalyzerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartSlowQueryAnalyzerResponse create() {
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
    public StartSlowQueryAnalyzerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartSlowQueryAnalyzerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartSlowQueryAnalyzerResponseBody body);

        @Override
        StartSlowQueryAnalyzerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartSlowQueryAnalyzerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartSlowQueryAnalyzerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartSlowQueryAnalyzerResponse response) {
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
        public Builder body(StartSlowQueryAnalyzerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartSlowQueryAnalyzerResponse build() {
            return new StartSlowQueryAnalyzerResponse(this);
        } 

    } 

}
