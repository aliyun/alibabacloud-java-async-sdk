// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReinitInstanceResponse} extends {@link TeaModel}
 *
 * <p>ReinitInstanceResponse</p>
 */
public class ReinitInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReinitInstanceResponseBody body;

    private ReinitInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReinitInstanceResponse create() {
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
    public ReinitInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReinitInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReinitInstanceResponseBody body);

        @Override
        ReinitInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReinitInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReinitInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReinitInstanceResponse response) {
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
        public Builder body(ReinitInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReinitInstanceResponse build() {
            return new ReinitInstanceResponse(this);
        } 

    } 

}
