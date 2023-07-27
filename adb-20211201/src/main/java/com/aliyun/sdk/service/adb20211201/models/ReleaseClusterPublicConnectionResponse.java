// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseClusterPublicConnectionResponse} extends {@link TeaModel}
 *
 * <p>ReleaseClusterPublicConnectionResponse</p>
 */
public class ReleaseClusterPublicConnectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReleaseClusterPublicConnectionResponseBody body;

    private ReleaseClusterPublicConnectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReleaseClusterPublicConnectionResponse create() {
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
    public ReleaseClusterPublicConnectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReleaseClusterPublicConnectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReleaseClusterPublicConnectionResponseBody body);

        @Override
        ReleaseClusterPublicConnectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReleaseClusterPublicConnectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReleaseClusterPublicConnectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReleaseClusterPublicConnectionResponse response) {
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
        public Builder body(ReleaseClusterPublicConnectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReleaseClusterPublicConnectionResponse build() {
            return new ReleaseClusterPublicConnectionResponse(this);
        } 

    } 

}
