// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleasePublicConnectionResponse} extends {@link TeaModel}
 *
 * <p>ReleasePublicConnectionResponse</p>
 */
public class ReleasePublicConnectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReleasePublicConnectionResponseBody body;

    private ReleasePublicConnectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReleasePublicConnectionResponse create() {
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
    public ReleasePublicConnectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReleasePublicConnectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReleasePublicConnectionResponseBody body);

        @Override
        ReleasePublicConnectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReleasePublicConnectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReleasePublicConnectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReleasePublicConnectionResponse response) {
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
        public Builder body(ReleasePublicConnectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReleasePublicConnectionResponse build() {
            return new ReleasePublicConnectionResponse(this);
        } 

    } 

}
