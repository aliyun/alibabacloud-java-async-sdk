// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RebuildAppEnvResponse} extends {@link TeaModel}
 *
 * <p>RebuildAppEnvResponse</p>
 */
public class RebuildAppEnvResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RebuildAppEnvResponseBody body;

    private RebuildAppEnvResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RebuildAppEnvResponse create() {
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
    public RebuildAppEnvResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RebuildAppEnvResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RebuildAppEnvResponseBody body);

        @Override
        RebuildAppEnvResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RebuildAppEnvResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RebuildAppEnvResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RebuildAppEnvResponse response) {
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
        public Builder body(RebuildAppEnvResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RebuildAppEnvResponse build() {
            return new RebuildAppEnvResponse(this);
        } 

    } 

}
