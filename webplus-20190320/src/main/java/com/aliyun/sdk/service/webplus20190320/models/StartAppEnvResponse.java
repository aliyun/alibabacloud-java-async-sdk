// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartAppEnvResponse} extends {@link TeaModel}
 *
 * <p>StartAppEnvResponse</p>
 */
public class StartAppEnvResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartAppEnvResponseBody body;

    private StartAppEnvResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartAppEnvResponse create() {
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
    public StartAppEnvResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartAppEnvResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartAppEnvResponseBody body);

        @Override
        StartAppEnvResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartAppEnvResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartAppEnvResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartAppEnvResponse response) {
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
        public Builder body(StartAppEnvResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartAppEnvResponse build() {
            return new StartAppEnvResponse(this);
        } 

    } 

}
