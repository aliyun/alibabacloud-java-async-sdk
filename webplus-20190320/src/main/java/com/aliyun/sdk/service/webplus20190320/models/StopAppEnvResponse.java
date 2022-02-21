// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopAppEnvResponse} extends {@link TeaModel}
 *
 * <p>StopAppEnvResponse</p>
 */
public class StopAppEnvResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopAppEnvResponseBody body;

    private StopAppEnvResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopAppEnvResponse create() {
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
    public StopAppEnvResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopAppEnvResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopAppEnvResponseBody body);

        @Override
        StopAppEnvResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopAppEnvResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopAppEnvResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopAppEnvResponse response) {
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
        public Builder body(StopAppEnvResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopAppEnvResponse build() {
            return new StopAppEnvResponse(this);
        } 

    } 

}
