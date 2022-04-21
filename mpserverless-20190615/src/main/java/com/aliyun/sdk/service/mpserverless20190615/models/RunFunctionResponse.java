// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunFunctionResponse} extends {@link TeaModel}
 *
 * <p>RunFunctionResponse</p>
 */
public class RunFunctionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RunFunctionResponseBody body;

    private RunFunctionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RunFunctionResponse create() {
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
    public RunFunctionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RunFunctionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RunFunctionResponseBody body);

        @Override
        RunFunctionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RunFunctionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RunFunctionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RunFunctionResponse response) {
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
        public Builder body(RunFunctionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RunFunctionResponse build() {
            return new RunFunctionResponse(this);
        } 

    } 

}
