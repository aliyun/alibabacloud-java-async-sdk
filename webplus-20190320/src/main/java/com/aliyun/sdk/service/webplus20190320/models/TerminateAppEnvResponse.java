// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TerminateAppEnvResponse} extends {@link TeaModel}
 *
 * <p>TerminateAppEnvResponse</p>
 */
public class TerminateAppEnvResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TerminateAppEnvResponseBody body;

    private TerminateAppEnvResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TerminateAppEnvResponse create() {
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
    public TerminateAppEnvResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TerminateAppEnvResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TerminateAppEnvResponseBody body);

        @Override
        TerminateAppEnvResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TerminateAppEnvResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TerminateAppEnvResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TerminateAppEnvResponse response) {
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
        public Builder body(TerminateAppEnvResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TerminateAppEnvResponse build() {
            return new TerminateAppEnvResponse(this);
        } 

    } 

}
