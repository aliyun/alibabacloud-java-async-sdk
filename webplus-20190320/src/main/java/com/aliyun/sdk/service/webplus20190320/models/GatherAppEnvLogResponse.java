// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GatherAppEnvLogResponse} extends {@link TeaModel}
 *
 * <p>GatherAppEnvLogResponse</p>
 */
public class GatherAppEnvLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GatherAppEnvLogResponseBody body;

    private GatherAppEnvLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GatherAppEnvLogResponse create() {
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
    public GatherAppEnvLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GatherAppEnvLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GatherAppEnvLogResponseBody body);

        @Override
        GatherAppEnvLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GatherAppEnvLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GatherAppEnvLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GatherAppEnvLogResponse response) {
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
        public Builder body(GatherAppEnvLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GatherAppEnvLogResponse build() {
            return new GatherAppEnvLogResponse(this);
        } 

    } 

}
