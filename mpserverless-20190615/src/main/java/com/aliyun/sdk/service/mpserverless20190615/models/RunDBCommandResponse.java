// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunDBCommandResponse} extends {@link TeaModel}
 *
 * <p>RunDBCommandResponse</p>
 */
public class RunDBCommandResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RunDBCommandResponseBody body;

    private RunDBCommandResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RunDBCommandResponse create() {
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
    public RunDBCommandResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RunDBCommandResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RunDBCommandResponseBody body);

        @Override
        RunDBCommandResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RunDBCommandResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RunDBCommandResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RunDBCommandResponse response) {
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
        public Builder body(RunDBCommandResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RunDBCommandResponse build() {
            return new RunDBCommandResponse(this);
        } 

    } 

}
