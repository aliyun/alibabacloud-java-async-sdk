// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyHealthCheckConfigResponse} extends {@link TeaModel}
 *
 * <p>ModifyHealthCheckConfigResponse</p>
 */
public class ModifyHealthCheckConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyHealthCheckConfigResponseBody body;

    private ModifyHealthCheckConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyHealthCheckConfigResponse create() {
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
    public ModifyHealthCheckConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyHealthCheckConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyHealthCheckConfigResponseBody body);

        @Override
        ModifyHealthCheckConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyHealthCheckConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyHealthCheckConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyHealthCheckConfigResponse response) {
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
        public Builder body(ModifyHealthCheckConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyHealthCheckConfigResponse build() {
            return new ModifyHealthCheckConfigResponse(this);
        } 

    } 

}
