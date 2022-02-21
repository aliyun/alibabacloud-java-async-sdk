// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveUserAnalyzerResponse} extends {@link TeaModel}
 *
 * <p>RemoveUserAnalyzerResponse</p>
 */
public class RemoveUserAnalyzerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveUserAnalyzerResponseBody body;

    private RemoveUserAnalyzerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveUserAnalyzerResponse create() {
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
    public RemoveUserAnalyzerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveUserAnalyzerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveUserAnalyzerResponseBody body);

        @Override
        RemoveUserAnalyzerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveUserAnalyzerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveUserAnalyzerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveUserAnalyzerResponse response) {
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
        public Builder body(RemoveUserAnalyzerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveUserAnalyzerResponse build() {
            return new RemoveUserAnalyzerResponse(this);
        } 

    } 

}
